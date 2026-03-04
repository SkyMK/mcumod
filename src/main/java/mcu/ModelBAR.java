package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBAR extends ModelGun {

    int textureX = 512;
    int textureY = 512;

    public ModelBAR() {
        super.gunModel = new ModelRendererTurbo[12];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 300, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 310, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 325, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 325, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 0, 350, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 0, 380, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 30, 310, this.textureX, this.textureY);
        super.gunModel[8] = new ModelRendererTurbo(this, 30, 320, this.textureX, this.textureY);
        super.gunModel[9] = new ModelRendererTurbo(this, 36, 320, this.textureX, this.textureY);
        super.gunModel[10] = new ModelRendererTurbo(this, 30, 330, this.textureX, this.textureY);
        super.gunModel[11] = new ModelRendererTurbo(this, 35, 330, this.textureX, this.textureY);
        super.gunModel[0].addBox(0.0F, 0.0F, -0.5F, 22, 1, 1, 0.0F);
        super.gunModel[0].setRotationPoint(2.0F, -4.2F, 0.0F);
        super.gunModel[1].addBox(0.0F, 0.0F, 0.0F, 8, 2, 2, 0.0F);
        super.gunModel[1].setRotationPoint(4.0F, -3.5F, -1.0F);
        super.gunModel[2].addBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F);
        super.gunModel[2].setRotationPoint(12.0F, -3.2F, -1.0F);
        super.gunModel[3].addBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F);
        super.gunModel[3].setRotationPoint(15.0F, -3.2F, -1.0F);
        super.gunModel[4].addBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F);
        super.gunModel[4].setRotationPoint(10.0F, -3.1F, -0.5F);
        super.gunModel[5].addBox(0.0F, 0.0F, 0.0F, 6, 2, 1, 0.0F);
        super.gunModel[5].setRotationPoint(-1.5F, -2.9F, -0.5F);
        super.gunModel[5].rotateAngleZ = 0.2094395F;
        super.gunModel[6].addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
        super.gunModel[6].setRotationPoint(-5.0F, -3.0F, -0.5F);
        super.gunModel[7].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.gunModel[7].setRotationPoint(2.8F, -2.0F, -0.5F);
        super.gunModel[8].addBox(0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        super.gunModel[8].setRotationPoint(4.0F, -4.5F, 0.0F);
        super.gunModel[8].rotateAngleZ = 0.2268928F;
        super.gunModel[9].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.gunModel[9].setRotationPoint(21.0F, -5.0F, -0.5F);
        super.gunModel[10].addBox(0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F);
        super.gunModel[10].setRotationPoint(13.0F, -5.0F, -1.6F);
        super.gunModel[10].rotateAngleX = 0.3141593F;
        super.gunModel[10].rotateAngleY = 0.1919862F;
        super.gunModel[10].rotateAngleZ = -0.03490658F;
        super.gunModel[11].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.gunModel[11].setRotationPoint(11.2F, -5.5F, -2.1F);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 25, 340, this.textureX, this.textureY);
        super.ammoModel[0].addBox(6.0F, -2.0F, -0.5F, 3, 3, 1, 0.0F);
        super.ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.ammoModel[0].rotateAngleZ = 0.01745329F;
        super.slideModel = new ModelRendererTurbo[1];
        super.slideModel[0] = new ModelRendererTurbo(this, 30, 320, this.textureX, this.textureY);
        super.slideModel[0].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.slideModel[0].setRotationPoint(10.0F, -4.0F, 0.5F);
        super.gunSlideDistance = 0.4F;
        super.animationType = EnumAnimationType.BOTTOM_CLIP;
        this.flipAll();
        this.translateAll(0.0F, 1.0F, 0.0F);
    }
}
