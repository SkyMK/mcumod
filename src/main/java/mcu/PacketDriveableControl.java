package com.flansmod.common.network;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntityVehicle;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import java.util.Iterator;

public class PacketDriveableControl extends PacketBase {

    public int entityId;
    public double posX;
    public double posY;
    public double posZ;
    public float yaw;
    public float pitch;
    public float roll;
    public double motX;
    public double motY;
    public double motZ;
    public float avelx;
    public float avely;
    public float avelz;
    public float throttle;
    public float fuelInTank;
    public float steeringYaw;

    public PacketDriveableControl() {
    }

    public PacketDriveableControl(EntityDriveable driveable) {
        this.entityId = driveable.getEntityId();
        this.posX = driveable.posX;
        this.posY = driveable.posY;
        this.posZ = driveable.posZ;
        this.yaw = driveable.axes.getYaw();
        this.pitch = driveable.axes.getPitch();
        this.roll = driveable.axes.getRoll();
        this.motX = driveable.motionX;
        this.motY = driveable.motionY;
        this.motZ = driveable.motionZ;
        this.avelx = driveable.angularVelocity.x;
        this.avely = driveable.angularVelocity.y;
        this.avelz = driveable.angularVelocity.z;
        this.throttle = driveable.throttle;
        this.fuelInTank = driveable.driveableData.fuelInTank;
        if (driveable instanceof EntityVehicle) {
            EntityVehicle plane = (EntityVehicle) driveable;
            this.steeringYaw = plane.wheelsYaw;
        } else if (driveable instanceof EntityPlane) {
            EntityPlane plane1 = (EntityPlane) driveable;
            this.steeringYaw = plane1.flapsYaw;
        }

    }

    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeInt(this.entityId);
        data.writeDouble(this.posX);
        data.writeDouble(this.posY);
        data.writeDouble(this.posZ);
        data.writeFloat(this.yaw);
        data.writeFloat(this.pitch);
        data.writeFloat(this.roll);
        data.writeDouble(this.motX);
        data.writeDouble(this.motY);
        data.writeDouble(this.motZ);
        data.writeFloat(this.avelx);
        data.writeFloat(this.avely);
        data.writeFloat(this.avelz);
        data.writeFloat(this.throttle);
        data.writeFloat(this.fuelInTank);
        data.writeFloat(this.steeringYaw);
    }

    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        this.entityId = data.readInt();
        this.posX = data.readDouble();
        this.posY = data.readDouble();
        this.posZ = data.readDouble();
        this.yaw = data.readFloat();
        this.pitch = data.readFloat();
        this.roll = data.readFloat();
        this.motX = data.readDouble();
        this.motY = data.readDouble();
        this.motZ = data.readDouble();
        this.avelx = data.readFloat();
        this.avely = data.readFloat();
        this.avelz = data.readFloat();
        this.throttle = data.readFloat();
        this.fuelInTank = data.readFloat();
        this.steeringYaw = data.readFloat();
    }

    public void handleServerSide(EntityPlayerMP playerEntity) {
        EntityDriveable driveable = null;
        Iterator var3 = playerEntity.worldObj.loadedEntityList.iterator();

        while (var3.hasNext()) {
            Object obj = var3.next();
            if (obj instanceof EntityDriveable && ((Entity) obj).getEntityId() == this.entityId) {
                driveable = (EntityDriveable) obj;
                break;
            }
        }

        if (driveable != null) {
            this.updateDriveable(driveable, false);
        }

    }

    protected void updateDriveable(EntityDriveable driveable, boolean clientSide) {
        driveable.setPositionRotationAndMotion(this.posX, this.posY, this.posZ, this.yaw, this.pitch, this.roll,
                this.motX, this.motY, this.motZ, this.avelx, this.avely, this.avelz, this.throttle, this.steeringYaw);
        driveable.driveableData.fuelInTank = this.fuelInTank;
    }

    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer) {
        if (clientPlayer != null && clientPlayer.worldObj != null) {
            EntityDriveable driveable = null;
            Iterator var3 = clientPlayer.worldObj.loadedEntityList.iterator();

            while (var3.hasNext()) {
                Object obj = var3.next();
                if (obj instanceof EntityDriveable && ((Entity) obj).getEntityId() == this.entityId) {
                    driveable = (EntityDriveable) obj;
                    driveable.driveableData.fuelInTank = this.fuelInTank;
                    if (driveable.seats[0] != null && driveable.seats[0].riddenByEntity == clientPlayer) {
                        return;
                    }
                    break;
                }
            }

            if (driveable != null) {
                this.updateDriveable(driveable, true);
            }

        }
    }
}
