package mcu;

import mcu.friend.entity.FriendsPlayer;
import mcu.utils.SidedProtection;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;

public class PointColor {
    public static int getIDByEntity(Entity em, EntityPlayer sender) {
        if (!SidedProtection.SERVER)
            return 199139;
        if (em instanceof EntityPlayer) {
            if (((EntityPlayer) em).capabilities.isCreativeMode) {
                return 228;
            }
            if (FriendsPlayer.forPlayer(sender).isInFriends((EntityPlayer) em)) {
                return 2;
            }
            return 1;

        }
        if (em instanceof EntityAnimal) {
            return 3;
        }
        if (em instanceof EntityZombie) {
            return 4;
        }
        if (em instanceof EntityItem) {
            return 6;
        } else {
            return 0;
        }
    }

    public static float[] getColorById(int id) {
        if (!SidedProtection.CLIENT)
            return new float[0];
        switch (id) {
            case 0:
                return new float[]{0.75F, 0.75F, 0.75F};
            case 1:
                return new float[]{0.75F, 0.75F, 0};
            case 2:
                return new float[]{0, 0.75F, 0};
            case 228:
                return new float[]{0F, 0F, 0F};
            case 3:
                return new float[]{0F, 0F, 0.75F};
            case 4:
                return new float[]{0.75F, 0F, 0.F};
            case 5:
                return new float[]{0F, 0.75F, 0.75F};
            case 6:
                return new float[]{0.75F, 0.75F, 0.75F};
            default:
                return new float[]{1, 1, 1, 1};
        }
    }
}
