package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelAAGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelSentryGun extends ModelAAGun {

    public ModelSentryGun() {
        byte textureX = 64;
        byte textureY = 64;
        super.baseModel = new ModelRendererTurbo[5];
        super.baseModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.baseModel[0].addBox(-4.0F, 16.0F, -4.0F, 8, 2, 8, 0.0F);
        super.baseModel[1] = new ModelRendererTurbo(this, 32, 0, textureX, textureY);
        super.baseModel[1].addShapeBox(-4.0F, 0.0F, -4.0F, 2, 16, 2, 0.0F, 4.0F, 0.0F, 4.0F, -4.0F, 0.0F, 4.0F, -4.0F,
                0.0F, -4.0F, 4.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.baseModel[2] = new ModelRendererTurbo(this, 40, 0, textureX, textureY);
        super.baseModel[2].addShapeBox(2.0F, 0.0F, -4.0F, 2, 16, 2, 0.0F, -4.0F, 0.0F, 4.0F, 4.0F, 0.0F, 4.0F, 4.0F,
                0.0F, -4.0F, -4.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.baseModel[3] = new ModelRendererTurbo(this, 48, 0, textureX, textureY);
        super.baseModel[3].addShapeBox(2.0F, 0.0F, 2.0F, 2, 16, 2, 0.0F, -4.0F, 0.0F, -4.0F, 4.0F, 0.0F, -4.0F, 4.0F,
                0.0F, 4.0F, -4.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.baseModel[4] = new ModelRendererTurbo(this, 56, 0, textureX, textureY);
        super.baseModel[4].addShapeBox(-4.0F, 0.0F, 2.0F, 2, 16, 2, 0.0F, 4.0F, 0.0F, -4.0F, -4.0F, 0.0F, -4.0F, -4.0F,
                0.0F, 4.0F, 4.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.seatModel = new ModelRendererTurbo[5];
        super.seatModel[0] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
        super.seatModel[0].addBox(-4.0F, 18.0F, -4.0F, 8, 1, 8, 0.0F);
        super.seatModel[1] = new ModelRendererTurbo(this, 0, 19, textureX, textureY);
        super.seatModel[1].addBox(-2.0F, 19.0F, -4.0F, 4, 7, 1, 0.0F);
        super.seatModel[2] = new ModelRendererTurbo(this, 16, 19, textureX, textureY);
        super.seatModel[2].addBox(-2.0F, 19.0F, 3.0F, 4, 7, 1, 0.0F);
        super.seatModel[3] = new ModelRendererTurbo(this, 0, 27, textureX, textureY);
        super.seatModel[3].addBox(-3.0F, 18.0F, 4.0F, 6, 6, 2, 0.0F);
        super.seatModel[4] = new ModelRendererTurbo(this, 17, 27, textureX, textureY);
        super.seatModel[4].addBox(-3.0F, 19.0F, -9.0F, 6, 5, 5, 0.0F);
        super.gunModel = new ModelRendererTurbo[4];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 37, textureX, textureY);
        super.gunModel[0].addBox(-4.0F, -3.0F, -3.0F, 8, 6, 6, 0.0F);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 49, textureX, textureY);
        super.gunModel[1].addBox(4.0F, -1.0F, -2.0F, 2, 4, 4, 0.0F);
        super.gunModel[2] = new ModelRendererTurbo(this, 12, 49, textureX, textureY);
        super.gunModel[2].addBox(8.0F, -1.0F, -2.0F, 2, 4, 4, 0.0F);
        super.gunModel[3] = new ModelRendererTurbo(this, 24, 49, textureX, textureY);
        super.gunModel[3].addBox(14.0F, -1.0F, -2.0F, 4, 4, 4, 0.0F);
        super.barrelModel = new ModelRendererTurbo[4][1];
        super.barrelModel[0][0] = new ModelRendererTurbo(this, 34, 18, textureX, textureY);
        super.barrelModel[0][0].addBox(6.0F, 1.5F, 0.5F, 14, 1, 1, 0.0F);
        super.barrelModel[1][0] = new ModelRendererTurbo(this, 34, 20, textureX, textureY);
        super.barrelModel[1][0].addBox(6.0F, 1.5F, -1.5F, 14, 1, 1, 0.0F);
        super.barrelModel[2][0] = new ModelRendererTurbo(this, 34, 22, textureX, textureY);
        super.barrelModel[2][0].addBox(6.0F, -0.5F, -1.5F, 14, 1, 1, 0.0F);
        super.barrelModel[3][0] = new ModelRendererTurbo(this, 34, 24, textureX, textureY);
        super.barrelModel[3][0].addBox(6.0F, -0.5F, 0.5F, 14, 1, 1, 0.0F);
        super.ammoModel = new ModelRendererTurbo[0][0];
        super.barrelX = 0;
        super.barrelY = 24;
        super.barrelZ = 0;
    }
}
