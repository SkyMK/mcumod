package mcu.looting.chest;

import net.minecraft.client.model.ModelChest;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class ChestSpecialRender extends TileEntitySpecialRenderer {
    private static final ResourceLocation texture = new ResourceLocation("textures/entity/chest/normal.png");
    private final ModelChest model = new ModelChest();

    public void renderTileEntityAt(TileEntityChest p_147500_1_, double p_147500_2_, double p_147500_4_, double p_147500_6_, float p_147500_8_) {
        int i = p_147500_1_.getBlockMetadata();
        bindTexture(texture);
        ModelChest modelchest = model;
        GL11.glPushMatrix();
        GL11.glEnable(32826);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glTranslatef((float) p_147500_2_, (float) p_147500_4_ + 1.0F, (float) p_147500_6_ + 1.0F);
        GL11.glScalef(1.0F, -1.0F, -1.0F);
        GL11.glTranslatef(0.5F, 0.5F, 0.5F);
        GL11.glRotatef(180 - i * 90f, 0, -1, 0);
        GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
        modelchest.renderAll();
        GL11.glDisable(32826);
        GL11.glPopMatrix();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    }

    public void renderTileEntityAt(TileEntity p_147500_1_, double p_147500_2_, double p_147500_4_, double p_147500_6_, float p_147500_8_) {
        this.renderTileEntityAt((TileEntityChest) p_147500_1_, p_147500_2_, p_147500_4_, p_147500_6_, p_147500_8_);
    }
}
