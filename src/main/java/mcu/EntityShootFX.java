package com.flansmod.client.shootfx;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class EntityShootFX extends EntityFX {

    private static final ResourceLocation tex1 = new ResourceLocation("flansmod", "textures/gun_shot0.png");
    private static final ResourceLocation tex2 = new ResourceLocation("flansmod", "textures/gun_shot1.png");
    private final EntityPlayer shooter;
    private final double xoff;
    private final double yoff;
    private final double zoff;

    public EntityShootFX(EntityPlayer shooter, World world, double xoff, double yoff, double zoff) {
        super(world, shooter.posX, shooter.posY + (double) shooter.getEyeHeight(), shooter.posZ, 0.0D, 0.0D, 0.0D);
        this.shooter = shooter;
        this.xoff = xoff;
        this.yoff = yoff;
        this.zoff = zoff;
        super.renderDistanceWeight = 6.0D;
        super.particleMaxAge = 2;
    }

    public void onUpdate() {
        if (super.particleAge++ >= super.particleMaxAge) {
            this.setDead();
        }

    }

    public void renderParticle(Tessellator tes, float paramFloat1, float paramFloat2, float paramFloat3,
                               float paramFloat4, float paramFloat5, float paramFloat6) {
        Minecraft.getMinecraft().entityRenderer.disableLightmap(0.0D);
        GL11.glPushMatrix();
        GL11.glEnable(3553);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(2896);
        Minecraft.getMinecraft().getTextureManager().bindTexture(tex1);
        GL11.glRotatef(90.0F - this.shooter.rotationYaw, 0.0F, 1.0F, 0.0F);
        if (this.shooter != Minecraft.getMinecraft().thePlayer
                || Minecraft.getMinecraft().gameSettings.thirdPersonView != 0) {
            GL11.glRotatef(this.shooter.rotationPitch / 2.0F, 0.0F, 0.0F, 1.0F);
        }

        GL11.glNormal3f(0.0F, 1.0F, 0.0F);
        double d2 = Math.toRadians(this.shooter.rotationPitch);
        double d3 = 0.1D;
        double d4 = d3 + 1.0D;
        double d5 = Math.sin(d2) * 0.5D;
        double d6 = Math.cos(d2) * 0.5D;
        double d7 = Math.sin(d2) * d3;
        double d8 = Math.sin(d2) * d4;
        double d9 = Math.cos(d2) * d3;
        double d10 = Math.cos(d2) * d4;
        GL11.glTranslated((double) ((float) (-2.0D * d6)) + this.xoff, (double) ((float) (-d5) * 2.0F) + this.yoff,
                this.zoff);
        float f4 = 0.4F;
        GL11.glScalef(f4, f4, f4);
        tes.startDrawingQuads();
        tes.addVertexWithUV(d9 + d5, d7 - d6, 0.0D, 0.0D, 1.0D);
        tes.addVertexWithUV(d10 + d5, d8 - d6, 0.0D, 1.0D, 1.0D);
        tes.addVertexWithUV(d10 - d5, d8 + d6, 0.0D, 1.0D, 0.0D);
        tes.addVertexWithUV(d9 - d5, d7 + d6, 0.0D, 0.0D, 0.0D);
        tes.draw();
        tes.startDrawingQuads();
        tes.addVertexWithUV(d9 + d5, d7 - d6, 0.0D, 0.0D, 1.0D);
        tes.addVertexWithUV(d9 - d5, d7 + d6, 0.0D, 0.0D, 0.0D);
        tes.addVertexWithUV(d10 - d5, d8 + d6, 0.0D, 1.0D, 0.0D);
        tes.addVertexWithUV(d10 + d5, d8 - d6, 0.0D, 1.0D, 1.0D);
        tes.draw();
        tes.startDrawingQuads();
        tes.addVertexWithUV(d9, d7, -0.5D, 0.0D, 1.0D);
        tes.addVertexWithUV(d10, d8, -0.5D, 1.0D, 1.0D);
        tes.addVertexWithUV(d10, d8, 0.5D, 1.0D, 0.0D);
        tes.addVertexWithUV(d9, d7, 0.5D, 0.0D, 0.0D);
        tes.draw();
        tes.startDrawingQuads();
        tes.addVertexWithUV(d9, d7, -0.5D, 0.0D, 1.0D);
        tes.addVertexWithUV(d9, d7, 0.5D, 0.0D, 0.0D);
        tes.addVertexWithUV(d10, d8, 0.5D, 1.0D, 0.0D);
        tes.addVertexWithUV(d10, d8, -0.5D, 1.0D, 1.0D);
        tes.draw();
        Minecraft.getMinecraft().getTextureManager().bindTexture(tex2);
        tes.startDrawingQuads();
        tes.addVertexWithUV(d10 + d5, d8 - d6, -0.5D, 0.0D, 1.0D);
        tes.addVertexWithUV(d10 + d5, d8 - d6, 0.5D, 1.0D, 1.0D);
        tes.addVertexWithUV(d10 - d5, d8 + d6, 0.5D, 1.0D, 0.0D);
        tes.addVertexWithUV(d10 - d5, d8 + d6, -0.5D, 0.0D, 0.0D);
        tes.draw();
        GL11.glEnable(2896);
        GL11.glPopMatrix();
        Minecraft.getMinecraft().entityRenderer.enableLightmap(0.0D);
    }

    public int getFXLayer() {
        return 3;
    }

}
