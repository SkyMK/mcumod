// 
// Decompiled by Procyon v0.5.36
// 

package mcu.inventory.other;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import mcu.client.gui.inventory.PlayerInventoryProperty;
import mcu.inventory.network.NetworkWrapper;
import mcu.inventory.network.packages.PackageOpenGui;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import org.lwjgl.opengl.GL11;

public class ClientEvents {
    public static IIcon NVDIcon;
    public static IIcon BackpackIcon;
    public static IIcon FlashlightIcon;
    public static IIcon CarIcon;
    private boolean renderNVD;
    private int coolDownSwitch;

    @SubscribeEvent
    public void onOpenGui(final GuiOpenEvent e) {
        if (e.gui instanceof GuiInventory) {
            final EntityPlayer player = FMLClientHandler.instance().getClient().thePlayer;
            if (!player.capabilities.isCreativeMode) {
                e.setCanceled(true);
                NetworkWrapper.instance.sendToServer(new PackageOpenGui(0));
            } else {
                e.setCanceled(false);
            }
        }
    }

    @SubscribeEvent
    public void onPlayerRenderTick(final RenderPlayerEvent.Specials.Post e) {
        if (e.entityPlayer == null) {
            return;
        }
    }

    @SubscribeEvent
    public void keyPress(final InputEvent.KeyInputEvent e) {
    }

    @SubscribeEvent
    public void tickClient(final TickEvent.ClientTickEvent e) {
        if (Minecraft.getMinecraft().theWorld == null
                || Minecraft.getMinecraft().theWorld.getTotalWorldTime() % 10L != 0L) {
            return;
        }
        if (this.coolDownSwitch > 0) {
            --this.coolDownSwitch;
        }
        final PlayerInventoryProperty property = PlayerInventoryProperty
                .get(Minecraft.getMinecraft().thePlayer);
        this.renderNVD = (property.inventory.backpackInventory[0] != null);
    }

    @SubscribeEvent(priority = EventPriority.LOW)
    public void removeHPandFOOD(final RenderGameOverlayEvent.Pre e) {
        if (e.type == RenderGameOverlayEvent.ElementType.HEALTH || e.type == RenderGameOverlayEvent.ElementType.FOOD) {
            e.setCanceled(true);
        }
    }

    @SubscribeEvent
    public void renderNVD(final RenderGameOverlayEvent.Post e) {
        if (e.type == RenderGameOverlayEvent.ElementType.HOTBAR && this.renderNVD) {
            final Minecraft mc = Minecraft.getMinecraft();
            final ScaledResolution res = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
            final Tessellator tes = Tessellator.instance;
            GL11.glEnable(3042);
            mc.getTextureManager().bindTexture(new ResourceLocation("backpackmod", "textures/circle.png"));
            tes.startDrawingQuads();
            tes.addVertexWithUV(0.0, 0.0, 0.0, 0.0, 0.0);
            tes.addVertexWithUV(0.0, res.getScaledHeight(), 0.0, 0.0, 1.0);
            tes.addVertexWithUV(res.getScaledWidth(), res.getScaledHeight(), 0.0, 1.0, 1.0);
            tes.addVertexWithUV(res.getScaledWidth(), 0.0, 0.0, 1.0, 0.0);
            tes.draw();
        }
    }

    @SubscribeEvent
    public void onTextureStitchEvent(final TextureStitchEvent.Pre event) {
        switch (event.map.getTextureType()) {
            case 1: {
                ClientEvents.NVDIcon = event.map.registerIcon("mcuniversal:icons/iconPnv");
                ClientEvents.BackpackIcon = event.map.registerIcon("mcuniversal:icons/iconBackpack");
                ClientEvents.FlashlightIcon = event.map.registerIcon("mcuniversal:icons/iconFlash");
                ClientEvents.CarIcon = event.map.registerIcon("mcuniversal:icons/iconCar");
                break;
            }
        }
    }
}
