/*
 * Decompiled with CFR 0.150.
 */
package mcu.client;

import mcu.movement.MovementClient;
import net.minecraft.entity.player.EntityPlayer;

public class Detectibility {
    public static byte update(EntityPlayer entityPlayer) {
        boolean bl;
        int n = 0;
        boolean bl2 = Math.abs(entityPlayer.motionX) > 0.01 || Math.abs(entityPlayer.motionZ) > 0.01
                || entityPlayer.motionY < -0.08 || entityPlayer.motionY > 0.0;
        bl = entityPlayer.height < 1.5f || entityPlayer.isSneaking();
        if (entityPlayer.height > 1.5f) {
            ++n;
        }
        if (bl2) {
            n = Math.max(n + 1, 2);
        }
        if (!bl && bl2) {
            ++n;
        }
        if (entityPlayer.motionY > 0.35 || entityPlayer.motionY < -0.4 || MovementClient.sprinting >= 0.5f) {
            n = 4;
        }
        if (entityPlayer.worldObj.getWorldInfo().isRaining()) {
            n = Math.min(n, 1);
        }
        return (byte) Math.min(n, 4);
    }
}
