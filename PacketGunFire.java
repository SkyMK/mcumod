package com.flansmod.common.network;

import com.flansmod.common.FlansMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketGunFire extends PacketBase {

    public PacketGunFire() {
    }

    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
    }

    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
    }

    public void handleServerSide(EntityPlayerMP playerEntity) {

    }

    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer) {
        FlansMod.log("Received gun button packet on client. Skipping.");
    }
}
