package com.flansmod.client;

import com.flansmod.common.FlansMod;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketReload;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;

@SideOnly(Side.CLIENT)
public class KeyInputHandler {

    public static KeyBinding reloadKey = new KeyBinding("Reload key", 19, "Flan's Mod");
    Minecraft mc;

    public KeyInputHandler() {
        ClientRegistry.registerKeyBinding(reloadKey);
        this.mc = Minecraft.getMinecraft();
    }

    @SubscribeEvent
    public void onKeyInput(KeyInputEvent event) {
        if (!FMLClientHandler.instance().isGUIOpen(GuiChat.class) && this.mc.currentScreen == null) {
            EntityClientPlayerMP player = this.mc.thePlayer;
            Entity ridingEntity = player.ridingEntity;

            if (reloadKey.isPressed() && FlansModClient.shootTime(false) <= 0) {
                FlansMod.getPacketHandler().sendToServer(new PacketReload(false));
            }
        }
    }
}
