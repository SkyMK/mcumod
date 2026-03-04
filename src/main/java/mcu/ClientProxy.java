// 
// Decompiled by Procyon v0.5.36
// 

package mcu.inventory.proxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import mcu.inventory.other.ClientEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(final FMLPreInitializationEvent event) {
    }

    @Override
    public void init(final FMLInitializationEvent event) {
        final ClientEvents events = new ClientEvents();
        MinecraftForge.EVENT_BUS.register(events);
        FMLCommonHandler.instance().bus().register(events);
    }

    @Override
    public void postInit(final FMLPostInitializationEvent event) {
    }

    @Override
    public EntityPlayer getEntityPlayer(final MessageContext ctx) {
        return (ctx.side == Side.CLIENT) ? Minecraft.getMinecraft().thePlayer
                : super.getEntityPlayer(ctx);
    }
}
