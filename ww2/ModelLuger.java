package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelLuger extends ModelGun {

    int textureX = 512;
    int textureY = 512;

    public ModelLuger() {
        super.gunModel = new ModelRendererTurbo[5];
        super.gunModel[0] = new ModelRendererTurbo(this, 100, 145, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 100, 155, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 100, 175, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 116, 150, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 115, 140, this.textureX, this.textureY);
        super.gunModel[0].addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        super.gunModel[0].setRotationPoint(0.0F, -3.0F, -1.0F);
        super.gunModel[0].rotateAngleZ = -0.1919862F;
        super.gunModel[1].addBox(0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F);
        super.gunModel[1].setRotationPoint(-0.4F, -4.0F, -1.0F);
        super.gunModel[2].addBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F);
        super.gunModel[2].setRotationPoint(3.0F, -3.8F, -0.5F);
        super.gunModel[3].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.gunModel[3].setRotationPoint(6.8F, -4.2F, -0.5F);
        super.gunModel[4].addBox(0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F);
        super.gunModel[4].setRotationPoint(3.0F, -2.4F, -0.5F);
        super.gunModel[4].rotateAngleZ = -0.8552113F;
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 126, 150, this.textureX, this.textureY);
        super.ammoModel[0].addBox(0.0F, -3.0F, -0.5F, 1, 4, 1, 0.0F);
        super.ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.ammoModel[0].rotateAngleZ = -0.1919862F;
        super.slideModel = new ModelRendererTurbo[1];
        super.slideModel[0] = new ModelRendererTurbo(this, 100, 165, this.textureX, this.textureY);
        super.slideModel[0].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        super.slideModel[0].setRotationPoint(1.0F, -3.8F, -1.5F);
        super.gunSlideDistance = 0.1F;
        super.animationType = EnumAnimationType.PISTOL_CLIP;
        this.flipAll();
        this.translateAll(0.0F, 2.0F, 0.0F);
    }
}
