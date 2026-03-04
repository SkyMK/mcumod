/*
 * Decompiled with CFR 0.150.
 *
 * Could not load the following classes:
 *  cpw.mods.fml.common.Mod
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  hcsmod.server.HcsServer
 *  net.minecraftforge.common.idnf
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package mcu.client.gui.menu;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.MCU;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.*;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.network.OldServerPinger;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.io.File;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SideOnly(value = Side.CLIENT)
public class GuiMCUMenu extends GuiScreen {
    public static final List<ServerData> servers = new ArrayList<ServerData>();
    public static final String HcsModVersion;
    private static final ResourceLocation minecraftTitleTextures;
    private final static OldServerPinger pinger = new OldServerPinger();
    private static final Charset UTF8;
    private static final String TOP_HINT;
    private static final String AT_BUTTON;
    private static final String LINK_BUTTON;
    private static final String[] links;
    private static final List<String> hints;
    private static final ResourceLocation bg;
    private static final File serverFile;
    private static final ExecutorService THREAD_POOL = Executors.newFixedThreadPool(4,
            new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).build());
    public static long nextServerOnlineUpdate;
    private static int selectedServer;
    private static boolean serverChanged;

    static {
        minecraftTitleTextures = new ResourceLocation("textures/gui/title/minecraft.png");
        HcsModVersion = MCU.VERSION;
        UTF8 = StandardCharsets.UTF_8;
        TOP_HINT = System.getProperty("dayz.TOP_HINT",
                "\u21da \u041d\u043e\u0432\u0438\u0447\u043a\u0430\u043c \u0440\u0435\u043a\u043e\u043c\u0435\u043d\u0434\u0443\u0435\u043c");
        AT_BUTTON = System.getProperty("dayz.AT_BUTTON",
                "\u00a7b\u041a\u0430\u043a \u0438\u0433\u0440\u0430\u0442\u044c? \u0413\u0430\u0439\u0434\u044b!");
        LINK_BUTTON = System.getProperty("dayz.LINK_BUTTON", "https://vk.com/mcuniversal");
        links = new String[]{"\u0413\u041e\u041b\u041e\u0421\u0423\u0419", "https://mcu.land/cabinet",
                "\u041a\u0430\u0440\u0442\u0430 DayZ", "https://mcu.land/cabinet",
                "\u041c\u0430\u0433\u0430\u0437\u0438\u043d", "https://mcu.land/cabinet",
                "\u0422\u0435\u0445.\u043f\u043e\u0434\u0434\u0435\u0440\u0436\u043a\u0430",
                "https://vk.com/mcuniversal",
                "\u00a7r\u00a7l\u21d3\u21d3\u21d3\u041d\u043e\u0432\u043e\u0441\u0442\u0438\u21d3\u21d3\u21d3",
                "https://vk.com/mcuniversal", "\u041d\u0430\u0448 Discord", "https://discord.gg/ygTyQSu5zq",
                "\u0413\u0440\u0443\u043f\u043f\u0430 VK", "https://vk.com/mcuniversal",
                "\u041a\u0430\u043a \u0438\u0433\u0440\u0430\u0442\u044c/\u0413\u0430\u0439\u0434\u044b",
                "https://vk.com/mcuniversal"};
        hints = new ArrayList<String>();
        bg = new ResourceLocation("mcuniversal:gui_" + (1 + new Random().nextInt(3)) + ".png");
        selectedServer = -1;
        serverChanged = false;
        serverFile = new File(Minecraft.getMinecraft().mcDataDir, "vLastServer");
    }

    private float mouseX;
    private float mouseY;
    private float backgroundX;
    private float backgroundY;
    private int guiScale = 1;

    private static void drawPlayer(int n, int n2, float f, float f2, EntityLivingBase entityLivingBase) {
        RenderManager.instance.cacheActiveRenderInfo(null, Minecraft.getMinecraft().renderEngine,
                Minecraft.getMinecraft().fontRenderer, EventHandler.menuPlayer(), null,
                Minecraft.getMinecraft().gameSettings, 0.0f);
        GL11.glEnable(2929);
        GL11.glEnable(2903);
        GL11.glPushMatrix();
        GL11.glTranslatef((float) (n - (n / 2 - 50) / 2), (float) (n2 / 2 + 85), 100.0f);
        GL11.glScalef(-75.0f, 75.0f, 75.0f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        float f3 = entityLivingBase.renderYawOffset;
        float f4 = entityLivingBase.rotationYaw;
        float f5 = entityLivingBase.rotationPitch;
        float f6 = entityLivingBase.prevRotationYawHead;
        float f7 = entityLivingBase.rotationYawHead;
        GL11.glRotatef(135.0f, 0.0f, 1.0f, 0.0f);
        RenderHelper.enableStandardItemLighting();
        GL11.glRotatef(-135.0f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(-((float) Math.atan(f2 / 40.0f)) * 7.5f, 1.0f, 0.0f, 0.0f);
        entityLivingBase.renderYawOffset = (float) Math.atan((double) (f / 40.0f) - 0.5) * 20.0f;
        entityLivingBase.rotationYaw = (float) Math.atan(f / 40.0f) * 40.0f;
        entityLivingBase.rotationPitch = -((float) Math.atan(f2 / 40.0f)) * 20.0f;
        entityLivingBase.rotationYawHead = entityLivingBase.rotationYaw;
        entityLivingBase.prevRotationYawHead = entityLivingBase.rotationYaw;
        GL11.glTranslatef(0.0f, entityLivingBase.yOffset, 0.0f);
        RenderManager.instance.playerViewY = 180.0f;
        RenderManager.instance.renderEntityWithPosYaw(entityLivingBase, 0.0, 0.0, 0.0, 0.0f, 1.0f);
        entityLivingBase.renderYawOffset = f3;
        entityLivingBase.rotationYaw = f4;
        entityLivingBase.rotationPitch = f5;
        entityLivingBase.prevRotationYawHead = f6;
        entityLivingBase.rotationYawHead = f7;
        GL11.glPopMatrix();
        RenderHelper.disableStandardItemLighting();
        GL11.glDisable(32826);
        OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GL11.glDisable(3553);
        OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
        GL11.glDisable(2929);
    }

    public static void drawRectF(float f, float f2, float f3, float f4, int n) {
        float f5;
        if (f < f3) {
            f5 = f;
            f = f3;
            f3 = f5;
        }
        if (f2 < f4) {
            f5 = f2;
            f2 = f4;
            f4 = f5;
        }
        float f6 = (float) (n >> 24 & 0xFF) / 255.0f;
        float f7 = (float) (n >> 16 & 0xFF) / 255.0f;
        float f8 = (float) (n >> 8 & 0xFF) / 255.0f;
        float f9 = (float) (n & 0xFF) / 255.0f;
        Tessellator Tessellator2 = Tessellator.instance;
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(f7, f8, f9, f6);
        Tessellator2.startDrawingQuads();
        Tessellator2.addVertex(f, f4, 0.0);
        Tessellator2.addVertex(f3, f4, 0.0);
        Tessellator2.addVertex(f3, f2, 0.0);
        Tessellator2.addVertex(f, f2, 0.0);
        Tessellator2.draw();
        GL11.glEnable(3553);
        GL11.glDisable(3042);
    }

    private static void browse(String string) {
        try {
            Desktop.getDesktop().browse(new URI(string));
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public void updateScreen() {
        if (serverChanged) {
            serverChanged = false;
        }
        pingTick();
    }

    @Override
    public void initGui() {
        servers.clear();
        servers.add(new ServerData("DayZ Lite", "37.230.210.144:38324"));
        servers.add(new ServerData("DayZ PvP", "37.230.210.144:38325"));
        if (MCU.local) {
            servers.add(new ServerData("DayZ Client Debug", ""));
            servers.add(new ServerData("DayZ Server Debug", ""));
        }
        int n = this.width / 2 + 50;
        this.guiScale = Math.max(1,
                new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight).getScaleFactor());
        this.buttonList.add(this.button(0, 5, this.height - 85, 100, 20, "\u0418\u0433\u0440\u0430\u0442\u044c"));
        this.buttonList.add(
                this.button(1, 5, this.height - 60, 100, 20, "\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438"));
        this.buttonList.add(this.button(2, 5, this.height - 35, 100, 20, "\u0412\u044b\u0445\u043e\u0434"));
        this.buttonList.add(new GuiButton(3, this.width - (this.width / 2 - 50) / 2 - 50,
                this.height / 2 + 85 - 75 - 80, 100, 160, "") {
            @Override
            public void drawButton(Minecraft minecraft, int n, int n2) {
            }
        });
        nextServerOnlineUpdate = 0;
        for (int i = 0; i < links.length; i += 2) {
            final int n2 = i;
            this.buttonList.add(new GuiButton(4 + n2 / 2, 5, 5 + n2 * 6, 100, 11,
                    EnumChatFormatting.UNDERLINE + links[n2]) {
                public boolean field_82253_i;

                @Override
                public void drawButton(Minecraft minecraft, int n, int n22) {
                    FontRenderer fontRenderer = minecraft.fontRenderer;
                    GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                    this.field_82253_i = n >= this.xPosition && n22 >= this.yPosition && n < this.xPosition + this.width
                            && n22 < this.yPosition + this.height;
                    int n3 = n2 == 0 || n2 == links.length - 2 ? 0x55C055 : 0xD8D8D8;
                    float f = 1.0f / (float) GuiMCUMenu.this.guiScale;
                    GL11.glTranslatef(0.0f, f, 0.0f);
                    if (!this.enabled) {
                        n3 = 6250336;
                    } else if (this.field_82253_i) {
                        n3 = 0xFFFFA0;
                        drawRectF(this.xPosition, (float) this.yPosition - f, this.xPosition + this.width,
                                this.yPosition + this.height, 2130728192);
                    }
                    fontRenderer.drawString(this.displayString,
                            this.xPosition + this.width / 2 - fontRenderer.getStringWidth(this.displayString) / 2,
                            this.yPosition + 1, n3);
                    GL11.glTranslatef(0.0f, -f, 0.0f);
                }
            });
        }
    }

    @Override
    protected void actionPerformed(GuiButton guiButton) {
        if (guiButton.id == 10000) {
        } else if (guiButton.id == 0) {
            if (selectedServer >= 0 && selectedServer < servers.size()) {
                ServerData serverData = servers.get(selectedServer);
                MCU.server = serverData.serverName;
                if (MCU.local && !serverData.serverName.contains("Server")) {
                    this.mc.displayGuiScreen(new GuiSelectWorld(this));
                    return;
                }
                if (MCU.local && serverData.serverName.contains("Server")) {
                    this.mc.displayGuiScreen(new GuiMultiplayer(this));
                    return;
                }
                FMLClientHandler.instance().connectToServer(this, serverData);
            }
        } else if (guiButton.id == 1) {
            this.mc.displayGuiScreen(new GuiOptions(this, this.mc.gameSettings));
        } else if (guiButton.id == 2) {
            this.mc.shutdown();
        } else if (guiButton.id == 3) {
            if (EventHandler.menuPlayer().hurtTime <= 1) {
                float f = (-this.mouseX + 0.5f) * (float) this.width - (float) (this.width - (this.width / 2 - 50) / 2);
                this.mouseX = (float) ((double) this.mouseX - (double) f * 2.5 / (double) this.width);
                f = (-this.mouseY + 0.5f) * (float) this.height - (float) (this.height / 2 + 85 - 75 + 80);
                this.mouseY = (float) ((double) this.mouseY - (double) f * 2.5 / (double) this.height);
                EventHandler.menuPlayer().hurtTime = 5;
            }
        } else if (guiButton.id == -1) {
            GuiMCUMenu.browse("https://" + LINK_BUTTON);
        } else if (guiButton.id >= 0) {
            GuiMCUMenu.browse(links[(guiButton.id - 4) * 2 + 1]);
        }
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        Minecraft.getMinecraft().gameSettings.fancyGraphics = false;
        int n3;
        this.backgroundX = (this.backgroundX * 29.0f + -((float) n / (float) this.width - 0.5f)) / 30.0f;
        this.backgroundY = (this.backgroundY * 29.0f + -((float) n2 / (float) this.height - 0.5f)) / 30.0f;
        if (this.backgroundX > 0.5f) {
            this.backgroundX = 0.5f;
        } else if (this.backgroundX < -0.5f) {
            this.backgroundX = -0.5f;
        }
        if (this.backgroundY > 0.5f) {
            this.backgroundY = 0.5f;
        } else if (this.backgroundY < -0.5f) {
            this.backgroundY = -0.5f;
        }
        this.mouseX = (this.mouseX * 4.0f + -((float) n / (float) this.width - 0.5f)) / 5.0f;
        this.mouseY = (this.mouseY * 4.0f + -((float) n2 / (float) this.height - 0.5f)) / 5.0f;
        float f2 = (float) this.width / (float) this.height;
        float f3 = Math.min(this.width, this.height) / 25;
        double d = Math.max(f3, 10.0f);
        double d2 = Math.max(f3, 10.0f);
        double d3 = (double) this.backgroundX * d * 2.0;
        double d4 = (double) this.backgroundY * d2 * 2.0;
        if (1.7777778f > f2) {
            d += ((float) this.height * 1.7777778f - (float) this.width) / 2.0f;
        } else {
            d2 += ((float) this.width / 1.7777778f - (float) this.height) / 2.0f;
        }
        this.mc.getTextureManager().bindTexture(bg);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        Tessellator Tessellator2 = Tessellator.instance;
        GL11.glColor4f(0.9f, 0.9f, 0.9f, 1.0f);
        Tessellator2.startDrawingQuads();
        Tessellator2.addVertexWithUV(d3 - d, (double) this.height + d2 * 1.25 + d4, -90.0, 0.0, 1.0);
        Tessellator2.addVertexWithUV((double) this.width + d + d3, (double) this.height + d2 * 1.25 + d4, -90.0, 1.0,
                1.0);
        Tessellator2.addVertexWithUV((double) this.width + d + d3, d4 - d2 * 0.75, -90.0, 1.0, 0.0);
        Tessellator2.addVertexWithUV(d3 - d, d4 - d2 * 0.75, -90.0, 0.0, 0.0);
        Tessellator2.draw();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        float f4 = 1.0f / (float) this.guiScale;
        String string = "MCU DayZ Client " + HcsModVersion;
        this.drawString(this.fontRendererObj, string, 3, this.height - 10, 0xFFFFFF);
        GL11.glEnable(2929);
        GL11.glTranslatef(0.0f, f4, 1.0f);
        for (int i = 0; i < links.length; i += 2) {
            drawRectF(5.0f, (float) (5 + i * 6) - f4, 105.0f, 5 + i * 6 + 11, -1728053248);
        }
        GL11.glTranslatef(0.0f, -f4, -1.0f);
        Gui.drawRect(5, 5, 105, links.length * 6 + 4, -1065386113);
        GL11.glDisable(2929);
        Gui.drawRect(5, 122, 105, 150, -1728053248);
        String string2 = "\u0412\u044b\u0431\u0435\u0440\u0438 \u0441\u0435\u0440\u0432\u0435\u0440 >";
        this.mc.fontRenderer.drawString(string2, 55 - this.fontRendererObj.getStringWidth(string2) / 2, 127, -2565928);
        string2 = "\u041f\u043e\u0442\u043e\u043c \u0436\u043c\u0438 \u0418\u0433\u0440\u0430\u0442\u044c";
        this.mc.fontRenderer.drawString(string2, 55 - this.fontRendererObj.getStringWidth(string2) / 2, 137, -2565928);
        super.drawScreen(n, n2, f);
        int n4 = this.width / 2 + 50;
        int n5 = this.width - (this.width / 2 - 50) / 2;
        int n6 = this.height / 2 + 85 - 75;
        GL11.glEnable(2929);
        if (n >= n5 - 50 && n <= n5 + 50 && n2 >= n6 - 80 && n2 <= n6 + 80) {
            Gui.drawRect(n5 - 50, n6 - 80, n5 + 50, n6 + 80, 520290560);
        }
        n6 = this.height - 25 - hints.size() * 9;
        for (String string3 : hints) {
            this.mc.fontRenderer.drawStringWithShadow(string3, 112, n6 += 9, 0x55FFFF);
        }
        int n7 = servers.size();
        if (n7 == 0) {
            this.mc.fontRenderer.drawString(
                    "\u0417\u0430\u0433\u0440\u0443\u0437\u043a\u0430 \u0441\u043f\u0438\u0441\u043a\u0430 \u0441\u0435\u0440\u0432\u0435\u0440\u043e\u0432",
                    120, 12, 49152);
            this.mc.fontRenderer.drawString(
                    "\u041f\u043e\u0434\u043e\u0436\u0434\u0438 \u043d\u0435\u0441\u043a\u043e\u043b\u044c\u043a\u043e \u0441\u0435\u043a\u0443\u043d\u0434",
                    120, 26, 49152);
            this.mc.fontRenderer.drawString(TOP_HINT, this.width / 2 + 51, 12, 49152);
        }
        for (n3 = 0; n3 < n7; ++n3) {
            ServerData serverData = servers.get(n3);
            if (serverData == null)
                continue;
            int n8 = 10 + n3 * 15;
            int n9 = 0xD8D8D8;
            drawRectF(115.0f + f4, (float) n8 + f4, (float) n4 - f4, (float) (n8 + 13) - f4, -1073741824);
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0f, 0.0f, -0.5f);
            if (n3 != selectedServer) {
                Gui.drawRect(115, n8, n4, n8 + 13, -1065386113);
            } else {
                Gui.drawRect(115, n8, n4, n8 + 13, -1073709312);
                n9 = 43520;
            }
            GL11.glPopMatrix();
            if (n >= 116 && n + 1 < n4 && n2 >= n8 - 1 && n2 < n8 + 13 - 1) {
                if (Mouse.isButtonDown(0)) {
                    selectedServer = n3;
                    serverChanged = true;
                }
                drawRectF(115.0f + f4, (float) n8 + f4, (float) n4 - f4, (float) (n8 + 13) - f4, 2130728192);
                n9 = n3 != selectedServer ? 0xFFFFA0 : 53760;
            }
            this.mc.fontRenderer.drawString(serverData.serverName, 119, n8 + 3, n9);
            if (serverData.populationInfo == null
                    || serverData.populationInfo != null && serverData.populationInfo.equals("")) {
                serverData.populationInfo = "Загрузка...";
            }
            this.mc.fontRenderer.drawString(serverData.populationInfo,
                    n4 - 4 - this.mc.fontRenderer.getStringWidth(serverData.populationInfo), n8 + 3, n9);
        }
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0f, 0.0f, -1.0f);
        Gui.drawRect(110, 5, this.width - 5, this.height - 15, -1728053248);
        if (this.mc.renderViewEntity == null) {
            this.mc.renderViewEntity = EventHandler.menuPlayer();
        }
        string2 = this.mc.getSession().getUsername();
        GL11.glTranslatef(
                (this.mouseX + (float) (this.width - (this.width / 2 - 50)) / 2.0f / (float) this.width) * -15.0f,
                (this.mouseY + ((float) this.height / 2.0f - 35.0f) / (float) this.height) * -15.0f, 200.0f);
        n3 = 255 - (int) ((MathHelper.sin((float) (System.currentTimeMillis() / 36L % 360L) * (float) Math.PI / 180.0f)
                + 1.0f) * 100.0f);
        this.mc.fontRenderer.drawString(string2,
                this.width - (this.width / 2 - 50) / 2 - this.mc.fontRenderer.getStringWidth(string2) / 2,
                this.height / 2 - 60, this.mc.renderViewEntity.hurtTime > 0 ? -5636096 : 0xFF00FF00 | n3 | n3 << 16);
        GL11.glDisable(2929);
        GL11.glPopMatrix();
        GuiMCUMenu.drawPlayer(this.width, this.height,
                (float) (this.width - (this.width / 2 - 50) / 2) + (this.mouseX - 0.5f) * (float) this.width,
                (float) (this.height / 2 - 35) + (this.mouseY - 0.5f) * (float) this.height, this.mc.renderViewEntity);
    }

    @Override
    protected void mouseClicked(int n, int n2, int n3) {
        super.mouseClicked(n, n2, n3);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    private GuiButton button(int n, int n2, int n3, int n4, int n5, String string) {
        return new GuiButton(n, n2, n3, n4, n5, string) {
            boolean field_82253_i;

            @Override
            public void drawButton(Minecraft minecraft, int n, int n2) {
                float f = 1.0f / (float) GuiMCUMenu.this.guiScale;
                FontRenderer fontRenderer = minecraft.fontRenderer;
                this.field_82253_i = n >= this.xPosition && n2 >= this.yPosition && n < this.xPosition + this.width
                        && n2 < this.yPosition + this.height;
                GL11.glEnable(2929);
                GL11.glPushMatrix();
                GL11.glTranslatef(0.0f, 0.0f, 1.0f);
                drawRectF((float) this.xPosition + f, (float) this.yPosition + f,
                        (float) (this.xPosition + this.width) - f, (float) (this.yPosition + this.height) - f,
                        0x7F000000);
                GL11.glPopMatrix();
                Gui.drawRect(this.xPosition, this.yPosition, this.xPosition + this.width, this.yPosition + this.height,
                        -1062557014);
                GL11.glDisable(2929);
                this.mouseDragged(minecraft, n, n2);
                int n3 = 0xE0E0E0;
                if (!this.enabled) {
                    n3 = -6250336;
                } else if (this.field_82253_i) {
                    drawRectF((float) this.xPosition + f, (float) this.yPosition + f,
                            (float) (this.xPosition + this.width) - f, (float) (this.yPosition + this.height) - f,
                            2130728192);
                    n3 = 0xFFFFA0;
                }
                this.drawCenteredString(fontRenderer, this.displayString, this.xPosition + this.width / 2,
                        this.yPosition + (this.height - 8) / 2, n3);
            }
        };
    }

    public void pingTick() {
        pinger.func_147223_a();
        if (nextServerOnlineUpdate < 0)
            nextServerOnlineUpdate = 200;
        if (nextServerOnlineUpdate == 0) {
            for (ServerData server : servers) {
                server.field_78841_f = true;
                server.pingToServer = -2L;
                server.serverMOTD = "";
                THREAD_POOL.submit(new PingTask(server, pinger));
                nextServerOnlineUpdate = 200;
            }
            FMLClientHandler.instance().setupServerList();
        }
        nextServerOnlineUpdate--;
    }

    @SideOnly(Side.CLIENT)
    private static final class PingTask implements Runnable {
        private final ServerData serverData;
        private final OldServerPinger pinger;

        public PingTask(ServerData serverData, OldServerPinger pinger) {
            this.serverData = serverData;
            this.pinger = pinger;
        }

        @Override
        public void run() {
            try {
                this.pinger.func_147224_a(this.serverData);
            } catch (UnknownHostException e) {
                this.serverData.pingToServer = -1L;
                this.serverData.serverMOTD = EnumChatFormatting.DARK_RED + "Can't resolve hostname";
                if (serverData.serverName.contains("Debug"))
                    this.serverData.populationInfo = "ВЫКЛ";
                else
                    this.serverData.populationInfo = "Тех.Работы";
            } catch (Exception e) {
                this.serverData.pingToServer = -1L;
                this.serverData.serverMOTD = EnumChatFormatting.DARK_RED + "Can't connect to server.";
                if (serverData.serverName.contains("Debug"))
                    this.serverData.populationInfo = "ВЫКЛ";
                else
                    this.serverData.populationInfo = "Тех.Работы";
            }
        }
    }
}
