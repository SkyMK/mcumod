package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelMp44 extends ModelGun {

    int textureX = 64;
    int textureY = 64;

    public ModelMp44() {
        super.gunModel = new ModelRendererTurbo[20];
        super.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 41, 9, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        super.gunModel[8] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
        super.gunModel[9] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
        super.gunModel[10] = new ModelRendererTurbo(this, 9, 25, this.textureX, this.textureY);
        super.gunModel[11] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
        super.gunModel[12] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
        super.gunModel[13] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
        super.gunModel[14] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
        super.gunModel[15] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        super.gunModel[16] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        super.gunModel[17] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        super.gunModel[18] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        super.gunModel[19] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        super.gunModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
        super.gunModel[0].setRotationPoint(0.0F, -4.0F, -0.5F);
        super.gunModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
        super.gunModel[1].setRotationPoint(0.0F, -2.5F, -0.5F);
        super.gunModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[2].setRotationPoint(0.0F, -2.0F, -0.5F);
        super.gunModel[2].rotateAngleZ = -0.29670596F;
        super.gunModel[3].addBox(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F);
        super.gunModel[3].setRotationPoint(7.0F, -2.8F, -0.5F);
        super.gunModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.05F, 0.2F, 0.0F, -0.05F,
                0.2F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.2F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.gunModel[4].setRotationPoint(-2.9F, -3.45F, -0.5F);
        super.gunModel[4].rotateAngleZ = 0.17453294F;
        super.gunModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F);
        super.gunModel[5].setRotationPoint(0.0F, -2.0F, -0.5F);
        super.gunModel[6].addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        super.gunModel[6].setRotationPoint(-1.0F, -4.0F, -0.5F);
        super.gunModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F,
                -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F,
                -0.3F);
        super.gunModel[7].setRotationPoint(14.5F, -4.7F, -0.5F);
        super.gunModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F,
                -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[8].setRotationPoint(4.5F, -5.0F, -0.5F);
        super.gunModel[9].addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
        super.gunModel[9].setRotationPoint(0.0F, -3.5F, -0.5F);
        super.gunModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F,
                0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F,
                -0.3F);
        super.gunModel[10].setRotationPoint(11.0F, -3.5F, -0.5F);
        super.gunModel[11].addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
        super.gunModel[11].setRotationPoint(7.0F, -3.8F, -0.5F);
        super.gunModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.2F, 0.4F, 0.0F, -0.2F, 0.4F,
                0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.4F, 0.0F, -0.2F, 0.4F, 0.0F, -0.2F, 0.0F, 0.0F,
                -0.2F);
        super.gunModel[12].setRotationPoint(0.4F, -1.0F, -0.5F);
        super.gunModel[13].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.2F, 0.6F, 0.0F, -0.2F, 0.6F,
                0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, -0.3F, -0.2F, 0.6F, -0.5F, -0.2F, 0.6F, -0.5F, -0.2F, 0.0F, -0.3F,
                -0.2F);
        super.gunModel[13].setRotationPoint(1.8F, -1.0F, -0.5F);
        super.gunModel[14].addShapeBox(0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, 3.0F, 0.3F, 0.0F, -0.95F, -0.3F, 0.0F, -0.95F,
                -0.3F, 0.0F, 3.0F, 0.3F, 0.0F, 3.0F, 0.5F, 0.0F, -0.95F, 0.0F, 0.0F, -0.95F, 0.0F, 0.0F, 3.0F, 0.5F,
                0.0F);
        super.gunModel[14].setRotationPoint(-4.9F, -3.1F, -0.5F);
        super.gunModel[14].rotateAngleZ = 0.17453294F;
        super.gunModel[15].addShapeBox(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -1.0F, 0.0F,
                0.0F);
        super.gunModel[15].setRotationPoint(-0.5F, -2.5F, -0.5F);
        super.gunModel[16].addShapeBox(0.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F,
                -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F,
                -0.2F, -0.4F);
        super.gunModel[16].setRotationPoint(14.5F, -3.75F, 1.5F);
        super.gunModel[16].rotateAngleX = 1.5707964F;
        super.gunModel[17].addShapeBox(0.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F,
                -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F,
                -0.1F, -0.4F);
        super.gunModel[17].setRotationPoint(14.5F, -3.1F, -0.77F);
        super.gunModel[18].addShapeBox(0.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F,
                -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F,
                -0.2F, -0.4F);
        super.gunModel[18].setRotationPoint(14.5F, -4.5F, 1.5F);
        super.gunModel[18].rotateAngleX = 1.5707964F;
        super.gunModel[19].addShapeBox(0.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F,
                -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F,
                -0.1F, -0.4F);
        super.gunModel[19].setRotationPoint(14.5F, -3.1F, -0.23F);
        super.ammoModel = new ModelRendererTurbo[3];
        super.ammoModel[0] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
        super.ammoModel[1] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
        super.ammoModel[2] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        super.ammoModel[0].addShapeBox(3.0F, 4.7F, -0.5F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F,
                -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.ammoModel[0].setRotationPoint(-0.48F, -3.15F, 0.0F);
        super.ammoModel[0].rotateAngleZ = 0.20943952F;
        super.ammoModel[1].addShapeBox(3.0F, 2.0F, -0.5F, 2, 3, 1, 0.0F, 0.0F, -0.66F, 0.0F, 0.0F, -0.77F, 0.0F, 0.0F,
                -0.77F, 0.0F, 0.0F, -0.66F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.ammoModel[1].setRotationPoint(0.18F, -4.0F, 0.0F);
        super.ammoModel[1].rotateAngleZ = 0.05235988F;
        super.ammoModel[2].addShapeBox(2.87F, 4.45F, -0.5F, 2, 2, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F,
                -0.4F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.ammoModel[2].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.ammoModel[2].rotateAngleZ = 0.27925268F;
        super.slideModel = new ModelRendererTurbo[1];
        super.slideModel[0] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
        super.slideModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F,
                -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F,
                -0.2F, 0.0F);
        super.slideModel[0].setRotationPoint(5.0F, -3.8F, -1.0F);
        super.barrelAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
        super.stockAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
        super.scopeAttachPoint = new Vector3f(0.0F, 0.3125F, 0.0F);
        super.gripAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
        super.gunSlideDistance = 0.25F;
        super.animationType = EnumAnimationType.PISTOL_CLIP;
        this.translateAll(0.0F, -2.0F, 0.0F);
        this.flipAll();
    }
}
