package mcu.client.render;

import mcu.entity.EntityHouse;
import mcu.utils.PositionsHelper;
import mcu.utils.SidedProtection;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import net.minecraftforge.client.model.obj.WavefrontObject;
import org.lwjgl.opengl.GL11;

public class RenderHouse extends Render {
    public static final ResourceLocation houseTexture;

    static {
        houseTexture = new ResourceLocation("mcuniversal", "models/items/house.png");
    }

    public boolean hasCreateList;
    private int list;

    public RenderHouse() {
        if (!SidedProtection.CLIENT)
            return;
        this.hasCreateList = false;
        GL11.glNewList(this.list = GL11.glGenLists(1), 4864);
        GL11.glScalef(0.095f, 0.095f, 0.095f);
        IModelCustom model = AdvancedModelLoader
                .loadModel(new ResourceLocation("mcuniversal", "models/items/house.obj"));
        model = new FastRender((WavefrontObject) model);
        model.renderAll();
        GL11.glEndList();
    }

    public void doRender(final Entity entity, final double x, final double y, final double z, final float yaw,
                         final float pitch) {
        if (!SidedProtection.CLIENT)
            return;
        GL11.glPushMatrix();
        GL11.glTranslated(x, y, z);
        this.bindTexture(RenderHouse.houseTexture);
        if (entity instanceof EntityHouse) {
            EntityHouse house = (EntityHouse) entity;
            if (house.client) {
                if (!PositionsHelper.checkHousePlace(house)) {
                    GL11.glColor4f(1, 0, 0, 1);
                } else {
                    GL11.glColor4f(0, 1, 0, 1);
                }
            }
        }
        GL11.glCallList(this.list);
        if (GL11.glIsEnabled(GL11.GL_BLEND)) {
            GL11.glDisable(GL11.GL_BLEND);
        }
        GL11.glPopMatrix();
    }

    protected ResourceLocation getEntityTexture(final Entity p_110775_1_) {
        return null;
    }
}
