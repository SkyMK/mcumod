package com.flansmod.common.driveables;

import com.flansmod.api.IExplodeable;
import com.flansmod.common.FlansMod;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketDriveableKey;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.network.PacketVehicleControl;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.vector.Vector3f;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntityVehicle extends EntityDriveable implements IExplodeable {

    public int shellDelay;
    public int gunDelay;
    public int soundPosition;
    public float wheelsYaw;
    public boolean varDoor;
    public float wheelsAngle;
    public int toggleTimer = 0;
    private int ticksSinceUsed = 0;

    public EntityVehicle(World world) {
        super(world);
        super.stepHeight = 1.0F;
    }

    public EntityVehicle(World world, double x, double y, double z, VehicleType type, DriveableData data) {
        super(world, type, data);
        super.stepHeight = 1.0F;
        this.setPosition(x, y, z);
        this.initType(type, false);
    }

    public EntityVehicle(World world, double x, double y, double z, EntityPlayer placer, VehicleType type,
                         DriveableData data) {
        super(world, type, data);
        super.stepHeight = 1.0F;
        this.setPosition(x, y, z);
        this.rotateYaw(placer.rotationYaw + 90.0F);
        this.initType(type, false);
    }

    protected void initType(DriveableType type, boolean clientSide) {
        super.initType(type, clientSide);
    }

    public void readSpawnData(ByteBuf data) {
        super.readSpawnData(data);
    }

    protected void writeEntityToNBT(NBTTagCompound tag) {
        super.writeEntityToNBT(tag);
        tag.setBoolean("VarDoor", this.varDoor);
    }

    protected void readEntityFromNBT(NBTTagCompound tag) {
        super.readEntityFromNBT(tag);
        this.varDoor = tag.getBoolean("VarDoor");
    }

    public void onMouseMoved(int deltaX, int deltaY) {
    }

    public void setPositionRotationAndMotion(double x, double y, double z, float yaw, float pitch, float roll,
                                             double motX, double motY, double motZ, float velYaw, float velPitch, float velRoll, float throt,
                                             float steeringYaw) {
        super.setPositionRotationAndMotion(x, y, z, yaw, pitch, roll, motX, motY, motZ, velYaw, velPitch, velRoll,
                throt, steeringYaw);
        this.wheelsYaw = steeringYaw;
    }

    public boolean interactFirst(EntityPlayer entityplayer) {
        if (super.isDead) {
            return false;
        } else if (super.worldObj.isRemote) {
            return false;
        } else {
            ItemStack currentItem = entityplayer.getCurrentEquippedItem();
            if (currentItem != null && currentItem.getItem() instanceof ItemTool
                    && ((ItemTool) currentItem.getItem()).type.healDriveables) {
                return true;
            } else {
                VehicleType type = this.getVehicleType();

                for (int i = 0; i <= type.numPassengers; ++i) {
                    if (super.seats[i].interactFirst(entityplayer)) {
                        if (i == 0) {
                            this.shellDelay = type.vehicleShellDelay;
                            FlansMod.proxy.doTutorialStuff(entityplayer, this);
                        }

                        return true;
                    }
                }

                return false;
            }
        }
    }

    public boolean pressKey(int key, EntityPlayer player) {
        VehicleType type = this.getVehicleType();
        if (super.worldObj.isRemote && (key == 6 || key == 8 || key == 9)) {
            FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
            return true;
        } else {
            switch (key) {
                case 0:
                    super.throttle += 0.01F;
                    if (super.throttle > 1.0F) {
                        super.throttle = 1.0F;
                    }

                    return true;
                case 1:
                    super.throttle -= 0.01F;
                    if (super.throttle < -1.0F) {
                        super.throttle = -1.0F;
                    }

                    if (super.throttle < 0.0F && type.maxNegativeThrottle == 0.0F) {
                        super.throttle = 0.0F;
                    }

                    return true;
                case 2:
                    --this.wheelsYaw;
                    return true;
                case 3:
                    ++this.wheelsYaw;
                    return true;
                case 4:
                    super.throttle *= 0.8F;
                    if (super.throttle > 0.001F) {
                        super.throttle = 0.0F;
                    }

                    if (super.throttle > -0.001F) {
                        super.throttle = 0.0F;
                    }

                    return true;
                case 5:
                    return true;
                case 6:
                    super.seats[0].riddenByEntity.setInvisible(false);
                    super.seats[0].riddenByEntity.mountEntity(null);
                    return true;
                case 7:
                    if (super.worldObj.isRemote) {
                        FlansMod.proxy.openDriveableMenu((EntityPlayer) super.seats[0].riddenByEntity, super.worldObj,
                                this);
                    }

                    return true;
                case 8:
                case 9:
                    return super.pressKey(key, player);
                case 10:
                    return true;
                case 11:
                    return true;
                case 12:
                    return true;
                case 13:
                    return true;
                case 14:
                    if (this.toggleTimer <= 0) {
                        this.varDoor = !this.varDoor;
                        if (type.hasDoor) {
                            player.addChatMessage(new ChatComponentText("Doors " + (this.varDoor ? "open" : "closed")));
                        }

                        this.toggleTimer = 10;
                        FlansMod.getPacketHandler().sendToServer(new PacketVehicleControl(this));
                    }

                    return true;
                case 15:
                    return true;
                case 16:
                    return true;
                case 17:
                default:
                    return false;
            }
        }
    }

    public Vector3f getLookVector(DriveablePosition dp) {
        return this.rotate(super.seats[0].looking.getXAxis());
    }

    public void onUpdate() {
        double bkPrevPosY = super.prevPosY;
        super.onUpdate();
        VehicleType type = this.getVehicleType();
        DriveableData data = this.getDriveableData();
        if (type == null) {
            FlansMod.log("Vehicle type null. Not ticking vehicle");
        } else {
            boolean thePlayerIsDrivingThis = super.worldObj.isRemote && super.seats[0] != null
                    && super.seats[0].riddenByEntity instanceof EntityPlayer
                    && FlansMod.proxy.isThePlayer((EntityPlayer) super.seats[0].riddenByEntity);
            ++this.ticksSinceUsed;
            if (!super.worldObj.isRemote && super.seats[0].riddenByEntity != null) {
                this.ticksSinceUsed = 0;
            }

            if (!super.worldObj.isRemote && TeamsManager.vehicleLife > 0
                    && this.ticksSinceUsed > TeamsManager.vehicleLife * 20) {
                this.setDead();
            }

            if (this.shellDelay > 0) {
                --this.shellDelay;
            }

            if (this.gunDelay > 0) {
                --this.gunDelay;
            }

            if (this.toggleTimer > 0) {
                --this.toggleTimer;
            }

            if (this.soundPosition > 0) {
                --this.soundPosition;
            }

            if (this.hasEnoughFuel()) {
                this.wheelsAngle += super.throttle / 7.0F;
            }

            if (type.setPlayerInvisible && !super.worldObj.isRemote && super.seats[0].riddenByEntity != null) {
                super.seats[0].riddenByEntity.setInvisible(true);
            }

            this.wheelsYaw *= 0.9F;
            if (this.wheelsYaw > 20.0F) {
                this.wheelsYaw = 20.0F;
            }

            if (this.wheelsYaw < -20.0F) {
                this.wheelsYaw = -20.0F;
            }

            float drz;
            if (super.worldObj.isRemote && !thePlayerIsDrivingThis && super.serverPositionTransitionTicker > 0) {
                double amountToMoveCar = super.posX
                        + (super.field_70118_ct - super.posX) / (double) super.serverPositionTransitionTicker;
                double y = super.posY
                        + (super.field_70117_cu - super.posY) / (double) super.serverPositionTransitionTicker;
                double minY = super.posZ
                        + (super.field_70116_cv - super.posZ) / (double) super.serverPositionTransitionTicker;
                double x = MathHelper.wrapAngleTo180_double(super.serverYaw - (double) super.axes.getYaw());
                double dy = MathHelper.wrapAngleTo180_double(super.serverPitch - (double) super.axes.getPitch());
                double drx = MathHelper.wrapAngleTo180_double(super.serverRoll - (double) super.axes.getRoll());
                super.rotationYaw = (float) ((double) super.axes.getYaw()
                        + x / (double) super.serverPositionTransitionTicker);
                super.rotationPitch = (float) ((double) super.axes.getPitch()
                        + dy / (double) super.serverPositionTransitionTicker);
                drz = (float) ((double) super.axes.getRoll() + drx / (double) super.serverPositionTransitionTicker);
                --super.serverPositionTransitionTicker;
                this.setPosition(amountToMoveCar, y, minY);
                this.setRotation(super.rotationYaw, super.rotationPitch, drz);
            }

            this.correctWheelPos();
            Vector3f var24 = new Vector3f();
            EntityWheel[] bmy = super.wheels;
            int var26 = bmy.length;

            boolean fullInBlocks;
            float z;
            float dz;
            Vector3f var37;
            float var41;
            float var44;
            for (int animSpeed = 0; animSpeed < var26; ++animSpeed) {
                EntityWheel var29 = bmy[animSpeed];
                if (var29 != null) {
                    super.onGround = true;
                    var29.onGround = true;
                    var29.rotationYaw = super.axes.getYaw();
                    if (!type.tank && (var29.ID == 2 || var29.ID == 3)) {
                        var29.rotationYaw += this.wheelsYaw;
                    }

                    var29.motionX *= 0.8999999761581421D;
                    var29.motionY *= super.posY - bkPrevPosY < 0.0D ? 0.9990000128746033D : 0.8999999761581421D;
                    var29.motionZ *= 0.8999999761581421D;
                    var29.motionY -= 0.049000002443790436D;
                    fullInBlocks = !TeamsManager.vehiclesNeedFuel || super.seats != null && super.seats[0] != null
                            && super.seats[0].riddenByEntity instanceof EntityPlayer
                            && ((EntityPlayer) super.seats[0].riddenByEntity).capabilities.isCreativeMode;
                    if (fullInBlocks || data.fuelInTank > data.engine.fuelConsumption * super.throttle) {
                        if (!this.getVehicleType().tank) {
                            float var36 = 0.1F * super.throttle
                                    * (super.throttle > 0.0F ? type.maxThrottle : type.maxNegativeThrottle)
                                    * data.engine.engineSpeed;
                            var29.motionX += Math.cos(var29.rotationYaw * 3.1415927F / 180.0F)
                                    * (double) var36;
                            var29.motionZ += Math.sin(var29.rotationYaw * 3.1415927F / 180.0F)
                                    * (double) var36;
                            if (var29.ID != 2 && var29.ID != 3) {
                                var29.motionX *= 0.8999999761581421D;
                                var29.motionZ *= 0.8999999761581421D;
                            } else {
                                var36 = 0.01F * (this.wheelsYaw > 0.0F ? type.turnLeftModifier : type.turnRightModifier)
                                        * (float) (super.throttle > 0.0F ? 1 : -1);
                                var29.motionX -= var29.getSpeedXZ()
                                        * Math.sin(var29.rotationYaw * 3.1415927F / 180.0F) * (double) var36
                                        * (double) this.wheelsYaw;
                                var29.motionZ += var29.getSpeedXZ()
                                        * Math.cos(var29.rotationYaw * 3.1415927F / 180.0F) * (double) var36
                                        * (double) this.wheelsYaw;
                            }
                        } else {
                            boolean var35 = var29.ID == 0 || var29.ID == 3;
                            z = 0.02F;
                            var29.motionX *= 1.0F - Math.abs(this.wheelsYaw) * z;
                            var29.motionZ *= 1.0F - Math.abs(this.wheelsYaw) * z;
                            var41 = 0.04F * (super.throttle > 0.0F ? type.maxThrottle : type.maxNegativeThrottle)
                                    * data.engine.engineSpeed;
                            dz = 0.1F * (this.wheelsYaw > 0.0F ? type.turnLeftModifier : type.turnRightModifier);
                            var44 = (super.throttle + this.wheelsYaw * (float) (var35 ? 1 : -1) * dz) * var41;
                            var29.motionX += (double) var44
                                    * Math.cos(var29.rotationYaw * 3.1415927F / 180.0F);
                            var29.motionZ += (double) var44
                                    * Math.sin(var29.rotationYaw * 3.1415927F / 180.0F);
                        }
                    }

                    if (type.floatOnWater && super.worldObj
                            .isAnyLiquid(var29.boundingBox.copy().offset(0.0D, -type.floatOffset, 0.0D))) {
                        var29.motionY += type.buoyancy;
                    }

                    var29.moveEntity(var29.motionX, var29.motionY, var29.motionZ);
                    var37 = super.axes.findLocalVectorGlobally(this.getVehicleType().wheelPositions[var29.ID].position);
                    Vector3f var38 = new Vector3f(var29.posX - super.posX, var29.posY - super.posY,
                            var29.posZ - super.posZ);
                    Vector3f var43 = (Vector3f) Vector3f.sub(var37, var38, null)
                            .scale(this.getVehicleType().wheelSpringStrength);
                    if (var43.length() > 0.001F) {
                        var29.moveEntity(var43.x, var43.y, var43.z);
                        var43.scale(0.5F);
                        Vector3f.sub(var24, var43, var24);
                    }
                }
            }

            double var25 = super.motionY;
            super.motionY = var24.y;
            this.moveEntity(var24.x, var24.y, var24.z);
            super.motionY = var25;
            if (super.wheels[0] != null && super.wheels[1] != null && super.wheels[2] != null
                    && super.wheels[3] != null) {
                Vector3f var27 = new Vector3f((super.wheels[2].posX + super.wheels[3].posX) / 2.0D,
                        (super.wheels[2].posY + super.wheels[3].posY) / 2.0D,
                        (super.wheels[2].posZ + super.wheels[3].posZ) / 2.0D);
                Vector3f var31 = new Vector3f((super.wheels[0].posX + super.wheels[1].posX) / 2.0D,
                        (super.wheels[0].posY + super.wheels[1].posY) / 2.0D,
                        (super.wheels[0].posZ + super.wheels[1].posZ) / 2.0D);
                Vector3f var33 = new Vector3f((super.wheels[0].posX + super.wheels[3].posX) / 2.0D,
                        (super.wheels[0].posY + super.wheels[3].posY) / 2.0D,
                        (super.wheels[0].posZ + super.wheels[3].posZ) / 2.0D);
                var37 = new Vector3f((super.wheels[1].posX + super.wheels[2].posX) / 2.0D,
                        (super.wheels[1].posY + super.wheels[2].posY) / 2.0D,
                        (super.wheels[1].posZ + super.wheels[2].posZ) / 2.0D);
                z = var27.x - var31.x;
                var41 = var27.y - var31.y;
                dz = var27.z - var31.z;
                var44 = var33.x - var37.x;
                float dry = var33.y - var37.y;
                drz = var33.z - var37.z;
                float dxz = (float) Math.sqrt(z * z + dz * dz);
                float drxz = (float) Math.sqrt(var44 * var44 + drz * drz);
                float yaw = (float) Math.atan2(dz, z);
                float pitch = -((float) Math.atan2(var41, dxz));
                float roll = 0.0F;
                if (type.canRoll) {
                    roll = -((float) Math.atan2(dry, drxz));
                }

                if (type.tank) {
                    yaw = (float) Math.atan2(super.wheels[3].posZ - super.wheels[2].posZ,
                            super.wheels[3].posX - super.wheels[2].posX) + 1.5707964F;
                }

                super.axes.setAngles(yaw * 180.0F / 3.14159F, pitch * 180.0F / 3.14159F, roll * 180.0F / 3.14159F);
            }

            if (super.ridingEntity != null
                    && super.ridingEntity.getClass().toString().indexOf("mcheli.aircraft.MCH_EntitySeat") > 0) {
                super.axes.setAngles(super.ridingEntity.rotationYaw + 90.0F, 0.0F, 0.0F);
            }

            this.checkForCollisions();
            if (Math.abs(super.throttle) > 0.01F && Math.abs(super.throttle) < 0.2F && this.soundPosition == 0
                    && this.hasEnoughFuel()) {
                PacketPlaySound.sendSoundPacket(super.posX, super.posY, super.posZ, type.startSoundRange,
                        super.dimension, type.startSound, false);
                this.soundPosition = type.startSoundLength;
            }

            if (super.throttle >= 0.2F && this.soundPosition == 0 && this.hasEnoughFuel()) {
                PacketPlaySound.sendSoundPacket(super.posX, super.posY, super.posZ, type.engineSoundRange,
                        super.dimension, type.engineSound, false);
                this.soundPosition = type.engineSoundLength;
            }

            if (super.throttle <= -0.2F && this.soundPosition == 0 && this.hasEnoughFuel()) {
                PacketPlaySound.sendSoundPacket(super.posX, super.posY, super.posZ, type.backSoundRange,
                        super.dimension, type.backSound, false);
                this.soundPosition = type.backSoundLength;
            }

            EntitySeat[] var28 = super.seats;
            int var32 = var28.length;

            for (int var34 = 0; var34 < var32; ++var34) {
                EntitySeat var39 = var28[var34];
                if (var39 != null) {
                    var39.updatePosition();
                }
            }

            if (thePlayerIsDrivingThis) {
                FlansMod.getPacketHandler().sendToServer(new PacketVehicleControl(this));
                super.field_70118_ct = super.posX;
                super.field_70117_cu = super.posY;
                super.field_70116_cv = super.posZ;
                super.serverYaw = super.axes.getYaw();
            }

            if (!super.worldObj.isRemote && super.ticksExisted % 5 == 0) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketVehicleControl(this), super.posX, super.posY,
                        super.posZ, 200.0F, super.dimension);
            }

            byte var30 = 4;
            if (((double) super.throttle <= 0.05D || (double) super.throttle > 0.33D)
                    && ((double) super.throttle >= -0.05D || (double) super.throttle < -0.33D)) {
                if (((double) super.throttle <= 0.33D || (double) super.throttle > 0.66D)
                        && ((double) super.throttle >= -0.33D || (double) super.throttle < -0.66D)) {
                    if (((double) super.throttle <= 0.66D || (double) super.throttle > 0.9D)
                            && ((double) super.throttle >= -0.66D || (double) super.throttle < -0.9D)) {
                        if ((double) super.throttle > 0.9D && super.throttle <= 1.0F
                                || (double) super.throttle < -0.9D && super.throttle >= -1.0F) {
                            var30 = 0;
                        }
                    } else {
                        var30 = 1;
                    }
                } else {
                    var30 = 2;
                }
            } else {
                var30 = 3;
            }

            if ((double) super.throttle > 0.05D) {
                --super.animCount;
            } else if ((double) super.throttle < -0.05D) {
                ++super.animCount;
            }

            if (super.animCount <= 0) {
                super.animCount = var30;
                ++super.animFrame;
            }

            if (super.throttle < 0.0F && super.animCount >= var30) {
                super.animCount = 0;
                --super.animFrame;
            }

            if (super.animFrame > type.animFrames) {
                super.animFrame = 0;
            }

            if (super.animFrame < 0) {
                super.animFrame = type.animFrames;
            }

            if (super.ticksExisted % 20 == 0) {
                var32 = (int) super.boundingBox.minY;
                fullInBlocks = true;

                for (int var42 = (int) super.posX - 3; var42 <= (int) super.posX + 3; ++var42) {
                    for (int var40 = (int) super.posZ - 3; var40 <= (int) super.posZ + 3; ++var40) {
                        if (super.worldObj.getBlock(var42, var32, var40) == Blocks.air) {
                            fullInBlocks = false;
                        }
                    }
                }

                if (fullInBlocks) {
                    this.setPosition(super.posX,
                            super.worldObj.getTopSolidOrLiquidBlock((int) super.posX, (int) super.posZ) + 1,
                            super.posZ);
                    super.velocityChanged = true;
                }
            }

        }
    }

    protected void fall(float k) {
        if (k > 10.0F) {
            float damage = (float) (MathHelper.ceiling_float_int(k) * 2);
            boolean no_damage = true;
            if (damage > 0.0F && super.invulnerableUnmountCount == 0 && super.ticksExisted > 20) {
                DriveableType type = this.getDriveableType();
                damage = (float) ((int) (damage * type.fallDamageFactor));
                this.attackPart(EnumDriveablePart.core, DamageSource.fall, damage);
                if (type.wheelPositions.length > 0) {
                    this.attackPart(type.wheelPositions[0].part, DamageSource.fall, damage / 5.0F);
                }

                no_damage = false;
            }

        }
    }

    private float averageAngles(float a, float b) {
        FlansMod.log("Pre  " + a + " " + b);

        float pi;
        for (pi = 3.1415927F; a > b + pi; a -= 2.0F * pi) {
        }

        while (a < b - pi) {
            a += 2.0F * pi;
        }

        float avg;
        for (avg = (a + b) / 2.0F; avg > pi; avg -= 2.0F * pi) {
        }

        while (avg < -pi) {
            avg += 2.0F * pi;
        }

        FlansMod.log("Post " + a + " " + b + " " + avg);
        return avg;
    }

    private Vec3 subtract(Vec3 a, Vec3 b) {
        return Vec3.createVectorHelper(a.xCoord - b.xCoord, a.yCoord - b.yCoord, a.zCoord - b.zCoord);
    }

    private Vec3 crossProduct(Vec3 a, Vec3 b) {
        return Vec3.createVectorHelper(a.yCoord * b.zCoord - a.zCoord * b.yCoord,
                a.zCoord * b.xCoord - a.xCoord * b.zCoord, a.xCoord * b.yCoord - a.yCoord * b.xCoord);
    }

    public boolean landVehicle() {
        return true;
    }

    public boolean attackEntityFrom(DamageSource damagesource, float i) {
        if (super.isDead) {
            return false;
        } else {
            VehicleType type = this.getVehicleType();
            if (damagesource.damageType.equals("player") && damagesource.getEntity().onGround
                    && (super.seats[0] == null || super.seats[0].riddenByEntity == null)) {
                this.setDead();
                if (!super.worldObj.isRemote && type.item != null) {
                    ItemStack vehicleStack = new ItemStack(type.item, 1, 0);
                    vehicleStack.stackTagCompound = new NBTTagCompound();
                    super.driveableData.writeToNBT(vehicleStack.stackTagCompound);
                    this.entityDropItem(vehicleStack, 0.5F);
                }

                return true;
            } else {
                return super.attackEntityFrom(damagesource, i);
            }
        }
    }

    public VehicleType getVehicleType() {
        return VehicleType.getVehicle(super.driveableType);
    }

    public float getPlayerRoll() {
        return super.axes.getRoll();
    }

    protected void dropItemsOnPartDeath(Vector3f midpoint, DriveablePart part) {
    }

    public String getBombInventoryName() {
        return "Mines";
    }

    public String getMissileInventoryName() {
        return "Shells";
    }

    public boolean hasMouseControlMode() {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public EntityLivingBase getCamera() {
        return null;
    }

    public void setDead() {
        super.setDead();
        EntityWheel[] var1 = super.wheels;
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            EntityWheel wheel = var1[var3];
            if (wheel != null) {
                wheel.setDead();
            }
        }

    }
}
