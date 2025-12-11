package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelAAGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelFlakvierling extends ModelAAGun {

    public ModelFlakvierling() {
        super.baseModel = new ModelRendererTurbo[4];
        super.baseModel[0] = new ModelRendererTurbo(this, 0, 0, 128, 64);
        super.baseModel[1] = new ModelRendererTurbo(this, 0, 18, 128, 64);
        super.baseModel[2] = new ModelRendererTurbo(this, 0, 18, 128, 64);
        super.baseModel[3] = new ModelRendererTurbo(this, 0, 18, 128, 64);
        super.baseModel[0].addBox(-4.0F, 8.0F, -4.0F, 8, 2, 8, 0.0F);
        super.baseModel[1].addBox(-20.0F, -4.0F, -4.0F, 8, 4, 8, 0.0F);
        super.baseModel[2].addBox(4.0F, -4.0F, 8.0F, 8, 4, 8, 0.0F);
        super.baseModel[3].addBox(4.0F, -4.0F, -16.0F, 8, 4, 8, 0.0F);
        super.seatModel = new ModelRendererTurbo[5];
        super.seatModel[0] = new ModelRendererTurbo(this, 0, 30, 128, 64);
        super.seatModel[1] = new ModelRendererTurbo(this, 96, 0, 128, 64);
        super.seatModel[2] = new ModelRendererTurbo(this, 96, 0, 128, 64);
        super.seatModel[3] = new ModelRendererTurbo(this, 0, 48, 128, 64);
        super.seatModel[4] = new ModelRendererTurbo(this, 0, 48, 128, 64);
        super.seatModel[0].addBox(-8.0F, -6.0F, -8.0F, 16, 2, 16, 0.0F);
        super.seatModel[1].addBox(6.0F, -26.0F, -20.0F, 2, 20, 14, 0.0F);
        super.seatModel[2].addBox(6.0F, -26.0F, 6.0F, 2, 20, 14, 0.0F);
        super.seatModel[3].addBox(-12.0F, -10.0F, 4.0F, 12, 1, 12, 0.0F);
        super.seatModel[4].addBox(-8.0F, -9.0F, 5.0F, 2, 3, 2, 0.0F);
        super.gunModel = new ModelRendererTurbo[1];
        super.gunModel[0] = new ModelRendererTurbo(this, 48, 18, 128, 64);
        super.gunModel[0].addBox(0.0F, 0.0F, 0.0F, 12, 12, 12, 0.0F);
        super.barrelModel = new ModelRendererTurbo[4][1];
        super.barrelModel[0][0] = new ModelRendererTurbo(this, 64, 0, 128, 64);
        super.barrelModel[1][0] = new ModelRendererTurbo(this, 64, 0, 128, 64);
        super.barrelModel[2][0] = new ModelRendererTurbo(this, 64, 0, 128, 64);
        super.barrelModel[3][0] = new ModelRendererTurbo(this, 64, 0, 128, 64);
        super.barrelModel[0][0].addBox(12.0F, 1.0F, 1.0F, 20, 2, 2, 0.0F);
        super.barrelModel[1][0].addBox(12.0F, 9.0F, 1.0F, 20, 2, 2, 0.0F);
        super.barrelModel[2][0].addBox(12.0F, 1.0F, 9.0F, 20, 2, 2, 0.0F);
        super.barrelModel[3][0].addBox(12.0F, 9.0F, 9.0F, 20, 2, 2, 0.0F);
        super.ammoModel = new ModelRendererTurbo[0][0];
        super.barrelX = 0;
        super.barrelY = 16;
        super.barrelZ = 6;
        this.flipAll();
    }
}
