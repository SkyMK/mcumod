// 
// Decompiled by Procyon v0.5.36
// 

package mcu.inventory.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.entity.player.EntityPlayer;

public abstract class CommonProxy {
    public abstract void preInit(final FMLPreInitializationEvent p0);

    public abstract void init(final FMLInitializationEvent p0);

    public abstract void postInit(final FMLPostInitializationEvent p0);

    public EntityPlayer getEntityPlayer(final MessageContext ctx) {
        return ctx.getServerHandler().playerEntity;
    }
}
