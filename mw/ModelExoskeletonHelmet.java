package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelExoskeletonHelmet extends ModelCustomArmour {

    public ModelExoskeletonHelmet() {
        short textureX = 512;
        short textureY = 512;
        super.headModel = new ModelRendererTurbo[10];
        super.headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY);
        super.headModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY);
        super.headModel[2] = new ModelRendererTurbo(this, 233, 1, textureX, textureY);
        super.headModel[3] = new ModelRendererTurbo(this, 345, 9, textureX, textureY);
        super.headModel[4] = new ModelRendererTurbo(this, 1, 41, textureX, textureY);
        super.headModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY);
        super.headModel[6] = new ModelRendererTurbo(this, 17, 1, textureX, textureY);
        super.headModel[7] = new ModelRendererTurbo(this, 345, 1, textureX, textureY);
        super.headModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY);
        super.headModel[9] = new ModelRendererTurbo(this, 129, 1, textureX, textureY);
        float y = 64.0F;
        super.headModel[0].addShapeBox(-15.0F, -106.0F + y, -15.9F, 30, 2, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F,
                1.0F);
        super.headModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.headModel[1].addShapeBox(-17.0F, -104.0F + y, -16.9F, 34, 2, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F,
                1.0F);
        super.headModel[1].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.headModel[2].addShapeBox(-18.0F, -102.0F + y, -18.0F, 36, 3, 37, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F,
                1.0F);
        super.headModel[2].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.headModel[3].addShapeBox(-19.0F, -99.0F + y, -15.0F, 38, 4, 35, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.headModel[3].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.headModel[4].addShapeBox(-19.0F, -95.0F + y, -9.0F, 38, 6, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.headModel[4].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.headModel[5].addShapeBox(-18.0F, -89.0F + y, -9.0F, 2, 16, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.headModel[5].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.headModel[6].addShapeBox(17.0F, -89.0F + y, -9.0F, 2, 16, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.headModel[6].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.headModel[7].addShapeBox(-18.0F, -74.0F + y, -12.0F, 37, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.headModel[7].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.headModel[8].addShapeBox(16.0F, -90.0F + y, 5.0F, 4, 7, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.headModel[8].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.headModel[9].addShapeBox(-20.0F, -90.0F + y, 5.0F, 4, 7, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.headModel[9].setRotationPoint(0.0F, 0.0F, 0.0F);
    }
}
