package mcu.client.gui.buttons;

import mcu.client.gui.utils.*;
import net.minecraft.client.Minecraft;

public class ChangeButton extends CustomGuiButton {
    public ChangeButton(int id, int x, int y, int width, int height, String display) {
        super(id, x, y, width, height, display);
        anims.add(new Animation(0, 7));
    }

    @Override
    public void drawButton(Minecraft mc, int x, int y) {
        int anim = anims.get(0).intValue();
        int whiteColor = Util.color(248 + anim, 248 + anim, 248 + anim, 255);
        Util.drawGradientRect(xPosition, yPosition, xPosition + width, yPosition + height,
                Util.color(60 + anim, 67 + anim, 80 + anim, 255), Util.color(60 + anim, 67 + anim, 80 + anim, 255));
        CustomFontRenderer.drawString(displayString,
                xPosition + width / 2 - CustomFontRenderer.getStringWidth(CustomFont.gui, displayString) / 2, yPosition,
                CustomFont.gui);
    }
}
