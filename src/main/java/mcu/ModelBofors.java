package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelBofors extends ModelVehicle {

    public ModelBofors() {
        super.bodyModel = new ModelRendererTurbo[5];
        super.bodyModel[0] = new ModelRendererTurbo(this, 0, 0, 128, 64);
        super.bodyModel[1] = new ModelRendererTurbo(this, 0, 0, 128, 64);
        super.bodyModel[2] = new ModelRendererTurbo(this, 0, 0, 128, 64);
        super.bodyModel[3] = new ModelRendererTurbo(this, 0, 0, 128, 64);
        super.bodyModel[4] = new ModelRendererTurbo(this, 0, 0, 128, 64);
        super.bodyModel[0].addBox(-16.0F, -4.0F, -8.0F, 32, 2, 16, 0.0F);
        super.bodyModel[1].addBox(-18.0F, -6.0F, -10.0F, 6, 6, 2, 0.0F);
        super.bodyModel[2].addBox(-18.0F, -6.0F, 8.0F, 6, 6, 2, 0.0F);
        super.bodyModel[3].addBox(12.0F, -6.0F, -10.0F, 6, 6, 2, 0.0F);
        super.bodyModel[4].addBox(12.0F, -6.0F, 8.0F, 6, 6, 2, 0.0F);
        super.turretModel = new ModelRendererTurbo[2];
        super.turretModel[0] = new ModelRendererTurbo(this, 0, 18, 128, 64);
        super.turretModel[1] = new ModelRendererTurbo(this, 0, 36, 128, 64);
        super.turretModel[0].addBox(-6.0F, -18.0F, -2.0F, 12, 14, 4, 0.0F);
        super.turretModel[1].addBox(-6.0F, -8.0F, 2.0F, 12, 2, 12, 0.0F);
        super.barrelModel = new ModelRendererTurbo[2];
        super.barrelModel[0] = new ModelRendererTurbo(this, 0, 50, 128, 64);
        super.barrelModel[0].addBox(0.0F, 0.0F, 0.0F, 30, 4, 4, 0.0F);
        super.barrelModel[0].setRotationPoint(-6.0F, -12.0F, -6.0F);
        super.barrelModel[1] = new ModelRendererTurbo(this, 0, 58, 128, 64);
        super.barrelModel[1].addBox(30.0F, 1.0F, 1.0F, 20, 2, 2, 0.0F);
        super.barrelModel[1].setRotationPoint(-6.0F, -12.0F, -6.0F);
        super.ammoModel = new ModelRendererTurbo[0][0];
        this.translateAll(0.0F, 8.0F, 0.0F);
        this.flipAll();
    }
}
