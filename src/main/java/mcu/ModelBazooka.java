package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBazooka extends ModelGun {

    int textureX = 512;
    int textureY = 512;

    public ModelBazooka() {
        super.gunModel = new ModelRendererTurbo[10];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 300, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 290, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 280, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 270, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 0, 260, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 0, 250, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 0, 240, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 0, 230, this.textureX, this.textureY);
        super.gunModel[8] = new ModelRendererTurbo(this, 0, 220, this.textureX, this.textureY);
        super.gunModel[9] = new ModelRendererTurbo(this, 0, 320, this.textureX, this.textureY);
        super.gunModel[0].addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        super.gunModel[0].setRotationPoint(0.0F, -4.0F, -0.5F);
        super.gunModel[0].rotateAngleZ = -0.1919862F;
        super.gunModel[1].addBox(0.0F, 0.0F, 0.0F, 32, 2, 2, 0.0F);
        super.gunModel[1].setRotationPoint(-20.0F, -4.5F, -1.0F);
        super.gunModel[2].addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
        super.gunModel[2].setRotationPoint(-15.0F, -4.5F, -1.5F);
        super.gunModel[2].rotateAngleX = 0.6108652F;
        super.gunModel[3].addBox(0.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F);
        super.gunModel[3].setRotationPoint(-10.0F, -4.7F, -1.2F);
        super.gunModel[4].addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
        super.gunModel[4].setRotationPoint(-21.0F, -5.0F, -1.5F);
        super.gunModel[5].addBox(0.0F, 0.0F, 0.0F, 5, 2, 1, 0.0F);
        super.gunModel[5].setRotationPoint(-9.0F, -3.0F, -0.5F);
        super.gunModel[6].addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
        super.gunModel[6].setRotationPoint(-9.0F, -1.0F, -0.5F);
        super.gunModel[7].addBox(0.0F, 0.0F, 0.0F, 0, 3, 3, 0.0F);
        super.gunModel[7].setRotationPoint(9.0F, -5.0F, 1.0F);
        super.gunModel[8].addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        super.gunModel[8].setRotationPoint(7.0F, -3.5F, -0.5F);
        super.gunModel[9].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.gunModel[9].setRotationPoint(0.5F, -2.5F, -0.5F);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 0, 320, this.textureX, this.textureY);
        super.ammoModel[0].addBox(-20.0F, -4.0F, -0.5F, 5, 1, 1, 0.0F);
        super.ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunSlideDistance = 0.0F;
        super.animationType = EnumAnimationType.RIFLE;
        this.flipAll();
        this.translateAll(0.0F, 0.0F, 2.0F);
    }
}
