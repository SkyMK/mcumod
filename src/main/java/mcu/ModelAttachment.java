/*
 * Decompiled with CFR 0.150.
 *
 * Could not load the following classes:
 *  WendoXObject
 *  org.lwjgl.opengl.GL11
 */
package com.flansmod.client.model;

import com.flansmod.client.tmt.ModelRendererTurbo;
import mcu.MCU;
import mcu.client.models.MCUObject;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class ModelAttachment extends ModelBase {
    public static ResourceLocation REDDOT_SIGHT_TEX;
    public static ResourceLocation US_Silenser_TEX;
    public static ResourceLocation Vert_Grip_TEX;
    private static int scope;
    private static int barrel;
    private static int foregrip;

    static {
        REDDOT_SIGHT_TEX = new ResourceLocation("mcuniversal:textures/REDDOT_SIGHT.png");
        US_Silenser_TEX = new ResourceLocation("mcuniversal:textures/US_Silenser.png");
        Vert_Grip_TEX = new ResourceLocation("mcuniversal:textures/Vert_Grip.png");
    }

    public ModelRendererTurbo[] attachmentModel = new ModelRendererTurbo[0];
    public float renderOffset = 0.0f;
    MCUObject REDDOT_SIGHT = new MCUObject("REDDOT_SIGHT.obj",
            ModelGun.class.getResourceAsStream("/assets/mcuniversal/obj/REDDOT_SIGHT.obj"));
    MCUObject US_Silenser = new MCUObject("US_Silenser.obj",
            ModelGun.class.getResourceAsStream("/assets/mcuniversal/obj/US_Silenser.obj"));
    MCUObject Vert_Grip = new MCUObject("Vert_Grip.obj",
            ModelGun.class.getResourceAsStream("/assets/mcuniversal/obj/Vert_Grip.obj"));

    public void renderAttachment(float f, int n) {
        if (!MCU.ATTACH_RENDERED) {
            scope = GL11.glGenLists(3);
            GL11.glNewList(scope, 4864);
            this.REDDOT_SIGHT.renderAll();
            GL11.glEndList();
            barrel = scope + 1;
            GL11.glNewList(barrel, 4864);
            this.US_Silenser.renderAll();
            GL11.glEndList();
            foregrip = barrel + 1;
            GL11.glNewList(foregrip, 4864);
            this.Vert_Grip.renderAll();
            GL11.glEndList();
            MCU.ATTACH_RENDERED = true;
        }
        if (RenderGun.curritem != null && MCU.isSaw(RenderGun.curritem) && MCU.fancyGuns) {
            switch (n) {
                case 0: {
                    GL11.glPopMatrix();
                    GL11.glPushMatrix();
                    GL11.glPushMatrix();
                    GL11.glTranslatef(0.015f, 0.36f, 0.0f);
                    GL11.glScalef(0.02f, 0.02f, 0.02f);
                    GL11.glPushAttrib(8192);
                    GL11.glDisable(2884);
                    GL11.glCallList(scope);
                    GL11.glPopAttrib();
                    GL11.glPopMatrix();
                    break;
                }
                case 1: {
                    GL11.glPopMatrix();
                    GL11.glPushMatrix();
                    GL11.glPushMatrix();
                    GL11.glTranslatef(1.0f, 0.2725f, 0.0f);
                    GL11.glScalef(0.02f, 0.02f, 0.02f);
                    GL11.glCallList(barrel);
                    GL11.glPopMatrix();
                    break;
                }
                case 2: {
                    GL11.glPopMatrix();
                    GL11.glPushMatrix();
                    GL11.glPushMatrix();
                    GL11.glTranslatef(0.5f, 0.16f, 0.0f);
                    GL11.glScalef(0.02f, 0.02f, 0.02f);
                    GL11.glCallList(foregrip);
                    GL11.glPopMatrix();
                }
            }
            return;
        }
        ModelRendererTurbo[] arrmodelRendererTurbo = this.attachmentModel;
        int n2 = arrmodelRendererTurbo.length;
        for (int i = 0; i < n2; ++i) {
            ModelRendererTurbo modelRendererTurbo = arrmodelRendererTurbo[i];
            if (modelRendererTurbo == null)
                continue;
            modelRendererTurbo.renderNoDL(f);
        }
    }
}
