package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelM3A1GreaseGun extends ModelGun {

    int textureX = 512;
    int textureY = 512;

    public ModelM3A1GreaseGun() {
        super.gunModel = new ModelRendererTurbo[9];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 300, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 290, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 280, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 270, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 0, 260, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 0, 250, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 15, 250, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 0, 240, this.textureX, this.textureY);
        super.gunModel[8] = new ModelRendererTurbo(this, 0, 230, this.textureX, this.textureY);
        super.gunModel[0].addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        super.gunModel[0].setRotationPoint(0.0F, -4.0F, -1.0F);
        super.gunModel[0].rotateAngleZ = -0.1919862F;
        super.gunModel[1].addBox(0.0F, 0.0F, 0.0F, 13, 2, 2, 0.0F);
        super.gunModel[1].setRotationPoint(-1.0F, -5.0F, -1.0F);
        super.gunModel[2].addBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F);
        super.gunModel[2].setRotationPoint(12.0F, -4.5F, -0.5F);
        super.gunModel[3].addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
        super.gunModel[3].setRotationPoint(1.0F, -3.0F, -0.5F);
        super.gunModel[4].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.gunModel[4].setRotationPoint(4.0F, -2.5F, -0.5F);
        super.gunModel[5].addBox(0.0F, 0.0F, 0.0F, 5, 0, 1, 0.0F);
        super.gunModel[5].setRotationPoint(-6.0F, -3.5F, -0.5F);
        super.gunModel[6].addBox(0.0F, 0.0F, 0.0F, 0, 3, 1, 0.0F);
        super.gunModel[6].setRotationPoint(-5.9F, -4.0F, -0.5F);
        super.gunModel[6].rotateAngleZ = -0.1047198F;
        super.gunModel[7].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.gunModel[7].setRotationPoint(10.5F, -5.7F, -0.5F);
        super.gunModel[7].rotateAngleZ = 0.122173F;
        super.gunModel[8].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.gunModel[8].setRotationPoint(0.0F, -5.5F, -0.5F);
        super.ammoModel = new ModelRendererTurbo[2];
        super.ammoModel[0] = new ModelRendererTurbo(this, 10, 230, this.textureX, this.textureY);
        super.ammoModel[1] = new ModelRendererTurbo(this, 15, 230, this.textureX, this.textureY);
        super.ammoModel[0].addBox(8.0F, -3.0F, -0.5F, 1, 6, 1, 0.0F);
        super.ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.ammoModel[1].addBox(8.5F, -3.0F, -0.5F, 1, 6, 1, 0.0F);
        super.ammoModel[1].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunSlideDistance = 0.0F;
        super.animationType = EnumAnimationType.BOTTOM_CLIP;
        this.flipAll();
        this.translateAll(0.0F, 1.0F, 0.0F);
    }
}
