// 
// Decompiled by Procyon v0.5.36
// 

package mcu.client.hud;

import com.flansmod.client.TickHandlerClient;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.guns.ItemGun;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.DayZ;
import mcu.MCU;
import mcu.client.ClientEventHandler;
import mcu.client.ClientProxy;
import mcu.client.gui.utils.Util;
import mcu.entity.EntityCorpse;
import mcu.entity.EntityHouse;
import mcu.entity.ExtendedPlayer;
import mcu.juggernaut.JuggerHud;
import mcu.movement.MovementClient;
import mcu.utils.MCUInteract;
import mcu.utils.MCUInteractable;
import mcu.utils.SidedProtection;
import mcu.utils.Utils;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.*;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

import java.awt.*;
import java.io.*;
import java.util.List;
import java.util.*;
import java.util.function.DoubleFunction;

@SideOnly(Side.CLIENT)
public class DayZHud {
    public static int color;
    public static ResourceLocation low_hp_screen;
    public static ResourceLocation low_hp_buffer;
    public static int SHADER_GRAYSCALE;
    public static int SHADER_GRAYSCALE_V;
    public static boolean SHADER_TEXTURE;
    public static float SHADER_PREV_VALUE;
    public static boolean hideHud;
    public static Map<String, Hint> hints;
    public static ArrayList<String> textures = new ArrayList<String>();
    public static int timer;
    private static ResourceLocation leaves;
    private static ResourceLocation arrow;
    private static Minecraft mc;
    private static final ResourceLocation blood;
    private static final ResourceLocation food;
    private static final ResourceLocation thrist;
    private static final ResourceLocation detect;
    private static final ResourceLocation detect_1;
    private static final ResourceLocation detect_2;
    private static final ResourceLocation detect_3;
    private static final ResourceLocation detect_4;
    private static boolean wasF1;
    private static final List<String> $tmp_list;

    static {
        DayZHud.leaves = new ResourceLocation("mcuniversal:textures/gui/green.png");
        DayZHud.arrow = new ResourceLocation("mcuniversal:textures/gui/arrow.png");
        DayZHud.mc = Minecraft.getMinecraft();
        blood = new ResourceLocation("mcuniversal:textures/gui/blood.png");
        food = new ResourceLocation("mcuniversal:textures/gui/food.png");
        thrist = new ResourceLocation("mcuniversal:textures/gui/water.png");
        detect = new ResourceLocation("mcuniversal:textures/gui/run.png");
        $tmp_list = new ArrayList<>();
        (hints = new LinkedHashMap<>()).put("charstatus", new Hint() {
            @Override
            public boolean remove() {
                return false;
            }

            @Override
            public void addHints(final List<String> list) {
                final EntityClientPlayerMP r = DayZHud.mc.thePlayer;
                final ExtendedPlayer client = ExtendedPlayer.get(r);
                list.add("\u041a\u0440\u043e\u0432\u044c: " + (int) (r.getHealth() * 600.0f));
                list.add("GPS: " + MathHelper.floor_double(r.posX) + ", " + MathHelper.floor_double(r.posZ));
                if (r.isPotionActive(Potion.moveSlowdown)) {
                    list.add("§c\u0421\u043b\u043e\u043c\u0430\u043d\u044b \u043d\u043e\u0433\u0438");
                }
                final int hunger = Minecraft.getMinecraft().thePlayer.getFoodStats().getFoodLevel();
                if (timer > 0)
                    timer--;
                if (Keyboard.isKeyDown(Keyboard.KEY_DELETE)) {
                    list.add("" + ItemGun.bullets.size());
                    list.add("" + ModelGun.displayLists.size());
                    list.add("" + TickHandlerClient.killMessages.size());
                }
                DoubleFunction<Double> fun = (d) -> d > 0 ? -d : d;
                if (hunger >= 78000) {
                    list.add(
                            "§c\u0423\u043c\u0438\u0440\u0430\u044e \u043e\u0442 \u0433\u043e\u043b\u043e\u0434\u0430");
                } else if (hunger >= 54600) {
                    list.add("§e\u0413\u043e\u043b\u043e\u0434\u0435\u043d");
                }
                if (client.bleeding) {
                    list.add("§c\u041a\u0440\u043e\u0432\u043e\u0442\u0435\u0447\u0435\u043d\u0438\u0435");
                }
                if (client.healing > 0) {
                    list.add("§a\u041b\u0435\u0447\u0435\u043d\u0438\u0435: "
                            + (100 - (int) ((client.healing / client.startHealValue) * 100)) + "%");
                }
                if (Utils.canTeleport(Minecraft.getMinecraft().thePlayer)) {
                    try {
                        list.add("MCU Menu открывается на [" + Keyboard.getKeyName(ClientProxy.mcu_menu.getKeyCode())
                                + "]");
                    } catch (Exception e) {
                        list.add("Найс бинд на MCU Menu бро");
                    }
                }
                if (r.ridingEntity != null && r.ridingEntity instanceof EntityHouse) {
                    list.add("§cСуицид в доме уберет дом с карты");
                }
                if (Utils.inSafezone(r)) {
                    list.add("§aНеуязвим на сейфзоне");
                } else {
                    if (client.getInvisible() > 0) {
                        list.add("§eНеуязвимость " + client.getInvisible() + " сек.");
                    }
                }
                if (ClientEventHandler.motionTimer > 0) {
                    list.add("Movement " + ClientEventHandler.motionTimer);
                }
                if (Minecraft.getMinecraft().thePlayer.capabilities.isCreativeMode) {
                    list.add("BB Delta " + ClientEventHandler.boundingBoxDelta(Minecraft.getMinecraft().thePlayer));
                }
                if (r.ridingEntity instanceof EntitySeat) {
                    final EntitySeat entitySeat = (EntitySeat) r.ridingEntity;
                    if (entitySeat.driver && entitySeat.driveable != null) {
                        list.add("\u0413\u0430\u0437: " + (int) Math.floor(entitySeat.driveable.throttle * 100.0f)
                                + "%");
                    }
                }
            }
        });
    }

    static {
        low_hp_screen = new ResourceLocation("mcuniversal", "textures/gui/blood_hud.png");
        low_hp_buffer = new ResourceLocation("mcuniversal", "textures/gui/debug.png");
        int glGetUniformLocation = 0;
        int glCreateProgram;
        try {
            glCreateProgram = GL20.glCreateProgram();
            final int glCreateShader;
            GL20.glShaderSource(glCreateShader = GL20.glCreateShader(35632),
                    "uniform sampler2D image;\nuniform float V;\nvoid main(){\nvec3 texel=texture2D(image,gl_TexCoord[0].xy).rgb;\ngl_FragColor=vec4(texel.x,texel.y,texel.z,1.0);\nfloat c=dot(texel,vec3(0.333,0.333,0.333));\ngl_FragColor.r=c*V+gl_FragColor.r*(1-V);\ngl_FragColor.g=c*V+gl_FragColor.g*(1-V);\ngl_FragColor.b=c*V+gl_FragColor.b*(1-V);\n}");
            GL20.glCompileShader(glCreateShader);
            GL20.glAttachShader(glCreateProgram, glCreateShader);
            GL20.glLinkProgram(glCreateProgram);
            glGetUniformLocation = GL20.glGetUniformLocation(glCreateProgram, "V");
        } catch (Throwable t) {
            glCreateProgram = -1;
        }
        detect_1 = new ResourceLocation("mcuniversal:textures/gui/detect/level_1.png");
        detect_2 = new ResourceLocation("mcuniversal:textures/gui/detect/level_2.png");
        detect_3 = new ResourceLocation("mcuniversal:textures/gui/detect/level_3.png");
        detect_4 = new ResourceLocation("mcuniversal:textures/gui/detect/level_4.png");
        SHADER_GRAYSCALE = glCreateProgram;
        SHADER_GRAYSCALE_V = glGetUniformLocation;
    }

    private static void renderUseProgress(int n, int n2) {
        int n3 = n2 - 23;
        int n4 = n / 2 - 90;
        double n5 = (DayZHud.mc.thePlayer.getItemInUse() != null)
                ? DayZHud.mc.thePlayer.getItemInUse().getMaxItemUseDuration()
                : 0.0;
        double n6 = DayZHud.mc.thePlayer.getItemInUseCount();
        if (n5 != 0.0) {
            GuiScreen.drawRect(n4, n3, (int) (n4 + Math.min(1.0 - n6 / n5, 1.0) * 180.0), n3 + 2,
                    Integer.MIN_VALUE | color);
        }
    }

    private static void renderWaterOxygen(int n, int n2) {
        int n3 = n2 - 2;
        int n4 = n / 2 - 90;
        double n5 = 300.0 - DayZHud.mc.thePlayer.getAir();
        if (n5 != 0.0) {
            double min = Math.min(1.0 - Math.min(300.0, n5) / 300.0, 1.0);
            GuiScreen.drawRect((int) (n4 + min * 180.0), n3, n4 + 180, n3 + 2, -2130722624);
            GuiScreen.drawRect(n4, n3, (int) (n4 + min * 180.0), n3 + 2, -2141847553);
        }
    }

    public static void drawInteract(RenderGameOverlayEvent event) {
        if (!SidedProtection.CLIENT)
            return;
    }

    private static void drawNV(int n, int n2) {
        if (!SidedProtection.CLIENT)
            return;
        setColor(-8913033);
        GL11.glBlendFunc(774, 0);
        GL11.glDisable(3553);
        drawRect(0.0, 0.0, n, n2);
        GL11.glEnable(3553);
        GL11.glBlendFunc(770, 771);
    }

    public static void drawDayzGui(int n, int n2, Minecraft Minecraft, EntityPlayer entityPlayer) {
        if (!SidedProtection.CLIENT)
            return;
        ExtendedPlayer client = ExtendedPlayer.get(Minecraft.thePlayer);
        GL11.glEnable(3042);
        GL11.glDisable(3008);
        GL11.glEnable(3553);
        GL11.glBlendFunc(770, 771);
        final String string = "mcu.land " + entityPlayer.getCommandSenderName();
        final int min = Math.min(Minecraft.fontRenderer.getStringWidth(string), 80);
        GL11.glDisable(3553);
        GL11.glShadeModel(7425);
        final Tessellator instance = Tessellator.instance;
        final int n3 = n - 100;
        final int n4 = n - 80;
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.15f);
        drawTexturedRect(n / 2 - 70, 0.0, 140.0, 14.0);
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.25f);
        drawTexturedRect(0.0, 0.0, min - 10, 9.0);
        drawTexturedRect(n4, 0.0, 80.0, 9.0);
        instance.startDrawingQuads();
        instance.setColorRGBA_F(0.0f, 0.0f, 0.0f, 0.25f);
        instance.addVertex(n4, 9.0, 0.0);
        instance.addVertex(n4, 0.0, 0.0);
        instance.setColorRGBA_F(0.0f, 0.0f, 0.0f, 0.0f);
        instance.addVertex(n3, 0.0, 0.0);
        instance.addVertex(n3, 9.0, 0.0);
        instance.draw();
        final int n5 = min - 10;
        final int n6 = min + 10;
        instance.startDrawingQuads();
        instance.setColorRGBA_F(0.0f, 0.0f, 0.0f, 0.0f);
        instance.addVertex(n6, 9.0, 0.0);
        instance.addVertex(n6, 0.0, 0.0);
        instance.setColorRGBA_F(0.0f, 0.0f, 0.0f, 0.25f);
        instance.addVertex(n5, 0.0, 0.0);
        instance.addVertex(n5, 9.0, 0.0);
        instance.draw();
        final int n7 = n / 2 - 80;
        final int n8 = n7 - 10;
        final int n9 = n7 + 10;
        instance.startDrawingQuads();
        instance.setColorRGBA_F(0.0f, 0.0f, 0.0f, 0.15f);
        instance.addVertex(n9, 14.0, 0.0);
        instance.addVertex(n9, 0.0, 0.0);
        instance.setColorRGBA_F(0.0f, 0.0f, 0.0f, 0.0f);
        instance.addVertex(n8, 0.0, 0.0);
        instance.addVertex(n8, 14.0, 0.0);
        instance.draw();
        final int n10 = n / 2 + 80;
        final int n11 = n10 - 10;
        final int n12 = n10 + 10;
        instance.startDrawingQuads();
        instance.setColorRGBA_F(0.0f, 0.0f, 0.0f, 0.0f);
        instance.addVertex(n12, 14.0, 0.0);
        instance.addVertex(n12, 0.0, 0.0);
        instance.setColorRGBA_F(0.0f, 0.0f, 0.0f, 0.15f);
        instance.addVertex(n11, 0.0, 0.0);
        instance.addVertex(n11, 14.0, 0.0);
        instance.draw();
        GL11.glShadeModel(7424);
        GL11.glEnable(3553);
        float n13 = (entityPlayer.rotationYaw + 180.0f) % 360.0f;
        if (n13 < 0.0f) {
            n13 += 360.0f;
        }
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 0.75f);
        setColor(Integer.MIN_VALUE | color);
        GL11.glDisable(3553);
        GL11.glBegin(4);
        GL11.glVertex3f((float) (n / 2 + 2), 0.5f, 0.0f);
        GL11.glVertex3f((float) (n / 2 - 2), 0.5f, 0.0f);
        GL11.glVertex3f((float) (n / 2), 4.5f, 0.0f);
        GL11.glEnd();
        GL11.glEnable(3553);
        final int n14 = (int) (n13 / 15.0f) * 15;
        GL11.glPushMatrix();
        GL11.glTranslatef(-n13 % 15.0f * 1.5f, 0.0f, 0.0f);
        for (int j = -45; j <= 60; j += 15) {
            int n15 = (j + n14) % 360;
            if (n15 < 0) {
                n15 += 360;
            }
            int n16 = 0xC0000000 | color;
            int n17 = 1;
            int n18 = 1;
            String string2;
            if (n15 == 0) {
                string2 = "N";
            } else if (n15 == 45) {
                string2 = "NE";
            } else if (n15 == 90) {
                string2 = "E";
            } else if (n15 == 135) {
                string2 = "SE";
            } else if (n15 == 180) {
                string2 = "S";
            } else if (n15 == 225) {
                string2 = "SW";
            } else if (n15 == 270) {
                string2 = "W";
            } else if (n15 == 315) {
                string2 = "NW";
            } else {
                string2 = Integer.toString(n15);
                n16 = (Integer.MIN_VALUE | color);
                n17 = 0;
                n18 = 0;
            }
            final int n19 = (int) (((n16 & 0xFF000000) >>> 24)
                    * Math.min(Math.min(Math.abs(angularDistance((float) (j + n14 + 30 + 30), n13) / 15.0f),
                    Math.abs(angularDistance((float) (j + n14 - 30 - 30), n13) / 15.0f)), 1.0f)) << 24
                    | (n16 & color);
            if ((n19 >>> 24 & 0xFF) >= 4) {
                Minecraft.fontRenderer.drawString(string2,
                        n / 2 - Minecraft.fontRenderer.getStringWidth(string2) / 2 + (int) (j * 1.5f) + n17, 6 + n18,
                        n19);
                GL11.glDisable(3553);
                final boolean b = n15 % 45 == 0;
                drawRect(n / 2 + (int) (j * 1.5f), (b ? 3 : 4) + n18, 1.0, b ? 2.0 : 1.0);
                GL11.glEnable(3553);
            }
        }
        GL11.glPopMatrix();
        GL11.glEnable(3008);
        final int totalArmorValue = Minecraft.thePlayer.getTotalArmorValue();
        final String string3 = "28.05.2020 ";
        GuiScreen.drawRect(0, n2 - 17, n / 2 - 91, n2, 1073741824);
        GuiScreen.drawRect(n / 2 + 91, n2 - 17, n, n2, 1073741824);
        GL11.glEnable(3042);
        Minecraft.fontRenderer.drawString(string, 1, 1, 0xFF000000 | color);
        final String replace = Minecraft.debug.substring(0, Minecraft.debug.indexOf(" fps,")) + "fps v." + DayZ.VERSION;
        Minecraft.fontRenderer.drawString(replace, n - Minecraft.fontRenderer.getStringWidth(replace), 1,
                0xFF000000 | color);
        final String s = "\u0443\u0431\u0438\u0439\u0441\u0442\u0432\u0430";
        Minecraft.fontRenderer.drawString(s, n - Minecraft.fontRenderer.getStringWidth(s), n2 - 25, 0x7F000000 | color);
        final String string4 = client.getPlayersKills() + " \u0438\u0433\u0440\u043e\u043a\u0438";
        Minecraft.fontRenderer.drawString(string4, n - Minecraft.fontRenderer.getStringWidth(string4), n2 - 16,
                0xFF000000 | color);
        final String string5 = client.getZombiesKills() + " \u0437\u043e\u043c\u0431\u0438";
        Minecraft.fontRenderer.drawString(string5, n - Minecraft.fontRenderer.getStringWidth(string5), n2 - 8,
                0xFF000000 | color);
        String string6 = "\u043d\u0435\u0442";
        final ItemStack a = Minecraft.thePlayer.getHeldItem();
        if (a != null && a.getItem() instanceof ItemGun) {
            final ItemStack bulletItemStack = ((ItemGun) a.getItem()).getBulletItemStack(a, 0);
            if (bulletItemStack != null && bulletItemStack.getItem() != null) {
                string6 = (bulletItemStack.getMaxDamage() - bulletItemStack.getItemDamage()) + "/"
                        + bulletItemStack.getMaxDamage();
            }
        }
        Minecraft.fontRenderer.drawString(string6, n / 2 - 91 - Minecraft.fontRenderer.getStringWidth(string6), n2 - 8,
                0xFF000000 | color);
        final String s2 = "\u043f\u0430\u0442\u0440\u043e\u043d\u044b";
        Minecraft.fontRenderer.drawString(s2, n / 2 - 91 - Minecraft.fontRenderer.getStringWidth(s2), n2 - 16,
                0x7F000000 | color);
        final String server = MCU.server;
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0f, 0.0f, 100.0f);
        Minecraft.fontRenderer.drawString(server, 1, n2 - 25, 0xFF000000 | color);
        GL11.glPopMatrix();
        Minecraft.fontRenderer.drawString("\u0431\u0440\u043e\u043d\u044f", 1, n2 - 16, 0x7F000000 | color);
        Minecraft.fontRenderer.drawString((totalArmorValue + "/20"), 1, n2 - 8, 0xFF000000 | color);
        if (DayZ.gpsEnabled) {
            GL11.glPushMatrix();
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 0.5f);
            GL11.glTranslatef((float) (n / 2), (float) (n2 - 31), 0.0f);
            GL11.glRotated(
                    entityPlayer.rotationYaw
                            + Math.toDegrees(Math.atan2(DayZ.gpsX - entityPlayer.posX, DayZ.gpsZ - entityPlayer.posZ)),
                    0.0, 0.0, -1.0);
            Minecraft.renderEngine.bindTexture(DayZHud.arrow);
            drawRect(-8.0, -8.0, 16.0, 16.0);
            GL11.glPopMatrix();
        }
        drawTexturedRect(DayZHud.blood, (float) (n - 20), (float) (n2 - 99), 24.0f, 24.0f,
                Math.max(Math.min(Minecraft.thePlayer.getHealth() / 20.0f, 1.0f), 0.0f));
        drawTexturedRect(DayZHud.thrist, (float) (n - 20), (float) (n2 - 74), 24.0f, 24.0f, 1);
        drawTexturedRect(DayZHud.food, (float) (n - 20), (float) (n2 - 49), 24.0f, 24.0f,
                Minecraft.thePlayer.getFoodStats().getFoodLevel() / 20);
        drawTexturedRect(DayZHud.detect, (float) (n - 22), (float) (n2 - 123), 25.0f, 25.0f, MovementClient.sprinting);
        if (ClientEventHandler.detect_level > 0 || ClientEventHandler.shoot_time > 0) {
            if (ClientEventHandler.shoot_time == 0) {
                switch (ClientEventHandler.detect_level) {
                    case 1: {
                        mc.getTextureManager().bindTexture(detect_1);
                        break;
                    }
                    case 2: {
                        mc.getTextureManager().bindTexture(detect_2);
                        break;
                    }
                    case 3: {
                        mc.getTextureManager().bindTexture(detect_3);
                        break;
                    }
                    case 4: {
                        mc.getTextureManager().bindTexture(detect_4);
                    }
                }
                DayZHud.setColor(0xC0000000 | color);
            } else {
                mc.getTextureManager().bindTexture(detect_4);
                GL11.glColor4f(1.0f, 0.0f, 0.0f, 0.75f);
            }
            Tessellator Tessellator3 = Tessellator.instance;
            Tessellator3.startDrawingQuads();
            Tessellator3.addVertexWithUV(n - 28, n2 - 90, 90.0, 0.0, 1.0);
            Tessellator3.addVertexWithUV(n - 4, n2 - 90, 90.0, 1.0, 1.0);
            Tessellator3.addVertexWithUV(n - 4, n2 - 114, 90.0, 1.0, 0.0);
            Tessellator3.addVertexWithUV(n - 28, n2 - 114, 90.0, 0.0, 0.0);
            Tessellator3.draw();
        }
    }

    private static void renderTargetItem(final int n, final int n2, final float n3) {
        String s;
        try {
            s = Keyboard.getKeyName(ClientProxy.interact.getKeyCode());
        } catch (Exception ex) {
            s = Mouse.getButtonName(ClientProxy.interact.getKeyCode());
        }
        if (DayZHud.mc.thePlayer.ridingEntity != null) {
            return;
        }
        if (ClientEventHandler.interactTarget instanceof EntityCorpse) {
            final EntityCorpse entityCorpse = (EntityCorpse) ClientEventHandler.interactTarget;
            final int n4 = n / 2;
            int n5 = n2 / 2;
            final String string = "\u0422\u0440\u0443\u043f [" + entityCorpse.getUsernameKilled() + "]";
            final String s2 = string;
            final int n6 = n4 - DayZHud.mc.fontRenderer.getStringWidth(string) / 2;
            n5 += 2;
            final String string3 = "\u043d\u0430\u0436\u043c\u0438 [ " + s + " ]";
            DayZHud.mc.fontRenderer.drawString(string, n4 - DayZHud.mc.fontRenderer.getStringWidth(string) / 2, n5,
                    color);
            DayZHud.mc.fontRenderer.drawString(string3, n4 - DayZHud.mc.fontRenderer.getStringWidth(string3) / 2,
                    n5 + 9, color);
        } else if (ClientEventHandler.interactTarget instanceof MCUInteractable) {
            final MCUInteractable hcsInteractable = (MCUInteractable) ClientEventHandler.interactTarget;
            final int n8 = n / 2;
            final int n9 = n2 / 2;
            final String name = hcsInteractable.name();
            DayZHud.mc.fontRenderer.drawString(name, n8 - DayZHud.mc.fontRenderer.getStringWidth(name) / 2, n9 + 2,
                    color);
            final String string4 = "\u043d\u0430\u0436\u043c\u0438 [ " + s + " ]";
            DayZHud.mc.fontRenderer.drawString(string4, n8 - DayZHud.mc.fontRenderer.getStringWidth(string4) / 2,
                    n9 + 11, color);
        } else if (ClientEventHandler.interactTarget instanceof EntityOtherPlayerMP) {
            final EntityOtherPlayerMP entityOtherPlayerMP = (EntityOtherPlayerMP) ClientEventHandler.interactTarget;
            final int n10 = n / 2;
            final int n11 = n2 / 2;
            final String string7 = "\u041e\u0431\u043c\u0435\u043d [" + entityOtherPlayerMP.getCommandSenderName()
                    + "]";
            DayZHud.mc.fontRenderer.drawString(string7, n10 - DayZHud.mc.fontRenderer.getStringWidth(string7) / 2,
                    n11 + 2, color);
            final String string8 = "\u043d\u0430\u0436\u043c\u0438 [ " + s + " ]";
            DayZHud.mc.fontRenderer.drawString(string8, n10 - DayZHud.mc.fontRenderer.getStringWidth(string8) / 2,
                    n11 + 11, color);
        } else if (ClientEventHandler.interactTarget == MCUInteract.CAMP_FIRE) {
            final String s4 = "\u0417\u0430\u0436\u0435\u0447\u044c (\u0432\u043e\u0437\u044c\u043c\u0438 \u0437\u0430\u0436\u0438\u0433\u0430\u043b\u043a\u0443 \u0432 \u0440\u0443\u043a\u0443) ";
            final int n12 = n / 2;
            final int n13 = n2 / 2;
            DayZHud.mc.fontRenderer.drawString(s4, n12 - DayZHud.mc.fontRenderer.getStringWidth(s4) / 2, n13 + 2,
                    color);
            final String s5 = "\u041f\u043e\u0436\u0430\u0440\u0438\u0442\u044c \u043c\u044f\u0441\u043e (\u0432\u043e\u0437\u044c\u043c\u0438 \u0435\u0433\u043e \u0432 \u0440\u0443\u043a\u0443)";
            final int n14 = n12;
            DayZHud.mc.fontRenderer.drawString(s5, n14 - DayZHud.mc.fontRenderer.getStringWidth(s5) / 2, n13 + 9 + 2,
                    color);
            final String s6 = "\u041f\u043e\u0442\u0443\u0448\u0438\u0442\u044c (\u0432\u043e\u0437\u044c\u043c\u0438 \u0431\u0443\u0442\u044b\u043b\u043a\u0443 \u0441 \u0432\u043e\u0434\u043e\u0439) ";
            final int n15 = n14;
            DayZHud.mc.fontRenderer.drawString(s6, n15 - DayZHud.mc.fontRenderer.getStringWidth(s6) / 2,
                    n2 / 2 + 18 + 2, color);
            final String string9 = "\u0438 \u043d\u0430\u0436\u043c\u0438 \u043a\u043d\u043e\u043f\u043a\u0443 [ " + s
                    + " ]";
            DayZHud.mc.fontRenderer.drawString(string9, n15 - DayZHud.mc.fontRenderer.getStringWidth(string9) / 2,
                    n2 / 2 + 27 + 2, color);
        } else if (ClientEventHandler.interactTarget instanceof MCUInteract) {
            final String string10 = ((MCUInteract) ClientEventHandler.interactTarget).name + " [ " + s + " ]";
            DayZHud.mc.fontRenderer.drawString(string10, n / 2 - DayZHud.mc.fontRenderer.getStringWidth(string10) / 2,
                    n2 / 2 + 2, color);
        }
    }

    private static void drawRect(final double n, final double n2, final double n3, final double n4) {
        final Tessellator instance = Tessellator.instance;
        instance.startDrawingQuads();
        instance.addVertexWithUV(n + 0.0, n2 + n4, 0.0, 0.0, 1.0);
        instance.addVertexWithUV(n + n3, n2 + n4, 0.0, 1.0, 1.0);
        instance.addVertexWithUV(n + n3, n2 + 0.0, 0.0, 1.0, 0.0);
        instance.addVertexWithUV(n + 0.0, n2 + 0.0, 0.0, 0.0, 0.0);
        instance.draw();
    }

    public static void drawTexturedRect(final ResourceLocation resourceLocation, final float n, final float n2,
                                        final float n3, final float n4, float n5) {
        if (!SidedProtection.CLIENT)
            return;
        DayZHud.mc.renderEngine.bindTexture(resourceLocation);
        final long currentTimeMillis = System.currentTimeMillis();
        final float n6 = -0.01f + (float) (-0.05 * Math.sin(6.283185307179586 * (currentTimeMillis % 3000L) / 3000.0));
        final float n7 = -0.01f
                + (float) (-0.05 * Math.sin(6.283185307179586 * ((currentTimeMillis + 1000L) % 3000L) / 3000.0));
        final Tessellator instance = Tessellator.instance;
        GL11.glColor4f(0.5f, 0.5f, 0.5f, 0.75f);
        if (n5 < 0.0f) {
            instance.startDrawingQuads();
            instance.addVertexWithUV(n + 0.0f, n2 + n4, 90.0, 0.0, 1.0);
            instance.addVertexWithUV(n + n3, n2 + n4, 90.0, 1.0, 1.0);
            instance.addVertexWithUV(n + n3, n2 + 0.0f, 90.0, 1.0, 0.0);
            instance.addVertexWithUV(n + 0.0f, n2 + 0.0f, 90.0, 0.0, 0.0);
            instance.draw();
        } else if (n5 > 1.0f) {
            setColor(Integer.MAX_VALUE);
            instance.startDrawingQuads();
            instance.addVertexWithUV(n + 0.0f, n2 + n4, 90.0, 0.0, 1.0);
            instance.addVertexWithUV(n + n3, n2 + n4, 90.0, 1.0, 1.0);
            instance.addVertexWithUV(n + n3, n2, 90.0, 1.0, 0.0);
            instance.addVertexWithUV(n + 0.0f, n2, 90.0, 0.0, 0.0);
            instance.draw();
        } else {
            n5 = 1.0f - n5;
            instance.startDrawingQuads();
            instance.addVertexWithUV(n + 0.0f, n2 + n4 * MathHelper.clamp_float(n5 - n6 + 0.020833334f, 0.0f, 1.0f),
                    90.0, 0.0, 1.0f * MathHelper.clamp_float(n5 - n6 + 0.020833334f, 0.0f, 1.0f));
            instance.addVertexWithUV(n + n3, n2 + n4 * MathHelper.clamp_float(n5 - n7 + 0.020833334f, 0.0f, 1.0f), 90.0,
                    1.0, 1.0f * MathHelper.clamp_float(n5 - n7 + 0.020833334f, 0.0f, 1.0f));
            instance.addVertexWithUV(n + n3, n2 + 0.0f, 90.0, 1.0, 0.0);
            instance.addVertexWithUV(n + 0.0f, n2 + 0.0f, 90.0, 0.0, 0.0);
            instance.draw();
            setColor(0x64000000 | color);
            instance.startDrawingQuads();
            instance.addVertexWithUV(n + n3, n2 + n4 * (n5 - n7), 90.0, 1.0, n5 - n7);
            instance.addVertexWithUV(n + 0.0f, n2 + n4 * (n5 - n6), 90.0, 0.0, n5 - n6);
            instance.addVertexWithUV(n + 0.0f, n2 + n4 * MathHelper.clamp_float(n5 - n6 + 0.020833334f, 0.0f, 1.0f),
                    90.0, 0.0, MathHelper.clamp_float(n5 - n6 + 0.020833334f, 0.0f, 1.0f));
            instance.addVertexWithUV(n + n3, n2 + n4 * MathHelper.clamp_float(n5 - n7 + 0.020833334f, 0.0f, 1.0f), 90.0,
                    1.0, MathHelper.clamp_float(n5 - n7 + 0.020833334f, 0.0f, 1.0f));
            instance.draw();
            setColor(0xC0000000 | color);
            instance.startDrawingQuads();
            instance.addVertexWithUV(n + 0.0f, n2 + n4, 90.0, 0.0, 1.0);
            instance.addVertexWithUV(n + n3, n2 + n4, 90.0, 1.0, 1.0);
            instance.addVertexWithUV(n + n3, n2 + n4 * MathHelper.clamp_float(n5 - n7 + 0.020833334f, 0.0f, 1.0f), 90.0,
                    1.0, MathHelper.clamp_float(n5 - n7 + 0.020833334f, 0.0f, 1.0f));
            instance.addVertexWithUV(n + 0.0f, n2 + n4 * MathHelper.clamp_float(n5 - n6 + 0.020833334f, 0.0f, 1.0f),
                    90.0, 0.0, MathHelper.clamp_float(n5 - n6 + 0.020833334f, 0.0f, 1.0f));
            instance.draw();
        }
    }

    public static void drawTexturedRectEasy(final ResourceLocation resourceLocation, final float n, final float n2,
                                            final float n3, final float n4) {
        DayZHud.mc.renderEngine.bindTexture(resourceLocation);
        final Tessellator instance = Tessellator.instance;
        instance.startDrawingQuads();
        instance.addVertexWithUV(n + 0.0f, n2 + n4, 90.0, 0.0, 1.0);
        instance.addVertexWithUV(n + n3, n2 + n4, 90.0, 1.0, 1.0);
        instance.addVertexWithUV(n + n3, n2 + 0.0f, 90.0, 1.0, 0.0);
        instance.addVertexWithUV(n + 0.0f, n2 + 0.0f, 90.0, 0.0, 0.0);
        instance.draw();
    }

    public static void tickHints() {
        if (DayZHud.mc.thePlayer == null) {
            return;
        }
        DayZHud.$tmp_list.clear();
        final Iterator<Hint> iterator = DayZHud.hints.values().iterator();
        while (iterator.hasNext()) {
            final Hint hint = iterator.next();
            if (hint.remove()) {
                iterator.remove();
            } else {
                hint.addHints(DayZHud.$tmp_list);
            }
        }
    }

    public static void drawTexturedRect(final double n, final double n2, final double n3, final double n4) {
        final Tessellator instance = Tessellator.instance;
        instance.startDrawingQuads();
        instance.addVertexWithUV(n + 0.0, n2 + n4, 0.0, 0.0, 1.0);
        instance.addVertexWithUV(n + n3, n2 + n4, 0.0, 1.0, 1.0);
        instance.addVertexWithUV(n + n3, n2 + 0.0, 0.0, 1.0, 0.0);
        instance.addVertexWithUV(n + 0.0, n2 + 0.0, 0.0, 0.0, 0.0);
        instance.draw();
    }

    private static float angularDistance(final float n, final float n2) {
        final float n3 = Math.abs(n2 - n) % 360.0f;
        return (n3 > 180.0f) ? (360.0f - n3) : n3;
    }

    public static void setColor(final int n) {
        GL11.glColor4f((n >> 16 & 0xFF) / 255.0f, (n >> 8 & 0xFF) / 255.0f, (n & 0xFF) / 255.0f,
                (n >> 24 & 0xFF) / 255.0f);
    }

    public static int color(int r, int g, int b, int alpha) {
        if (r > 255)
            r = 255;
        if (g > 255)
            g = 255;
        if (b > 255)
            b = 255;
        if (r < 0)
            r = 0;
        if (g < 0)
            g = 0;
        if (b < 0)
            b = 0;
        if (alpha > 255)
            alpha = 255;
        return new Color(r, g, b, alpha).getRGB();
    }

    public static int loadUiColor() {
        int n = 12648384;
        try {
            final DataInputStream dataInputStream = new DataInputStream(new FileInputStream("lscdata"));
            Throwable t = null;
            try {
                n = (dataInputStream.readInt() & 0xFFFFFF);
                File f = new File("oldGuns");
                ClientEventHandler.oldGuns = !f.exists();
                dataInputStream.close();
            } catch (Throwable t2) {
                t = t2;
                throw t2;
            } finally {
                if (t != null) {
                    try {
                        dataInputStream.close();
                    } catch (Throwable t3) {
                        t.addSuppressed(t3);
                    }
                } else {
                    dataInputStream.close();
                }
            }
        } catch (IOException ex) {
        }
        return n;
    }

    public static void saveUiColor() {
        try {
            final DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("mcudata"));
            Throwable t = null;
            try {
                dataOutputStream.writeInt(DayZHud.color & 0xFFFFFF);
                File f = new File("oldGuns");
                if (!ClientEventHandler.oldGuns)
                    f.createNewFile();
                else
                    f.delete();
                dataOutputStream.close();
            } catch (Throwable t2) {
                t = t2;
                throw t2;
            } finally {
                if (t != null) {
                    try {
                        dataOutputStream.close();
                    } catch (Throwable t3) {
                        t.addSuppressed(t3);
                    }
                } else {
                    dataOutputStream.close();
                }
            }
        } catch (IOException ex) {
        }
    }

    @SubscribeEvent(priority = EventPriority.LOWEST, receiveCanceled = true)
    public void $(RenderGameOverlayEvent.Pre pre) {
        if (!SidedProtection.CLIENT)
            return;
        ScaledResolution resolution = pre.resolution;
        ExtendedPlayer client = ExtendedPlayer.get(Minecraft.getMinecraft().thePlayer);
        if (pre.type == RenderGameOverlayEvent.ElementType.ALL) {
            renderDamage(pre);
            double getScaledWidth_double = resolution.getScaledWidth_double();
            double getScaledHeight_double = resolution.getScaledHeight_double();
            GL11.glClear(256);
            GL11.glMatrixMode(5889);
            GL11.glLoadIdentity();
            GL11.glOrtho(0.0, getScaledWidth_double, getScaledHeight_double, 0.0, 1000.0, 3000.0);
            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            GL11.glTranslatef(0.0f, 0.0f, -2000.0f);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            if (DayZHud.mc.thePlayer != null && DayZHud.mc.thePlayer.isInsideOfMaterial(Material.leaves)) {
                GL11.glDisable(3553);
                GL11.glBlendFunc(774, 0);
                GL11.glColor4f(0.33f, 1.0f, 0.33f, 1.0f);
                drawRect(0.0, 0.0, resolution.getScaledWidth(), resolution.getScaledHeight());
                GL11.glEnable(3553);
                GL11.glBlendFunc(770, 771);
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                DayZHud.mc.renderEngine.bindTexture(DayZHud.leaves);
                drawRect(0.0, 0.0, resolution.getScaledWidth(), resolution.getScaledHeight());
            }
            boolean keyDown = Keyboard.isKeyDown(59);
            if (keyDown && !DayZHud.wasF1) {
                DayZHud.hideHud = !DayZHud.hideHud;
            }
            float n2 = (ClientEventHandler.lastDamage + 1000L - System.currentTimeMillis()) / 1000.0f;
            if (n2 > 0.0f && n2 <= 1.0f) {
                DayZHud.mc.renderEngine.bindTexture(DayZHud.low_hp_screen);
                GL11.glColor4f(1.0f, 0.0f, 0.0f, n2 / 10.0f);
                drawRect(0.0, 0.0, getScaledWidth_double, getScaledHeight_double);
            }
            DayZHud.wasF1 = keyDown;
            if (DayZHud.hideHud) {
                pre.setCanceled(true);
            }
            RenderGameOverlayEvent.Pre e = pre;
            if (Minecraft.getMinecraft().objectMouseOver != null && Minecraft
                    .getMinecraft().objectMouseOver.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
                Minecraft mc = Minecraft.getMinecraft();
                Vec3 hitVec = mc.objectMouseOver.hitVec;
                EntityClientPlayerMP player = mc.thePlayer;
                double playerX = player.posX;
                double playerY = player.posY;
                double playerZ = player.posZ;
                WorldClient world = mc.theWorld;
                double segLen = 0.25;
                double segLend2 = 0.125;
                double dx = hitVec.xCoord - playerX;
                double dy = hitVec.yCoord - playerY;
                double dz = hitVec.zCoord - playerZ;
                double lineLen = Math.sqrt(Math.pow(dx, 2.0) + Math.pow(dy, 2.0) + Math.pow(dz, 2.0));
                double segNumDouble = lineLen / segLen;
                int segNum = (int) segNumDouble;
                ArrayList<EntityItem> items = null;
                int index = 0;
                while (++index <= segNum) {
                    double cenX = playerX + dx / segNumDouble * (double) index;
                    double cenY = playerY + dy / segNumDouble * (double) index;
                    double cenZ = playerZ + dz / segNumDouble * (double) index;
                    AxisAlignedBB curAABB = AxisAlignedBB.getBoundingBox(cenX - segLend2, cenY - segLend2,
                            cenZ - segLend2, cenX + segLend2, cenY + segLend2, cenZ + segLend2);
                    items = (ArrayList) world.getEntitiesWithinAABB(EntityItem.class, curAABB);
                    if (items == null || items.isEmpty())
                        continue;
                    index = segNum + 1;
                }
                if (items != null && !items.isEmpty()) {
                    EntityItem closeItem = items.get(0);
                    double closeDist = 100.0;
                    for (EntityItem item : items) {
                        double itemDist = Math.pow(item.posX - playerX, 2.0) + Math.pow(item.posY - playerY, 2.0)
                                + Math.pow(item.posZ - playerZ, 2.0);
                        if (itemDist >= closeDist)
                            continue;
                        closeDist = itemDist;
                        closeItem = item;
                    }
                    String text = closeItem.getEntityItem().getDisplayName();
                    String text2;
                    try {
                        text2 = Keyboard.getKeyName(ClientProxy.interact.getKeyCode());
                    } catch (Exception ex) {
                        text2 = null;
                    }
                    Minecraft.getMinecraft().fontRenderer.drawString("Подобрать", e.resolution.getScaledWidth() / 2 + 5,
                            e.resolution.getScaledHeight() / 2 + 4, 0xFFFFFF);
                    Minecraft.getMinecraft().fontRenderer.drawString("Нажми", e.resolution.getScaledWidth() / 2 + 5,
                            e.resolution.getScaledHeight() / 2 + 14, 0xFFFFFF);
                    Minecraft.getMinecraft().fontRenderer.drawString("[ " + text2 + " ]",
                            e.resolution.getScaledWidth() / 2 + 5, e.resolution.getScaledHeight() / 2 + 24, 0xFFFFFF);
                    Minecraft.getMinecraft().fontRenderer.drawString(text,
                            (e.resolution.getScaledWidth()) / 2
                                    - Minecraft.getMinecraft().fontRenderer.getStringWidth(text) - 1,
                            e.resolution.getScaledHeight() / 2 + 24, 0xFFFFFF);
                    if (closeItem.getEntityItem() != null) {
                        RenderHelper.disableStandardItemLighting();
                        float f1 = (float) closeItem.getEntityItem().animationsToGo - 0;
                        if (f1 > 0.0F) {
                            GL11.glPushMatrix();
                            float f2 = 1.0F + f1 / 5.0F;
                            GL11.glTranslatef((float) (e.resolution.getScaledWidth() / 2 - 18 + 8),
                                    (float) (e.resolution.getScaledHeight() / 2 + 4 + 12), 0.0F);
                            GL11.glScalef(1.0F / f2, (f2 + 1.0F) / 2.0F, 1.0F);
                            GL11.glTranslatef((float) (-(e.resolution.getScaledWidth() / 2 - 18 + 8)),
                                    (float) (-(e.resolution.getScaledHeight() / 2 + 4 + 12)), 0.0F);
                        }

                        Util.itemRender.renderItemIntoGUI(mc.fontRenderer, mc.getTextureManager(),
                                closeItem.getEntityItem(), e.resolution.getScaledWidth() / 2 - 18,
                                e.resolution.getScaledHeight() / 2 + 4);
                        if (f1 > 0.0F) {
                            GL11.glPopMatrix();
                        }

                        Util.itemRender.renderItemOverlayIntoGUI(mc.fontRenderer, mc.getTextureManager(),
                                closeItem.getEntityItem(), e.resolution.getScaledWidth() / 2 - 18,
                                e.resolution.getScaledHeight() / 2 + 4);
                        RenderHelper.disableStandardItemLighting();
                    }
                }
            }
        } else if (pre.type == RenderGameOverlayEvent.ElementType.HOTBAR) {
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            drawInteract(pre);
            drawDayzGui(resolution.getScaledWidth(), resolution.getScaledHeight(), DayZHud.mc, DayZHud.mc.thePlayer);
            JuggerHud.renderJagHud(Minecraft.getMinecraft());
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            renderUseProgress(resolution.getScaledWidth(), resolution.getScaledHeight());
            renderWaterOxygen(resolution.getScaledWidth(), resolution.getScaledHeight());
            renderTargetItem(resolution.getScaledWidth(), resolution.getScaledHeight(), pre.partialTicks);
            if (!DayZHud.$tmp_list.isEmpty()) {
                int n3 = 14;
                for (String s2 : DayZHud.$tmp_list) {
                    int bz = DayZHud.mc.fontRenderer.getStringWidth(s2);
                    GuiScreen.drawRect(resolution.getScaledWidth() - bz - 9, n3, resolution.getScaledWidth() - 5,
                            n3 + 9, 1073741824);
                    Minecraft.getMinecraft().fontRenderer.drawString(s2, resolution.getScaledWidth() - bz - 7, n3 + 1,
                            0x7F000000 | color);
                    n3 += 10;
                }
            }
            GL11.glDisable(3042);
        } else if (pre.type == RenderGameOverlayEvent.ElementType.ARMOR
                || pre.type == RenderGameOverlayEvent.ElementType.EXPERIENCE
                || pre.type == RenderGameOverlayEvent.ElementType.HEALTH
                || pre.type == RenderGameOverlayEvent.ElementType.HEALTHMOUNT
                || pre.type == RenderGameOverlayEvent.ElementType.JUMPBAR
                || pre.type == RenderGameOverlayEvent.ElementType.AIR
                || pre.type == RenderGameOverlayEvent.ElementType.FOOD) {
            pre.setCanceled(true);
        }
    }

    public void renderDamage(final RenderGameOverlayEvent e) {
        if (!SidedProtection.CLIENT)
            return;
        GL11.glPushMatrix();
        GL11.glClear(256);
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0, e.resolution.getScaledWidth_double(), e.resolution.getScaledHeight_double(), 0.0, 1000.0,
                3000.0);
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef(0.0f, 0.0f, -2000.0f);
        GL11.glEnable(3042);
        GL11.glDisable(3008);
        GL11.glBlendFunc(770, 771);
        final Tessellator instance = Tessellator.instance;
        final double getScaledWidth_double = e.resolution.getScaledWidth_double();
        final double getScaledHeight_double = e.resolution.getScaledHeight_double();
        final float getHealth;
        if ((getHealth = Minecraft.getMinecraft().thePlayer.getHealth()) <= 10.0f) {
            final float min = Math.min((10.0f - getHealth) / 3.3333335f, 0.5f);

            if (SHADER_GRAYSCALE == -1) {
                Minecraft.getMinecraft().renderEngine.bindTexture(low_hp_screen);
                GL11.glColor4f(0.0f, 0.0f, 0.0f, min);
                drawRect(0.0, 0.0, getScaledWidth_double, getScaledHeight_double);
            } else {
                Minecraft.getMinecraft().renderEngine.bindTexture(low_hp_buffer);
                GL11.glViewport(0, 0, Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
                GL11.glCopyTexImage2D(3553, 0, 6407, 0, 0, Minecraft.getMinecraft().displayWidth,
                        Minecraft.getMinecraft().displayHeight, 0);
                GL20.glUseProgram(SHADER_GRAYSCALE);
                if (!SHADER_TEXTURE) {
                    SHADER_TEXTURE = true;
                    GL20.glUniform1i(GL20.glGetUniformLocation(SHADER_GRAYSCALE, "u_texture"),
                            Minecraft.getMinecraft().renderEngine.getTexture(low_hp_buffer).getGlTextureId());
                }
                if (min != SHADER_PREV_VALUE) {
                    GL20.glUniform1f(SHADER_GRAYSCALE_V, min);
                    SHADER_PREV_VALUE = min;
                }
                instance.startDrawingQuads();
                instance.addVertexWithUV(0.0, getScaledHeight_double, 0.0, 0.0, 0.0);
                instance.addVertexWithUV(getScaledWidth_double, getScaledHeight_double, 0.0, 1.0, 0.0);
                instance.addVertexWithUV(getScaledWidth_double, 0.0, 0.0, 1.0, 1.0);
                instance.addVertexWithUV(0.0, 0.0, 0.0, 0.0, 1.0);
                instance.draw();
                GL20.glUseProgram(0);
            }
        }
        GL11.glPopMatrix();
    }

    public interface Hint {
        boolean remove();

        void addHints(final List<String> p0);
    }
}
