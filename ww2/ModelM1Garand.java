package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelM1Garand extends ModelGun {

    int textureX = 512;
    int textureY = 512;

    public ModelM1Garand() {
        super.gunModel = new ModelRendererTurbo[16];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 17, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 49, 0, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 9, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 26, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 0, 34, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 0, 39, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 0, 53, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        super.gunModel[8] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        super.gunModel[9] = new ModelRendererTurbo(this, 0, 53, this.textureX, this.textureY);
        super.gunModel[10] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        super.gunModel[11] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        super.gunModel[12] = new ModelRendererTurbo(this, 0, 58, this.textureX, this.textureY);
        super.gunModel[13] = new ModelRendererTurbo(this, 0, 88, this.textureX, this.textureY);
        super.gunModel[14] = new ModelRendererTurbo(this, 0, 98, this.textureX, this.textureY);
        super.gunModel[15] = new ModelRendererTurbo(this, 0, 108, this.textureX, this.textureY);
        super.gunModel[0].addBox(0.0F, -1.0F, 0.0F, 20, 3, 3, 0.0F);
        super.gunModel[0].setRotationPoint(7.0F, 0.0F, -1.5F);
        super.gunModel[1].addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        super.gunModel[1].setRotationPoint(-5.0F, 1.5F, -1.0F);
        super.gunModel[1].rotateAngleZ = -0.6108652F;
        super.gunModel[2].addBox(0.0F, 0.0F, 0.0F, 7, 2, 3, 0.0F);
        super.gunModel[2].setRotationPoint(0.0F, 1.0F, -1.5F);
        super.gunModel[3].addBox(0.0F, -1.0F, 0.0F, 2, 3, 2, 0.0F);
        super.gunModel[3].setRotationPoint(27.0F, 0.0F, -1.0F);
        super.gunModel[4].addBox(0.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F);
        super.gunModel[4].setRotationPoint(29.0F, 0.5F, -0.5F);
        super.gunModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.gunModel[5].setRotationPoint(28.0F, -2.0F, -0.5F);
        super.gunModel[6].addBox(0.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F);
        super.gunModel[6].setRotationPoint(-2.0F, -1.0F, -1.0F);
        super.gunModel[7].addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        super.gunModel[7].setRotationPoint(0.0F, -2.0F, -1.5F);
        super.gunModel[8].addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        super.gunModel[8].setRotationPoint(0.0F, -2.0F, 0.5F);
        super.gunModel[9].addBox(0.0F, 0.0F, 0.0F, 7, 1, 2, 0.0F);
        super.gunModel[9].setRotationPoint(0.0F, 0.0F, -1.0F);
        super.gunModel[10].addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
        super.gunModel[10].setRotationPoint(1.0F, 0.0F, -1.5F);
        super.gunModel[11].addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
        super.gunModel[11].setRotationPoint(1.0F, 0.0F, 0.5F);
        super.gunModel[12].addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
        super.gunModel[12].setRotationPoint(-1.0F, 0.0F, -1.5F);
        super.gunModel[13].addBox(0.0F, 0.0F, 0.0F, 5, 3, 3, 0.0F);
        super.gunModel[13].setRotationPoint(-6.0F, 0.0F, -1.5F);
        super.gunModel[14].addBox(0.0F, 0.0F, 0.0F, 8, 4, 3, 0.0F);
        super.gunModel[14].setRotationPoint(-14.0F, 0.0F, -1.5F);
        super.gunModel[15].addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        super.gunModel[15].setRotationPoint(-2.0F, 3.0F, -0.5F);
        super.gunModel[15].rotateAngleZ = 0.1570796F;
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 29, 34, this.textureX, this.textureY);
        super.ammoModel[0].addBox(2.0F, 0.1F, -1.0F, 2, 2, 2, 0.0F);
        super.ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.slideModel = new ModelRendererTurbo[1];
        super.slideModel[0] = new ModelRendererTurbo(this, 0, 73, this.textureX, this.textureY);
        super.slideModel[0].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.slideModel[0].setRotationPoint(4.0F, -1.0F, -0.5F);
        super.gunSlideDistance = 0.2F;
        super.animationType = EnumAnimationType.TOP_CLIP;
        this.flipAll();
        this.translateAll(0.0F, 7.0F, 0.0F);
    }
}
