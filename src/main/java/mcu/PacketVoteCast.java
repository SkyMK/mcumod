package com.flansmod.common.network;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.teams.TeamsManager;
import cpw.mods.fml.relauncher.Side;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketVoteCast extends PacketBase {

    public int vote;

    public PacketVoteCast() {
    }

    public PacketVoteCast(int vote) {
        this.vote = vote;
    }

    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeByte(this.vote);
    }

    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        this.vote = data.readByte();
    }

    public void handleServerSide(EntityPlayerMP playerEntity) {
        if (this.vote >= 0 && this.vote <= TeamsManager.getInstance().voteOptions.length) {
            PlayerData data = PlayerHandler.getPlayerData(playerEntity, Side.SERVER);
            data.vote = this.vote;
        } else {
            FlansMod.log("Invalid vote " + this.vote + " from " + playerEntity.getCommandSenderName());
        }
    }

    public void handleClientSide(EntityPlayer clientPlayer) {
        FlansMod.log("Received vote cast packet on client. Skipping.");
    }
}
