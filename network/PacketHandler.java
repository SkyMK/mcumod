package mcu.network;

import com.flansmod.client.TickHandlerClient;
import com.flansmod.common.BlockFlansWorkbench;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.EntityDamageSourceGun;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.types.InfoType;
import com.flansmod.mcu.CrosshairRenderer;
import com.google.common.collect.Lists;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.DayZ;
import mcu.client.ClientEventHandler;
import mcu.client.hud.DayZHud;
import mcu.client.hud.DayZHud.Hint;
import mcu.client.hud.RadarEntry;
import mcu.entity.EntityCorpse;
import mcu.entity.EntityHouse;
import mcu.entity.ExtendedPlayer;
import mcu.friend.entity.FriendsPlayer;
import mcu.juggernaut.JuggerHud;
import mcu.movement.Movement;
import mcu.server.ServerEvent;
import mcu.spawnsystem.SpawnSystem;
import mcu.storehouse.Store;
import mcu.teleport.Teleport;
import mcu.utils.SidedProtection;
import mcu.utils.Utils;
import net.minecraft.block.BlockDoor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.WorldServer;

import java.util.ArrayList;
import java.util.List;

public class PacketHandler implements IPacketHandler, Hint {
    public static final byte SYNC_NBT = 0;
    public static final byte UPDATE_RADAR = 1;
    public static final byte HIT = 2;
    public static final byte CRASH = 4;
    public static final byte ADD_TRACER = 5;
    public static final byte DESYNC_UPDATE = 6;
    public static final byte OPEN_GUI_HOUSE = 7;
    public static final byte UNLOAD = 10;
    public static final byte OPEN_WORKBENCH = 11;
    public static final byte TAKE_VEHICLE = 12;
    public static final byte SAVE_VEHICLE = 13;
    public static final byte STOVE_CHANGE = 16;
    public static final byte ADD_HINT = 17;
    public static int lastUpdate = 0;
    public static boolean antiCheatEnabled;
    public PacketHandler() {
        if (FMLCommonHandler.instance().getEffectiveSide().isClient()) {
            DayZHud.hints.put("ph", this);
        }
    }

    @SideOnly(Side.CLIENT)
    public void handleClientSide(PacketBuffer buf, byte id, Minecraft mc, WorldClient world, EntityClientPlayerMP player) {
        if (SidedProtection.CLIENT) {
            if (id == SYNC_NBT) {
                ExtendedPlayer.get(player).loadNBTData(ByteBufUtils.readTag(buf));
            }
            if (id == UPDATE_RADAR) {
                int d = buf.readInt();
                ArrayList<RadarEntry> list = Lists.newArrayListWithCapacity(d);
                for (int i = 0; i < d; i++) {
                    list.add(new RadarEntry(buf.readByte(), buf.readByte(), buf.readByte()));
                }
                JuggerHud.entities = list;
            }
            if (id == HIT) {
                if (buf.readBoolean()) {
                    CrosshairRenderer.death_count = 10;
                } else {
                    CrosshairRenderer.hit_count = 10;
                }
            }
            if (id == 11) {
                boolean head = buf.readBoolean();
                String s = ByteBufUtils.readUTF8String(buf);
                String killed = ByteBufUtils.readUTF8String(buf);
                String killer = ByteBufUtils.readUTF8String(buf);
                TickHandlerClient.addKillMessage(head, InfoType.getType(s), killer, killed);
            }
            if (id == CRASH) {
                FMLCommonHandler.instance().exitJava(0, true);
            }
            if (id == ADD_TRACER) {
            }
            if (id == DESYNC_UPDATE) {
                lastUpdate = 0;
            }
            if (id == 29) {
                int pid = buf.readInt();
                long seed = buf.readLong();
                float spread = buf.readFloat();
                EntityPlayer shooter = (EntityPlayer) world.getEntityByID(pid);
                if (shooter != null) {
                    ClientEventHandler.clientShoot(shooter, seed, spread);
                }
            }
            if (id == OPEN_GUI_HOUSE) {
                NBTTagCompound tag = ByteBufUtils.readTag(buf);
                DayZ.proxy.openGuiHouse((byte) 0, mc.thePlayer, mc.theWorld.getEntityByID(tag.getInteger("entityID")),
                        tag);
                mc.thePlayer.openContainer.windowId = tag.getInteger("windowID");
            }
            if (id == ADD_HINT) {
                DayZHud.hints.put("serverhint", new ServerHint(ByteBufUtils.readUTF8String(buf), buf.readInt()));
            }
            if (id == 99) {
                int byteArraySize = buf.readInt();
                byte[] array = new byte[byteArraySize];
                for (int i = 0; i < byteArraySize; i++) {
                    array[i] = buf.readByte();
                }
                Store.clientSync(array);
            }
        }
    }

    public void handleServerSide(PacketBuffer buf, byte id, WorldServer world, EntityPlayerMP player) {
        if (SidedProtection.SERVER) {
            if (id == UNLOAD) {
                if (player.getHeldItem() != null && player.getHeldItem().getItem() instanceof ItemGun) {
                    ItemGun gun = (ItemGun) player.getHeldItem().getItem();
                    if (gun.getBulletItemStack(player.getHeldItem(), 0) != null
                            && gun.getBulletItemStack(player.getHeldItem(), 0).getItem() != Items.apple) {
                        player.inventory.addItemStackToInventory(gun.getBulletItemStack(player.getHeldItem(), 0));
                        gun.setBulletItemStack(player.getHeldItem(), new ItemStack(Items.apple), 0);
                    }
                }
            }
            if (id == 96) {
                Teleport.serverTeleport(player, buf.readInt(), buf.readInt());
            }
            if (id == OPEN_WORKBENCH) {
                if (world.getBlock(11, 20, 14) instanceof BlockFlansWorkbench) {
                    player.openGui(FlansMod.INSTANCE, 2, world, 11, 98, 14);
                } else {
                    world.setBlock(11, 20, 14, FlansMod.workbench);
                }
            }
            if (id == 6) {
                try {
                    int enId = buf.readInt();
                    if (world.getEntityByID(enId) != null && world.getEntityByID(enId) instanceof EntityItem
                            && player.getDistanceToEntity(world.getEntityByID(enId)) < 9) {
                        if (!Utils.isFullPlayerInventory(player)) {
                            EntityItem theItem = (EntityItem) world.getEntityByID(enId);
                            theItem.setDead();
                            player.inventory.addItemStackToInventory(theItem.getEntityItem());
                            player.worldObj.playSoundEffect(player.posX, player.posY, player.posZ, "random.pop", 1.0f,
                                    1.0f);
                            player.inventoryContainer.detectAndSendChanges();
                        }
                    }
                } catch (Exception e) {
                    player.addChatComponentMessage(new ChatComponentText(e.getLocalizedMessage()));
                }
            }
            if (id == TAKE_VEHICLE) {
                int read = buf.readInt();
                int read2 = buf.readInt();
                if (world.getEntityByID(read2) != null && world.getEntityByID(read2) instanceof EntityHouse) {
                    EntityHouse house = (EntityHouse) world.getEntityByID(read2);
                    if (house.owner.equals(player.getCommandSenderName()) || player.capabilities.isCreativeMode) {
                        house.getEntity(read);
                        return;
                    }
                }
            }
            if (id == STOVE_CHANGE) {
                if (player.ridingEntity != null && player.ridingEntity instanceof EntityHouse) {
                    ((EntityHouse) player.ridingEntity).stove = buf.readBoolean();
                }
            }
            if (id == SAVE_VEHICLE) {
                buf.readInt();
                int read2 = buf.readInt();
                if (world.getEntityByID(read2) != null) {
                    /*
                     * if (world.getEntityByID(read) != null &&
                     * Vehicle.isVehicle(world.getEntityByID(read))) { if
                     * (world.getEntityByID(read2) instanceof EntityHouse) { EntityHouse house =
                     * (EntityHouse) world.getEntityByID(read2); if
                     * (house.owner.equals(player.getCommandSenderName()) ||
                     * player.capabilities.isCreativeMode) { if (house.listVehicles().size() > 2) {
                     * DayZ.sendHint(player, "§eДом переполнен", 400); return; } if
                     * (world.getEntityByID(read).riddenByEntity != null) { DayZ.sendHint(player,
                     * "§eТехника занята", 400); return; } if (!world.getEntityByID(read).isDead) {
                     * Entity en = world.getEntityByID(read); if (player.getDistanceToEntity(en) <
                     * 32) house.addEntity(en); return; } } } }
                     */
                }
            }
            if (id == 25) {
                if (buf.readBoolean() != Movement.isPlayerCrawling(player)) {
                    Movement.togglePlayerCrawling(player);
                }
                player.fallDistance = buf.readFloat();
            }
            if (!Utils.inSafezone(player) && (id == 28 || id == 29)) {
                ExtendedPlayer server = ExtendedPlayer.get(player);
                if (server.getInvisible() != 0)
                    return;
                if (player.getHeldItem() == null)
                    return;
                if (!(player.getHeldItem().getItem() instanceof ItemGun))
                    return;
                ItemGun gun = (ItemGun) player.getHeldItem().getItem();
                ItemStack s = gun.getBulletItemStack(player.getHeldItem(), 0);
                if (s == null)
                    return;
                if (s.getItemDamage() <= s.getMaxDamage()) {
                    if (id == 29) {
                        s.setItemDamage(s.getItemDamage() + 1);
                        if (s.getItemDamage() > s.getMaxDamage())
                            s.setItemDamage(s.getMaxDamage());
                        ServerEvent.serverShoot(player, buf.readLong(), buf.readFloat());
                        gun.setBulletItemStack(player.getHeldItem(), s, 0);
                    } else {
                        Entity entity = world.getEntityByID(buf.readInt());
                        float dmg = buf.readFloat();
                        boolean headshot = buf.readBoolean();
                        float damage = dmg;
                        if (entity instanceof EntityPlayer
                                && FriendsPlayer.forPlayer(player).isInFriends((EntityPlayer) entity)) {
                            damage *= 0.8;
                            DayZ.sendHint(player,
                                    EnumChatFormatting.GREEN + "Вы нанесли урон другу " + entity.getCommandSenderName(),
                                    25);
                            DayZ.sendHint((EntityPlayer) entity,
                                    EnumChatFormatting.GREEN + "Вам нанес урон друг " + player.getCommandSenderName(),
                                    25);
                        }
                        if (entity instanceof EntityPlayerMP)
                            ((EntityPlayerMP) entity).attackTime = 300;
                        player.attackTime = 300;
                        if (entity instanceof EntityPlayerMP
                                && ExtendedPlayer.get((EntityPlayer) entity).getInvisible() != 0) {
                            DayZ.sendHint(player, "§eЦель неуязвима "
                                    + ExtendedPlayer.get((EntityPlayer) entity).getInvisible() + " сек.");
                            return;
                        }
                        if (!(entity instanceof EntityCorpse)) {
                            entity.attackEntityFrom(new EntityDamageSourceGun("wxdgun", entity, player,
                                    InfoType.getType(player.getHeldItem()), headshot), damage / 600);
                        }
                        entity.hurtResistantTime = 0;
                        entity.motionX = 0;
                        entity.motionY = 0;
                        entity.motionZ = 0;
                        Object object7;
                        if (entity instanceof EntityPlayer && ((EntityPlayer) entity).getHealth() <= 0.0f
                                && player.getCurrentEquippedItem().getItem() instanceof ItemGun) {
                            object7 = (player).getCurrentEquippedItem();
                            if (((ItemStack) object7).stackTagCompound.hasKey("kills")) {
                                int n = ((ItemStack) object7).stackTagCompound.getInteger("kills");
                                ((ItemStack) object7).stackTagCompound.setInteger("kills", ++n);
                            } else {
                                ((ItemStack) object7).stackTagCompound.setInteger("kills", 1);
                            }
                        }
                    }
                }
            }
            if (id == 30) {
                SpawnSystem.sync(player);
            }
            if (id == 33) {
                SpawnSystem.spawnPlayer(player, ByteBufUtils.readUTF8String(buf));
            }

            if (id == 59) {
                ExtendedPlayer.get(player).openChest(null);
            }
            if (id == 67) {
                int x = buf.readInt();
                int y = buf.readInt();
                int z = buf.readInt();
                buf.readInt();
                final int c = ((BlockDoor) world.getBlock(x, y, z)).func_150012_g(world, x, y, z);
                final int n = (c & 0x7) ^ 0x4;
                if ((c & 0x8) == 0x0) {
                    world.setBlockMetadataWithNotify(x, y, z, n, 2);
                } else {
                    world.setBlockMetadataWithNotify(x, y - 1, z, n, 2);
                }
                world.playAuxSFXAtEntity(player, 1003, x, y, z, 0);
            }
            if (id == 97) {
                ExtendedPlayer.get(player).stores.get(buf.readInt()).boostTime(player);
                Store.sync(player);
            }
            if (id == 98) {
                Store.serverClickStore(player, buf.readInt());
            }
            if (id == 99) {
                Store.sync(player);
            }
        }
    }

    public String getChannel() {
        return "mcuniversalchannel";
    }

    @Override
    public boolean remove() {
        return false;
    }

    @Override
    public void addHints(List<String> list) {
        if (lastUpdate > 60) {
            list.add(
                    "§e\u041e\u0431\u043d\u0430\u0440\u0443\u0436\u0435\u043d\u0430 \u043f\u043e\u0442\u0435\u0440\u044f \u0441\u0432\u044f\u0437\u0438");
            list.add(
                    "§e\u0421\u043e\u0432\u0435\u0442\u0443\u0435\u043c \u0441\u0434\u0435\u043b\u0430\u0442\u044c §6\u0441\u043a\u0440\u0438\u043d\u0448\u043e\u0442§e(§4F2§e) \u0438\u043b\u0438 §6\u0432\u0438\u0434\u0435\u043e§e!");
        }
    }

    public class ServerHint implements Hint {
        String hint;
        long time;

        public ServerHint(String hint, int n) {
            this.hint = hint;
            this.time = System.currentTimeMillis() + n * 50L;
        }

        @Override
        public boolean remove() {
            return System.currentTimeMillis() > time;
        }

        @Override
        public void addHints(List<String> p0) {
            String[] hints = hint.split("\n");
            for (String s : hints)
                p0.add(s);
        }
    }
}
