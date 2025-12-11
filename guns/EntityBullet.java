/*
 * Decompiled with CFR 0.150.
 *
 * Could not load the following classes:
 *  co.uk.flansmods.vintarz.$.TiProebal
 *  com.google.common.io.ByteArrayDataInput
 *  com.google.common.io.ByteArrayDataOutput
 *  cpw.mods.fml.common.network.PacketDispatcher
 *  cpw.mods.fml.common.network.Player
 *  cpw.mods.fml.common.registry.IEntityAdditionalSpawnData
 *  cpw.mods.fml.relauncher.Side
 *  extendedDmgSrc.ExtendedDamageSource$BodyPart
 */
package com.flansmod.common.guns;

import com.flansmod.mcu.Util;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import io.netty.buffer.ByteBuf;
import mcu.DayZ;
import mcu.client.ClientEventHandler;
import mcu.utils.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.particle.EntityDiggingFX;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class EntityBullet extends Entity implements IEntityAdditionalSpawnData, IEntitySelector {
    public static final Random bulletRng = new Random();
    public static float HITBOX_EXTEND;

    static {
        HITBOX_EXTEND = 0.2f;
    }

    private final Random deflectionRng = new Random();
    public Entity owner;
    public float damage;
    public boolean shotgun = false;
    public int skipX;
    public int skipY = -1;
    public int skipZ;
    public float slowdown;
    public boolean dataSend;
    private double distance = 150.0;
    private float speed;

    public EntityBullet(World world) {
        super(world);
        this.setSize(0.1f, 0.1f);
    }

    private EntityBullet(World world, EntityLivingBase entityLivingBase, float f) {
        this(world);
        this.noClip = true;
        this.owner = entityLivingBase;
        this.damage = f;
    }

    public EntityBullet(EntityPlayer entityPlayer, float spread, float damage, int bl, long seed) {
        this(entityPlayer.worldObj, entityPlayer, damage);
        this.speed = 45F;
        this.slowdown = 0;
        this.yOffset = 0.0f;
        bulletRng.setSeed(seed);
        spread *= 0.5f;
        this.shotgun = bl > 1;
        double d = entityPlayer.getEyeHeight() - 0.21;
        if (entityPlayer == Minecraft.getMinecraft().thePlayer) {
            d = 0.0;
        }
        this.posX = entityPlayer.posX;
        this.posZ = entityPlayer.posZ;
        this.posY = entityPlayer.posY;
        this.rotationYaw = entityPlayer.rotationYaw;
        this.rotationPitch = entityPlayer.rotationPitch + 90.0f;
        this.posY += 0.12 * -MathHelper.sin(this.rotationPitch / 180.0f * 3.141593f);
        this.rotationYaw = entityPlayer.rotationYaw;
        double d2 = MathHelper.cos(this.rotationPitch / 180.0f * 3.141593f);
        this.posX += d2 * 0.12 * -MathHelper.sin(this.rotationYaw / 180.0f * 3.141593f);
        this.posZ += d2 * 0.12 * MathHelper.cos(this.rotationYaw / 180.0f * 3.141593f);
        if (!Util.isAiming()) {
            this.rotationYaw = entityPlayer.rotationYaw + 90.0f;
            this.posX += 0.15 * -MathHelper.sin(this.rotationYaw / 180.0f * 3.141593f);
            this.posZ += 0.15 * MathHelper.cos(this.rotationYaw / 180.0f * 3.141593f);
        }
        this.rotationYaw = entityPlayer.rotationYaw;
        this.rotationPitch = entityPlayer.rotationPitch;
        this.setLocationAndAngles(this.posX, this.posY + d, this.posZ, this.rotationYaw, this.rotationPitch);
        double d3 = (bulletRng.nextDouble() - 0.5) * 2.0;
        d3 *= Math.abs(d3);
        this.rotationPitch = (float) ((double) this.rotationPitch + d3 * (double) spread);
        d3 = Math.sqrt(1.0 - d3 * d3);
        double d4 = (bulletRng.nextDouble() - 0.5) * 2.0;
        d4 *= Math.abs(d4);
        d4 = d4 * d3 * (double) spread / 180.0 * Math.PI;
        this.motionX = -MathHelper.sin(this.rotationYaw / 180.0f * 3.141593f)
                * MathHelper.cos(this.rotationPitch / 180.0f * 3.141593f);
        this.motionZ = MathHelper.cos(this.rotationYaw / 180.0f * 3.141593f)
                * MathHelper.cos(this.rotationPitch / 180.0f * 3.141593f);
        this.motionY = -MathHelper.sin(this.rotationPitch / 180.0f * 3.141593f);
        this.motionX -= MathHelper.sin((this.rotationYaw + 90.0f) / 180.0f * 3.141593f) * Math.tan(d4);
        this.motionZ += MathHelper.cos((this.rotationYaw + 90.0f) / 180.0f * 3.141593f) * Math.tan(d4);
        d2 = Math.sqrt(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
        this.motionX /= d2;
        this.motionY /= d2;
        this.motionZ /= d2;
        this.motionX *= speed;
        this.motionY *= speed;
        this.motionZ *= speed;
        float f5 = (float) Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
        this.prevRotationYaw = this.rotationYaw = (float) (Math.atan2(this.motionX, this.motionZ) * 180.0
                / 3.1415927410125732);
        this.prevRotationPitch = this.rotationPitch = (float) (Math.atan2(this.motionY, f5) * 180.0
                / 3.1415927410125732);
        ClientEventHandler.shoot_time = 4;
        this.doAttack();
    }

    public static float getDamageModifierForBlock(Block block) {
        if (block == Blocks.glass_pane) {
            return 0.9f;
        }
        if (block == Blocks.fence || block == Blocks.fence_gate || block == Blocks.nether_brick_fence) {
            return 0.9f;
        }
        if (block == Blocks.wooden_door || block.getClass() == BlockGlass.class) {
            return 0.75f;
        }
        return 0.0f;
    }

    private void doAttack() {
        this.onUpdate();
        if (this.isDead) {
            return;
        }
        ClientEventHandler.clientBullets.add(this);
    }

    @Override
    protected void entityInit() {
    }

    public void setArrowHeading(double d, double d2, double d3, float f, float f2) {
        float f3 = (float) Math.sqrt(d * d + d2 * d2 + d3 * d3);
        d /= f3;
        d2 /= f3;
        d3 /= f3;
        f3 = (float) Math.sqrt((d += this.rand.nextGaussian() * 0.005 * (double) f) * d
                + (d2 += this.rand.nextGaussian() * 0.005 * (double) f) * d2
                + (d3 += this.rand.nextGaussian() * 0.005 * (double) f) * d3);
        d /= f3;
        d2 /= f3;
        d3 /= f3;
        this.motionX = d *= f2;
        this.motionY = d2 *= f2;
        this.motionZ = d3 *= f2;
        float f4 = (float) Math.sqrt(d * d + d3 * d3);
        this.prevRotationYaw = this.rotationYaw = (float) (Math.atan2(d, d3) * 180.0 / 3.1415927410125732);
        this.prevRotationPitch = this.rotationPitch = (float) (Math.atan2(d2, f4) * 180.0 / 3.1415927410125732);
    }

    /*
     * @Override public void onUpdate() { if (this.ticksExisted > 0) { double d =
     * this.worldObj.getBlock(MathHelper.floor_double(this.posX),
     * MathHelper.floor_double(this.posY),
     * MathHelper.floor_double(this.posZ)).getMaterial() == Material.water ?
     * (double) 0.8f : Math.min(1.0 - (double) this.slowdown * 0.01, 1.0);
     * this.motionX *= d; this.motionY *= d; this.motionZ *= d; } try { block68: {
     * block67: { double d = 0; double d2; double d3; double d4; double d5; block64:
     * { block66: { block65: { double d6 = 0; boolean bl; double d7; Object object;
     * Object object2; Object object4; float f = 1.0f; boolean bl2 = false; d5 =
     * Math.sqrt(this.motionX * this.motionX + this.motionY * this.motionY +
     * this.motionZ * this.motionZ); Vec3 vec3 = Vec3.createVectorHelper(this.posX,
     * this.posY, this.posZ); Vec3 vec32 = Vec3.createVectorHelper(this.posX +
     * this.motionX, this.posY + this.motionY, this.posZ + this.motionZ); Object
     * object5 = this.rayTraceBlocks(vec3, vec32); vec3 =
     * Vec3.createVectorHelper(this.posX, this.posY, this.posZ); vec32 =
     * Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY,
     * this.posZ + this.motionZ); double d8 = vec3.distanceTo(vec32); List list =
     * this.worldObj.getEntitiesWithinAABBExcludingEntity(this,
     * AxisAlignedBB.getBoundingBox(Math.min(vec3.xCoord, vec32.xCoord) - 0.1,
     * Math.min(vec3.yCoord, vec32.yCoord) - 0.1, Math.min(vec3.zCoord,
     * vec32.zCoord) - 0.1, Math.max(vec3.xCoord, vec32.xCoord) + 0.1,
     * Math.max(vec3.yCoord, vec32.yCoord) + 0.1, Math.max(vec3.zCoord,
     * vec32.zCoord) + 0.1), entity -> entity.isEntityAlive() &&
     * entity.canBeCollidedWith() && !(entity instanceof EntityPlayer) && !(entity
     * instanceof EntityMinecart)); for (Entity entity : (List<Entity>) list) {
     * object4 = entity.boundingBox.calculateIntercept(vec3, vec32); if (object4 ==
     * null || !((d4 = vec3.distanceTo(((MovingObjectPosition) object4).hitVec)) <
     * d8)) continue; object5 = object4; ((MovingObjectPosition) object5).entityHit
     * = entity; ((MovingObjectPosition) object5).typeOfHit =
     * MovingObjectPosition.MovingObjectType.ENTITY; d8 = d4; } if (object5 != null)
     * { vec32 = ((MovingObjectPosition) object5).hitVec; } for (Object object6 :
     * this.worldObj.loadedEntityList) { if (object6 == this.owner || !(object6
     * instanceof EntityPlayer) || !((EntityLivingBase) (object2 = (EntityPlayer)
     * object6)).isEntityAlive() || (object = ((EntityPlayer) object2).boundingBox
     * .expand(HITBOX_EXTEND, HITBOX_EXTEND, HITBOX_EXTEND)
     * .calculateIntercept(vec3, vec32)) == null || !((d7 =
     * vec3.distanceTo(((MovingObjectPosition) object).hitVec)) < d8)) continue;
     * object5 = object; ((MovingObjectPosition) object5).entityHit = (Entity)
     * object2; ((MovingObjectPosition) object5).typeOfHit =
     * MovingObjectPosition.MovingObjectType.ENTITY; d8 = d7; } if (object5 != null)
     * { vec32 = ((MovingObjectPosition) object5).hitVec; }
     *
     * if (!this.worldObj.isRemote && object5 != null && ((MovingObjectPosition)
     * object5).entityHit instanceof EntityPlayer) { EntityPlayer entityPlayer =
     * (EntityPlayer) ((MovingObjectPosition) object5).entityHit; if
     * (entityPlayer.capabilities.disableDamage || this.owner instanceof
     * EntityPlayer && !((EntityPlayer) this.owner).canAttackPlayer(entityPlayer)) {
     * object5 = null; } } d3 = this.posX; d4 = this.posY; d2 = this.posZ; this.posX
     * = vec32.xCoord; this.posY = vec32.yCoord; this.posZ = vec32.zCoord; if
     * (object5 != null && ((MovingObjectPosition) object5).entityHit != null) {
     * this.prevPosX = d3; this.prevPosY = d4; this.prevPosZ = d2; // hit
     * this.setDead(); return; } if (object5 == null || ((MovingObjectPosition)
     * object5).typeOfHit != MovingObjectPosition.MovingObjectType.ENTITY) break
     * block64; this.prevPosX = d3; this.prevPosY = d4; this.prevPosZ = d2; bl = f
     * == 0.0f; if (this.worldObj.isRemote) {
     * Util.clientBulletEffects((MovingObjectPosition) object5, this, false); } else
     * if (this.ticksExisted == 0) { } if (bl) { this.setDead(); return; }
     * this.motionX *= f; this.motionY *= f; this.motionZ *= f; if (bl2) {
     * this.motionX += (this.deflectionRng.nextDouble() - 0.5) * (0.1 + d5 / 30.0);
     * this.motionY += (this.deflectionRng.nextDouble() - 0.5) * (0.1 + d5 / 30.0);
     * this.motionZ += (this.deflectionRng.nextDouble() - 0.5) * (0.1 + d5 / 30.0);
     * } if (this.posY > 256.0 || this.posY < 0.0 || this.speed < 0.5f) break
     * block65; this.distance -= (double) this.speed; if (!(d6 < 0.0)) break
     * block66; } this.setDead(); return; } if (this.worldObj.isRemote) {
     * Util.clientBulletUpdate(this); } else if (this.ticksExisted == 0) { } return;
     * } this.posX = d3; this.posY = d4; this.posZ = d2; this.skipY = -1;
     * this.prevPosX = this.posX; this.prevPosY = this.posY; this.prevPosZ =
     * this.posZ; this.posX += this.motionX; this.posY += this.motionY; this.posZ +=
     * this.motionZ; this.setPosition(this.posX, this.posY, this.posZ); if
     * (this.posY > 256.0 || this.posY < 0.0 || d5 < 0.5) break block67;
     * this.distance -= d5; if (!(d < 0.0)) break block68; } this.setDead(); return;
     * } if (!this.worldObj.isRemote) { float f = (float) Math.sqrt(this.motionX *
     * this.motionX + this.motionZ * this.motionZ); this.rotationYaw = (float)
     * (Math.atan2(this.motionX, this.motionZ) * 180.0 / 3.1415927410125732);
     * this.rotationPitch = (float) (Math.atan2(this.motionY, f) * 180.0 /
     * 3.1415927410125732); } } catch (Exception exception) { this.setDead();
     * return; } if (this.worldObj.isRemote) { Util.clientBulletUpdate(this); } else
     * if (this.ticksExisted == 0) { } }
     */

    @Override
    public void setVelocity(double d, double d2, double d3) {
        this.motionX = d;
        this.motionY = d2;
        this.motionZ = d3;
        if (this.prevRotationPitch == 0.0f && this.prevRotationYaw == 0.0f) {
            float f = (float) Math.sqrt(d * d + d3 * d3);
            this.prevRotationYaw = this.rotationYaw = (float) (Math.atan2(d, d3) * 180.0 / 3.1415927410125732);
            this.prevRotationPitch = this.rotationPitch = (float) (Math.atan2(d2, f) * 180.0 / 3.1415927410125732);
            this.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
        }
    }

    public void onUpdate() {
        if (this.ticksExisted > 0) {
            double d = this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY),
                    MathHelper.floor_double(this.posZ)).getMaterial() == Material.water ? (double) 0.8f
                    : Math.min(1.0 - (double) this.slowdown * 0.01, 1.0);
            this.motionX *= d;
            this.motionY *= d;
            this.motionZ *= d;
        }

        try {
            float var1 = 1.0F;
            boolean var4 = false;
            double var5 = Math
                    .sqrt(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
            float var7 = this.speed == 0.0F ? 1.0F : (float) Math.min(var5 / (double) this.speed, 1.0D);
            Vec3 vec8 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
            Vec3 vec9 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY,
                    this.posZ + this.motionZ);
            MovingObjectPosition var10 = this.rayTraceBlocks(vec8, vec9);
            vec8 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
            vec9 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY,
                    this.posZ + this.motionZ);
            if (var10 != null) {
                Block var11 = (Block) var10.hitInfo;
                var1 = getDamageModifierForBlock(var11);
                vec9 = var10.hitVec;
                if (var1 != 1.0F) {
                    var4 = var11 != Blocks.glass;
                }
            }
            double var12 = vec8.distanceTo(vec9);
            List var14 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this,
                    AxisAlignedBB.getBoundingBox(Math.min(vec8.xCoord, vec9.xCoord) - 0.1,
                            Math.min(vec8.yCoord, vec9.yCoord) - 0.1, Math.min(vec8.zCoord, vec9.zCoord) - 0.1,
                            Math.max(vec8.xCoord, vec9.xCoord) + 0.1, Math.max(vec8.yCoord, vec9.yCoord) + 0.1,
                            Math.max(vec8.zCoord, vec9.zCoord) + 0.1),
                    this);
            Iterator var15 = var14.iterator();

            double var18;
            while (var15.hasNext()) {
                Entity var16 = (Entity) var15.next();
                MovingObjectPosition var17 = var16.boundingBox.calculateIntercept(vec8, vec9);
                if (var17 != null) {
                    var18 = vec8.distanceTo(var17.hitVec);
                    if (var18 < var12) {
                        var10 = var17;
                        var17.entityHit = var16;
                        var17.typeOfHit = MovingObjectPosition.MovingObjectType.ENTITY;
                        var12 = var18;
                    }
                }
            }

            if (var10 != null) {
                vec9 = var10.hitVec;
            }

            double var23;

            Iterator var42 = this.worldObj.loadedEntityList.iterator();

            while (var42.hasNext()) {
                Object var20 = var42.next();
                EntityOtherPlayerMP.class.getClass();
                if (var20 != this.owner && var20 instanceof EntityPlayer) {
                    EntityPlayer var21 = (EntityPlayer) var20;
                    if (var21.isEntityAlive()) {
                        MovingObjectPosition var22 = var21.boundingBox
                                .expand(HITBOX_EXTEND, HITBOX_EXTEND, HITBOX_EXTEND).calculateIntercept(vec8, vec9);
                        if (var22 != null) {
                            var23 = vec8.distanceTo(var22.hitVec);
                            if (var23 < var12) {
                                var10 = var22;
                                var22.entityHit = var21;
                                var22.typeOfHit = MovingObjectPosition.MovingObjectType.ENTITY;
                                var12 = var23;
                            }
                        }
                    }
                }
            }

            if (var10 != null) {
                vec9 = var10.hitVec;
            }

            double var27 = this.posX;
            var18 = this.posY;
            double var29 = this.posZ;
            this.posX = vec9.xCoord;
            this.posY = vec9.yCoord;
            this.posZ = vec9.zCoord;
            if (var10 != null && var10.entityHit != null) {
                this.prevPosX = var27;
                this.prevPosY = var18;
                this.prevPosZ = var29;
                boolean hs = Utils.getModifier(var10.entityHit, vec9) == DamageMultiplier.HEAD;
                if (owner == Minecraft.getMinecraft().thePlayer && !dataSend) {
                    dataSend = true;
                    DayZ.network.sendToServer(DayZ.network.createPacket(28, var10.entityHit.getEntityId(),
                            damage * Utils.getModifier(var10.entityHit, vec9).value, hs, posX, posY, posZ));
                }
                this.setDead();
                for (int j = 0; j < 3; ++j) {
                    final EntityDiggingFX applyRenderColor2 = new EntityDiggingFX(Minecraft.getMinecraft().theWorld,
                            var10.hitVec.xCoord, var10.hitVec.yCoord, var10.hitVec.zCoord, Util.rng.nextDouble() * 0.01,
                            Util.rng.nextDouble() * 0.01, Util.rng.nextDouble() * 0.01, Blocks.emerald_block, 14)
                            .applyRenderColor(14);
                    applyRenderColor2.renderDistanceWeight = 256.0;
                    Minecraft.getMinecraft().effectRenderer.addEffect(applyRenderColor2);
                }
                return;
            }

            if (var10 != null && var10.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
                this.prevPosX = var27;
                this.prevPosY = var18;
                this.prevPosZ = var29;
                boolean var48 = var1 == 0.0F;
                if (this.worldObj.isRemote) {
                    Util.clientBulletEffects(var10, this, false);
                }

                if (var48) {
                    this.setDead();
                    return;
                }

                this.motionX *= var1;
                this.motionY *= var1;
                this.motionZ *= var1;
                if (var4) {
                    this.motionX += (this.deflectionRng.nextDouble() - 0.5D) * (0.1D + var5 / 30.0D);
                    this.motionY += (this.deflectionRng.nextDouble() - 0.5D) * (0.1D + var5 / 30.0D);
                    this.motionZ += (this.deflectionRng.nextDouble() - 0.5D) * (0.1D + var5 / 30.0D);
                }

                if (this.posY <= 256.0D && this.posY >= 0.0D && this.speed >= 0.5F
                        && (this.distance -= this.speed) >= 0.0D) {
                    if (this.worldObj.isRemote) {
                        Util.clientBulletUpdate(this);
                    }

                    return;
                }

                this.setDead();
                return;
            }

            this.posX = var27;
            this.posY = var18;
            this.posZ = var29;
            this.skipY = -1;
            this.prevPosX = this.posX;
            this.prevPosY = this.posY;
            this.prevPosZ = this.posZ;
            this.posX += this.motionX;
            this.posY += this.motionY;
            this.posZ += this.motionZ;
            this.setPosition(this.posX, this.posY, this.posZ);
            if (this.posY > 256.0D || this.posY < 0.0D || var5 < 0.5D || (this.distance -= var5) < 0.0D) {
                this.setDead();
                return;
            }
        } catch (Exception var38) {
            this.setDead();
            return;
        }

        if (this.worldObj.isRemote) {
            Util.clientBulletUpdate(this);
        }

    }

    private MovingObjectPosition rayTraceBlocks(Vec3 vec3, Vec3 vec32) {
        if (!(Double.isNaN(vec3.xCoord) || Double.isNaN(vec3.yCoord) || Double.isNaN(vec3.zCoord))) {
            if (!(Double.isNaN(vec32.xCoord) || Double.isNaN(vec32.yCoord) || Double.isNaN(vec32.zCoord))) {
                int n;
                int n2;
                Block n23;
                int n3 = MathHelper.floor_double(vec32.xCoord);
                int n4 = MathHelper.floor_double(vec32.yCoord);
                int n5 = MathHelper.floor_double(vec32.zCoord);
                int n6 = MathHelper.floor_double(vec3.xCoord);
                int n7 = MathHelper.floor_double(vec3.yCoord);
                int n8 = MathHelper.floor_double(vec3.zCoord);
                if (this.skipY != n7 && this.skipX != n6 && this.skipZ != n8) {
                    n23 = this.worldObj.getBlock(n6, n7, n8);
                    n = this.worldObj.getBlockMetadata(n6, n7, n8);
                    Block block = n23;
                    if (block != null) {
                        MovingObjectPosition movingObjectPosition;
                        Material material = block.getMaterial();
                        if (block.isCollidable()
                                && (material.isLiquid() || material != Material.leaves && material != Material.web
                                && material != Material.plants && material != Material.vine
                                && material != Material.circuits)
                                && (block.getCollisionBoundingBoxFromPool(this.worldObj, n6, n7, n8) != null
                                || block.canCollideCheck(n, true))
                                && (movingObjectPosition = block.collisionRayTrace(this.worldObj, n6, n7, n8, vec3,
                                vec32)) != null) {
                            movingObjectPosition.hitInfo = block;
                            this.skipX = n6;
                            this.skipY = n7;
                            this.skipZ = n8;
                            return movingObjectPosition;
                        }
                    }
                }
                n2 = 200;
                while (n2-- >= 0) {
                    MovingObjectPosition movingObjectPosition;
                    int n9;
                    if (Double.isNaN(vec3.xCoord) || Double.isNaN(vec3.yCoord) || Double.isNaN(vec3.zCoord)) {
                        return null;
                    }
                    if (n6 == n3 && n7 == n4 && n8 == n5) {
                        return null;
                    }
                    n = 1;
                    boolean bl = true;
                    boolean bl2 = true;
                    double d = 999.0;
                    double d2 = 999.0;
                    double d3 = 999.0;
                    if (n3 > n6) {
                        d = (double) n6 + 1.0;
                    } else if (n3 < n6) {
                        d = (double) n6 + 0.0;
                    } else {
                        n = 0;
                    }
                    if (n4 > n7) {
                        d2 = (double) n7 + 1.0;
                    } else if (n4 < n7) {
                        d2 = (double) n7 + 0.0;
                    } else {
                        bl = false;
                    }
                    if (n5 > n8) {
                        d3 = (double) n8 + 1.0;
                    } else if (n5 < n8) {
                        d3 = (double) n8 + 0.0;
                    } else {
                        bl2 = false;
                    }
                    double d4 = 999.0;
                    double d5 = 999.0;
                    double d6 = 999.0;
                    double d7 = vec32.xCoord - vec3.xCoord;
                    double d8 = vec32.yCoord - vec3.yCoord;
                    double d9 = vec32.zCoord - vec3.zCoord;
                    if (n != 0) {
                        d4 = (d - vec3.xCoord) / d7;
                    }
                    if (bl) {
                        d5 = (d2 - vec3.yCoord) / d8;
                    }
                    if (bl2) {
                        d6 = (d3 - vec3.zCoord) / d9;
                    }
                    if (d4 < d5 && d4 < d6) {
                        n9 = n3 > n6 ? 4 : 5;
                        vec3.xCoord = d;
                        vec3.yCoord += d8 * d4;
                        vec3.zCoord += d9 * d4;
                    } else if (d5 < d6) {
                        n9 = n4 > n7 ? 0 : 1;
                        vec3.xCoord += d7 * d5;
                        vec3.yCoord = d2;
                        vec3.zCoord += d9 * d5;
                    } else {
                        n9 = n5 > n8 ? 2 : 3;
                        vec3.xCoord += d7 * d6;
                        vec3.yCoord += d8 * d6;
                        vec3.zCoord = d3;
                    }
                    Vec3 vec33 = Vec3.createVectorHelper(vec3.xCoord, vec3.yCoord, vec3.zCoord);
                    vec33.xCoord = MathHelper.floor_double(vec3.xCoord);
                    n6 = (int) vec33.xCoord;
                    if (n9 == 5) {
                        --n6;
                        vec33.xCoord += 1.0;
                    }
                    vec33.yCoord = MathHelper.floor_double(vec3.yCoord);
                    n7 = (int) vec33.yCoord;
                    if (n9 == 1) {
                        --n7;
                        vec33.yCoord += 1.0;
                    }
                    vec33.zCoord = MathHelper.floor_double(vec3.zCoord);
                    n8 = (int) vec33.zCoord;
                    if (n9 == 3) {
                        --n8;
                        vec33.zCoord += 1.0;
                    }
                    if (n7 == this.skipY && n6 == this.skipX && n8 == this.skipZ)
                        continue;
                    Block n10 = this.worldObj.getBlock(n6, n7, n8);
                    int n11 = this.worldObj.getBlockMetadata(n6, n7, n8);
                    Block block = n10;
                    if (block == null)
                        continue;
                    Material material = block.getMaterial();
                    if (!block.isCollidable()
                            || !material.isLiquid() && (material == Material.leaves || material == Material.web
                            || material == Material.plants || material == Material.vine
                            || material == Material.circuits)
                            || block.getCollisionBoundingBoxFromPool(this.worldObj, n6, n7, n8) == null
                            && !block.canCollideCheck(n11, true)
                            || (movingObjectPosition = block.collisionRayTrace(this.worldObj, n6, n7, n8, vec3,
                            vec32)) == null)
                        continue;
                    movingObjectPosition.hitInfo = block;
                    this.skipX = n6;
                    this.skipY = n7;
                    this.skipZ = n8;
                    return movingObjectPosition;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public void setDead() {
        if (!this.isDead) {
            super.setDead();
            if (this.worldObj.isRemote) {
                Util.clientBulletUpdate(this);
            }
        }
    }

    @Override
    public boolean writeToNBTOptional(NBTTagCompound nBTTagCompound) {
        return false;
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound nBTTagCompound) {
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound nBTTagCompound) {
    }

    @Override
    public void writeSpawnData(ByteBuf buffer) {
        // TODO Auto-generated method stub

    }

    @Override
    public void readSpawnData(ByteBuf additionalData) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isEntityApplicable(Entity entity) {
        return entity.isEntityAlive() && entity.canBeCollidedWith() && !(entity instanceof EntityPlayer)
                && !(entity instanceof EntityMinecart);
    }
}
