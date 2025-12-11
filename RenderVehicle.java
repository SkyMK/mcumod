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

public class RenderVehicle extends Render implements IItemRenderer {

    public RenderVehicle() {
        super.shadowSize = 1.0F;
    }

    public void render(EntityVehicle vehicle, double d, double d1, double d2, float f, float f1) {
        if (vehicle.ridingEntity == null
                || vehicle.ridingEntity.getClass().toString().indexOf("mcheli.aircraft.MCH_EntitySeat") <= 0) {
            this.bindEntityTexture(vehicle);
            VehicleType type = vehicle.getVehicleType();
            GL11.glPushMatrix();
            GL11.glTranslatef((float) d, (float) d1, (float) d2);

            float dYaw;
            for (dYaw = vehicle.axes.getYaw() - vehicle.prevRotationYaw; dYaw > 180.0F; dYaw -= 360.0F) {
            }

            while (dYaw <= -180.0F) {
                dYaw += 360.0F;
            }

            float dPitch;
            for (dPitch = vehicle.axes.getPitch() - vehicle.prevRotationPitch; dPitch > 180.0F; dPitch -= 360.0F) {
            }

            while (dPitch <= -180.0F) {
                dPitch += 360.0F;
            }

            float dRoll;
            for (dRoll = vehicle.axes.getRoll() - vehicle.prevRotationRoll; dRoll > 180.0F; dRoll -= 360.0F) {
            }

            while (dRoll <= -180.0F) {
                dRoll += 360.0F;
            }

            GL11.glRotatef(180.0F - vehicle.prevRotationYaw - dYaw * f1, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(vehicle.prevRotationPitch + dPitch * f1, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(vehicle.prevRotationRoll + dRoll * f1, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            GL11.glPushMatrix();
            ModelVehicle modVehicle = (ModelVehicle) type.model;
            GL11.glPushMatrix();
            GL11.glScalef(type.modelScale, type.modelScale, type.modelScale);
            if (modVehicle != null) {
                modVehicle.render(vehicle, f1);
            }

            float point;
            if (type.turretOrigin != null && vehicle.isPartIntact(EnumDriveablePart.turret) && vehicle.seats != null
                    && vehicle.seats[0] != null) {
                for (dYaw = vehicle.seats[0].looking.getYaw()
                        - vehicle.seats[0].prevLooking.getYaw(); dYaw > 180.0F; dYaw -= 360.0F) {
                }

                while (dYaw <= -180.0F) {
                    dYaw += 360.0F;
                }

                point = vehicle.seats[0].prevLooking.getYaw() + dYaw * f1;
                GL11.glTranslatef(type.turretOrigin.x, type.turretOrigin.y, type.turretOrigin.z);
                GL11.glRotatef(-point, 0.0F, 1.0F, 0.0F);
                GL11.glTranslatef(-type.turretOrigin.x, -type.turretOrigin.y, -type.turretOrigin.z);
                if (modVehicle != null) {
                    modVehicle.renderTurret(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, vehicle, f1);
                }
            }

            GL11.glPopMatrix();
            GL11.glPushMatrix();
            if (FlansMod.DEBUG && type.turretOrigin != null && vehicle.isPartIntact(EnumDriveablePart.turret)
                    && vehicle.seats != null && vehicle.seats[0] != null) {
                for (dYaw = vehicle.seats[0].looking.getYaw()
                        - vehicle.seats[0].prevLooking.getYaw(); dYaw > 180.0F; dYaw -= 360.0F) {
                }

                while (dYaw <= -180.0F) {
                    dYaw += 360.0F;
                }

                point = vehicle.seats[0].prevLooking.getYaw() + dYaw * f1;
                GL11.glTranslatef(type.turretOrigin.x, type.turretOrigin.y, type.turretOrigin.z);
                GL11.glRotatef(-point, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(-vehicle.seats[0].looking.getPitch(), 0.0F, 0.0F, 1.0F);
                GL11.glTranslatef(-type.turretOrigin.x, -type.turretOrigin.y, -type.turretOrigin.z);
                GL11.glColor4f(0.0F, 0.0F, 1.0F, 0.3F);
                Iterator var16 = type.shootPointsPrimary.iterator();

                DriveablePosition point1;
                while (var16.hasNext()) {
                    point1 = (DriveablePosition) var16.next();
                    if (point1.part == EnumDriveablePart.turret) {
                        renderAABB(AxisAlignedBB.getBoundingBox(point1.position.x - 0.25F,
                                point1.position.y - 0.25F, point1.position.z - 0.25F,
                                point1.position.x + 0.25F, point1.position.y + 0.25F,
                                point1.position.z + 0.25F));
                    }
                }

                GL11.glColor4f(0.0F, 1.0F, 0.0F, 0.3F);
                var16 = type.shootPointsSecondary.iterator();

                while (var16.hasNext()) {
                    point1 = (DriveablePosition) var16.next();
                    if (point1.part == EnumDriveablePart.turret) {
                        renderAABB(AxisAlignedBB.getBoundingBox(point1.position.x - 0.25F,
                                point1.position.y - 0.25F, point1.position.z - 0.25F,
                                point1.position.x + 0.25F, point1.position.y + 0.25F,
                                point1.position.z + 0.25F));
                    }
                }
            }

            GL11.glPopMatrix();
            if (modVehicle != null) {
                GL11.glPushMatrix();
                GL11.glTranslatef(modVehicle.drillHeadOrigin.x, modVehicle.drillHeadOrigin.y,
                        modVehicle.drillHeadOrigin.z);
                GL11.glRotatef(vehicle.harvesterAngle * 50.0F, 1.0F, 0.0F, 0.0F);
                GL11.glTranslatef(-modVehicle.drillHeadOrigin.x, -modVehicle.drillHeadOrigin.y,
                        -modVehicle.drillHeadOrigin.z);
                modVehicle.renderDrillBit(vehicle, f1);
                GL11.glPopMatrix();
            }

            GL11.glPopMatrix();
            if (FlansMod.DEBUG) {
                GL11.glDisable(3553);
                GL11.glEnable(3042);
                GL11.glDisable(2929);
                GL11.glColor4f(1.0F, 0.0F, 0.0F, 0.3F);
                GL11.glScalef(1.0F, 1.0F, 1.0F);
                Iterator modVehicle1 = vehicle.getDriveableData().parts.values().iterator();

                while (modVehicle1.hasNext()) {
                    DriveablePart point2 = (DriveablePart) modVehicle1.next();
                    if (point2.box != null) {
                        renderAABB(AxisAlignedBB.getBoundingBox(point2.box.x, point2.box.y,
                                point2.box.z, point2.box.x + point2.box.w,
                                point2.box.y + point2.box.h, point2.box.z + point2.box.d));
                    }
                }

                GL11.glColor4f(0.0F, 0.0F, 1.0F, 0.3F);
                modVehicle1 = type.shootPointsPrimary.iterator();

                DriveablePosition point3;
                while (modVehicle1.hasNext()) {
                    point3 = (DriveablePosition) modVehicle1.next();
                    if (point3.part != EnumDriveablePart.turret) {
                        renderAABB(AxisAlignedBB.getBoundingBox(point3.position.x - 0.25F,
                                point3.position.y - 0.25F, point3.position.z - 0.25F,
                                point3.position.x + 0.25F, point3.position.y + 0.25F,
                                point3.position.z + 0.25F));
                    }
                }

                GL11.glColor4f(0.0F, 1.0F, 0.0F, 0.3F);
                modVehicle1 = type.shootPointsSecondary.iterator();

                while (modVehicle1.hasNext()) {
                    point3 = (DriveablePosition) modVehicle1.next();
                    if (point3.part != EnumDriveablePart.turret) {
                        renderAABB(AxisAlignedBB.getBoundingBox(point3.position.x - 0.25F,
                                point3.position.y - 0.25F, point3.position.z - 0.25F,
                                point3.position.x + 0.25F, point3.position.y + 0.25F,
                                point3.position.z + 0.25F));
                    }
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
        this.render((EntityVehicle) entity, d, d1, d2, f, f1);
    }

    protected ResourceLocation getEntityTexture(Entity entity) {
        return FlansModResourceHandler.getTexture(((EntityVehicle) entity).getVehicleType());
    }

    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        switch (type) {
            case EQUIPPED:
            case EQUIPPED_FIRST_PERSON:
            case ENTITY:
                return Minecraft.getMinecraft().gameSettings.fancyGraphics && item != null
                        && item.getItem() instanceof ItemVehicle && ((ItemVehicle) item.getItem()).type.model != null;
            default:
                return false;
        }
    }

    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return false;
    }

    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        GL11.glPushMatrix();
        if (item != null && item.getItem() instanceof ItemVehicle) {
            VehicleType vehicleType = ((ItemVehicle) item.getItem()).type;
            if (vehicleType.model != null) {
                float scale = 0.5F;
                switch (type) {
                    case EQUIPPED:
                        GL11.glRotatef(15.0F, 0.0F, 0.0F, 1.0F);
                        GL11.glRotatef(15.0F, 1.0F, 0.0F, 0.0F);
                        GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
                        GL11.glTranslatef(0.0F, 0.15F, -0.4F);
                        scale = 1.0F;
                        break;
                    case EQUIPPED_FIRST_PERSON:
                        GL11.glRotatef(25.0F, 0.0F, 0.0F, 1.0F);
                        GL11.glRotatef(-5.0F, 0.0F, 1.0F, 0.0F);
                        GL11.glTranslatef(0.15F, 0.45F, -0.6F);
                        break;
                    case ENTITY:
                        scale = 1.5F;
                        GL11.glRotatef((float) ((EntityItem) data[1]).ticksExisted, 0.0F, 1.0F, 0.0F);
                    default:
                        break;
                }

                GL11.glScalef(scale / vehicleType.cameraDistance, scale / vehicleType.cameraDistance,
                        scale / vehicleType.cameraDistance);
                Minecraft.getMinecraft().renderEngine.bindTexture(FlansModResourceHandler.getTexture(vehicleType));
                ModelDriveable model = vehicleType.model;
                model.render(vehicleType);
            }
        }

        GL11.glPopMatrix();
    }
}
