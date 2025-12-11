// 
// Decompiled by Procyon v0.5.36
// 

package mcu.client.models;

import cpw.mods.fml.common.FMLCommonHandler;
import org.lwjgl.opengl.GL11;

public class ModelNazi implements EWjURWOUrw {
    MCUObject model;
    private int body;
    private int head;
    private int larm;
    private int rarm;
    private int lleg;
    private int rleg;
    private int lboot;
    private int rboot;

    public ModelNazi() {
        if (FMLCommonHandler.instance().getEffectiveSide().isClient()) {
            this.model = new MCUObject("Nazi.obj", getClass().getResourceAsStream("/assets/mcuniversal/obj/Nazi.obj"));
            GL11.glNewList(this.head = GL11.glGenLists(8), 4864);
            GL11.glPushMatrix();
            this.model.renderPart("Head");
            GL11.glPopMatrix();
            GL11.glEndList();
            GL11.glNewList(this.body = this.head + 1, 4864);
            GL11.glPushMatrix();
            this.model.renderPart("Body");
            GL11.glPopMatrix();
            GL11.glEndList();
            GL11.glNewList(this.larm = this.body + 1, 4864);
            GL11.glPushMatrix();
            this.model.renderPart("L_arm");
            GL11.glPopMatrix();
            GL11.glEndList();
            GL11.glNewList(this.rarm = this.larm + 1, 4864);
            GL11.glPushMatrix();
            this.model.renderPart("R_arm");
            GL11.glPopMatrix();
            GL11.glEndList();
            GL11.glNewList(this.lleg = this.rarm + 1, 4864);
            GL11.glPushMatrix();
            this.model.renderPart("L_leg");
            GL11.glPopMatrix();
            GL11.glEndList();
            GL11.glNewList(this.rleg = this.lleg + 1, 4864);
            GL11.glPushMatrix();
            this.model.renderPart("R_leg");
            GL11.glPopMatrix();
            GL11.glEndList();
            GL11.glNewList(this.lboot = this.rleg + 1, 4864);
            GL11.glPushMatrix();
            this.model.renderPart("L_boot");
            GL11.glPopMatrix();
            GL11.glEndList();
            GL11.glNewList(this.rboot = this.lboot + 1, 4864);
            GL11.glPushMatrix();
            this.model.renderPart("R_boot");
            GL11.glPopMatrix();
            GL11.glEndList();
        }
    }

    @Override
    public void render(final ArmorRender.ModelPart modelPart) {
        GL11.glTranslatef(0.0f, 1.55f, 0.0f);
        GL11.glScalef(-0.0101f, -0.0101f, -0.0101f);
        GL11.glPushAttrib(8200);
        GL11.glEnable(2884);
        GL11.glCullFace(1028);
        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        switch (modelPart) {
            case BODY: {
                GL11.glTranslatef(0.0f, 3.5f, 0.0f);
                GL11.glCallList(this.body);
                break;
            }
            case HEAD: {
                GL11.glTranslatef(0.0f, -6.0f, 0.0f);
                GL11.glScalef(1.1f, 1.05f, 1.05f);
                GL11.glCallList(this.head);
                break;
            }
            case LARM: {
                GL11.glTranslatef(-31.0f, 16.5f, 0.0f);
                GL11.glCallList(this.larm);
                break;
            }
            case RARM: {
                GL11.glTranslatef(31.0f, 16.5f, 0.0f);
                GL11.glCallList(this.rarm);
                break;
            }
            case LLEG: {
                GL11.glTranslatef(-13.0f, 78.0f, 0.0f);
                GL11.glCallList(this.lleg);
                break;
            }
            case RLEG: {
                GL11.glTranslatef(13.0f, 78.0f, 0.0f);
                GL11.glCallList(this.rleg);
                break;
            }
            case RBOOT: {
                GL11.glTranslatef(12.0f, 79.0f, 0.0f);
                GL11.glCallList(this.rboot);
                break;
            }
            case LBOOT: {
                GL11.glTranslatef(-12.0f, 79.0f, 0.0f);
                GL11.glCallList(this.lboot);
                break;
            }
            default:
                break;
        }
        GL11.glPopAttrib();
    }

}
