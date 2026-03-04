package mcu.client.gui.mcumenu;

import mcu.MCU;
import mcu.client.ClientEventHandler;
import mcu.client.gui.buttons.ChangeButton;
import mcu.client.gui.buttons.TeleportButton;
import mcu.client.gui.utils.CustomFont;
import mcu.client.gui.utils.CustomFontRenderer;
import mcu.client.gui.utils.CustomGuiButton;
import mcu.client.gui.utils.Util;
import mcu.teleport.Teleport;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.input.Keyboard;

import java.util.ArrayList;

public class TeleportMenu extends GuiScreen {
    public static int type;
    public static int WIDTH = 140, HEIGHT = 100;
    public static int MATERIAL_DARK = Util.color(58, 68, 80, 255);
    public static int MATERIAL_WHITE = Util.color(240, 238, 239, 255);

    public void initGui() {
        this.buttonList.clear();
        HEIGHT = 115;
        int i = 0;
        for (Teleport.Location s : Teleport.locations) {
            this.buttonList.add(new TeleportButton(i, ((width / 2 - WIDTH + 8) + (i % 4) * 67),
                    height / 2 - 55 + ((int) ((float) i / 4) * 80), 63, 74, s.name, s));
            i++;
        }
        this.buttonList.add(new ChangeButton(100, width / 2 - 50, height / 2 + HEIGHT - 13, 20, 10, "<"));
        this.buttonList.add(new ChangeButton(100, width / 2 + 30, height / 2 + HEIGHT - 13, 20, 10, ">"));
    }

    public void drawScreen(int x, int y, float f) {
        CustomGuiButton.mouseX = x;
        CustomGuiButton.mouseY = y;
        Util.drawRect(0, 0, width, height, Util.color(25, 25, 25, 130));
        // main down
        Util.drawRect(width / 2 - WIDTH, height / 2 - (HEIGHT / 2 + 15), width / 2 + WIDTH, height / 2 + HEIGHT,
                MATERIAL_WHITE);
        // title
        Util.drawRect(width / 2 - WIDTH, height / 2 - (HEIGHT), width / 2 + WIDTH, height / 2 - (HEIGHT / 2 + 5),
                MATERIAL_DARK);
        CustomFontRenderer.drawString("§fMCU Menu",
                width / 2 - CustomFontRenderer.getStringWidth(CustomFont.title, "MCU Menu") / 2,
                height / 2 - HEIGHT + 13, CustomFont.title);
        CustomFontRenderer.drawString("§7update : " + MCU.VERSION,
                width / 2 - CustomFontRenderer.getStringWidth(CustomFont.gui, "§8update : " + MCU.VERSION) / 2,
                height / 2 - HEIGHT + 28, CustomFont.gui);
        String t = "Варп 1";
        if (type == 1) {
            t = "Варп 2";
        }
        if (type == 2) {
            t = "Рандом место";
        }
        CustomFontRenderer.drawString("§7" + t, width / 2 - CustomFontRenderer.getStringWidth(CustomFont.gui, t) / 2,
                height / 2 + HEIGHT - 13, CustomFont.gui);
        super.drawScreen(x, y, f);
    }

    public void reset() {
        for (GuiButton b : (ArrayList<GuiButton>) this.buttonList) {
            if (b instanceof CustomGuiButton) {
                if (b instanceof TeleportButton) {
                    TeleportButton but = (TeleportButton) b;
                    but.cooldown = 0;
                }
            }
        }
    }

    protected void actionPerformed(GuiButton b) {
        if (b instanceof ChangeButton) {
            if (b.displayString.equals("<")) {
                type--;
            }
            if (b.displayString.equals(">")) {
                type++;
            }
            if (type == 3) {
                type = 0;
            }
            if (type == -1) {
                type = 2;
            }
        }
    }

    @Override
    public void updateScreen() {
        for (Object o : buttonList) {
            if (o instanceof CustomGuiButton) {
                CustomGuiButton b = (CustomGuiButton) o;
                b.update();
                if (b instanceof TeleportButton) {
                    TeleportButton but = (TeleportButton) b;
                    if (but.cooldown > 0) {
                        but.cooldown--;
                    }
                    if (but.cooldown > 1 && but.cooldown < 3) {
                        Teleport.clientTeleport(b.id);
                        ClientEventHandler.motionTimer = 30;
                        Minecraft.getMinecraft().displayGuiScreen(null);
                    }
                }
            }
        }
    }

    @Override
    public void keyTyped(char c, int key) {
        super.keyTyped(c, key);
        if (key == Keyboard.KEY_ESCAPE) {
            mc.displayGuiScreen(new MCUMenu());
        }
    }
}
