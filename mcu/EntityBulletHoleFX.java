/*
 * Decompiled with CFR 0.150.
 *
 * Could not load the following classes:
 *  CustomModel
 *  nedl
 *  org.lwjgl.opengl.GL11
 */
package com.flansmod.mcu;

import mcu.client.models.MCUObject;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EntityBulletHoleFX extends EntityFX {
    public static final MCUObject model;
    private static final ResourceLocation[][] textures;
    public static List<EntityBulletHoleFX> bulletHoles;
    static int displayListId;
    private static final boolean wasPressed;

    static {
        int n;
        model = new MCUObject(EntityBulletHoleFX.class.getResourceAsStream("/assets/flansmod/bulletholes/0.obj"));
        displayListId = 0;
        textures = new ResourceLocation[5][];
        bulletHoles = new LinkedList<EntityBulletHoleFX>();
        List[] arrlist = new List[textures.length];
        for (int i = 0; i < arrlist.length; ++i) {
            arrlist[i] = new ArrayList();
        }
        InputStream inputStream = EntityBulletHoleFX.class.getResourceAsStream("/assets/flansmod/bulletholes/0.txt");
        Scanner scanner = new Scanner(inputStream, "UTF-8");
        for (n = 0; n < textures.length; ++n) {
            int n2 = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i <= n2; ++i) {
                arrlist[n].add(new ResourceLocation("flansmod:bulletholes/" + n + "." + i + ".png"));
            }
        }
        for (n = 0; n < arrlist.length; ++n) {
            EntityBulletHoleFX.textures[n] = (ResourceLocation[]) arrlist[n]
                    .toArray(new ResourceLocation[arrlist[n].size()]);
        }
        scanner.close();
        wasPressed = false;
    }

    private final float rotation;
    private final float size;
    private final int type;
    private final int texturenum;
    private final int x;
    private final int y;
    private final int z;
    private final Block bId;
    private final int state;
    private final EnumFacing side;
    private final float offset;

    public EntityBulletHoleFX(World world, double d, double d2, double d3, int n, int n2, int n3, Block n4,
                              EnumFacing enumFacing, int n5, float f) {
        super(world, d, d2, d3);
        if (n4 instanceof BlockDoor && this.worldObj.getBlock(n, n2 - 1, n3) == n4) {
            --n2;
        }
        this.x = n;
        this.y = n2;
        this.z = n3;
        this.bId = n4;
        this.side = enumFacing;
        this.state = this.worldObj.getBlockMetadata(n, n2, n3);
        this.particleMaxAge = 100;
        this.renderDistanceWeight = 6.0;
        this.type = n5;
        this.texturenum = this.rand.nextInt(textures[n5].length);
        this.rotation = this.rand.nextFloat() * 360.0f;
        this.offset = this.rand.nextFloat() - 0.5f;
        this.size = f;
        bulletHoles.add(this);
    }

    @Override
    public void onUpdate() {
        if (this.particleAge++ >= this.particleMaxAge || this.worldObj.getBlock(this.x, this.y, this.z) != this.bId
                || this.worldObj.getBlockMetadata(this.x, this.y, this.z) != this.state) {
            this.setDead();
        }
    }

    @Override
    public void setDead() {
        super.setDead();
        bulletHoles.remove(this);
    }

    @Override
    public void renderParticle(Tessellator Tessellator2, float f, float f2, float f3, float f4, float f5, float f6) {
        GL11.glEnable(32826);
        EntityLivingBase entityLivingBase = Minecraft.getMinecraft().renderViewEntity;
        EntityFX.interpPosX = entityLivingBase.lastTickPosX
                + (entityLivingBase.posX - entityLivingBase.lastTickPosX) * (double) f;
        EntityFX.interpPosY = entityLivingBase.lastTickPosY
                + (entityLivingBase.posY - entityLivingBase.lastTickPosY) * (double) f;
        EntityFX.interpPosZ = entityLivingBase.lastTickPosZ
                + (entityLivingBase.posZ - entityLivingBase.lastTickPosZ) * (double) f;
        GL11.glPushMatrix();
        GL11.glTranslated(this.posX - interpPosX, this.posY - interpPosY,
                this.posZ - interpPosZ);
        int n = this.x;
        int n2 = this.y;
        int n3 = this.z;
        if (this.side == EnumFacing.DOWN) {
            GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
            --n2;
        } else if (this.side == EnumFacing.NORTH) {
            GL11.glRotatef(-90.0f, 1.0f, 0.0f, 0.0f);
            --n3;
        } else if (this.side == EnumFacing.SOUTH) {
            GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
            ++n3;
        } else if (this.side == EnumFacing.EAST) {
            GL11.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
            --n;
        } else if (this.side == EnumFacing.WEST) {
            GL11.glRotatef(-90.0f, 0.0f, 0.0f, 1.0f);
            ++n;
        } else {
            ++n2;
        }
        int n4 = this.worldObj.getLightBrightnessForSkyBlocks(n, n2, n3, 0);
        int n5 = n4 % 65536;
        int n6 = n4 / 65536;
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) n5 / 1.0f, (float) n6 / 1.0f);
        GL11.glRotatef(this.rotation, 0.0f, 1.0f, 0.0f);
        GL11.glScalef(this.size, 1.0f, this.size);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(1.0f, 1.0f, 1.0f,
                Math.max(0.0f, (float) (this.particleMaxAge - this.particleAge) / 2.0f));
        GL11.glDisable(3008);
        GL11.glPolygonOffset(-4.0f + this.offset, -3.0f);
        GL11.glEnable(32823);
        GL11.glEnable(3008);
        Minecraft.getMinecraft().getTextureManager().bindTexture(textures[this.type][this.texturenum]);
        if (displayListId != 0) {
            GL11.glCallList(displayListId);
        } else {
            displayListId = GL11.glGenLists(1);
            GL11.glNewList(displayListId, 4864);
            try {
                model.renderAll();
            } catch (RuntimeException runtimeException) {
                System.out.println(
                        "\u041d\u0435 \u0437\u0430\u0433\u0440\u0443\u0436\u0435\u043d\u0430 \u043c\u043e\u0434\u0435\u043b\u044c \u0434\u044b\u0440\u043a\u0438 \u043e\u0442 \u043f\u0443\u043b\u0438!");
            }
            GL11.glEndList();
        }
        GL11.glDisable(3008);
        GL11.glPolygonOffset(0.0f, 0.0f);
        GL11.glDisable(32823);
        GL11.glEnable(3008);
        GL11.glPopMatrix();
    }

    @Override
    public int getFXLayer() {
        return 3;
    }
}
