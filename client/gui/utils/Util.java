package mcu.client.gui.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

import java.awt.*;

public class Util {
    public static RenderItem itemRender = new RenderItem();

    public static void drawRect(float paramXStart, float paramYStart, float paramXEnd, float paramYEnd,
                                int paramColor) {
        float alpha = (float) (paramColor >> 24 & 0xFF) / 255F;
        float red = (float) (paramColor >> 16 & 0xFF) / 255F;
        float green = (float) (paramColor >> 8 & 0xFF) / 255F;
        float blue = (float) (paramColor & 0xFF) / 255F;

        GL11.glEnable(GL11.GL_BLEND);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glEnable(GL11.GL_LINE_SMOOTH);

        GL11.glPushMatrix();
        GL11.glColor4f(red, green, blue, alpha);
        GL11.glBegin(GL11.GL_QUADS);
        GL11.glVertex2d(paramXEnd, paramYStart);
        GL11.glVertex2d(paramXStart, paramYStart);
        GL11.glVertex2d(paramXStart, paramYEnd);
        GL11.glVertex2d(paramXEnd, paramYEnd);
        GL11.glEnd();
        GL11.glPopMatrix();

        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glDisable(GL11.GL_BLEND);
        GL11.glDisable(GL11.GL_LINE_SMOOTH);
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

    public static void drawItemStack(final ItemStack stack, final int x, final int y) {
        Minecraft mc = Minecraft.getMinecraft();
        GL11.glTranslatef(0.0f, 0.0f, 32.0f);
        itemRender.zLevel = 200.0f;
        FontRenderer font = null;
        if (stack != null) {
        }
        if (font == null) {
            font = mc.fontRenderer;
        }
        itemRender.renderItemAndEffectIntoGUI(font, mc.getTextureManager(), stack, x, y);
        GL11.glTranslatef(itemRender.zLevel = 0.0f, 0.0f, -32.0f);
        RenderHelper.disableStandardItemLighting();
    }

    public static void draw3DItem(ItemStack itemStack, float x, float y, float scale) {
        ItemStack is = itemStack.copy();
        is.stackSize = 1;
        itemStack.setItemDamage(itemStack.getItemDamage());
        EntityItem entityItem = new EntityItem(Minecraft.getMinecraft().theWorld, 0D, 0D, 0D, is);
        entityItem.hoverStart = 0;
        GL11.glPushMatrix();

        GL11.glTranslatef(x, y, x);
        if (is.getItem() instanceof ItemBlock) {
            GL11.glRotatef(180, 0, 1, 0);
            GL11.glRotatef(180, 1, 0, 0);
        }
        GL11.glScalef(scale, scale, scale);
        RenderManager.instance.func_147939_a(entityItem, 0, 0, 0.2, 0,
                Minecraft.getMinecraft().thePlayer.ticksExisted % 360, false);

        GL11.glPopMatrix();
    }

    public static void drawGradientRect(double par1, double par2, double par3, double par4, int col1, int col2) {
        float f = (float) (col1 >> 24 & 0xFF) / 255F;
        float f1 = (float) (col1 >> 16 & 0xFF) / 255F;
        float f2 = (float) (col1 >> 8 & 0xFF) / 255F;
        float f3 = (float) (col1 & 0xFF) / 255F;

        float f4 = (float) (col2 >> 24 & 0xFF) / 255F;
        float f5 = (float) (col2 >> 16 & 0xFF) / 255F;
        float f6 = (float) (col2 >> 8 & 0xFF) / 255F;
        float f7 = (float) (col2 & 0xFF) / 255F;

        GL11.glEnable(GL11.GL_BLEND);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glEnable(GL11.GL_LINE_SMOOTH);
        GL11.glShadeModel(GL11.GL_SMOOTH);

        GL11.glPushMatrix();
        GL11.glBegin(GL11.GL_QUADS);
        GL11.glColor4f(f1, f2, f3, f);
        GL11.glVertex2d(par3, par4);
        GL11.glVertex2d(par3, par2);

        GL11.glColor4f(f5, f6, f7, f4);
        GL11.glVertex2d(par1, par2);
        GL11.glVertex2d(par1, par4);
        GL11.glEnd();
        GL11.glPopMatrix();

        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glDisable(GL11.GL_BLEND);
        GL11.glDisable(GL11.GL_LINE_SMOOTH);
        GL11.glShadeModel(GL11.GL_FLAT);
    }
}
