package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelMachete extends ModelGun {

    public ModelMachete() {
        byte textureX = 16;
        byte textureY = 16;
        super.gunModel = new ModelRendererTurbo[2];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addShapeBox(-1.0F, -2.0F, 0.0F, 2, 16, 0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[1] = new ModelRendererTurbo(this, 4, 0, textureX, textureY);
        super.gunModel[1].addBox(-1.0F, -8.0F, -0.5F, 2, 6, 1);

        for (int i = 0; i < 2; ++i) {
            super.gunModel[i].setRotationPoint(0.0F, 8.0F, 0.0F);
        }

    }
}
