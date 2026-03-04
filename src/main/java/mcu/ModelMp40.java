package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelMp40 extends ModelGun {

    int textureX = 512;
    int textureY = 512;

    public ModelMp40() {
        super.gunModel = new ModelRendererTurbo[10];
        super.gunModel[0] = new ModelRendererTurbo(this, 100, 150, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 113, 150, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 100, 175, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 100, 165, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 115, 165, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 150, 150, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 160, 150, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 160, 150, this.textureX, this.textureY);
        super.gunModel[8] = new ModelRendererTurbo(this, 160, 165, this.textureX, this.textureY);
        super.gunModel[9] = new ModelRendererTurbo(this, 150, 180, this.textureX, this.textureY);
        super.gunModel[0].addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        super.gunModel[0].setRotationPoint(-1.0F, -4.0F, -1.0F);
        super.gunModel[0].rotateAngleZ = -0.2268928F;
        super.gunModel[1].addBox(0.0F, 0.0F, 0.0F, 14, 3, 2, 0.0F);
        super.gunModel[1].setRotationPoint(-2.0F, -4.0F, -1.0F);
        super.gunModel[2].addBox(0.0F, 0.0F, 0.0F, 10, 2, 3, 0.0F);
        super.gunModel[2].setRotationPoint(0.0F, -2.6F, -1.5F);
        super.gunModel[3].addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        super.gunModel[3].setRotationPoint(11.1F, -2.8F, -1.0F);
        super.gunModel[3].rotateAngleZ = 0.4886922F;
        super.gunModel[4].addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        super.gunModel[4].setRotationPoint(12.0F, -4.0F, -1.0F);
        super.gunModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.gunModel[5].setRotationPoint(20.0F, -4.0F, -0.5F);
        super.gunModel[5].rotateAngleZ = 0.418879F;
        super.gunModel[6].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.gunModel[6].setRotationPoint(1.0F, -4.3F, 0.2F);
        super.gunModel[7].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.gunModel[7].setRotationPoint(1.0F, -4.3F, -1.2F);
        super.gunModel[8].addBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        super.gunModel[8].setRotationPoint(14.0F, -3.7F, -0.5F);
        super.gunModel[9].addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        super.gunModel[9].setRotationPoint(10.0F, -1.0F, -0.5F);
        super.gunModel[9].rotateAngleZ = 0.03490658F;
        super.ammoModel = new ModelRendererTurbo[2];
        super.ammoModel[0] = new ModelRendererTurbo(this, 135, 175, this.textureX, this.textureY);
        super.ammoModel[1] = new ModelRendererTurbo(this, 135, 175, this.textureX, this.textureY);
        super.ammoModel[0].addBox(10.3F, 0.0F, -0.5F, 1, 7, 1, 0.0F);
        super.ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.ammoModel[0].rotateAngleZ = 0.03490658F;
        super.ammoModel[1].addBox(10.8F, 0.0F, -0.5F, 1, 7, 1, 0.0F);
        super.ammoModel[1].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.ammoModel[1].rotateAngleZ = 0.03490658F;
        super.gunSlideDistance = 0.0F;
        super.animationType = EnumAnimationType.BOTTOM_CLIP;
        this.flipAll();
        this.translateAll(0.0F, 3.0F, 0.0F);
    }
}
