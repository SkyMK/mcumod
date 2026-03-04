package com.flansmod.client.model.zombie;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelPoliceHat extends ModelCustomArmour {

    int textureX = 64;
    int textureY = 32;

    public ModelPoliceHat() {
        super.headModel = new ModelRendererTurbo[9];
        super.headModel[0] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        super.headModel[1] = new ModelRendererTurbo(this, 0, 12, this.textureX, this.textureY);
        super.headModel[2] = new ModelRendererTurbo(this, 0, 19, this.textureX, this.textureY);
        super.headModel[3] = new ModelRendererTurbo(this, 0, 23, this.textureX, this.textureY);
        super.headModel[4] = new ModelRendererTurbo(this, 28, 0, this.textureX, this.textureY);
        super.headModel[5] = new ModelRendererTurbo(this, 32, 7, this.textureX, this.textureY);
        super.headModel[6] = new ModelRendererTurbo(this, 31, 3, this.textureX, this.textureY);
        super.headModel[7] = new ModelRendererTurbo(this, 40, 3, this.textureX, this.textureY);
        super.headModel[8] = new ModelRendererTurbo(this, 30, 17, this.textureX, this.textureY);
        super.headModel[0].addBox(-4.5F, -8.0F, -4.5F, 9, 2, 9, 0.0F);
        super.headModel[1].addShapeBox(-5.5F, -9.0F, -0.5F, 11, 1, 5, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F,
                0.0F);
        super.headModel[2].addShapeBox(-4.5F, -7.0F, -6.5F, 9, 1, 2, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F,
                -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.0F, 0.0F, 0.0F, -0.0F, 0.0F, 0.0F, -0.0F, 0.0F, 0.0F, -0.0F,
                0.0F);
        super.headModel[3].addShapeBox(-4.5F, -7.0F, -7.5F, 9, 1, 1, 0.0F, -1.0F, -0.4F, 0.0F, -1.0F, -0.4F, 0.0F, 0.0F,
                -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.headModel[4].addShapeBox(-5.5F, -9.0F, 4.5F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F,
                0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F,
                -0.5F);
        super.headModel[5].addShapeBox(-5.5F, -11.0F, -5.0F, 11, 3, 5, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F,
                -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F,
                0.0F);
        super.headModel[6].addShapeBox(-1.0F, -10.0F, -5.5F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.headModel[7].addShapeBox(-1.0F, -8.0F, -5.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, -0.4F, -0.25F, 0.0F, 0.0F, -0.25F,
                0.0F, 0.0F);
        super.headModel[8].addShapeBox(-5.0F, -8.0F, -5.0F, 10, 1, 5, 0.0F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F,
                -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F,
                -0.4F, 0.0F, -0.4F);
    }
}
