package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelChinook extends ModelPlane {

    public ModelChinook() {
        short textureX = 1024;
        short textureY = 512;
        super.bodyModel = new ModelRendererTurbo[9];
        super.bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.bodyModel[0].addBox(-96.0F, 8.0F, -32.0F, 192, 2, 64);
        super.bodyModel[1] = new ModelRendererTurbo(this, 0, 132, textureX, textureY);
        super.bodyModel[1].addBox(-96.0F, 10.0F, -32.0F, 192, 64, 2);
        super.bodyModel[2] = new ModelRendererTurbo(this, 0, 198, textureX, textureY);
        super.bodyModel[2].addBox(-96.0F, 10.0F, 30.0F, 192, 64, 2);
        super.bodyModel[3] = new ModelRendererTurbo(this, 0, 66, textureX, textureY);
        super.bodyModel[3].addBox(-96.0F, 74.0F, -32.0F, 192, 2, 64);
        super.bodyModel[4] = new ModelRendererTurbo(this, 0, 264, textureX, textureY);
        super.bodyModel[4].addShapeBox(-96.0F, 10.0F, -48.0F, 192, 32, 16, 0.0F, -8.0F, -8.0F, 0.0F, -8.0F, -8.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, -8.0F, 0.0F, -8.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.bodyModel[5] = new ModelRendererTurbo(this, 0, 312, textureX, textureY);
        super.bodyModel[5].addShapeBox(-96.0F, 10.0F, 32.0F, 192, 32, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -8.0F, -8.0F, 0.0F, -8.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, -8.0F, 0.0F, -8.0F,
                -8.0F, 0.0F);
        super.bodyModel[6] = new ModelRendererTurbo(this, 512, 314, textureX, textureY);
        super.bodyModel[6].addBox(-92.0F, 32.0F, -30.0F, 184, 2, 16);
        super.bodyModel[7] = new ModelRendererTurbo(this, 512, 332, textureX, textureY);
        super.bodyModel[7].addBox(-92.0F, 32.0F, 14.0F, 184, 2, 16);
        super.bodyModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.bodyModel[8].addBox(-96.0F, 24.0F, -32.0F, 192, 2, 64);
        super.bodyWheelModel = new ModelRendererTurbo[12];

        int i;
        int i1;
        for (i = 0; i < 2; ++i) {
            for (i1 = 0; i1 < 2; ++i1) {
                super.bodyWheelModel[3 * i + 6 * i1] = new ModelRendererTurbo(this, 624, 32, textureX, textureY);
                super.bodyWheelModel[3 * i + 6 * i1].addBox(0.0F, -8.0F, -2.0F, 4, 16, 4);
                super.bodyWheelModel[3 * i + 6 * i1].setRotationPoint(-80.0F * (float) (i == 0 ? 1 : -1), 0.0F,
                        -24.0F * (float) (i1 == 0 ? 1 : -1));
                super.bodyWheelModel[1 + 3 * i + 6 * i1] = new ModelRendererTurbo(this, 640, 12, textureX, textureY);
                super.bodyWheelModel[1 + 3 * i + 6 * i1].addBox(-6.0F, -14.0F, -4.0F, 16, 16, 3);
                super.bodyWheelModel[1 + 3 * i + 6 * i1].setRotationPoint(-80.0F * (float) (i == 0 ? 1 : -1), 0.0F,
                        -24.0F * (float) (i1 == 0 ? 1 : -1));
                super.bodyWheelModel[2 + 3 * i + 6 * i1] = new ModelRendererTurbo(this, 640, 12, textureX, textureY);
                super.bodyWheelModel[2 + 3 * i + 6 * i1].addBox(-6.0F, -14.0F, 1.0F, 16, 16, 3);
                super.bodyWheelModel[2 + 3 * i + 6 * i1].setRotationPoint(-80.0F * (float) (i == 0 ? 1 : -1), 0.0F,
                        -24.0F * (float) (i1 == 0 ? 1 : -1));
            }
        }

        super.noseModel = new ModelRendererTurbo[17];
        super.noseModel[0] = new ModelRendererTurbo(this, 0, 360, textureX, textureY);
        super.noseModel[0].addShapeBox(-128.0F, 8.0F, -32.0F, 32, 2, 64, 0.0F, 0.0F, -4.0F, -8.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -4.0F, -8.0F, 0.0F, 4.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F,
                -8.0F);
        super.noseModel[1] = new ModelRendererTurbo(this, 0, 426, textureX, textureY);
        super.noseModel[1].addShapeBox(-128.0F, 10.0F, -32.0F, 32, 64, 2, 0.0F, 0.0F, -4.0F, -8.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 8.0F, -8.0F, -4.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F,
                -4.0F, 8.0F);
        super.noseModel[2] = new ModelRendererTurbo(this, 68, 426, textureX, textureY);
        super.noseModel[2].addShapeBox(-128.0F, 10.0F, 30.0F, 32, 64, 2, 0.0F, 0.0F, -4.0F, 8.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -4.0F, -8.0F, -8.0F, -4.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F,
                -4.0F, -8.0F);
        super.noseModel[3] = new ModelRendererTurbo(this, 192, 360, textureX, textureY);
        super.noseModel[3].addShapeBox(-128.0F, 74.0F, -32.0F, 32, 2, 64, 0.0F, -8.0F, 4.0F, -8.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -8.0F, 4.0F, -8.0F, -8.0F, -4.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F,
                -4.0F, -8.0F);
        super.noseModel[4] = new ModelRendererTurbo(this, 136, 426, textureX, textureY);
        super.noseModel[4].addShapeBox(-125.75F, 44.0F, -24.0F, 2, 28, 48, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -1.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F,
                0.0F, 0.0F);
        super.noseModel[5] = new ModelRendererTurbo(this, 236, 426, textureX, textureY);
        super.noseModel[5].addShapeBox(-152.0F, 12.0F, -24.0F, 24, 2, 48, 0.0F, 0.0F, -4.0F, -8.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -4.0F, -8.0F, 0.0F, 4.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F,
                -8.0F);
        super.noseModel[6] = new ModelRendererTurbo(this, 128, 360, textureX, textureY);
        super.noseModel[6].addShapeBox(-152.0F, 14.0F, -24.0F, 24, 28, 2, 0.0F, 0.0F, -4.0F, -8.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 8.0F, 0.0F, -4.0F, -8.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F,
                -4.0F, 8.0F);
        super.noseModel[7] = new ModelRendererTurbo(this, 128, 390, textureX, textureY);
        super.noseModel[7].addShapeBox(-152.0F, 14.0F, 22.0F, 24, 28, 2, 0.0F, 0.0F, -4.0F, 8.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -4.0F, -8.0F, 0.0F, -4.0F, 8.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F,
                -4.0F, -8.0F);
        super.noseModel[8] = new ModelRendererTurbo(this, 320, 360, textureX, textureY);
        super.noseModel[8].addShapeBox(-152.0F, 42.0F, -24.0F, 24, 2, 48, 0.0F, 0.0F, 4.0F, -8.0F, 4.0F, 0.0F, 0.0F,
                4.0F, 0.0F, 0.0F, 0.0F, 4.0F, -8.0F, 0.0F, -4.0F, -8.0F, 4.25F, 0.0F, 0.0F, 4.25F, 0.0F, 0.0F, 0.0F,
                -4.0F, -8.0F);
        super.noseModel[9] = new ModelRendererTurbo(this, 448, 0, textureX, textureY);
        super.noseModel[9].addShapeBox(-152.0F, 18.0F, -14.0F, 2, 20, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.noseModel[10] = new ModelRendererTurbo(this, 512, 0, textureX, textureY);
        super.noseModel[10].addShapeBox(-96.0F, 76.0F, -4.0F, 48, 24, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.noseModel[11] = new ModelRendererTurbo(this, 512, 32, textureX, textureY);
        super.noseModel[11].addShapeBox(-120.0F, 76.0F, -4.0F, 24, 24, 8, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -16.0F,
                0.0F, 0.0F);
        super.noseModel[12] = new ModelRendererTurbo(this, 512, 252, textureX, textureY);
        super.noseModel[12].addShapeBox(-124.0F, 24.0F, -30.0F, 28, 2, 60, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -8.0F);
        super.noseModel[13] = new ModelRendererTurbo(this, 688, 196, textureX, textureY);
        super.noseModel[13].addBox(-112.0F, 26.0F, 8.0F, 16, 2, 16);
        super.noseModel[14] = new ModelRendererTurbo(this, 688, 196, textureX, textureY);
        super.noseModel[14].addBox(-112.0F, 26.0F, -24.0F, 16, 2, 16);
        super.noseModel[15] = new ModelRendererTurbo(this, 688, 214, textureX, textureY);
        super.noseModel[15].addBox(-96.0F, 26.0F, 8.0F, 2, 24, 16);
        super.noseModel[16] = new ModelRendererTurbo(this, 688, 214, textureX, textureY);
        super.noseModel[16].addBox(-96.0F, 26.0F, -24.0F, 2, 24, 16);
        super.tailModel = new ModelRendererTurbo[2];
        super.tailModel[0] = new ModelRendererTurbo(this, 512, 64, textureX, textureY);
        super.tailModel[0].addShapeBox(96.0F, 8.0F, -32.0F, 64, 68, 64, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -48.0F, -24.0F,
                0.0F, -48.0F, -24.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, -24.0F, 0.0F,
                0.0F, 0.0F);
        super.tailModel[1] = new ModelRendererTurbo(this, 512, 196, textureX, textureY);
        super.tailModel[1].addShapeBox(80.0F, 76.0F, -4.0F, 80, 48, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -16.0F, 0.0F,
                0.0F);
        super.heliMainRotorModels = new ModelRendererTurbo[2][7];

        for (i = 0; i < 2; ++i) {
            super.heliMainRotorModels[i][0] = new ModelRendererTurbo(this, 624, 0, textureX, textureY);
            super.heliMainRotorModels[i][0].addBox(-2.0F, 124.0F, -2.0F, 4, 8, 4);

            for (i1 = 0; i1 < 3; ++i1) {
                super.heliMainRotorModels[i][i1 * 2 + 1] = new ModelRendererTurbo(this, 640, 0, textureX, textureY);
                super.heliMainRotorModels[i][i1 * 2 + 1].addBox(0.0F, 132.0F, -2.0F, 8, 1, 4);
                super.heliMainRotorModels[i][i1 * 2 + 1].rotateAngleY = 1.0471976F * (float) i1 * 2.0F;
                super.heliMainRotorModels[i][i1 * 2 + 2] = new ModelRendererTurbo(this, 664, 0, textureX, textureY);
                super.heliMainRotorModels[i][i1 * 2 + 2].addBox(8.0F, 132.0F, -2.0F, 128, 1, 8);
                super.heliMainRotorModels[i][i1 * 2 + 2].rotateAngleY = 1.0471976F * (float) i1 * 2.0F;
            }
        }

        for (i = 0; i < 7; ++i) {
            super.heliMainRotorModels[0][i].setRotationPoint(-84.0F, -24.0F, 0.0F);
        }

        for (i = 0; i < 7; ++i) {
            super.heliMainRotorModels[1][i].setRotationPoint(128.0F, 0.0F, 0.0F);
        }

        super.heliMainRotorOrigins = new Vector3f[]{new Vector3f(-5.25F, 3.0F, 0.0F),
                new Vector3f(8.0F, 3.0F, 0.0F)};
        super.heliRotorSpeeds = new float[]{1.0F, 1.0F};
        this.translateAll(0.0F, -15.0F, 0.0F);
    }
}
