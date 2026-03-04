package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelMG;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBren extends ModelMG {

    public ModelBren() {
        super.bipodModel = new ModelRendererTurbo[2];
        super.bipodModel[0] = new ModelRendererTurbo(this, 0, 0);
        super.bipodModel[0].addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
        super.bipodModel[0].rotateAngleZ = 0.7853982F;
        super.bipodModel[0].setRotationPoint(5.66F, 0.0F, 0.0F);
        super.bipodModel[1] = new ModelRendererTurbo(this, 0, 0);
        super.bipodModel[1].addBox(-1.0F, 0.0F, 0.0F, 1, 8, 1);
        super.bipodModel[1].rotateAngleZ = -0.7853982F;
        super.bipodModel[1].setRotationPoint(-5.66F, 0.0F, 0.0F);
        super.gunModel = new ModelRendererTurbo[3];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0);
        super.gunModel[0].addBox(-1.0F, -1.0F, -2.0F, 2, 2, 16);
        super.gunModel[0].setRotationPoint(0.0F, 6.0F, 0.0F);
        super.gunModel[1] = new ModelRendererTurbo(this, 4, 0);
        super.gunModel[1].addBox(-1.0F, -4.0F, 8.0F, 2, 3, 2);
        super.gunModel[1].setRotationPoint(0.0F, 6.0F, 0.0F);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 18);
        super.gunModel[2].addBox(-0.5F, -0.5F, -8.0F, 1, 1, 6);
        super.gunModel[2].setRotationPoint(0.0F, 6.0F, 0.0F);
        super.ammoModel = new ModelRendererTurbo[2];
        super.ammoModel[0] = new ModelRendererTurbo(this, 4, 5);
        super.ammoModel[0].addBox(0.0F, 1.0F, 5.0F, 1, 3, 2);
        super.ammoModel[0].setRotationPoint(0.0F, 6.0F, 0.0F);
        super.ammoModel[1] = new ModelRendererTurbo(this, 4, 5);
        super.ammoModel[1].addBox(0.0F, 4.0F, 4.5F, 1, 2, 2);
        super.ammoModel[1].setRotationPoint(0.0F, 6.0F, 0.0F);
    }
}
