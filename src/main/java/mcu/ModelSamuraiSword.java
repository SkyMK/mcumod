package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelSamuraiSword extends ModelGun {

    public ModelSamuraiSword() {
        byte textureX = 8;
        byte textureY = 32;
        super.gunModel = new ModelRendererTurbo[4];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addShapeBox(-1.0F, -2.0F, 0.0F, 2, 12, 0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 12, textureX, textureY);
        super.gunModel[1].addShapeBox(-1.0F, 10.0F, 0.0F, 2, 12, 0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, -2.0F, 0.0F, -1.5F, -2.0F, 0.0F, 1.0F, 0.0F,
                0.0F);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 29, textureX, textureY);
        super.gunModel[2].addBox(-1.0F, -3.0F, -1.0F, 2, 1, 2);
        super.gunModel[3] = new ModelRendererTurbo(this, 4, 0, textureX, textureY);
        super.gunModel[3].addBox(-0.5F, -11.0F, -0.5F, 1, 8, 1);

        for (int i = 0; i < 4; ++i) {
            super.gunModel[i].setRotationPoint(0.0F, 8.0F, 0.0F);
        }

    }
}
