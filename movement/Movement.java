package mcu.movement;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.FMLLaunchHandler;
import cpw.mods.fml.relauncher.Side;
import mcu.utils.SidedProtection;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityEvent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

@Mod(modid = "mcucustommovement")
public class Movement implements IEntitySelector {
    private static final Random rand;
    private static final List<AxisAlignedBB> list;
    public static int soundTimer;
    public static boolean CJS;
    public static List<Consumer<EntityPlayer>> stepSoundCallback;
    public static double offsetX;
    public static double offsetZ;
    public static float yOffset2;
    private static Movement instance;

    static {
        rand = new Random();
        list = new ArrayList<AxisAlignedBB>();
        Movement.stepSoundCallback = new ArrayList<>();
    }

    static boolean calcOffset(final Entity entity, final double n) {
        Movement.offsetX = entity.posX;
        Movement.offsetZ = entity.posZ;
        if (angularDistance(entity.rotationYaw, 0.0f) < 45.0f) {
            Movement.offsetZ = entity.boundingBox.maxZ + n;
        } else if (angularDistance(entity.rotationYaw, 90.0f) < 45.0f) {
            Movement.offsetX = entity.boundingBox.minX - n;
        } else if (angularDistance(entity.rotationYaw, 180.0f) < 45.0f) {
            Movement.offsetZ = entity.boundingBox.minZ - n;
        } else {
            if (angularDistance(entity.rotationYaw, 270.0f) >= 45.0f) {
                return false;
            }
            Movement.offsetX = entity.boundingBox.maxX + n;
        }
        return true;
    }

    public static boolean isPlayerCrawling(final EntityPlayer entityPlayer) {
        return entityPlayer.height <= 1.0f;
    }

    public static boolean togglePlayerCrawling(final EntityPlayer entityPlayer) {
        return togglePlayerCrawling(entityPlayer, false);
    }

    public static boolean togglePlayerCrawling(final EntityPlayer entityPlayer, final boolean b) {
        return togglePlayerCrawling(entityPlayer, b, false);
    }

    public static boolean togglePlayerCrawling(final EntityPlayer entityPlayer, final boolean b, final boolean b2) {
        if (entityPlayer.height > 1.0f) {
            entityPlayer.height = 0.8f;
            if (b) {
                final AxisAlignedBB boundingBox = entityPlayer.boundingBox;
                boundingBox.minY += 0.800000011920929;
                entityPlayer.posY += 0.800000011920929;
            }
        } else {
            if (!b2) {
                final AxisAlignedBB a = AxisAlignedBB.getBoundingBox(entityPlayer.boundingBox.minX,
                        entityPlayer.boundingBox.minY, entityPlayer.boundingBox.minZ, entityPlayer.boundingBox.maxX,
                        entityPlayer.boundingBox.minY, entityPlayer.boundingBox.maxZ);
                if (b) {
                    final AxisAlignedBB AxisAlignedBB = a;
                    AxisAlignedBB.minY -= 0.800000011920929;
                    final AxisAlignedBB AxisAlignedBB2 = a;
                    ++AxisAlignedBB2.maxY;
                } else {
                    final AxisAlignedBB AxisAlignedBB3 = a;
                    AxisAlignedBB3.maxY += 1.8;
                }
                if (!getCollidingBoundingBoxes(entityPlayer, a).isEmpty()) {
                    return false;
                }
            }
            entityPlayer.height = 1.8f;
            if (b) {
                final AxisAlignedBB boundingBox2 = entityPlayer.boundingBox;
                boundingBox2.minY -= 0.800000011920929;
                entityPlayer.posY -= 0.800000011920929;
            }
        }
        entityPlayer.boundingBox.maxY = entityPlayer.boundingBox.minY + entityPlayer.height;
        if (entityPlayer instanceof EntityPlayerMP) {
            entityPlayer.eyeHeight = 1.62f;
            final boolean b3 = entityPlayer.height <= 1.0f;
            if (b3) {
                entityPlayer.eyeHeight = 0.625f;
            }
            entityPlayer.getDataWatcher().updateObject(24, (b3 ? 1 : 0));
        }
        return true;
    }

    public static boolean canClimb(final Entity entity, final double n) {
        if (!calcOffset(entity, n)) {
            return false;
        }
        final MovingObjectPosition func_72831_a = entity.worldObj.func_147447_a(
                Vec3.createVectorHelper(entity.posX, entity.boundingBox.maxY, entity.posZ),
                Vec3.createVectorHelper(Movement.offsetX, entity.boundingBox.maxY, Movement.offsetZ), false, true,
                true);
        if (func_72831_a != null) {
            Movement.offsetX = func_72831_a.hitVec.xCoord;
            Movement.offsetZ = func_72831_a.hitVec.zCoord;
        }
        return !getCollidingBoundingBoxes(entity,
                AxisAlignedBB.getBoundingBox(Math.min(Movement.offsetX, entity.posX), entity.boundingBox.minY,
                        Math.min(Movement.offsetZ, entity.posZ), Math.max(Movement.offsetX, entity.posX),
                        entity.boundingBox.maxY, Math.max(Movement.offsetZ, entity.posZ))).isEmpty();
    }

    public static void movePlayer(final EntityPlayer entityPlayer, final MovementData movementData, float n, float n2,
                                  final boolean b, final float n3) {
        if (!SidedProtection.CLIENT)
            return;
        float n4 = 1.0f;
        if (Math.abs(entityPlayer.motionX) < 0.005) {
            entityPlayer.motionX = 0.0;
        }
        if (Math.abs(entityPlayer.motionY) < 0.005) {
            entityPlayer.motionY = 0.0;
        }
        if (Math.abs(entityPlayer.motionZ) < 0.005) {
            entityPlayer.motionZ = 0.0;
        }
        final double posX = entityPlayer.posX;
        final double posY = entityPlayer.posY;
        final double posZ = entityPlayer.posZ;
        if (n2 > 0.0f) {
            n2 = 1.25f;
        } else if (n2 < 0.0f) {
            n2 = -0.875f;
        }
        if (n > 0.0f) {
            n = 1.0f;
        }
        if (n < 0.0f) {
            n = -1.0f;
        }
        final boolean handleWaterMovement = entityPlayer.handleWaterMovement();
        if (!entityPlayer.capabilities.isCreativeMode && !handleWaterMovement && entityPlayer.motionY == 0.0) {
            entityPlayer.motionY = -0.0784000015258789;
        }
        final boolean b2 = entityPlayer.isSneaking() && !handleWaterMovement
                && !entityPlayer.capabilities.isCreativeMode;
        if (b2) {
            n *= 0.333f;
            n2 *= ((n2 > 1.0f) ? ((n == 0.0f) ? 0.5f : 0.333f) : 0.25f);
            if (n2 > 0.0f) {
                n4 = 1.5f;
            } else if (n != 0.0f) {
                n4 = 1.25f;
            }
        }
        final boolean playerCrawling = isPlayerCrawling(entityPlayer);
        if (entityPlayer.isPotionActive(Potion.moveSlowdown.id)) {
            entityPlayer.setSprinting(false);
            movementData.modSprinting(0.0f);
        } else {
            float modSprinting = movementData.modSprinting();
            if (entityPlayer.isSprinting()
                    && (handleWaterMovement || entityPlayer.capabilities.isCreativeMode || !playerCrawling) && !b2
                    && !b) {
                if (n != 0.0f) {
                    if ((modSprinting -= 0.07f) < 0.0f) {
                        modSprinting = 0.0f;
                    }
                } else if ((entityPlayer.onGround || entityPlayer.capabilities.isCreativeMode || handleWaterMovement)
                        && (modSprinting += 0.07f) > 1.0f) {
                    modSprinting = 1.0f;
                }
                if (n3 > 0.0f) {
                    modSprinting /= Math.max(1.0f, angularDistance(n3, entityPlayer.rotationYaw) / 10.0f);
                }
            } else if ((modSprinting -= (entityPlayer.isCollidedHorizontally ? 0.07f : 0.25f)) < 0.0f) {
                modSprinting = 0.0f;
            }
            movementData.modSprinting(modSprinting);
        }
        if (entityPlayer.capabilities.isCreativeMode && entityPlayer.ridingEntity == null) {
            final double motionY = entityPlayer.motionY;
            final float jumpMovementFactor = entityPlayer.jumpMovementFactor;
            entityPlayer.jumpMovementFactor = entityPlayer.capabilities.getWalkSpeed();
            if (b) {
                entityPlayer.motionY += entityPlayer.jumpMovementFactor * 10.0f;
            }
            if (entityPlayer.isSneaking()) {
                entityPlayer.motionY -= entityPlayer.jumpMovementFactor * 10.0f;
            }
            entityPlayer.jumpMovementFactor *= 1.0f + movementData.modSprinting();
            calculateMotion(entityPlayer, movementData, n, n2, b, n4);
            entityPlayer.motionY = motionY * 0.6;
            entityPlayer.jumpMovementFactor = jumpMovementFactor;
        } else {
            if (entityPlayer.onGround && b && (!playerCrawling || !handleWaterMovement)) {
                entityPlayer.motionY = 0.41999998688697815;
                if (entityPlayer.isPotionActive(Potion.jump)) {
                    entityPlayer.motionY += (entityPlayer.getActivePotionEffect(Potion.jump).getAmplifier() + 1) * 0.1f;
                }
                entityPlayer.isAirBorne = true;
                ForgeHooks.onLivingJump(entityPlayer);
                if (Movement.CJS) {
                    entityPlayer.playSound("mob.chicken.say", 1.0f, 1.1f + Movement.rand.nextFloat() * 0.1f);
                }
            }
            calculateMotion(entityPlayer, movementData, n, n2, b, n4);
        }
        entityPlayer.addMovementStat(entityPlayer.posX - posX, entityPlayer.posY - posY, entityPlayer.posZ - posZ);
    }

    private static void calculateMotion(final EntityPlayer entityPlayer, final MovementData movementData, final float n,
                                        final float n2, final boolean b, final float n3) {
        final AxisAlignedBB copy = entityPlayer.boundingBox.copy();
        if (entityPlayer.isInWater()) {
            float n4 = 0.015f;
            copy.minY = copy.maxY - 0.7;
            if (entityPlayer.worldObj.isAABBInMaterial(copy, Material.water)) {
                n4 = 0.03f;
                if (!isPlayerCrawling(entityPlayer)) {
                    togglePlayerCrawling(entityPlayer, true);
                }
                if (b) {
                    copy.minY = copy.maxY - 0.2;
                    if (entityPlayer.worldObj.isAABBInMaterial(copy, Material.water)) {
                        entityPlayer.motionY += 0.02;
                    }
                } else if (entityPlayer.isSneaking()) {
                    entityPlayer.motionY -= 0.02;
                } else if (!entityPlayer.isSprinting()) {
                    copy.minY = copy.maxY - 0.3;
                    if (entityPlayer.worldObj.isAABBInMaterial(copy, Material.water)) {
                        entityPlayer.motionY += 0.005;
                    }
                }
            } else {
                entityPlayer.motionY -= 0.05;
            }
            calculateDirection(entityPlayer, n, n2, n4 + n4 / 3.0f * movementData.modSprinting());
            climbMove(entityPlayer, movementData, n2, isPlayerCrawling(entityPlayer), b, n3);
            entityPlayer.motionX *= 0.800000011920929;
            entityPlayer.motionY *= 0.700000011920929;
            entityPlayer.motionZ *= 0.800000011920929;
            if (isPlayerCrawling(entityPlayer)) {
                copy.minY = copy.maxY - 0.15;
                if (!entityPlayer.worldObj.isAABBInMaterial(copy, Material.water)) {
                    copy.minY = copy.maxY - 1.8;
                    entityPlayer.onGround = !getCollidingBoundingBoxes(entityPlayer, copy).isEmpty();
                } else {
                    entityPlayer.onGround = false;
                }
            }
        } else if (entityPlayer.handleLavaMovement() && !entityPlayer.capabilities.isCreativeMode) {
            final double posY = entityPlayer.posY;
            calculateDirection(entityPlayer, n, n2, 0.02f);
            moveEntity(entityPlayer, movementData, entityPlayer.motionX, entityPlayer.motionY, entityPlayer.motionZ,
                    n3);
            entityPlayer.motionX *= 0.5;
            entityPlayer.motionY *= 0.5;
            entityPlayer.motionZ *= 0.5;
            entityPlayer.motionY -= 0.02;
            if (entityPlayer.isCollidedHorizontally && entityPlayer.isOffsetPositionInLiquid(entityPlayer.motionX,
                    entityPlayer.motionY + 0.6000000238418579 - entityPlayer.posY + posY, entityPlayer.motionZ)) {
                entityPlayer.motionY = 0.30000001192092896;
            }
        } else {
            float n5 = 0.91f;
            if (entityPlayer.onGround) {
                n5 = 0.54600006f;
            }
            final float n6 = 0.16277136f / (n5 * n5 * n5);
            final boolean playerCrawling = isPlayerCrawling(entityPlayer);
            float jumpMovementFactor;
            if (entityPlayer.onGround) {
                float getAIMoveSpeed = entityPlayer.getAIMoveSpeed();
                if (entityPlayer.isSprinting()) {
                    getAIMoveSpeed /= (float) 1.300000011920929;
                }
                float n7 = getAIMoveSpeed * (1.0f + movementData.modSprinting() * 0.33333334f);
                if (playerCrawling) {
                    n7 *= 0.25f;
                }
                jumpMovementFactor = n7 * n6;
            } else {
                jumpMovementFactor = entityPlayer.jumpMovementFactor;
                if (b) {
                    jumpMovementFactor += 0.2f * movementData.modSprinting();
                }
            }
            calculateDirection(entityPlayer, n, n2, jumpMovementFactor);
            float n8 = 0.91f;
            if (entityPlayer.onGround) {
                n8 = 0.54600006f;
            }
            climbMove(entityPlayer, movementData, n2, playerCrawling, b, n3);
            entityPlayer.motionY -= 0.08;
            entityPlayer.motionY *= 0.9800000190734863;
            entityPlayer.motionX *= n8;
            entityPlayer.motionZ *= n8;
        }
        entityPlayer.prevLimbSwingAmount = entityPlayer.limbSwingAmount;
        final double n9 = entityPlayer.posX - entityPlayer.prevPosX;
        final double n10 = entityPlayer.posZ - entityPlayer.prevPosZ;
        float n11 = (float) Math.sqrt(n9 * n9 + n10 * n10) * 4.0f;
        if (n11 > 1.0f) {
            n11 = 1.0f;
        }
        entityPlayer.limbSwingAmount += (n11 - entityPlayer.limbSwingAmount) * 0.4f;
        entityPlayer.limbSwing += entityPlayer.limbSwingAmount;
    }

    private static void climbMove(final EntityPlayer entityPlayer, final MovementData movementData, final float n,
                                  final boolean b, final boolean b2, final float n2) {
        final boolean b3 = n > 0.0f && canClimb(entityPlayer, 1.0);
        if (entityPlayer.isOnLadder()) {
            if (entityPlayer.motionX < -0.20000000298023224) {
                entityPlayer.motionX = -0.20000000298023224;
            }
            if (entityPlayer.motionX > 0.20000000298023224) {
                entityPlayer.motionX = 0.20000000298023224;
            }
            if (entityPlayer.motionZ < -0.20000000298023224) {
                entityPlayer.motionZ = -0.20000000298023224;
            }
            if (entityPlayer.motionZ > 0.20000000298023224) {
                entityPlayer.motionZ = 0.20000000298023224;
            }
            entityPlayer.fallDistance = 0.0f;
            if (entityPlayer.motionY < -0.25) {
                entityPlayer.motionY = -0.25;
            }
            if (entityPlayer.isSneaking() && entityPlayer.motionY < 0.0) {
                entityPlayer.motionY = 0.0;
            }
        } else if (b3) {
            if (entityPlayer.isSneaking()) {
                if (entityPlayer.motionX < -0.15000000596046448) {
                    entityPlayer.motionX = -0.15000000596046448;
                }
                if (entityPlayer.motionX > 0.15000000596046448) {
                    entityPlayer.motionX = 0.15000000596046448;
                }
                if (entityPlayer.motionZ < -0.15000000596046448) {
                    entityPlayer.motionZ = -0.15000000596046448;
                }
                if (entityPlayer.motionZ > 0.15000000596046448) {
                    entityPlayer.motionZ = 0.15000000596046448;
                }
                if (entityPlayer.motionY < 0.0) {
                    entityPlayer.motionY = 0.0;
                }
            }
            entityPlayer.fallDistance = 0.0f;
            if (entityPlayer.motionY < -0.2) {
                entityPlayer.motionY = -0.2;
            }
        }
        if (!entityPlayer.onGround && b && entityPlayer.motionY < -0.2 && togglePlayerCrawling(entityPlayer, true)) {
            yOffset2 = 0.0f;
        }
        moveEntity(entityPlayer, movementData, entityPlayer.motionX, entityPlayer.motionY, entityPlayer.motionZ, n2);
        final boolean b4 = n > 0.0f && canClimb(entityPlayer, 0.5);
        final boolean b5 = entityPlayer.isCollidedHorizontally && entityPlayer.isOnLadder();
        if (b5 || (b4 && b2)) {
            entityPlayer.motionY = 0.2;
            if (b5) {
                entityPlayer.motionY = 0.35;
            } else if (calcOffset(entityPlayer, 0.5) && entityPlayer.worldObj.func_147447_a(
                    Vec3.createVectorHelper(Movement.offsetX, entityPlayer.boundingBox.maxY, Movement.offsetZ),
                    Vec3.createVectorHelper(Movement.offsetX, entityPlayer.boundingBox.maxY - 1.0, Movement.offsetZ),
                    false, true, true) == null) {
                entityPlayer.motionY = 0.35;
            }
        }
    }

    private static void calculateDirection(final Entity entity, float n, float n2, final float n3) {
        final float n4 = n * n + n2 * n2;
        if (n4 >= 1.0E-4f) {
            float n5 = (float) Math.sqrt(n4);
            if (n5 < 1.0f) {
                n5 = 1.0f;
            }
            final float n6 = n3 / n5;
            n *= n6;
            n2 *= n6;
            final double sin = Math.sin(entity.rotationYaw * 3.141592653589793 / 180.0);
            final double cos = Math.cos(entity.rotationYaw * 3.141592653589793 / 180.0);
            entity.motionX += n * cos - n2 * sin;
            entity.motionZ += n2 * cos + n * sin;
        }
    }

    private static void moveEntity(final EntityPlayer entityPlayer, final MovementData movementData, double n,
                                   double n2, double n3, final float n4) {
        if (!SidedProtection.CLIENT)
            return;
        if (entityPlayer.noClip) {
            entityPlayer.boundingBox.offset(n, n2, n3);
            entityPlayer.posX = (entityPlayer.boundingBox.minX + entityPlayer.boundingBox.maxX) / 2.0;
            entityPlayer.posY = entityPlayer.boundingBox.minY + entityPlayer.yOffset - yOffset2;
            entityPlayer.posZ = (entityPlayer.boundingBox.minZ + entityPlayer.boundingBox.maxZ) / 2.0;
        } else {
            final double posX = entityPlayer.posX;
            final double posY = entityPlayer.posY;
            final double posZ = entityPlayer.posZ;
            if (yOffset2 * 0.4f < 0.249f) {
                yOffset2 *= 0.4f;
            } else {
                yOffset2 -= 0.249f;
            }
            if (yOffset2 < 0.0f) {
                yOffset2 = 0.0f;
            }
            final double n5 = n;
            double n6 = n2;
            double n7 = n3;
            final AxisAlignedBB copy = entityPlayer.boundingBox.copy();
            List<AxisAlignedBB> list = getCollidingBoundingBoxes(entityPlayer,
                    entityPlayer.boundingBox.addCoord(n, n2, n3));
            final Iterator<AxisAlignedBB> iterator = list.iterator();
            while (iterator.hasNext()) {
                n2 = iterator.next().calculateYOffset(entityPlayer.boundingBox, n2);
            }
            entityPlayer.boundingBox.offset(0.0, n2, 0.0);
            final boolean b = (n6 != n2 && n6 < 0.0) || entityPlayer.isInWater();
            List<AxisAlignedBB> list2;
            if (b) {
                list2 = Movement.list;
                final AxisAlignedBB addCoord = entityPlayer.boundingBox.addCoord(n, 0.0, n3);
                for (final AxisAlignedBB AxisAlignedBB : list) {
                    if (addCoord.intersectsWith(AxisAlignedBB)) {
                        list2.add(AxisAlignedBB);
                    }
                }
            } else {
                list2 = list;
            }
            final Iterator<AxisAlignedBB> iterator3 = list2.iterator();
            while (iterator3.hasNext()) {
                n = iterator3.next().calculateXOffset(entityPlayer.boundingBox, n);
            }
            if (n != 0.0) {
                entityPlayer.boundingBox.offset(n, 0.0, 0.0);
            }
            final Iterator<AxisAlignedBB> iterator4 = list2.iterator();
            while (iterator4.hasNext()) {
                n3 = iterator4.next().calculateZOffset(entityPlayer.boundingBox, n3);
            }
            if (list2 == Movement.list) {
                list2.clear();
            } else {
                list2 = Movement.list;
            }
            if (n3 != 0.0) {
                entityPlayer.boundingBox.offset(0.0, 0.0, n3);
            }
            boolean b2 = false;
            if ((entityPlayer.onGround || b) && (n5 != n || n7 != n3)) {
                final double n8 = n;
                final double n9 = n2;
                final double n10 = n3;
                n = n5;
                n3 = n7;
                final AxisAlignedBB copy2 = entityPlayer.boundingBox.copy();
                entityPlayer.boundingBox.setBB(copy);
                entityPlayer.boundingBox.addCoord(n, 0.0, n3);
                list = getCollidingBoundingBoxes(entityPlayer, entityPlayer.boundingBox.addCoord(n, 1.0, n3));
                entityPlayer.boundingBox.offset(0.0, 1.0, 0.0);
                final AxisAlignedBB addCoord2 = entityPlayer.boundingBox.addCoord(n, 0.0, n3);
                for (final AxisAlignedBB AxisAlignedBB2 : list) {
                    if (addCoord2.intersectsWith(AxisAlignedBB2)) {
                        list2.add(AxisAlignedBB2);
                    }
                }
                final Iterator<AxisAlignedBB> iterator6 = list2.iterator();
                while (iterator6.hasNext()) {
                    n = iterator6.next().calculateXOffset(entityPlayer.boundingBox, n);
                }
                entityPlayer.boundingBox.offset(n, 0.0, 0.0);
                final Iterator<AxisAlignedBB> iterator7 = list2.iterator();
                while (iterator7.hasNext()) {
                    n3 = iterator7.next().calculateZOffset(entityPlayer.boundingBox, n3);
                }
                entityPlayer.boundingBox.offset(0.0, 0.0, n3);
                list2.clear();
                n2 = -1.0;
                final Iterator<AxisAlignedBB> iterator8 = list.iterator();
                while (iterator8.hasNext()) {
                    n2 = iterator8.next().calculateYOffset(entityPlayer.boundingBox, n2);
                }
                entityPlayer.boundingBox.offset(0.0, n2, 0.0);
                boolean b3 = false;
                final Iterator<AxisAlignedBB> iterator9 = list.iterator();
                while (iterator9.hasNext()) {
                    if (entityPlayer.boundingBox.intersectsWith(iterator9.next())) {
                        b3 = true;
                        break;
                    }
                }
                if (b3 || n8 * n8 + n10 * n10 >= n * n + n3 * n3) {
                    n = n8;
                    n2 = n9;
                    n3 = n10;
                    entityPlayer.boundingBox.setBB(copy2);
                    b2 = true;
                }
            }
            if (b2) {
                final double n11 = n;
                final double n12 = n2;
                final double n13 = n3;
                n = n5;
                n2 = 1.0;
                n3 = n7;
                final AxisAlignedBB copy3 = entityPlayer.boundingBox.copy();
                entityPlayer.boundingBox.setBB(copy);
                final AxisAlignedBB addCoord3 = entityPlayer.boundingBox.addCoord(n, 0.0, n3);
                final Iterator<AxisAlignedBB> iterator10 = list.iterator();
                while (iterator10.hasNext()) {
                    n2 = iterator10.next().calculateYOffset(addCoord3, n2);
                }
                entityPlayer.boundingBox.offset(0.0, n2, 0.0);
                final AxisAlignedBB addCoord4 = entityPlayer.boundingBox.addCoord(n, 0.0, n3);
                for (final AxisAlignedBB AxisAlignedBB3 : list) {
                    if (addCoord4.intersectsWith(AxisAlignedBB3)) {
                        list2.add(AxisAlignedBB3);
                    }
                }
                final Iterator<AxisAlignedBB> iterator12 = list2.iterator();
                while (iterator12.hasNext()) {
                    n = iterator12.next().calculateXOffset(entityPlayer.boundingBox, n);
                }
                entityPlayer.boundingBox.offset(n, 0.0, 0.0);
                final Iterator<AxisAlignedBB> iterator13 = list2.iterator();
                while (iterator13.hasNext()) {
                    n3 = iterator13.next().calculateZOffset(entityPlayer.boundingBox, n3);
                }
                entityPlayer.boundingBox.offset(0.0, 0.0, n3);
                list2.clear();
                n2 = -n2;
                final Iterator<AxisAlignedBB> iterator14 = list.iterator();
                while (iterator14.hasNext()) {
                    n2 = iterator14.next().calculateYOffset(entityPlayer.boundingBox, n2);
                }
                entityPlayer.boundingBox.offset(0.0, n2, 0.0);
                if (n11 * n11 + n13 * n13 >= n * n + n3 * n3) {
                    n = n11;
                    n2 = n12;
                    n3 = n13;
                    entityPlayer.boundingBox.setBB(copy3);
                }
            }
            entityPlayer.posX = (entityPlayer.boundingBox.minX + entityPlayer.boundingBox.maxX) / 2.0;
            entityPlayer.posY = entityPlayer.boundingBox.minY + entityPlayer.yOffset - yOffset2;
            entityPlayer.posZ = (entityPlayer.boundingBox.minZ + entityPlayer.boundingBox.maxZ) / 2.0;
            entityPlayer.isCollidedHorizontally = (n5 != n || n7 != n3);
            entityPlayer.isCollidedVertically = (n6 != n2);
            entityPlayer.onGround = (n6 != n2 && n6 < 0.0);
            entityPlayer.isCollided = (entityPlayer.isCollidedHorizontally || entityPlayer.isCollidedVertically);
            if (entityPlayer.onGround) {
                if (entityPlayer.fallDistance > 0.0f) {
                    if (entityPlayer.fallDistance > 1.0f) {
                    }
                    if (!entityPlayer.worldObj.isRemote) {
                        final float onLivingFall = ForgeHooks.onLivingFall(entityPlayer, entityPlayer.fallDistance);
                        if (onLivingFall <= 0.0f) {
                            return;
                        }
                        final PotionEffect getActivePotionEffect = entityPlayer.getActivePotionEffect(Potion.jump);
                        final int f = MathHelper.ceiling_float_int(onLivingFall - 3.0f
                                - ((getActivePotionEffect != null)
                                ? ((float) (getActivePotionEffect.getAmplifier() + 1))
                                : 0.0f));
                        if (f > 0) {
                            if (f > 4) {
                                entityPlayer.playSound("damage.fallbig", 1.0f, 1.0f);
                            } else {
                                entityPlayer.playSound("damage.fallsmall", 1.0f, 1.0f);
                            }
                            entityPlayer.attackEntityFrom(DamageSource.fall, (float) f);
                        }
                    }
                    entityPlayer.fallDistance = 0.0f;
                }
            } else if (n2 < 0.0) {
                entityPlayer.fallDistance -= (float) n2;
            }
            if (n5 != n) {
                entityPlayer.motionX = 0.0;
            }
            if (n6 != n2) {
                entityPlayer.motionY = 0.0;
            }
            if (n7 != n3) {
                entityPlayer.motionZ = 0.0;
            }
            final double n14 = entityPlayer.posX - posX;
            double n15 = entityPlayer.posY - posY;
            final double n16 = entityPlayer.posZ - posZ;
            if (!entityPlayer.capabilities.isCreativeMode && entityPlayer.ridingEntity == null) {
                final int c = MathHelper.floor_double(entityPlayer.posX);
                final int c2 = MathHelper.floor_double(entityPlayer.posY - 0.20000000298023224 - entityPlayer.yOffset);
                final int c3 = MathHelper.floor_double(entityPlayer.posZ);
                entityPlayer.distanceWalkedModified += (float) (MathHelper.sqrt_double(n14 * n14 + n16 * n16) * 0.6);
                entityPlayer.distanceWalkedOnStepModified += (float) (MathHelper
                        .sqrt_double(n14 * n14 + n15 * n15 + n16 * n16) * 0.6);
                int m1, m2;
                int n8 = MathHelper.floor_double(entityPlayer.posX);
                Block n9 = Movement.getBlockStanding(entityPlayer.worldObj, n8,
                        m1 = MathHelper.floor_double(entityPlayer.posY - (double) 0.2f - (double) entityPlayer.yOffset),
                        m2 = MathHelper.floor_double(entityPlayer.posZ));
                if (entityPlayer.distanceWalkedOnStepModified > movementData.nextStepDistance() && n9 != Blocks.air) {
                    if (entityPlayer.isInWater()) {
                        entityPlayer.playSound("liquid.swim", 0.25f,
                                1.0f + (rand.nextFloat() - rand.nextFloat()) * 0.2f);
                        movementData.nextStepDistance(entityPlayer.distanceWalkedOnStepModified + 0.5f);
                    } else {
                        float f4 = 0;
                        float f5 = 0;
                        boolean bl6;
                        n = Movement.isPlayerCrawling(entityPlayer) ? 1 : 0;
                        boolean bl7 = entityPlayer.isSneaking();
                        boolean bl8 = movementData.modSprinting() > 0.0f;
                        boolean bl9 = bl6 = movementData.modSprinting() >= 1.0f;
                        float f6 = bl6 ? 0.9f
                                : (bl8 ? 0.5f : (n != 0 && bl7 ? 0.1f : (n != 0 ? 0.2f : (f5 = bl7 ? 0.15f : 0.35f))));
                        float f7 = bl6 ? 1.0f
                                : (bl8 ? 0.9f : (n != 0 && bl7 ? 0.2f : (n != 0 ? 0.3f : (f4 = bl7 ? -0.65f : 0.85f))));
                        if (f4 == -0.65f) {
                            f4 *= -n4;
                        }
                        float f8 = Movement.isPlayerCrawling(entityPlayer) ? 0.1f : 1.0f;
                        movementData.nextStepDistance(entityPlayer.distanceWalkedOnStepModified + f4);
                        Block.SoundType stepSound = n9.stepSound;
                        if (soundTimer == 0) {
                            if (entityPlayer.worldObj.getBlock(n8, m1, m2) == Blocks.snow) {
                                stepSound = Blocks.snow.stepSound;
                                soundTimer = 5;
                                entityPlayer.playSound(stepSound.getStepResourcePath(), stepSound.getVolume() * 0.5F,
                                        stepSound.getPitch() * 0.75F);
                            } else if (!n9.getMaterial().isLiquid()) {
                                entityPlayer.playSound(stepSound.getStepResourcePath(), stepSound.getVolume() * 0.5F,
                                        stepSound.getPitch() * 0.75F);
                                soundTimer = 5;
                            }
                        }
                        n9.onEntityWalking(entityPlayer.worldObj, n8, m1, m2, entityPlayer);
                    }
                }
            }
            try {
                doBlockCollisions(entityPlayer);
            } catch (Throwable t) {
            }
            if (!entityPlayer.worldObj.isRemote) {
            }
        }
    }

    public static Block getBlockStanding(World world, int n, int n2, int n3) {
        Block n4 = world.getBlock(n, n2, n3);
        if (n4 == Blocks.air && (n4 = world.getBlock(n - 1, n2, n3)) == Blocks.air
                && (n4 = world.getBlock(n + 1, n2, n3)) == Blocks.air
                && (n4 = world.getBlock(n, n2, n3 - 1)) == Blocks.air
                && (n4 = world.getBlock(n, n2, n3 + 1)) == Blocks.air
                && (n4 = world.getBlock(n - 1, n2, n3 - 1)) == Blocks.air
                && (n4 = world.getBlock(n + 1, n2, n3 - 1)) == Blocks.air
                && (n4 = world.getBlock(n - 1, n2, n3 + 1)) == Blocks.air) {
            n4 = world.getBlock(n + 1, n2, n3 + 1);
        }
        return n4;
    }

    private static void doBlockCollisions(Entity entity) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = MathHelper.floor_double(entity.boundingBox.minX + 0.001);
        if (entity.worldObj.checkChunksExist(n6, n5 = MathHelper.floor_double(entity.boundingBox.minY + 0.001),
                n4 = MathHelper.floor_double(entity.boundingBox.minZ + 0.001),
                n3 = MathHelper.floor_double(entity.boundingBox.maxX - 0.001),
                n2 = MathHelper.floor_double(entity.boundingBox.maxY - 0.001),
                n = MathHelper.floor_double(entity.boundingBox.maxZ - 0.001))) {
            for (int i = n6; i <= n3; ++i) {
                for (int j = n5; j <= n2; ++j) {
                    for (int k = n4; k <= n; ++k) {
                        Block n7 = entity.worldObj.getBlock(i, j, k);
                        if (n7 == Blocks.air)
                            continue;
                        try {
                            n7.onEntityCollidedWithBlock(entity.worldObj, i, j, k, entity);
                            continue;
                        } catch (Throwable throwable) {
                        }
                    }
                }
            }
        }
    }

    private static List<AxisAlignedBB> getCollidingBoundingBoxes(final Entity entity,
                                                                 final AxisAlignedBB AxisAlignedBB) {
        final List func_72840_a = entity.worldObj.func_147461_a(AxisAlignedBB);
        for (final Entity next : (ArrayList<Entity>) entity.worldObj.getEntitiesWithinAABBExcludingEntity(entity,
                AxisAlignedBB.expand(0.25, 0.25, 0.25), Movement.instance)) {
            final AxisAlignedBB getBoundingBox = next.getBoundingBox();
            if (getBoundingBox != null && getBoundingBox.intersectsWith(AxisAlignedBB)) {
                func_72840_a.add(getBoundingBox);
            }
            final AxisAlignedBB getCollisionBox = entity.getCollisionBox(next);
            if (getCollisionBox != null && getCollisionBox.intersectsWith(AxisAlignedBB)) {
                func_72840_a.add(getCollisionBox);
            }
        }
        return (List<AxisAlignedBB>) func_72840_a;
    }

    private static float angularDistance(final float n, final float n2) {
        final float n3 = Math.abs(n2 - n) % 360.0f;
        return (n3 > 180.0f) ? (360.0f - n3) : n3;
    }

    @Mod.EventHandler
    public void enable(final FMLInitializationEvent fmlInitializationEvent) {
        if (FMLLaunchHandler.side() == Side.CLIENT) {
            MovementClient.init();
        }
        MinecraftForge.EVENT_BUS.register(this);
        Movement.instance = this;
    }

    @SubscribeEvent
    public void pc(final EntityEvent.EntityConstructing entityConstructing) {
        if (entityConstructing.entity instanceof EntityPlayer) {
            entityConstructing.entity.getDataWatcher().addObject(24, 0);
        }
    }

    @Override
    public boolean isEntityApplicable(final Entity entity) {
        return entity.isEntityAlive();
    }
}
