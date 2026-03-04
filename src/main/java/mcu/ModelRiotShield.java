package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelRiotShield extends ModelGun {

    public ModelRiotShield() {
        byte textureX = 64;
        byte textureY = 64;
        super.gunModel = new ModelRendererTurbo[1];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addBox(4.0F, -20.0F, -8.0F, 1, 32, 16);
    }
}
