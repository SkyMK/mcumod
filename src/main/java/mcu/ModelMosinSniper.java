package com.flansmod.client.model.ww2;

import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelMosinSniper extends ModelMosin {

    public ModelMosinSniper() {
        byte textureX = 64;
        byte textureY = 16;
        super.defaultScopeModel = new ModelRendererTurbo[2];
        super.defaultScopeModel[0] = new ModelRendererTurbo(this, 24, 7, textureX, textureY);
        super.defaultScopeModel[0].addBox(1.5F, 5.0F, -0.5F, 1, 1, 1);
        super.defaultScopeModel[1] = new ModelRendererTurbo(this, 29, 7, textureX, textureY);
        super.defaultScopeModel[1].addBox(-1.0F, 6.0F, -0.5F, 4, 1, 1);
    }
}
