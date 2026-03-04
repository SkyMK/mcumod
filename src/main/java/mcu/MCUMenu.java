package mcu.client.gui.mcumenu;

import mcu.DayZ;
import mcu.MCU;
import mcu.client.gui.buttons.SelectButton;
import mcu.client.gui.utils.CustomFont;
import mcu.client.gui.utils.CustomFontRenderer;
import mcu.client.gui.utils.CustomGuiButton;
import mcu.client.gui.utils.Util;
import mcu.storehouse.Store;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ChatComponentText;

public class MCUMenu extends GuiScreen {
    public static int WIDTH = 140, HEIGHT = 100;
    public static int MATERIAL_DARK = Util.color(58, 68, 80, 255);
    public static int MATERIAL_WHITE = Util.color(240, 238, 239, 255);

    public void initGui() {
        this.buttonList.clear();
        HEIGHT = 80;
        this.buttonList.add(new SelectButton(0, width / 2 - WIDTH + 10, height / 2 - 33, 80, 100, "Склад", "d"));
        this.buttonList.add(new SelectButton(1, width / 2 - WIDTH + 90 + 10, height / 2 - 33, 80, 100, "Локации", "b"));
        this.buttonList
                .add(new SelectButton(2, width / 2 - WIDTH + 90 + 90 + 10, height / 2 - 33, 80, 100, "Маркет", "i"));
        DayZ.network.sendToServer(DayZ.network.createPacket(99, 0));
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
        if (b.id == 0 && Store.clientStores.size() != 0) {
            mc.displayGuiScreen(new StoreMenu());
        } else if (b.id == 0 && Store.clientStores.size() == 0) {
            mc.thePlayer.addChatMessage(new ChatComponentText("Перезайдите в меню, если не поможет, то на сервер."));
        }
        if (b.id == 1) {
            mc.displayGuiScreen(new TeleportMenu());
        }
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
}
