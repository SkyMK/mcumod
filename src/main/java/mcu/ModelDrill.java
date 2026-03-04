package com.flansmod.client.model.titan;

import com.flansmod.client.model.ModelMechaTool;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelDrill extends ModelMechaTool {

    public ModelDrill() {
        byte textureX = 32;
        byte textureY = 32;
        super.baseModel = new ModelRendererTurbo[1];
        super.baseModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.baseModel[0].addBox(0.0F, -3.5F, -3.5F, 3, 7, 7);
        super.drillModel = new ModelRendererTurbo[4];
        super.drillModel[0] = new ModelRendererTurbo(this, 0, 14, textureX, textureY);
        super.drillModel[0].addBox(3.0F, -2.5F, -2.5F, 2, 5, 5);
        super.drillModel[0].rotateAngleX = -0.34906587F;
        super.drillModel[1] = new ModelRendererTurbo(this, 13, 0, textureX, textureY);
        super.drillModel[1].addBox(5.0F, -1.5F, -1.5F, 2, 3, 3);
        super.drillModel[1].rotateAngleX = -0.69813174F;
        super.drillModel[2] = new ModelRendererTurbo(this, 9, 14, textureX, textureY);
        super.drillModel[2].addBox(7.0F, -0.5F, -0.5F, 2, 1, 1);
        super.drillModel[2].rotateAngleX = -1.0471976F;
        super.drillModel[3] = new ModelRendererTurbo(this, 9, 14, textureX, textureY);
    }
}
