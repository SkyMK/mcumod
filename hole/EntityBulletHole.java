package com.flansmod.client.hole;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityBulletHole extends Entity {

    public static final int LIFETIME = 200;
    protected static final float ENTITY_SIZE = 0.1F;
    public int sideHit = -1;
    public int lastRenderedTick;

    public EntityBulletHole(World w) {
        super(w);
        this.setSize(0.1F, 0.1F);
    }

    public EntityBulletHole(World w, double x, double y, double z, int sideHit) {
        super(w);
        this.setPosition(x, y, z);
        this.sideHit = sideHit;
        this.setSize(0.6F, 0.6F);
    }

    public void onUpdate() {
        super.onUpdate();
        if (super.ticksExisted >= 200 && super.ticksExisted > this.lastRenderedTick + 5) {
            this.setDead();
        }

    }

    protected void entityInit() {
    }

    protected void readEntityFromNBT(NBTTagCompound tag) {
        this.setDead();
    }

    protected void writeEntityToNBT(NBTTagCompound tag) {
    }
}
