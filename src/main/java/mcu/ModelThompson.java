package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelThompson extends ModelGun {

    int textureX = 512;
    int textureY = 512;

    public ModelThompson() {
        super.gunModel = new ModelRendererTurbo[12];
        super.gunModel[0] = new ModelRendererTurbo(this, 42, 0, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 53, 0, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 12, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 19, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 25, 15, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 25, 19, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 25, 23, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 25, 27, this.textureX, this.textureY);
        super.gunModel[8] = new ModelRendererTurbo(this, 25, 31, this.textureX, this.textureY);
        super.gunModel[9] = new ModelRendererTurbo(this, 25, 35, this.textureX, this.textureY);
        super.gunModel[10] = new ModelRendererTurbo(this, 15, 24, this.textureX, this.textureY);
        super.gunModel[11] = new ModelRendererTurbo(this, 15, 28, this.textureX, this.textureY);
        super.gunModel[0].addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        super.gunModel[0].setRotationPoint(1.0F, -2.1F, -0.5F);
        super.gunModel[0].rotateAngleZ = -0.06981317F;
        super.gunModel[1].addBox(0.0F, 0.0F, 0.0F, 16, 1, 1, 0.0F);
        super.gunModel[1].setRotationPoint(-1.0F, -4.0F, -0.5F);
        super.gunModel[2].addBox(0.0F, 0.0F, 0.0F, 6, 1, 2, 0.0F);
        super.gunModel[2].setRotationPoint(7.0F, -3.5F, -1.0F);
        super.gunModel[3].addBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F);
        super.gunModel[3].setRotationPoint(0.7F, -3.0F, -0.5F);
        super.gunModel[4].addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
        super.gunModel[4].setRotationPoint(-3.5F, -3.0F, -0.5F);
        super.gunModel[5].addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
        super.gunModel[5].setRotationPoint(-6.0F, -3.0F, -0.5F);
        super.gunModel[6].addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        super.gunModel[6].setRotationPoint(-3.0F, -2.5F, -0.5F);
        super.gunModel[6].rotateAngleZ = 0.2792527F;
        super.gunModel[7].addBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F);
        super.gunModel[7].setRotationPoint(-7.0F, -1.0F, -0.5F);
        super.gunModel[7].rotateAngleZ = 0.3490658F;
        super.gunModel[8].addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        super.gunModel[8].setRotationPoint(-6.0F, -2.0F, -0.5F);
        super.gunModel[9].addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        super.gunModel[9].setRotationPoint(-7.0F, -3.0F, -0.5F);
        super.gunModel[10].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.gunModel[10].setRotationPoint(13.8F, -4.6F, -0.5F);
        super.gunModel[11].addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        super.gunModel[11].setRotationPoint(1.0F, -4.5F, -0.5F);
        super.gunModel[11].rotateAngleZ = -0.06981317F;
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 8, 25, this.textureX, this.textureY);
        super.ammoModel[0].addBox(5.7F, -3.0F, -0.5F, 1, 5, 1, 0.0F);
        super.ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunSlideDistance = 0.0F;
        super.animationType = EnumAnimationType.BOTTOM_CLIP;
        this.flipAll();
        this.translateAll(0.0F, 1.0F, 0.0F);
    }
}
