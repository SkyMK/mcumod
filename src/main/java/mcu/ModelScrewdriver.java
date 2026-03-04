package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelScrewdriver extends ModelGun {

    public ModelScrewdriver() {
        byte textureX = 16;
        byte textureY = 8;
        super.gunModel = new ModelRendererTurbo[2];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addBox(-4.0F, -1.0F, -1.0F, 4, 2, 2);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
        super.gunModel[1].addBox(0.0F, -0.5F, -0.5F, 4, 1, 1);

        for (int i = 0; i < 2; ++i) {
            super.gunModel[i].setRotationPoint(0.0F, 12.0F, 0.0F);
        }

    }
}
