// 
// Decompiled by Procyon v0.5.36
// 

package mcu.client.gui.menu;

import mcu.MCU;
import mcu.client.gui.utils.Util;
import mcu.client.hud.DayZHud;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.io.File;

public class GuiMCUSettings extends GuiScreen {
    public static final ResourceLocation palette;

    static {
        palette = new ResourceLocation("mcuniversal", "textures/gui/palette.png");
    }

    private final GuiScreen parentScreen;
    private boolean color;
    private int cx;
    private int cy;

    public GuiMCUSettings(final GuiScreen parentScreen) {
        this.color = false;
        this.parentScreen = parentScreen;
    }

    public static int hsv2rgb(final float n, final float n2, final float n3) {
        final int n4 = (int) (n * 6.0f);
        final float n5 = n * 6.0f - n4;
        final float n6 = n3 * (1.0f - n2);
        final float n7 = n3 * (1.0f - n5 * n2);
        final float n8 = n3 * (1.0f - (1.0f - n5) * n2);
        switch (n4) {
            case 0: {
                return rgb2int(n3, n8, n6);
            }
            case 1: {
                return rgb2int(n7, n3, n6);
            }
            case 2: {
                return rgb2int(n6, n3, n8);
            }
            case 3: {
                return rgb2int(n6, n7, n3);
            }
            case 4: {
                return rgb2int(n8, n6, n3);
            }
            case 5: {
                return rgb2int(n3, n6, n7);
            }
            default: {
                return 0;
            }
        }
    }

    public static int rgb2int(final float n, final float n2, final float n3) {
        return 0x0 | (int) (n * 255.0f) << 16 | (int) (n2 * 255.0f) << 8 | (int) (n3 * 255.0f);
    }

    public void initGui() {
        int n = this.height / 2 - 84 - 12;
        n += 104;
        this.buttonList
                .add(new GuiButton(1, this.width / 2 - 100, n, "Оружие : " + (MCU.fancyGuns ? "Новое" : "Старое")));
        n += 24;
        this.buttonList.add(new GuiButton(0, this.width / 2 - 100, n, "\u041d\u0430\u0437\u0430\u0434"));
    }

    public void drawScreen(final int n, final int n2, final float n3) {
        if (!this.color)
            Util.drawRect(0, 0, width, height, Util.color(25, 25, 25, 150));
        GL11.glEnable(3042);
        int n4 = this.width / 2;
        GL11.glColor4f(1.0f, 1.0f, 1.0f, this.color ? 0.75f : 0.5f);
        this.mc.renderEngine.bindTexture(GuiMCUSettings.palette);
        final int n5 = this.height / 2 - 54;
        DayZHud.drawTexturedRect(n4 - 50, n5 - 50, 100.0, 100.0);
        if (!this.color) {
            drawRect(n4 - 50, n5 - 5, n4 + 50, n5 + 5, 2130706432);
            this.drawCenteredString(this.fontRendererObj,
                    "\u0426\u0432\u0435\u0442 \u0438\u043d\u0442\u0435\u0440\u0444\u0435\u0439\u0441\u0430", n4, n5 - 4,
                    -1);
        } else {
            this.color(n, n2);
            n4 -= 50;
            drawRect(n4 + this.cx - 5, n5 + this.cy - 5, n4 + this.cx + 5, n5 + this.cy + 5, -16777216);
            drawRect(n4 + this.cx - 4, n5 + this.cy - 4, n4 + this.cx + 4, n5 + this.cy + 4,
                    0xFF000000 | DayZHud.color);
        }
        super.drawScreen(n, n2, n3);
    }

    protected void keyTyped(final char c, final int n) {
        if (n == 1) {
            this.mc.displayGuiScreen(this.parentScreen);
        }
    }

    protected void mouseClicked(final int n, final int n2, final int n3) {
        final int n4 = this.width / 2 - n;
        final int n5 = this.height / 2 - 54 - n2;
        if (Math.sqrt((float) (n4 * n4 + n5 * n5)) <= 51.0f) {
            this.color = true;
        }
        super.mouseClicked(n, n2, n3);
    }

    protected void mouseMovedOrUp(final int n, final int n2, final int n3) {
        if (this.color) {
            this.color = false;
            DayZHud.saveUiColor();
        }
        super.mouseMovedOrUp(n, n2, n3);
    }

    protected void color(final int n, final int n2) {
        this.cx = this.width / 2 - n;
        this.cy = this.height / 2 - 54 - n2;
        float n3 = (float) (0.5 + 0.5 * Math.atan2(this.cy, this.cx) / 3.141592653589793);
        if (n3 >= 1.0f) {
            n3 = 0.0f;
        }
        final float n4 = (float) (Math.min(Math.sqrt((float) (this.cx * this.cx + this.cy * this.cy)), 50.0f) / 75.0f);
        DayZHud.color = hsv2rgb(n3, n4, 1.0f);
        this.cx = (int) (Math.cos(n3 * 3.1415927f * 2.0f) * n4 * 75.0f) + 50;
        this.cy = (int) (Math.sin(n3 * 3.1415927f * 2.0f) * n4 * 75.0f);
    }

    protected void actionPerformed(final GuiButton GuiButton) {
        switch (GuiButton.id) {
            case 0: {
                this.mc.displayGuiScreen(this.parentScreen);
                break;
            }
            case 1: {
                MCU.fancyGuns = !MCU.fancyGuns;
                MCU.clearDL = true;
                try {
                    if (MCU.fancyGuns) {
                        new File("fGun").createNewFile();
                    } else {
                        new File("fGun").delete();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                GuiButton.displayString = "Оружие : " + (MCU.fancyGuns ? "Новое" : "Старое");
                DayZHud.saveUiColor();
            }
        }
    }
}
