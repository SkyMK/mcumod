package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelSurgicalAxe extends ModelGun {

    public ModelSurgicalAxe() {
        byte textureX = 16;
        byte textureY = 16;
        super.gunModel = new ModelRendererTurbo[4];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addBox(-1.0F, -6.0F, -1.0F, 2, 6, 2);
        super.gunModel[1] = new ModelRendererTurbo(this, 8, 0, textureX, textureY);
        super.gunModel[1].addBox(-1.0F, 0.0F, -0.5F, 2, 6, 1);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
        super.gunModel[2].addShapeBox(1.0F, 2.0F, -0.5F, 4, 4, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F,
                0.0F, -0.5F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F,
                0.0F);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 13, textureX, textureY);
        super.gunModel[3].addShapeBox(-4.0F, 4.0F, -0.5F, 3, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F,
                -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -0.5F);

        for (int i = 0; i < 4; ++i) {
            super.gunModel[i].setRotationPoint(0.0F, 6.0F, 0.0F);
        }
    }
}
