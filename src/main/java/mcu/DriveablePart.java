package com.flansmod.common.driveables;

import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.raytracing.DriveableHit;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.nbt.NBTTagCompound;

public class DriveablePart {

    public EnumDriveablePart type;
    public CollisionBox box;
    public int maxHealth;
    public int health;
    public int fireTime;
    public boolean onFire;
    public boolean dead;

    public DriveablePart(EnumDriveablePart e, CollisionBox b) {
        this.type = e;
        this.box = b;
        this.health = this.maxHealth = b == null ? 0 : b.health;
    }

    public void update(EntityDriveable driveable) {
        if (this.fireTime > 0) {
            --this.fireTime;
        }

        if (this.fireTime == 0) {
            this.onFire = false;
        }

        if (this.onFire) {
            --this.health;
        }

        if (this.health <= 0 && this.maxHealth > 0) {
            this.dead = true;
        }

    }

    public void writeToNBT(NBTTagCompound tags) {
        tags.setInteger(this.type.getShortName() + "_Health", this.health);
        tags.setBoolean(this.type.getShortName() + "_Fire", this.onFire);
    }

    public void readFromNBT(NBTTagCompound tags) {
        if (!tags.hasKey(this.type.getShortName() + "_Health")) {
            this.health = this.maxHealth;
            this.onFire = false;
        } else {
            this.health = tags.getInteger(this.type.getShortName() + "_Health");
            this.onFire = tags.getBoolean(this.type.getShortName() + "_Fire");
        }
    }

    public float smashIntoGround(EntityDriveable driveable, float damage) {
        if (this.box != null && !this.dead) {
            if (!driveable.canHitPart(this.type)) {
                return 0.0F;
            } else if (this.maxHealth == 0) {
                return damage;
            } else {
                this.health -= (int) (damage / 2.0F);
                return damage / 2.0F;
            }
        } else {
            return 0.0F;
        }
    }

    public DriveableHit rayTrace(EntityDriveable driveable, Vector3f origin, Vector3f motion) {
        if (this.box != null && this.health > 0 && !this.dead) {
            if (!driveable.canHitPart(this.type)) {
                return null;
            } else {
                float intersectTime;
                float intersectX;
                float intersectZ;
                if (motion.x != 0.0F) {
                    if (origin.x < this.box.x) {
                        intersectTime = (this.box.x - origin.x) / motion.x;
                        intersectX = origin.y + motion.y * intersectTime;
                        intersectZ = origin.z + motion.z * intersectTime;
                        if (intersectX >= this.box.y && intersectX <= this.box.y + this.box.h
                                && intersectZ >= this.box.z && intersectZ <= this.box.z + this.box.d) {
                            return new DriveableHit(driveable, this.type, intersectTime);
                        }
                    } else if (origin.x > this.box.x + this.box.w) {
                        intersectTime = (this.box.x + this.box.w - origin.x) / motion.x;
                        intersectX = origin.y + motion.y * intersectTime;
                        intersectZ = origin.z + motion.z * intersectTime;
                        if (intersectX >= this.box.y && intersectX <= this.box.y + this.box.h
                                && intersectZ >= this.box.z && intersectZ <= this.box.z + this.box.d) {
                            return new DriveableHit(driveable, this.type, intersectTime);
                        }
                    }
                }

                if (motion.z != 0.0F) {
                    if (origin.z < this.box.z) {
                        intersectTime = (this.box.z - origin.z) / motion.z;
                        intersectX = origin.x + motion.x * intersectTime;
                        intersectZ = origin.y + motion.y * intersectTime;
                        if (intersectX >= this.box.x && intersectX <= this.box.x + this.box.w
                                && intersectZ >= this.box.y && intersectZ <= this.box.y + this.box.h) {
                            return new DriveableHit(driveable, this.type, intersectTime);
                        }
                    } else if (origin.z > this.box.z + this.box.d) {
                        intersectTime = (this.box.z + this.box.d - origin.z) / motion.z;
                        intersectX = origin.x + motion.x * intersectTime;
                        intersectZ = origin.y + motion.y * intersectTime;
                        if (intersectX >= this.box.x && intersectX <= this.box.x + this.box.w
                                && intersectZ >= this.box.y && intersectZ <= this.box.y + this.box.h) {
                            return new DriveableHit(driveable, this.type, intersectTime);
                        }
                    }
                }

                if (motion.y != 0.0F) {
                    if (origin.y < this.box.y) {
                        intersectTime = (this.box.y - origin.y) / motion.y;
                        intersectX = origin.x + motion.x * intersectTime;
                        intersectZ = origin.z + motion.z * intersectTime;
                        if (intersectX >= this.box.x && intersectX <= this.box.x + this.box.w
                                && intersectZ >= this.box.z && intersectZ <= this.box.z + this.box.d) {
                            return new DriveableHit(driveable, this.type, intersectTime);
                        }
                    } else if (origin.y > this.box.y + this.box.h) {
                        intersectTime = (this.box.y + this.box.h - origin.y) / motion.y;
                        intersectX = origin.x + motion.x * intersectTime;
                        intersectZ = origin.z + motion.z * intersectTime;
                        if (intersectX >= this.box.x && intersectX <= this.box.x + this.box.w
                                && intersectZ >= this.box.z && intersectZ <= this.box.z + this.box.d) {
                            return new DriveableHit(driveable, this.type, intersectTime);
                        }
                    }
                }

                return null;
            }
        } else {
            return null;
        }
    }

    public void hitByBullet(EntityBullet bullet, DriveableHit hit) {
        if (bullet != null) {
            if (hit.driveable instanceof EntityPlane) {
            } else {
            }

        }

    }

    private boolean coordIsEntering(float start, float end, float min, float max) {
        return start < min && end >= min || start > max && end <= max;
    }

    private boolean coordIsIn(float start, float end, float min, float max) {
        return start >= min && start <= max || (end >= min && end <= max || (start < min && end > max || end < min && start > max));
    }

    public boolean attack(float damage, boolean fireDamage) {
        this.health = (int) ((float) this.health - damage);
        if (fireDamage) {
            this.fireTime = 20;
            this.onFire = true;
        }

        if (this.health < 0) {
            this.health = 0;
        }

        return this.health <= 0;
    }
}
