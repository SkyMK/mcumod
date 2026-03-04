package com.flansmod.client;

import com.flansmod.client.gui.GuiDriveableController;
import com.flansmod.client.model.RenderFlag;
import com.flansmod.client.model.RenderGun;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3i;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.RenderTickEvent;
import mcu.friend.entity.FriendsPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MouseHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.EnumSkyBlock;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TickHandlerClient {

    public static final ResourceLocation headshot = new ResourceLocation("flansmod", "textures/headshot.png");
    public static ArrayList blockLightOverrides = new ArrayList();
    public static int lightOverrideRefreshRate = 5;
    public static List killMessages = new ArrayList();
    private static GuiScreen guiDriveableController = null;
    private static final RenderItem itemRenderer = new RenderItem();
    int tickcount = 0;
    int tickcountflash = 0;
    int tickcountWounded = 0;
    boolean isInFlash;
    int flashTime;
    int xSize = 32;
    int ySize = 32;
    EntityPlayer entityPlayerFlash;

    public TickHandlerClient() {
        FMLCommonHandler.instance().bus().register(this);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static void addKillMessage(boolean headshot, InfoType infoType, String killer, String killed) {
        Iterator object = killMessages.iterator();
        while (object.hasNext()) {
            KillMessage killMessage;
            KillMessage killMessage2 = killMessage = (KillMessage) object.next();
            if (++killMessage2.line < 5)
                continue;
            killMessage2.timer = 0;
        }
        Object object1 = new KillMessage(headshot, infoType, killer, killed);
        killMessages.add(object1);
    }

    @SubscribeEvent
    public void eventHandler(MouseEvent event) {
        EntityClientPlayerMP player = Minecraft.getMinecraft().thePlayer;
        if (player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemGun
                && ((ItemGun) player.getCurrentEquippedItem().getItem()).type.oneHanded
                && Keyboard.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindSneak.getKeyCode())
                && Math.abs(event.dwheel) > 0) {
            event.setCanceled(true);
        }

    }

    @SubscribeEvent
    public void eventHandler(RenderGameOverlayEvent event) {
        Minecraft mc = Minecraft.getMinecraft();
        if (event.type == ElementType.CROSSHAIRS && FlansModClient.currentScope != null) {
            event.setCanceled(true);
        } else {
            ScaledResolution scaledresolution = new ScaledResolution(FlansModClient.minecraft,
                    FlansModClient.minecraft.displayWidth, FlansModClient.minecraft.displayHeight);
            int i = scaledresolution.getScaledWidth();
            int j = scaledresolution.getScaledHeight();
            GL11.glEnable(3042);
            GL11.glEnable(3008);
            Tessellator tessellator = Tessellator.instance;
            Iterator var26 = killMessages.iterator();
            int getScaledWidth = event.resolution.getScaledWidth();
            int getScaledHeight = event.resolution.getScaledHeight();
            TickHandlerClient.KillMessage var25;
            while (var26.hasNext()) {
                var25 = (TickHandlerClient.KillMessage) var26.next();
                FriendsPlayer client = FriendsPlayer.forPlayer(Minecraft.getMinecraft().thePlayer);

                if (!var25.headshot) {
                    mc.fontRenderer.drawString(var25.killedName, i - mc.fontRenderer.getStringWidth(var25.killedName) - 25, j - 42 - var25.line * 16, client.isInFriend(var25.killedName) ? 0x55FF55 : 0xFFFFFF);
                    mc.fontRenderer.drawString(var25.killerName, i - mc.fontRenderer.getStringWidth(var25.killerName) - mc.fontRenderer.getStringWidth(var25.killedName) - 42, j - 42 - var25.line * 16, client.isInFriend(var25.killerName) ? 0x55FF55 : 0xFFFFFF);
                } else {
                    Tessellator v0 = Tessellator.instance;
                    Minecraft.getMinecraft().renderEngine.bindTexture(TickHandlerClient.headshot);
                    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                    v0.startDrawingQuads();
                    final int v5 = 5;
                    final int v26 = getScaledWidth - Minecraft.getMinecraft().fontRenderer.getStringWidth(var25.killedName) - 42;
                    final int v27 = v26;
                    final int v8 = getScaledHeight - 41 - (var25.line << 4);
                    v0.addVertexWithUV(v27 - 16, v8 + 10, 90.0, 0.0, 1.0);
                    v0.addVertexWithUV(v27, v8 + 10, 90.0, 1.0, 1.0);
                    v0.addVertexWithUV(v27, v8 - 6, 90.0, 1.0, 0.0);
                    v0.addVertexWithUV(v27 - 16, v8 - 6, 90.0, 0.0, 0.0);
                    v0.draw();
                    mc.fontRenderer.drawString(var25.killedName, i - mc.fontRenderer.getStringWidth(var25.killedName) - 25, j - 42 - var25.line * 16, client.isInFriend(var25.killedName) ? 0x55FF55 : 0xFFFFFF);
                    mc.fontRenderer.drawString(var25.killerName, i - mc.fontRenderer.getStringWidth(var25.killerName) - mc.fontRenderer.getStringWidth(var25.killedName) - 60, j - 42 - var25.line * 16, client.isInFriend(var25.killerName) ? 0x55FF55 : 0xFFFFFF);
                }
            }
            GL11.glDisable(3042);

            RenderHelper.enableGUIStandardItemLighting();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glEnable(32826);
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240.0F, 240.0F);
            var26 = killMessages.iterator();

            while (var26.hasNext()) {
                var25 = (TickHandlerClient.KillMessage) var26.next();
                if (!var25.headshot) {
                    this.drawSlotInventory(mc.fontRenderer, new ItemStack(var25.weapon.item),
                            i - mc.fontRenderer.getStringWidth(var25.killedName) - 43, j - 47 - var25.line * 16);
                } else {
                    this.drawSlotInventory(mc.fontRenderer, new ItemStack(var25.weapon.item),
                            i - mc.fontRenderer.getStringWidth(var25.killedName) - 43, j - 47 - var25.line * 16);
                }
            }

            GL11.glDisable(3042);
            RenderHelper.disableStandardItemLighting();
        }

    }

    @SubscribeEvent
    public void renderTick(RenderTickEvent event) {
        switch (event.phase) {
            case START:
                RenderGun.smoothing = event.renderTickTime;
                this.renderTickStart(Minecraft.getMinecraft(), event.renderTickTime);
                break;
            case END:
                this.renderTickEnd(Minecraft.getMinecraft());
        }

    }

    @SubscribeEvent
    public void clientTick(ClientTickEvent event) {
        switch (event.phase) {
            case START:
                this.clientTickStart(Minecraft.getMinecraft());
                break;
            case END:
                this.clientTickEnd(Minecraft.getMinecraft());
        }

    }

    public void clientTickStart(Minecraft mc) {
        if (this.tickcount > 0) {
            --this.tickcount;
        }

        if (this.tickcountWounded > 0) {
            --this.tickcountWounded;
        }

        if (FlansMod.ticker % lightOverrideRefreshRate == 0 && mc.theWorld != null) {
            lightOverrideRefreshRate = mc.gameSettings.fancyGraphics ? 10 : 20;
            Iterator var2 = blockLightOverrides.iterator();

            while (var2.hasNext()) {
                Vector3i obj = (Vector3i) var2.next();
                mc.theWorld.updateLightByType(EnumSkyBlock.Block, obj.x, obj.y, obj.z);
            }

            blockLightOverrides.clear();
            var2 = mc.theWorld.playerEntities.iterator();

            int i;
            int k;
            int xd;
            int yd;
            int zd;
            Object var14;
            while (var2.hasNext()) {
                var14 = var2.next();
                EntityPlayer mecha = (EntityPlayer) var14;
                ItemStack x = mecha.getCurrentEquippedItem();
                if (x != null && x.getItem() instanceof ItemGun) {
                    GunType y = ((ItemGun) x.getItem()).type;
                    AttachmentType z = y.getGrip(x);
                    if (z != null && z.flashlight) {
                        for (i = 0; i < 2; ++i) {
                            MovingObjectPosition j = mecha
                                    .rayTrace(z.flashlightRange / 2.0F * (float) (i + 1), 1.0F);
                            if (j != null) {
                                k = j.blockX;
                                xd = j.blockY;
                                yd = j.blockZ;
                                zd = j.sideHit;
                                switch (zd) {
                                    case 0:
                                        --xd;
                                        break;
                                    case 1:
                                        ++xd;
                                        break;
                                    case 2:
                                        --yd;
                                        break;
                                    case 3:
                                        ++yd;
                                        break;
                                    case 4:
                                        --k;
                                        break;
                                    case 5:
                                        ++k;
                                }

                                blockLightOverrides.add(new Vector3i(k, xd, yd));
                                mc.theWorld.setLightValue(EnumSkyBlock.Block, k, xd, yd, 12);
                                mc.theWorld.updateLightByType(EnumSkyBlock.Block, k, xd + 1, yd);
                                mc.theWorld.updateLightByType(EnumSkyBlock.Block, k, xd - 1, yd);
                                mc.theWorld.updateLightByType(EnumSkyBlock.Block, k + 1, xd, yd);
                                mc.theWorld.updateLightByType(EnumSkyBlock.Block, k - 1, xd, yd);
                                mc.theWorld.updateLightByType(EnumSkyBlock.Block, k, xd, yd + 1);
                                mc.theWorld.updateLightByType(EnumSkyBlock.Block, k, xd, yd - 1);
                            }
                        }
                    }
                }
            }

            var2 = mc.theWorld.loadedEntityList.iterator();

            while (var2.hasNext()) {
                var14 = var2.next();
                if (var14 instanceof EntityBullet) {
                    EntityBullet var16 = (EntityBullet) var14;
                } else if (var14 instanceof EntityMecha) {
                    EntityMecha var15 = (EntityMecha) var14;
                    int var17 = MathHelper.floor_double(var15.posX);
                    int var18 = MathHelper.floor_double(var15.posY);
                    int var19 = MathHelper.floor_double(var15.posZ);
                    if (var15.lightLevel() > 0) {
                        blockLightOverrides.add(new Vector3i(var17, var18, var19));
                        mc.theWorld.setLightValue(EnumSkyBlock.Block, var17, var18, var19,
                                Math.max(mc.theWorld.getBlockLightValue(var17, var18, var19), var15.lightLevel()));
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, var17 + 1, var18, var19);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, var17 - 1, var18 + 1, var19);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, var17, var18 + 1, var19);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, var17, var18 - 1, var19);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, var17, var18, var19 + 1);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, var17, var18, var19 - 1);
                    }

                    if (var15.forceDark()) {
                        for (i = -3; i <= 3; ++i) {
                            for (int var20 = -3; var20 <= 3; ++var20) {
                                for (k = -3; k <= 3; ++k) {
                                    xd = i + var17;
                                    yd = var20 + var18;
                                    zd = k + var19;
                                    blockLightOverrides.add(new Vector3i(xd, yd, zd));
                                    mc.theWorld.setLightValue(EnumSkyBlock.Sky, xd, yd, zd,
                                            Math.abs(i) + Math.abs(var20) + Math.abs(k));
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    public void clientTickEnd(Minecraft minecraft) {
        Iterator<KillMessage> iterator = killMessages.iterator();
        while (iterator.hasNext()) {
            KillMessage killMessage = iterator.next();
            if (--killMessage.timer > 0)
                continue;
            iterator.remove();
        }

        RenderFlag.angle += 2.0F;
        FlansModClient.tick();
    }

    public void renderTickStart(Minecraft mc, float smoothing) {
        if (mc.currentScreen == null && FlansModClient.controlModeMouse) {
            MouseHelper mouse = mc.mouseHelper;
            Entity ridden = mc.thePlayer.ridingEntity;
            if (ridden instanceof EntityDriveable) {
                EntityDriveable entity = (EntityDriveable) ridden;
                entity.onMouseMoved(mouse.deltaX, mouse.deltaY);
            }
        }

        FlansModClient.renderTick(smoothing);
        if (mc.currentScreen instanceof GuiDriveableController) {
            guiDriveableController = mc.currentScreen;
            mc.currentScreen = null;
        } else {
            guiDriveableController = null;
        }

    }

    public void renderTickEnd(Minecraft mc) {
        if (mc.currentScreen == null && guiDriveableController != null) {
            mc.currentScreen = guiDriveableController;
            guiDriveableController = null;
        }

        Tessellator tessellator = Tessellator.instance;
        ScaledResolution scaledresolution = new ScaledResolution(FlansModClient.minecraft,
                FlansModClient.minecraft.displayWidth, FlansModClient.minecraft.displayHeight);
        int i = scaledresolution.getScaledWidth();
        int j = scaledresolution.getScaledHeight();
        if (FlansMod.isInFlash) {
            this.isInFlash = true;
            this.flashTime = FlansMod.flashTime;
            this.tickcountflash = 0;
            FlansMod.isInFlash = false;
            FlansMod.flashTime = 0;
        }

        if (this.isInFlash && this.tickcountflash < this.flashTime) {
            FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
            GL11.glEnable(3042);
            GL11.glDisable(2929);
            GL11.glDepthMask(false);
            GL11.glBlendFunc(770, 771);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glDisable(3008);
            mc.renderEngine.bindTexture(new ResourceLocation("flansmod", "gui/flash.png"));
            tessellator.startDrawingQuads();
            tessellator.addVertexWithUV(i / 2 - 2 * j, j, -90.0D, 0.0D, 1.0D);
            tessellator.addVertexWithUV(i / 2 + 2 * j, j, -90.0D, 1.0D, 1.0D);
            tessellator.addVertexWithUV(i / 2 + 2 * j, 0.0D, -90.0D, 1.0D, 0.0D);
            tessellator.addVertexWithUV(i / 2 - 2 * j, 0.0D, -90.0D, 0.0D, 0.0D);
            tessellator.draw();
            GL11.glDepthMask(true);
            GL11.glEnable(2929);
            GL11.glEnable(3008);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            ++this.tickcountflash;
        } else {
            this.isInFlash = false;
            this.flashTime = 0;
            this.tickcountflash = 0;
        }

    }

    private void drawSlotInventory(FontRenderer fontRenderer, ItemStack itemstack, int i, int j) {
        if (itemstack != null && itemstack.getItem() != null) {
            itemRenderer.renderItemIntoGUI(fontRenderer, FlansModClient.minecraft.renderEngine, itemstack, i, j);
            itemRenderer.renderItemOverlayIntoGUI(fontRenderer, FlansModClient.minecraft.renderEngine, itemstack, i, j);
        }
    }

    private static class KillMessage {

        public String killerName;
        public String killedName;
        public InfoType weapon;
        public int timer;
        public int line;
        public boolean headshot;

        public KillMessage(boolean head, InfoType infoType, String killer, String killed) {
            this.headshot = head;
            this.killerName = killer;
            this.killedName = killed;
            this.weapon = infoType;
            this.line = 0;
            this.timer = 200;
        }
    }
}
