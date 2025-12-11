package com.flansmod.client.model;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.DriveablePosition;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.mechas.*;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

import java.util.Iterator;

public class RenderMecha extends Render implements IItemRenderer {

    private static final ResourceLocation RES_ITEM_GLINT = new ResourceLocation(
            "textures/misc/enchanted_item_glint.png");
    private static final ItemRenderer renderer = new ItemRenderer(Minecraft.getMinecraft());

    public RenderMecha() {
        super.shadowSize = 1.5F;
    }

    public void render(EntityMecha mecha, double d, double d1, double d2, float f, float f1) {
        this.bindEntityTexture(mecha);
        float scale = 0.0625F;
        MechaType type = mecha.getMechaType();
        GL11.glPushMatrix();
        GL11.glTranslatef((float) d, (float) d1, (float) d2);

        float dYaw;
        for (dYaw = mecha.axes.getYaw() - mecha.prevRotationYaw; dYaw > 180.0F; dYaw -= 360.0F) {
        }

        while (dYaw <= -180.0F) {
            dYaw += 360.0F;
        }

        float dPitch;
        for (dPitch = mecha.axes.getPitch() - mecha.prevRotationPitch; dPitch > 180.0F; dPitch -= 360.0F) {
        }

        while (dPitch <= -180.0F) {
            dPitch += 360.0F;
        }

        float dRoll;
        for (dRoll = mecha.axes.getRoll() - mecha.prevRotationRoll; dRoll > 180.0F; dRoll -= 360.0F) {
        }

        while (dRoll <= -180.0F) {
            dRoll += 360.0F;
        }

        GL11.glRotatef(-mecha.prevRotationYaw - dYaw * f1, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(mecha.prevRotationPitch + dPitch * f1, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(mecha.prevRotationRoll + dRoll * f1, 1.0F, 0.0F, 0.0F);
        float modelScale = mecha.getMechaType().modelScale;
        ModelMecha model = (ModelMecha) type.model;
        GL11.glPushMatrix();
        GL11.glScalef(modelScale, modelScale, modelScale);
        if (model != null) {
            model.render(mecha, f1);
        }

        ItemStack legLength = mecha.inventory.getStackInSlot(EnumMechaSlotType.hips);
        if (legLength != null && legLength.getItem() instanceof ItemMechaAddon) {
            MechaItemType legsYaw = ((ItemMechaAddon) legLength.getItem()).type;
            if (legsYaw.model != null) {
                GL11.glTranslatef(model.hipsAttachmentPoint.x, model.hipsAttachmentPoint.y,
                        model.hipsAttachmentPoint.z);
                GL11.glScalef(type.heldItemScale, type.heldItemScale, type.heldItemScale);
                if (legsYaw.texture != null) {
                    this.bindTexture(FlansModResourceHandler.getTexture(legsYaw));
                }

                legsYaw.model.render(mecha, f1);
            }
        }

        GL11.glPopMatrix();
        float legLength1;
        ItemStack legsYaw1;
        if (mecha.isPartIntact(EnumDriveablePart.leftArm)) {
            this.bindEntityTexture(mecha);
            GL11.glPushMatrix();
            legLength1 = 0.0F;
            if (mecha.seats[0] != null) {
                legLength1 = mecha.seats[0].prevLooking.getPitch()
                        + (mecha.seats[0].looking.getPitch() - mecha.seats[0].prevLooking.getPitch()) * f1;
            }

            if (legLength1 > type.lowerArmLimit) {
                legLength1 = type.lowerArmLimit;
            }

            if (legLength1 < -type.upperArmLimit) {
                legLength1 = -type.upperArmLimit;
            }

            GL11.glTranslatef(type.leftArmOrigin.x, mecha.getMechaType().leftArmOrigin.y,
                    mecha.getMechaType().leftArmOrigin.z);
            GL11.glRotatef(90.0F - legLength1, 0.0F, 0.0F, 1.0F);
            GL11.glPushMatrix();
            GL11.glScalef(modelScale, modelScale, modelScale);
            model.renderLeftArm(scale, mecha, f1);
            GL11.glPopMatrix();
            GL11.glTranslatef(0.0F + type.leftHandModifierY, -type.armLength - type.leftHandModifierX,
                    0.0F + type.leftHandModifierZ);
            legsYaw1 = mecha.inventory.getStackInSlot(EnumMechaSlotType.leftTool);
            GL11.glScalef(modelScale, modelScale, modelScale);
            if (legsYaw1 == null) {
                model.renderLeftHand(scale, mecha, f1);
            } else {
                GL11.glScalef(type.heldItemScale, type.heldItemScale, type.heldItemScale);
                this.renderItem(mecha, legsYaw1, 0, true, f1);
            }

            GL11.glPopMatrix();
        }

        if (mecha.isPartIntact(EnumDriveablePart.rightArm)) {
            this.bindEntityTexture(mecha);
            GL11.glPushMatrix();
            legLength1 = 0.0F;
            if (mecha.seats[0] != null) {
                legLength1 = mecha.seats[0].prevLooking.getPitch()
                        + (mecha.seats[0].looking.getPitch() - mecha.seats[0].prevLooking.getPitch()) * f1;
            }

            if (legLength1 > type.lowerArmLimit) {
                legLength1 = type.lowerArmLimit;
            }

            if (legLength1 < -type.upperArmLimit) {
                legLength1 = -type.upperArmLimit;
            }

            GL11.glTranslatef(type.rightArmOrigin.x, mecha.getMechaType().rightArmOrigin.y,
                    mecha.getMechaType().rightArmOrigin.z);
            GL11.glRotatef(90.0F - legLength1, 0.0F, 0.0F, 1.0F);
            GL11.glPushMatrix();
            GL11.glScalef(modelScale, modelScale, modelScale);
            model.renderRightArm(scale, mecha, f1);
            GL11.glPopMatrix();
            GL11.glTranslatef(0.0F + type.rightHandModifierY, -type.armLength - type.rightHandModifierX,
                    0.0F + type.rightHandModifierZ);
            GL11.glScalef(modelScale, modelScale, modelScale);
            legsYaw1 = mecha.inventory.getStackInSlot(EnumMechaSlotType.rightTool);
            if (legsYaw1 == null) {
                model.renderRightHand(scale, mecha, f1);
            } else {
                GL11.glScalef(type.heldItemScale, type.heldItemScale, type.heldItemScale);
                this.renderItem(mecha, legsYaw1, 0, false, f1);
            }

            GL11.glPopMatrix();
        }

        if (FlansMod.DEBUG) {
            GL11.glDisable(3553);
            GL11.glEnable(3042);
            GL11.glDisable(2929);
            GL11.glColor4f(1.0F, 0.0F, 0.0F, 0.3F);
            Iterator legLength2 = mecha.getDriveableData().parts.values().iterator();

            while (legLength2.hasNext()) {
                DriveablePart legsYaw2 = (DriveablePart) legLength2.next();
                if (legsYaw2.box != null) {
                    renderAABB(AxisAlignedBB.getBoundingBox(legsYaw2.box.x / 16.0F,
                            legsYaw2.box.y / 16.0F, legsYaw2.box.z / 16.0F,
                            (legsYaw2.box.x + legsYaw2.box.w) / 16.0F,
                            (legsYaw2.box.y + legsYaw2.box.h) / 16.0F,
                            (legsYaw2.box.z + legsYaw2.box.d) / 16.0F));
                }
            }

            GL11.glColor4f(0.0F, 0.0F, 1.0F, 0.3F);
            legLength2 = type.shootPointsPrimary.iterator();

            DriveablePosition legsYaw3;
            while (legLength2.hasNext()) {
                legsYaw3 = (DriveablePosition) legLength2.next();
                renderAABB(AxisAlignedBB.getBoundingBox(legsYaw3.position.x - 0.25F,
                        legsYaw3.position.y - 0.25F, legsYaw3.position.z - 0.25F,
                        legsYaw3.position.x + 0.25F, legsYaw3.position.y + 0.25F,
                        legsYaw3.position.z + 0.25F));
            }

            GL11.glColor4f(0.0F, 1.0F, 0.0F, 0.3F);
            legLength2 = type.shootPointsSecondary.iterator();

            while (legLength2.hasNext()) {
                legsYaw3 = (DriveablePosition) legLength2.next();
                renderAABB(AxisAlignedBB.getBoundingBox(legsYaw3.position.x - 0.25F,
                        legsYaw3.position.y - 0.25F, legsYaw3.position.z - 0.25F,
                        legsYaw3.position.x + 0.25F, legsYaw3.position.y + 0.25F,
                        legsYaw3.position.z + 0.25F));
            }

            GL11.glEnable(3553);
            GL11.glEnable(2929);
            GL11.glDisable(3042);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        }

        GL11.glPopMatrix();
        if (mecha.isPartIntact(EnumDriveablePart.hips)) {
            this.bindEntityTexture(mecha);
            GL11.glPushMatrix();
            GL11.glTranslatef((float) d, (float) d1, (float) d2);

            for (dYaw = mecha.legAxes.getYaw() - mecha.prevLegsYaw; dYaw > 180.0F; dYaw -= 360.0F) {
            }

            while (dYaw <= -180.0F) {
                dYaw += 360.0F;
            }

            GL11.glRotatef(-dYaw * f1 - mecha.prevLegsYaw, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(mecha.prevRotationPitch + dPitch * f1, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(mecha.prevRotationRoll + dRoll * f1, 1.0F, 0.0F, 0.0F);
            GL11.glScalef(modelScale, modelScale, modelScale);
            if (model != null) {
                legLength1 = type.legLength;
                float legsYaw4 = (float) Math.sin(((float) mecha.ticksExisted + f1) / type.legSwingTime)
                        * mecha.legSwing;
                float footH = (float) Math.sin(legsYaw4) * legLength1;
                float footV = (float) Math.cos(legsYaw4) * legLength1;
                model.renderHips(scale, mecha, f1);
                GL11.glPushMatrix();
                GL11.glTranslatef(0.0F, legLength1, 0.0F);
                GL11.glPushMatrix();
                GL11.glTranslatef(footH, -footV, 0.0F);
                model.renderLeftFoot(scale, mecha, f1);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glTranslatef(-footH, -footV, 0.0F);
                model.renderRightFoot(scale, mecha, f1);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glRotatef(legsYaw4 * 180.0F / 3.1415927F, 0.0F, 0.0F, 1.0F);
                GL11.glTranslatef(0.0F, -legLength1, 0.0F);
                model.renderLeftLeg(scale, mecha, f1);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glRotatef(-legsYaw4 * 180.0F / 3.1415927F, 0.0F, 0.0F, 1.0F);
                GL11.glTranslatef(0.0F, -legLength1, 0.0F);
                model.renderRightLeg(scale, mecha, f1);
                GL11.glPopMatrix();
                GL11.glPopMatrix();
            }

            GL11.glPopMatrix();
        }

    }

    public void doRender(Entity entity, double d0, double d1, double d2, float f, float f1) {
        this.render((EntityMecha) entity, d0, d1, d2, f, f1);
    }

    protected ResourceLocation getEntityTexture(Entity entity) {
        return FlansModResourceHandler.getTexture(((EntityMecha) entity).getMechaType());
    }

    private void renderItem(EntityMecha mecha, ItemStack stack, int par3, boolean leftHand, float dT) {
        GL11.glPushMatrix();
        TextureManager texturemanager = Minecraft.getMinecraft().getTextureManager();
        Item item = stack.getItem();
        if (item instanceof ItemMechaAddon) {
            GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.0F, 0.0F, 0.0F);
            ItemMechaAddon icon = (ItemMechaAddon) item;
            MechaItemType tessellator = icon.type;
            this.bindTexture(FlansModResourceHandler.getTexture(tessellator));
            if (tessellator.model != null) {
                tessellator.model.render(mecha, dT);
                GL11.glPushMatrix();
                if (leftHand && mecha.leftMouseHeld || !leftHand && mecha.rightMouseHeld) {
                    GL11.glRotatef(25.0F * (float) mecha.ticksExisted, 1.0F, 0.0F, 0.0F);
                }

                tessellator.model.renderDrill(mecha, dT);
                GL11.glPopMatrix();
                tessellator.model.renderSaw(mecha, dT,
                        leftHand && mecha.leftMouseHeld || !leftHand && mecha.rightMouseHeld);
            }
        } else if (item instanceof ItemGun && ((ItemGun) item).type.model != null) {
            GunType icon2 = ((ItemGun) item).type;
            ModelGun tessellator2 = icon2.model;
            GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
            texturemanager.bindTexture(FlansModResourceHandler.getTexture(icon2));
        } else {
            IIcon icon1 = stack.getIconIndex();
            if (icon1 == null) {
                GL11.glPopMatrix();
                return;
            }

            texturemanager.bindTexture(texturemanager.getResourceLocation(stack.getItemSpriteNumber()));
            Tessellator tessellator1 = Tessellator.instance;
            float f = icon1.getMinU();
            float f1 = icon1.getMaxU();
            float f2 = icon1.getMinV();
            float f3 = icon1.getMaxV();
            float f4 = 0.0F;
            float f5 = 0.3F;
            GL11.glEnable('\u803a');
            GL11.glTranslatef(-f4, -f5, 0.0F);
            float f6 = 1.5F;
            GL11.glScalef(f6, f6, f6);
            GL11.glTranslatef(0.2F, 0.7F, 0.0F);
            GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-133.0F, 0.0F, 0.0F, 1.0F);
            ItemRenderer var10000 = renderer;
            ItemRenderer.renderItemIn2D(tessellator1, f1, f2, f, f3, icon1.getIconWidth(), icon1.getIconHeight(),
                    0.0625F);
            if (stack.hasEffect(par3)) {
                GL11.glDepthFunc(514);
                GL11.glDisable(2896);
                texturemanager.bindTexture(RES_ITEM_GLINT);
                GL11.glEnable(3042);
                GL11.glBlendFunc(768, 1);
                float f7 = 0.76F;
                GL11.glColor4f(0.5F * f7, 0.25F * f7, 0.8F * f7, 1.0F);
                GL11.glMatrixMode(5890);
                GL11.glPushMatrix();
                float f8 = 0.125F;
                GL11.glScalef(f8, f8, f8);
                float f9 = (float) (Minecraft.getSystemTime() % 3000L) / 3000.0F * 8.0F;
                GL11.glTranslatef(f9, 0.0F, 0.0F);
                GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
                var10000 = renderer;
                ItemRenderer.renderItemIn2D(tessellator1, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glScalef(f8, f8, f8);
                f9 = (float) (Minecraft.getSystemTime() % 4873L) / 4873.0F * 8.0F;
                GL11.glTranslatef(-f9, 0.0F, 0.0F);
                GL11.glRotatef(10.0F, 0.0F, 0.0F, 1.0F);
                var10000 = renderer;
                ItemRenderer.renderItemIn2D(tessellator1, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
                GL11.glPopMatrix();
                GL11.glMatrixMode(5888);
                GL11.glDisable(3042);
                GL11.glEnable(2896);
                GL11.glDepthFunc(515);
            }

            GL11.glDisable('\u803a');
        }

        GL11.glPopMatrix();
    }

    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        switch (type) {
            case EQUIPPED:
            case EQUIPPED_FIRST_PERSON:
            case ENTITY:
                return Minecraft.getMinecraft().gameSettings.fancyGraphics && item != null
                        && item.getItem() instanceof ItemMecha && ((ItemMecha) item.getItem()).type.model != null;
            default:
                return false;
        }
    }

    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return false;
    }

    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        GL11.glPushMatrix();
        if (item != null && item.getItem() instanceof ItemMecha) {
            MechaType mechaType = ((ItemMecha) item.getItem()).type;
            if (mechaType.model != null) {
                float scale = 0.5F;
                switch (type) {
                    case EQUIPPED:
                        GL11.glRotatef(15.0F, 0.0F, 0.0F, 1.0F);
                        GL11.glRotatef(15.0F, 1.0F, 0.0F, 0.0F);
                        GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
                        GL11.glTranslatef(0.0F, 0.1F, -0.4F);
                        scale = 1.0F;
                        break;
                    case EQUIPPED_FIRST_PERSON:
                        GL11.glRotatef(25.0F, 0.0F, 0.0F, 1.0F);
                        GL11.glRotatef(-5.0F, 0.0F, 1.0F, 0.0F);
                        GL11.glTranslatef(0.15F, 0.35F, -0.6F);
                        GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
                        break;
                    case ENTITY:
                        scale = 1.5F;
                        GL11.glRotatef((float) ((EntityItem) data[1]).ticksExisted, 0.0F, 1.0F, 0.0F);
                    default:
                        break;
                }

                GL11.glScalef(scale / mechaType.cameraDistance, scale / mechaType.cameraDistance,
                        scale / mechaType.cameraDistance);
                Minecraft.getMinecraft().renderEngine.bindTexture(FlansModResourceHandler.getTexture(mechaType));
                ModelDriveable model = mechaType.model;
                model.render(mechaType);
            }
        }

        GL11.glPopMatrix();
    }
}
