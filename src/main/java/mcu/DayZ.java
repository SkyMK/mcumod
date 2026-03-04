package mcu;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.functions.GenericIterableFactory;
import cpw.mods.fml.common.registry.EntityRegistry;
import mcu.entity.EntityCorpse;
import mcu.network.NetworkManager;
import mcu.network.PacketHandler;
import mcu.server.commands.MCUCommand;
import mcu.spawnsystem.SpawnSystem;
import mcu.teleport.Teleport;
import mcu.utils.PositionsHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.Vec3;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Mod(modid = "mcu", name = "McUniversal", version = DayZ.VERSION)
public class DayZ implements Consumer {
    public static final String VERSION = MCU.VERSION;
    public static CommonProxy proxy;
    public static NetworkManager network;
    public static boolean debug, gpsEnabled;
    public static int gpsX, gpsZ;
    @Mod.Instance("McUniversal")
    public static DayZ instance;
    public static boolean mcp;
    public static File dir = new File("MCULogs/");

    static {
        boolean server = FMLCommonHandler.instance().getEffectiveSide().isServer();
        if (server) {
            proxy = new CommonProxy();
        } else
            proxy = new mcu.client.ClientProxy();
    }

    static {
        if (FMLCommonHandler.instance().getEffectiveSide().isClient())
            try {
                Minecraft.class.getDeclaredField("mcProfiler");
                mcp = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    private int entityIndex = 0;

    public static void sendHint(EntityPlayer player, String hint, int time) {
        network.sendTo(network.createPacket(PacketHandler.ADD_HINT, hint, time), (EntityPlayerMP) player);
    }

    public static void sendHint(EntityPlayer player, String hint) {
        sendHint(player, hint, 50);
    }

    public static boolean inRadius(final EntityPlayer player, final EntityItem item) {
        return Vec3.createVectorHelper(player.posX, player.posY, player.posZ)
                .distanceTo(Vec3.createVectorHelper(item.posX, item.posY, item.posZ)) < 4.0;
    }

    public static void log(String message) {
        log("MCULogger", message);
    }

    public static void log(String fileName, String message) {
        if (FMLCommonHandler.instance().getEffectiveSide().isServer()) {
            if (!dir.exists())
                dir.mkdir();
            File f = new File(dir, fileName + ".txt");
            try {
                if (!f.exists())
                    f.createNewFile();
                String s = message + "\n";
                Files.write(f.toPath(), s.getBytes(), StandardOpenOption.APPEND);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> readAllLines(String fileName) {
        try {
            return Files.readAllLines((new File(dir, fileName + ".txt").toPath()));
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public static void printMessage(String message) {
        for (EntityPlayerMP playerMP : GenericIterableFactory.newCastingIterable(
                MinecraftServer.getServer().getConfigurationManager().playerEntityList, EntityPlayerMP.class)) {
            playerMP.addChatComponentMessage(
                    new ChatComponentText(EnumChatFormatting.GREEN + "[" + EnumChatFormatting.RED + "MCU"
                            + EnumChatFormatting.GREEN + "] " + EnumChatFormatting.RED + message));
        }
    }

    public static void printMessageToOps(String message) {
        for (EntityPlayerMP playerMP : GenericIterableFactory.newCastingIterable(
                MinecraftServer.getServer().getConfigurationManager().playerEntityList, EntityPlayerMP.class)) {
            if (isOP(playerMP))
                playerMP.addChatComponentMessage(new ChatComponentText(
                        EnumChatFormatting.GREEN + "[" + EnumChatFormatting.RED + "MCU Admin Logger"
                                + EnumChatFormatting.GREEN + "] " + EnumChatFormatting.RED + message));
        }
    }

    public static boolean isOP(EntityPlayerMP player) {
        return MinecraftServer.getServer().getConfigurationManager().func_152596_g(player.getGameProfile());
    }

    @Mod.EventHandler
    public void pre(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        Teleport.readAllLocations();
        instance = this;
        network = NetworkManager.registerPacketHandler(new PacketHandler());
        this.registerEntity(EntityCorpse.class);
        PositionsHelper.init();
        proxy.init();
        try {
            SpawnSystem.serverInit();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
        AchievementList.achievementList.clear();
    }

    @Mod.EventHandler
    public void command(FMLServerStartingEvent event) {
        event.registerServerCommand(new MCUCommand());
    }

    private void registerEntity(Class entityClass) {
        String idName = "MCUCorpse";
        EntityRegistry.registerGlobalEntityID(entityClass, idName, EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(entityClass, idName, this.entityIndex++, this, 64, 10, true);
    }

    @Override
    public void accept(Object t) {
        if (t instanceof String) {
            DayZ.network.sendToServer(DayZ.network.createPacket(53, t));
        }
    }
}