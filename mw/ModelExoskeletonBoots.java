package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelExoskeletonBoots extends ModelCustomArmour {

    public ModelExoskeletonBoots() {
        short textureX = 512;
        short textureY = 512;
        super.rightLegModel = new ModelRendererTurbo[3];
        super.rightLegModel[0] = new ModelRendererTurbo(this, 313, 113, textureX, textureY);
        super.rightLegModel[1] = new ModelRendererTurbo(this, 57, 121, textureX, textureY);
        super.rightLegModel[2] = new ModelRendererTurbo(this, 217, 121, textureX, textureY);
        float x = 8.5F;
        float y = 24.0F;
        float z = 1.0F;
        super.rightLegModel[0].addBox(-17.0F + x, 16.0F + y, -9.0F, 17, 8, 18, 0.0F);
        super.rightLegModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.rightLegModel[1].addBox(-17.0F + x, 19.0F + y, -10.0F, 16, 5, 6, 0.0F);
        super.rightLegModel[1].setRotationPoint(0.0F, 0.0F, -5.0F);
        super.rightLegModel[2].addBox(-17.0F + x, 11.0F + y, -10.0F, 16, 5, 19, 0.0F);
        super.rightLegModel[2].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.leftLegModel = new ModelRendererTurbo[3];
        super.leftLegModel[0] = new ModelRendererTurbo(this, 1, 121, textureX, textureY);
        super.leftLegModel[1] = new ModelRendererTurbo(this, 105, 121, textureX, textureY);
        super.leftLegModel[2] = new ModelRendererTurbo(this, 409, 121, textureX, textureY);
        super.leftLegModel[0].addBox(0.0F - x, 16.0F + y, -9.0F, 17, 8, 18, 0.0F);
        super.leftLegModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.leftLegModel[1].addBox(1.0F - x, 19.0F + y, -10.0F, 16, 5, 6, 0.0F);
        super.leftLegModel[1].setRotationPoint(0.0F, 0.0F, -5.0F);
        super.leftLegModel[2].addBox(1.0F - x, 11.0F + y, -10.0F, 16, 5, 19, 0.0F);
        super.leftLegModel[2].setRotationPoint(0.0F, 0.0F, 0.0F);
    }
}
