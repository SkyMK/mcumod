package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelSuperHeavyBoots extends ModelCustomArmour {

    public ModelSuperHeavyBoots() {
        short textureX = 128;
        byte textureY = 64;
        super.leftLegModel = new ModelRendererTurbo[1];
        super.leftLegModel[0] = new ModelRendererTurbo(this, 84, 0, textureX, textureY);
        super.leftLegModel[0].addBox(-2.1F, 9.0F, -3.0F, 5, 3, 6);
        super.rightLegModel = new ModelRendererTurbo[1];
        super.rightLegModel[0] = new ModelRendererTurbo(this, 84, 9, textureX, textureY);
        super.rightLegModel[0].addBox(-2.9F, 9.0F, -3.0F, 5, 3, 6);
    }
}
