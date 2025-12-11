/*
 * Decompiled with CFR 0.150.
 */
package com.flansmod.mcu;

import com.flansmod.client.FlansModPlayerData;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;

public class BulletSpread {
    public static boolean hasScope = false;
    public static float prevClientSpread;

    public static float updateSpread(EntityPlayer entityPlayer, FlansModPlayerData flansModPlayerData, float f,
                                     float f2) {
        f /= 1.5f;
        if (entityPlayer.getCurrentEquippedItem() != null
                && Util.isFlansWeapon(entityPlayer.getCurrentEquippedItem())) {
            boolean bl;
            boolean bl2;
            float f3;
            boolean bl3 = ((ItemGun) entityPlayer.getCurrentEquippedItem().getItem()).type.numBullets != 1;
            float f4 = f3 = (float) Math.sqrt(ItemGun.getClientSpread(entityPlayer.getCurrentEquippedItem()));
            if (bl3) {
                f += f3;
            }
            MathHelper.cos(0);
            boolean bl4 = bl2 = entityPlayer.moveForward != 0.0f || entityPlayer.moveStrafing != 0.0f;
            if (entityPlayer.worldObj.isRemote) {
                hasScope = Util.hasScope(entityPlayer.getCurrentEquippedItem());
            }
            boolean bl5 = Util.isAiming(entityPlayer);
            boolean bl6 = entityPlayer.isSprinting();
            boolean bl7 = entityPlayer.isSneaking();
            boolean bl8 = bl = entityPlayer.height <= 1.0f;
            if (bl) {
                f3 *= 0.33333334f;
            } else if (bl7) {
                f3 *= 0.6666667f;
            } else if (bl6) {
                f3 *= 1.5f;
            }
            if (!bl5 || bl6 || ((ItemGun) entityPlayer.getCurrentEquippedItem().getItem()).type.deployable) {
                f += f3;
            }
            if (bl2) {
                f += f3 * 0.5f;
            }
            if (!entityPlayer.onGround && entityPlayer.ridingEntity == null && !entityPlayer.capabilities.isFlying) {
                f += f4 * 2.0f;
            }
            ++flansModPlayerData.spreadTicks;
            return f += f2;
        }
        flansModPlayerData.spreadTicks = 0;
        return 0.0f;
    }

    public static void tickWeaponSpread(EntityPlayer entityPlayer, FlansModPlayerData flansModPlayerData) {
        flansModPlayerData.weaponSpread = Math.min(flansModPlayerData.weaponSpread, 30.0f);
        if (flansModPlayerData.weaponSpread > 0.0f) {
            flansModPlayerData.weaponSpread /= 3.0f;
        }
        flansModPlayerData.bulletSpread = BulletSpread.updateSpread(entityPlayer, flansModPlayerData,
                flansModPlayerData.bulletSpread, flansModPlayerData.weaponSpread);
    }
}
