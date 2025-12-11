package com.flansmod.common.network;

import com.flansmod.common.FlansMod;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketSpawnHole extends PacketBase {

    public double x;
    public double y;
    public double z;
    public int side;

    public PacketSpawnHole() {
    }

    public PacketSpawnHole(double x, double y, double z, int side) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.side = side;
    }

    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeDouble(this.x);
        data.writeDouble(this.y);
        data.writeDouble(this.z);
        data.writeInt(this.side);
    }

    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        this.x = data.readDouble();
        this.y = data.readDouble();
        this.z = data.readDouble();
        this.side = data.readInt();
    }

    public void handleServerSide(EntityPlayerMP playerEntity) {
        FlansMod.log("Received particle packet on server. Disregarding.");
    }

    public void handleClientSide(EntityPlayer clientPlayer) {
    }
}
