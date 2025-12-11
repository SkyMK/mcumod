package mcu.client.models;

import cpw.mods.fml.common.FMLCommonHandler;
import org.lwjgl.opengl.GL11;

public class ModelPlagueDoctor implements EWjURWOUrw {
    MCUObject model;
    private int body;
    private int head;
    private int larm;
    private int rarm;
    private int lleg;
    private int rleg;
    private int lboot;
    private int rboot;

    public ModelPlagueDoctor() {
        if (FMLCommonHandler.instance().getEffectiveSide().isClient()) {
            head = GL11.glGenLists(8);
            model = new MCUObject("PlagueDoctor.obj",
                    ModelPlagueDoctor.class.getResourceAsStream("/assets/mcuniversal/obj/PlagueDoctor.obj"));
            GL11.glNewList(this.head, 4864);
            GL11.glPushMatrix();
            GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
            this.model.renderPart("Head");
            GL11.glPopMatrix();
            GL11.glEndList();
            this.body = this.head + 1;
            GL11.glNewList(this.body, 4864);
            GL11.glPushMatrix();
            GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
            this.model.renderPart("Body");
            GL11.glPopMatrix();
            GL11.glEndList();
            this.larm = this.body + 1;
            GL11.glNewList(this.larm, 4864);
            GL11.glPushMatrix();
            GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
            this.model.renderPart("Left_right");
            GL11.glPopMatrix();
            GL11.glEndList();
            this.rarm = this.larm + 1;
            GL11.glNewList(this.rarm, 4864);
            GL11.glPushMatrix();
            GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
            this.model.renderPart("Right_arm");
            GL11.glPopMatrix();
            GL11.glEndList();
            this.lleg = this.rarm + 1;
            GL11.glNewList(this.lleg, 4864);
            GL11.glPushMatrix();
            GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
            this.model.renderPart("Left_pant");
            GL11.glPopMatrix();
            GL11.glEndList();
            this.rleg = this.lleg + 1;
            GL11.glNewList(this.rleg, 4864);
            GL11.glPushMatrix();
            GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
            this.model.renderPart("Right_pant");
            GL11.glPopMatrix();
            GL11.glEndList();
            this.lboot = this.rleg + 1;
            GL11.glNewList(this.lboot, 4864);
            GL11.glPushMatrix();
            GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
            this.model.renderPart("Left_leg");
            GL11.glPopMatrix();
            GL11.glEndList();
            this.rboot = this.lboot + 1;
            GL11.glNewList(this.rboot, 4864);
            GL11.glPushMatrix();
            GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
            this.model.renderPart("Right_leg");
            GL11.glPopMatrix();
            GL11.glEndList();
        }
    }

    public void render(ArmorRender.ModelPart modelPart) {
        GL11.glTranslatef(0.0f, 1.55f, 0.0f);
        GL11.glScalef(-0.00152f, -0.00152f, -0.00152f);
        GL11.glPushAttrib(8200);
        GL11.glEnable(2884);
        GL11.glCullFace(1028);
        switch (modelPart) {
            case HEAD: {
                GL11.glTranslatef(0.0f, 0.2f, 0.0f);
                GL11.glScalef(1.0f, 1.05f, 1.05f);
                GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
                GL11.glCallList(this.head);
                break;
            }
            case BODY: {
                GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
                GL11.glTranslatef(0.0f, 50.0f, 0.0f);
                GL11.glCallList(this.body);
                break;
            }
            case LARM: {
                GL11.glTranslatef(240.0f, 20.0f, 0.0f);
                GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
                GL11.glScalef(1.12f, 1.12f, 1.12f);
                GL11.glCallList(this.larm);
                break;
            }
            case RARM: {
                GL11.glTranslatef(-240.0f, 20.0f, 0.0f);
                GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
                GL11.glScalef(1.12f, 1.12f, 1.12f);
                GL11.glCallList(this.rarm);
                break;
            }
            case LLEG: {
                GL11.glTranslatef(81.0f, 530.0f, 0.0f);
                GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
                GL11.glCallList(this.lleg);
                break;
            }
            case RLEG: {
                GL11.glTranslatef(-81.0f, 530.0f, 0.0f);
                GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
                GL11.glCallList(this.rleg);
                break;
            }
            case LBOOT: {
                GL11.glTranslatef(80.0f, 531.0f, 0.0f);
                GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
                GL11.glCallList(this.lboot);
                break;
            }
            case RBOOT: {
                GL11.glTranslatef(-80.0f, 531.0f, 0.0f);
                GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
                GL11.glCallList(this.rboot);
            }
        }
        GL11.glPopAttrib();
    }
}
