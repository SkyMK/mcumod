package com.flansmod.common.guns.raytracing;

import com.flansmod.common.RotatedAxes;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.vector.Vector3f;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class PlayerHitbox {
    public EntityPlayer player;
    public RotatedAxes axes;
    public Vector3f rP;
    public Vector3f o;
    public Vector3f d;
    public EnumHitboxType type;

    public PlayerHitbox(EntityPlayer player, RotatedAxes axes, Vector3f rotationPoint, Vector3f origin,
                        Vector3f dimensions, EnumHitboxType type) {
        this.player = player;
        this.axes = axes;
        this.o = origin;
        this.d = dimensions;
        this.type = type;
        this.rP = rotationPoint;
    }

    @SideOnly(Side.CLIENT)
    public void renderHitbox(World world, Vector3f pos) {
    }

    public PlayerBulletHit raytrace(Vector3f origin, Vector3f motion) {
        origin = Vector3f.sub(origin, this.rP, null);
        origin = this.axes.findGlobalVectorLocally(origin);
        motion = this.axes.findGlobalVectorLocally(motion);
        float intersectTime;
        float intersectX;
        float intersectZ;
        if (motion.x != 0.0F) {
            if (origin.x < this.o.x) {
                intersectTime = (this.o.x - origin.x) / motion.x;
                intersectX = origin.y + motion.y * intersectTime;
                intersectZ = origin.z + motion.z * intersectTime;
                if (intersectX >= this.o.y && intersectX <= this.o.y + this.d.y && intersectZ >= this.o.z
                        && intersectZ <= this.o.z + this.d.z) {
                    return new PlayerBulletHit(this, intersectTime);
                }
            } else if (origin.x > this.o.x + this.d.x) {
                intersectTime = (this.o.x + this.d.x - origin.x) / motion.x;
                intersectX = origin.y + motion.y * intersectTime;
                intersectZ = origin.z + motion.z * intersectTime;
                if (intersectX >= this.o.y && intersectX <= this.o.y + this.d.y && intersectZ >= this.o.z
                        && intersectZ <= this.o.z + this.d.z) {
                    return new PlayerBulletHit(this, intersectTime);
                }
            }
        }

        if (motion.z != 0.0F) {
            if (origin.z < this.o.z) {
                intersectTime = (this.o.z - origin.z) / motion.z;
                intersectX = origin.x + motion.x * intersectTime;
                intersectZ = origin.y + motion.y * intersectTime;
                if (intersectX >= this.o.x && intersectX <= this.o.x + this.d.x && intersectZ >= this.o.y
                        && intersectZ <= this.o.y + this.d.y) {
                    return new PlayerBulletHit(this, intersectTime);
                }
            } else if (origin.z > this.o.z + this.d.z) {
                intersectTime = (this.o.z + this.d.z - origin.z) / motion.z;
                intersectX = origin.x + motion.x * intersectTime;
                intersectZ = origin.y + motion.y * intersectTime;
                if (intersectX >= this.o.x && intersectX <= this.o.x + this.d.x && intersectZ >= this.o.y
                        && intersectZ <= this.o.y + this.d.y) {
                    return new PlayerBulletHit(this, intersectTime);
                }
            }
        }

        if (motion.y != 0.0F) {
            if (origin.y < this.o.y) {
                intersectTime = (this.o.y - origin.y) / motion.y;
                intersectX = origin.x + motion.x * intersectTime;
                intersectZ = origin.z + motion.z * intersectTime;
                if (intersectX >= this.o.x && intersectX <= this.o.x + this.d.x && intersectZ >= this.o.z
                        && intersectZ <= this.o.z + this.d.z) {
                    return new PlayerBulletHit(this, intersectTime);
                }
            } else if (origin.y > this.o.y + this.d.y) {
                intersectTime = (this.o.y + this.d.y - origin.y) / motion.y;
                intersectX = origin.x + motion.x * intersectTime;
                intersectZ = origin.z + motion.z * intersectTime;
                if (intersectX >= this.o.x && intersectX <= this.o.x + this.d.x && intersectZ >= this.o.z
                        && intersectZ <= this.o.z + this.d.z) {
                    return new PlayerBulletHit(this, intersectTime);
                }
            }
        }

        return null;
    }

    public float hitByBullet(EntityBullet bullet, float penetratingPower) {
        return 0;
    }
}
