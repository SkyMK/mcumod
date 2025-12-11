package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelMG;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBrowning extends ModelMG {

    public ModelBrowning() {
        super.bipodModel = new ModelRendererTurbo[3];
        super.bipodModel[0] = new ModelRendererTurbo(this, 0, 0);
        super.bipodModel[0].addBox(0.0F, 0.0F, 0.0F, 1, 10, 1);
        super.bipodModel[0].rotateAngleZ = 0.9853982F;
        super.bipodModel[0].rotateAngleX = -0.7853982F;
        super.bipodModel[0].setRotationPoint(5.66F, 0.0F, 8.0F);
        super.bipodModel[1] = new ModelRendererTurbo(this, 0, 0);
        super.bipodModel[1].addBox(-1.0F, 0.0F, 0.0F, 1, 10, 1);
        super.bipodModel[1].rotateAngleZ = -0.9853982F;
        super.bipodModel[1].rotateAngleX = -0.7853982F;
        super.bipodModel[1].setRotationPoint(-5.66F, 0.0F, 8.0F);
        super.bipodModel[2] = new ModelRendererTurbo(this, 0, 0);
        super.bipodModel[2].addBox(-1.0F, 0.0F, 0.0F, 1, 10, 1);
        super.bipodModel[2].rotateAngleX = 1.0471976F;
        super.bipodModel[2].setRotationPoint(0.0F, 0.0F, -8.0F);
        super.gunModel = new ModelRendererTurbo[3];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0);
        super.gunModel[0].addBox(-1.5F, -1.5F, -4.0F, 3, 3, 12);
        super.gunModel[0].setRotationPoint(0.0F, 6.0F, 0.0F);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 15);
        super.gunModel[1].addBox(-0.5F, -0.5F, -12.0F, 1, 1, 10);
        super.gunModel[1].setRotationPoint(0.0F, 6.0F, 0.0F);
        super.gunModel[2] = new ModelRendererTurbo(this, 4, 0);
        super.gunModel[2].addBox(-1.0F, -3.0F, 8.0F, 2, 3, 2);
        super.gunModel[2].setRotationPoint(0.0F, 6.0F, 0.0F);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 18, 0);
        super.ammoModel[0].addBox(-6.0F, -3.0F, -2.0F, 5, 4, 2);
        super.ammoModel[0].setRotationPoint(0.0F, 6.0F, 0.0F);
    }
}
