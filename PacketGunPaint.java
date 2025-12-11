package com.flansmod.common.network;

import com.flansmod.common.guns.ContainerGunModTable;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketGunPaint extends PacketBase {

    private String paintjobName;

    public PacketGunPaint() {
    }

    public PacketGunPaint(String name) {
        this.paintjobName = name;
    }

    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        this.writeUTF(data, this.paintjobName);
    }

    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        this.paintjobName = this.readUTF(data);
    }

    public void handleServerSide(EntityPlayerMP playerEntity) {
        ContainerGunModTable gunModTable = (ContainerGunModTable) playerEntity.openContainer;
        gunModTable.clickPaintjob(this.paintjobName);
    }

    public void handleClientSide(EntityPlayer clientPlayer) {
    }
}
