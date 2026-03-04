/*
 * Decompiled with CFR 0.150.
 *
 * Could not load the following classes:
 *  WendoXObject
 *  IItemRenderer$amxy
 *  org.lwjgl.opengl.GL11
 */
package com.flansmod.client.model;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import mcu.MCU;
import mcu.client.models.MCUObject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

import java.util.HashMap;
import java.util.Map;

public class ModelGun extends ModelBase {
    public static final Map<Object, Integer> displayLists = new HashMap<Object, Integer>();
    public static boolean DRAWING_INVENTORY = false;
    public static MCUObject SAW = new MCUObject("SAW.obj",
            ModelGun.class.getResourceAsStream("/assets/mcuniversal/obj/SAW.obj"));
    public static MCUObject NY2020 = new MCUObject("ny2020.obj",
            ModelGun.class.getResourceAsStream("/assets/mcuniversal/obj/ny2020.obj"));
    public static MCUObject M249_2021 = new MCUObject("M249_2021.obj",
            ModelGun.class.getResourceAsStream("/assets/mcuniversal/obj/M249_2021.obj"));
    public static MCUObject GUN2021 = new MCUObject("gun2021.obj",
            ModelGun.class.getResourceAsStream("/assets/mcuniversal/obj/gun2021.obj"));
    public static MCUObject mcuniversalGUN = new MCUObject("mcuniversal.obj",
            ModelGun.class.getResourceAsStream("/assets/mcuniversal/obj/mcuniversal.obj"));
    public static ResourceLocation SAW_TEX = new ResourceLocation("mcuniversal:textures/SAW.png");
    public static ResourceLocation NY2020_TEX = new ResourceLocation("mcuniversal:textures/ny2020_tex.png");
    public static ResourceLocation M249_2021_TEX = new ResourceLocation("mcuniversal:textures/M249_2021.png");
    public static ResourceLocation GUN2021_TEX = new ResourceLocation("mcuniversal:textures/gun2021.png");
    public static ResourceLocation MCU_TEX = new ResourceLocation("mcuniversal:textures/mcuniversal.png");
    public ModelRendererTurbo[] gunModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] defaultBarrelModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] defaultScopeModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] defaultStockModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] defaultGripModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] ammoModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] slideModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] pumpModel = new ModelRendererTurbo[0];
    public Vector3f barrelAttachPoint = new Vector3f();
    public Vector3f scopeAttachPoint = new Vector3f();
    public Vector3f stockAttachPoint = new Vector3f();
    public Vector3f gripAttachPoint = new Vector3f();
    public float gunSlideDistance = 0.25f;
    public EnumAnimationType animationType = EnumAnimationType.NONE;
    public float tiltGunTime = 0.25f;
    public float unloadClipTime = 0.25f;
    public float loadClipTime = 0.25f;
    public float untiltGunTime = 0.25f;
    public boolean scopeIsOnSlide = false;
    public float numBulletsInReloadAnimation = 1.0f;
    public int pumpDelay = 0;
    public int pumpDelayAfterReload = 0;
    public int pumpTime = 1;
    public float pumpHandleDistance = 0.25f;
    private final ModelBiped mainModel = new ModelBiped();

    public void renderGun(float f) {
        this.render(this.gunModel, f, 0);
    }

    public void renderSlide(float f) {
        this.render(this.slideModel, f, 1);
    }

    public void renderPump(float f) {
        this.render(this.pumpModel, f, 2);
    }

    public void renderDefaultScope(float f) {
        this.render(this.defaultScopeModel, f, -1);
    }

    public void renderDefaultBarrel(float f) {
        this.render(this.defaultBarrelModel, f, -1);
    }

    public void renderDefaultStock(float f) {
        this.render(this.defaultStockModel, f, -1);
    }

    public void renderDefaultGrip(float f) {
        this.render(this.defaultGripModel, f, -1);
    }

    public void renderAmmo(float f) {
        if (RenderGun.renderType == IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON) {
            GL11.glPushMatrix();
            GL11.glScalef(0.05f, 0.05f, 0.05f);
            GL11.glScalef(1.5f, 1.0f, 1.5f);
            GL11.glTranslatef(-4.0f, -1.0f, -2.0f);
            GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(-50.0f, 0.0f, 0.0f, 1.0f);
            GL11.glRotatef(-10.0f, 1.0f, 0.0f, 0.0f);
            ResourceLocation resourceLocation = AbstractClientPlayer
                    .getLocationSkin(Minecraft.getMinecraft().thePlayer.getCommandSenderName());
            AbstractClientPlayer.getDownloadImageSkin(resourceLocation,
                    Minecraft.getMinecraft().thePlayer.getCommandSenderName());
            Minecraft.getMinecraft().renderEngine.bindTexture(resourceLocation);
            if (!DRAWING_INVENTORY) {
                this.mainModel.bipedLeftArm.render(0.625f);
            }
            GL11.glPopMatrix();
        }
        if (RenderGun.curritem != null && MCU.isSaw(RenderGun.curritem) && MCU.fancyGuns) {
            Minecraft.getMinecraft().renderEngine.bindTexture(SAW_TEX);
        } else if (RenderGun.curritem != null && MCU.isAK(RenderGun.curritem)) {
            Minecraft.getMinecraft().renderEngine.bindTexture(NY2020_TEX);
        } else if (RenderGun.curritem != null && MCU.is2021AK(RenderGun.curritem)) {
            Minecraft.getMinecraft().renderEngine.bindTexture(GUN2021_TEX);
        } else if (RenderGun.curritem != null && MCU.is2021SAW(RenderGun.curritem)) {
            Minecraft.getMinecraft().renderEngine.bindTexture(M249_2021_TEX);
        } else if (RenderGun.curritem != null && MCU.isMCUGun(RenderGun.curritem)) {
            Minecraft.getMinecraft().renderEngine.bindTexture(MCU_TEX);
        } else {
            Minecraft.getMinecraft().renderEngine
                    .bindTexture(FlansModResourceHandler.getTexture(RenderGun.currentRenderedGunType));
        }
        this.render(this.ammoModel, f, 3);
    }

    private void render(ModelRendererTurbo[] arrmodelRendererTurbo, float f, int n) {
        ModelRendererTurbo[] arrmodelRendererTurbo2 = arrmodelRendererTurbo;
        Integer n2 = displayLists.get(arrmodelRendererTurbo);
        if (MCU.clearDL) {
            for (Integer arrmodelRendererTurbo3 : displayLists.values()) {
                GL11.glDeleteLists(arrmodelRendererTurbo3, 1);
            }
            displayLists.clear();
            MCU.clearDL = false;
        }
        if (n2 != null) {
            if (RenderGun.curritem != null && MCU.isSaw(RenderGun.curritem) && MCU.fancyGuns) {
                GL11.glPushMatrix();
                GL11.glScalef(0.015f, 0.015f, 0.015f);
                GL11.glTranslatef(0.0f, 4.0f, 0.0f);
                GL11.glCallList(n2);
                GL11.glPopMatrix();
            } else if (RenderGun.curritem != null && MCU.is2021AK(RenderGun.curritem)) {
                GL11.glPushMatrix();
                GL11.glScalef(0.015f, 0.015f, 0.015f);
                GL11.glTranslatef(0.0f, 4.0f, 0.0f);
                GL11.glCallList(n2);
                GL11.glPopMatrix();
            } else if (RenderGun.curritem != null && MCU.is2021SAW(RenderGun.curritem)) {
                GL11.glPushMatrix();
                GL11.glCullFace(1028);
                GL11.glScalef(0.015f, 0.015f, -0.015f);
                GL11.glTranslatef(0.0f, 4.0f, 0.0f);
                GL11.glCallList(n2);
                GL11.glCullFace(1029);
                GL11.glPopMatrix();
            } else if (RenderGun.curritem != null && MCU.isMCUGun(RenderGun.curritem)) {
                GL11.glPushMatrix();
                GL11.glColor4f(0.85f, 0.85f, 1.0f, 1);
                GL11.glTranslatef(0.22f, 0.12f, 0.003f);
                GL11.glScalef(0.8f, 0.8f, 0.8f);
                GL11.glCallList(n2);
                GL11.glColor4f(1, 1, 1, 1);
                GL11.glPopMatrix();
            } else if (RenderGun.curritem != null && MCU.isAK(RenderGun.curritem)) {
                GL11.glPushMatrix();
                GL11.glScalef(0.015f, 0.015f, 0.015f);
                GL11.glTranslatef(0.0f, 4.0f, 0.0f);
                GL11.glCallList(n2);
                GL11.glPopMatrix();
            } else {
                GL11.glCallList(n2);
            }
        } else {
            int n3 = GL11.glGenLists(1);
            GL11.glNewList(n3, 4864);
            if (RenderGun.curritem != null && MCU.isMCUGun(RenderGun.curritem)) {
                switch (n) {
                    case 0: {
                        mcuniversalGUN.renderAllExcept("Magazine_defaultMaterial018");
                        break;
                    }
                    case 1: {
                        break;
                    }
                    case 2: {
                        break;
                    }
                    case 3: {
                        mcuniversalGUN.renderPart("Magazine_defaultMaterial018");
                        break;
                    }
                }
            } else if (RenderGun.curritem != null && MCU.isSaw(RenderGun.curritem) && MCU.fancyGuns) {
                switch (n) {
                    case 0: {
                        SAW.renderPart("korpus");
                        SAW.renderPart("krishka");
                        SAW.renderPart("ruchka");
                        SAW.renderPart("shtorka");
                        break;
                    }
                    case 1: {
                        SAW.renderPart("zatvor");
                        break;
                    }
                    case 2: {
                        break;
                    }
                    case 3: {
                        SAW.renderPart("korob");
                        SAW.renderPart("lenta1");
                        SAW.renderPart("lenta2");
                        SAW.renderPart("lenta3");
                        SAW.renderPart("lenta4");
                        SAW.renderPart("lenta5");
                        SAW.renderPart("lenta6");
                        break;
                    }
                }
            } else if (RenderGun.curritem != null && MCU.isAK(RenderGun.curritem)) {
                switch (n) {
                    case 0: {
                        NY2020.renderPart("korpus");
                        NY2020.renderPart("zatvor");
                        break;
                    }
                    case 1: {
                        break;
                    }
                    case 2: {
                        break;
                    }
                    case 3: {
                        NY2020.renderPart("magazin");
                        break;
                    }
                }
            } else if (RenderGun.curritem != null && MCU.is2021SAW(RenderGun.curritem)) {
                switch (n) {
                    case 0: {
                        M249_2021.renderPart("korpus");
                        M249_2021.renderPart("krishka");
                        M249_2021.renderPart("ruchka");
                        M249_2021.renderPart("shtorka");
                        break;
                    }
                    case 1: {
                        M249_2021.renderPart("zatvor");
                        break;
                    }
                    case 2: {
                        break;
                    }
                    case 3: {
                        M249_2021.renderPart("korob");
                        M249_2021.renderPart("lenta1");
                        M249_2021.renderPart("lenta2");
                        M249_2021.renderPart("lenta3");
                        M249_2021.renderPart("lenta4");
                        M249_2021.renderPart("lenta5");
                        M249_2021.renderPart("lenta6");
                        break;
                    }
                    default: {
                        break;
                    }
                }
            } else if (RenderGun.curritem != null && MCU.is2021AK(RenderGun.curritem)) {
                switch (n) {
                    case 0: {
                        GUN2021.renderPart("korpus");
                        GUN2021.renderPart("zatvor");
                        break;
                    }
                    case 1: {
                        break;
                    }
                    case 2: {
                        break;
                    }
                    case 3: {
                        GUN2021.renderPart("magazin");
                        break;
                    }
                    default: {
                        break;
                    }
                }
            } else {
                for (ModelRendererTurbo modelRendererTurbo : arrmodelRendererTurbo2) {
                    if (modelRendererTurbo == null)
                        continue;
                    modelRendererTurbo.renderNoDL(f);
                }
            }
            GL11.glEndList();
            displayLists.put(arrmodelRendererTurbo, n3);
        }
    }

    public void flipAll() {
        this.flip(this.gunModel);
        this.flip(this.defaultBarrelModel);
        this.flip(this.defaultScopeModel);
        this.flip(this.defaultStockModel);
        this.flip(this.defaultGripModel);
        this.flip(this.ammoModel);
        this.flip(this.slideModel);
        this.flip(this.pumpModel);
    }

    protected void flip(ModelRendererTurbo[] arrmodelRendererTurbo) {
        ModelRendererTurbo[] arrmodelRendererTurbo2 = arrmodelRendererTurbo;
        int n = arrmodelRendererTurbo.length;
        for (int i = 0; i < n; ++i) {
            ModelRendererTurbo modelRendererTurbo = arrmodelRendererTurbo2[i];
            modelRendererTurbo.doMirror(false, true, true);
            modelRendererTurbo.setRotationPoint(modelRendererTurbo.rotationPointX, -modelRendererTurbo.rotationPointY,
                    -modelRendererTurbo.rotationPointZ);
        }
    }

    public void translateAll(float f, float f2, float f3) {
        this.translate(this.gunModel, f, f2, f3);
        this.translate(this.defaultBarrelModel, f, f2, f3);
        this.translate(this.defaultScopeModel, f, f2, f3);
        this.translate(this.defaultStockModel, f, f2, f3);
        this.translate(this.defaultGripModel, f, f2, f3);
        this.translate(this.ammoModel, f, f2, f3);
        this.translate(this.slideModel, f, f2, f3);
        this.translate(this.pumpModel, f, f2, f3);
    }

    protected void translate(ModelRendererTurbo[] arrmodelRendererTurbo, float f, float f2, float f3) {
        ModelRendererTurbo[] arrmodelRendererTurbo2 = arrmodelRendererTurbo;
        int n = arrmodelRendererTurbo.length;
        for (int i = 0; i < n; ++i) {
            ModelRendererTurbo modelRendererTurbo = arrmodelRendererTurbo2[i];
            modelRendererTurbo.rotationPointX += f;
            modelRendererTurbo.rotationPointY += f2;
            modelRendererTurbo.rotationPointZ += f3;
        }
    }
}
