package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelPanzerschreck extends ModelGun {

    int textureX = 512;
    int textureY = 512;

    public ModelPanzerschreck() {
        super.gunModel = new ModelRendererTurbo[8];
        super.gunModel[0] = new ModelRendererTurbo(this, 76, 0, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 86, 17, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 51, 34, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 35, 35, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 35, 35, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 35, 35, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 35, 35, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 35, 35, this.textureX, this.textureY);
        super.gunModel[0].addBox(0.0F, 0.0F, 0.0F, 26, 3, 3, 0.0F);
        super.gunModel[0].setRotationPoint(-18.0F, -4.5F, -1.5F);
        super.gunModel[1].addBox(0.0F, 0.0F, 0.0F, 0, 9, 11, 0.0F);
        super.gunModel[1].setRotationPoint(3.0F, -7.0F, -3.0F);
        super.gunModel[1].rotateAngleY = 0.01745329F;
        super.gunModel[2].addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        super.gunModel[2].setRotationPoint(0.8F, -2.2F, -0.5F);
        super.gunModel[3].addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
        super.gunModel[3].setRotationPoint(-18.5F, -4.0F, -1.0F);
        super.gunModel[4].addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        super.gunModel[4].setRotationPoint(-19.0F, -5.0F, 1.0F);
        super.gunModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        super.gunModel[5].setRotationPoint(-19.0F, -5.0F, -2.0F);
        super.gunModel[6].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        super.gunModel[6].setRotationPoint(-19.0F, -2.0F, -2.0F);
        super.gunModel[7].addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        super.gunModel[7].setRotationPoint(-19.0F, -4.0F, -2.0F);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        super.ammoModel[0].addBox(-18.0F, -4.0F, -1.0F, 7, 2, 2, 0.0F);
        super.ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunSlideDistance = 0.0F;
        super.animationType = EnumAnimationType.RIFLE;
        this.flipAll();
        this.translateAll(0.0F, 2.0F, 4.0F);
    }
}
