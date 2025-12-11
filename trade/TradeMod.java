package mcu.trade;

import com.google.common.base.Joiner;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.utils.SidedProtection;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.common.MinecraftForge;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import mcu.trade.entity.TradePlayer;
import mcu.trade.event.TradeEventListener;
import mcu.trade.network.NetworkManager;
import mcu.trade.network.TradeGuiHandler;
import mcu.trade.network.TradePacketHandler;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Mod(modid = TradeMod.MOD_ID, name = TradeMod.MOD_NAME, version = TradeMod.MOD_VERSION)
public class TradeMod{

    public static final String MOD_ID = "trade";
    public static final String MOD_NAME = "Trade";
    public static final String MOD_VERSION = "1.0";

    @Instance(TradeMod.MOD_ID)
    public static TradeMod instance;

    public static final boolean COMPILATION_SERVER = SidedProtection.SERVER;

    public static NetworkManager network;

    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    public static final int TRADE_READY_TIME = 20;
    public static final int TRADE_REQUEST_TIME = 20;

    @EventHandler
    public void start(FMLPreInitializationEvent e){
        LOGGER.info("Loading...");
        LOGGER.info("Create network system.");
        network = NetworkManager.registerPacketHandler(new TradePacketHandler());
        LOGGER.info("Register gui handler.");
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new TradeGuiHandler());
        LOGGER.info("Register event listener.");
        TradeEventListener listener = new TradeEventListener();
        MinecraftForge.EVENT_BUS.register(listener);
        FMLCommonHandler.instance().bus().register(listener);
        LOGGER.info("Successfully loaded!");
    }

    public static String buildLogTrade(TradePlayer player, TradePlayer other, int sendMoney){
        if(!COMPILATION_SERVER){
            return null;
        }

        StringBuilder logData = new StringBuilder(512);
        logData.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss> ").format(new Date()));
        List<String> items = IntStream.range(0, player.inventoryTrade.getSizeInventory()).mapToObj(player.inventoryTrade::getStackInSlot).filter(item -> item != null).map(item -> item.stackSize + " " + item.getDisplayName()).collect(Collectors.toList());
        if(!items.isEmpty()){
            logData.append(String.format("%s отправил (%d Руб, %s) игроку %s", player.getEntityPlayer().getCommandSenderName(), sendMoney, Joiner.on(", ").join(items), other.getEntityPlayer().getCommandSenderName()));
        }else{
            logData.append(String.format("%s отправил %d Руб игроку %s", player.getEntityPlayer().getCommandSenderName(), sendMoney, other.getEntityPlayer().getCommandSenderName()));

        }
        return logData.toString();
    }
}