package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelApron extends ModelCustomArmour {

    public ModelApron() {
        byte textureX = 64;
        byte textureY = 32;
        super.bodyModel = new ModelRendererTurbo[1];
        super.bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.bodyModel[0].addBox(-5.0F, 0.0F, -3.0F, 10, 12, 6);
        super.skirtFrontModel = new ModelRendererTurbo[1];
        super.skirtFrontModel[0] = new ModelRendererTurbo(this, 32, 0, textureX, textureY);
        super.skirtFrontModel[0].addBox(-5.0F, 0.0F, -3.0F, 10, 12, 6);
    }
}
