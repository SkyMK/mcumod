package mcu.server;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import mcu.DayZ;
import mcu.PointColor;
import mcu.items.armors.JuggernautArmor;
import mcu.client.hud.RadarEntry;
import mcu.entity.EntityCorpse;
import mcu.entity.EntityHouse;
import mcu.entity.ExtendedPlayer;
import mcu.items.Items;
import mcu.network.PacketHandler;
import mcu.server.commands.MCUCommand;
import mcu.storehouse.Store;
import mcu.utils.SidedProtection;
import mcu.utils.Utils;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.AchievementEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerEvent.Clone;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ServerEvent {
    public static DamageSource source = new DamageSource("cdmsrc") {
        public IChatComponent func_151519_b(EntityLivingBase p) {
            return new ChatComponentText("§a[§cАнти-лив§a] " + p.getCommandSenderName() + " вышел во время пвп");
        }
    };
    public static boolean firstTick;

    static {
        source.setDamageBypassesArmor();
    }

    public static void serverShoot(EntityPlayer player, long seed, double spread) {
        DayZ.network.sendToAll(DayZ.network.createPacket(29, player.getEntityId(), seed, spread));
    }


    @SubscribeEvent
    public void onFall(final LivingFallEvent e) {
        if (!SidedProtection.SERVER)
            return;
        if (e.entityLiving instanceof EntityPlayerMP) {
            final EntityPlayerMP ep = (EntityPlayerMP) e.entityLiving;
            if (Utils.inSafezone(ep)) {
                e.setCanceled(true);
                return;
            }
            if (ep.capabilities.isCreativeMode)
                return;
            if (ep.getCurrentArmor(0) != null && ep.getCurrentArmor(0).getItem() == Items.juggernautBoots) {
                e.setCanceled(true);
                if (e.distance > 3) {
                    ep.attackEntityFrom(source, 1.3F);
                }
            } else {
                if (e.distance > 5) {
                    ep.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, Integer.MAX_VALUE));
                }
            }
        }
    }

    @SubscribeEvent
    public void worldTimeElite(TickEvent.WorldTickEvent event) {
        if (!SidedProtection.SERVER)
            return;
        if (!event.world.isRemote) {
            if (!firstTick) {
                Utils.applyBlockMods();
                firstTick = true;
            }
            event.world.getWorldInfo().setRaining(false);
            event.world.getWorldInfo().setThundering(false);
            event.world.getWorldInfo().setRainTime(0);
            event.world.getWorldInfo().setThunderTime(0);
        }
    }

    @SubscribeEvent
    public void chatMessage(ServerChatEvent event) {
        if (!SidedProtection.SERVER)
            return;
        String msg = event.message;
    }

    @SubscribeEvent
    public void antiDisconnect(PlayerLoggedOutEvent event) {
        if (!SidedProtection.SERVER)
            return;
        if (Utils.inSafezone(event.player))
            return;
        if (event.player.attackTime > 25) {
            event.player.attackEntityFrom(source, 1500);
        }
    }

    @SubscribeEvent
    public void hurt(LivingHurtEvent e) {
        if (e.entity instanceof EntityPlayerMP) {
            ExtendedPlayer.get((EntityPlayer) e.entity).hurt(10000);
            if (ExtendedPlayer.get((EntityPlayer) e.entity).getInvisible() > 0) {
                e.setCanceled(true);
            }
        }
        if (e.source != null && e.source.getSourceOfDamage() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) e.source.getSourceOfDamage();
            ExtendedPlayer server = ExtendedPlayer.get(player);
            if (server.getInvisible() > 0) {
                e.setCanceled(true);
            }
        }

    }

    @SubscribeEvent
    public void onLivingAttack(final LivingAttackEvent e) {
        if (!SidedProtection.SERVER)
            return;
        if (e.source == DamageSource.generic || e.source == DamageSource.outOfWorld) {
            e.setCanceled(false);
            return;
        }
        if (e.source.getEntity() instanceof EntityPlayerMP) {
            EntityPlayerMP player = (EntityPlayerMP) e.source.getEntity();
            if (player.ridingEntity instanceof EntityHouse) {
                e.setCanceled(true);
                return;
            }
        }
        if (e.entity instanceof EntityPlayerMP) {
            EntityPlayerMP player = (EntityPlayerMP) e.entity;
            boolean b = player.getCurrentArmor(2) != null
                    && player.getCurrentArmor(2).getItem() == Items.juggernautChestplate;
            if (e.ammount > 10 || e.ammount > 5 && e.entity.worldObj.rand.nextBoolean()) {
                if (!player.capabilities.isCreativeMode) {
                    if (!b) {
                        ExtendedPlayer.get(player).bleeding = true;
                        ExtendedPlayer.get(player).sync();
                    }
                }
            }
        }
        if (e.entity instanceof EntityPlayerMP && e.source.getEntity() instanceof EntityPlayerMP
                && Utils.inSafezone((EntityPlayerMP) e.entity)
                && Utils.inSafezone((EntityPlayerMP) e.source.getEntity())) {
            e.setCanceled(true);
            return;
        }
        if (e.entity instanceof EntityPlayerMP) {
            EntityPlayerMP player = (EntityPlayerMP) e.entity;
            if (player.ridingEntity instanceof EntityHouse) {
                e.setCanceled(true);
                return;
            }
        }
        if (e.source.getEntity() instanceof EntityPlayerMP) {
            EntityPlayerMP attacker = (EntityPlayerMP) e.source.getEntity();
            if (e.entity instanceof EntityPlayerMP) {
                EntityPlayerMP attacked = (EntityPlayerMP) e.entity;
                if (Utils.inSafezone(attacker) || Utils.inSafezone(attacked)) {
                    e.setCanceled(true);
                }
                ExtendedPlayer server = ExtendedPlayer.get(attacker);
            }
        }
        if (e.entityLiving instanceof EntityPlayerMP) {
            final EntityPlayerMP player = (EntityPlayerMP) e.entityLiving;
            player.removePotionEffect(Potion.regeneration.id);
            if (JuggernautArmor.isFullSet(player)) {
                final ItemStack armor = player.getCurrentArmor(3);
                if (JuggernautArmor.checkArmorOwner(player.worldObj, player, armor)) {
                    final NBTTagCompound nbt = JuggernautArmor.getTagCompound(armor);
                    if (nbt.getBoolean("damaged")) {
                        e.setCanceled(true);
                    } else if (nbt.getInteger("cooldown") >= 600) {
                        nbt.setBoolean("damaged", true);
                    } else {
                        nbt.setInteger("cooldown", 0);
                    }
                }
            }
        }
        if (e.source.getEntity() instanceof EntityPlayerMP) {
            DayZ.network.sendTo(DayZ.network.createPacket(PacketHandler.HIT, false),
                    (EntityPlayerMP) e.source.getEntity());
        }
        if (!e.isCanceled() && e.entity instanceof EntityPlayerMP) {
        }
    }

    @SubscribeEvent
    public void onPlayerConstructing(EntityEvent.EntityConstructing event) {
        EntityPlayerMP player = null;
        if (event.entity instanceof EntityPlayerMP && (player = (EntityPlayerMP) event.entity)
                .getExtendedProperties(ExtendedPlayer.PROPERTIES_NAME) == null) {
            player.registerExtendedProperties(ExtendedPlayer.PROPERTIES_NAME, new ExtendedPlayer(player));
        }
        if (event.entity instanceof EntityPlayer) {
            event.entity.getDataWatcher().addObject(26, 0);
            event.entity.getDataWatcher().addObject(23, 0);
            event.entity.getDataWatcher().addObject(25, "");
            event.entity.getDataWatcher().addObject(21, 0);
        }
    }

    @SubscribeEvent
    public void onLivingKill(final LivingDeathEvent event) {
        if (!SidedProtection.SERVER)
            return;
        if (event.source.getEntity() instanceof EntityPlayerMP) {
            DayZ.network.sendTo(DayZ.network.createPacket(PacketHandler.HIT, true),
                    (EntityPlayerMP) event.source.getEntity());
        }
        if (event.entity instanceof EntityPlayerMP) {
            EntityPlayerMP player = (EntityPlayerMP) event.entity;
            ExtendedPlayer server = ExtendedPlayer.get(player);
            server.bleeding = false;
            server.sync();
        }
        if (event.source.getEntity() instanceof EntityPlayerMP && event.entity instanceof EntityPlayerMP) {
            EntityPlayerMP attacker = (EntityPlayerMP) event.source.getEntity();
            ExtendedPlayer server = ExtendedPlayer.get(attacker);
            server.playerKill();
        }
        if (event.source.getEntity() instanceof EntityPlayerMP && event.entity instanceof EntityZombie) {
            EntityPlayerMP attacker = (EntityPlayerMP) event.source.getEntity();
            ExtendedPlayer server = ExtendedPlayer.get(attacker);
            server.zombieKill();
        }
        if (event.entityLiving instanceof EntityPlayerMP) {
            EntityPlayerMP player = (EntityPlayerMP) event.entityLiving;
            World w = event.entity.worldObj;
            EntityCorpse corpse = new EntityCorpse(player, Arrays.asList(player.inventory.mainInventory));
            for (int i = 0; i < player.inventory.mainInventory.length; i++) {
                player.inventory.mainInventory[i] = null;
            }
            for (int i = 0; i < player.inventory.armorInventory.length; i++) {
                player.inventory.armorInventory[i] = null;
            }
            w.spawnEntityInWorld(corpse);
        }
    }

    @SubscribeEvent
    public void onUpdate(LivingUpdateEvent event) {
        if (!SidedProtection.SERVER)
            return;
        if (event.entity instanceof EntityPlayerMP) {
            if (event.entity.posY > 256) {
                ((EntityPlayerMP) event.entity).setPositionAndUpdate(event.entity.posX, 225, event.entity.posZ);
            }
            World w = event.entity.worldObj;
            EntityPlayerMP player = (EntityPlayerMP) event.entity;
            if (Utils.inSafezone(player)) {
                player.attackTime = 0;
            }
            player.getDataWatcher().updateObject(26, player.attackTime / 20);
            if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem() == Items.juggernautHelmet) {
                final ItemStack armor = player.getCurrentArmor(3);
                final NBTTagCompound nbt = JuggernautArmor.getTagCompound(armor);
                player.getDataWatcher().updateObject(21, nbt.getInteger("shield"));
            }
            if (!w.isRemote) {
                ExtendedPlayer server = ExtendedPlayer.get(player);
                for (Store s : server.stores) {
                    s.update(player.worldObj);
                }
                server.onUpdate(event.entity.ticksExisted);
                if (player.ticksExisted % 20 == 0) {
                    server.updateInvisible();
                }
                if (server.bleeding && player.worldObj.rand.nextInt(60) == 0) {
                    player.attackEntityFrom(source, 0.05f);
                }
                if (w.getTotalWorldTime() % 3 == 0) {
                    DayZ.network.sendTo(DayZ.network.createPacket(PacketHandler.DESYNC_UPDATE, 8), player);
                }
                if (w.getTotalWorldTime() % 20 == 0) {
                    if (player.worldObj.rand.nextInt(150) == 0 || Utils.inSafezone(player)) {
                        server.bleeding = false;
                        server.sync();
                    }
                    if (player.worldObj.rand.nextInt(150) == 0) {
                        if (player.isPotionActive(Potion.moveSlowdown)) {
                            player.removePotionEffect(Potion.moveSlowdown.id);
                        }
                    }
                }
                if (w.getTotalWorldTime() % 3L == 0L) {
                    EntityPlayerMP ep = (EntityPlayerMP) event.entity;
                    if (ep.getCurrentArmor(3) != null && ep.getCurrentArmor(3).getItem() == Items.juggernautHelmet
                            || ep.capabilities.isCreativeMode) {
                        List<Entity> entities = (List<Entity>) w.getEntitiesWithinAABBExcludingEntity(ep,
                                ep.boundingBox.expand(130, 255, 130));
                        entities.removeIf(
                                entity -> ep.getDistanceToEntity(entity) > 126 || (entity instanceof EntityPlayer
                                        && ((EntityPlayer) entity).capabilities.isCreativeMode));
                        List<RadarEntry> radarList = entities
                                .stream().map(ed -> new RadarEntry((byte) (ed.posX - ep.posX),
                                        (byte) (ep.posZ - ed.posZ), (byte) PointColor.getIDByEntity(ed, ep)))
                                .collect(Collectors.toList());
                        DayZ.network.sendTo(DayZ.network.createPacket(PacketHandler.UPDATE_RADAR, radarList), player);
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onEntityJoinWorld(EntityJoinWorldEvent event) {
        if (!SidedProtection.SERVER)
            return;
        if (event.entity instanceof EntityPlayerMP && !event.entity.worldObj.isRemote) {
            DayZ.network.sendTo(DayZ.network.createPacket(30, 2), (EntityPlayerMP) event.entity);
            ExtendedPlayer.get((EntityPlayerMP) event.entity).sync();
        }
    }

    @SubscribeEvent
    public void onClonePlayer(Clone event) {
        if (!SidedProtection.SERVER)
            return;
        if (event.entityPlayer instanceof EntityPlayerMP)
            ExtendedPlayer.get(event.entityPlayer).copyNBT(ExtendedPlayer.get(event.original));
    }

    @SubscribeEvent
    public void chat(ServerChatEvent event) {
        if (MCUCommand.offChat && !DayZ.isOP(event.player)) {
            DayZ.sendHint(event.player, "Чат только для админов", 150);
            event.setCanceled(true);
        }
    }

    @SubscribeEvent
    public void pickUp(EntityItemPickupEvent event) {
        event.setCanceled(true);
    }

    @SubscribeEvent
    public void ach(AchievementEvent event) {
        event.setCanceled(true);
    }
}
