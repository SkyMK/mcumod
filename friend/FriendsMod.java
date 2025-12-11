package mcu.friend;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.friend.event.FriendsEventListener;
import mcu.friend.network.FriendsPacketHandler;
import mcu.friend.network.NetworkManager;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.input.Keyboard;

@Mod(modid = FriendsMod.MOD_ID, name = FriendsMod.MOD_NAME, version = FriendsMod.MOD_VERSION)
public class FriendsMod {

    public static final String MOD_ID = "MCUFriends";
    public static final String MOD_NAME = "MCU Friends Mod";
    public static final String MOD_VERSION = "1";
    public static final int REQUEST_TIME = 70;
    @Instance(FriendsMod.MOD_ID)
    public static FriendsMod INSTANCE;
    public static NetworkManager network;
    @SideOnly(Side.CLIENT)
    public static KeyBinding KEY_FRIENDS;

    @EventHandler
    public void start(FMLInitializationEvent e) {
        network = NetworkManager.registerPacketHandler(new FriendsPacketHandler());
        if (FMLCommonHandler.instance().getEffectiveSide().isClient()) {
            startClient();
        }
        FriendsEventListener listener = new FriendsEventListener();
        MinecraftForge.EVENT_BUS.register(listener);
        FMLCommonHandler.instance().bus().register(listener);
    }

    @SideOnly(Side.CLIENT)
    private void startClient() {
        KEY_FRIENDS = new KeyBinding("Friends Gui", Keyboard.KEY_B, "MCU Binds");
        ClientRegistry.registerKeyBinding(KEY_FRIENDS);
    }
}