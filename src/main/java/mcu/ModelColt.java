package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelColt extends ModelGun {

    int textureX = 512;
    int textureY = 512;

    public ModelColt() {
        super.gunModel = new ModelRendererTurbo[12];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 350, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 330, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 320, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 310, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 0, 300, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 0, 290, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 0, 280, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 0, 270, this.textureX, this.textureY);
        super.gunModel[8] = new ModelRendererTurbo(this, 0, 260, this.textureX, this.textureY);
        super.gunModel[9] = new ModelRendererTurbo(this, 0, 250, this.textureX, this.textureY);
        super.gunModel[10] = new ModelRendererTurbo(this, 0, 240, this.textureX, this.textureY);
        super.gunModel[11] = new ModelRendererTurbo(this, 0, 215, this.textureX, this.textureY);
        super.gunModel[0].addBox(0.0F, 0.0F, 0.0F, 5, 2, 3, 0.0F);
        super.gunModel[0].setRotationPoint(1.0F, -5.5F, -1.5F);
        super.gunModel[1].addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        super.gunModel[1].setRotationPoint(6.0F, -5.5F, -1.5F);
        super.gunModel[2].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.gunModel[2].setRotationPoint(7.8F, -5.5F, -0.5F);
        super.gunModel[3].addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        super.gunModel[3].setRotationPoint(8.0F, -5.0F, -0.5F);
        super.gunModel[4].addBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
        super.gunModel[4].setRotationPoint(0.0F, -5.0F, -1.0F);
        super.gunModel[4].rotateAngleZ = -0.1047198F;
        super.gunModel[5].addBox(0.0F, 0.0F, 0.0F, 2, 6, 1, 0.0F);
        super.gunModel[5].setRotationPoint(0.5F, -5.0F, 0.5F);
        super.gunModel[5].rotateAngleZ = -0.1047198F;
        super.gunModel[6].addBox(0.0F, 0.0F, 0.0F, 2, 6, 1, 0.0F);
        super.gunModel[6].setRotationPoint(0.5F, -5.0F, -1.5F);
        super.gunModel[6].rotateAngleZ = -0.1047198F;
        super.gunModel[7].addBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
        super.gunModel[7].setRotationPoint(1.0F, -4.9F, -1.0F);
        super.gunModel[7].rotateAngleZ = -0.1047198F;
        super.gunModel[8].addBox(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F);
        super.gunModel[8].setRotationPoint(1.0F, -4.0F, -0.5F);
        super.gunModel[9].addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        super.gunModel[9].setRotationPoint(-1.0F, -4.6F, -1.0F);
        super.gunModel[9].rotateAngleZ = 0.418879F;
        super.gunModel[10].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.gunModel[10].setRotationPoint(-0.5F, -6.0F, -0.5F);
        super.gunModel[10].rotateAngleZ = -0.3141593F;
        super.gunModel[11].addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        super.gunModel[11].setRotationPoint(2.3F, -3.5F, -0.5F);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 10, 215, this.textureX, this.textureY);
        super.ammoModel[0].addBox(0.0F, -3.7F, -0.5F, 2, 5, 1, 0.0F);
        super.ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.ammoModel[0].rotateAngleZ = -0.1047198F;
        super.slideModel = new ModelRendererTurbo[4];
        super.slideModel[0] = new ModelRendererTurbo(this, 0, 220, this.textureX, this.textureY);
        super.slideModel[1] = new ModelRendererTurbo(this, 0, 225, this.textureX, this.textureY);
        super.slideModel[2] = new ModelRendererTurbo(this, 0, 230, this.textureX, this.textureY);
        super.slideModel[3] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        super.slideModel[0].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.slideModel[0].setRotationPoint(9.0F, -6.5F, -0.5F);
        super.slideModel[1].addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        super.slideModel[1].setRotationPoint(0.5F, -6.5F, 0.5F);
        super.slideModel[2].addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        super.slideModel[2].setRotationPoint(0.5F, -6.5F, -1.5F);
        super.slideModel[3].addBox(0.0F, 0.0F, 0.0F, 10, 2, 2, 0.0F);
        super.slideModel[3].setRotationPoint(0.0F, -6.0F, -1.0F);
        super.gunSlideDistance = 0.2F;
        super.animationType = EnumAnimationType.PISTOL_CLIP;
        this.flipAll();
        this.translateAll(0.0F, 2.5F, 0.0F);
    }
}
