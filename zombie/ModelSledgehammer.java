package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelSledgehammer extends ModelGun {

    public ModelSledgehammer() {
        byte textureX = 64;
        byte textureY = 32;
        super.gunModel = new ModelRendererTurbo[2];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addBox(-1.0F, -1.0F, -12.0F, 2, 2, 24);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[1].addBox(-4.0F, -2.0F, 12.0F, 8, 4, 4);

        for (int i = 0; i < 2; ++i) {
            super.gunModel[i].setRotationPoint(4.0F, 0.0F, 0.0F);
        }

    }
}
