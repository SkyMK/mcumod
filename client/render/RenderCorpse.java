package mcu.client.render;

import mcu.client.MCUAbstractClientPlayer;
import mcu.entity.EntityCorpse;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderCorpse extends Render {
    private final ModelBiped mainModel;
    private ResourceLocation skin;

    public RenderCorpse() {
        this.mainModel = new ModelBiped();
        this.skin = null;
    }

    public void doRenderCorpse(final EntityCorpse EntityCorpse, final double n, final double n2, final double n3,
                               final float n4, final float n5) {
        MCUAbstractClientPlayer.getDownloadImageSkin(this.skin = MCUAbstractClientPlayer.getLocationSkin(EntityCorpse.getUsernameKilled()), EntityCorpse.getUsernameKilled());
        this.bindTexture(skin);
        GL11.glPushMatrix();
        GL11.glTranslatef((float) n, (float) n2 + 0.125f, (float) n3);
        GL11.glRotatef(-EntityCorpse.rotationYaw, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
        GL11.glTranslatef(0.0f, -0.5f, 0.0f);
        GL11.glScaled(0.1, 0.1, 0.1);
        final int lifeStage = EntityCorpse.getLifeStage();
        this.mainModel.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, EntityCorpse);
        if (lifeStage > 13) {
            GL11.glColor3f(0.25f, 0.25f, 0.25f);
        } else if (lifeStage > 12) {
            GL11.glColor3f(0.5f, 0.5f, 0.5f);
        } else {
            GL11.glColor3f(1.0f, 1.0f, 1.0f);
        }
        this.mainModel.bipedHead.render(0.625f);
        this.mainModel.bipedBody.render(0.625f);
        if (lifeStage < 12) {
            if (lifeStage > 10) {
                GL11.glColor3f(0.25f, 0.25f, 0.25f);
            } else if (lifeStage > 9) {
                GL11.glColor3f(0.5f, 0.5f, 0.5f);
            } else {
                GL11.glColor3f(1.0f, 1.0f, 1.0f);
            }
            this.mainModel.bipedRightArm.render(0.625f);
        }
        if (lifeStage < 9) {
            if (lifeStage > 7) {
                GL11.glColor3f(0.25f, 0.25f, 0.25f);
            } else if (lifeStage > 6) {
                GL11.glColor3f(0.5f, 0.5f, 0.5f);
            } else {
                GL11.glColor3f(1.0f, 1.0f, 1.0f);
            }
            this.mainModel.bipedLeftArm.render(0.625f);
        }
        if (lifeStage < 6) {
            if (lifeStage > 4) {
                GL11.glColor3f(0.25f, 0.25f, 0.25f);
            } else if (lifeStage > 3) {
                GL11.glColor3f(0.5f, 0.5f, 0.5f);
            } else {
                GL11.glColor3f(1.0f, 1.0f, 1.0f);
            }
            this.mainModel.bipedRightLeg.render(0.625f);
        }
        if (lifeStage < 3) {
            if (lifeStage > 1) {
                GL11.glColor3f(0.25f, 0.25f, 0.25f);
            } else if (lifeStage > 0) {
                GL11.glColor3f(0.5f, 0.5f, 0.5f);
            } else {
                GL11.glColor3f(1.0f, 1.0f, 1.0f);
            }
            this.mainModel.bipedLeftLeg.render(0.625f);
        }
        this.mainModel.bipedHeadwear.render(0.625f);
        GL11.glPopMatrix();
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
    }

    public void doRender(final Entity entity, final double n, final double n2, final double n3, final float n4,
                         final float n5) {
        GL11.glEnable(32826);
        this.doRenderCorpse((EntityCorpse) entity, n, n2, n3, n4, n5);
    }

    protected ResourceLocation getEntityTexture(final Entity entity) {
        return null;
    }
}