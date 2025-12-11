package com.flansmod.common.driveables;

import com.flansmod.common.FlansMod;
import com.flansmod.common.network.*;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.vector.Matrix4f;
import com.flansmod.common.vector.Vector3f;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.Iterator;

public class EntityPlane extends EntityDriveable {

    public float flapsYaw;
    public float flapsPitchLeft;
    public float flapsPitchRight;
    public int soundPosition;
    public float propAngle;
    public int bombDelay;
    public int gunDelay;
    public int ticksSinceUsed;
    public boolean varGear;
    public boolean varDoor;
    public boolean varWing;
    public int toggleTimer;
    public EnumPlaneMode mode;
    public int flareDelay;
    public int ticksFlareUsing;
    public boolean varFlare;

    public EntityPlane(World world) {
        super(world);
        this.ticksSinceUsed = 0;
        this.varGear = true;
        this.varDoor = false;
        this.varWing = false;
        this.toggleTimer = 0;
        this.flareDelay = 0;
        this.ticksFlareUsing = 0;
    }

    public EntityPlane(World world, double x, double y, double z, PlaneType type, DriveableData data) {
        super(world, type, data);
        this.ticksSinceUsed = 0;
        this.varGear = true;
        this.varDoor = false;
        this.varWing = false;
        this.toggleTimer = 0;
        this.flareDelay = 0;
        this.ticksFlareUsing = 0;
        this.setPosition(x, y, z);
        super.prevPosX = x;
        super.prevPosY = y;
        super.prevPosZ = z;
        this.initType(type, false);
    }

    public EntityPlane(World world, double x, double y, double z, EntityPlayer placer, PlaneType type,
                       DriveableData data) {
        this(world, x, y, z, type, data);
        this.rotateYaw(placer.rotationYaw + 90.0F);
        this.rotatePitch(type.restingPitch);
    }

    public void initType(DriveableType type, boolean clientSide) {
        super.initType(type, clientSide);
        this.mode = ((PlaneType) type).mode == EnumPlaneMode.HELI ? EnumPlaneMode.HELI : EnumPlaneMode.PLANE;
    }

    protected void writeEntityToNBT(NBTTagCompound tag) {
        super.writeEntityToNBT(tag);
        tag.setTag("Pos", this.newDoubleNBTList(super.posX, super.posY + 1.0D, super.posZ));
        tag.setBoolean("VarGear", this.varGear);
        tag.setBoolean("VarDoor", this.varDoor);
        tag.setBoolean("VarWing", this.varWing);
    }

    protected void readEntityFromNBT(NBTTagCompound tag) {
        super.readEntityFromNBT(tag);
        this.varGear = tag.getBoolean("VarGear");
        this.varDoor = tag.getBoolean("VarDoor");
        this.varWing = tag.getBoolean("VarWing");
    }

    public void onMouseMoved(int deltaX, int deltaY) {
        if (FMLCommonHandler.instance().getSide().isClient()) {
            if (FlansMod.proxy.mouseControlEnabled()) {
                float sensitivity = 0.02F;
                this.flapsPitchLeft -= sensitivity * (float) deltaY;
                this.flapsPitchRight -= sensitivity * (float) deltaY;
                this.flapsPitchLeft -= sensitivity * (float) deltaX;
                this.flapsPitchRight += sensitivity * (float) deltaX;
            }
        }
    }

    public void setPositionRotationAndMotion(double x, double y, double z, float yaw, float pitch, float roll,
                                             double motX, double motY, double motZ, float velYaw, float velPitch, float velRoll, float throt,
                                             float steeringYaw) {
        super.setPositionRotationAndMotion(x, y, z, yaw, pitch, roll, motX, motY, motZ, velYaw, velPitch, velRoll,
                throt, steeringYaw);
        this.flapsYaw = steeringYaw;
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
                PlaneType type = this.getPlaneType();

                for (int i = 0; i <= type.numPassengers; ++i) {
                    if (super.seats[i].interactFirst(entityplayer)) {
                        if (i == 0) {
                            this.bombDelay = type.planeBombDelay;
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
        PlaneType type = this.getPlaneType();
        if (super.worldObj.isRemote && (key == 6 || key == 8 || key == 9)) {
            FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
            return true;
        } else {
            boolean canThrust = super.seats[0] != null && super.seats[0].riddenByEntity instanceof EntityPlayer
                    && ((EntityPlayer) super.seats[0].riddenByEntity).capabilities.isCreativeMode
                    || this.getDriveableData().fuelInTank > 0.0F;
            switch (key) {
                case 0:
                    if (canThrust || super.throttle < 0.0F) {
                        super.throttle += 0.002F;
                        if (super.throttle > 1.0F) {
                            super.throttle = 1.0F;
                        }
                    }

                    return true;
                case 1:
                    if (canThrust || super.throttle > 0.0F) {
                        super.throttle -= 0.005F;
                        if (super.throttle < -1.0F) {
                            super.throttle = -1.0F;
                        }

                        if (super.throttle < 0.0F && type.maxNegativeThrottle == 0.0F) {
                            super.throttle = 0.0F;
                        }
                    }

                    return true;
                case 2:
                    --this.flapsYaw;
                    return true;
                case 3:
                    ++this.flapsYaw;
                    return true;
                case 4:
                    ++this.flapsPitchLeft;
                    ++this.flapsPitchRight;
                    return true;
                case 5:
                    --this.flapsPitchLeft;
                    --this.flapsPitchRight;
                    return true;
                case 6:
                    if (super.seats[0].riddenByEntity != null) {
                        super.seats[0].riddenByEntity.mountEntity(null);
                    }

                    return true;
                case 7:
                    if (super.worldObj.isRemote
                            && (type.invInflight || Math.abs(super.throttle) < 0.1F && super.onGround)) {
                        FlansMod.proxy.openDriveableMenu((EntityPlayer) super.seats[0].riddenByEntity, super.worldObj,
                                this);
                    }

                    return true;
                case 8:
                case 9:
                    return super.pressKey(key, player);
                case 10:
                    FlansMod.proxy.changeControlMode((EntityPlayer) super.seats[0].riddenByEntity);
                    return true;
                case 11:
                    ++this.flapsPitchLeft;
                    --this.flapsPitchRight;
                    return true;
                case 12:
                    --this.flapsPitchLeft;
                    ++this.flapsPitchRight;
                    return true;
                case 13:
                    if (this.toggleTimer <= 0) {
                        this.varGear = !this.varGear;
                        player.addChatMessage(new ChatComponentText("Landing gear " + (this.varGear ? "down" : "up")));
                        this.toggleTimer = 10;
                        FlansMod.getPacketHandler().sendToServer(new PacketDriveableControl(this));
                    }

                    return true;
                case 14:
                    if (this.toggleTimer <= 0) {
                        this.varDoor = !this.varDoor;
                        if (type.hasDoor) {
                            player.addChatMessage(new ChatComponentText("Doors " + (this.varDoor ? "open" : "closed")));
                        }

                        this.toggleTimer = 10;
                        FlansMod.getPacketHandler().sendToServer(new PacketDriveableControl(this));
                    }

                    return true;
                case 15:
                    if (this.toggleTimer <= 0) {
                        if (type.hasWing) {
                            this.varWing = !this.varWing;
                            player.addChatMessage(new ChatComponentText("Switching mode"));
                        }

                        if (type.mode == EnumPlaneMode.VTOL) {
                            if (this.mode == EnumPlaneMode.HELI) {
                                this.mode = EnumPlaneMode.PLANE;
                            } else {
                                this.mode = EnumPlaneMode.HELI;
                            }

                            player.addChatMessage(new ChatComponentText(
                                    this.mode == EnumPlaneMode.HELI ? "Entering hover mode" : "Entering plane mode"));
                        }

                        this.toggleTimer = 10;
                        FlansMod.getPacketHandler().sendToServer(new PacketDriveableControl(this));
                    }

                    return true;
                case 16:
                    super.axes.setAngles(super.axes.getYaw(), 0.0F, 0.0F);
                    return true;
                case 18:
                    if (type.hasFlare && this.ticksFlareUsing <= 0 && this.flareDelay <= 0) {
                        this.ticksFlareUsing = type.timeFlareUsing * 20;
                        this.flareDelay = type.flareDelay;
                        if (super.worldObj.isRemote) {
                            FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
                        } else if (!type.flareSound.isEmpty()) {
                            PacketPlaySound.sendSoundPacket(super.posX, super.posY, super.posZ, 50.0D, super.dimension,
                                    type.flareSound, false);
                        }

                        return true;
                    }
                case 17:
                default:
                    return false;
            }
        }
    }

    public void updateKeyHeldState(int key, boolean held) {
        super.updateKeyHeldState(key, held);
        if (!super.worldObj.isRemote) {
            switch (key) {
                case 8:
                case 9:
            }
        }

    }

    public void onUpdate() {
        super.onUpdate();
        PlaneType type = this.getPlaneType();
        DriveableData data = this.getDriveableData();
        if (type == null) {
            FlansMod.log("Plane type null. Not ticking plane");
        } else {
            boolean thePlayerIsDrivingThis = this.worldObj.isRemote && this.seats[0] != null
                    && this.seats[0].riddenByEntity instanceof EntityPlayer
                    && FlansMod.proxy.isThePlayer((EntityPlayer) this.seats[0].riddenByEntity);
            ++this.ticksSinceUsed;
            if (!this.worldObj.isRemote && this.seats[0].riddenByEntity != null) {
                this.ticksSinceUsed = 0;
            }

            if (!this.worldObj.isRemote && TeamsManager.planeLife > 0
                    && this.ticksSinceUsed > TeamsManager.planeLife * 20) {
                this.setDead();
            }

            if (this.worldObj.isRemote && (this.varFlare || this.ticksFlareUsing > 0) && this.ticksExisted % 5 == 0) {
                FlansMod.proxy.spawnParticle("flansmod.flare", this.posX, this.posY, this.posZ,
                        this.motionX + (this.rand.nextDouble() - 0.5D), this.motionY,
                        this.motionZ + (this.rand.nextDouble() - 0.5D));
            }

            if (this.ticksFlareUsing > 0) {
                --this.ticksFlareUsing;
            }

            if (this.flareDelay > 0) {
                --this.flareDelay;
            }

            if (this.bombDelay > 0) {
                --this.bombDelay;
            }

            if (this.gunDelay > 0) {
                --this.gunDelay;
            }

            if (this.toggleTimer > 0) {
                --this.toggleTimer;
            }

            if (this.hasEnoughFuel()) {
                this.propAngle += this.throttle / 7.0F;
            }

            this.flapsYaw *= 0.9F;
            this.flapsPitchLeft *= 0.9F;
            this.flapsPitchRight *= 0.9F;
            if (this.flapsYaw > 20.0F) {
                this.flapsYaw = 20.0F;
            }

            if (this.flapsYaw < -20.0F) {
                this.flapsYaw = -20.0F;
            }

            if (this.flapsPitchRight > 20.0F) {
                this.flapsPitchRight = 20.0F;
            }

            if (this.flapsPitchRight < -20.0F) {
                this.flapsPitchRight = -20.0F;
            }

            if (this.flapsPitchLeft > 20.0F) {
                this.flapsPitchLeft = 20.0F;
            }

            if (this.flapsPitchLeft < -20.0F) {
                this.flapsPitchLeft = -20.0F;
            }

            float throttleScaled;
            if (this.worldObj.isRemote && !thePlayerIsDrivingThis && this.serverPositionTransitionTicker > 0) {
                double x = this.posX + (this.serverPosX - this.posX) / (double) this.serverPositionTransitionTicker;
                double y = this.posY + (this.serverPosY - this.posY) / (double) this.serverPositionTransitionTicker;
                double z = this.posZ + (this.serverPosZ - this.posZ) / (double) this.serverPositionTransitionTicker;
                double dYaw = MathHelper.wrapAngleTo180_double(this.serverYaw - (double) this.axes.getYaw());
                double dPitch = MathHelper.wrapAngleTo180_double(this.serverPitch - (double) this.axes.getPitch());
                double dRoll = MathHelper.wrapAngleTo180_double(this.serverRoll - (double) this.axes.getRoll());
                this.rotationYaw = (float) ((double) this.axes.getYaw()
                        + dYaw / (double) this.serverPositionTransitionTicker);
                this.rotationPitch = (float) ((double) this.axes.getPitch()
                        + dPitch / (double) this.serverPositionTransitionTicker);
                throttleScaled = (float) ((double) this.axes.getRoll()
                        + dRoll / (double) this.serverPositionTransitionTicker);
                --this.serverPositionTransitionTicker;
                this.setPosition(x, y, z);
                this.setRotation(this.rotationYaw, this.rotationPitch, throttleScaled);
            }

            boolean canThrust = this.seats[0] != null && this.seats[0].riddenByEntity instanceof EntityPlayer
                    && ((EntityPlayer) this.seats[0].riddenByEntity).capabilities.isCreativeMode
                    || data.fuelInTank > 0.0F;
            float throttlePull = 0.99F;
            if (this.seats[0] != null && this.seats[0].riddenByEntity != null && this.mode == EnumPlaneMode.HELI
                    && canThrust) {
                this.throttle = (this.throttle - 0.5F) * throttlePull + 0.5F;
            }

            float lastTickSpeed = (float) this.getSpeedXYZ();
            float sensitivityAdjust = this.throttle > 0.5F ? 1.5F - this.throttle : 4.0F * this.throttle - 1.0F;
            if (sensitivityAdjust < 0.0F) {
                sensitivityAdjust = 0.0F;
            }

            sensitivityAdjust *= 0.125F;
            float yaw = this.flapsYaw * (this.flapsYaw > 0.0F ? type.turnLeftModifier : type.turnRightModifier)
                    * sensitivityAdjust;
            float flapsPitch = (this.flapsPitchLeft + this.flapsPitchRight) / 2.0F;
            float pitch = flapsPitch * (flapsPitch > 0.0F ? type.lookUpModifier : type.lookDownModifier)
                    * sensitivityAdjust;
            float flapsRoll = (this.flapsPitchRight - this.flapsPitchLeft) / 2.0F;
            float roll = flapsRoll * (flapsRoll > 0.0F ? type.rollLeftModifier : type.rollRightModifier)
                    * sensitivityAdjust;
            if (this.mode == EnumPlaneMode.PLANE) {
                if (!this.isPartIntact(EnumDriveablePart.tail)) {
                    yaw = 0.0F;
                    pitch = 0.0F;
                }

                if (!this.isPartIntact(EnumDriveablePart.leftWing)) {
                    roll = (float) ((double) roll - 2.0D * this.getSpeedXZ());
                }

                if (!this.isPartIntact(EnumDriveablePart.rightWing)) {
                    roll = (float) ((double) roll + 2.0D * this.getSpeedXZ());
                }
            }

            this.axes.rotateLocalYaw(yaw);
            this.axes.rotateLocalPitch(pitch);
            this.axes.rotateLocalRoll(-roll);
            if (this.worldObj.isRemote && !FlansMod.proxy.mouseControlEnabled()) {
            }

            float g = 0.098000005F;
            float drag = 1.0F - 0.05F * type.drag;
            float wobbleFactor = 0.0F;
            throttleScaled = 0.01F * (type.maxThrottle + (data.engine == null ? 0.0F : data.engine.engineSpeed));
            if (!canThrust) {
                throttleScaled = 0.0F;
            }

            int numPropsWorking = 0;
            boolean numProps = false;
            float fuelConsumptionMultiplier = 2.0F;
            int numWingsIntact;
            int numProps1;
            switch (this.mode) {
                case HELI:
                    Iterator var20 = type.heliPropellers.iterator();

                    while (var20.hasNext()) {
                        Propeller prop = (Propeller) var20.next();
                        if (this.isPartIntact(prop.planePart)) {
                            ++numPropsWorking;
                        }
                    }

                    numProps1 = type.heliPropellers.size();
                    if (numProps1 != 0) {
                        Vector3f up = this.axes.getYAxis();
                        throttleScaled *= (float) (numPropsWorking / numProps1) * 2.0F;
                        float upwardsForce = this.throttle * throttleScaled + (g - throttleScaled / 2.0F);
                        if (this.throttle < 0.5F) {
                            upwardsForce = g * this.throttle * 2.0F;
                        }

                        if (!this.isPartIntact(EnumDriveablePart.blades)) {
                            upwardsForce = 0.0F;
                        }

                        this.motionX += upwardsForce * up.x * 0.5F;
                        this.motionY += upwardsForce * up.y;
                        this.motionZ += upwardsForce * up.z * 0.5F;
                        this.motionY -= g;
                        this.motionX *= drag;
                        this.motionY *= drag;
                        this.motionZ *= drag;
                        data.fuelInTank -= upwardsForce * fuelConsumptionMultiplier * data.engine.fuelConsumption;
                    }
                    break;
                case PLANE:
                    Iterator var22 = type.propellers.iterator();

                    while (var22.hasNext()) {
                        Propeller prop = (Propeller) var22.next();
                        if (this.isPartIntact(prop.planePart)) {
                            ++numPropsWorking;
                        }
                    }

                    numProps1 = type.propellers.size();
                    if (numProps1 != 0) {
                        Vector3f forwards = (Vector3f) this.axes.getXAxis().normalise();
                        if (lastTickSpeed > 2.0F) {
                            lastTickSpeed = 2.0F;
                        }

                        float newSpeed = lastTickSpeed + throttleScaled * 2.0F;
                        float proportionOfMotionToCorrect = 2.0F * this.throttle - 0.5F;
                        if (proportionOfMotionToCorrect < 0.0F) {
                            proportionOfMotionToCorrect = 0.0F;
                        }

                        if (proportionOfMotionToCorrect > 1.5F) {
                            proportionOfMotionToCorrect = 1.5F;
                        }

                        g = 0.049000002F;
                        this.motionY -= g;
                        numWingsIntact = 0;
                        if (this.isPartIntact(EnumDriveablePart.rightWing)) {
                            ++numWingsIntact;
                        }

                        if (this.isPartIntact(EnumDriveablePart.leftWing)) {
                            ++numWingsIntact;
                        }

                        float amountOfLift = 2.0F * g * this.throttle * (float) numWingsIntact / 2.0F;
                        if (amountOfLift > g) {
                            amountOfLift = g;
                        }

                        this.motionY += amountOfLift;
                        this.motionX *= 1.0F - proportionOfMotionToCorrect;
                        this.motionY *= 1.0F - proportionOfMotionToCorrect;
                        this.motionZ *= 1.0F - proportionOfMotionToCorrect;
                        this.motionX += proportionOfMotionToCorrect * newSpeed * forwards.x;
                        this.motionY += proportionOfMotionToCorrect * newSpeed * forwards.y;
                        this.motionZ += proportionOfMotionToCorrect * newSpeed * forwards.z;
                        this.motionX *= drag;
                        if (this.posY - this.prevPosY < 0.0D) {
                            this.motionY *= drag < 1.0F ? 0.999D : 1.0D;
                        } else {
                            this.motionY *= drag;
                        }

                        this.motionZ *= drag;
                        data.fuelInTank -= throttleScaled * fuelConsumptionMultiplier * data.engine.fuelConsumption;
                    }
                default:
                    break;
            }

            double motion = Math
                    .sqrt(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
            if (motion > 10.0D) {
                this.motionX *= 10.0D / motion;
                this.motionY *= 10.0D / motion;
                this.motionZ *= 10.0D / motion;
            }

            EntityWheel[] var51 = this.wheels;
            int var54 = var51.length;

            int var58;
            EntityWheel wheel;
            for (var58 = 0; var58 < var54; ++var58) {
                wheel = var51[var58];
                if (wheel != null && this.worldObj != null && type.floatOnWater
                        && this.worldObj.isAnyLiquid(wheel.boundingBox)) {
                    this.motionY += type.buoyancy;
                }
            }

            var51 = this.wheels;
            var54 = var51.length;

            for (var58 = 0; var58 < var54; ++var58) {
                wheel = var51[var58];
                if (wheel != null) {
                    wheel.prevPosY = wheel.posY;
                    wheel.moveEntity(this.motionX, this.motionY, this.motionZ);
                }
            }

            this.correctWheelPos();

            for (int i = 0; i < 2; ++i) {
                Vector3f amountToMoveCar = new Vector3f(this.motionX / 2.0D, this.motionY / 2.0D, this.motionZ / 2.0D);
                EntityWheel[] var60 = this.wheels;
                numWingsIntact = var60.length;

                for (int var61 = 0; var61 < numWingsIntact; ++var61) {
                    EntityWheel wheel1 = var60[var61];
                    if (wheel1 != null) {
                        this.onGround = true;
                        wheel1.onGround = true;
                        wheel1.rotationYaw = this.axes.getYaw();
                        Vector3f targetWheelPos = this.axes
                                .findLocalVectorGlobally(this.getPlaneType().wheelPositions[wheel1.ID].position);
                        Vector3f currentWheelPos = new Vector3f(wheel1.posX - this.posX, wheel1.posY - this.posY,
                                wheel1.posZ - this.posZ);
                        float targetWheelLength = targetWheelPos.length();
                        float currentWheelLength = currentWheelPos.length();
                        float dLength = targetWheelLength - currentWheelLength;
                        float dAngle = Vector3f.angle(targetWheelPos, currentWheelPos);
                        float newLength = currentWheelLength + dLength * type.wheelSpringStrength;
                        Vector3f rotateAround = Vector3f.cross(targetWheelPos, currentWheelPos, null);
                        Matrix4f mat = new Matrix4f();
                        mat.m00 = currentWheelPos.x;
                        mat.m10 = currentWheelPos.y;
                        mat.m20 = currentWheelPos.z;
                        mat.rotate(dAngle * type.wheelSpringStrength, rotateAround);
                        if (this.ticksExisted > 5) {
                            this.axes.rotateGlobal(-dAngle * type.wheelSpringStrength, rotateAround);
                        }

                        Vector3f newWheelPos = new Vector3f(mat.m00, mat.m10, mat.m20);
                        newWheelPos.normalise().scale(newLength);
                        float wheelProportion = 0.75F;
                        Vector3f amountToMoveWheel = new Vector3f();
                        amountToMoveWheel.x = (newWheelPos.x - currentWheelPos.x) * (1.0F - wheelProportion);
                        amountToMoveWheel.y = (newWheelPos.y - currentWheelPos.y) * (1.0F - wheelProportion);
                        amountToMoveWheel.z = (newWheelPos.z - currentWheelPos.z) * (1.0F - wheelProportion);
                        amountToMoveCar.x -= (newWheelPos.x - currentWheelPos.x) * (1.0F - wheelProportion);
                        amountToMoveCar.y -= (newWheelPos.y - currentWheelPos.y) * (1.0F - wheelProportion);
                        amountToMoveCar.z -= (newWheelPos.z - currentWheelPos.z) * (1.0F - wheelProportion);
                        amountToMoveCar.y = (float) ((double) amountToMoveCar.y
                                + (wheel1.posY - wheel1.prevPosY - this.motionY) * 0.5D / (double) this.wheels.length);
                        wheel1.moveEntity(amountToMoveWheel.x, amountToMoveWheel.y,
                                amountToMoveWheel.z);
                    }
                }

                this.moveEntity(amountToMoveCar.x, amountToMoveCar.y, amountToMoveCar.z);
            }

            if (this.ridingEntity != null
                    && this.ridingEntity.getClass().toString().indexOf("mcheli.aircraft.MCH_EntitySeat") > 0) {
                this.axes.setAngles(this.ridingEntity.rotationYaw + 90.0F, 0.0F, 0.0F);
            }

            this.checkForCollisions();
            if (this.throttle > 0.01F && this.throttle < 0.2F && this.soundPosition == 0 && this.hasEnoughFuel()) {
                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0D, this.dimension, type.startSound,
                        false);
                this.soundPosition = type.startSoundLength;
            }

            if (this.throttle > 0.2F && this.soundPosition == 0 && this.hasEnoughFuel()) {
                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0D, this.dimension,
                        type.engineSound, false);
                this.soundPosition = type.engineSoundLength;
            }

            if (this.soundPosition > 0) {
                --this.soundPosition;
            }

            EntitySeat[] var55 = this.seats;
            var54 = var55.length;

            for (var58 = 0; var58 < var54; ++var58) {
                EntitySeat seat = var55[var58];
                if (seat != null) {
                    seat.updatePosition();
                }
            }

            if (thePlayerIsDrivingThis) {
                FlansMod.getPacketHandler().sendToServer(new PacketPlaneControl(this));
                this.serverPosX = (int) this.posX;
                this.serverPosY = (int) this.posY;
                this.serverPosZ = (int) this.posZ;
                this.serverYaw = this.axes.getYaw();
            }

            float updateSpeed = 0.01F;
            if (!this.worldObj.isRemote) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketPlaneControl(this), this.posX, this.posY,
                        this.posZ, 200.0F, this.dimension);
            }

        }
    }

    public void setDead() {
        super.setDead();
        EntityWheel[] var1 = this.wheels;
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            EntityWheel wheel = var1[var3];
            if (wheel != null) {
                wheel.setDead();
            }
        }

    }

    public boolean gearDown() {
        return this.varGear;
    }

    public boolean attackEntityFrom(DamageSource damagesource, float i, boolean doDamage) {
        if (!this.worldObj.isRemote && !this.isDead) {
            PlaneType type = PlaneType.getPlane(this.driveableType);
            if (damagesource.damageType.equals("player") && damagesource.getEntity().onGround
                    && (this.seats[0] == null || this.seats[0].riddenByEntity == null)) {
                ItemStack planeStack = new ItemStack(type.item, 1, 0);
                planeStack.stackTagCompound = new NBTTagCompound();
                this.driveableData.writeToNBT(planeStack.stackTagCompound);
                this.entityDropItem(planeStack, 0.5F);
                this.setDead();
            }

            return super.attackEntityFrom(damagesource, i);
        } else {
            return true;
        }
    }

    public boolean canHitPart(EnumDriveablePart part) {
        return this.varGear || part != EnumDriveablePart.coreWheel && part != EnumDriveablePart.leftWingWheel
                && part != EnumDriveablePart.rightWingWheel && part != EnumDriveablePart.tailWheel;
    }

    public boolean attackEntityFrom(DamageSource damagesource, float i) {
        return this.attackEntityFrom(damagesource, i, true);
    }

    public PlaneType getPlaneType() {
        return PlaneType.getPlane(this.driveableType);
    }

    protected void dropItemsOnPartDeath(Vector3f midpoint, DriveablePart part) {
    }

    public String getBombInventoryName() {
        return "Bombs";
    }

    public String getMissileInventoryName() {
        return "Missiles";
    }

    public boolean hasMouseControlMode() {
        return true;
    }
}
