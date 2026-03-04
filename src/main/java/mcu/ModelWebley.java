package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelWebley extends ModelGun {

    int textureX = 256;
    int textureY = 128;

    public ModelWebley() {
        super.gunModel = new ModelRendererTurbo[9];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 11, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 26, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 37, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 83, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 0, 91, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 0, 97, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 0, 102, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 20, 19, this.textureX, this.textureY);
        super.gunModel[8] = new ModelRendererTurbo(this, 20, 27, this.textureX, this.textureY);
        super.gunModel[0].addBox(0.0F, 0.0F, 0.0F, 5, 9, 4, 0.0F);
        super.gunModel[0].setRotationPoint(0.0F, 2.0F, -2.0F);
        super.gunModel[1].addBox(0.0F, 0.0F, 0.0F, 5, 4, 4, 0.0F);
        super.gunModel[1].setRotationPoint(2.0F, -2.0F, -2.0F);
        super.gunModel[2].addBox(0.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
        super.gunModel[2].setRotationPoint(4.0F, -3.0F, -1.5F);
        super.gunModel[3].addBox(0.0F, 0.0F, 0.0F, 12, 3, 3, 0.0F);
        super.gunModel[3].setRotationPoint(4.0F, -6.0F, -1.5F);
        super.gunModel[4].addBox(-3.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        super.gunModel[4].setRotationPoint(7.0F, -6.0F, -0.5F);
        super.gunModel[4].rotateAngleZ = -0.1745329F;
        super.gunModel[5].addBox(0.0F, 0.0F, 0.0F, 7, 1, 2, 0.0F);
        super.gunModel[5].setRotationPoint(7.0F, 1.0F, -1.0F);
        super.gunModel[6].addBox(0.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        super.gunModel[6].setRotationPoint(14.0F, -3.0F, -1.5F);
        super.gunModel[7].addBox(0.0F, 0.0F, 0.0F, 12, 3, 3, 0.0F);
        super.gunModel[7].setRotationPoint(16.0F, -6.0F, -1.5F);
        super.gunModel[8].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.gunModel[8].setRotationPoint(25.0F, -7.0F, -0.5F);
        super.ammoModel = new ModelRendererTurbo[8];
        super.ammoModel[0] = new ModelRendererTurbo(this, 19, 32, this.textureX, this.textureY);
        super.ammoModel[1] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        super.ammoModel[2] = new ModelRendererTurbo(this, 19, 32, this.textureX, this.textureY);
        super.ammoModel[3] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        super.ammoModel[4] = new ModelRendererTurbo(this, 19, 32, this.textureX, this.textureY);
        super.ammoModel[5] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        super.ammoModel[6] = new ModelRendererTurbo(this, 19, 32, this.textureX, this.textureY);
        super.ammoModel[7] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        super.ammoModel[0].addBox(0.0F, 0.0F, 0.1F, 4, 2, 2, 0.0F);
        super.ammoModel[0].setRotationPoint(8.1F, -4.0F, -3.0F);
        super.ammoModel[1].addBox(0.0F, 0.0F, 0.1F, 2, 2, 2, 0.0F);
        super.ammoModel[1].setRotationPoint(11.9F, -4.0F, -3.0F);
        super.ammoModel[2].addBox(0.0F, 0.0F, 0.1F, 4, 2, 2, 0.0F);
        super.ammoModel[2].setRotationPoint(8.1F, -1.5F, -3.0F);
        super.ammoModel[3].addBox(0.0F, 0.0F, 0.1F, 2, 2, 2, 0.0F);
        super.ammoModel[3].setRotationPoint(11.9F, -1.5F, -3.0F);
        super.ammoModel[4].addBox(0.0F, 0.0F, 0.1F, 4, 2, 2, 0.0F);
        super.ammoModel[4].setRotationPoint(8.1F, -4.0F, 0.5F);
        super.ammoModel[5].addBox(0.0F, 0.0F, 0.1F, 2, 2, 2, 0.0F);
        super.ammoModel[5].setRotationPoint(11.9F, -4.0F, 0.5F);
        super.ammoModel[6].addBox(0.0F, 0.0F, 0.1F, 4, 2, 2, 0.0F);
        super.ammoModel[6].setRotationPoint(8.1F, -1.5F, 0.5F);
        super.ammoModel[7].addBox(0.0F, 0.0F, 0.1F, 2, 2, 2, 0.0F);
        super.ammoModel[7].setRotationPoint(11.9F, -1.5F, 0.5F);
        super.gunSlideDistance = 0.0F;
        super.animationType = EnumAnimationType.REVOLVER;
        this.flipAll();
        this.translateAll(0.0F, 13.0F, 0.0F);
    }
}
