package com.flansmod.client.model;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

import java.util.Iterator;

public class RenderPlane extends Render implements IItemRenderer {

    public RenderPlane() {
        super.shadowSize = 1.0F;
    }

    public void render(EntityPlane entityPlane, double d, double d1, double d2, float f, float f1) {
        if (entityPlane.ridingEntity == null
                || entityPlane.ridingEntity.getClass().toString().indexOf("mcheli.aircraft.MCH_EntitySeat") <= 0) {
            this.bindEntityTexture(entityPlane);
            PlaneType type = entityPlane.getPlaneType();
            GL11.glPushMatrix();
            GL11.glTranslatef((float) d, (float) d1, (float) d2);

            float dYaw;
            for (dYaw = entityPlane.axes.getYaw() - entityPlane.prevRotationYaw; dYaw > 180.0F; dYaw -= 360.0F) {
            }

            while (dYaw <= -180.0F) {
                dYaw += 360.0F;
            }

            float dPitch;
            for (dPitch = entityPlane.axes.getPitch()
                    - entityPlane.prevRotationPitch; dPitch > 180.0F; dPitch -= 360.0F) {
            }

            while (dPitch <= -180.0F) {
                dPitch += 360.0F;
            }

            float dRoll;
            for (dRoll = entityPlane.axes.getRoll() - entityPlane.prevRotationRoll; dRoll > 180.0F; dRoll -= 360.0F) {
            }

            while (dRoll <= -180.0F) {
                dRoll += 360.0F;
            }

            GL11.glRotatef(180.0F - entityPlane.prevRotationYaw - dYaw * f1, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(entityPlane.prevRotationPitch + dPitch * f1, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(entityPlane.prevRotationRoll + dRoll * f1, 1.0F, 0.0F, 0.0F);
            ModelPlane model = (ModelPlane) type.model;
            if (model != null) {
                GL11.glPushMatrix();
                GL11.glScalef(type.modelScale, type.modelScale, type.modelScale);
                model.render(entityPlane, f1);

                int i;
                for (i = 0; i < model.heliMainRotorModels.length; ++i) {
                    GL11.glPushMatrix();
                    GL11.glTranslatef(model.heliMainRotorOrigins[i].x, model.heliMainRotorOrigins[i].y,
                            model.heliMainRotorOrigins[i].z);
                    GL11.glRotatef((entityPlane.propAngle + f1 * entityPlane.throttle / 7.0F) * model.heliRotorSpeeds[i]
                            * 1440.0F / 3.1415927F, 0.0F, 1.0F, 0.0F);
                    GL11.glTranslatef(-model.heliMainRotorOrigins[i].x, -model.heliMainRotorOrigins[i].y,
                            -model.heliMainRotorOrigins[i].z);
                    model.renderRotor(entityPlane, 0.0625F, i);
                    GL11.glPopMatrix();
                }

                for (i = 0; i < model.heliTailRotorModels.length; ++i) {
                    GL11.glPushMatrix();
                    GL11.glTranslatef(model.heliTailRotorOrigins[i].x, model.heliTailRotorOrigins[i].y,
                            model.heliTailRotorOrigins[i].z);
                    GL11.glRotatef((entityPlane.propAngle + f1 * entityPlane.throttle / 7.0F) * 1440.0F / 3.1415927F,
                            0.0F, 0.0F, 1.0F);
                    GL11.glTranslatef(-model.heliTailRotorOrigins[i].x, -model.heliTailRotorOrigins[i].y,
                            -model.heliTailRotorOrigins[i].z);
                    model.renderTailRotor(entityPlane, 0.0625F, i);
                    GL11.glPopMatrix();
                }

                GL11.glPopMatrix();
            }

            if (FlansMod.DEBUG) {
                GL11.glDisable(3553);
                GL11.glEnable(3042);
                GL11.glDisable(2929);
                GL11.glColor4f(1.0F, 0.0F, 0.0F, 0.3F);
                GL11.glScalef(-1.0F, 1.0F, -1.0F);
                Iterator var17 = entityPlane.getDriveableData().parts.values().iterator();

                while (var17.hasNext()) {
                    DriveablePart point = (DriveablePart) var17.next();
                    if (point.box != null) {
                        GL11.glColor4f(1.0F, entityPlane.isPartIntact(point.type) ? 1.0F : 0.0F, 0.0F, 0.3F);
                        renderAABB(AxisAlignedBB.getBoundingBox(point.box.x, point.box.y,
                                point.box.z, point.box.x + point.box.w,
                                point.box.y + point.box.h, point.box.z + point.box.d));
                    }
                }

                GL11.glColor4f(1.0F, 1.0F, 0.0F, 0.3F);
                var17 = type.propellers.iterator();

                while (var17.hasNext()) {
                    Propeller var18 = (Propeller) var17.next();
                    renderAABB(AxisAlignedBB.getBoundingBox((float) var18.x / 16.0F - 0.25F,
                            (float) var18.y / 16.0F - 0.25F, (float) var18.z / 16.0F - 0.25F,
                            (float) var18.x / 16.0F + 0.25F, (float) var18.y / 16.0F + 0.25F,
                            (float) var18.z / 16.0F + 0.25F));
                }

                GL11.glColor4f(1.0F, 0.0F, 1.0F, 0.3F);
                var17 = type.shootPointsPrimary.iterator();

                DriveablePosition var19;
                while (var17.hasNext()) {
                    var19 = (DriveablePosition) var17.next();
                    renderAABB(AxisAlignedBB.getBoundingBox(var19.position.x - 0.25F,
                            var19.position.y - 0.25F, var19.position.z - 0.25F,
                            var19.position.x + 0.25F, var19.position.y + 0.25F,
                            var19.position.z + 0.25F));
                }

                GL11.glColor4f(0.0F, 1.0F, 0.0F, 0.3F);
                var17 = type.shootPointsSecondary.iterator();

                while (var17.hasNext()) {
                    var19 = (DriveablePosition) var17.next();
                    renderAABB(AxisAlignedBB.getBoundingBox(var19.position.x - 0.25F,
                            var19.position.y - 0.25F, var19.position.z - 0.25F,
                            var19.position.x + 0.25F, var19.position.y + 0.25F,
                            var19.position.z + 0.25F));
                }

                GL11.glEnable(3553);
                GL11.glEnable(2929);
                GL11.glDisable(3042);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            }

            GL11.glPopMatrix();
        }
    }

    public void doRender(Entity entity, double d, double d1, double d2, float f, float f1) {
        this.render((EntityPlane) entity, d, d1, d2, f, f1);
    }

    protected ResourceLocation getEntityTexture(Entity entity) {
        return FlansModResourceHandler.getTexture(((EntityPlane) entity).getPlaneType());
    }

    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        switch (type) {
            case EQUIPPED:
            case EQUIPPED_FIRST_PERSON:
            case ENTITY:
                return Minecraft.getMinecraft().gameSettings.fancyGraphics && item != null
                        && item.getItem() instanceof ItemPlane && ((ItemPlane) item.getItem()).type.model != null;
            default:
                return false;
        }
    }

    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return false;
    }

    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        GL11.glPushMatrix();
        if (item != null && item.getItem() instanceof ItemPlane) {
            PlaneType planeType = ((ItemPlane) item.getItem()).type;
            if (planeType.model != null) {
                float scale = 0.5F;
                switch (type) {
                    case EQUIPPED:
                        GL11.glRotatef(15.0F, 0.0F, 0.0F, 1.0F);
                        GL11.glRotatef(15.0F, 1.0F, 0.0F, 0.0F);
                        GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
                        GL11.glTranslatef(0.0F, 0.2F, 0.4F);
                        scale = 1.0F;
                        break;
                    case EQUIPPED_FIRST_PERSON:
                        GL11.glRotatef(25.0F, 0.0F, 0.0F, 1.0F);
                        GL11.glRotatef(-5.0F, 0.0F, 1.0F, 0.0F);
                        GL11.glTranslatef(0.15F, 0.45F, -0.6F);
                        GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
                        break;
                    case ENTITY:
                        scale = 1.5F;
                        GL11.glRotatef((float) ((EntityItem) data[1]).ticksExisted, 0.0F, 1.0F, 0.0F);
                    default:
                        break;
                }

                GL11.glScalef(scale / planeType.cameraDistance, scale / planeType.cameraDistance,
                        scale / planeType.cameraDistance);
                Minecraft.getMinecraft().renderEngine.bindTexture(FlansModResourceHandler.getTexture(planeType));
                ModelDriveable model = planeType.model;
                model.render(planeType);
            }
        }

        GL11.glPopMatrix();
    }
}
