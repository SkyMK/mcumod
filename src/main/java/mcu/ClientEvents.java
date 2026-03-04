package mcu.looting.other;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockTallGrass;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.world.BlockEvent;

public class ClientEvents {
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
}
