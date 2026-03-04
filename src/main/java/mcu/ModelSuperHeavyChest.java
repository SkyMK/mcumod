package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelSuperHeavyChest extends ModelCustomArmour {

    public ModelSuperHeavyChest() {
        short textureX = 128;
        byte textureY = 64;
        super.bodyModel = new ModelRendererTurbo[6];
        super.bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.bodyModel[0].addBox(-4.5F, -0.5F, -3.0F, 9, 13, 6);
        super.bodyModel[1] = new ModelRendererTurbo(this, 30, 0, textureX, textureY);
        super.bodyModel[1].addBox(-3.0F, 2.0F, -4.0F, 6, 12, 1);
        super.bodyModel[2] = new ModelRendererTurbo(this, 0, 19, textureX, textureY);
        super.bodyModel[2].addBox(-5.5F, 8.0F, -2.0F, 1, 3, 4);
        super.bodyModel[3] = new ModelRendererTurbo(this, 10, 19, textureX, textureY);
        super.bodyModel[3].addBox(4.5F, 8.0F, -2.0F, 1, 3, 4);
        super.bodyModel[4] = new ModelRendererTurbo(this, 44, 0, textureX, textureY);
        super.bodyModel[4].addBox(4.5F, -2.0F, -3.0F, 4, 4, 6);
        super.bodyModel[5] = new ModelRendererTurbo(this, 44, 10, textureX, textureY);
        super.bodyModel[5].addBox(-8.5F, -2.0F, -3.0F, 4, 4, 6);
        super.leftArmModel = new ModelRendererTurbo[2];
        super.leftArmModel[0] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
        super.leftArmModel[0].addBox(-1.25F, -2.0F, -2.25F, 4.5F, 13.0F, 4.5F);
        super.leftArmModel[1] = new ModelRendererTurbo(this, 20, 19, textureX, textureY);
        super.leftArmModel[1].addBox(2.75F, 2.0F, -1.5F, 1, 4, 3);
        super.rightArmModel = new ModelRendererTurbo[2];
        super.rightArmModel[0] = new ModelRendererTurbo(this, 0, 44, textureX, textureY);
        super.rightArmModel[0].addBox(-3.25F, -2.0F, -2.25F, 4.5F, 13.0F, 4.5F);
        super.rightArmModel[1] = new ModelRendererTurbo(this, 20, 26, textureX, textureY);
        super.rightArmModel[1].addBox(-3.75F, 2.0F, -1.5F, 1, 4, 3);
    }
}
