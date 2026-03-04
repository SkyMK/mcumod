// 
// Decompiled by Procyon v0.5.36
// 

package mcu.juggernaut;

import mcu.PointColor;
import mcu.items.armors.JuggernautArmor;
import mcu.items.armors.JuggernautArmor.IItemPersonal;
import mcu.client.hud.RadarEntry;
import mcu.items.Items;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class JuggerHud {
    public static List<RadarEntry> entities;
    private static ResourceLocation radar_bg;
    private static ResourceLocation radar_tgt;
    private static ResourceLocation eu_bg;
    private static ResourceLocation eu_lvl;

    static {
        entities = new ArrayList<RadarEntry>();
        JuggerHud.radar_bg = new ResourceLocation("mcuniversal:textures/gui/radar.png");
        JuggerHud.radar_tgt = new ResourceLocation("mcuniversal:textures/gui/spot.png");
        JuggerHud.eu_bg = new ResourceLocation("mcuniversal:textures/gui/charge_base.png");
        JuggerHud.eu_lvl = new ResourceLocation("mcuniversal:textures/gui/charge_level.png");
    }

    public static void renderJagHud(final Minecraft Minecraft) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        drawEU(Minecraft);
        if (net.minecraft.client.Minecraft.getMinecraft().thePlayer.getCurrentArmor(3) == null) {
            JuggerHud.entities.clear();
            return;
        }
        if (net.minecraft.client.Minecraft.getMinecraft().thePlayer.getCurrentArmor(3) != null
                && !(Minecraft.thePlayer.getCurrentArmor(3).getItem() instanceof IItemPersonal)) {
            JuggerHud.entities.clear();
            return;
        }
        drawRadar(Minecraft);
    }

    private static void drawEU(final Minecraft Minecraft) {
        double n = 0.0;
        double n2 = 0.0;
        for (int i = 0; i < 4; ++i) {
            n2 += Items.JAG[i].getMaxDamage();
            if (net.minecraft.client.Minecraft.getMinecraft().thePlayer.getCurrentArmor(3 - i) != null && net.minecraft.client.Minecraft.getMinecraft().thePlayer
                    .getCurrentArmor(3 - i).getItem() instanceof JuggernautArmor.IItemPersonal) {
                n += Items.JAG[i].getMaxDamage()
                        - net.minecraft.client.Minecraft.getMinecraft().thePlayer.getCurrentArmor(3 - i).getItemDamage();
            }
        }
        if (n <= 0.0) {
            return;
        }
        net.minecraft.client.Minecraft.getMinecraft().renderEngine.bindTexture(JuggerHud.eu_bg);
        draw(1.0, 11.0, 40.0, 40.0, 1.0);
        net.minecraft.client.Minecraft.getMinecraft().renderEngine.bindTexture(JuggerHud.eu_lvl);
        draw(2.0, 12.0, 24.0, 24.0, n / n2);
        for (int j = 0; j < 4; ++j) {
            if (net.minecraft.client.Minecraft.getMinecraft().thePlayer.getCurrentArmor(3 - j) == null
                    || !(net.minecraft.client.Minecraft.getMinecraft().thePlayer.getCurrentArmor(3 - j)
                    .getItem() instanceof JuggernautArmor.IItemPersonal)) {
                return;
            }
        }
        net.minecraft.client.Minecraft.getMinecraft().renderEngine.bindTexture(JuggerHud.eu_bg);
        final Tessellator instance = Tessellator.instance;
        instance.startDrawingQuads();
        instance.addVertexWithUV(1.0, 91.0, -90.0, 0.0, 0.0);
        instance.addVertexWithUV(41.0, 91.0, -90.0, 1.0, 0.0);
        instance.addVertexWithUV(41.0, 51.0, -90.0, 1.0, 1.0);
        instance.addVertexWithUV(1.0, 51.0, -90.0, 0.0, 1.0);
        instance.draw();
        net.minecraft.client.Minecraft.getMinecraft().renderEngine.bindTexture(JuggerHud.eu_lvl);
        final ItemStack armor = net.minecraft.client.Minecraft.getMinecraft().thePlayer.getCurrentArmor(3);
        final NBTTagCompound nbt = JuggernautArmor.getTagCompound(armor);
        int shieldCharge = (int) (nbt.getInteger("cooldown") / 4.7f);
        int shield = Minecraft.thePlayer.getDataWatcher().getWatchableObjectInt(21);
        if (shield > 0) {
            shieldCharge = (int) (shield * 6F);
            GL11.glColor3f(1.0f, 0.0f, 0.0f);
        }
        final float n3 = shieldCharge / 127.0f;
        instance.startDrawingQuads();
        instance.addVertexWithUV(2.0, 90.0, -90.0, 0.0, 0.0);
        instance.addVertexWithUV(26.0, 90.0, -90.0, 1.0, 0.0);
        final float n4 = 24.0f * (1.0f - n3);
        instance.addVertexWithUV(26.0, 66.0f + n4, -90.0, 1.0, n3);
        instance.addVertexWithUV(2.0, 66.0f + n4, -90.0, 0.0, n3);
        instance.draw();
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
    }

    private static void drawRadar(final Minecraft Minecraft) {
        net.minecraft.client.Minecraft.getMinecraft().renderEngine.bindTexture(JuggerHud.radar_bg);
        draw(1.0, 11.0, 80.0, 80.0);
        net.minecraft.client.Minecraft.getMinecraft().renderEngine.bindTexture(JuggerHud.radar_tgt);
        /*
         * for (final RadarEntry RadarEntry : JuggerHud.entities) { final double n =
         * Minecraft.getMinecraft().thePlayer.rotationYaw / 180.0 * 3.141592653589793 +
         * Math.atan2(RadarEntry.x, RadarEntry.z); final double n2 = -Math.sin(n) *
         * RadarEntry.d * 0.3; final double n3 = Math.cos(n) * RadarEntry.d * 0.3;
         * draw(40.25 + n2, 50.25 - n3, 1.5, 1.5); }
         */
        net.minecraft.client.Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("mcuniversal", "textures/gui/spot.png"));
        for (final RadarEntry renderSpot : entities) {
            float[] color = null;
            if (renderSpot.id != 0) {
                color = PointColor.getColorById(renderSpot.id);
                final float d = (float) Math
                        .sqrt(renderSpot.posX * renderSpot.posX + renderSpot.posZ * renderSpot.posZ);
                final double n2;
                final double n = -Math
                        .sin(n2 = -net.minecraft.client.Minecraft.getMinecraft().thePlayer.rotationYaw / 180.0 * 3.141592653589793
                                + Math.atan2(renderSpot.posX, renderSpot.posZ))
                        * d * 0.3;
                final double n3 = Math.cos(n2) * d * 0.3;
                GL11.glColor4f(color[0], color[1], color[2], 1.0f);
                draw(n + 40.25, n3 + 50.25, 1.5, 1.5);
            }
        }
    }

    private static void draw(final double n, final double n2, final double n3, final double n4, final double n5) {
        final Tessellator instance = Tessellator.instance;
        instance.startDrawingQuads();
        instance.addVertexWithUV(n, n2 + n4, -90.0, 0.0, 1.0);
        instance.addVertexWithUV(n + n3, n2 + n4, -90.0, 1.0, 1.0);
        instance.addVertexWithUV(n + n3, n2 + n4 * (1.0 - n5), -90.0, 1.0, 1.0 - n5);
        instance.addVertexWithUV(n, n2 + n4 * (1.0 - n5), -90.0, 0.0, 1.0 - n5);
        instance.draw();
    }

    private static void draw(final double n, final double n2, final double n3, final double n4) {
        final Tessellator instance = Tessellator.instance;
        instance.startDrawingQuads();
        instance.addVertexWithUV(n, n2 + n4, -90.0, 0.0, 1.0);
        instance.addVertexWithUV(n + n3, n2 + n4, -90.0, 1.0, 1.0);
        instance.addVertexWithUV(n + n3, n2, -90.0, 1.0, 0.0);
        instance.addVertexWithUV(n, n2, -90.0, 0.0, 0.0);
        instance.draw();
    }
}
