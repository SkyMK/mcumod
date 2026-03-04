package com.flansmod.client.model.titan;

import com.flansmod.client.model.ModelMechaTool;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCircularSaw extends ModelMechaTool {

    public ModelCircularSaw() {
        byte textureX = 32;
        byte textureY = 32;
        super.baseModel = new ModelRendererTurbo[2];
        super.baseModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.baseModel[0].addBox(0.0F, -3.5F, -3.5F, 3, 7, 7);
        super.baseModel[1] = new ModelRendererTurbo(this, 0, 14, textureX, textureY);
        super.baseModel[1].addBox(3.0F, -1.0F, -1.0F, 7, 2, 2);
        super.sawModel = new ModelRendererTurbo[2];
        super.sawModel[0] = new ModelRendererTurbo(this, 0, 18, textureX, textureY);
        super.sawModel[0].addBox(-4.0F, -0.4F, -4.0F, 8, 1, 8);
        super.sawModel[0].setRotationPoint(9.0F, 0.0F, 0.0F);
        super.sawModel[1] = new ModelRendererTurbo(this, 0, 18, textureX, textureY);
        super.sawModel[1].addBox(-4.0F, -0.6F, -4.0F, 8, 1, 8);
        super.sawModel[1].rotateAngleY = 0.7853982F;
        super.sawModel[1].setRotationPoint(9.0F, 0.0F, 0.0F);
    }
}
