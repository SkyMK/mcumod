package mcu.client.gui.buttons;

import mcu.client.gui.mcumenu.StoreMenu;
import mcu.client.gui.utils.*;
import mcu.storehouse.Store;
import net.minecraft.client.Minecraft;

public class ChestButton extends CustomGuiButton {
    public Store store;

    public ChestButton(int id, int x, int y, int width, int height, String display, Store store) {
        super(id, x, y, width, height, display);
        anims.add(new Animation(0, 15));
        this.store = store;
    }

    @Override
    public void drawButton(Minecraft mc, int x, int y) {
        int anim = anims.get(0).intValue();
        int whiteColor = Util.color(248 + anim, 248 + anim, 248 + anim, 255);
        Util.drawGradientRect(xPosition, yPosition, xPosition + width, yPosition + height,
                Util.color(199, 199, 201, 255), Util.color(199, 199, 201, 255));
        Util.drawGradientRect(xPosition + 1, yPosition, xPosition + width - 1, yPosition + height - 1, whiteColor,
                whiteColor);
        Util.drawGradientRect(xPosition, yPosition, xPosition + width, yPosition + 16,
                Util.color(60 + anim, 67 + anim, 80 + anim, 255), Util.color(60 + anim, 67 + anim, 80 + anim, 255));
        CustomFontRenderer.drawString(displayString,
                xPosition + width / 2 - CustomFontRenderer.getStringWidth(CustomFont.gui, displayString) / 2,
                yPosition + 3, CustomFont.gui);
        CustomFontRenderer.drawString((store.unlocked ? "" : "§7c"),
                xPosition + width / 2
                        - CustomFontRenderer.getStringWidth(CustomFont.icons, (store.unlocked ? "§8d" : "§7c")) / 2,
                yPosition + 18, CustomFont.icons);
        String s = store.unlocked ? "§fОткрыть" : StoreMenu.canUnlock ? "§7Разблокировать" : "§7У вас нет ключа";
        int color = store.unlocked ? Util.color(60 + anim, 67 + anim, 80 + anim, 255)
                : Util.color(60 + anim, 67 + anim, 80 + anim, 255);
        Util.drawGradientRect(xPosition + 2, yPosition + height - 12, xPosition + width - 2, yPosition + height - 2,
                color, color);
        long value = store.timer;
        long seconds = (value / 20);
        int minutes = (int) (seconds / 60);
        int hours = minutes / 60;
        int days = 0;
        int month = 0;
        int years = 0;
        while (hours > 24) {
            hours = hours - 24;
            days++;
        }
        while (days > 30) {
            days = days - 30;
            month++;
        }
        while (month > 12) {
            month = month - 12;
            years++;
        }
        StringBuilder builder = new StringBuilder();
        if (years != 0)
            builder.append(years + " г ");
        if (month != 0)
            builder.append(month + " м ");
        if (days != 0)
            builder.append(days + " д ");
        if (hours != 0)
            builder.append(hours + " ч");
        CustomFontRenderer.drawString(s,
                xPosition + width / 2 - CustomFontRenderer.getStringWidth(CustomFont.guiSmall, s) / 2,
                yPosition + height - 11, CustomFont.guiSmall);
        s = builder.toString();
        if (store.unlocked) {
            CustomFontRenderer.drawString("§7" + s,
                    xPosition + width / 2 - CustomFontRenderer.getStringWidth(CustomFont.gui, s) / 2, yPosition + 21,
                    CustomFont.gui);
            s = StoreMenu.canBoost ? "§fПродлить" : "§7У вас нет дм";
            Util.drawGradientRect(xPosition + 2, yPosition + height - 24, xPosition + width - 2,
                    yPosition + height - 14, color, color);
            CustomFontRenderer.drawString(s,
                    xPosition + width / 2 - CustomFontRenderer.getStringWidth(CustomFont.guiSmall, s) / 2,
                    yPosition + height - 23, CustomFont.guiSmall);
        }
    }

    public boolean mousePressed(Minecraft mc, int x, int y) {
        if (x > xPosition + 2 && y > yPosition + height - 24 && x < xPosition + width - 2 && y < yPosition + height - 14
                && store.unlocked && StoreMenu.canBoost) {
            Store.clientBoostStore(id);
            return false;
        }
        return this.enabled && this.visible && x >= this.xPosition && y >= this.yPosition
                && x < this.xPosition + this.width && y < this.yPosition + this.height;
    }
}
