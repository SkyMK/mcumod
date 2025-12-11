package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelF22 extends ModelPlane {

    public ModelF22() {
        short textureX = 512;
        short textureY = 512;
        super.bodyModel = new ModelRendererTurbo[3];
        super.bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.bodyModel[0].addBox(-48.0F, 8.0F, -32.0F, 128, 16, 64);
        super.bodyModel[1] = new ModelRendererTurbo(this, 0, 80, textureX, textureY);
        super.bodyModel[1].addBox(80.0F, 10.0F, -24.0F, 8, 12, 16);
        super.bodyModel[2] = new ModelRendererTurbo(this, 48, 80, textureX, textureY);
        super.bodyModel[2].addBox(80.0F, 10.0F, 8.0F, 8, 12, 16);
        super.noseModel = new ModelRendererTurbo[6];
        super.noseModel[0] = new ModelRendererTurbo(this, 0, 108, textureX, textureY);
        super.noseModel[0].addShapeBox(-80.0F, 8.0F, -32.0F, 32, 16, 64, 0.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, -16.0F);
        super.noseModel[1] = new ModelRendererTurbo(this, 0, 188, textureX, textureY);
        super.noseModel[1].addShapeBox(-80.0F, 24.0F, -12.0F, 64, 16, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.noseModel[2] = new ModelRendererTurbo(this, 0, 228, textureX, textureY);
        super.noseModel[2].addShapeBox(-112.0F, 8.0F, -12.0F, 32, 32, 24, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, -16.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -16.0F, -4.0F);
        super.noseModel[3] = new ModelRendererTurbo(this, 0, 284, textureX, textureY);
        super.noseModel[3].addShapeBox(-144.0F, 8.0F, -8.0F, 32, 16, 16, 0.0F, 0.0F, -4.0F, -8.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -4.0F, -8.0F, 0.0F, -12.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -12.0F, -8.0F);
        super.noseModel[4] = new ModelRendererTurbo(this, 0, 356, textureX, textureY);
        super.noseModel[4].flip = true;
        super.noseModel[4].addShapeBox(-112.0F, 8.0F, -12.0F, 32, 32, 24, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, -16.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -16.0F, -4.0F);
        super.noseModel[5] = new ModelRendererTurbo(this, 0, 316, textureX, textureY);
        super.noseModel[5].flip = true;
        super.noseModel[5].addShapeBox(-80.0F, 24.0F, -12.0F, 24, 16, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftWingModel = new ModelRendererTurbo[1];
        super.leftWingModel[0] = new ModelRendererTurbo(this, 192, 80, textureX, textureY);
        super.leftWingModel[0].addShapeBox(-16.0F, 12.0F, 32.0F, 64, 4, 64, 0.0F, 0.0F, 0.0F, 0.0F, 32.0F, 0.0F, 0.0F,
                16.0F, 0.0F, 0.0F, -48.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 32.0F, 0.0F, 0.0F, 16.0F, 0.0F, 0.0F, -48.0F,
                0.0F, 0.0F);
        super.rightWingModel = new ModelRendererTurbo[1];
        super.rightWingModel[0] = new ModelRendererTurbo(this, 192, 150, textureX, textureY);
        super.rightWingModel[0].addShapeBox(-16.0F, 12.0F, -96.0F, 64, 4, 64, 0.0F, -48.0F, 0.0F, 0.0F, 16.0F, 0.0F,
                0.0F, 32.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -48.0F, 0.0F, 0.0F, 16.0F, 0.0F, 0.0F, 32.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F);
        super.tailModel = new ModelRendererTurbo[4];
        super.tailModel[0] = new ModelRendererTurbo(this, 192, 220, textureX, textureY);
        super.tailModel[0].addShapeBox(64.0F, 15.99F, -64.0F, 40, 4, 32, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.tailModel[1] = new ModelRendererTurbo(this, 192, 256, textureX, textureY);
        super.tailModel[1].addShapeBox(64.0F, 15.99F, 32.0F, 40, 4, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -16.0F, 0.0F,
                0.0F);
        super.tailModel[2] = new ModelRendererTurbo(this, 192, 300, textureX, textureY);
        super.tailModel[2].addShapeBox(48.0F, 16.0F, -36.0F, 48, 48, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -16.0F, 0.0F, 16.0F, 0.0F, 0.0F, 16.0F, 0.0F, 0.0F, -16.0F, -16.0F, 0.0F,
                -16.0F);
        super.tailModel[3] = new ModelRendererTurbo(this, 296, 300, textureX, textureY);
        super.tailModel[3].addShapeBox(48.0F, 16.0F, 32.0F, 48, 48, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -16.0F, 0.0F, -16.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 16.0F, -16.0F, 0.0F,
                16.0F);
        super.bodyWheelModel = new ModelRendererTurbo[2];
        super.bodyWheelModel[0] = new ModelRendererTurbo(this, 416, 0, textureX, textureY);
        super.bodyWheelModel[0].addBox(-58.0F, 0.0F, -3.0F, 4, 8, 6);
        super.bodyWheelModel[1] = new ModelRendererTurbo(this, 384, 0, textureX, textureY);
        super.bodyWheelModel[1].addBox(-62.0F, -10.0F, -2.0F, 12, 12, 4);
        super.tailWheelModel = new ModelRendererTurbo[4];

        for (int i = 0; i < 2; ++i) {
            super.tailWheelModel[2 * i] = new ModelRendererTurbo(this, 416, 0, textureX, textureY);
            super.tailWheelModel[2 * i].addBox(58.0F, 0.0F, -27.0F + (float) i * 48.0F, 4, 8, 6);
            super.tailWheelModel[2 * i + 1] = new ModelRendererTurbo(this, 384, 0, textureX, textureY);
            super.tailWheelModel[2 * i + 1].addBox(54.0F, -10.0F, -26.0F + (float) i * 48.0F, 12, 12, 4);
        }

        this.translateAll(0.0F, 0.0F, 0.0F);
    }
}
