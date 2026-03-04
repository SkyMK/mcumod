package mcu.utils;

import com.flansmod.common.guns.DamageMultiplier;
import mcu.entity.EntityHouse;
import mcu.entity.ExtendedPlayer;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;

public class Utils {
    public static boolean inSafezone(EntityPlayer player) {
        return player.posX > -128 && player.posX < 139 && player.posZ > -102 && player.posZ < 87;
    }

    public static boolean canTeleport(EntityPlayer player) {
        return inSafezone(player) || player.ridingEntity != null && player.ridingEntity instanceof EntityHouse;
    }

    public static boolean isFullPlayerInventory(EntityPlayer player) {
        for (int i = 0; i < 36; ++i) {
            ItemStack slot = player.inventory.getStackInSlot(i);
            if (slot == null)
                return false;
        }
        return true;
    }

    public static void teleportEntity(EntityPlayerMP player, int x, int y, int z) {
        if (!SidedProtection.SERVER)
            return;
        player.mountEntity(null);
        player.setPositionAndUpdate(x, y, z);
        ExtendedPlayer server = ExtendedPlayer.get(player);
    }

    public static void teleportEntity(EntityPlayerMP player, double x, double y, double z) {
        if (!SidedProtection.SERVER)
            return;
        player.mountEntity(null);
        player.setPositionAndUpdate(x, y, z);
        ExtendedPlayer server = ExtendedPlayer.get(player);
        server.setInvisible(5);
    }

    public static boolean inRespawnZone(EntityPlayer target) {
        return inSafezone(target) && target.posY < 10;
    }

    public static DamageMultiplier getModifier(Entity hit, Vec3 hitVec) {
        if (hit.height < 1)
            return DamageMultiplier.RETARD;
        double hitY = hit.posY + hit.getEyeHeight();
        double head = 0.5;
        boolean headshot = hitVec.yCoord > hitY - head;
        if (headshot)
            return DamageMultiplier.HEAD;
        return DamageMultiplier.BODY;
    }

    public static void applyBlockMods() {
        Block.blockRegistry.forEach(w -> {
            ((Block) w).setBlockUnbreakable();
        });
    }
}