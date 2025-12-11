package com.flansmod.common.driveables.mechas;

import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.client.gui.GuiDriveableController;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.FlansMod;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.*;
import com.flansmod.common.guns.*;
import com.flansmod.common.network.*;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.vector.Vector3i;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;
import net.minecraft.world.WorldSettings.GameType;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;

import java.util.ArrayList;
import java.util.Iterator;

public class EntityMecha extends EntityDriveable {

    public int toggleTimer;
    public RotatedAxes legAxes;
    public float prevLegsYaw;
    public MechaInventory inventory;
    public float legSwing;
    public int shootDelayLeft;
    public int shootDelayRight;
    public int soundDelayLeft;
    public int soundDelayRight;
    public Vector3i breakingBlock;
    public float breakingProgress;
    public GunAnimations leftAnimations;
    public GunAnimations rightAnimations;
    boolean couldNotFindFuel;
    private int ticksSinceUsed;
    private float moveX;
    private float moveZ;
    private int jumpDelay;
    private float rocketTimer;
    private int diamondTimer;

    public EntityMecha(World world) {
        super(world);
        this.toggleTimer = 0;
        this.moveX = 0.0F;
        this.moveZ = 0.0F;
        this.prevLegsYaw = 0.0F;
        this.jumpDelay = 0;
        this.legSwing = 0.0F;
        this.shootDelayLeft = 0;
        this.shootDelayRight = 0;
        this.soundDelayLeft = 0;
        this.soundDelayRight = 0;
        this.breakingBlock = null;
        this.breakingProgress = 0.0F;
        this.rocketTimer = 0.0F;
        this.diamondTimer = 0;
        this.leftAnimations = new GunAnimations();
        this.rightAnimations = new GunAnimations();
        this.setSize(2.0F, 3.0F);
        super.stepHeight = 3.0F;
        this.legAxes = new RotatedAxes();
        this.inventory = new MechaInventory(this);
    }

    public EntityMecha(World world, double x, double y, double z, MechaType type, DriveableData data,
                       NBTTagCompound tags) {
        super(world, type, data);
        this.toggleTimer = 0;
        this.moveX = 0.0F;
        this.moveZ = 0.0F;
        this.prevLegsYaw = 0.0F;
        this.jumpDelay = 0;
        this.legSwing = 0.0F;
        this.shootDelayLeft = 0;
        this.shootDelayRight = 0;
        this.soundDelayLeft = 0;
        this.soundDelayRight = 0;
        this.breakingBlock = null;
        this.breakingProgress = 0.0F;
        this.rocketTimer = 0.0F;
        this.diamondTimer = 0;
        this.leftAnimations = new GunAnimations();
        this.rightAnimations = new GunAnimations();
        this.legAxes = new RotatedAxes();
        this.setSize(2.0F, 3.0F);
        super.stepHeight = 3.0F;
        this.setPosition(x, y, z);
        this.initType(type, false);
        this.inventory = new MechaInventory(this, tags);
    }

    public EntityMecha(World world, double x, double y, double z, EntityPlayer placer, MechaType type,
                       DriveableData data, NBTTagCompound tags) {
        this(world, x, y, z, type, data, tags);
        this.rotateYaw(placer.rotationYaw + 90.0F);
        this.legAxes.rotateGlobalYaw(placer.rotationYaw + 90.0F);
        this.prevLegsYaw = this.legAxes.getYaw();
    }

    protected void initType(DriveableType type, boolean clientSide) {
        super.initType(type, clientSide);
        this.setSize(((MechaType) type).width, ((MechaType) type).height);
        super.stepHeight = (float) ((MechaType) type).stepHeight;
    }

    protected void writeEntityToNBT(NBTTagCompound tag) {
        super.writeEntityToNBT(tag);
        tag.setFloat("LegsYaw", this.legAxes.getYaw());
        tag.setTag("Inventory", this.inventory.writeToNBT(new NBTTagCompound()));
    }

    protected void readEntityFromNBT(NBTTagCompound tag) {
        super.readEntityFromNBT(tag);
        this.legAxes.setAngles(tag.getFloat("LegsYaw"), 0.0F, 0.0F);
        this.inventory.readFromNBT(tag.getCompoundTag("Inventory"));
    }

    public void writeSpawnData(ByteBuf data) {
        super.writeSpawnData(data);
        ByteBufUtils.writeTag(data, this.inventory.writeToNBT(new NBTTagCompound()));
    }

    public void readSpawnData(ByteBuf data) {
        super.readSpawnData(data);
        this.legAxes.rotateGlobalYaw(super.axes.getYaw());
        this.prevLegsYaw = this.legAxes.getYaw();
        this.inventory.readFromNBT(ByteBufUtils.readTag(data));
    }

    public void onMouseMoved(int deltaX, int deltaY) {
    }

    public boolean interactFirst(EntityPlayer entityplayer) {
        if (super.isDead) {
            return false;
        } else if (super.worldObj.isRemote) {
            return false;
        } else {
            ItemStack currentItem = entityplayer.getCurrentEquippedItem();
            if (currentItem != null && currentItem.getItem() instanceof ItemTool
                    && ((ItemTool) currentItem.getItem()).type.healDriveables) {
                return true;
            } else {
                MechaType type = this.getMechaType();

                for (int i = 0; i <= type.numPassengers; ++i) {
                    if (super.seats[i].interactFirst(entityplayer)) {
                        return true;
                    }
                }

                return false;
            }
        }
    }

    public MechaType getMechaType() {
        return MechaType.getMecha(super.driveableType);
    }

    public boolean pressKey(int key, EntityPlayer player) {
        MechaType type = this.getMechaType();
        DriveableData data = this.getDriveableData();
        if (super.worldObj.isRemote && (key == 6 || key == 8 || key == 9)) {
            FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
            return true;
        } else {
            switch (key) {
                case 0:
                    return true;
                case 1:
                    return true;
                case 2:
                    return true;
                case 3:
                    return true;
                case 4:
                    boolean canThrustCreatively = super.seats != null && super.seats[0] != null
                            && super.seats[0].riddenByEntity instanceof EntityPlayer
                            && ((EntityPlayer) super.seats[0].riddenByEntity).capabilities.isCreativeMode;
                    if (super.onGround && this.jumpDelay == 0
                            && (canThrustCreatively || data.fuelInTank > data.engine.fuelConsumption)
                            && this.isPartIntact(EnumDriveablePart.hips)) {
                        this.jumpDelay = 20;
                        super.motionY += type.jumpVelocity;
                        if (!canThrustCreatively) {
                            data.fuelInTank -= data.engine.fuelConsumption;
                        }
                    }

                    return true;
                case 5:
                    return true;
                case 6:
                    super.seats[0].riddenByEntity.mountEntity(null);
                    return true;
                case 7:
                    FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(4));
                    ((EntityPlayer) super.seats[0].riddenByEntity).openGui(FlansMod.INSTANCE, 10, super.worldObj,
                            super.chunkCoordX, super.chunkCoordY, super.chunkCoordZ);
                    return true;
                case 8:
                    return true;
                case 9:
                    return true;
                case 10:
                    return true;
                case 11:
                    return true;
                case 12:
                    return true;
                case 13:
                    return true;
                case 14:
                    return true;
                case 15:
                    return true;
                case 16:
                    return true;
                case 17:
                    return true;
                default:
                    return false;
            }
        }
    }

    private boolean useItem(boolean left) {
        if (left) {
            if (!this.isPartIntact(EnumDriveablePart.leftArm)) {
                return true;
            }
        } else if (!this.isPartIntact(EnumDriveablePart.rightArm)) {
            return true;
        }

        boolean creative = !(super.seats[0].riddenByEntity instanceof EntityPlayer)
                || ((EntityPlayer) super.seats[0].riddenByEntity).capabilities.isCreativeMode;
        ItemStack heldStack = left ? this.inventory.getStackInSlot(EnumMechaSlotType.leftTool)
                : this.inventory.getStackInSlot(EnumMechaSlotType.rightTool);
        if (heldStack == null) {
            return false;
        } else {
            Item heldItem = heldStack.getItem();
            MechaType mechaType = this.getMechaType();
            if (heldItem instanceof ItemMechaAddon) {
                MechaItemType gunItem = ((ItemMechaAddon) heldItem).type;
                float gunType = gunItem.reach * mechaType.reach;
                Vector3f delay = new Vector3f((float) mechaType.seats[0].x / 16.0F,
                        (double) ((float) mechaType.seats[0].y / 16.0F)
                                + super.seats[0].riddenByEntity.getMountedYOffset(),
                        (float) mechaType.seats[0].z / 16.0F);
                delay = super.axes.findLocalVectorGlobally(delay);
                Vector3f.add(delay, new Vector3f(super.posX, super.posY, super.posZ), delay);
                Vector3f bulletID = super.axes.findLocalVectorGlobally(
                        super.seats[0].looking.findLocalVectorGlobally(new Vector3f(gunType, 0.0F, 0.0F)));
                super.worldObj.spawnEntityInWorld(new EntityDebugVector(super.worldObj, delay, bulletID, 20));
                Vector3f bulletStack = Vector3f.add(bulletID, delay, null);
                MovingObjectPosition pumpDelay = super.worldObj.rayTraceBlocks(delay.toVec3(), bulletStack.toVec3());
                if (pumpDelay != null && pumpDelay.typeOfHit == MovingObjectType.BLOCK) {
                    if (this.breakingBlock == null || this.breakingBlock.x != pumpDelay.blockX
                            || this.breakingBlock.y != pumpDelay.blockY || this.breakingBlock.z != pumpDelay.blockZ) {
                        this.breakingProgress = 0.0F;
                    }

                    this.breakingBlock = new Vector3i(pumpDelay.blockX, pumpDelay.blockY, pumpDelay.blockZ);
                }
            } else if (heldItem instanceof ItemGun) {
                ItemGun var13 = (ItemGun) heldItem;
                GunType var14 = var13.type;
                int var15 = left ? this.shootDelayLeft : this.shootDelayRight;
                if (var15 <= 0) {
                    int var16 = 0;

                    ItemStack var17;
                    for (var17 = null; var16 < var14.numAmmoItemsInGun; ++var16) {
                        ItemStack var18 = var13.getBulletItemStack(heldStack, var16);
                        if (var18 != null && var18.getItem() != null && var18.getItemDamage() < var18.getMaxDamage()) {
                            var17 = var18;
                            break;
                        }
                    }

                    if (var17 == null) {
                        var13.reload(heldStack, var14, super.worldObj, this, super.driveableData,
                                this.infiniteAmmo() || creative, false);
                    } else if (var17.getItem() instanceof ItemBullet) {
                        this.shoot(heldStack, var14, var17, creative, left);
                        if (super.worldObj.isRemote) {
                            int var19 = var14.model == null ? 0 : var14.model.pumpDelay;
                            int pumpTime = var14.model == null ? 1 : var14.model.pumpTime;
                            if (left) {
                                this.leftAnimations.doShoot(var19, pumpTime);
                            } else {
                                this.rightAnimations.doShoot(var19, pumpTime);
                            }
                        }

                        var17.setItemDamage(var17.getItemDamage() + 1);
                        var13.setBulletItemStack(heldStack, var17, var16);
                    }
                }
            }

            return true;
        }
    }

    private void shoot(ItemStack stack, GunType gunType, ItemStack bulletStack, boolean creative, boolean left) {
        MechaType mechaType = this.getMechaType();
        BulletType bulletType = ((ItemBullet) bulletStack.getItem()).type;
        RotatedAxes a = new RotatedAxes();
        Vector3f armVector = new Vector3f(mechaType.armLength, 0.0F, 0.0F);
        Vector3f gunVector = new Vector3f(mechaType.armLength + 1.2F * mechaType.heldItemScale,
                0.5F * mechaType.heldItemScale, 0.0F);
        Vector3f armOrigin = left ? mechaType.leftArmOrigin : mechaType.rightArmOrigin;
        a.rotateGlobalYaw(super.axes.getYaw());
        armOrigin = a.findLocalVectorGlobally(armOrigin);
        a.rotateLocalPitch(-super.seats[0].looking.getPitch());
        gunVector = a.findLocalVectorGlobally(gunVector);
        armVector = a.findLocalVectorGlobally(armVector);
        Vector3f bulletOrigin = Vector3f.add(armOrigin, gunVector, null);
        bulletOrigin = Vector3f.add(new Vector3f(super.posX, super.posY, super.posZ), bulletOrigin, null);
        if (!super.worldObj.isRemote) {
            for (int k = 0; k < gunType.numBullets; ++k) {
               // super.worldObj.spawnEntityInWorld(((ItemBullet) bulletStack.getItem()).getEntity(super.worldObj, bulletOrigin, armVector, super.seats[0].riddenByEntity, gunType.getSpread(stack) / 2.0F, gunType.getDamage(stack, null, null), gunType.getBulletSpeed(stack), bulletStack.getItemDamage(), mechaType));
            }
        }

        if (left) {
            this.shootDelayLeft = gunType.mode == EnumFireMode.SEMIAUTO ? Math.max(gunType.shootDelay, 5)
                    : gunType.shootDelay;
        } else {
            this.shootDelayRight = gunType.mode == EnumFireMode.SEMIAUTO ? Math.max(gunType.shootDelay, 5)
                    : gunType.shootDelay;
        }

        if (bulletType.dropItemOnShoot != null && !creative) {
            ItemGun.dropItem(super.worldObj, this, bulletType.dropItemOnShoot);
        }

        if ((left ? this.soundDelayLeft : this.soundDelayRight) <= 0 && gunType.shootSound != null) {
            PacketPlaySound.sendSoundPacket(super.posX, super.posY, super.posZ, 50.0D, super.dimension,
                    gunType.shootSound, gunType.distortSound);
            if (left) {
                this.soundDelayLeft = gunType.shootSoundLength;
            } else {
                this.soundDelayRight = gunType.shootSoundLength;
            }
        }

    }

    protected void fall(float f) {
        this.attackEntityFrom(DamageSource.fall, f);
    }

    public boolean attackEntityFrom(DamageSource damagesource, float i) {
        if (!super.worldObj.isRemote && !super.isDead) {
            MechaType type = this.getMechaType();
            if (damagesource.getDamageType().equals("fall")) {
                boolean mechaStack = type.takeFallDamage && !this.stopFallDamage();
                boolean damageBlocksFromFalling = type.damageBlocksFromFalling || this.breakBlocksUponFalling();
                byte wouldBeNegativeDamage;
                if (i * type.fallDamageMultiplier * this.vulnerability() - 2.0F < 0.0F) {
                    wouldBeNegativeDamage = 0;
                } else {
                    wouldBeNegativeDamage = 1;
                }

                float damageToInflict = mechaStack
                        ? i * type.fallDamageMultiplier * this.vulnerability() * (float) wouldBeNegativeDamage
                        : 0.0F;
                float blockDamageFromFalling = damageBlocksFromFalling ? i * type.blockDamageFromFalling / 10.0F : 0.0F;
                ((DriveablePart) super.driveableData.parts.get(EnumDriveablePart.hips)).attack(damageToInflict, false);
                this.checkParts();
                FlansMod.getPacketHandler().sendToAllAround(new PacketDriveableDamage(this), super.posX, super.posY,
                        super.posZ, 200.0F, super.dimension);
                if (blockDamageFromFalling > 1.0F) {
                    super.worldObj.createExplosion(this, super.posX, super.posY, super.posZ, blockDamageFromFalling,
                            TeamsManager.explosions);
                }
            } else if (damagesource.damageType.equals("player") && damagesource.getEntity().onGround
                    && (super.seats[0] == null || super.seats[0].riddenByEntity == null)) {
                ItemStack mechaStack1 = new ItemStack(type.item, 1, 0);
                mechaStack1.stackTagCompound = new NBTTagCompound();
                super.driveableData.writeToNBT(mechaStack1.stackTagCompound);
                this.inventory.writeToNBT(mechaStack1.stackTagCompound);
                this.entityDropItem(mechaStack1, 0.5F);
                this.setDead();
            } else {
                ((DriveablePart) super.driveableData.parts.get(EnumDriveablePart.core)).attack(i * this.vulnerability(),
                        damagesource.isFireDamage());
            }

            return true;
        } else {
            return true;
        }
    }

    public void onUpdate() {
        super.onUpdate();
        if (this.jumpDelay > 0) {
            --this.jumpDelay;
        }

        if (this.shootDelayLeft > 0) {
            --this.shootDelayLeft;
        }

        if (this.shootDelayRight > 0) {
            --this.shootDelayRight;
        }

        if (this.soundDelayLeft > 0) {
            --this.soundDelayLeft;
        }

        if (this.soundDelayRight > 0) {
            --this.soundDelayRight;
        }

        if (!super.worldObj.isRemote && (super.seats[0] == null || super.seats[0].riddenByEntity == null)) {
            super.rightMouseHeld = super.leftMouseHeld = false;
        }

        this.leftAnimations.update();
        this.rightAnimations.update();
        MechaType type = this.getMechaType();
        DriveableData data = this.getDriveableData();
        if (type == null) {
            FlansMod.log("Mecha type null. Not ticking mecha");
        } else {
            this.prevLegsYaw = this.legAxes.getYaw();
            boolean driverIsCreative;
            if (this.toggleTimer == 0 && this.autoRepair()) {
                EnumDriveablePart[] thePlayerIsDrivingThis = EnumDriveablePart.values();
                int driverIsLiving = thePlayerIsDrivingThis.length;

                for (int jetPack = 0; jetPack < driverIsLiving; ++jetPack) {
                    EnumDriveablePart actualMotion = thePlayerIsDrivingThis[jetPack];
                    DriveablePart entity = (DriveablePart) data.parts.get(actualMotion);
                    driverIsCreative = super.seats != null && super.seats[0] != null
                            && super.seats[0].riddenByEntity instanceof EntityPlayer
                            && ((EntityPlayer) super.seats[0].riddenByEntity).capabilities.isCreativeMode;
                    if (entity != null && entity.health != 0 && entity.health < entity.maxHealth
                            && (driverIsCreative || data.fuelInTank >= 10.0F)) {
                        ++entity.health;
                        if (!driverIsCreative) {
                            data.fuelInTank -= 10.0F;
                        }
                    }
                }

                this.toggleTimer = 20;
            }

            int intent;
            float var31;
            float var32;
            int var36;
            if (this.diamondDetect() != null && this.diamondTimer == 0 && super.worldObj.isRemote
                    && super.seats[0] != null && super.seats[0].riddenByEntity instanceof EntityPlayer
                    && FlansMod.proxy.isThePlayer((EntityPlayer) super.seats[0].riddenByEntity)) {
                float var27 = 901.0F;

                for (float var29 = -30.0F; var29 <= 30.0F; ++var29) {
                    for (var31 = -30.0F; var31 <= 30.0F; ++var31) {
                        for (var32 = -30.0F; var32 <= 30.0F; ++var32) {
                            int var34 = MathHelper.floor_double((double) var29 + super.posX);
                            var36 = MathHelper.floor_double((double) var31 + super.posY);
                            intent = MathHelper.floor_double((double) var32 + super.posZ);
                            if (var29 * var29 + var31 * var31 + var32 * var32 < var27
                                    && super.worldObj.getBlock(var34, var36, intent) == Blocks.diamond_ore) {
                                var27 = var29 * var29 + var31 * var31 + var32 * var32;
                            }
                        }
                    }
                }

                if (var27 < 901.0F) {
                    PacketPlaySound.sendSoundPacket(super.posX, super.posY, super.posZ, 50.0D, super.dimension,
                            this.diamondDetect().detectSound, false);
                    this.diamondTimer = 1 + 2 * MathHelper.floor_float(MathHelper.sqrt_float(var27));
                }
            }

            if (this.diamondTimer > 0) {
                --this.diamondTimer;
            }

            if (this.isPartIntact(EnumDriveablePart.hips)) {
                this.setSize(type.width, type.height);
                super.yOffset = type.yOffset;
            } else {
                this.setSize(type.width, type.height - type.chassisHeight);
                super.yOffset = type.yOffset - type.chassisHeight;
            }

            boolean var28 = super.worldObj.isRemote && super.seats[0] != null
                    && super.seats[0].riddenByEntity instanceof EntityPlayer
                    && FlansMod.proxy.isThePlayer((EntityPlayer) super.seats[0].riddenByEntity);
            boolean var30 = super.seats[0] != null && super.seats[0].riddenByEntity instanceof EntityLivingBase;
            ++this.ticksSinceUsed;
            if (!super.worldObj.isRemote && super.seats[0].riddenByEntity != null) {
                this.ticksSinceUsed = 0;
            }

            if (!super.worldObj.isRemote && TeamsManager.mechaLove > 0
                    && this.ticksSinceUsed > TeamsManager.mechaLove * 20) {
                this.setDead();
            }

            if (this.toggleTimer > 0) {
                --this.toggleTimer;
            }

            double var35;
            if (super.worldObj.isRemote && !var28 && super.serverPositionTransitionTicker > 0) {
                double var33 = super.posX
                        + (super.field_70118_ct - super.posX) / (double) super.serverPositionTransitionTicker;
                var35 = super.posY
                        + (super.field_70117_cu - super.posY) / (double) super.serverPositionTransitionTicker;
                double var40 = super.posZ
                        + (super.field_70116_cv - super.posZ) / (double) super.serverPositionTransitionTicker;
                double metadata = MathHelper.wrapAngleTo180_double(super.serverYaw - (double) super.axes.getYaw());
                double leftStack = MathHelper.wrapAngleTo180_double(super.serverPitch - (double) super.axes.getPitch());
                double leftStackIsTool = MathHelper
                        .wrapAngleTo180_double(super.serverRoll - (double) super.axes.getRoll());
                super.rotationYaw = (float) ((double) super.axes.getYaw()
                        + metadata / (double) super.serverPositionTransitionTicker);
                super.rotationPitch = (float) ((double) super.axes.getPitch()
                        + leftStack / (double) super.serverPositionTransitionTicker);
                float breakingBlocks = (float) ((double) super.axes.getRoll()
                        + leftStackIsTool / (double) super.serverPositionTransitionTicker);
                --super.serverPositionTransitionTicker;
                this.setPosition(var33, var35, var40);
                this.setRotation(super.rotationYaw, super.rotationPitch, breakingBlocks);
            }

            if (super.seats[0] != null) {
                if (super.seats[0].riddenByEntity instanceof EntityLivingBase
                        && !(super.seats[0].riddenByEntity instanceof EntityPlayer)) {
                    super.axes.setAngles(((EntityLivingBase) super.seats[0].riddenByEntity).renderYawOffset + 90.0F,
                            0.0F, 0.0F);
                } else {
                    if (type.limitHeadTurn) {
                        var31 = this.legAxes.getYaw();
                        var32 = super.axes.getYaw();
                        var35 = var32 - var31;
                        if (var35 > 180.0D) {
                            var32 -= 360.0F;
                        }

                        if (var35 < -180.0D) {
                            var32 += 360.0F;
                        }

                        if (var31 + type.limitHeadTurnValue < var32) {
                            super.axes.setAngles(var31 + type.limitHeadTurnValue, 0.0F, 0.0F);
                        }

                        if (var31 - type.limitHeadTurnValue > var32) {
                            super.axes.setAngles(var31 - type.limitHeadTurnValue, 0.0F, 0.0F);
                        }
                    }

                    var31 = super.seats[0].looking.getYaw() - super.seats[0].prevLooking.getYaw();
                    super.axes.rotateGlobalYaw(var31);
                    super.seats[0].looking.rotateGlobalYaw(-var31);
                    super.seats[0].playerLooking.rotateGlobalYaw(-var31);
                }
            }

            this.moveX = 0.0F;
            this.moveZ = 0.0F;
            var31 = this.jetPackPower();
            if (!super.onGround && var28 && Minecraft.getMinecraft().currentScreen instanceof GuiDriveableController
                    && FlansMod.proxy.isKeyDown(4) && this.shouldFly()
                    && (((EntityPlayer) super.seats[0].riddenByEntity).capabilities.isCreativeMode
                    || data.fuelInTank >= 10.0F * var31)) {
                super.motionY *= 0.95D;
                super.motionY += 0.07D * (double) var31;
                super.fallDistance = 0.0F;
                if (!((EntityPlayer) super.seats[0].riddenByEntity).capabilities.isCreativeMode) {
                    data.fuelInTank -= 10.0F * var31;
                }

                if (this.rocketTimer <= 0.0F && this.rocketPack().soundEffect != null) {
                    PacketPlaySound.sendSoundPacket(super.posX, super.posY, super.posZ, 50.0D, super.dimension,
                            this.rocketPack().soundEffect, false);
                    this.rocketTimer = this.rocketPack().soundTime;
                }
            } else if (this.isInWater() && this.shouldFloat()) {
                super.motionY *= 0.89D;
                super.motionY += 0.1D;
            }

            if (this.rocketTimer != 0.0F) {
                --this.rocketTimer;
            }

            Vector3f var38 = new Vector3f(0.0D, super.motionY - 0.03999999910593033D, 0.0D);
            if (var30) {
                EntityLivingBase var37 = (EntityLivingBase) super.seats[0].riddenByEntity;
                driverIsCreative = var37 instanceof EntityPlayer && ((EntityPlayer) var37).capabilities.isCreativeMode;
                if (var28 && Minecraft.getMinecraft().currentScreen instanceof GuiDriveableController) {
                    if (FlansMod.proxy.isKeyDown(0)) {
                        this.moveX = 1.0F;
                    }

                    if (FlansMod.proxy.isKeyDown(1)) {
                        this.moveX = -1.0F;
                    }

                    if (FlansMod.proxy.isKeyDown(2)) {
                        this.moveZ = -1.0F;
                    }

                    if (FlansMod.proxy.isKeyDown(3)) {
                        this.moveZ = 1.0F;
                    }
                } else if (super.seats[0].riddenByEntity instanceof EntityLiving
                        && !(super.seats[0].riddenByEntity instanceof EntityPlayer)) {
                    this.moveZ = 1.0F;
                }

                Vector3f var41 = new Vector3f(this.moveX, 0.0F, this.moveZ);
                if ((double) Math.abs(var41.lengthSquared()) > 0.1D) {
                    var41.normalise();
                    ++this.legSwing;
                    var41 = super.axes.findLocalVectorGlobally(var41);
                    this.legAxes.findGlobalVectorLocally(var41);
                    float var43 = (float) Math.atan2(var41.z, var41.x) * 180.0F / 3.1415927F;
                    float material = var43 - this.legAxes.getYaw();
                    if (material > 180.0F) {
                        material -= 360.0F;
                    }

                    if (material < -180.0F) {
                        material += 360.0F;
                    }

                    float var45 = Math.signum(material);
                    material = Math.abs(material);
                    if ((double) material > 0.1D) {
                        this.legAxes.rotateGlobalYaw(Math.min(material, type.rotateSpeed) * var45);
                    }

                    var41.scale(type.moveSpeed * data.engine.engineSpeed * this.speedMultiplier() * 0.215F);
                    boolean rightStack = super.seats != null && super.seats[0] != null
                            && super.seats[0].riddenByEntity instanceof EntityPlayer
                            && ((EntityPlayer) super.seats[0].riddenByEntity).capabilities.isCreativeMode;
                    if ((rightStack || data.fuelInTank > data.engine.fuelConsumption)
                            && this.isPartIntact(EnumDriveablePart.hips)) {
                        if (!super.onGround && this.shouldFly()
                                && (rightStack || data.fuelInTank > 10.0F * var31 + data.engine.fuelConsumption)) {
                            var41.scale(var31);
                            if (!rightStack) {
                                data.fuelInTank -= 10.0F * var31;
                            }
                        }

                        Vector3f.add(var38, var41, var38);
                        if (!rightStack) {
                            data.fuelInTank -= data.engine.fuelConsumption;
                        }
                    }
                }

                if (!super.worldObj.isRemote) {
                    if (super.leftMouseHeld) {
                        this.useItem(true);
                    }

                    if (super.rightMouseHeld) {
                        this.useItem(false);
                    }

                    if (this.breakingBlock != null) {
                        Block seat = super.worldObj.getBlock(this.breakingBlock.x, this.breakingBlock.y,
                                this.breakingBlock.z);
                        int var44 = super.worldObj.getBlockMetadata(this.breakingBlock.x, this.breakingBlock.y,
                                this.breakingBlock.z);
                        Material var47 = seat.getMaterial();
                        ItemStack var46 = this.inventory.getStackInSlot(EnumMechaSlotType.leftTool);
                        ItemStack var48 = this.inventory.getStackInSlot(EnumMechaSlotType.rightTool);
                        boolean var49 = var46 != null && var46.getItem() instanceof ItemMechaAddon;
                        boolean rightStackIsTool = var48 != null && var48.getItem() instanceof ItemMechaAddon;
                        boolean var50 = super.leftMouseHeld && var49 || super.rightMouseHeld && rightStackIsTool;
                        if (seat != null && var50) {
                            float blockHardness = seat.getBlockHardness(super.worldObj, this.breakingBlock.x,
                                    this.breakingBlock.y, this.breakingBlock.z);
                            float mineSpeed = 1.0F;
                            boolean atLeastOneEffectiveTool = false;
                            MechaItemType cancelled;
                            if (var49) {
                                cancelled = ((ItemMechaAddon) var46.getItem()).type;
                                if (cancelled.function.effectiveAgainst(var47)
                                        && cancelled.toolHardness > blockHardness) {
                                    mineSpeed *= cancelled.speed;
                                    atLeastOneEffectiveTool = true;
                                }
                            }

                            if (rightStackIsTool) {
                                cancelled = ((ItemMechaAddon) var48.getItem()).type;
                                if (cancelled.function.effectiveAgainst(var47)
                                        && cancelled.toolHardness > blockHardness) {
                                    mineSpeed *= cancelled.speed;
                                    atLeastOneEffectiveTool = true;
                                }
                            }

                            if (blockHardness < -0.01F) {
                                mineSpeed = 0.0F;
                            } else if (Math.abs(blockHardness) < 0.01F) {
                                mineSpeed = 9001.0F;
                            } else {
                                mineSpeed /= seat.getBlockHardness(super.worldObj, this.breakingBlock.x,
                                        this.breakingBlock.y, this.breakingBlock.z);
                            }

                            this.breakingProgress += 0.1F * mineSpeed;
                            if (this.breakingProgress >= 1.0F) {
                                boolean var51 = false;
                                if (var37 instanceof EntityPlayerMP) {
                                    BreakEvent vacuumItems = ForgeHooks.onBlockBreakEvent(super.worldObj,
                                            ((EntityPlayerMP) var37).capabilities.isCreativeMode ? GameType.CREATIVE
                                                    : (((EntityPlayerMP) var37).capabilities.allowEdit
                                                    ? GameType.SURVIVAL
                                                    : GameType.ADVENTURE),
                                            (EntityPlayerMP) super.seats[0].riddenByEntity, this.breakingBlock.x,
                                            this.breakingBlock.y, this.breakingBlock.z);
                                    var51 = vacuumItems.isCanceled();
                                }

                                if (!var51) {
                                    boolean var52 = this.vacuumItems();
                                    if (var52) {
                                        Iterator var23 = seat.getDrops(super.worldObj, this.breakingBlock.x,
                                                this.breakingBlock.y, this.breakingBlock.z, var44, 0).iterator();

                                        while (var23.hasNext()) {
                                            ItemStack stack = (ItemStack) var23.next();
                                            boolean fuelCheck = data.fuelInTank >= 5.0F
                                                    || ((EntityPlayer) super.seats[0].riddenByEntity).capabilities.isCreativeMode;
                                            if (fuelCheck && this.refineIron() && stack.getItem() instanceof ItemBlock
                                                    && ((ItemBlock) stack
                                                    .getItem()).field_150939_a == Blocks.iron_ore) {
                                                stack = new ItemStack(Items.iron_ingot, 1, 0);
                                                if (!((EntityPlayer) super.seats[0].riddenByEntity).capabilities.isCreativeMode) {
                                                    data.fuelInTank -= 5.0F;
                                                }
                                            }

                                            fuelCheck = data.fuelInTank >= 0.1F
                                                    || ((EntityPlayer) super.seats[0].riddenByEntity).capabilities.isCreativeMode;
                                            if (fuelCheck && this.wasteCompact().booleanValue()
                                                    && stack.getItem() instanceof ItemBlock
                                                    && (((ItemBlock) stack
                                                    .getItem()).field_150939_a == Blocks.cobblestone
                                                    || ((ItemBlock) stack
                                                    .getItem()).field_150939_a == Blocks.dirt
                                                    || ((ItemBlock) stack
                                                    .getItem()).field_150939_a == Blocks.sand)) {
                                                stack.stackSize = 0;
                                                if (!((EntityPlayer) super.seats[0].riddenByEntity).capabilities.isCreativeMode) {
                                                    data.fuelInTank -= 0.1F;
                                                }
                                            }

                                            fuelCheck = data.fuelInTank >= 3.0F * this.diamondMultiplier()
                                                    || ((EntityPlayer) super.seats[0].riddenByEntity).capabilities.isCreativeMode;
                                            float multiplier;
                                            if (fuelCheck && stack.getItem() == Items.diamond) {
                                                multiplier = this.diamondMultiplier();
                                                stack.stackSize *= MathHelper.floor_float(multiplier)
                                                        + (super.rand.nextFloat() < this.tailFloat(multiplier) ? 1 : 0);
                                                if (!((EntityPlayer) super.seats[0].riddenByEntity).capabilities.isCreativeMode) {
                                                    data.fuelInTank -= 3.0F * this.diamondMultiplier();
                                                }
                                            }

                                            fuelCheck = data.fuelInTank >= 2.0F * this.redstoneMultiplier()
                                                    || ((EntityPlayer) super.seats[0].riddenByEntity).capabilities.isCreativeMode;
                                            if (fuelCheck && stack.getItem() == Items.redstone) {
                                                multiplier = this.redstoneMultiplier();
                                                stack.stackSize *= MathHelper.floor_float(multiplier)
                                                        + (super.rand.nextFloat() < this.tailFloat(multiplier) ? 1 : 0);
                                                if (!((EntityPlayer) super.seats[0].riddenByEntity).capabilities.isCreativeMode) {
                                                    data.fuelInTank -= 2.0F * this.redstoneMultiplier();
                                                }
                                            }

                                            fuelCheck = data.fuelInTank >= 2.0F * this.coalMultiplier()
                                                    || ((EntityPlayer) super.seats[0].riddenByEntity).capabilities.isCreativeMode;
                                            if (fuelCheck && stack.getItem() == Items.coal) {
                                                multiplier = this.coalMultiplier();
                                                stack.stackSize *= MathHelper.floor_float(multiplier)
                                                        + (super.rand.nextFloat() < this.tailFloat(multiplier) ? 1 : 0);
                                                if (!((EntityPlayer) super.seats[0].riddenByEntity).capabilities.isCreativeMode) {
                                                    data.fuelInTank -= 2.0F * this.coalMultiplier();
                                                }
                                            }

                                            fuelCheck = data.fuelInTank >= 2.0F * this.emeraldMultiplier()
                                                    || ((EntityPlayer) super.seats[0].riddenByEntity).capabilities.isCreativeMode;
                                            if (fuelCheck && stack.getItem() == Items.emerald) {
                                                multiplier = this.emeraldMultiplier();
                                                stack.stackSize *= MathHelper.floor_float(multiplier)
                                                        + (super.rand.nextFloat() < this.tailFloat(multiplier) ? 1 : 0);
                                                if (!((EntityPlayer) super.seats[0].riddenByEntity).capabilities.isCreativeMode) {
                                                    data.fuelInTank -= 2.0F * this.emeraldMultiplier();
                                                }
                                            }

                                            fuelCheck = data.fuelInTank >= 2.0F * this.ironMultiplier()
                                                    || ((EntityPlayer) super.seats[0].riddenByEntity).capabilities.isCreativeMode;
                                            if (fuelCheck && stack.getItem() == Items.iron_ingot && this.refineIron()) {
                                                multiplier = this.ironMultiplier();
                                                stack.stackSize *= MathHelper.floor_float(multiplier)
                                                        + (super.rand.nextFloat() < this.tailFloat(multiplier) ? 1 : 0);
                                                if (!((EntityPlayer) super.seats[0].riddenByEntity).capabilities.isCreativeMode) {
                                                    data.fuelInTank -= 2.0F * this.ironMultiplier();
                                                }
                                            }

                                            if (this.autoCoal() && stack.getItem() == Items.coal
                                                    && data.fuelInTank + 250.0F < (float) type.fuelTankSize) {
                                                data.fuelInTank = Math.min(data.fuelInTank + 1000.0F,
                                                        (float) type.fuelTankSize);
                                                this.couldNotFindFuel = false;
                                                stack.stackSize = 0;
                                            }

                                            if (!InventoryHelper.addItemStackToInventory(super.driveableData, stack,
                                                    driverIsCreative) && !super.worldObj.isRemote
                                                    && super.worldObj.getGameRules()
                                                    .getGameRuleBooleanValue("doTileDrops")) {
                                                super.worldObj.spawnEntityInWorld(new EntityItem(super.worldObj,
                                                        (float) this.breakingBlock.x + 0.5F,
                                                        (float) this.breakingBlock.y + 0.5F,
                                                        (float) this.breakingBlock.z + 0.5F, stack));
                                            }
                                        }
                                    }

                                    super.worldObj.func_147480_a(this.breakingBlock.x, this.breakingBlock.y,
                                            this.breakingBlock.z, atLeastOneEffectiveTool && !var52);
                                }
                            }
                        } else {
                            this.breakingBlock = null;
                        }
                    }
                }
            }

            super.motionY = var38.y;
            this.moveEntity(var38.x, var38.y, var38.z);
            this.setPosition(super.posX, super.posY, super.posZ);
            if (var28) {
                FlansMod.getPacketHandler().sendToServer(new PacketMechaControl(this));
                super.field_70118_ct = super.posX;
                super.field_70117_cu = super.posY;
                super.field_70116_cv = super.posZ;
                super.serverYaw = super.axes.getYaw();
            }

            if (!super.worldObj.isRemote && super.ticksExisted % 5 == 0) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketMechaControl(this), super.posX, super.posY,
                        super.posZ, 200.0F, super.dimension);
            }

            EntitySeat[] var39 = super.seats;
            var36 = var39.length;

            for (intent = 0; intent < var36; ++intent) {
                EntitySeat var42 = var39[intent];
                if (var42 != null) {
                    var42.updatePosition();
                }
            }

            if (!var30 || var28) {
                this.legSwing /= type.legSwingLimit;
            }

        }
    }

    private float tailFloat(float f) {
        return f - (float) MathHelper.floor_float(f);
    }

    public boolean stopFallDamage() {
        Iterator var1 = this.getUpgradeTypes().iterator();

        MechaItemType type;
        do {
            if (!var1.hasNext()) {
                return false;
            }

            type = (MechaItemType) var1.next();
        } while (!type.stopMechaFallDamage);

        return true;
    }

    public boolean breakBlocksUponFalling() {
        Iterator var1 = this.getUpgradeTypes().iterator();

        MechaItemType type;
        do {
            if (!var1.hasNext()) {
                return false;
            }

            type = (MechaItemType) var1.next();
        } while (!type.forceBlockFallDamage);

        return true;
    }

    public boolean vacuumItems() {
        Iterator var1 = this.getUpgradeTypes().iterator();

        MechaItemType type;
        do {
            if (!var1.hasNext()) {
                return false;
            }

            type = (MechaItemType) var1.next();
        } while (!type.vacuumItems);

        return true;
    }

    public boolean refineIron() {
        Iterator var1 = this.getUpgradeTypes().iterator();

        MechaItemType type;
        do {
            if (!var1.hasNext()) {
                return false;
            }

            type = (MechaItemType) var1.next();
        } while (!type.refineIron);

        return true;
    }

    public MechaItemType diamondDetect() {
        Iterator var1 = this.getUpgradeTypes().iterator();

        MechaItemType type;
        do {
            if (!var1.hasNext()) {
                return null;
            }

            type = (MechaItemType) var1.next();
        } while (!type.diamondDetect);

        return type;
    }

    public Boolean wasteCompact() {
        Iterator var1 = this.getUpgradeTypes().iterator();

        MechaItemType type;
        do {
            if (!var1.hasNext()) {
                return Boolean.valueOf(false);
            }

            type = (MechaItemType) var1.next();
        } while (!type.wasteCompact);

        return Boolean.valueOf(true);
    }

    public float diamondMultiplier() {
        float multiplier = 1.0F;

        MechaItemType type;
        for (Iterator var2 = this.getUpgradeTypes().iterator(); var2.hasNext(); multiplier *= type.fortuneDiamond) {
            type = (MechaItemType) var2.next();
        }

        return multiplier;
    }

    public float speedMultiplier() {
        float multiplier = 1.0F;

        MechaItemType type;
        for (Iterator var2 = this.getUpgradeTypes().iterator(); var2.hasNext(); multiplier *= type.speedMultiplier) {
            type = (MechaItemType) var2.next();
        }

        return multiplier;
    }

    public float coalMultiplier() {
        float multiplier = 1.0F;

        MechaItemType type;
        for (Iterator var2 = this.getUpgradeTypes().iterator(); var2.hasNext(); multiplier *= type.fortuneCoal) {
            type = (MechaItemType) var2.next();
        }

        return multiplier;
    }

    public float redstoneMultiplier() {
        float multiplier = 1.0F;

        MechaItemType type;
        for (Iterator var2 = this.getUpgradeTypes().iterator(); var2.hasNext(); multiplier *= type.fortuneRedstone) {
            type = (MechaItemType) var2.next();
        }

        return multiplier;
    }

    public float vulnerability() {
        float multiplier = 1.0F;

        MechaItemType type;
        for (Iterator var2 = this.getUpgradeTypes().iterator(); var2
                .hasNext(); multiplier *= 1.0F - type.damageResistance) {
            type = (MechaItemType) var2.next();
        }

        return multiplier;
    }

    public float emeraldMultiplier() {
        float multiplier = 1.0F;

        MechaItemType type;
        for (Iterator var2 = this.getUpgradeTypes().iterator(); var2.hasNext(); multiplier *= type.fortuneEmerald) {
            type = (MechaItemType) var2.next();
        }

        return multiplier;
    }

    public float ironMultiplier() {
        float multiplier = 1.0F;

        MechaItemType type;
        for (Iterator var2 = this.getUpgradeTypes().iterator(); var2.hasNext(); multiplier *= type.fortuneIron) {
            type = (MechaItemType) var2.next();
        }

        return multiplier;
    }

    public int lightLevel() {
        int level = 0;

        MechaItemType type;
        for (Iterator var2 = this.getUpgradeTypes().iterator(); var2
                .hasNext(); level = Math.max(level, type.lightLevel)) {
            type = (MechaItemType) var2.next();
        }

        return level;
    }

    public boolean forceDark() {
        Iterator var1 = this.getUpgradeTypes().iterator();

        MechaItemType type;
        do {
            if (!var1.hasNext()) {
                return false;
            }

            type = (MechaItemType) var1.next();
        } while (!type.forceDark);

        return true;
    }

    public boolean autoCoal() {
        Iterator var1 = this.getUpgradeTypes().iterator();

        MechaItemType type;
        do {
            if (!var1.hasNext()) {
                return false;
            }

            type = (MechaItemType) var1.next();
        } while (!type.autoCoal);

        return true;
    }

    public boolean autoRepair() {
        Iterator var1 = this.getUpgradeTypes().iterator();

        MechaItemType type;
        do {
            if (!var1.hasNext()) {
                return false;
            }

            type = (MechaItemType) var1.next();
        } while (!type.autoRepair);

        return true;
    }

    public boolean shouldFloat() {
        Iterator var1 = this.getUpgradeTypes().iterator();

        MechaItemType type;
        do {
            if (!var1.hasNext()) {
                return false;
            }

            type = (MechaItemType) var1.next();
        } while (!type.floater);

        return true;
    }

    public boolean infiniteAmmo() {
        Iterator var1 = this.getUpgradeTypes().iterator();

        MechaItemType type;
        do {
            if (!var1.hasNext()) {
                return false;
            }

            type = (MechaItemType) var1.next();
        } while (!type.infiniteAmmo);

        return true;
    }

    public MechaItemType rocketPack() {
        Iterator var1 = this.getUpgradeTypes().iterator();

        MechaItemType type;
        do {
            if (!var1.hasNext()) {
                return null;
            }

            type = (MechaItemType) var1.next();
        } while (!type.rocketPack);

        return type;
    }

    public boolean shouldFly() {
        return this.rocketPack() != null;
    }

    public float jetPackPower() {
        float multiplier = 1.0F;

        MechaItemType type;
        for (Iterator var2 = this.getUpgradeTypes().iterator(); var2.hasNext(); multiplier *= type.rocketPower) {
            type = (MechaItemType) var2.next();
        }

        return multiplier;
    }

    public ArrayList getUpgradeTypes() {
        ArrayList types = new ArrayList();
        Iterator var2 = this.inventory.stacks.values().iterator();

        while (var2.hasNext()) {
            ItemStack stack = (ItemStack) var2.next();
            if (stack != null && stack.getItem() instanceof ItemMechaAddon) {
                types.add(((ItemMechaAddon) stack.getItem()).type);
            }
        }

        return types;
    }

    @SideOnly(Side.CLIENT)
    public boolean showInventory(int seat) {
        return seat != 0;
    }

    protected void dropItemsOnPartDeath(Vector3f midpoint, DriveablePart part) {
    }

    public boolean hasMouseControlMode() {
        return false;
    }

    public String getBombInventoryName() {
        return "";
    }

    public String getMissileInventoryName() {
        return "";
    }

    @SideOnly(Side.CLIENT)
    public EntityLivingBase getCamera() {
        return null;
    }
}
