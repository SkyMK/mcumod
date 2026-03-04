package mcu.trade.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.client.ClientProxy;
import mcu.trade.TradeMod;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityEvent;
import mcu.trade.entity.TradePlayer;
import mcu.trade.network.TradePacketHandler;

public class TradeEventListener{

    @SubscribeEvent
    public void onEntityConstructing(EntityEvent.EntityConstructing e){
        if(!(e.entity instanceof EntityPlayer)){
            return;
        }

        EntityPlayer player = (EntityPlayer)e.entity;

        if(player.getExtendedProperties(TradeMod.MOD_ID) == null){
            player.registerExtendedProperties(TradeMod.MOD_ID, new TradePlayer(player));
        }
    }

    @SubscribeEvent
    public void onEntityConstructing(PlayerTickEvent e){
        if(e.phase == Phase.END){
            TradePlayer.forPlayer(e.player).onUpdate();
        }
    }

}
