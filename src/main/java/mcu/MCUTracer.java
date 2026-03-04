package mcu.utils;

import com.flansmod.common.guns.EntityBullet;
import mcu.entity.EntityCorpse;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockPane;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class MCUTracer {

    private static final float degToRad = 0.017453292F;
    private static final float BORDER_EXPAND_LENGTH = 0.2F;

    public static MCUTracer.BulletHitPosition trace(World w, Vec3 fromVec, float yaw, float pitch, float spread,
                                                    float maxLength, Entity entityToExclude, long seed) {
        Vec3 lookVec = createLookVec(yaw, pitch, spread, maxLength, seed);
        Vec3 toVec = Vec3.createVectorHelper(fromVec.xCoord + lookVec.xCoord, fromVec.yCoord + lookVec.yCoord,
                fromVec.zCoord + lookVec.zCoord);
        return trace(w, fromVec, toVec, entityToExclude);
    }

    public static MCUTracer.BulletHitPosition trace(World w, Vec3 fromVec, Vec3 toVec, Entity entityToExclude) {
        Vec3 fromVecCopy = Vec3.createVectorHelper(fromVec.xCoord, fromVec.yCoord, fromVec.zCoord);
        Vec3 toVecCopy = Vec3.createVectorHelper(toVec.xCoord, toVec.yCoord, toVec.zCoord);
        MovingObjectPosition collidingBlockMop = rayTrace(fromVecCopy, toVecCopy, true, true, true, w);
        MCUTracer.BulletHitPosition collidingBlock = null;
        if (collidingBlockMop != null) {
            collidingBlock = new MCUTracer.BulletHitPosition(collidingBlockMop.blockX, collidingBlockMop.blockY,
                    collidingBlockMop.blockZ, collidingBlockMop.sideHit, collidingBlockMop.hitVec);
        } else {
            collidingBlock = new MCUTracer.BulletHitPosition((int) toVec.xCoord, (int) toVec.yCoord, (int) toVec.zCoord,
                    -1, toVec);
        }

        Vec3 newToVec = collidingBlock.hitVec;
        HashMap collidingEntities = traceEntitiesSimple(w, fromVec, newToVec, entityToExclude);
        MCUTracer.BulletHitPosition hitPosition;
        if (collidingEntities.size() != 0) {
            hitPosition = getClosestEntity(collidingEntities, fromVec, toVec, collidingBlock);
        } else {
            hitPosition = collidingBlock;
        }

        return hitPosition;
    }

    private static HashMap traceEntitiesSimple(World w, Vec3 fromVec, Vec3 toVec, Entity entityToExclude) {
        AxisAlignedBB scannedAABB = AxisAlignedBB.getBoundingBox(Math.min(fromVec.xCoord, toVec.xCoord),
                Math.min(fromVec.yCoord, toVec.yCoord), Math.min(fromVec.zCoord, toVec.zCoord),
                Math.max(fromVec.xCoord, toVec.xCoord), Math.max(fromVec.yCoord, toVec.yCoord),
                Math.max(fromVec.zCoord, toVec.zCoord));
        List tracedEntities = w.getEntitiesWithinAABBExcludingEntity(entityToExclude, scannedAABB);
        HashMap collidingEntities = new HashMap();
        Iterator var7 = tracedEntities.iterator();

        while (var7.hasNext()) {
            Entity entity = (Entity) var7.next();
            if (entity.canBeCollidedWith() && (entityToExclude == null || entity != entityToExclude.ridingEntity)) {
                if (!(entity instanceof EntityCorpse)) {
                    AxisAlignedBB entityAABB = entity.boundingBox.expand(EntityBullet.HITBOX_EXTEND,
                            EntityBullet.HITBOX_EXTEND, EntityBullet.HITBOX_EXTEND);
                    if (entityAABB.isVecInside(fromVec)) {
                        collidingEntities.put(entity, fromVec);
                    } else {
                        MovingObjectPosition mop = entityAABB.calculateIntercept(fromVec, toVec);
                        if (mop != null) {
                            collidingEntities.put(entity, mop.hitVec);
                        }
                    }
                }
            }
        }

        return collidingEntities;
    }

    private static Vec3 createLookVec(float yaw, float pitch, float spread, float length, long seed) {
        float cosYaw = MathHelper.cos(-yaw * 0.017453292F - 3.1415927F);
        float sinYaw = MathHelper.sin(-yaw * 0.017453292F - 3.1415927F);
        float cosPitch = -MathHelper.cos(-pitch * 0.017453292F);
        float sinPitch = MathHelper.sin(-pitch * 0.017453292F);
        Vec3 lookVec = Vec3.createVectorHelper(sinYaw * cosPitch * length, sinPitch * length,
                cosYaw * cosPitch * length);

        return lookVec;
    }

    private static MCUTracer.BulletHitPosition getClosestEntity(HashMap entityToHitVecMap, Vec3 fromVec, Vec3 toVec,
                                                                MCUTracer.BulletHitPosition collidingBlock) {
        Entity closestEntity = null;
        Vec3 closestHitVec = null;
        double distanceSq = Double.MAX_VALUE;
        Iterator var8 = entityToHitVecMap.entrySet().iterator();

        while (var8.hasNext()) {
            Entry entry = (Entry) var8.next();
            double entryDistanceSq = fromVec.squareDistanceTo((Vec3) entry.getValue());
            if (entryDistanceSq < distanceSq) {
                closestEntity = (Entity) entry.getKey();
                closestHitVec = (Vec3) entry.getValue();
                distanceSq = entryDistanceSq;
            }
        }

        if (closestEntity != null) {
            return new MCUTracer.BulletHitPosition(closestEntity, closestHitVec);
        } else {
            return collidingBlock;
        }
    }

    public static MovingObjectPosition rayTrace(Vec3 p_147447_1_, Vec3 p_147447_2_, boolean p_147447_3_,
                                                boolean p_147447_4_, boolean p_147447_5_, World w) {
        if (!Double.isNaN(p_147447_1_.xCoord) && !Double.isNaN(p_147447_1_.yCoord)
                && !Double.isNaN(p_147447_1_.zCoord)) {
            if (!Double.isNaN(p_147447_2_.xCoord) && !Double.isNaN(p_147447_2_.yCoord)
                    && !Double.isNaN(p_147447_2_.zCoord)) {
                int i = MathHelper.floor_double(p_147447_2_.xCoord);
                int j = MathHelper.floor_double(p_147447_2_.yCoord);
                int k = MathHelper.floor_double(p_147447_2_.zCoord);
                int l = MathHelper.floor_double(p_147447_1_.xCoord);
                int i1 = MathHelper.floor_double(p_147447_1_.yCoord);
                int j1 = MathHelper.floor_double(p_147447_1_.zCoord);
                Block block = w.getBlock(l, i1, j1);
                int k1 = w.getBlockMetadata(l, i1, j1);

                if ((!p_147447_4_ || block.getCollisionBoundingBoxFromPool(w, l, i1, j1) != null)
                        && block.canCollideCheck(k1, p_147447_3_) && !shootable(block)) {
                    MovingObjectPosition movingobjectposition = block.collisionRayTrace(w, l, i1, j1, p_147447_1_,
                            p_147447_2_);

                    if (movingobjectposition != null) {
                        return movingobjectposition;
                    }
                }

                MovingObjectPosition movingobjectposition2 = null;
                k1 = 200;

                while (k1-- >= 0) {
                    if (Double.isNaN(p_147447_1_.xCoord) || Double.isNaN(p_147447_1_.yCoord)
                            || Double.isNaN(p_147447_1_.zCoord)) {
                        return null;
                    }

                    if (l == i && i1 == j && j1 == k) {
                        return p_147447_5_ ? movingobjectposition2 : null;
                    }

                    boolean flag6 = true;
                    boolean flag3 = true;
                    boolean flag4 = true;
                    double d0 = 999.0D;
                    double d1 = 999.0D;
                    double d2 = 999.0D;

                    if (i > l) {
                        d0 = (double) l + 1.0D;
                    } else if (i < l) {
                        d0 = (double) l + 0.0D;
                    } else {
                        flag6 = false;
                    }

                    if (j > i1) {
                        d1 = (double) i1 + 1.0D;
                    } else if (j < i1) {
                        d1 = (double) i1 + 0.0D;
                    } else {
                        flag3 = false;
                    }

                    if (k > j1) {
                        d2 = (double) j1 + 1.0D;
                    } else if (k < j1) {
                        d2 = (double) j1 + 0.0D;
                    } else {
                        flag4 = false;
                    }
                    double d3 = 999.0D;
                    double d4 = 999.0D;
                    double d5 = 999.0D;
                    double d6 = p_147447_2_.xCoord - p_147447_1_.xCoord;
                    double d7 = p_147447_2_.yCoord - p_147447_1_.yCoord;
                    double d8 = p_147447_2_.zCoord - p_147447_1_.zCoord;

                    if (flag6) {
                        d3 = (d0 - p_147447_1_.xCoord) / d6;
                    }

                    if (flag3) {
                        d4 = (d1 - p_147447_1_.yCoord) / d7;
                    }

                    if (flag4) {
                        d5 = (d2 - p_147447_1_.zCoord) / d8;
                    }

                    boolean flag5 = false;
                    byte b0;

                    if (d3 < d4 && d3 < d5) {
                        if (i > l) {
                            b0 = 4;
                        } else {
                            b0 = 5;
                        }

                        p_147447_1_.xCoord = d0;
                        p_147447_1_.yCoord += d7 * d3;
                        p_147447_1_.zCoord += d8 * d3;
                    } else if (d4 < d5) {
                        if (j > i1) {
                            b0 = 0;
                        } else {
                            b0 = 1;
                        }

                        p_147447_1_.xCoord += d6 * d4;
                        p_147447_1_.yCoord = d1;
                        p_147447_1_.zCoord += d8 * d4;
                    } else {
                        if (k > j1) {
                            b0 = 2;
                        } else {
                            b0 = 3;
                        }

                        p_147447_1_.xCoord += d6 * d5;
                        p_147447_1_.yCoord += d7 * d5;
                        p_147447_1_.zCoord = d2;
                    }

                    Vec3 vec32 = Vec3.createVectorHelper(p_147447_1_.xCoord, p_147447_1_.yCoord, p_147447_1_.zCoord);
                    l = (int) (vec32.xCoord = MathHelper.floor_double(p_147447_1_.xCoord));

                    if (b0 == 5) {
                        --l;
                        ++vec32.xCoord;
                    }

                    i1 = (int) (vec32.yCoord = MathHelper.floor_double(p_147447_1_.yCoord));

                    if (b0 == 1) {
                        --i1;
                        ++vec32.yCoord;
                    }

                    j1 = (int) (vec32.zCoord = MathHelper.floor_double(p_147447_1_.zCoord));

                    if (b0 == 3) {
                        --j1;
                        ++vec32.zCoord;
                    }

                    Block block1 = w.getBlock(l, i1, j1);
                    int l1 = w.getBlockMetadata(l, i1, j1);
                    if (!p_147447_4_ || block1.getCollisionBoundingBoxFromPool(w, l, i1, j1) != null) {
                        if (block1.canCollideCheck(l1, p_147447_3_) && !shootable(block1)) {
                            MovingObjectPosition movingobjectposition1 = block1.collisionRayTrace(w, l, i1, j1,
                                    p_147447_1_, p_147447_2_);
                            if (movingobjectposition1 != null) {
                                return movingobjectposition1;
                            }
                        } else {
                            movingobjectposition2 = new MovingObjectPosition(l, i1, j1, b0, p_147447_1_, false);
                        }
                    }
                }

                return p_147447_5_ ? movingobjectposition2 : null;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    public static boolean shootable(Block b) {
        return b instanceof BlockGlass || b instanceof BlockPane || b instanceof BlockFence;
    }

    public static class BulletHitPosition extends MovingObjectPosition {

        public float distance;

        public BulletHitPosition(int x, int y, int z, int sideHit, Vec3 hitVec) {
            super(x, y, z, sideHit, hitVec);
        }

        public BulletHitPosition(Entity entity, Vec3 hitVec) {
            super(entity);
            super.hitVec = hitVec;
        }

        public String toString() {
            return "tracer";
        }
    }
}
