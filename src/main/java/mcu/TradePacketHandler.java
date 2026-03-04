package mcu.trade.network;

import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.DayZ;
import mcu.client.hud.DayZHud;
import mcu.trade.TradeMod;
import mcu.trade.entity.TradePlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.WorldServer;

import java.util.List;

public class TradePacketHandler implements IPacketHandler {

    public static final byte CREATE_TRADE = 0;
    public static final byte I_AM_READY = 1;
    public static final byte SYNC = 2;
    public static final byte SUCCESSFULLY_TRADE = 3;
    public static final byte CLEAN_UP = 4;
    public static final byte TRADE_REQUEST = 5;
    public static final byte GIVE_MONEY = 6;

    @SideOnly(Side.CLIENT)
    public void handleClientSide(PacketBuffer buf, byte id, Minecraft mc, WorldClient world, EntityClientPlayerMP player){
        if(id == CREATE_TRADE){
            EntityPlayer plr = (EntityPlayer)world.getEntityByID(buf.readInt());
            if(plr != null){
                TradePlayer tradePlayer = TradePlayer.forPlayer(plr);

                EntityPlayer target = (EntityPlayer)world.getEntityByID(buf.readInt());
                tradePlayer.createTrade(target);
            }
        }else if(id == SYNC){
            EntityPlayer plr = (EntityPlayer)world.getEntityByID(buf.readInt());
            if(plr != null){
                TradePlayer tradePlayer = TradePlayer.forPlayer(plr);

                tradePlayer.isReady = buf.readBoolean();
                tradePlayer.giveMoney = buf.readInt();
            }
        }else if(id == CLEAN_UP){
            EntityPlayer plr = (EntityPlayer)world.getEntityByID(buf.readInt());
            if(plr != null){
                TradePlayer tradePlayer = TradePlayer.forPlayer(plr);

                tradePlayer.cleanUp();
            }
        }else if(id == TRADE_REQUEST){
            TradePlayer tradePlayer = TradePlayer.forPlayer(player);
            EntityPlayer target = (EntityPlayer)world.getEntityByID(buf.readInt());

            tradePlayer.requestPlayer = target;
            tradePlayer.requestTime = TradeMod.TRADE_REQUEST_TIME;

        }
    }

    public void handleServerSide(PacketBuffer buf, byte id, WorldServer world, EntityPlayerMP player){
        if(!TradeMod.COMPILATION_SERVER){
            return;
        }

        TradePlayer tradePlayer = TradePlayer.forPlayer(player);

        if(id == CREATE_TRADE){
            EntityPlayer target = (EntityPlayer)world.getEntityByID(buf.readInt());
            tradePlayer.createTrade(target);
        }else if(id == I_AM_READY){
            tradePlayer.isReady = buf.readBoolean();
            TradePlayer otherTradePlayer = TradePlayer.forPlayer(tradePlayer.other);
            tradePlayer.sendSyncPacket();
            otherTradePlayer.sendSyncPacket();
        }else if(id == SUCCESSFULLY_TRADE){
            tradePlayer.successfullyTrade();
        }else if(id == TRADE_REQUEST){
            EntityPlayerMP target = (EntityPlayerMP)world.getEntityByID(buf.readInt());
            TradePlayer otherTradePlayer = TradePlayer.forPlayer(target);

            tradePlayer.requestPlayer = target;
            tradePlayer.requestTime = TradeMod.TRADE_REQUEST_TIME;
            DayZ.sendHint(target, EnumChatFormatting.WHITE + (player.getCommandSenderName() +" предлагает обмен") , 20);
            if(tradePlayer.requestPlayer == target && otherTradePlayer.requestPlayer == player){
                otherTradePlayer.createTrade(player);
            }else{
                FMLProxyPacket packet = TradeMod.network.createPacket(TRADE_REQUEST, player.getEntityId());
                TradeMod.network.sendTo(packet, target);
            }
        }else if(id == GIVE_MONEY){
            tradePlayer.giveMoney = buf.readInt();
            TradePlayer otherTradePlayer = TradePlayer.forPlayer(tradePlayer.other);
            tradePlayer.sendSyncPacket();
            otherTradePlayer.sendSyncPacket();
        }
    }

    public String getChannel(){
        return TradeMod.MOD_ID;
    }

}
