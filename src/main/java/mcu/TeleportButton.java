package mcu.client.gui.buttons;

import mcu.client.gui.mcumenu.TeleportMenu;
import mcu.client.gui.utils.*;
import mcu.teleport.Teleport;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class TeleportButton extends CustomGuiButton {
    public Teleport.Location location;
    public ResourceLocation rs;
    public int cooldown;

    public TeleportButton(int id, int x, int y, int width, int height, String display, Teleport.Location location) {
        super(id, x, y, width, height, display);
        anims.add(new Animation(0, 7));
        this.location = location;
        this.rs = new ResourceLocation("mcuniversal:textures/teleport/" + location.pngName + ".png");
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
        drawTexturedOutlineRect(rs, rs, xPosition + 2, yPosition + 21, 0.232, 0.20, null, null);
        Util.drawGradientRect(xPosition + ((width / 2) * ((float) cooldown / 200)), yPosition,
                xPosition + width - (width / 2) * ((float) cooldown / 200), yPosition + 1,
                Util.color(251, 107 + anim, 54 + anim, 255), Util.color(251, 107 + anim, 54 + anim, 255));
        // 251,107,54
    }

    public void drawTexturedOutlineRect(ResourceLocation loc1, ResourceLocation loc2, double x, double y, double scaleX,
                                        double scaleY, double[] colors, double[] colorsOutline) {
        GL11.glPushMatrix();
        double renderFactor = 255;
        int endX = (int) (x + (renderFactor * scaleX));
        int endY = (int) (y + (renderFactor * scaleY));
        boolean outline = CustomGuiButton.mouseX > x && CustomGuiButton.mouseY > y && CustomGuiButton.mouseX < endX
                && CustomGuiButton.mouseY < endY;
        Minecraft.getMinecraft().renderEngine.bindTexture(outline ? loc2 : loc1);
        if (colors != null && colorsOutline != null) {
            GL11.glColor4d(colors[0], colors[1], colors[2], colors[3]);
            if (outline)
                GL11.glColor4d(colorsOutline[0], colorsOutline[1], colorsOutline[2], colorsOutline[3]);
        } else {
            GL11.glColor4f(1, 1, 1, 1);
        }
        GL11.glScaled(scaleX, scaleY, 1);
        drawTexturedModalRect((int) (x / scaleX), (int) (y / scaleY), 0, 0, (int) renderFactor, (int) renderFactor);
        GL11.glPopMatrix();
    }

    public boolean mousePressed(Minecraft mc, int x, int y) {
        boolean pressed = this.enabled && this.visible && x >= this.xPosition && y >= this.yPosition
                && x < this.xPosition + this.width && y < this.yPosition + this.height;
        if (pressed) {
            if (cooldown == 0) {
                TeleportMenu screen = (TeleportMenu) mc.currentScreen;
                screen.reset();
                cooldown = 200;
            } else {
                cooldown = 0;
            }
        }
        return pressed;
    }
}
