package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelPPSH extends ModelGun {

    int textureX = 512;
    int textureY = 512;

    public ModelPPSH() {
        super.gunModel = new ModelRendererTurbo[10];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 310, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 300, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 290, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 280, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 0, 270, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 5, 300, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 0, 250, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 0, 240, this.textureX, this.textureY);
        super.gunModel[8] = new ModelRendererTurbo(this, 0, 235, this.textureX, this.textureY);
        super.gunModel[9] = new ModelRendererTurbo(this, 0, 230, this.textureX, this.textureY);
        super.gunModel[0].addBox(0.0F, 0.0F, 0.0F, 20, 1, 1, 0.0F);
        super.gunModel[0].setRotationPoint(0.0F, -6.0F, -0.5F);
        super.gunModel[1].addBox(0.0F, 0.0F, 0.0F, 11, 2, 2, 0.0F);
        super.gunModel[1].setRotationPoint(0.0F, -5.5F, -1.0F);
        super.gunModel[2].addBox(0.0F, 0.0F, 0.0F, 7, 2, 1, 0.0F);
        super.gunModel[2].setRotationPoint(-5.0F, -4.0F, -0.5F);
        super.gunModel[2].rotateAngleZ = 0.2094395F;
        super.gunModel[3].addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
        super.gunModel[3].setRotationPoint(-8.0F, -4.0F, -0.5F);
        super.gunModel[4].addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        super.gunModel[4].setRotationPoint(-9.0F, -4.0F, -0.5F);
        super.gunModel[5].addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        super.gunModel[5].setRotationPoint(7.3F, -5.0F, -1.5F);
        super.gunModel[6].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.gunModel[6].setRotationPoint(-2.0F, -2.6F, -0.5F);
        super.gunModel[6].rotateAngleZ = 0.6632251F;
        super.gunModel[7].addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        super.gunModel[7].setRotationPoint(1.0F, -3.5F, -0.5F);
        super.gunModel[8].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.gunModel[8].setRotationPoint(0.0F, -5.9F, -0.5F);
        super.gunModel[8].rotateAngleZ = 0.6981317F;
        super.gunModel[9].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.gunModel[9].setRotationPoint(18.0F, -6.9F, -0.5F);
        super.gunModel[9].rotateAngleZ = 0.06981317F;
        super.ammoModel = new ModelRendererTurbo[5];
        super.ammoModel[0] = new ModelRendererTurbo(this, 0, 260, this.textureX, this.textureY);
        super.ammoModel[1] = new ModelRendererTurbo(this, 0, 220, this.textureX, this.textureY);
        super.ammoModel[2] = new ModelRendererTurbo(this, 0, 215, this.textureX, this.textureY);
        super.ammoModel[3] = new ModelRendererTurbo(this, 10, 215, this.textureX, this.textureY);
        super.ammoModel[4] = new ModelRendererTurbo(this, 10, 220, this.textureX, this.textureY);
        super.ammoModel[0].addBox(8.0F, -4.0F, -2.0F, 1, 4, 4, 0.0F);
        super.ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.ammoModel[0].rotateAngleZ = 0.05235988F;
        super.ammoModel[1].addBox(8.0F, -4.5F, -1.0F, 1, 1, 2, 0.0F);
        super.ammoModel[1].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.ammoModel[1].rotateAngleZ = 0.05235988F;
        super.ammoModel[2].addBox(8.0F, -0.5F, -1.0F, 1, 1, 2, 0.0F);
        super.ammoModel[2].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.ammoModel[2].rotateAngleZ = 0.05235988F;
        super.ammoModel[3].addBox(8.0F, -3.0F, 1.5F, 1, 2, 1, 0.0F);
        super.ammoModel[3].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.ammoModel[3].rotateAngleZ = 0.05235988F;
        super.ammoModel[4].addBox(8.0F, -3.0F, -2.5F, 1, 2, 1, 0.0F);
        super.ammoModel[4].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.ammoModel[4].rotateAngleZ = 0.05235988F;
        super.gunSlideDistance = 0.0F;
        super.animationType = EnumAnimationType.BOTTOM_CLIP;
        this.flipAll();
        this.translateAll(0.0F, -0.8F, 0.0F);
    }
}
