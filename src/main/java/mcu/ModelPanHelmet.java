package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelPanHelmet extends ModelCustomArmour {

    public ModelPanHelmet() {
        byte textureX = 64;
        byte textureY = 16;
        super.headModel = new ModelRendererTurbo[3];
        super.headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.headModel[0].addBox(-4.5F, -9.0F, -4.5F, 9, 4, 9);
        super.headModel[1] = new ModelRendererTurbo(this, 2, 2, textureX, textureY);
        super.headModel[1].addBox(-3.5F, -10.0F, -3.5F, 7, 1, 7);
        super.headModel[2] = new ModelRendererTurbo(this, 27, 0, textureX, textureY);
        super.headModel[2].addBox(-9.5F, -7.0F, -1.0F, 5, 2, 2);
    }
}
