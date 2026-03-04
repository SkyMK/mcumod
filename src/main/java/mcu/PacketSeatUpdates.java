package com.flansmod.common.network;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import java.util.Iterator;

public class PacketSeatUpdates extends PacketBase {

    public int entityId;
    public int seatId;
    public float yaw;
    public float pitch;

    public PacketSeatUpdates() {
    }

    public PacketSeatUpdates(EntitySeat seat) {
        this.entityId = seat.driveable.getEntityId();
        this.seatId = seat.seatInfo.id;
        this.yaw = seat.looking.getYaw();
        this.pitch = seat.looking.getPitch();
    }

    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeInt(this.entityId);
        data.writeInt(this.seatId);
        data.writeFloat(this.yaw);
        data.writeFloat(this.pitch);
    }

    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        this.entityId = data.readInt();
        this.seatId = data.readInt();
        this.yaw = data.readFloat();
        this.pitch = data.readFloat();
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
            driveable.seats[this.seatId].prevLooking = driveable.seats[this.seatId].looking.clone();
            driveable.seats[this.seatId].looking.setAngles(this.yaw, this.pitch, 0.0F);
            FlansMod.getPacketHandler().sendToAllAround(this, driveable.posX, driveable.posY, driveable.posZ, 50.0F,
                    driveable.dimension);
        }

    }

    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer) {
        EntityDriveable driveable = null;
        Iterator var3 = clientPlayer.worldObj.loadedEntityList.iterator();

        while (var3.hasNext()) {
            Object obj = var3.next();
            if (obj instanceof EntityDriveable && ((Entity) obj).getEntityId() == this.entityId) {
                driveable = (EntityDriveable) obj;
                break;
            }
        }

        if (driveable != null) {
            if (driveable.seats[this.seatId] == null || driveable.seats[this.seatId].riddenByEntity == clientPlayer) {
                return;
            }

            driveable.seats[this.seatId].prevLooking = driveable.seats[this.seatId].looking.clone();
            driveable.seats[this.seatId].looking.setAngles(this.yaw, this.pitch, 0.0F);
        }

    }
}
