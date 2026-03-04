package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelAT4 extends ModelGun {

    int textureX = 256;
    int textureY = 32;

    public ModelAT4() {
        super.gunModel = new ModelRendererTurbo[8];
        super.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
        super.gunModel[0].addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        super.gunModel[0].setRotationPoint(-1.0F, -3.0F, -0.5F);
        super.gunModel[1].addBox(0.0F, 0.0F, 0.0F, 18, 3, 3, 0.0F);
        super.gunModel[1].setRotationPoint(-15.0F, -6.0F, -1.5F);
        super.gunModel[2].addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        super.gunModel[2].setRotationPoint(2.5F, -6.5F, -2.0F);
        super.gunModel[3].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        super.gunModel[3].setRotationPoint(1.0F, -5.0F, 1.0F);
        super.gunModel[4].addBox(0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F);
        super.gunModel[4].setRotationPoint(1.0F, -6.0F, 4.0F);
        super.gunModel[4].rotateAngleY = -0.1745329F;
        super.gunModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
        super.gunModel[5].setRotationPoint(-16.1F, -6.0F, -1.5F);
        super.gunModel[6].addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        super.gunModel[6].setRotationPoint(-17.2F, -6.5F, -2.0F);
        super.gunModel[7].addBox(0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F);
        super.gunModel[7].setRotationPoint(-18.0F, -5.5F, -1.0F);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
        super.ammoModel[0].addBox(0.0F, 0.0F, 0.0F, 5, 2, 2, 0.0F);
        super.ammoModel[0].setRotationPoint(-3.0F, -5.5F, -1.0F);
        super.gunSlideDistance = 0.0F;
        super.animationType = EnumAnimationType.NONE;
        this.flipAll();
        this.translateAll(0.0F, 0.0F, 3.0F);
    }
}
