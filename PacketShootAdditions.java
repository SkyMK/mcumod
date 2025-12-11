package com.flansmod.common.network;

import com.flansmod.common.FlansMod;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketShootAdditions extends PacketBase {

    public String shooter;
    public double mx;
    public double my;
    public double mz;

    public PacketShootAdditions() {
    }

    public PacketShootAdditions(String shooter, double mx, double my, double mz) {
        this.shooter = shooter;
        this.mx = mx;
        this.my = my;
        this.mz = mz;
    }

    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        this.writeUTF(data, this.shooter);
        data.writeDouble(this.mx);
        data.writeDouble(this.my);
        data.writeDouble(this.mz);
    }

    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        this.shooter = this.readUTF(data);
        this.mx = data.readDouble();
        this.my = data.readDouble();
        this.mz = data.readDouble();
    }

    public void handleServerSide(EntityPlayerMP playerEntity) {
        FlansMod.log("Received particle packet on server. Disregarding.");
    }

    public void handleClientSide(EntityPlayer clientPlayer) {
    }
}
