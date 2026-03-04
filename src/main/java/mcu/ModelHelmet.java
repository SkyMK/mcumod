// 
// Decompiled by Procyon v0.5.36
// 

package mcu.client.models;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

public class ModelHelmet implements EWjURWOUrw {
    private static final int HELMET = 0;
    private static final int HEHELMETGL = 1;
    private static final int HELMETPNV = 2;
    private static int helmet;
    private static int helmetgl;
    private static int helmetpnv;
    @SideOnly(Side.CLIENT)
    private static MCUObject model;

    static {
        if (FMLCommonHandler.instance().getEffectiveSide().isClient()) {
            ModelHelmet.model = new MCUObject("helmet.obj",
                    ModelHelmet.class.getResourceAsStream("/assets/mcuniversal/obj/helmet.obj"));
            GL11.glNewList(helmetgl = GL11.glGenLists(3), 4864);
            GL11.glPushMatrix();
            ModelHelmet.model.renderPart("helmet");
            ModelHelmet.model.renderPart("oculus");
            GL11.glPopMatrix();
            GL11.glEndList();
            GL11.glNewList(helmet = ModelHelmet.helmetgl + 1, 4864);
            GL11.glPushMatrix();
            ModelHelmet.model.renderPart("helmet");
            GL11.glPopMatrix();
            GL11.glEndList();
            GL11.glNewList(helmetpnv = ModelHelmet.helmet + 1, 4864);
            GL11.glPushMatrix();
            ModelHelmet.model.renderPart("helmet");
            ModelHelmet.model.renderPart("oculus");
            ModelHelmet.model.renderPart("pnv");
            GL11.glPopMatrix();
            GL11.glEndList();
        }
    }

    protected void renderIntertnal(int n) {
        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        GL11.glTranslatef(0.0f, -0.24f, 0.0f);
        GL11.glScalef(-0.0025f, -0.0025f, 0.0025f);
        switch (n) {
            case 1: {
                GL11.glTranslatef(0.0f, 0.0f, 0.0f);
                GL11.glScalef(1.05f, 1.05f, 1.05f);
                GL11.glCallList(ModelHelmet.helmetgl);
                break;
            }
            case 0: {
                GL11.glTranslatef(0.0f, 0.0f, 0.0f);
                GL11.glScalef(1.05f, 1.05f, 1.05f);
                GL11.glCallList(ModelHelmet.helmet);
                break;
            }
            case 2: {
                GL11.glTranslatef(0.0f, 0.0f, 0.0f);
                GL11.glScalef(1.05f, 1.05f, 1.05f);
                GL11.glCallList(ModelHelmet.helmetpnv);
                break;
            }
        }
    }

    @Override
    public void render(ArmorRender.ModelPart modelPart) {
        if (modelPart == ArmorRender.ModelPart.HEAD) {
            this.renderIntertnal(0);
        }
    }

    public static class PNV extends ModelHelmet {
        @Override
        public void render(ArmorRender.ModelPart modelPart) {
            if (modelPart == ArmorRender.ModelPart.HEAD) {
                this.renderIntertnal(2);
            }
        }
    }

    public static class GL extends ModelHelmet {
        @Override
        public void render(ArmorRender.ModelPart modelPart) {
            if (modelPart == ArmorRender.ModelPart.HEAD) {
                this.renderIntertnal(1);
            }
        }
    }
}
