package mcu.looting;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import mcu.utils.SidedProtection;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import mcu.looting.chest.ChestSpecialRender;
import mcu.looting.chest.RenderChest;
import mcu.looting.chest.TileEntityChest;
import mcu.looting.network.PacketRegister;
import mcu.looting.other.ClientEvents;
import mcu.looting.other.CommonEvents;
import mcu.looting.other.ModConfig;
import mcu.looting.other.ModItems;
import mcu.looting.proxy.CommonProxy;

import java.util.List;
import java.util.Random;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class LootingChestsMod {
    public static final boolean COMPILATION_SERVER = SidedProtection.SERVER;
    public static Random rnd = new Random();
    public static List<ItemStack> stacksToTab;
    public static CreativeTabs chestsTab;
    @Mod.Instance(Reference.MOD_ID)
    public static LootingChestsMod instance;
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) throws Exception {

        PacketRegister.register();
        registerTab();
        ModItems.register();
        GameRegistry.registerTileEntity(TileEntityChest.class, "chestEntity");

        if (COMPILATION_SERVER) {
            ModConfig.register(event);
            proxy.preInit(event);
        }
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new ClientEvents());
        if (COMPILATION_SERVER) {
            proxy.init(event);
            CommonEvents events = new CommonEvents();
            MinecraftForge.EVENT_BUS.register(events);
            FMLCommonHandler.instance().bus().register(events);
        }
    }


    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        if (!COMPILATION_SERVER) {
            RenderingRegistry.registerBlockHandler(RenderChest.renderID = RenderingRegistry.getNextAvailableRenderId(), new RenderChest());
            ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChest.class, new ChestSpecialRender());
        }
        if (COMPILATION_SERVER) {
            ModConfig.loadChests();
            proxy.postInit(event);
        }
    }

    private void registerTab() {
        chestsTab = new CreativeTabs(CreativeTabs.getNextID(), "chestsTab") {
            @Override
            public Item getTabIconItem() {
                return Item.getItemFromBlock(Blocks.chest);
            }

            @Override
            public void displayAllReleventItems(List list) {
                super.displayAllReleventItems(list);
                if (stacksToTab != null)
                    list.addAll(stacksToTab);
            }
        };
    }
}
