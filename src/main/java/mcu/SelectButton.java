package mcu.client.gui.buttons;

import mcu.client.gui.utils.*;
import net.minecraft.client.Minecraft;

public class SelectButton extends CustomGuiButton {
    public String prefix;

    public SelectButton(int id, int x, int y, int width, int height, String display, String prefix) {
        super(id, x, y, width, height, display);
        anims.add(new Animation(0, 7));
        this.prefix = prefix;
    }

    @Override
    public void drawButton(Minecraft mc, int x, int y) {
        int anim = anims.get(0).intValue();
        int whiteColor = Util.color(248 + anim, 248 + anim, 248 + anim, 255);
        Util.drawGradientRect(xPosition, yPosition, xPosition + width, yPosition + height,
                Util.color(199, 199, 201, 255), Util.color(199, 199, 201, 255));
        Util.drawGradientRect(xPosition + 1, yPosition, xPosition + width - 1, yPosition + height - 1, whiteColor,
                whiteColor);
        Util.drawGradientRect(xPosition, yPosition, xPosition + width, yPosition + 20,
                Util.color(60 + anim, 67 + anim, 80 + anim, 255), Util.color(60 + anim, 67 + anim, 80 + anim, 255));
        CustomFontRenderer.drawString(displayString,
                xPosition + width / 2 - CustomFontRenderer.getStringWidth(CustomFont.gui, displayString) / 2,
                yPosition + 5, CustomFont.gui);
        CustomFontRenderer.drawString("§7" + prefix,
                xPosition + width / 2 - CustomFontRenderer.getStringWidth(CustomFont.icons, prefix) / 2, yPosition + 45,
                CustomFont.icons);
    }
}
