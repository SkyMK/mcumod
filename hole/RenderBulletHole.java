package com.flansmod.client.hole;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderBulletHole extends Render {

    private final ResourceLocation texture = new ResourceLocation("flansmod", "textures/bullet_hole.png");
    private final TextureAtlasSprite[] icons = new TextureAtlasSprite[4];

    public RenderBulletHole() {
        for (int i = 0; i < this.icons.length; ++i) {
            this.icons[i] = new RenderBulletHole.TextureAtlas("bullet_hole_" + i);
            this.icons[i].setIconWidth(64);
            this.icons[i].setIconHeight(64);
            this.icons[i].initSprite(128, 128, i % 2, i / 2, false);
        }

    }

    public void render(EntityBulletHole entity, double x, double y, double z, float par8, float frame) {
        int side = entity.sideHit;
        World world = entity.worldObj;
        float size = 0.1F;
        int minX = MathHelper.floor_double(entity.posX - (double) size);
        int maxX = MathHelper.floor_double(entity.posX + (double) size);
        int minY = MathHelper.floor_double(entity.posY - (double) size);
        int maxY = MathHelper.floor_double(entity.posY + (double) size);
        int minZ = MathHelper.floor_double(entity.posZ - (double) size);
        int maxZ = MathHelper.floor_double(entity.posZ + (double) size);
        int xOffset = 0;
        int yOffset = 0;
        int zOffset = 0;
        switch (side) {
            case 0:
            case 1:
                yOffset = side == 0 ? 0 : -1;
                minY = maxY = MathHelper.floor_double(entity.posY);
                break;
            case 2:
            case 3:
                zOffset = side == 3 ? -1 : 0;
                minZ = maxZ = MathHelper.floor_double(entity.posZ);
                break;
            case 4:
            case 5:
                xOffset = side == 5 ? -1 : 0;
                minX = maxX = MathHelper.floor_double(entity.posX);
                break;
            default:
                return;
        }

        GL11.glEnable(3042);
        GL11.glPolygonOffset(-3.0F - (float) (entity.getEntityId() % 1000) / 1000.0F,
                -3.0F - (float) (entity.getEntityId() % 1000) / 1000.0F);
        GL11.glEnable('\u8037');
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240.0F, 0.0F);
        GL11.glBlendFunc(774, 768);
        GL11.glDisable(2896);
        Minecraft.getMinecraft().renderEngine.bindTexture(this.texture);
        GL11.glPushMatrix();
        GL11.glTranslated(x, y, z);
        Tessellator t = Tessellator.instance;
        t.startDrawingQuads();

        for (int blockX = minX; blockX <= maxX; ++blockX) {
            for (int blockY = minY; blockY <= maxY; ++blockY) {
                for (int blockZ = minZ; blockZ <= maxZ; ++blockZ) {
                    Block block = world.getBlock(blockX + xOffset, blockY + yOffset, blockZ + zOffset);
                    if (block != Blocks.air) {
                        this.renderHoleOnBlock(block, entity.posX, entity.posY, entity.posZ, blockX, blockY, blockZ,
                                size, this.icons[entity.getEntityId() % 4], entity.sideHit);
                    }
                }
            }
        }

        t.draw();
        GL11.glEnable(2896);
        GL11.glPopMatrix();
        GL11.glPolygonOffset(0.0F, 0.0F);
        GL11.glDisable('\u8037');
        GL11.glDisable(3042);
        entity.lastRenderedTick = entity.ticksExisted;
    }

    private void renderHoleOnBlock(Block block, double centerX, double centerY, double centerZ, int blockX, int blockY,
                                   int blockZ, float radius, IIcon icon, int side) {
        Tessellator tessellator = Tessellator.instance;
        if (block.renderAsNormalBlock()) {
            float halfIconSize = (icon.getMaxU() - icon.getMinU()) / 2.0F;
            double minX;
            double minY;
            double minZ;
            double maxX;
            double maxY;
            double maxZ;
            float minU;
            float minV;
            float maxU;
            float maxV;
            switch (side) {
                case 0:
                    minX = Math.max((double) blockX + block.getBlockBoundsMinX() - centerX, -radius);
                    minZ = Math.max((double) blockZ + block.getBlockBoundsMinZ() - centerZ, -radius);
                    maxX = Math.min((double) blockX + block.getBlockBoundsMaxX() - centerX, radius);
                    maxZ = Math.min((double) blockZ + block.getBlockBoundsMaxZ() - centerZ, radius);
                    minU = icon.getMinU() + icon.getMaxU() / 2.0F + halfIconSize * (float) minX / radius;
                    maxU = icon.getMinU() + icon.getMaxU() / 2.0F + halfIconSize * (float) maxX / radius;
                    minV = icon.getMinV() + icon.getMaxV() / 2.0F + halfIconSize * (float) minZ / radius;
                    maxV = icon.getMinV() + icon.getMaxV() / 2.0F + halfIconSize * (float) maxZ / radius;
                    tessellator.addVertexWithUV(maxX, 0.0D, minZ, maxU, minV);
                    tessellator.addVertexWithUV(maxX, 0.0D, maxZ, maxU, maxV);
                    tessellator.addVertexWithUV(minX, 0.0D, maxZ, minU, maxV);
                    tessellator.addVertexWithUV(minX, 0.0D, minZ, minU, minV);
                    break;
                case 1:
                    minX = Math.max((double) blockX + block.getBlockBoundsMinX() - centerX, -radius);
                    minZ = Math.max((double) blockZ + block.getBlockBoundsMinZ() - centerZ, -radius);
                    maxX = Math.min((double) blockX + block.getBlockBoundsMaxX() - centerX, radius);
                    maxZ = Math.min((double) blockZ + block.getBlockBoundsMaxZ() - centerZ, radius);
                    minU = icon.getMinU() + icon.getMaxU() / 2.0F + halfIconSize * (float) minX / radius;
                    maxU = icon.getMinU() + icon.getMaxU() / 2.0F + halfIconSize * (float) maxX / radius;
                    minV = icon.getMinV() + icon.getMaxV() / 2.0F + halfIconSize * (float) minZ / radius;
                    maxV = icon.getMinV() + icon.getMaxV() / 2.0F + halfIconSize * (float) maxZ / radius;
                    tessellator.addVertexWithUV(maxX, 0.0D, minZ, maxU, minV);
                    tessellator.addVertexWithUV(minX, 0.0D, minZ, minU, minV);
                    tessellator.addVertexWithUV(minX, 0.0D, maxZ, minU, maxV);
                    tessellator.addVertexWithUV(maxX, 0.0D, maxZ, maxU, maxV);
                    break;
                case 2:
                    minX = Math.max((double) blockX + block.getBlockBoundsMinX() - centerX, -radius);
                    minY = Math.max((double) blockY + block.getBlockBoundsMinY() - centerY, -radius);
                    maxX = Math.min((double) blockX + block.getBlockBoundsMaxX() - centerX, radius);
                    maxY = Math.min((double) blockY + block.getBlockBoundsMaxY() - centerY, radius);
                    minU = icon.getMinU() + icon.getMaxU() / 2.0F + halfIconSize * (float) minX / radius;
                    maxU = icon.getMinU() + icon.getMaxU() / 2.0F + halfIconSize * (float) maxX / radius;
                    minV = icon.getMinV() + icon.getMaxV() / 2.0F + halfIconSize * (float) minY / radius;
                    maxV = icon.getMinV() + icon.getMaxV() / 2.0F + halfIconSize * (float) maxY / radius;
                    tessellator.addVertexWithUV(minX, maxY, 0.0D, minU, maxV);
                    tessellator.addVertexWithUV(maxX, maxY, 0.0D, maxU, maxV);
                    tessellator.addVertexWithUV(maxX, minY, 0.0D, maxU, minV);
                    tessellator.addVertexWithUV(minX, minY, 0.0D, minU, minV);
                    break;
                case 3:
                    minX = Math.max((double) blockX + block.getBlockBoundsMinX() - centerX, -radius);
                    minY = Math.max((double) blockY + block.getBlockBoundsMinY() - centerY, -radius);
                    maxX = Math.min((double) blockX + block.getBlockBoundsMaxX() - centerX, radius);
                    maxY = Math.min((double) blockY + block.getBlockBoundsMaxY() - centerY, radius);
                    minU = icon.getMinU() + icon.getMaxU() / 2.0F + halfIconSize * (float) minX / radius;
                    maxU = icon.getMinU() + icon.getMaxU() / 2.0F + halfIconSize * (float) maxX / radius;
                    minV = icon.getMinV() + icon.getMaxV() / 2.0F + halfIconSize * (float) minY / radius;
                    maxV = icon.getMinV() + icon.getMaxV() / 2.0F + halfIconSize * (float) maxY / radius;
                    tessellator.addVertexWithUV(minX, maxY, 0.0D, minU, maxV);
                    tessellator.addVertexWithUV(minX, minY, 0.0D, minU, minV);
                    tessellator.addVertexWithUV(maxX, minY, 0.0D, maxU, minV);
                    tessellator.addVertexWithUV(maxX, maxY, 0.0D, maxU, maxV);
                    break;
                case 4:
                    minY = Math.max((double) blockY + block.getBlockBoundsMinY() - centerY, -radius);
                    minZ = Math.max((double) blockZ + block.getBlockBoundsMinZ() - centerZ, -radius);
                    maxY = Math.min((double) blockY + block.getBlockBoundsMaxY() - centerY, radius);
                    maxZ = Math.min((double) blockZ + block.getBlockBoundsMaxZ() - centerZ, radius);
                    minU = icon.getMinU() + icon.getMaxU() / 2.0F + halfIconSize * (float) maxZ / radius;
                    maxU = icon.getMinU() + icon.getMaxU() / 2.0F + halfIconSize * (float) minZ / radius;
                    minV = icon.getMinV() + icon.getMaxV() / 2.0F + halfIconSize * (float) minY / radius;
                    maxV = icon.getMinV() + icon.getMaxV() / 2.0F + halfIconSize * (float) maxY / radius;
                    tessellator.addVertexWithUV(0.0D, maxY, maxZ, minU, maxV);
                    tessellator.addVertexWithUV(0.0D, maxY, minZ, maxU, maxV);
                    tessellator.addVertexWithUV(0.0D, minY, minZ, maxU, minV);
                    tessellator.addVertexWithUV(0.0D, minY, maxZ, minU, minV);
                    break;
                case 5:
                    minY = Math.max((double) blockY + block.getBlockBoundsMinY() - centerY, -radius);
                    minZ = Math.max((double) blockZ + block.getBlockBoundsMinZ() - centerZ, -radius);
                    maxY = Math.min((double) blockY + block.getBlockBoundsMaxY() - centerY, radius);
                    maxZ = Math.min((double) blockZ + block.getBlockBoundsMaxZ() - centerZ, radius);
                    minU = icon.getMinU() + icon.getMaxU() / 2.0F + halfIconSize * (float) maxZ / radius;
                    maxU = icon.getMinU() + icon.getMaxU() / 2.0F + halfIconSize * (float) minZ / radius;
                    minV = icon.getMinV() + icon.getMaxV() / 2.0F + halfIconSize * (float) minY / radius;
                    maxV = icon.getMinV() + icon.getMaxV() / 2.0F + halfIconSize * (float) maxY / radius;
                    tessellator.addVertexWithUV(0.0D, maxY, maxZ, minU, maxV);
                    tessellator.addVertexWithUV(0.0D, minY, maxZ, minU, minV);
                    tessellator.addVertexWithUV(0.0D, minY, minZ, maxU, minV);
                    tessellator.addVertexWithUV(0.0D, maxY, minZ, maxU, maxV);
                    break;
                default:
                    throw new RuntimeException("Invalid side!");
            }
        }

    }

    public void doRender(Entity entity, double x, double y, double z, float par8, float frame) {
        this.render((EntityBulletHole) entity, x, y, z, par8, frame);
    }

    protected ResourceLocation getEntityTexture(Entity entity) {
        return null;
    }

    private class TextureAtlas extends TextureAtlasSprite {

        public TextureAtlas(String s) {
            super(s);
        }
    }
}
