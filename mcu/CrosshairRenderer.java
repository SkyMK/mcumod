/*
 * Decompiled with CFR 0.150.
 *
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Pre
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$amxy
 *  net.minecraftforge.event.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package com.flansmod.mcu;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.FlansModPlayerData;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mcu.MCU;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import org.lwjgl.opengl.GL11;

@SideOnly(value = Side.CLIENT)
public class CrosshairRenderer {
    public static int death_count = 0;
    public static int hit_count = 0;

    protected static void renderCrosshairs(int n, int n2, float f) {
        Item item;
        double d = Minecraft.getMinecraft().gameSettings.fovSetting;
        d = d / 2.0 * 3.1415927 / 180.0;
        d = 1.0 / Math.tan(d);
        int n3 = n / 2;
        int n4 = n2 / 2;
        FlansModPlayerData flansModPlayerData = FlansModClient.clientPlayerData;
        double d2 = BulletSpread.prevClientSpread
                + (flansModPlayerData.bulletSpread - BulletSpread.prevClientSpread) * f;
        d2 *= 0.0044;
        d2 *= d;
        int n5 = (int) (d2 *= n2);
        GL11.glDisable(3553);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glEnable(3042);
        GL11.glBlendFunc(775, 769);
        boolean bl = Util.isAiming() && n5 == 0;
        boolean bl2 = false;
        boolean bl3 = false;
        ItemStack itemStack = Minecraft.getMinecraft().thePlayer.getCurrentEquippedItem();
        if (itemStack != null && (item = itemStack.getItem()) instanceof ItemGun) {
            ItemGun itemGun = (ItemGun) item;
            GunType gunType = itemGun.type;
            AttachmentType attachmentType = gunType.getScope(itemStack);
            if (attachmentType != null) {
                bl2 = true;
            }
            if ((((attachmentType = gunType.getGrip(itemStack)) != null && attachmentType.bipod)
                    || MCU.autoBipod(itemStack)) && FlansModClient.bipod) {
                bl3 = true;
            }
        }
        ItemGun.bipod = bl3;
        if (!bl || !bl2 || bl3) {
            int n6 = FlansModClient.bipod ? 2 : 0;
            Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(n3 - n5 - 4 + n6, n4, 0, 0, 4 - n6, 1);
            Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(n3 + n5 + 1, n4, 0, 0, 4 - n6, 1);
            if (!bl || !bl2) {
                if (FlansModClient.bipod) {
                    Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(n3 - n5 - 7 + n6, n4, 0, 0, 2, 1);
                    Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(n3 + n5 + 4, n4, 0, 0, 2, 1);
                }
                Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(n3, n4 + n5 + 1, 0, 0, 1, 4);
                if (!bl) {
                    Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(n3, n4 - n5 - 4, 0, 0, 1, 4);
                }
            }
        }
        if (hit_count > 0 || death_count > 0) {
            if (death_count > 0) {
                GL11.glDisable(3042);
                GL11.glColor4f(1.0f, 0.0f, 0.0f, 1.0f);
            }
            Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(n3, n4, 0, 0, 1, 1);
            Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(n3 - 1, n4 - 1, 0, 0, 1, 1);
            Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(n3 + 1, n4 + 1, 0, 0, 1, 1);
            Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(n3 - 1, n4 + 1, 0, 0, 1, 1);
            Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(n3 + 1, n4 - 1, 0, 0, 1, 1);
            if (death_count > 0) {
                GL11.glEnable(3042);
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            }
        }
        if (death_count > 0) {
            GL11.glDisable(3042);
            GL11.glColor4f(1.0f, 0.0f, 0.0f, 1.0f);
            Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(n3 - 2, n4 - 2, 0, 0, 1, 1);
            Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(n3 + 2, n4 + 2, 0, 0, 1, 1);
            Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(n3 - 2, n4 + 2, 0, 0, 1, 1);
            Minecraft.getMinecraft().ingameGUI.drawTexturedModalRect(n3 + 2, n4 - 2, 0, 0, 1, 1);
            GL11.glEnable(3042);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        GL11.glDisable(3042);
        GL11.glEnable(3553);
    }

    @SubscribeEvent
    public void onHUDDrawing(RenderGameOverlayEvent.Pre pre) {
        if (pre.type == RenderGameOverlayEvent.ElementType.CROSSHAIRS) {
            pre.setCanceled(true);
            CrosshairRenderer.renderCrosshairs(pre.resolution.getScaledWidth(), pre.resolution.getScaledHeight(),
                    pre.partialTicks);
        }
    }
}
