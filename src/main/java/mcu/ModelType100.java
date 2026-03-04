package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelType100 extends ModelGun {

    int textureX = 512;
    int textureY = 512;

    public ModelType100() {
        super.gunModel = new ModelRendererTurbo[13];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 220, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 230, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 230, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 240, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 0, 250, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 0, 260, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 0, 275, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 0, 285, this.textureX, this.textureY);
        super.gunModel[8] = new ModelRendererTurbo(this, 0, 300, this.textureX, this.textureY);
        super.gunModel[9] = new ModelRendererTurbo(this, 0, 300, this.textureX, this.textureY);
        super.gunModel[10] = new ModelRendererTurbo(this, 30, 250, this.textureX, this.textureY);
        super.gunModel[11] = new ModelRendererTurbo(this, 80, 250, this.textureX, this.textureY);
        super.gunModel[12] = new ModelRendererTurbo(this, 120, 250, this.textureX, this.textureY);
        super.gunModel[0].addBox(0.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F);
        super.gunModel[0].setRotationPoint(-1.3F, -1.0F, -1.0F);
        super.gunModel[0].rotateAngleZ = 0.6632251F;
        super.gunModel[1].addBox(0.0F, 0.0F, 0.0F, 12, 2, 2, 0.0F);
        super.gunModel[1].setRotationPoint(1.0F, -3.0F, -0.5F);
        super.gunModel[2].addBox(0.0F, 0.0F, 0.0F, 12, 2, 2, 0.0F);
        super.gunModel[2].setRotationPoint(1.0F, -3.0F, -1.5F);
        super.gunModel[3].addBox(0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F);
        super.gunModel[3].setRotationPoint(-3.0F, -2.5F, -1.0F);
        super.gunModel[3].rotateAngleZ = -0.3569146F;
        super.gunModel[4].addBox(0.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F);
        super.gunModel[4].setRotationPoint(-9.0F, -2.5F, -1.0F);
        super.gunModel[5].addBox(0.0F, 0.0F, 0.0F, 7, 2, 2, 0.0F);
        super.gunModel[5].setRotationPoint(-9.0F, -0.5F, -1.0F);
        super.gunModel[5].rotateAngleZ = 0.2094395F;
        super.gunModel[6].addBox(0.0F, 0.0F, 0.0F, 22, 2, 2, 0.0F);
        super.gunModel[6].setRotationPoint(1.2F, -4.0F, -1.0F);
        super.gunModel[7].addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        super.gunModel[7].setRotationPoint(23.0F, -3.5F, -0.5F);
        super.gunModel[8].addBox(0.0F, 0.0F, 0.0F, 7, 1, 2, 0.0F);
        super.gunModel[8].setRotationPoint(15.5F, -2.0F, -0.8F);
        super.gunModel[9].addBox(0.0F, 0.0F, 0.0F, 7, 1, 2, 0.0F);
        super.gunModel[9].setRotationPoint(15.5F, -2.0F, -1.2F);
        super.gunModel[10].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.gunModel[10].setRotationPoint(11.0F, -4.0F, -2.0F);
        super.gunModel[11].addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        super.gunModel[11].setRotationPoint(2.5F, -1.0F, -0.5F);
        super.gunModel[12].addBox(0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
        super.gunModel[12].setRotationPoint(9.0F, -3.7F, 0.3F);
        super.ammoModel = new ModelRendererTurbo[3];
        super.ammoModel[0] = new ModelRendererTurbo(this, 0, 320, this.textureX, this.textureY);
        super.ammoModel[1] = new ModelRendererTurbo(this, 0, 330, this.textureX, this.textureY);
        super.ammoModel[2] = new ModelRendererTurbo(this, 0, 330, this.textureX, this.textureY);
        super.ammoModel[0].addBox(0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
        super.ammoModel[0].setRotationPoint(9.5F, -3.5F, 0.0F);
        super.ammoModel[1].addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        super.ammoModel[1].setRotationPoint(9.5F, -3.5F, 4.0F);
        super.ammoModel[1].rotateAngleY = -0.1745329F;
        super.ammoModel[2].addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        super.ammoModel[2].setRotationPoint(10.0F, -3.5F, 7.0F);
        super.ammoModel[2].rotateAngleY = -0.5235988F;
        super.gunSlideDistance = 0.0F;
        super.animationType = EnumAnimationType.SIDE_CLIP;
        this.flipAll();
    }
}
