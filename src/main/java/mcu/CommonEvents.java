package mcu.looting.other;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import mcu.looting.chest.BlockChest;
import mcu.looting.chest.ChestsSaveData;
import net.minecraft.block.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.WorldEvent;
import mcu.looting.network.NetworkWrapper;
import mcu.looting.network.packages.PacketSyncChests;

public class CommonEvents {

    private boolean flag;

    @SubscribeEvent
    public void breakSpeed(PlayerEvent.BreakSpeed e) {
        if (!e.entityPlayer.capabilities.isCreativeMode)
            e.setCanceled(true);
    }

    @SubscribeEvent
    public void blockBreak(BlockEvent.BreakEvent e) {
        if ((e.block instanceof BlockTallGrass || e.block instanceof BlockGlass || e.block instanceof BlockFlower || e.block instanceof BlockDoublePlant) && !e.getPlayer().capabilities.isCreativeMode)
            e.setCanceled(true);
    }

    @SubscribeEvent
    public void join(EntityJoinWorldEvent e) {
        if (e.world != null && !e.world.isRemote && e.entity instanceof EntityPlayer) {
            NetworkWrapper.instance.sendTo(new PacketSyncChests(), (EntityPlayerMP) e.entity);
        }
    }

    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent e) {
        World world = MinecraftServer.getServer().getEntityWorld();
        if (world.getTotalWorldTime() % 20 == 0) {
            ChestsSaveData data = ChestsSaveData.getOrCreateData(world);
            for (mcu.looting.chest.BlockChest.ChestOnMap chest : data.chests) {
                if (chest.timeToSpawn == 0)
                    continue;
                else if (chest.timeToSpawn == 1) {
                    chest.timeToSpawn = 0;
                    world.setBlock((int) chest.pos.x, (int) chest.pos.y, (int) chest.pos.z, ModItems.chestBlock, chest.meta, 2);
                    data.markDirty();
                } else {
                    chest.timeToSpawn--;
                }
            }
        }
    }

    @SubscribeEvent
    public void load(WorldEvent.Load e) {
        if (!e.world.isRemote) {
            ChestsSaveData data = ChestsSaveData.getOrCreateData(e.world);
            for (mcu.looting.chest.BlockChest.ChestOnMap chest : data.chests) {
                chest.timeToSpawn = 0;
                Block block = e.world.getBlock((int) chest.pos.x, (int) chest.pos.y, (int) chest.pos.z);
                if (block == null || !(block instanceof BlockChest))
                    e.world.setBlock((int) chest.pos.x, (int) chest.pos.y, (int) chest.pos.z, ModItems.chestBlock, chest.meta, 2);
            }
            data.markDirty();
        }
    }
}
