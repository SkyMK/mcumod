package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelM1carbine extends ModelGun {

    int textureX = 512;
    int textureY = 512;

    public ModelM1carbine() {
        super.gunModel = new ModelRendererTurbo[13];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 300, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 310, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 320, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 330, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 0, 350, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 0, 360, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 0, 370, this.textureX, this.textureY);
        super.gunModel[8] = new ModelRendererTurbo(this, 0, 380, this.textureX, this.textureY);
        super.gunModel[9] = new ModelRendererTurbo(this, 0, 390, this.textureX, this.textureY);
        super.gunModel[10] = new ModelRendererTurbo(this, 0, 395, this.textureX, this.textureY);
        super.gunModel[11] = new ModelRendererTurbo(this, 0, 400, this.textureX, this.textureY);
        super.gunModel[12] = new ModelRendererTurbo(this, 0, 410, this.textureX, this.textureY);
        super.gunModel[0].addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        super.gunModel[0].setRotationPoint(0.0F, -4.0F, -0.5F);
        super.gunModel[0].rotateAngleZ = -0.122173F;
        super.gunModel[1].addBox(0.0F, 0.0F, 0.0F, 14, 1, 2, 0.0F);
        super.gunModel[1].setRotationPoint(-2.0F, -4.5F, -1.0F);
        super.gunModel[2].addBox(0.0F, 0.0F, 0.0F, 7, 1, 2, 0.0F);
        super.gunModel[2].setRotationPoint(5.0F, -5.2F, -1.0F);
        super.gunModel[3].addBox(0.0F, 0.0F, 0.0F, 11, 1, 2, 0.0F);
        super.gunModel[3].setRotationPoint(0.0F, -4.0F, -1.0F);
        super.gunModel[4].addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        super.gunModel[4].setRotationPoint(10.5F, -3.9F, -1.0F);
        super.gunModel[4].rotateAngleZ = 0.5235988F;
        super.gunModel[5].addBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        super.gunModel[5].setRotationPoint(11.0F, -5.0F, -0.5F);
        super.gunModel[6].addBox(0.0F, 0.0F, 0.0F, 12, 1, 1, 0.0F);
        super.gunModel[6].setRotationPoint(0.0F, -5.0F, -0.5F);
        super.gunModel[7].addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        super.gunModel[7].setRotationPoint(0.5F, -3.0F, -0.5F);
        super.gunModel[8].addBox(0.0F, 0.0F, 0.0F, 5, 0, 1, 0.0F);
        super.gunModel[8].setRotationPoint(-7.0F, -4.5F, -0.5F);
        super.gunModel[8].rotateAngleZ = -0.03490658F;
        super.gunModel[9].addBox(0.0F, 0.0F, 0.0F, 7, 0, 1, 0.0F);
        super.gunModel[9].setRotationPoint(-7.0F, -2.5F, -0.5F);
        super.gunModel[9].rotateAngleZ = 0.05235988F;
        super.gunModel[10].addBox(0.0F, 0.0F, 0.0F, 0, 4, 1, 0.0F);
        super.gunModel[10].setRotationPoint(-7.0F, -5.0F, -0.5F);
        super.gunModel[11].addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        super.gunModel[11].setRotationPoint(-1.0F, -5.8F, -0.5F);
        super.gunModel[12].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.gunModel[12].setRotationPoint(17.0F, -6.0F, -0.5F);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 0, 420, this.textureX, this.textureY);
        super.ammoModel[0].addBox(4.5F, -3.0F, -0.5F, 2, 3, 1, 0.0F);
        super.ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunSlideDistance = 0.0F;
        super.animationType = EnumAnimationType.BOTTOM_CLIP;
        this.flipAll();
        this.translateAll(0.0F, 2.0F, 0.0F);
    }
}
