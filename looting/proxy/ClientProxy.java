package mcu.looting.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import mcu.looting.chest.ChestSpecialRender;
import mcu.looting.chest.RenderChest;
import mcu.looting.chest.TileEntityChest;
import mcu.looting.other.ClientEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Override
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new ClientEvents());
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        RenderingRegistry.registerBlockHandler(RenderChest.renderID = RenderingRegistry.getNextAvailableRenderId(), new RenderChest());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChest.class, new ChestSpecialRender());
    }

    @Override
    public EntityPlayer getEntityPlayer(MessageContext ctx) {
        return ctx.side == Side.CLIENT ? Minecraft.getMinecraft().thePlayer : super.getEntityPlayer(ctx);
    }
}
