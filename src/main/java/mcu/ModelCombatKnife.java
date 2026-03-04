package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCombatKnife extends ModelGun {

    public ModelCombatKnife() {
        byte textureX = 16;
        byte textureY = 8;
        super.gunModel = new ModelRendererTurbo[3];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addBox(-4.0F, -1.0F, -0.7F, 3.0F, 2.0F, 1.4F);
        super.gunModel[1] = new ModelRendererTurbo(this, 10, 0, textureX, textureY);
        super.gunModel[1].addBox(-1.0F, -1.5F, -1.0F, 1, 3, 2);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 5, textureX, textureY);
        super.gunModel[2].addShapeBox(0.0F, -1.0F, -0.5F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);

        for (int i = 0; i < 3; ++i) {
            super.gunModel[i].setRotationPoint(4.0F, 0.0F, 0.0F);
        }

    }
}
