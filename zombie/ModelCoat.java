package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCoat extends ModelCustomArmour {

    public ModelCoat() {
        byte textureX = 64;
        byte textureY = 64;
        super.bodyModel = new ModelRendererTurbo[1];
        super.bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.bodyModel[0].addBox(-5.0F, -0.5F, -3.0F, 10, 13, 6);
        super.skirtFrontModel = new ModelRendererTurbo[1];
        super.skirtFrontModel[0] = new ModelRendererTurbo(this, 32, 0, textureX, textureY);
        super.skirtFrontModel[0].addBox(-5.0F, 0.0F, -3.0F, 10, 12, 6);
        super.skirtRearModel = new ModelRendererTurbo[1];
        super.skirtRearModel[0] = new ModelRendererTurbo(this, 0, 19, textureX, textureY);
        super.skirtRearModel[0].addBox(-5.0F, 0.0F, -3.0F, 10, 12, 6);
        super.leftArmModel = new ModelRendererTurbo[1];
        super.leftArmModel[0] = new ModelRendererTurbo(this, 32, 19, textureX, textureY);
        super.leftArmModel[0].addBox(-1.5F, -2.5F, -2.5F, 5, 13, 5);
        super.rightArmModel = new ModelRendererTurbo[1];
        super.rightArmModel[0] = new ModelRendererTurbo(this, 32, 41, textureX, textureY);
        super.rightArmModel[0].addBox(-3.5F, -2.5F, -2.5F, 5, 13, 5);
    }
}
