package mcu.trade.network;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import mcu.trade.inventory.ContainerTrade;
import mcu.trade.inventory.GuiTrade;

public class TradeGuiHandler implements IGuiHandler{

    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z){
        return new ContainerTrade(player);
    }

    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z){
        // x - player money, y - other money, z - is creator
        return new GuiTrade(player, x, y, z == 1);
    }
}
