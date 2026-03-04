package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelType14 extends ModelGun {

    int textureX = 512;
    int textureY = 512;

    public ModelType14() {
        super.gunModel = new ModelRendererTurbo[12];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 58, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 58, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 58, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 58, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 0, 73, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 0, 83, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 0, 285, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 0, 73, this.textureX, this.textureY);
        super.gunModel[8] = new ModelRendererTurbo(this, 0, 285, this.textureX, this.textureY);
        super.gunModel[9] = new ModelRendererTurbo(this, 0, 305, this.textureX, this.textureY);
        super.gunModel[10] = new ModelRendererTurbo(this, 0, 73, this.textureX, this.textureY);
        super.gunModel[11] = new ModelRendererTurbo(this, 0, 73, this.textureX, this.textureY);
        super.gunModel[0].addBox(0.0F, 0.0F, -0.3F, 1, 5, 1, 0.0F);
        super.gunModel[0].setRotationPoint(0.0F, -3.0F, 0.0F);
        super.gunModel[0].rotateAngleZ = -0.2617994F;
        super.gunModel[1].addBox(0.0F, 0.0F, -0.7F, 1, 5, 1, 0.0F);
        super.gunModel[1].setRotationPoint(0.0F, -3.0F, 0.0F);
        super.gunModel[1].rotateAngleZ = -0.2617994F;
        super.gunModel[2].addBox(0.3F, 0.0F, -0.3F, 1, 5, 1, 0.0F);
        super.gunModel[2].setRotationPoint(0.0F, -3.0F, 0.0F);
        super.gunModel[2].rotateAngleZ = -0.2617994F;
        super.gunModel[3].addBox(0.3F, 0.0F, -0.7F, 1, 5, 1, 0.0F);
        super.gunModel[3].setRotationPoint(0.0F, -3.0F, 0.0F);
        super.gunModel[3].rotateAngleZ = -0.2617994F;
        super.gunModel[4].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.gunModel[4].setRotationPoint(-1.2F, -3.0F, -0.6F);
        super.gunModel[5].addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        super.gunModel[5].setRotationPoint(0.3F, -2.0F, -0.5F);
        super.gunModel[6].addBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F);
        super.gunModel[6].setRotationPoint(0.5F, -3.3F, -0.5F);
        super.gunModel[7].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.gunModel[7].setRotationPoint(-1.2F, -3.5F, -0.4F);
        super.gunModel[8].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.gunModel[8].setRotationPoint(-1.0F, -2.5F, -0.5F);
        super.gunModel[9].addBox(0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F);
        super.gunModel[9].setRotationPoint(4.2F, -3.6F, 0.0F);
        super.gunModel[10].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.gunModel[10].setRotationPoint(-1.2F, -3.5F, -0.6F);
        super.gunModel[11].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.gunModel[11].setRotationPoint(-1.2F, -3.0F, -0.4F);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 0, 306, this.textureX, this.textureY);
        super.ammoModel[0].addBox(0.2F, 0.5F, -0.5F, 1, 4, 1, 0.0F);
        super.ammoModel[0].setRotationPoint(0.0F, -3.0F, 0.0F);
        super.ammoModel[0].rotateAngleZ = -0.2617994F;
        super.slideModel = new ModelRendererTurbo[1];
        super.slideModel[0] = new ModelRendererTurbo(this, 0, 295, this.textureX, this.textureY);
        super.slideModel[0].addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        super.slideModel[0].setRotationPoint(-1.5F, -3.3F, -0.5F);
        super.gunSlideDistance = 0.1F;
        super.animationType = EnumAnimationType.PISTOL_CLIP;
        this.flipAll();
    }
}
