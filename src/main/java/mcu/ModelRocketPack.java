package com.flansmod.client.model.titan;

import com.flansmod.client.model.ModelMechaTool;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelRocketPack extends ModelMechaTool {

    public ModelRocketPack() {
        byte textureX = 64;
        byte textureY = 64;
        super.baseModel = new ModelRendererTurbo[5];
        super.baseModel[0] = new ModelRendererTurbo(this, 0, 27, textureX, textureY);
        super.baseModel[0].addBox(-1.0F, -10.0F, -8.0F, 1, 20, 16);
        super.baseModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.baseModel[1].addBox(-7.0F, -11.0F, -7.0F, 6, 21, 6);
        super.baseModel[2] = new ModelRendererTurbo(this, 24, 6, textureX, textureY);
        super.baseModel[2].addBox(-7.0F, -11.0F, 1.0F, 6, 21, 6);
        super.baseModel[3] = new ModelRendererTurbo(this, 0, 27, textureX, textureY);
        super.baseModel[3].addBox(-6.0F, -15.0F, -6.0F, 4, 4, 4);
        super.baseModel[4] = new ModelRendererTurbo(this, 0, 35, textureX, textureY);
        super.baseModel[4].addBox(-6.0F, -15.0F, 2.0F, 4, 4, 4);
    }
}
