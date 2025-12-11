/*
 * Decompiled with CFR 0.150.
 *
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.FMLLaunchHandler
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 */
package com.flansmod.mcu;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.TickHandlerClient;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.ItemGun;
import cpw.mods.fml.relauncher.FMLLaunchHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityDiggingFX;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;

import java.util.*;

public class Util {
    public static final String[][] material_sounds = new String[5][];
    public static final Random rng = new Random();
    public static final Map<Material, Integer> materials;
    public static Random rnd = new Random();
    public static boolean isAimingClient;
    public static boolean areClientBulletsBeingUpdated;
    public static Random rand;

    static {
        materials = new HashMap<Material, Integer>();
        areClientBulletsBeingUpdated = false;
        rand = new Random();
        if (FMLLaunchHandler.side() != Side.SERVER) {
            Util.materials.put(Material.grass, 1);
            Util.materials.put(Material.ground, 1);
            Util.materials.put(Material.sponge, 0);
            Util.materials.put(Material.sand, 1);
            Util.materials.put(Material.cactus, 0);
            Util.materials.put(Material.wood, 3);
            Util.materials.put(Material.cloth, 1);
            Util.materials.put(Material.carpet, 0);
            Util.materials.put(Material.tnt, 2);
            Util.materials.put(Material.rock, 0);
            Util.materials.put(Material.iron, 2);
            Util.materials.put(Material.snow, 0);
            Util.materials.put(Material.anvil, 2);
            Util.materials.put(Material.coral, 0);
            Util.materials.put(Material.packedIce, 0);
            Util.materials.put(Material.craftedSnow, 3);
            Util.materials.put(Material.clay, 1);
            Util.materials.put(Material.portal, 1);
            Util.materials.put(Material.web, 2);
            Util.materials.put(Material.glass, 4);
            Util.materials.put(Material.redstoneLight, 2);
            Util.materials.put(Material.ice, 4);
            Util.rng.setSeed(System.currentTimeMillis());
            final List[] array = new List[Util.material_sounds.length];
            for (int i = 0; i < array.length; ++i) {
                array[i] = new ArrayList();
            }
            final Scanner scanner = new Scanner(
                    TickHandlerClient.class.getResourceAsStream("/assets/flansmod/sounds/bullethit.txt"), "UTF-8");
            for (int j = 0; j < Util.material_sounds.length; ++j) {
                for (int int1 = Integer.parseInt(scanner.nextLine()), k = 0; k <= int1; ++k) {
                    array[j].add("flansmod:" + j + "_" + k + "_bullethit");
                }
            }
            for (int l = 0; l < array.length; ++l) {
                Util.material_sounds[l] = (String[]) array[l].toArray(new String[array[l].size()]);
            }
        }
    }

    @SideOnly(value = Side.CLIENT)
    public static void clientBulletUpdate(EntityBullet entityBullet) {
        if (!areClientBulletsBeingUpdated && entityBullet.owner == Minecraft.getMinecraft().thePlayer) {
            return;
        }
        FlansModClient.clientTracers.add(new EntityTraceFX(
                areClientBulletsBeingUpdated && entityBullet.ticksExisted == 0, entityBullet.prevPosX,
                entityBullet.prevPosY, entityBullet.prevPosZ, entityBullet.posX, entityBullet.posY, entityBullet.posZ));
    }

    @SideOnly(Side.CLIENT)
    public static void clientBulletEffects(MovingObjectPosition var0, EntityBullet var1, boolean var2) {
        if (areClientBulletsBeingUpdated) {
            World var3 = var1.worldObj;
            double var4 = var1.posX - var1.prevPosX;
            double var6 = var1.posY - var1.prevPosY;
            double var8 = var1.posZ - var1.prevPosZ;
            double var10 = Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
            var4 /= var10;
            var6 /= var10;
            var8 /= var10;
            if (var2 && var1.owner != Minecraft.getMinecraft().thePlayer) {
                FlansModClient.clientTracers.add(new EntityTraceFX(false, var1.prevPosX, var1.prevPosY, var1.prevPosZ,
                        var1.posX, var1.posY, var1.posZ));
            }

            if (var0 != null) {
                double var12 = var1.posX;
                double var14 = var1.posY;
                double var16 = var1.posZ;
                int var18;
                if (var0.typeOfHit == MovingObjectType.BLOCK) {
                    var18 = var0.blockX;
                    int var19 = var0.blockY;
                    int var20 = var0.blockZ;
                    Block n4;
                    Integer var22 = materials.get((n4 = var3.getBlock(var18, var19, var20)).getMaterial());
                    if (var22 != null) {
                        EnumFacing enumFacing = EnumFacing.values()[var0.sideHit];
                        if (displayParticles()) {
                            double var24 = (rand.nextDouble() * 0.5D + 0.5D) * 2.5E-4D;
                            double var26 = Math.abs(var12
                                    - (double) MathHelper.floor_double(var12 > 0.0D ? var12 + 0.5D : var12 - 0.5D));
                            double var28 = Math.abs(var14
                                    - (double) MathHelper.floor_double(var14 > 0.0D ? var14 + 0.5D : var14 - 0.5D));
                            double var30 = Math.abs(var16
                                    - (double) MathHelper.floor_double(var16 > 0.0D ? var16 + 0.5D : var16 - 0.5D));
                            if (var26 != 0.0D) {
                                var24 = Math.min(var26 * 0.005D, var24);
                            }

                            if (var28 != 0.0D) {
                                var24 = Math.min(var28 * 0.005D, var24);
                            }

                            if (var30 != 0.0D) {
                                var24 = Math.min(var30 * 0.005D, var24);
                            }

                            if (var24 < 1.25E-4D) {
                                var24 = 0.0D;
                            }

                            if (var24 > 0.0D) {
                                var26 = var24 * 20.0D;
                                Iterator var32 = EntityBulletHoleFX.bulletHoles.iterator();

                                while (var32.hasNext()) {
                                    EntityBulletHoleFX var33 = (EntityBulletHoleFX) var32.next();
                                    if (var33.getDistanceSq(var12, var14, var16) < var26) {
                                        var24 = 0.0D;
                                        break;
                                    }
                                }

                                if (var24 > 0.0D) {
                                    Minecraft.getMinecraft().effectRenderer.addEffect(
                                            new EntityBulletHoleFX(Minecraft.getMinecraft().theWorld, var12, var14,
                                                    var16, var18, var19, var20, n4, enumFacing, var22, (float) var24));
                                }
                            }
                        }

                        String[] array = material_sounds[var22.intValue()];
                        if (array.length > 0) {
                            Minecraft.getMinecraft().theWorld.playSound(var18, var19, var20,
                                    array[Util.rng.nextInt(array.length)].split("_")[0], 1, 1, true);
                        }
                    }

                    if (var2 && displayParticles()) {
                        for (int var38 = 0; var38 < 1; ++var38) {
                            Block n6 = var3.getBlock(var18, var19, var20);
                            int n7 = var3.getBlockMetadata(var18, var19, var20);
                            EntityDiggingFX entityDiggingFX = new EntityDiggingFX(Minecraft.getMinecraft().theWorld,
                                    var12, var14, var16, rnd.nextDouble() * 0.01 - var4, rnd.nextDouble() * 0.01 - var6,
                                    rnd.nextDouble() * 0.01 - var8, n6, n7).applyRenderColor(n7);
                            entityDiggingFX.renderDistanceWeight = 256.0;
                            Minecraft.getMinecraft().effectRenderer.addEffect(entityDiggingFX);
                        }
                    }
                }
                if (var0.typeOfHit == MovingObjectPosition.MovingObjectType.ENTITY
                        && var0.entityHit instanceof EntityLivingBase && Util.displayParticles()) {
                    for (int i = 0; i < 3; ++i) {
                        EntityDiggingFX entityDiggingFX = new EntityDiggingFX(Minecraft.getMinecraft().theWorld, var12,
                                var14, var16, rnd.nextDouble() * 0.01 - var4, rnd.nextDouble() * 0.01 - var6,
                                rnd.nextDouble() * 0.01 - var8, Blocks.emerald_block, 14).applyRenderColor(14);
                        entityDiggingFX.renderDistanceWeight = 256.0;
                        Minecraft.getMinecraft().effectRenderer.addEffect(entityDiggingFX);
                    }
                }
            }

        }
    }

    public static boolean isFlansWeapon(ItemStack itemStack) {
        return itemStack != null && itemStack.getItem() instanceof ItemGun;
    }

    public static boolean hasScope(ItemStack itemStack) {
        if (!Util.isFlansWeapon(itemStack)) {
            return false;
        }
        return ((ItemGun) itemStack.getItem()).type.getScope(itemStack) != null;
    }

    public static boolean isAiming(EntityPlayer entityPlayer) {
        return Util.isFlansWeapon(Minecraft.getMinecraft().thePlayer.getCurrentEquippedItem())
                && FlansModClient.currentScope != null;
    }

    public static boolean isAiming() {
        return isAiming(null);
    }

    @SideOnly(value = Side.CLIENT)
    public static boolean displayParticles() {
        int i = Integer.valueOf(Minecraft.getMinecraft().debug.split(" ")[0]);
        return i > 60;
    }
}
