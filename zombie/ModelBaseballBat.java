package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBaseballBat extends ModelGun {

    public ModelBaseballBat() {
        byte textureX = 16;
        byte textureY = 32;
        super.gunModel = new ModelRendererTurbo[2];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addShapeBox(-1.0F, -2.0F, -1.0F, 2, 24, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 27, textureX, textureY);
        super.gunModel[1].addBox(-1.5F, -4.0F, -1.5F, 3, 2, 3);

        for (int i = 0; i < 2; ++i) {
            super.gunModel[i].setRotationPoint(0.0F, 0.0F, 0.0F);
        }

    }
}
