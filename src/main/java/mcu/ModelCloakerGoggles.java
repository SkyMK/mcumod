package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCloakerGoggles extends ModelCustomArmour {

    public ModelCloakerGoggles() {
        byte textureX = 64;
        byte textureY = 32;
        super.headModel = new ModelRendererTurbo[4];
        super.headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.headModel[0].addBox(-4.5F, -9.0F, -4.5F, 9, 9, 9);
        super.headModel[1] = new ModelRendererTurbo(this, 0, 18, textureX, textureY);
        super.headModel[1].addBox(-3.0F, -6.5F, -7.5F, 2, 2, 3);
        super.headModel[2] = new ModelRendererTurbo(this, 0, 18, textureX, textureY);
        super.headModel[2].addBox(1.0F, -6.5F, -7.5F, 2, 2, 3);
        super.headModel[3] = new ModelRendererTurbo(this, 0, 23, textureX, textureY);
        super.headModel[3].addBox(-2.0F, -3.5F, -6.5F, 4, 4, 2);
    }
}
