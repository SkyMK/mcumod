/*
 * Decompiled with CFR 0.150.
 *
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.flansmod.mcu;

import com.flansmod.client.FlansModClient;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class EntityTraceFX {
    private static int dl_id = -1;
    private double x;
    private double y;
    private double z;
    private final double q;
    private final double w;
    private final double e;
    private final float rotationYaw;
    private final float rotationPitch;
    private final int ticks;
    private final boolean oob;
    private boolean flag;

    public EntityTraceFX(boolean bl, double d, double d2, double d3, double d4, double d5, double d6) {
        this.oob = bl;
        this.ticks = FlansModClient.ticks;
        this.x = d;
        this.y = d2;
        this.z = d3;
        this.q = d4;
        this.w = d5;
        this.e = d6;
        double d7 = d4 - d;
        double d8 = d5 - d2;
        double d9 = d6 - d3;
        float f = (float) Math.sqrt(d7 * d7 + d9 * d9);
        this.rotationYaw = (float) (Math.atan2(d7, d9) * 180.0 / 3.1415927410125732);
        this.rotationPitch = (float) (Math.atan2(d8, f) * 180.0 / 3.1415927410125732);
    }

    public boolean renderParticleAndDelete(float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        boolean bl;
        if (this.ticks < FlansModClient.ticks - 1) {
            return true;
        }
        boolean bl2 = this.ticks == FlansModClient.ticks;
        boolean bl3 = bl = this.ticks <= FlansModClient.ticks - 1;
        if (bl2 || bl) {
            f7 = (float) (this.x + (this.q - this.x) * (double) f);
            f6 = (float) (this.y + (this.w - this.y) * (double) f);
            f5 = (float) (this.z + (this.e - this.z) * (double) f);
        } else {
            f7 = (float) this.q;
            f6 = (float) this.w;
            f5 = (float) this.e;
        }
        if (bl) {
            f4 = f7 - (float) this.q;
            f3 = f6 - (float) this.w;
            f2 = f5 - (float) this.e;
        } else {
            f4 = f7 - (float) this.x;
            f3 = f6 - (float) this.y;
            f2 = f5 - (float) this.z;
        }
        float f8 = MathHelper.sqrt_float(f4 * f4 + f3 * f3 + f2 * f2);
        float f9 = -0.05f;
        float f10 = bl ? f8 : -f8;
        f4 = ((float) this.x + (float) this.q) / 2.0f - (float) RenderManager.renderPosX;
        f3 = ((float) this.y + (float) this.w) / 2.0f - (float) RenderManager.renderPosY;
        f2 = ((float) this.z + (float) this.e) / 2.0f - (float) RenderManager.renderPosZ;
        f8 = MathHelper.sqrt_float(f4 * f4 + f3 * f3 + f2 * f2);
        boolean bl4 = f8 < 32.0f;
        boolean bl5 = f8 > 16.0f;
        GL11.glPushMatrix();
        GL11.glTranslatef(f7, f6, f5);
        GL11.glRotatef(this.rotationYaw, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(this.rotationPitch, -1.0f, 0.0f, 0.0f);
        if (bl2) {
            if (bl4) {
                if (dl_id == -1) {
                    if (dl_id == -1) {
                        dl_id = GL11.glGenLists(1);
                    }
                    GL11.glNewList(dl_id, 4865);
                    GL11.glBegin(7);
                    GL11.glVertex3f(-0.001f, -0.001f, 0.0f);
                    GL11.glVertex3f(-0.007f, -0.007f, -0.05f);
                    GL11.glVertex3f(-0.007f, 0.007f, -0.05f);
                    GL11.glVertex3f(-0.001f, 0.001f, 0.0f);
                    GL11.glVertex3f(0.001f, -0.001f, 0.0f);
                    GL11.glVertex3f(0.007f, -0.007f, -0.05f);
                    GL11.glVertex3f(0.007f, 0.007f, -0.05f);
                    GL11.glVertex3f(0.001f, 0.001f, 0.0f);
                    GL11.glVertex3f(-0.001f, 0.001f, 0.0f);
                    GL11.glVertex3f(-0.007f, 0.007f, -0.05f);
                    GL11.glVertex3f(0.007f, 0.007f, -0.05f);
                    GL11.glVertex3f(0.001f, 0.001f, 0.0f);
                    GL11.glVertex3f(-0.001f, -0.001f, 0.0f);
                    GL11.glVertex3f(-0.007f, -0.007f, -0.05f);
                    GL11.glVertex3f(0.007f, -0.007f, -0.05f);
                    GL11.glVertex3f(0.001f, -0.001f, 0.0f);
                    GL11.glVertex3f(-0.001f, -0.001f, 0.0f);
                    GL11.glVertex3f(0.001f, -0.001f, 0.0f);
                    GL11.glVertex3f(0.001f, 0.001f, 0.0f);
                    GL11.glVertex3f(-0.001f, 0.001f, 0.0f);
                    GL11.glVertex3f(-0.007f, -0.007f, -0.05f);
                    GL11.glVertex3f(0.007f, -0.007f, -0.05f);
                    GL11.glVertex3f(0.007f, 0.007f, -0.05f);
                    GL11.glVertex3f(-0.007f, 0.007f, -0.05f);
                    GL11.glEnd();
                    GL11.glEndList();
                } else {
                    GL11.glCallList(dl_id);
                }
            }
            if (bl5) {
                GL11.glBegin(0);
                GL11.glVertex3f(0.0f, 0.0f, 0.0f);
                GL11.glEnd();
            }
        }
        if (bl4) {
            if (!bl2) {
                f9 = 0.0f;
            }
            float f11 = 0.005f;
            float f12 = 0.005f;
            if (bl) {
                f11 = 0.0f;
            } else if (this.oob) {
                f12 = 0.0f;
            } else {
                f11 = 0.005f;
            }
            GL11.glBegin(7);
            GL11.glVertex3f(-f11, -f11, f9);
            GL11.glVertex3f(-f12, -f12, f10);
            GL11.glVertex3f(f12, f12, f10);
            GL11.glVertex3f(f11, f11, f9);
            GL11.glVertex3f(-f11, f11, f9);
            GL11.glVertex3f(-f12, f12, f10);
            GL11.glVertex3f(f12, -f12, f10);
            GL11.glVertex3f(f11, -f11, f9);
            GL11.glEnd();
        }
        if (!this.flag) {
            this.flag = true;
            if (this.oob) {
                this.x = f7;
                this.y = f6;
                this.z = f5;
            }
        }
        if (bl5) {
            GL11.glBegin(1);
            GL11.glVertex3f(0.0f, 0.0f, f10);
            GL11.glVertex3f(0.0f, 0.0f, 0.0f);
            GL11.glEnd();
        }
        GL11.glPopMatrix();
        return false;
    }
}
