package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelMTAR extends ModelGun {

    int textureX = 32;
    int textureY = 32;

    public ModelMTAR() {
        super.gunModel = new ModelRendererTurbo[8];
        super.gunModel[0] = new ModelRendererTurbo(this, 1, 6, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 7, 7, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 14, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 7, 4, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 3, 3, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 8, 1, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 0, 19, this.textureX, this.textureY);
        super.gunModel[0].addShapeBox(-0.25F, -1.8F, -0.5F, 2, 3, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F,
                0.0F, 0.0F);
        super.gunModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[0].rotateAngleZ = -0.13962634F;
        super.gunModel[1].addBox(-1.5F, -4.5F, -1.0F, 6, 2, 2, 0.0F);
        super.gunModel[1].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[2].addShapeBox(4.5F, -3.25F, -1.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F,
                -0.3F);
        super.gunModel[2].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[3].addShapeBox(-5.5F, -4.5F, -1.0F, 4, 3, 2, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[3].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[4].addShapeBox(4.5F, -4.25F, -1.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F,
                0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[4].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[5].addBox(6.0F, -3.75F, -0.5F, 2, 1, 1, 0.0F);
        super.gunModel[5].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[6].addBox(0.2F, -2.5F, -1.0F, 3, 1, 2, 0.0F);
        super.gunModel[6].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[7].addBox(0.0F, -5.0F, -0.5F, 6, 1, 1, 0.0F);
        super.gunModel[7].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 0, 21, this.textureX, this.textureY);
        super.ammoModel[0].addShapeBox(-3.8F, -3.0F, -0.5F, 2, 5, 1, 0.0F, 0.25F, 0.0F, 0.2F, -0.25F, 0.0F, 0.2F,
                -0.25F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F,
                0.0F, 0.2F);
        super.ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.slideModel = new ModelRendererTurbo[1];
        super.slideModel[0] = new ModelRendererTurbo(this, 6, 21, this.textureX, this.textureY);
        super.slideModel[0].addShapeBox(2.5F, -4.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F,
                0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F,
                0.25F);
        super.slideModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.barrelAttachPoint = new Vector3f(0.5625F, 0.203125F, 0.0F);
        super.stockAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
        super.scopeAttachPoint = new Vector3f(0.25F, 0.3125F, 0.0F);
        super.gripAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
        super.gunSlideDistance = 0.0F;
        super.animationType = EnumAnimationType.PISTOL_CLIP;
        this.translateAll(1.0F, 0.0F, 0.0F);
        this.flipAll();
    }
}
