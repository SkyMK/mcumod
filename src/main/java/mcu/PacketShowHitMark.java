package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketShowHitMark extends PacketBase {

    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
    }

    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
    }

    public void handleServerSide(EntityPlayerMP playerEntity) {
    }

    public void handleClientSide(EntityPlayer clientPlayer) {
    }
}
