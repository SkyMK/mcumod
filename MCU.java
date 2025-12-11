package mcu;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.chunk.EmptyChunk;

import java.io.File;

public class MCU {
    public static final String VERSION = "22.07.2021 2.2x";
    @SideOnly(Side.CLIENT)
    public static String server = "DayZ Test";
    @SideOnly(Side.CLIENT)
    public static boolean ATTACH_RENDERED = false;
    @SideOnly(Side.CLIENT)
    public static boolean fancyGuns = true;
    @SideOnly(Side.CLIENT)
    public static boolean clearDL;
    public static boolean local = false;

    static {
        MCU.fancyGuns = new File("fGun").exists();
        try {
            Minecraft.class.getDeclaredField("timer");
            local = true;
        } catch (NoSuchFieldException ex) {
            ex.printStackTrace();
        }
    }

    public static boolean inEmptyChunk(Entity entity) {
        if (!entity.worldObj.isRemote) {
            return false;
        }
        int n = MathHelper.floor_double(entity.boundingBox.minX);
        int n2 = MathHelper.floor_double(entity.boundingBox.minY);
        int n3 = MathHelper.floor_double(entity.boundingBox.minZ);
        int n4 = MathHelper.ceiling_double_int(entity.boundingBox.maxX);
        int n5 = MathHelper.ceiling_double_int(entity.boundingBox.maxY);
        int n6 = MathHelper.ceiling_double_int(entity.boundingBox.maxZ);
        for (int i = n; i <= n4; ++i) {
            for (int j = n2; j <= n5; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (!(entity.worldObj.getChunkFromBlockCoords(MathHelper.floor_double(entity.posX),
                            MathHelper.floor_double(entity.posZ)) instanceof EmptyChunk))
                        continue;
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSaw(ItemStack stack) {
        return check(stack, "M249SAW");
    }

    public static boolean isAK(ItemStack stack) {
        return check(stack, "ny_rpk");
    }

    public static boolean is2021AK(ItemStack stack) {
        return check(stack, "ny2021");
    }

    public static boolean isMCUGun(ItemStack stack) {
        return check(stack, "L85A2");
    }

    public static boolean is2021SAW(ItemStack stack) {
        return check(stack, "saw2021");
    }

    public static boolean autoBipod(ItemStack stack) {
        return isMCUGun(stack);
    }

    public static boolean check(ItemStack s, String name) {
        return s != null && s.getItem() != null && s.getItem().getUnlocalizedName().contains(name);
    }
}
