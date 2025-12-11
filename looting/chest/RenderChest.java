package mcu.looting.chest;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelChest;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;

import static org.lwjgl.opengl.GL11.*;

public class RenderChest implements ISimpleBlockRenderingHandler {
    public static int renderID;
    private static final ResourceLocation field_147504_g = new ResourceLocation("textures/entity/chest/normal.png");
    private final ModelChest model = new ModelChest();

    @Override
    public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer) {
        Minecraft.getMinecraft().getTextureManager().bindTexture(field_147504_g);
        glPushMatrix();
        glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        glScalef(1.0F, -1.0F, -1.0F);
        glTranslatef(-0.5F, -0.5F, -0.5F);
        model.renderAll();
        glPopMatrix();
        glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    }

    @Override
    public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
        return false;
    }

    @Override
    public boolean shouldRender3DInInventory(int modelId) {
        return true;
    }

    @Override
    public int getRenderId() {
        return renderID;
    }
}
