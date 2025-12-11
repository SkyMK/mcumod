// 
// Decompiled by Procyon v0.5.36
// 

package mcu.inventory;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import mcu.client.gui.inventory.ModGuiHandler;
import mcu.inventory.network.PacketRegister;
import mcu.inventory.other.CommonEvents;
import mcu.inventory.proxy.ClientProxy;
import mcu.inventory.proxy.CommonProxy;
import mcu.inventory.proxy.ServerProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = "backpackmod", name = "Backpack Mod", version = "1.0.0", acceptedMinecraftVersions = "[1.7.10]")
public class BackpackMod {
    public static boolean DEBUG;
    public static CreativeTabs backpackTab;
    @Mod.Instance("backpackmod")
    public static BackpackMod instance;
    public static CommonProxy proxy;

    static {
        boolean server = FMLCommonHandler.instance().getEffectiveSide().isServer();
        if (server) {
            proxy = new ServerProxy();
        } else
            proxy = new ClientProxy();
    }

    static {
        BackpackMod.DEBUG = false;
    }

    public static NBTTagCompound getNotNullTag(final ItemStack stack) {
        if (stack.getTagCompound() == null) {
            stack.setTagCompound(new NBTTagCompound());
        }
        return stack.getTagCompound();
    }

    @Mod.EventHandler
    public void preInit(final FMLPreInitializationEvent event) {
        BackpackMod.proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(final FMLInitializationEvent event) {
        BackpackMod.proxy.init(event);
        final CommonEvents events = new CommonEvents();
        MinecraftForge.EVENT_BUS.register(events);
        FMLCommonHandler.instance().bus().register(events);
        PacketRegister.register();
        NetworkRegistry.INSTANCE.registerGuiHandler(BackpackMod.instance, new ModGuiHandler());
    }

    @Mod.EventHandler
    public void postInit(final FMLPostInitializationEvent event) {
        BackpackMod.proxy.postInit(event);
    }
}
