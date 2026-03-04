package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelDustbinLidChestplate extends ModelCustomArmour {

    public ModelDustbinLidChestplate() {
        byte textureX = 32;
        byte textureY = 64;
        super.bodyModel = new ModelRendererTurbo[9];
        super.bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.bodyModel[0].addBox(-4.0F, 0.0F, -3.0F, 8, 12, 1);
        super.bodyModel[1] = new ModelRendererTurbo(this, 0, 13, textureX, textureY);
        super.bodyModel[1].addBox(-6.0F, 2.0F, -3.0F, 2, 8, 1);
        super.bodyModel[2] = new ModelRendererTurbo(this, 6, 13, textureX, textureY);
        super.bodyModel[2].addBox(4.0F, 2.0F, -3.0F, 2, 8, 1);
        super.bodyModel[3] = new ModelRendererTurbo(this, 0, 22, textureX, textureY);
        super.bodyModel[3].addBox(-4.0F, 2.0F, -4.0F, 8, 8, 1);
        super.bodyModel[4] = new ModelRendererTurbo(this, 0, 31, textureX, textureY);
        super.bodyModel[4].addBox(-2.0F, 5.5F, -6.0F, 4, 1, 1);
        super.bodyModel[5] = new ModelRendererTurbo(this, 10, 31, textureX, textureY);
        super.bodyModel[5].addBox(-2.0F, 5.5F, -5.0F, 1, 1, 1);
        super.bodyModel[6] = new ModelRendererTurbo(this, 14, 31, textureX, textureY);
        super.bodyModel[6].addBox(1.0F, 5.5F, -5.0F, 1, 1, 1);
        super.bodyModel[7] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
        super.bodyModel[7].addBox(-4.0F, -0.5F, -2.5F, 1, 13, 5);
        super.bodyModel[8] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
        super.bodyModel[8].addBox(3.0F, -0.5F, -2.5F, 1, 13, 5);
    }
}
