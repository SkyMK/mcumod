// 
// Decompiled by Procyon v0.5.36
// 

package mcu.client.models;

import cpw.mods.fml.common.FMLCommonHandler;
import mcu.utils.SidedProtection;
import org.lwjgl.opengl.GL11;

public class ModelJugger implements EWjURWOUrw {
    public static int BODY = 0;
    public static int HEAD = 1;
    public static int LARM = 2;
    public static int RARM = 3;
    public static int LLEG = 4;
    public static int RLEG = 5;
    public static int LBOOT = 6;
    public static int RBOOT = 7;
    MCUObject model;
    private int body;
    private int head;
    private int larm;
    private int rarm;
    private int lleg;
    private int rleg;
    private int lboot;
    private int rboot;
    private int vorot;

    public ModelJugger() {
        if (FMLCommonHandler.instance().getEffectiveSide().isClient()) {
            if (!SidedProtection.CLIENT)
                return;
            this.model = new MCUObject("jugger.obj", getClass().getResourceAsStream("/assets/mcuniversal/obj/jugger.obj"));
            this.head = GL11.glGenLists(9);
            GL11.glNewList(this.head, 4864);
            this.model.renderPart("head");
            GL11.glEndList();

            this.body = (this.head + 1);
            GL11.glNewList(this.body, 4864);
            this.model.renderPart("body");
            GL11.glEndList();

            this.larm = (this.body + 1);
            GL11.glNewList(this.larm, 4864);
            this.model.renderPart("left_arm");
            GL11.glEndList();

            this.rarm = (this.larm + 1);
            GL11.glNewList(this.rarm, 4864);
            this.model.renderPart("right_arm");
            GL11.glEndList();

            this.lleg = (this.rarm + 1);
            GL11.glNewList(this.lleg, 4864);
            this.model.renderPart("left_leg");
            GL11.glEndList();

            this.rleg = (this.lleg + 1);
            GL11.glNewList(this.rleg, 4864);
            this.model.renderPart("right_leg");
            GL11.glEndList();

            this.lboot = (this.rleg + 1);
            GL11.glNewList(this.lboot, 4864);
            this.model.renderPart("left_boot");
            GL11.glEndList();

            this.rboot = (this.lboot + 1);
            GL11.glNewList(this.rboot, 4864);
            this.model.renderPart("right_boot");
            GL11.glEndList();

            vorot = (this.rboot + 1);
            GL11.glNewList(this.vorot, 4864);
            this.model.renderPart("vorot");
            GL11.glEndList();
        }
    }

    @Override
    public void render(final ArmorRender.ModelPart modelPart) {
        GL11.glTranslatef(0.0f, 1.55f, 0.0f);
        GL11.glScalef(0.0101f, -0.0101f, 0.0101f);
        GL11.glPushAttrib(8200);
        GL11.glEnable(2884);
        GL11.glCullFace(1028);
        switch (modelPart) {
            case BODY: {
                GL11.glTranslatef(0.0F, 2.0F, 0.0F);
                GL11.glRotatef(180, 0F, 1F, 0F);
                GL11.glCallList(this.body);
                GL11.glCallList(this.vorot);
                break;
            }
            case HEAD: {
                GL11.glTranslatef(0.0F, 2.0F, 0.0F);
                GL11.glRotatef(180, 0F, 1F, 0F);
                GL11.glCallList(this.head);
                break;
            }
            case JAGVOROT: {
                GL11.glTranslatef(0.0F, 2.0F, 0.0F);
                GL11.glRotatef(180, 0F, 1F, 0F);
                GL11.glCallList(this.head);
                break;
            }
            case LARM: {
                GL11.glTranslatef(-34.6F, 16.5F, 0.0F);
                GL11.glRotatef(1, 0F, 1F, 0F);
                GL11.glCallList(this.larm);
                break;
            }
            case RARM: {
                GL11.glTranslatef(33.6F, 16.5F, 0.0F);
                GL11.glRotatef(-1, 0F, 1F, -0.3F);
                GL11.glCallList(this.rarm);
                break;
            }
            case LLEG: {
                GL11.glTranslatef(14.5F, 80.0F, 0.0F);
                GL11.glRotatef(180, 0F, 1F, 0F);
                GL11.glCallList(this.lleg);
                break;
            }
            case RLEG: {
                GL11.glTranslatef(-14.0F, 80.0F, 0.0F);
                GL11.glRotatef(180, 0F, 1F, 0F);
                GL11.glCallList(this.rleg);
                break;
            }
            case RBOOT: {
                GL11.glTranslatef(-12.0F, 80.0F, 0.0F);
                GL11.glRotatef(180, 0F, 1F, 0F);
                GL11.glCallList(this.rboot);
                break;
            }
            case LBOOT: {
                GL11.glTranslatef(12.0F, 80.0F, 0.0F);
                GL11.glRotatef(180, 0F, 1F, 0F);
                GL11.glCallList(this.lboot);
                break;
            }
        }
        GL11.glPopAttrib();
    }
}
