package mcu.utils;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;

import java.util.List;

public class ClientRaytrace {
    public static MovingObjectPosition objectMouseOver;
    private static Entity pointedEntity;

    public static void getMouseOver(float p_78473_1_) {
        Minecraft mc = Minecraft.getMinecraft();
        if (mc.renderViewEntity != null) {
            if (mc.theWorld != null) {
                mc.pointedEntity = null;
                double d0 = mc.playerController.getBlockReachDistance();
                objectMouseOver = rayTrace(d0, p_78473_1_);
                double d1 = d0;
                Vec3 vec3 = mc.renderViewEntity.getPosition(p_78473_1_);

                if (objectMouseOver != null) {
                    d1 = objectMouseOver.hitVec.distanceTo(vec3);
                }

                Vec3 vec31 = mc.renderViewEntity.getLook(p_78473_1_);
                Vec3 vec32 = vec3.addVector(vec31.xCoord * d0, vec31.yCoord * d0, vec31.zCoord * d0);
                Entity pointedEntity = null;
                Vec3 vec33 = null;
                float f1 = 1.0F;
                List list = mc.theWorld.loadedEntityList;

                double d2 = d1;

                for (int i = 0; i < list.size(); ++i) {
                    Entity entity = (Entity) list.get(i);
                    if (entity == mc.renderViewEntity) {
                        continue;
                    }

                    if (entity.canBeCollidedWith()) {
                        float f2 = entity.getCollisionBorderSize();
                        AxisAlignedBB axisalignedbb = entity.boundingBox.expand(f2, f2, f2);
                        MovingObjectPosition movingobjectposition = axisalignedbb.calculateIntercept(vec3, vec32);

                        if (axisalignedbb.isVecInside(vec3)) {
                            if (0.0D < d2 || d2 == 0.0D) {
                                pointedEntity = entity;
                                vec33 = movingobjectposition == null ? vec3 : movingobjectposition.hitVec;
                                d2 = 0.0D;
                            }
                        } else if (movingobjectposition != null) {
                            double d3 = vec3.distanceTo(movingobjectposition.hitVec);

                            if (d3 < d2 || d2 == 0.0D) {
                                if (entity == mc.renderViewEntity.ridingEntity && !entity.canRiderInteract()) {
                                    if (d2 == 0.0D) {
                                        pointedEntity = entity;
                                        vec33 = movingobjectposition.hitVec;
                                    }
                                } else {
                                    pointedEntity = entity;
                                    vec33 = movingobjectposition.hitVec;
                                    d2 = d3;
                                }
                            }
                        }
                    }
                }

                if (pointedEntity != null && (d2 < d1 || objectMouseOver == null)) {
                    objectMouseOver = new MovingObjectPosition(pointedEntity, vec33);

                    if (pointedEntity instanceof EntityLivingBase || pointedEntity instanceof EntityItemFrame) {
                        mc.pointedEntity = pointedEntity;
                    }
                }
            }
        }
    }

    @SideOnly(Side.CLIENT)
    public static MovingObjectPosition rayTrace(double p_70614_1_, float p_70614_3_) {
        Vec3 vec3 = Minecraft.getMinecraft().thePlayer.getPosition(p_70614_3_);
        Vec3 vec31 = Minecraft.getMinecraft().thePlayer.getLook(p_70614_3_);
        Vec3 vec32 = vec3.addVector(vec31.xCoord * p_70614_1_, vec31.yCoord * p_70614_1_, vec31.zCoord * p_70614_1_);
        return Minecraft.getMinecraft().theWorld.func_147447_a(vec3, vec32, true, true, true);
    }
}
