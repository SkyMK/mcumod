package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelSuperHeavyHelmet extends ModelCustomArmour {

    public ModelSuperHeavyHelmet() {
        short textureX = 128;
        byte textureY = 64;
        super.headModel = new ModelRendererTurbo[10];
        super.headModel[0] = new ModelRendererTurbo(this, 28, 20, textureX, textureY);
        super.headModel[0].addBox(-4.5F, -9.0F, -4.5F, 9, 9, 9);
        super.headModel[1] = new ModelRendererTurbo(this, 20, 38, textureX, textureY);
        super.headModel[1].addBox(-3.0F, -10.0F, -3.0F, 6, 1, 6);
        super.headModel[2] = new ModelRendererTurbo(this, 38, 38, textureX, textureY);
        super.headModel[2].addBox(-2.0F, -11.0F, -2.0F, 4, 1, 4);
        super.headModel[3] = new ModelRendererTurbo(this, 20, 45, textureX, textureY);
        super.headModel[3].addShapeBox(-5.5F, -7.0F, -4.5F, 1, 7, 9, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F,
                0.0F, 1.0F, 1.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.headModel[4] = new ModelRendererTurbo(this, 40, 45, textureX, textureY);
        super.headModel[4].addShapeBox(4.5F, -7.0F, -4.5F, 1, 7, 9, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F,
                0.0F, 2.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        super.headModel[5] = new ModelRendererTurbo(this, 64, 0, textureX, textureY);
        super.headModel[5].addShapeBox(-4.5F, -7.0F, 4.5F, 9, 7, 1, 0.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 2.0F,
                0.0F, 1.0F, 2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
        super.headModel[6] = new ModelRendererTurbo(this, 64, 8, textureX, textureY);
        super.headModel[6].addShapeBox(-4.0F, -7.0F, -5.5F, 8, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F,
                0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
        super.headModel[7] = new ModelRendererTurbo(this, 65, 17, textureX, textureY);
        super.headModel[7].addBox(-3.0F, 0.0F, -5.5F, 6, 1, 1);
        super.headModel[8] = new ModelRendererTurbo(this, 66, 19, textureX, textureY);
        super.headModel[8].addBox(-2.0F, 1.0F, -5.5F, 4, 1, 1);
        super.headModel[9] = new ModelRendererTurbo(this, 65, 17, textureX, textureY);
        super.headModel[9].addBox(-3.0F, -8.0F, -5.5F, 6, 1, 1);
    }
}
