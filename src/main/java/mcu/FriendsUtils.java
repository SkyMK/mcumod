package mcu.friend.util;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.util.*;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import java.util.List;

public class FriendsUtils {

    @SideOnly(Side.CLIENT)
    public static void renderNameTag(Entity entity, boolean friend, String tag, double x, double y, double z,
                                     double range, boolean drawInfo, boolean wh) {
        Minecraft mc = Minecraft.getMinecraft();
        RenderManager renderManager = RenderManager.instance;
        Render render = renderManager.getEntityRenderObject(entity);
        String str1 = entity.getCommandSenderName();

        if (Minecraft.isGuiEnabled() && entity != renderManager.livingPlayer
                && !entity.isInvisibleToPlayer(mc.thePlayer) && entity.riddenByEntity == null) {
            if (!shouldDrawName(entity) && !wh)
                return;
            double distance = entity.getDistanceSqToEntity(renderManager.livingPlayer);
            FontRenderer font = render.getFontRendererFromRenderManager();
            float f = 1.6F;
            float f1 = 0.016666668F * f;
            GL11.glPushMatrix();
            GL11.glTranslatef((float) x + 0.0F, (float) y + entity.height + (drawInfo ? 0.5F : 0.35F), (float) z);
            GL11.glNormal3f(0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-RenderManager.instance.playerViewY, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(RenderManager.instance.playerViewX, 1.0F, 0.0F, 0.0F);
            GL11.glScalef(-0.02666667F, -0.02666667F, 0.02666667F);
            GL11.glDisable(2896);
            GL11.glDepthMask(false);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            Tessellator tessellator = Tessellator.instance;
            GL11.glDisable(3553);
            if (wh) {
                GL11.glDisable(2896);
                GL11.glDisable(2929);
            }
            if (str1 != null) {
                tessellator.startDrawingQuads();
                int i = mc.fontRenderer.getStringWidth(str1) / 2;
                tessellator.setColorRGBA_F(0.0F, 0.0F, 0.0F, 0.25F);
                tessellator.addVertex((-i - 1), -2.0D, 0.0D);
                tessellator.addVertex((-i - 1), 6.5D, 0.0D);
                tessellator.addVertex((i + 2), 6.5D, 0.0D);
                tessellator.addVertex((i + 2), -2.0D, 0.0D);
                tessellator.draw();
            }

            if (!friend && tag.length() > 2 && drawInfo) {
                tessellator.startDrawingQuads();
                int i = mc.fontRenderer.getStringWidth(tag) / 2;
                tessellator.setColorRGBA_F(0.0F, 0.0F, 0.0F, 0.25F);
                tessellator.addVertex((-i - 1), 6.5D, 0.0D);
                tessellator.addVertex((-i - 1), 14.0D, 0.0D);
                tessellator.addVertex((i + 2), 14.0D, 0.0D);
                tessellator.addVertex((i + 2), 6.5D, 0.0D);
                tessellator.draw();
            }
            GL11.glEnable(3553);
            GL11.glDepthMask(true);

            if (str1 != null) {
                if (!friend) {
                    mc.fontRenderer.drawString(str1, -mc.fontRenderer.getStringWidth(str1) / 2 + 1, -2, -10240);
                } else {
                    mc.fontRenderer.drawString(EnumChatFormatting.GREEN + str1,
                            -mc.fontRenderer.getStringWidth(str1) / 2 + 1, -2, 0);
                }
            }

            if (!friend && drawInfo) {
                mc.fontRenderer.drawString(tag, -mc.fontRenderer.getStringWidth(tag) / 2, 6, -1996488705);
            }
            GL11.glEnable(2929);
            GL11.glEnable(2896);
            GL11.glDepthMask(true);
            GL11.glDisable(3042);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glPopMatrix();
        }
    }

    private static boolean shouldDrawName(Entity entity) {
        EntityClientPlayerMP entityClientPlayerMP = Minecraft.getMinecraft().thePlayer;
        if (entityClientPlayerMP == null) {
            return false;
        }
        double d = entity.posX - entityClientPlayerMP.posX;
        double d2 = entity.posY + (double) entity.getEyeHeight() - entityClientPlayerMP.posY
                + (double) entityClientPlayerMP.getEyeHeight();
        double d3 = entity.posZ - entityClientPlayerMP.posZ;
        double d4 = MathHelper.sqrt_double(d * d + d2 * d2 + d3 * d3);
        double d5 = MathHelper.sqrt_double((d /= d4) * d + (d3 /= d4) * d3);
        float f = 360.0f - (float) (Math.atan2(d, d3) * 180.0 / Math.PI);
        float f2 = -((float) (Math.atan2(d2 /= d4, d5) * 180.0 / Math.PI));
        f = angularDistance(entityClientPlayerMP.rotationYaw, f);
        f2 = angularDistance(entityClientPlayerMP.rotationPitch, f2);
        d = d4;
        return Math.sqrt(f * f + f2 * f2) < (1.0 / (d / 64.0) + 0.0) * 1.0;
    }

    private static float angularDistance(final float n, final float n2) {
        final float n3 = Math.abs(n2 - n) % 360.0f;
        return (n3 > 180.0f) ? (360.0f - n3) : n3;
    }

    @SideOnly(Side.CLIENT)
    public static Entity getPointedEntity(float partialTicks, double distance, boolean canBeCollidedWith) {
        Minecraft mc = Minecraft.getMinecraft();
        Entity pointedEntity = null;
        MovingObjectPosition rayTrace;

        if (mc.renderViewEntity != null) {
            if (mc.theWorld != null) {
                rayTrace = mc.renderViewEntity.rayTrace(distance, partialTicks);
                Vec3 positionVec = mc.renderViewEntity.getPosition(partialTicks);
                double distanceToVec3 = distance;

                if (rayTrace != null) {
                    distanceToVec3 = rayTrace.hitVec.distanceTo(positionVec);
                }

                Vec3 lookVec = mc.renderViewEntity.getLook(partialTicks);
                Vec3 posDistVec = positionVec.addVector(lookVec.xCoord * distance, lookVec.yCoord * distance,
                        lookVec.zCoord * distance);
                Vec3 tempVec = null;
                double boxExpand = 1.0F;
                List<Entity> entities = mc.theWorld
                        .getEntitiesWithinAABBExcludingEntity(mc.renderViewEntity,
                                mc.renderViewEntity.boundingBox.addCoord(lookVec.xCoord * distance,
                                        lookVec.yCoord * distance, lookVec.zCoord * distance)
                                        .expand(boxExpand, boxExpand, boxExpand));
                double vecInsideDist = distanceToVec3;

                for (Entity entity : entities) {
                    if (!canBeCollidedWith || entity.canBeCollidedWith()) {
                        double borderSize = entity.getCollisionBorderSize();
                        AxisAlignedBB expEntityBox = entity.boundingBox.expand(borderSize, borderSize, borderSize);
                        MovingObjectPosition calculateInterceptPos = expEntityBox.calculateIntercept(positionVec,
                                posDistVec);

                        if (expEntityBox.isVecInside(positionVec)) {
                            if (0.0D < vecInsideDist || vecInsideDist == 0.0D) {
                                pointedEntity = entity;
                                tempVec = calculateInterceptPos == null ? positionVec : calculateInterceptPos.hitVec;
                                vecInsideDist = 0.0D;
                            }
                        } else if (calculateInterceptPos != null) {
                            double calcInterceptPosDist = positionVec.distanceTo(calculateInterceptPos.hitVec);

                            if (calcInterceptPosDist < vecInsideDist || vecInsideDist == 0.0D) {
                                if (entity == mc.renderViewEntity.ridingEntity && !entity.canRiderInteract()) {
                                    if (vecInsideDist == 0.0D) {
                                        pointedEntity = entity;
                                        tempVec = calculateInterceptPos.hitVec;
                                    }
                                } else {
                                    pointedEntity = entity;
                                    tempVec = calculateInterceptPos.hitVec;
                                    vecInsideDist = calcInterceptPosDist;
                                }
                            }
                        }
                    }
                }

                if (pointedEntity != null && (vecInsideDist < distanceToVec3 || rayTrace == null)) {
                    return pointedEntity;
                }
            }
        }

        return null;
    }

    @SideOnly(Side.CLIENT)
    public static void glScissor(int x, int y, int width, int height) {
        Minecraft mc = Minecraft.getMinecraft();
        ScaledResolution resolution = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
        int scale = resolution.getScaleFactor();

        int scissorWidth = width * scale;
        int scissorHeight = height * scale;
        int scissorX = x * scale;
        int scissorY = mc.displayHeight - scissorHeight - (y * scale);

        GL11.glScissor(scissorX, scissorY, scissorWidth, scissorHeight);
    }

    @SideOnly(Side.CLIENT)
    public static String getKeyName(KeyBinding key) {
        return Keyboard.getKeyName(key.getKeyCode());
    }
}