package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelSuperHeavyLegs extends ModelCustomArmour {

    public ModelSuperHeavyLegs() {
        byte textureX = 64;
        byte textureY = 32;
        super.leftLegModel = new ModelRendererTurbo[2];
        super.leftLegModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.leftLegModel[0].addBox(-2.1F, -1.0F, -2.5F, 5, 10, 5);
        super.leftLegModel[1] = new ModelRendererTurbo(this, 0, 15, textureX, textureY);
        super.leftLegModel[1].addBox(-1.0F, 3.0F, -3.5F, 3, 4, 1);
        super.rightLegModel = new ModelRendererTurbo[2];
        super.rightLegModel[0] = new ModelRendererTurbo(this, 20, 0, textureX, textureY);
        super.rightLegModel[0].addBox(-2.9F, -1.0F, -2.5F, 5, 10, 5);
        super.rightLegModel[1] = new ModelRendererTurbo(this, 8, 15, textureX, textureY);
        super.rightLegModel[1].addBox(-2.0F, 3.0F, -3.5F, 3, 4, 1);
    }
}
