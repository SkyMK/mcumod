/*
 * Decompiled with CFR 0.150.
 *
 * Could not load the following classes:
 *  co.uk.flansmods.vintarz.$.TiProebal
 *  cpw.mods.fml.common.network.PacketDispatcher
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  FMLClientHandler
 *  hcsmod.server.HcsServer
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package com.flansmod.common.guns;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.FlansModPlayerData;
import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;
import com.flansmod.mcu.BulletSpread;
import com.flansmod.mcu.Util;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.DayZ;
import mcu.MCU;
import mcu.client.ClientEventHandler;
import mcu.entity.ExtendedPlayer;
import mcu.utils.Utils;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ItemGun extends Item implements IFlanItem {
    public static boolean bipod;
    public static ArrayList<EntityBullet> bullets = new ArrayList<>();
    private static boolean mouseHeld;
    public GunType type;
    public int soundDelay;

    public ItemGun(GunType gunType) {
        this.maxStackSize = 1;
        this.type = gunType;
        this.type.item = this;
        this.setMaxDamage(1000);
        this.setCreativeTab(FlansMod.tabFlanGuns);
        GameRegistry.registerItem(this, this.type.shortName, "flansmod");
    }

    public static int getClientReloadTime(ItemStack itemStack) {
        if (!ItemGun.checkClientInfo(itemStack, "rtme")) {
            return 0;
        }
        return itemStack.stackTagCompound.getShort("rtme") & 0xFFFF;
    }

    public static float getClientSpread(ItemStack itemStack) {
        if (!ItemGun.checkClientInfo(itemStack, "sprd")) {
            return 0.0f;
        }
        float f = (float) itemStack.stackTagCompound.getShort("sprd") / 100.0f;
        if (bipod) {
            f = f * 0.35F;
        }
        return f;
    }

    public static short getClientDamage(ItemStack itemStack) {
        if (!ItemGun.checkClientInfo(itemStack, "gdmg")) {
            return 0;
        }
        return itemStack.stackTagCompound.getShort("gdmg");
    }

    public static float getClientBulletSpeed(ItemStack itemStack) {
        return 45;
    }

    public static float getClientKills(ItemStack itemStack) {
        if (!ItemGun.checkClientInfo(itemStack, "kills")) {
            return 0.0f;
        }
        return itemStack.stackTagCompound.getInteger("kills");
    }

    private static boolean checkClientInfo(ItemStack itemStack, String string) {
        return itemStack != null && itemStack.stackTagCompound != null && itemStack.stackTagCompound.hasKey(string);
    }

    public static void dropItem(World world, Entity entity, String string) {
        if (string != null) {
            int n = 0;
            if (string.contains(".")) {
                n = Integer.parseInt(string.split("\\.")[1]);
                string = string.split("\\.")[0];
            }
            ItemStack itemStack = InfoType.getRecipeElement(string, n);
            entity.entityDropItem(itemStack, 0.5f);
        }
    }

    @Override
    public boolean getShareTag() {
        return true;
    }

    public ItemStack getBulletItemStack(ItemStack gun, int id) {
        if (!gun.hasTagCompound()) {
            gun.stackTagCompound = new NBTTagCompound();
            return null;
        } else {
            NBTTagList ammoTagsList;
            if (gun.stackTagCompound.hasKey("ammo")) {
                ammoTagsList = gun.stackTagCompound.getTagList("ammo", 10);
                NBTTagCompound var5 = ammoTagsList.getCompoundTagAt(id);
                return ItemStack.loadItemStackFromNBT(var5);
            } else {
                ammoTagsList = new NBTTagList();

                for (int ammoTags = 0; ammoTags < this.type.numAmmoItemsInGun; ++ammoTags) {
                    ammoTagsList.appendTag(new NBTTagCompound());
                }

                gun.stackTagCompound.setTag("ammo", ammoTagsList);
                return null;
            }
        }
    }

    public void setBulletItemStack(ItemStack gun, ItemStack bullet, int id) {
        if (!gun.hasTagCompound()) {
            gun.stackTagCompound = new NBTTagCompound();
        }

        NBTTagList ammoTagsList;
        if (!gun.stackTagCompound.hasKey("ammo")) {
            ammoTagsList = new NBTTagList();

            for (int ammoTags = 0; ammoTags < this.type.numAmmoItemsInGun; ++ammoTags) {
                ammoTagsList.appendTag(new NBTTagCompound());
            }

            gun.stackTagCompound.setTag("ammo", ammoTagsList);
        }

        ammoTagsList = gun.stackTagCompound.getTagList("ammo", 10);
        NBTTagCompound var6 = ammoTagsList.getCompoundTagAt(id);
        if (bullet == null) {
            var6 = new NBTTagCompound();
        }

        bullet.writeToNBT(var6);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean bl) {
        Object object;
        if (itemStack.getItemDamage() + 1 >= itemStack.getMaxDamage()) {
            list.add("\u00a7c\u041e\u0440\u0443\u0436\u0438\u0435 \u0421\u041b\u041e\u041c\u0410\u041d\u041e");
            list.add(
                    "\u041c\u043e\u0436\u043d\u043e \u043f\u043e\u0447\u0438\u043d\u0438\u0442\u044c \u0432 \u043a\u0440\u0430\u0444\u0442\u0435");
            list.add(
                    "\u0436\u0435\u043b\u0435\u0437\u043e\u043c \u0438\u043b\u0438 \u0440\u0435\u043c\u043e\u043d\u0442\u043d\u044b\u043c \u043d\u0430\u0431\u043e\u0440\u043e\u043c");
        }
        for (int i = 0; i < this.type.numAmmoItemsInGun; ++i) {
            ItemStack itemStack2 = this.getBulletItemStack(itemStack, i);
            if (itemStack2 == null || !(itemStack2.getItem() instanceof ItemBullet))
                continue;
            BulletType infoType = ((ItemBullet) itemStack2.getItem()).type;
            object = "\u00a7e" + infoType.name + " " + (itemStack2.getMaxDamage() - itemStack2.getItemDamage()) + "/"
                    + itemStack2.getMaxDamage();
            list.add(object);
        }
        if (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
            int var7_12 = 0;
            list.add("\u00a7f\u0423\u0440\u043e\u043d " + ItemGun.getClientDamage(itemStack));
            DamageMultiplier[] arrdamageMultiplier = DamageMultiplier.VALUES;
            int n = arrdamageMultiplier.length;
            boolean bl2 = false;
            while (++var7_12 < n) {
                object = arrdamageMultiplier[var7_12];
                DamageMultiplier m = (DamageMultiplier) object;
                list.add(" \u0412 " + m.where + " x" + String.format("%.1f", Float.valueOf(m.value)).replace(',', '.')
                        + ": " + (int) ((float) ItemGun.getClientDamage(itemStack) * m.value));
            }
        } else if (ItemGun.getClientDamage(itemStack) != 0) {
            list.add(" \u0423\u0440\u043e\u043d " + ItemGun.getClientDamage(itemStack) + " [SHIFT]");
            DecimalFormat decimalFormat = new DecimalFormat();
            decimalFormat.setMaximumFractionDigits(1);
            list.add(
                    " \u0421\u043a\u043e\u0440\u043e\u0441\u0442\u0440\u0435\u043b\u044c\u043d\u043e\u0441\u0442\u044c "
                            + decimalFormat.format(20.0f / (float) this.getClientShootDelay(itemStack))
                            + " \u0432\u044b\u0441\u0442\u0440./\u0441");
            list.add(" \u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043f\u0443\u043b\u0438 "
                    + ItemGun.getClientBulletSpeed(itemStack) * 20.0f
                    + " \u0431\u043b\u043e\u043a\u043e\u0432./\u0441");
            list.add(" \u0420\u0430\u0437\u0431\u0440\u043e\u0441 " + ItemGun.getClientSpread(itemStack));
            list.add(" \u041e\u0442\u0434\u0430\u0447\u0430 " + this.getClientRecoil(itemStack));
            if (!this.type.getCurrentAttachments(itemStack).isEmpty()) {
                list.add("\u00a76\u041e\u0431\u0432\u0435\u0441\u044b:");
                for (AttachmentType attachmentType : (List<AttachmentType>) this.type
                        .getCurrentAttachments(itemStack)) {
                    object = attachmentType.name;
                    list.add(" " + object);
                }
            } else {
                list.add("\u00a76\u041e\u0431\u0432\u0435\u0441\u043e\u0432 \u043d\u0435\u0442");
            }
            if (MCU.autoBipod(itemStack)) {
                list.add("§cЭто оружие имеет биподы");
            }
            list.add("\u00a7c\u0423\u0431\u0438\u0442\u043e \u043b\u044e\u0434\u0435\u0439: "
                    + (int) ItemGun.getClientKills(itemStack));
        } else {
            list.add(
                    "\u0412\u043e\u0437\u044c\u043c\u0438\u0442\u0435 \u043e\u0440\u0443\u0436\u0438\u0435 \u0432 \u0440\u0443\u043a\u0438,");
            list.add(
                    "\u0447\u0442\u043e\u0431\u044b \u0443\u0432\u0438\u0434\u0435\u0442\u044c \u0445\u0430\u0440\u0430\u043a\u0442\u0435\u0440\u0438\u0441\u0442\u0438\u043a\u0438.");
        }
        if (itemStack.getItemDamage() + 1 < itemStack.getMaxDamage()) {
            list.add("\u00a7f\u041f\u0435\u0440\u0435\u0437\u0430\u0440\u044f\u0434\u0438\u0442\u044c: R");
            list.add("\u00a7f\u0420\u0430\u0437\u0440\u044f\u0434\u0438\u0442\u044c: ~(\u0401)");
            list.add("\u00a7f\u041e\u0431\u0432\u0435\u0441\u0438\u0442\u044c: U");
        }
    }

    @SideOnly(value = Side.CLIENT)
    public void onUpdateClient(ItemStack itemStack, World world, Entity entity, int n, boolean bl) {
        boolean bl2 = true;
        if (entity != Minecraft.getMinecraft().thePlayer
                || ((EntityPlayer) entity).inventory.getCurrentItem() != itemStack) {
            return;
        }
        if (bl2) {
            boolean bl4 = mouseHeld;
            mouseHeld = Minecraft.getMinecraft().gameSettings.keyBindAttack.getIsKeyPressed()
                    && Minecraft.getMinecraft().currentScreen == null;
            if (this.type.deployable) {
                mouseHeld = Mouse.isButtonDown(1);
                return;
            }
            if (mouseHeld && (this.type.mode == EnumFireMode.FULLAUTO || !bl4)) {
                long l = System.nanoTime();
                // PacketDispatcher
                // .sendPacketToServer((Packet) PacketGunFire.buildGunFirePacket(l,
                // FlansModClient.pingResponse));
                this.clientSideShoot((EntityPlayer) entity, itemStack, l);
            }
            GameSettings iego2 = FMLClientHandler.instance().getClient().gameSettings;
            IScope iScope = this.type.getCurrentScope(itemStack);
            if (Mouse.isButtonDown(1) && Minecraft.getMinecraft().currentScreen == null && FlansModClient.scopeTime <= 0
                    && FMLClientHandler.instance().getClient().currentScreen == null) {
                if (FlansModClient.currentScope == null) {
                    Util.isAimingClient = true;
                    FlansModClient.currentScope = iScope;
                    FlansModClient.lastZoomLevel = iScope.getZoomFactor();
                    FlansModClient.lastFOVZoomLevel = iScope.getFOVFactor();
                    float f = FlansModClient.originalMouseSensitivity = iego2.mouseSensitivity;
                    iego2.mouseSensitivity = f / (float) Math.sqrt(iScope.getZoomFactor());
                    FlansModClient.originalThirdPerson = iego2.thirdPersonView;
                    iego2.thirdPersonView = 0;
                    FlansModClient.originalFOV = iego2.fovSetting;
                } else {
                    Util.isAimingClient = false;
                    FlansModClient.currentScope = null;
                    iego2.mouseSensitivity = FlansModClient.originalMouseSensitivity;
                    iego2.thirdPersonView = FlansModClient.originalThirdPerson;
                    iego2.fovSetting = FlansModClient.originalFOV;
                }
                FlansModClient.scopeTime = 10;
            }
        }
        if (this.soundDelay > 0) {
            --this.soundDelay;
        }
    }

    private int getClientShootDelay(ItemStack itemStack) {
        if (!ItemGun.checkClientInfo(itemStack, "stme")) {
            return 0;
        }
        return itemStack.stackTagCompound.getByte("stme") & 0xFF;
    }

    public float getClientRecoil(ItemStack itemStack) {
        if (!ItemGun.checkClientInfo(itemStack, "recl")) {
            return 0.0f;
        }
        float f = (float) itemStack.stackTagCompound.getShort("recl") / 100.0f;
        if (bipod) {
            f = f * 0.35F;
        }
        return f;
    }

    public void onUpdateServer(ItemStack itemStack, World world, Entity entity, int n, boolean bl) {
        if (entity instanceof EntityPlayerMP) {
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP) entity;
            if (entityPlayerMP.inventory.getCurrentItem() != itemStack) {
                return;
            }
            this.updateTagInfo(itemStack, entityPlayerMP);
        }
    }

    private void updateTagInfo(ItemStack itemStack, EntityPlayerMP entityPlayerMP) {
        Object object;
        NBTTagCompound nBTTagCompound = itemStack.getTagCompound();
        if (nBTTagCompound == null) {
            nBTTagCompound = new NBTTagCompound();
            itemStack.setTagCompound(nBTTagCompound);
        }
        nBTTagCompound.setByte("stme", (byte) this.type.shootDelay);
        nBTTagCompound.setShort("rtme", (short) this.type.getReloadTime(itemStack));
        nBTTagCompound.setShort("recl", (short) (this.type.getRecoilPitch(itemStack) * 100.0f));
        nBTTagCompound.setShort("sprd", (short) (this.type.getSpread(itemStack) * 100.0f));
        float f = this.type.getDamage(itemStack, entityPlayerMP, entityPlayerMP);
        nBTTagCompound.setShort("gdmg", (short) (f < 50.0f ? f * 600.0f : f));
        Object object2 = null;
        for (int i = 0; i < this.type.numAmmoItemsInGun; ++i) {
            object = this.getBulletItemStack(itemStack, i);
            if (object == null || ((ItemStack) object).getItem() == null
                    || ((ItemStack) object).getItemDamage() >= ((ItemStack) object).getMaxDamage())
                continue;
            break;
        }
    }

    @Override
    public void onUpdate(ItemStack itemStack, World world, Entity entity, int n, boolean bl) {
        if (world.isRemote) {
            this.onUpdateClient(itemStack, world, entity, n, bl);
        } else {
            this.onUpdateServer(itemStack, world, entity, n, bl);
        }
    }

    public boolean reload(ItemStack gunStack, GunType gunType, World world, EntityPlayer player, boolean forceReload) {
        return this.reload(gunStack, gunType, world, player, player.inventory, player.capabilities.isCreativeMode,
                forceReload);
    }

    public boolean reload(ItemStack gunStack, GunType gunType, World world, Entity entity, IInventory inventory,
                          boolean creative, boolean forceReload) {
        if (gunType.deployable) {
            return false;
        } else if (forceReload && !gunType.canForceReload) {
            return false;
        } else {
            boolean reloadedSomething = false;

            for (int i = 0; i < gunType.numAmmoItemsInGun; ++i) {
                ItemStack bulletStack = this.getBulletItemStack(gunStack, i);
                if (bulletStack == null || bulletStack.getItemDamage() == bulletStack.getMaxDamage() || forceReload) {
                    int bestSlot = -1;
                    int bulletsInBestSlot = 0;

                    for (int newBulletStack = 0; newBulletStack < inventory.getSizeInventory(); ++newBulletStack) {
                        ItemStack newBulletType = inventory.getStackInSlot(newBulletStack);
                        if (newBulletType != null && newBulletType.getItem() instanceof ItemShootable
                                && gunType.isAmmo(((ItemShootable) newBulletType.getItem()).type)) {
                            int stackToLoad = newBulletType.getMaxDamage() - newBulletType.getItemDamage();
                            if (stackToLoad > bulletsInBestSlot) {
                                bestSlot = newBulletStack;
                                bulletsInBestSlot = stackToLoad;
                            }
                        }
                    }

                    if (bestSlot != -1) {
                        ItemStack var16 = inventory.getStackInSlot(bestSlot);
                        ShootableType var17 = ((ItemShootable) var16.getItem()).type;
                        if (bulletStack != null && bulletStack.getItem() instanceof ItemShootable
                                && ((ItemShootable) bulletStack.getItem()).type.dropItemOnReload != null && !creative
                                && bulletStack.getItemDamage() == bulletStack.getMaxDamage()) {
                            dropItem(world, entity, ((ItemShootable) bulletStack.getItem()).type.dropItemOnReload);
                        }

                        if (bulletStack != null && bulletStack.getItemDamage() < bulletStack.getMaxDamage()
                                && !InventoryHelper.addItemStackToInventory(inventory, bulletStack, creative)) {
                            entity.entityDropItem(bulletStack, 0.5F);
                        }

                        ItemStack var18 = var16.copy();
                        var18.stackSize = 1;
                        this.setBulletItemStack(gunStack, var18, i);
                        if (!creative) {
                            --var16.stackSize;
                        }

                        if (var16.stackSize <= 0) {
                            var16 = null;
                        }

                        inventory.setInventorySlotContents(bestSlot, var16);
                        reloadedSomething = true;
                    }
                }
            }

            return reloadedSomething;
        }
    }

    public void unload(ItemStack itemStack, EntityPlayer entityPlayer) {
        if (!this.type.deployable && this.type.canForceReload) {
            for (int i = 0; i < this.type.numAmmoItemsInGun; ++i) {
                ItemStack itemStack2 = this.getBulletItemStack(itemStack, i);
                if (itemStack2 == null || itemStack2.getItemDamage() >= itemStack2.getMaxDamage())
                    continue;
                if (!entityPlayer.capabilities.isCreativeMode
                        && !entityPlayer.inventory.addItemStackToInventory(itemStack2)) {
                    entityPlayer.entityDropItem(itemStack2, entityPlayer.getEyeHeight());
                }
                this.setBulletItemStack(itemStack, null, i);
            }
        }
    }

    @SideOnly(value = Side.CLIENT)
    public void clientSideShoot(EntityPlayer entityPlayer, ItemStack itemStack, long l) {
        if (FlansModClient.clientPlayerData.shootTime <= 0
                && itemStack.getItemDamage() + 1 < itemStack.getMaxDamage()) {
            ItemStack itemStack2 = null;
            for (int i = 0; i < this.type.numAmmoItemsInGun; ++i) {
                ItemStack itemStack3 = this.getBulletItemStack(itemStack, i);
                if (itemStack3 == null || itemStack3.getItem() == null
                        || itemStack3.getItemDamage() >= itemStack3.getMaxDamage())
                    continue;
                itemStack2 = itemStack3;
                break;
            }
            if (itemStack2 != null) {
                GunAnimations gunAnimations;
                FlansModPlayerData flansModPlayerData = FlansModClient.clientPlayerData;
                for (int i = flansModPlayerData.spreadTicks; i < 5; ++i) {
                    BulletSpread.tickWeaponSpread(entityPlayer, flansModPlayerData);
                }
                flansModPlayerData.isAiming = Util.isAimingClient;
                {
                    Util.areClientBulletsBeingUpdated = true;
                    int n = this.type.numBullets;
                    float f = ItemGun.getClientBulletSpeed(itemStack);
                    EntityBullet bullet;
                    bullet = new EntityBullet(entityPlayer, FlansModClient.clientPlayerData.bulletSpread,
                            getClientDamage(itemStack) / type.numBullets, this.type.numBullets, l);
                    ItemGun gun = (ItemGun) entityPlayer.getHeldItem().getItem();
                    ItemStack s = gun.getBulletItemStack(entityPlayer.getHeldItem(), 0);
                    ExtendedPlayer client = ExtendedPlayer.get(Minecraft.getMinecraft().thePlayer);
                    if (!Utils.inSafezone(Minecraft.getMinecraft().thePlayer) && client.getInvisible() == 0)
                        s.setItemDamage(s.getItemDamage() + 1);
                    AttachmentType itemShootable = gun.type.getBarrel(entityPlayer.getHeldItem());
                    boolean shootableType = itemShootable != null && itemShootable.silencer;
                    FMLClientHandler.instance().getClient().getSoundHandler()
                            .playSound(new PositionedSoundRecord(FlansModResourceHandler.getSound(type.shootSound),
                                    shootableType ? 5.0F : 10.0F,
                                    (type.distortSound ? 1.0F / (itemRand.nextFloat() * 0.4F + 0.8F) : 1.0F)
                                            * (shootableType ? 2.0F : 1.0F),
                                    (float) entityPlayer.posX, (float) entityPlayer.posY, (float) entityPlayer.posZ));
                    gun.setBulletItemStack(entityPlayer.getHeldItem(), s, 0);
                    if (!bullet.isDead)
                        bullets.add(bullet);
                    DayZ.network.sendToServer(
                            DayZ.network.createPacket(29, l, FlansModClient.clientPlayerData.bulletSpread));
                    ClientEventHandler.setFire(bullet);
                    Util.areClientBulletsBeingUpdated = false;
                }
                if (FlansModClient.gunAnimationsRight.containsKey(entityPlayer)) {
                    gunAnimations = (GunAnimations) FlansModClient.gunAnimationsRight.get(entityPlayer);
                } else {
                    gunAnimations = new GunAnimations();
                    FlansModClient.gunAnimationsRight.put(entityPlayer, gunAnimations);
                }
                int n = this.type.model == null ? 0 : this.type.model.pumpDelay;
                int n2 = this.type.model == null ? 1 : this.type.model.pumpTime;
                gunAnimations.doShoot(n, n2);
                float f = this.getClientRecoil(itemStack);
                float f3 = f * 0.1f;
                FlansModClient.recoilUp += f;
                FlansModClient.recoilSide += f3;
                EntityClientPlayerMP entityClientPlayerMP = Minecraft.getMinecraft().thePlayer;
                entityClientPlayerMP.rotationYaw += f3 * FlansModClient.recoilDirection;
                if (this.type.mode == EnumFireMode.SEMIAUTO) {
                    FlansModClient.recoilDirection = FlansModClient.recoilLeft ? -1.0f : 1.0f;
                    FlansModClient.recoilUp += f;
                    FlansModClient.recoilSide += f;
                    if (FlansModClient.recoilSwitch == 0) {
                        FlansModClient.recoilSwitch = itemRand.nextInt(30) + 10;
                    }
                } else {
                    if (FlansModClient.recoilSwitch == 0) {
                        FlansModClient.recoilSwitch = itemRand.nextInt(40) + 40;
                    }
                    f3 = Math.max(0.1f, f3);
                    entityClientPlayerMP.rotationPitch = itemRand.nextBoolean()
                            ? (entityClientPlayerMP.rotationPitch += f3)
                            : (entityClientPlayerMP.rotationPitch -= f3);
                }
                flansModPlayerData.weaponSpread = ItemGun.getClientSpread(itemStack) * 2.0f;
                FlansModClient.clientPlayerData.shootTime = this.getClientShootDelay(itemStack);
            }
        }
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        if (world.isRemote) {
            for (int i = 0; i < 3; ++i) {
                Minecraft.getMinecraft().entityRenderer.itemRenderer.updateEquippedItem();
            }
        }
        return itemStack;
    }

    private boolean isSolid(World world, int n, int n2, int n3) {
        Block n4 = world.getBlock(n, n2, n3);
        return n4 != Blocks.air && n4.getMaterial().isSolid() && n4.isOpaqueCube();
    }

    @Override
    public boolean isFull3D() {
        return true;
    }

    @Override
    public boolean onEntitySwing(EntityLivingBase entityLivingBase, ItemStack itemStack) {
        return this.type.meleeDamage != 0.0f;
    }

    @Override
    @SideOnly(value = Side.CLIENT)
    public int getColorFromItemStack(ItemStack itemStack, int n) {
        return this.type.colour;
    }

    public boolean isItemStackDamageable() {
        return true;
    }

    @Override
    @SideOnly(value = Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("FlansMod:" + this.type.iconPath);
    }

    @Override
    public int getMaxItemUseDuration(ItemStack itemStack) {
        return 100;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack itemStack) {
        return EnumAction.bow;
    }

    @Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int n, int n2, int n3, int n4,
                             float f, float f2, float f3) {
        return !this.type.deployable;
    }

    @Override
    public int getDamage(ItemStack itemStack) {
        return super.getDamage(itemStack);
    }

    @Override
    public boolean hitEntity(ItemStack itemStack, EntityLivingBase entityLivingBase,
                             EntityLivingBase entityLivingBase2) {
        return false;
    }

    @Override
    public boolean onItemUseFirst(ItemStack itemStack, EntityPlayer entityPlayer, World world, int n, int n2, int n3,
                                  int n4, float f, float f2, float f3) {
        return !this.type.deployable;
    }

    public boolean func_150897_b(Block p_150897_1_) {
        return false;
    }

    @SubscribeEvent
    public void onEventBlockBreak(BreakEvent event) {
        EntityPlayer player = event.getPlayer();
        if (player != null && player.getHeldItem() != null && player.getHeldItem().getItem() instanceof ItemGun) {
            event.setCanceled(true);
        }

    }

    @Override
    public boolean onBlockStartBreak(ItemStack itemStack, int n, int n2, int n3, EntityPlayer entityPlayer) {
        return true;
    }

    @Override
    public boolean onLeftClickEntity(ItemStack itemStack, EntityPlayer entityPlayer, Entity entity) {
        return true;
    }

    @Override
    public InfoType getInfoType() {
        return this.type;
    }
}
