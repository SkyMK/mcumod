// 
// Decompiled by Procyon v0.5.36
// 

package mcu.client.models;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

public class ModelSamodel implements EWjURWOUrw {
    public static int BODY = 0;
    public static int HEAD = 1;
    public static int LARM = 2;
    public static int RARM = 3;
    public static int LLEG = 4;
    public static int RLEG = 5;
    @SideOnly(Side.CLIENT)
    MCUObject model;
    private int body;
    private int head;
    private int larm;
    private int rarm;
    private int lleg;
    private int rleg;

    public ModelSamodel() {
        if (FMLCommonHandler.instance().getEffectiveSide().isClient()) {
            this.model = new MCUObject("samodel.obj",
                    getClass().getResourceAsStream("/assets/mcuniversal/obj/samodel.obj"));
            GL11.glNewList(this.head = GL11.glGenLists(6), 4864);
            GL11.glPushMatrix();
            GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
            this.model.renderPart("Head");
            GL11.glPopMatrix();
            GL11.glEndList();
            GL11.glNewList(this.body = this.head + 1, 4864);
            GL11.glPushMatrix();
            GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
            this.model.renderPart("Torso");
            GL11.glPopMatrix();
            GL11.glEndList();
            GL11.glNewList(this.larm = this.body + 1, 4864);
            GL11.glPushMatrix();
            GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
            this.model.renderPart("LArm");
            GL11.glPopMatrix();
            GL11.glEndList();
            GL11.glNewList(this.rarm = this.larm + 1, 4864);
            GL11.glPushMatrix();
            GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
            this.model.renderPart("RArm");
            GL11.glPopMatrix();
            GL11.glEndList();
            GL11.glNewList(this.lleg = this.rarm + 1, 4864);
            GL11.glPushMatrix();
            GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
            this.model.renderPart("LLeg");
            GL11.glPopMatrix();
            GL11.glEndList();
            GL11.glNewList(this.rleg = this.lleg + 1, 4864);
            GL11.glPushMatrix();
            GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
            this.model.renderPart("RLeg");
            GL11.glPopMatrix();
            GL11.glEndList();
        }
    }

    @Override
    public void render(final ArmorRender.ModelPart modelPart) {
        GL11.glTranslatef(0.0f, 1.55f, 0.0f);
        GL11.glScalef(-1.0f, -1.0f, 1.0f);
        GL11.glPushAttrib(8200);
        GL11.glEnable(2884);
        GL11.glCullFace(1029);
        switch (modelPart) {
            case BODY: {
                GL11.glCallList(this.body);
                break;
            }
            case HEAD: {
                GL11.glScalef(1.05f, 1.05f, 1.05f);
                GL11.glTranslatef(0.0f, -0.05f, 0.0f);
                GL11.glCallList(this.head);
                break;
            }
            case LARM: {
                GL11.glTranslatef(0.31f, 0.05f, 0.0f);
                GL11.glCallList(this.larm);
                break;
            }
            case RARM: {
                GL11.glTranslatef(-0.31f, 0.4f, 0.0f);
                GL11.glCallList(this.rarm);
                break;
            }
            case LLEG: {
                GL11.glTranslatef(0.12f, 0.75f, 0.0f);
                GL11.glCallList(this.lleg);
                break;
            }
            case RLEG: {
                GL11.glTranslatef(-0.12f, 0.75f, 0.0f);
                GL11.glCallList(this.rleg);
                break;
            }
            default:
                break;
        }
        GL11.glPopAttrib();
    }
}
