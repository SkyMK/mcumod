package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelAUG extends ModelGun {

    int textureX = 32;
    int textureY = 32;

    public ModelAUG() {
        super.gunModel = new ModelRendererTurbo[11];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 7, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 13, 2, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 21, 7, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 8, 12, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 24, 1, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 0, 18, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 27, 4, this.textureX, this.textureY);
        super.gunModel[8] = new ModelRendererTurbo(this, 23, 13, this.textureX, this.textureY);
        super.gunModel[9] = new ModelRendererTurbo(this, 0, 22, this.textureX, this.textureY);
        super.gunModel[10] = new ModelRendererTurbo(this, 5, 22, this.textureX, this.textureY);
        super.gunModel[0].addBox(-6.0F, -3.25F, -3.25F, 8, 2, 2, 0.0F);
        super.gunModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[0].rotateAngleX = -0.7853982F;
        super.gunModel[1].addShapeBox(-7.0F, -3.0F, -1.0F, 4, 4, 2, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F,
                0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.gunModel[1].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[2].addShapeBox(-3.0F, -3.5F, -1.0F, 4, 2, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.3F, 0.0F, 0.0F, -1.3F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.gunModel[2].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[3].addShapeBox(-0.4F, -3.0F, -0.5F, 2, 4, 1, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F,
                0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F,
                0.0F);
        super.gunModel[3].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[3].rotateAngleZ = -0.13962634F;
        super.gunModel[4].addShapeBox(2.0F, -3.0F, -3.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F,
                -0.25F);
        super.gunModel[4].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[4].rotateAngleX = -0.7853982F;
        super.gunModel[5].addShapeBox(7.0F, -3.4F, -0.5F, 2, 1, 1, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F,
                -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F,
                -0.1F, -0.1F);
        super.gunModel[5].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[6].addBox(-1.5F, -5.0F, -0.5F, 8, 2, 1, 0.0F);
        super.gunModel[6].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[7].addShapeBox(6.5F, -5.0F, -0.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[7].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[8].addBox(4.5F, -2.6F, -0.5F, 3, 1, 1, 0.0F);
        super.gunModel[8].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[9].addShapeBox(-2.5F, -5.0F, -0.5F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[9].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[10].addShapeBox(-7.0F, -3.25F, -3.25F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
        super.gunModel[10].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[10].rotateAngleX = -0.7853982F;
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 1, 12, this.textureX, this.textureY);
        super.ammoModel[0].addBox(-4.0F, -2.7F, -0.5F, 2, 4, 1, 0.0F);
        super.ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.ammoModel[0].rotateAngleZ = 0.15707964F;
        super.slideModel = new ModelRendererTurbo[2];
        super.slideModel[0] = new ModelRendererTurbo(this, 19, 17, this.textureX, this.textureY);
        super.slideModel[1] = new ModelRendererTurbo(this, 19, 17, this.textureX, this.textureY);
        super.slideModel[0].addShapeBox(3.0F, -4.1F, 0.4F, 1, 1, 1, 0.0F, -0.5F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F,
                0.0F, -0.3F, -0.5F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F,
                -0.3F);
        super.slideModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.slideModel[1].addShapeBox(3.0F, -4.1F, -1.4F, 1, 1, 1, 0.0F, -0.5F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F,
                0.0F, -0.3F, -0.5F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F,
                -0.3F);
        super.slideModel[1].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.barrelAttachPoint = new Vector3f(0.5625F, 0.171875F, 0.0F);
        super.stockAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
        super.scopeAttachPoint = new Vector3f(0.25F, 0.3125F, 0.0F);
        super.gripAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
        super.gunSlideDistance = 0.0F;
        super.animationType = EnumAnimationType.PISTOL_CLIP;
        this.translateAll(1.0F, 0.0F, 0.0F);
        this.flipAll();
    }
}
