package com.flansmod.client.tracer;

import com.flansmod.common.guns.ItemGun;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class EntityBulletTracer extends EntityFX {

    private final EntityPlayer shooter;
    private final double x;
    private final double y;
    private final double z;
    private final double mx;
    private final double my;
    private final double mz;

    public EntityBulletTracer(EntityPlayer shooter, World paramxrqx, double x, double y, double z, double mx, double my,
                              double mz) {
        super(paramxrqx, (x + mx) / 2.0D, (y + my) / 2.0D, (z + mz) / 2.0D);
        this.shooter = shooter;
        this.x = x;
        this.y = y;
        this.z = z;
        this.mx = mx;
        this.my = my;
        this.mz = mz;
        super.renderDistanceWeight = 6.0D;
    }

    public void renderParticle(Tessellator paramntpi, float paramFloat1, float paramFloat2, float paramFloat3,
                               float paramFloat4, float paramFloat5, float paramFloat6) {
        ItemGun gun = null;
        if (this.shooter.getCurrentEquippedItem() != null
                && this.shooter.getCurrentEquippedItem().getItem() instanceof ItemGun) {
            gun = (ItemGun) this.shooter.getCurrentEquippedItem().getItem();
        }

        float r = 1.0F;
        float g = 1.0F;
        float b = 0.0F;
        float tracerSize = super.particleScale;
        if (gun != null && gun.type.tracerSize != -1.0F) {
            tracerSize = gun.type.tracerSize;
        }

        if (gun != null && gun.type.tracerColor != -1) {
            r = (float) (gun.type.tracerColor >> 16 & 255) / 255.0F;
            g = (float) (gun.type.tracerColor >> 8 & 255) / 255.0F;
            b = (float) (gun.type.tracerColor & 255) / 255.0F;
        }

        Minecraft.getMinecraft().entityRenderer.disableLightmap(0.0D);
        GL11.glPushMatrix();
        GL11.glDisable(3553);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glLineWidth(tracerSize);
        GL11.glBegin(1);
        GL11.glColor4f(r, g, b, 1.0F);
        GL11.glVertex3d(this.x - EntityFX.interpPosX, this.y - EntityFX.interpPosY, this.z - EntityFX.interpPosZ);
        GL11.glVertex3d(this.mx - EntityFX.interpPosX, this.my - EntityFX.interpPosY, this.mz - EntityFX.interpPosZ);
        GL11.glEnd();
        GL11.glColor3f(1.0F, 1.0F, 1.0F);
        GL11.glDisable(3042);
        GL11.glEnable(3553);
        GL11.glPopMatrix();
        Minecraft.getMinecraft().entityRenderer.enableLightmap(0.0D);
        this.setDead();
    }

    public int getFXLayer() {
        return 3;
    }
}
