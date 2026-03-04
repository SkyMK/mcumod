package mcu.client.gui.mcumenu;

import mcu.MCU;
import mcu.client.gui.buttons.ChestButton;
import mcu.client.gui.utils.CustomFont;
import mcu.client.gui.utils.CustomFontRenderer;
import mcu.client.gui.utils.CustomGuiButton;
import mcu.client.gui.utils.Util;
import mcu.storehouse.Store;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.input.Keyboard;

public class StoreMenu extends GuiScreen {
    public static boolean canUnlock, canBoost;
    public static int WIDTH = 140, HEIGHT = 100;
    public static int MATERIAL_DARK = Util.color(58, 68, 80, 255);
    public static int MATERIAL_WHITE = Util.color(240, 238, 239, 255);

    public void initGui() {
        this.buttonList.clear();
        HEIGHT = 90;
        int i = 0;
        for (Store s : Store.clientStores) {
            this.buttonList.add(new ChestButton(i, ((width / 2 - WIDTH + 8) + (i % 5) * 53),
                    height / 2 - 40 + ((int) ((float) i / 5) * 62), 50, 58, "Склад " + (i + 1), s));
            i++;
        }
        canUnlock = new Store().unlock(Minecraft.getMinecraft().thePlayer);
        canBoost = new Store().boostTime(Minecraft.getMinecraft().thePlayer);
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
                height / 2 - HEIGHT + 5, CustomFont.title);
        CustomFontRenderer.drawString("§7update : " + MCU.VERSION,
                width / 2 - CustomFontRenderer.getStringWidth(CustomFont.gui, "§8update : " + MCU.VERSION) / 2,
                height / 2 - HEIGHT + 20, CustomFont.gui);
        super.drawScreen(x, y, f);
    }

    protected void actionPerformed(GuiButton b) {
        Store.clientClickStore(b.id);
    }

    @Override
    public void updateScreen() {
        for (Object o : buttonList) {
            if (o instanceof CustomGuiButton) {
                CustomGuiButton b = (CustomGuiButton) o;
                b.update();
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
