package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelPanzerfaust extends ModelGun {

    public ModelPanzerfaust() {
        byte textureX = 64;
        byte textureY = 16;
        super.gunModel = new ModelRendererTurbo[4];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addBox(-10.0F, 2.0F, -0.5F, 20, 1, 1);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[1].addBox(7.0F, 3.0F, -0.5F, 1, 3, 1);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[2].addTrapezoid(10.0F, 1.0F, -1.5F, 3, 3, 3, 0.0F, -1.0F, 3);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[3].addTrapezoid(13.0F, 1.0F, -1.5F, 1, 3, 3, 0.0F, -0.5F, 2);
    }
}
