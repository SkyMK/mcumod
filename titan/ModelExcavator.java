package com.flansmod.client.model.titan;

import com.flansmod.client.model.ModelMechaTool;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelExcavator extends ModelMechaTool {

    public ModelExcavator() {
        byte textureX = 32;
        byte textureY = 32;
        super.baseModel = new ModelRendererTurbo[1];
        super.baseModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.baseModel[0].addBox(0.0F, -3.5F, -3.5F, 3, 7, 7);
        super.drillModel = new ModelRendererTurbo[9];
        super.drillModel[0] = new ModelRendererTurbo(this, 13, 0, textureX, textureY);
        super.drillModel[0].addBox(3.0F, -0.5F, -0.5F, 1, 1, 1);
        super.drillModel[1] = new ModelRendererTurbo(this, 13, 2, textureX, textureY);
        super.drillModel[1].addBox(4.0F, -1.0F, -0.5F, 1, 1, 1);
        super.drillModel[2] = new ModelRendererTurbo(this, 13, 4, textureX, textureY);
        super.drillModel[2].addBox(5.0F, -1.5F, -0.5F, 1, 1, 1);
        super.drillModel[3] = new ModelRendererTurbo(this, 17, 0, textureX, textureY);
        super.drillModel[3].addBox(6.0F, -2.0F, -0.5F, 2, 1, 1);
        super.drillModel[4] = new ModelRendererTurbo(this, 0, 14, textureX, textureY);
        super.drillModel[4].addBox(8.0F, -2.5F, -1.0F, 7, 1, 2);
        super.drillModel[5] = new ModelRendererTurbo(this, 17, 2, textureX, textureY);
        super.drillModel[5].addBox(8.0F, -1.5F, -4.0F, 5, 1, 1);
        super.drillModel[6] = new ModelRendererTurbo(this, 17, 4, textureX, textureY);
        super.drillModel[6].addBox(8.0F, -1.5F, 3.0F, 5, 1, 1);
        super.drillModel[7] = new ModelRendererTurbo(this, 0, 17, textureX, textureY);
        super.drillModel[7].addBox(8.0F, -2.0F, -3.0F, 6, 1, 2);
        super.drillModel[8] = new ModelRendererTurbo(this, 0, 20, textureX, textureY);
        super.drillModel[8].addBox(8.0F, -2.0F, 1.0F, 6, 1, 2);
    }
}
