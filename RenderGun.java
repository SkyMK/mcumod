/*
 * Decompiled with CFR 0.150.
 *
 * Could not load the following classes:
 *  neda
 *  neda$amxx
 *  neda$amxy
 *  org.lwjgl.opengl.GL11
 */
package com.flansmod.client.model;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemGun;
import mcu.MCU;
import mcu.client.MCUAbstractClientPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

import java.util.Random;

public class RenderGun implements IItemRenderer {
    private static final Random rng = new Random();
    public static ItemStack curritem;
    public static GunType currentRenderedGunType;
    public static ItemRenderType renderType;
    public static float smoothing;
    private static TextureManager renderEngine = Minecraft.getMinecraft().renderEngine;
    private final ModelBiped mainModel = new ModelBiped();

    public boolean handleRenderType(ItemStack itemStack, ItemRenderType amxy2) {
        switch (amxy2) {
            case ENTITY: {
                if (!Minecraft.getMinecraft().gameSettings.fancyGraphics) {
                    return false;
                }
            }
            case EQUIPPED:
            case EQUIPPED_FIRST_PERSON: {
                return itemStack != null && itemStack.getItem() instanceof ItemGun
                        && ((ItemGun) itemStack.getItem()).type.model != null;
            }
        }
        return false;
    }

    public boolean shouldUseRenderHelper(ItemRenderType amxy2, ItemStack itemStack, ItemRendererHelper amxx2) {
        return false;
    }

    public void renderItem(ItemRenderType amxy2, ItemStack itemStack, Object... arrobject) {
        if (!(itemStack.getItem() instanceof ItemGun)) {
            return;
        }
        GunType gunType = ((ItemGun) itemStack.getItem()).type;
        if (gunType == null) {
            return;
        }
        ModelGun modelGun = gunType.model;
        if (modelGun == null) {
            return;
        }
        GunAnimations gunAnimations = (GunAnimations) FlansModClient.gunAnimationsRight.get(arrobject[1]);
        if (gunAnimations == null) {
            gunAnimations = new GunAnimations();
            if (amxy2 != ItemRenderType.ENTITY) {
                FlansModClient.gunAnimationsRight.put(arrobject[1], gunAnimations);
            }
        }
        GL11.glPushMatrix();
        float f = 0.0f;
        block0:
        switch (amxy2) {
            case ENTITY: {
                EntityItem entityItem = (EntityItem) arrobject[1];
                if (entityItem.rotationPitch == 0.0f) {
                    entityItem.rotationPitch = rng.nextBoolean() ? 90.0f : -90.0f;
                    entityItem.rotationYaw = rng.nextFloat() * 360.0f;
                }
                GL11.glRotatef(entityItem.rotationYaw, 0.0f, 1.0f, 0.0f);
                GL11.glRotatef(entityItem.rotationPitch, 1.0f, 0.0f, 0.0f);
                GL11.glScalef(2.0f, 2.0f, 2.0f);
                break;
            }
            case EQUIPPED: {
                GL11.glRotatef(35.0f, 0.0f, 0.0f, 1.0f);
                GL11.glRotatef(-5.0f, 0.0f, 1.0f, 0.0f);
                GL11.glTranslatef(0.75f, -0.22f, -0.08f);
                GL11.glScalef(1.0f, 1.0f, -1.0f);
                break;
            }
            case EQUIPPED_FIRST_PERSON: {
                float f2 = FlansModClient.lastZoomProgress
                        + (FlansModClient.zoomProgress - FlansModClient.lastZoomProgress) * smoothing;
                GL11.glRotatef(25.0f - 5.0f * f2, 0.0f, 0.0f, 1.0f);
                GL11.glRotatef(-5.0f, 0.0f, 1.0f, 0.0f);
                ItemGun itemGun = (ItemGun) itemStack.getItem();
                float f3 = (gunAnimations.lastGunSlide + (gunAnimations.gunSlide - gunAnimations.lastGunSlide) * smoothing)
                        * 0.04f * itemGun.getClientRecoil(itemStack);
                GL11.glTranslatef(-f3, -f3 * 0.1f, 0.0f);
                float f4 = 0.175f;
                AttachmentType attachmentType = gunType.getScope(itemStack);
                if (attachmentType != null) {
                    f4 = gunType.yOffset;
                    f4 += modelGun.scopeAttachPoint.y * gunType.modelScale;
                    f4 = MCU.isSaw(itemStack) && MCU.fancyGuns ? f4 - 0.11f : f4 - attachmentType.yOffset;
                }
                if (MCU.isAK(itemStack)) {
                    f4 = 0.195f;
                }
                GL11.glTranslatef(0.25f, 0.2f + f4 * f2, -0.597f - 0.405f * f2);
                GL11.glRotatef(4.5f * f2, 0.0f, 0.0f, 1.0f);
                GL11.glTranslatef(0.0f, -0.03f * f2, 0.0f);
                if (!gunAnimations.reloading)
                    break;
                float f5 = gunAnimations.lastReloadAnimationProgress
                        + (gunAnimations.reloadAnimationProgress - gunAnimations.lastReloadAnimationProgress) * smoothing;
                f = 1.0f;
                if (f5 < modelGun.tiltGunTime) {
                    f = f5 / modelGun.tiltGunTime;
                }
                if (f5 > modelGun.tiltGunTime + modelGun.unloadClipTime + modelGun.loadClipTime) {
                    f = 1.0f - (f5 - (modelGun.tiltGunTime + modelGun.unloadClipTime + modelGun.loadClipTime))
                            / modelGun.untiltGunTime;
                }
                switch (modelGun.animationType) {
                    case BOTTOM_CLIP:
                    case PISTOL_CLIP:
                    case SHOTGUN:
                    case END_LOADED: {
                        GL11.glRotatef(20.0f * f, 0.0f, 0.0f, 1.0f);
                        GL11.glRotatef(15.0f * f, 1.0f, 0.0f, 0.0f);
                        break block0;
                    }
                    case RIFLE: {
                        GL11.glRotatef(30.0f * f, 0.0f, 0.0f, 1.0f);
                        GL11.glRotatef(-30.0f * f, 1.0f, 0.0f, 0.0f);
                    }
                }
            }
        }
        if (FlansModClient.currentScope == null || !FlansModClient.currentScope.hasZoomOverlay()
                || Minecraft.getMinecraft().currentScreen != null || FlansModClient.zoomProgress <= 0.8f) {
            renderType = amxy2;
            this.renderGun(itemStack, gunType, 0.0625f, modelGun, gunAnimations, f);
        }
        GL11.glPopMatrix();
    }

    public void renderGun(ItemStack itemStack, GunType gunType, float f, ModelGun modelGun, GunAnimations gunAnimations,
                          float f2) {
        int n;
        if (gunAnimations == null) {
            gunAnimations = GunAnimations.defaults;
        }
        renderEngine = Minecraft.getMinecraft().renderEngine;
        AttachmentType attachmentType = gunType.getScope(itemStack);
        AttachmentType attachmentType2 = gunType.getBarrel(itemStack);
        AttachmentType attachmentType3 = gunType.getStock(itemStack);
        AttachmentType attachmentType4 = gunType.getGrip(itemStack);
        ItemStack[] arritemStack = new ItemStack[gunType.numAmmoItemsInGun];
        boolean bl = true;
        for (n = 0; n < gunType.numAmmoItemsInGun; ++n) {
            arritemStack[n] = ((ItemGun) itemStack.getItem()).getBulletItemStack(itemStack, n);
            if (arritemStack[n] == null || !(arritemStack[n].getItem() instanceof ItemBullet)
                    || arritemStack[n].getItemDamage() >= arritemStack[n].getMaxDamage())
                continue;
            bl = false;
        }
        curritem = itemStack;
        currentRenderedGunType = gunType;
        if (curritem != null && MCU.isSaw(itemStack) && MCU.fancyGuns) {
            renderEngine.bindTexture(ModelGun.SAW_TEX);
        } else if (curritem != null && MCU.isAK(itemStack)) {
            renderEngine.bindTexture(ModelGun.NY2020_TEX);
        } else if (curritem != null && MCU.is2021AK(itemStack)) {
            renderEngine.bindTexture(ModelGun.GUN2021_TEX);
        } else if (curritem != null && MCU.is2021SAW(itemStack)) {
            renderEngine.bindTexture(ModelGun.M249_2021_TEX);
        } else if (curritem != null && MCU.isMCUGun(itemStack)) {
            renderEngine.bindTexture(ModelGun.MCU_TEX);
        } else {
            renderEngine.bindTexture(FlansModResourceHandler.getTexture(gunType));
        }
        if (attachmentType != null) {
            GL11.glTranslatef(0.0f, -attachmentType.model.renderOffset / 16.0f, 0.0f);
        }
        if (renderType == ItemRenderType.EQUIPPED_FIRST_PERSON) {
            GL11.glPushMatrix();
            ResourceLocation resourceLocation = MCUAbstractClientPlayer
                    .getLocationSkin(Minecraft.getMinecraft().thePlayer.getCommandSenderName());
            MCUAbstractClientPlayer.getDownloadImageSkin(resourceLocation,
                    Minecraft.getMinecraft().thePlayer.getCommandSenderName());
            Minecraft.getMinecraft().renderEngine.bindTexture(resourceLocation);
            GL11.glScalef(0.05f, 0.05f, 0.05f);
            GL11.glScalef(1.5f, 1.0f, 1.5f);
            GL11.glTranslatef(-5.0f, 0.0f, -1.0f);
            GL11.glRotatef(-90.0f, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(-80.0f, 0.0f, 0.0f, 1.0f);
            if (!ModelGun.DRAWING_INVENTORY) {
                this.mainModel.bipedLeftArm.render(0.625f);
            }
            GL11.glPopMatrix();
        }
        GL11.glPushMatrix();
        GL11.glScalef(gunType.modelScale, gunType.modelScale, gunType.modelScale);
        if (curritem != null && MCU.isSaw(itemStack) && MCU.fancyGuns) {
            renderEngine.bindTexture(ModelGun.SAW_TEX);
        } else if (curritem != null && MCU.isAK(itemStack)) {
            renderEngine.bindTexture(ModelGun.NY2020_TEX);
        } else if (curritem != null && MCU.is2021AK(itemStack)) {
            renderEngine.bindTexture(ModelGun.GUN2021_TEX);
        } else if (curritem != null && MCU.is2021SAW(itemStack)) {
            renderEngine.bindTexture(ModelGun.M249_2021_TEX);
        } else if (curritem != null && MCU.isMCUGun(itemStack)) {
            renderEngine.bindTexture(ModelGun.MCU_TEX);
        } else {
            renderEngine.bindTexture(FlansModResourceHandler.getTexture(gunType));
        }
        modelGun.renderGun(f);
        if (attachmentType == null && !modelGun.scopeIsOnSlide) {
            modelGun.renderDefaultScope(f);
        }
        if (attachmentType2 == null) {
            modelGun.renderDefaultBarrel(f);
        }
        if (attachmentType3 == null) {
            modelGun.renderDefaultStock(f);
        }
        if (attachmentType4 == null) {
            modelGun.renderDefaultGrip(f);
        }
        GL11.glPushMatrix();
        GL11.glTranslatef(
                -(gunAnimations.lastGunSlide + (gunAnimations.gunSlide - gunAnimations.lastGunSlide) * smoothing)
                        * modelGun.gunSlideDistance,
                0.0f, 0.0f);
        modelGun.renderSlide(f);
        if (attachmentType == null && modelGun.scopeIsOnSlide) {
            modelGun.renderDefaultScope(f);
        }
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(-(1.0f
                - Math.abs(gunAnimations.lastPumped + (gunAnimations.pumped - gunAnimations.lastPumped) * smoothing))
                * modelGun.pumpHandleDistance, 0.0f, 0.0f);
        modelGun.renderPump(f);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        n = 1;
        switch (modelGun.animationType) {
            case END_LOADED: {
                if (!bl)
                    break;
                n = 0;
            }
        }
        if (n != 0 && gunAnimations.reloading && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0) {
            float f3 = gunAnimations.lastReloadAnimationProgress
                    + (gunAnimations.reloadAnimationProgress - gunAnimations.lastReloadAnimationProgress) * smoothing;
            float f4 = 0.0f;
            if (f3 > modelGun.tiltGunTime && f3 < modelGun.tiltGunTime + modelGun.unloadClipTime) {
                f4 = (f3 - modelGun.tiltGunTime) / modelGun.unloadClipTime;
            }
            if (f3 >= modelGun.tiltGunTime + modelGun.unloadClipTime
                    && f3 < modelGun.tiltGunTime + modelGun.unloadClipTime + modelGun.loadClipTime) {
                f4 = 1.0f - (f3 - (modelGun.tiltGunTime + modelGun.unloadClipTime)) / modelGun.loadClipTime;
            }
            switch (modelGun.animationType) {
                case BOTTOM_CLIP: {
                    GL11.glRotatef(-90.0f * f4 * f4, 0.0f, 0.0f, 1.0f);
                    GL11.glTranslatef(0.0f, -1.0f * f4, 0.0f);
                    GL11.glTranslatef(0.5f * f4, 0.0f, 0.0f);
                    break;
                }
                case PISTOL_CLIP: {
                    GL11.glRotatef(-90.0f * f4 * f4, 0.0f, 0.0f, 1.0f);
                    GL11.glTranslatef(0.0f, -1.0f * f4, 0.0f);
                    break;
                }
                case P90: {
                    GL11.glRotatef(-15.0f * f2 * f2, 0.0f, 0.0f, 1.0f);
                    GL11.glTranslatef(0.0f, 0.075f * f2, 0.0f);
                    GL11.glTranslatef(-2.0f * f4, -0.3f * f4, -0.5f * f4);
                    break;
                }
                case RIFLE: {
                    float f5 = f4 * modelGun.numBulletsInReloadAnimation;
                    int n2 = MathHelper.floor_float(f5);
                    float f6 = f5 - (float) n2;
                    GL11.glRotatef(f6 * 15.0f, 0.0f, 1.0f, 0.0f);
                    GL11.glRotatef(f6 * 15.0f, 0.0f, 0.0f, 1.0f);
                    GL11.glTranslatef(f6 * -1.0f, 0.0f, f6 * -0.5f);
                    break;
                }
                case SHOTGUN: {
                    float f7 = f4 * modelGun.numBulletsInReloadAnimation;
                    int n3 = MathHelper.floor_float(f7);
                    float f8 = f7 - (float) n3;
                    GL11.glRotatef(f8 * -30.0f, 0.0f, 0.0f, 1.0f);
                    GL11.glTranslatef(f8 * -0.5f, f8 * -1.0f, 0.0f);
                    break;
                }
                case END_LOADED: {
                    float f9 = 1.0f;
                    if (f3 > modelGun.tiltGunTime) {
                        f9 = 1.0f - Math
                                .min((f3 - modelGun.tiltGunTime) / (modelGun.unloadClipTime + modelGun.loadClipTime), 1.0f);
                    }
                    GL11.glTranslatef(f9, 0.0f, 0.0f);
                    if (!(f9 > 0.5f))
                        break;
                    GL11.glTranslatef(-3.0f * (f9 - 0.5f), 0.0f, 0.0f);
                    GL11.glRotatef(-180.0f * (f9 - 0.5f), 0.0f, 0.0f, 1.0f);
                }
            }
        }
        if (n != 0) {
            modelGun.renderAmmo(f);
        }
        GL11.glPopMatrix();
        GL11.glPopMatrix();
        if (attachmentType != null) {
            GL11.glPushMatrix();
            if (curritem != null && MCU.isSaw(itemStack) && MCU.fancyGuns) {
                renderEngine.bindTexture(ModelAttachment.REDDOT_SIGHT_TEX);
            } else {
                renderEngine.bindTexture(FlansModResourceHandler.getTexture(attachmentType));
            }
            GL11.glTranslatef(modelGun.scopeAttachPoint.x * gunType.modelScale,
                    modelGun.scopeAttachPoint.y * gunType.modelScale, modelGun.scopeAttachPoint.z * gunType.modelScale);
            if (modelGun.scopeIsOnSlide) {
                GL11.glTranslatef(-(gunAnimations.lastGunSlide
                        + (gunAnimations.gunSlide - gunAnimations.lastGunSlide) * smoothing)
                        * modelGun.gunSlideDistance, 0.0f, 0.0f);
            }
            GL11.glScalef(attachmentType.modelScale, attachmentType.modelScale, attachmentType.modelScale);
            ModelAttachment modelAttachment = attachmentType.model;
            if (modelAttachment != null) {
                modelAttachment.renderAttachment(f, 0);
            }
            if (curritem != null && MCU.isSaw(itemStack) && MCU.fancyGuns) {
                renderEngine.bindTexture(ModelGun.SAW_TEX);
            } else if (curritem != null && MCU.isAK(itemStack)) {
                renderEngine.bindTexture(ModelGun.NY2020_TEX);
            } else if (curritem != null && MCU.is2021AK(itemStack)) {
                renderEngine.bindTexture(ModelGun.GUN2021_TEX);
            } else if (curritem != null && MCU.is2021SAW(itemStack)) {
                renderEngine.bindTexture(ModelGun.M249_2021_TEX);
            } else if (curritem != null && MCU.isMCUGun(itemStack)) {
                renderEngine.bindTexture(ModelGun.MCU_TEX);
            } else {
                renderEngine.bindTexture(FlansModResourceHandler.getTexture(gunType));
            }
            GL11.glPopMatrix();
        }
        if (attachmentType2 != null) {
            GL11.glPushMatrix();
            if (curritem != null && MCU.isSaw(itemStack) && MCU.fancyGuns) {
                renderEngine.bindTexture(ModelAttachment.US_Silenser_TEX);
            } else {
                renderEngine.bindTexture(FlansModResourceHandler.getTexture(attachmentType2));
            }
            GL11.glTranslatef(modelGun.barrelAttachPoint.x * gunType.modelScale,
                    modelGun.barrelAttachPoint.y * gunType.modelScale,
                    modelGun.barrelAttachPoint.z * gunType.modelScale);
            GL11.glScalef(attachmentType2.modelScale, attachmentType2.modelScale, attachmentType2.modelScale);
            ModelAttachment modelAttachment = attachmentType2.model;
            if (modelAttachment != null) {
                modelAttachment.renderAttachment(f, 1);
            }
            if (curritem != null && MCU.isSaw(itemStack) && MCU.fancyGuns) {
                renderEngine.bindTexture(ModelGun.SAW_TEX);
            } else if (curritem != null && MCU.isAK(itemStack)) {
                renderEngine.bindTexture(ModelGun.NY2020_TEX);
            } else if (curritem != null && MCU.is2021AK(itemStack)) {
                renderEngine.bindTexture(ModelGun.GUN2021_TEX);
            } else if (curritem != null && MCU.is2021SAW(itemStack)) {
                renderEngine.bindTexture(ModelGun.M249_2021_TEX);
            } else if (curritem != null && MCU.isMCUGun(itemStack)) {
                renderEngine.bindTexture(ModelGun.MCU_TEX);
            } else {
                renderEngine.bindTexture(FlansModResourceHandler.getTexture(gunType));
            }
            GL11.glPopMatrix();
        }
        if (attachmentType3 != null) {
            GL11.glPushMatrix();
            renderEngine.bindTexture(FlansModResourceHandler.getTexture(attachmentType3));
            GL11.glTranslatef(modelGun.stockAttachPoint.x * gunType.modelScale,
                    modelGun.stockAttachPoint.y * gunType.modelScale, modelGun.stockAttachPoint.z * gunType.modelScale);
            GL11.glScalef(attachmentType3.modelScale, attachmentType3.modelScale, attachmentType3.modelScale);
            ModelAttachment modelAttachment = attachmentType3.model;
            if (modelAttachment != null) {
                modelAttachment.renderAttachment(f, -1);
            }
            if (curritem != null && MCU.isSaw(itemStack) && MCU.fancyGuns) {
                renderEngine.bindTexture(ModelGun.SAW_TEX);
            } else if (curritem != null && MCU.isAK(itemStack)) {
                renderEngine.bindTexture(ModelGun.NY2020_TEX);
            } else if (curritem != null && MCU.is2021AK(itemStack)) {
                renderEngine.bindTexture(ModelGun.GUN2021_TEX);
            } else if (curritem != null && MCU.is2021SAW(itemStack)) {
                renderEngine.bindTexture(ModelGun.M249_2021_TEX);
            } else if (curritem != null && MCU.isMCUGun(itemStack)) {
                renderEngine.bindTexture(ModelGun.MCU_TEX);
            } else {
                renderEngine.bindTexture(FlansModResourceHandler.getTexture(gunType));
            }
            GL11.glPopMatrix();
        }
        if (attachmentType4 != null) {
            GL11.glPushMatrix();
            if (curritem != null && MCU.isSaw(itemStack) && MCU.fancyGuns) {
                renderEngine.bindTexture(ModelAttachment.Vert_Grip_TEX);
            } else {
                renderEngine.bindTexture(FlansModResourceHandler.getTexture(attachmentType4));
            }
            GL11.glTranslatef(modelGun.gripAttachPoint.x * gunType.modelScale,
                    modelGun.gripAttachPoint.y * gunType.modelScale, modelGun.gripAttachPoint.z * gunType.modelScale);
            GL11.glScalef(attachmentType4.modelScale, attachmentType4.modelScale, attachmentType4.modelScale);
            ModelAttachment modelAttachment = attachmentType4.model;
            if (modelAttachment != null) {
                modelAttachment.renderAttachment(f, 2);
            }
            if (curritem != null && MCU.isSaw(itemStack) && MCU.fancyGuns) {
                renderEngine.bindTexture(ModelGun.SAW_TEX);
            } else if (curritem != null && MCU.isAK(itemStack)) {
                renderEngine.bindTexture(ModelGun.NY2020_TEX);
            } else if (curritem != null && MCU.is2021AK(itemStack)) {
                renderEngine.bindTexture(ModelGun.GUN2021_TEX);
            } else if (curritem != null && MCU.is2021SAW(itemStack)) {
                renderEngine.bindTexture(ModelGun.M249_2021_TEX);
            } else if (curritem != null && MCU.isMCUGun(itemStack)) {
                renderEngine.bindTexture(ModelGun.MCU_TEX);
            } else {
                renderEngine.bindTexture(FlansModResourceHandler.getTexture(gunType));
            }
            GL11.glPopMatrix();
        }
    }
}
