package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelCobra extends ModelPlane {

    public ModelCobra() {
        short textureX = 512;
        short textureY = 256;
        super.bodyModel = new ModelRendererTurbo[12];
        super.bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.bodyModel[0].addBox(-24.0F, 8.0F, -10.0F, 48, 32, 20);
        super.bodyModel[1] = new ModelRendererTurbo(this, 0, 54, textureX, textureY);
        super.bodyModel[1].addBox(-64.0F, 8.0F, -10.0F, 40, 16, 20);
        super.bodyModel[2] = new ModelRendererTurbo(this, 0, 92, textureX, textureY);
        super.bodyModel[2].addShapeBox(-40.0F, 24.0F, -10.0F, 16, 16, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F);
        super.bodyModel[3] = new ModelRendererTurbo(this, 74, 92, textureX, textureY);
        super.bodyModel[3].addShapeBox(-64.0F, 24.0F, -10.0F, 24, 16, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, -6.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -6.0F,
                -6.0F, -2.0F);
        super.bodyModel[4] = new ModelRendererTurbo(this, 0, 92, textureX, textureY);
        super.bodyModel[4].flip = true;
        super.bodyModel[4].addShapeBox(-40.0F, 24.0F, -10.0F, 16, 16, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F);
        super.bodyModel[5] = new ModelRendererTurbo(this, 74, 92, textureX, textureY);
        super.bodyModel[5].flip = true;
        super.bodyModel[5].addShapeBox(-64.0F, 24.0F, -10.0F, 24, 16, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, -6.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -6.0F,
                -6.0F, -2.0F);
        super.bodyModel[6] = new ModelRendererTurbo(this, 0, 130, textureX, textureY);
        super.bodyModel[6].addTrapezoid(-24.0F, 40.0F, -10.0F, 48, 8, 20, 0.0F, -4.0F, 5);
        super.bodyModel[7] = new ModelRendererTurbo(this, 0, 160, textureX, textureY);
        super.bodyModel[7].addBox(24.0F, 26.0F, -6.0F, 8, 12, 12);
        super.bodyModel[8] = new ModelRendererTurbo(this, 42, 160, textureX, textureY);
        super.bodyModel[8].addBox(0.0F, 26.0F, 10.0F, 24, 12, 4);
        super.bodyModel[9] = new ModelRendererTurbo(this, 42, 178, textureX, textureY);
        super.bodyModel[9].addBox(0.0F, 26.0F, -14.0F, 24, 12, 4);
        super.bodyModel[10] = new ModelRendererTurbo(this, 162, 114, textureX, textureY);
        super.bodyModel[10].flip = true;
        super.bodyModel[10].addBox(-64.0F, 8.0F, -10.0F, 40, 16, 20);
        super.bodyModel[11] = new ModelRendererTurbo(this, 162, 176, textureX, textureY);
        super.bodyModel[11].addTrapezoid(-72.0F, 16.0F, -10.0F, 8, 8, 20, 0.0F, -3.0F, 3);
        super.rightWingModel = new ModelRendererTurbo[4];
        super.rightWingModel[0] = new ModelRendererTurbo(this, 162, 52, textureX, textureY);
        super.rightWingModel[0].addShapeBox(-12.0F, 21.0F, -38.0F, 24, 2, 28, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightWingModel[1] = new ModelRendererTurbo(this, 162, 84, textureX, textureY);
        super.rightWingModel[1].addBox(-8.0F, 20.0F, -42.0F, 24, 4, 4);
        super.rightWingModel[2] = new ModelRendererTurbo(this, 162, 94, textureX, textureY);
        super.rightWingModel[2].addBox(-4.0F, 19.0F, -30.0F, 16, 2, 2);
        super.rightWingModel[3] = new ModelRendererTurbo(this, 162, 100, textureX, textureY);
        super.rightWingModel[3].addBox(-8.0F, 13.0F, -32.0F, 24, 6, 6);
        super.leftWingModel = new ModelRendererTurbo[4];
        super.leftWingModel[0] = new ModelRendererTurbo(this, 268, 52, textureX, textureY);
        super.leftWingModel[0].addShapeBox(-12.0F, 21.0F, 10.0F, 24, 2, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F,
                0.0F);
        super.leftWingModel[1] = new ModelRendererTurbo(this, 268, 84, textureX, textureY);
        super.leftWingModel[1].addBox(-8.0F, 20.0F, 38.0F, 24, 4, 4);
        super.leftWingModel[2] = new ModelRendererTurbo(this, 268, 94, textureX, textureY);
        super.leftWingModel[2].addBox(-4.0F, 19.0F, 28.0F, 16, 2, 2);
        super.leftWingModel[3] = new ModelRendererTurbo(this, 268, 100, textureX, textureY);
        super.leftWingModel[3].addBox(-8.0F, 13.0F, 26.0F, 24, 6, 6);
        super.skidsModel = new ModelRendererTurbo[6];
        super.skidsModel[0] = new ModelRendererTurbo(this, 0, 196, textureX, textureY);
        super.skidsModel[0].addBox(-48.0F, -4.0F, -24.0F, 72, 2, 4);
        super.skidsModel[1] = new ModelRendererTurbo(this, 0, 204, textureX, textureY);
        super.skidsModel[1].addBox(-48.0F, -4.0F, 20.0F, 72, 2, 4);
        super.skidsModel[2] = new ModelRendererTurbo(this, 100, 160, textureX, textureY);
        super.skidsModel[2].addShapeBox(-24.0F, -2.0F, 8.0F, 2, 10, 2, 0.0F, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, -12.0F,
                0.0F, 0.0F, 12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.skidsModel[3] = new ModelRendererTurbo(this, 110, 160, textureX, textureY);
        super.skidsModel[3].addShapeBox(16.0F, -2.0F, 8.0F, 2, 10, 2, 0.0F, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, -12.0F,
                0.0F, 0.0F, 12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.skidsModel[4] = new ModelRendererTurbo(this, 120, 160, textureX, textureY);
        super.skidsModel[4].addShapeBox(-24.0F, -2.0F, -10.0F, 2, 10, 2, 0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 0.0F, 12.0F,
                0.0F, 0.0F, -12.0F, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.skidsModel[5] = new ModelRendererTurbo(this, 130, 160, textureX, textureY);
        super.skidsModel[5].addShapeBox(16.0F, -2.0F, -10.0F, 2, 10, 2, 0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 0.0F, 12.0F,
                0.0F, 0.0F, -12.0F, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.tailModel = new ModelRendererTurbo[2];
        super.tailModel[0] = new ModelRendererTurbo(this, 138, 0, textureX, textureY);
        super.tailModel[0].addShapeBox(24.0F, 8.0F, -10.0F, 80, 16, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, -8.0F,
                0.0F, -8.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F,
                0.0F, 0.0F);
        super.tailModel[1] = new ModelRendererTurbo(this, 340, 0, textureX, textureY);
        super.tailModel[1].addShapeBox(88.0F, 24.0F, -2.0F, 16, 24, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -20.0F, 0.0F, -1.0F, 16.0F, 0.0F, -1.0F, 16.0F, 0.0F, -1.0F, -20.0F, 0.0F,
                -1.0F);
        super.heliMainRotorModels = new ModelRendererTurbo[1][4];
        super.heliMainRotorModels[0][0] = new ModelRendererTurbo(this, 100, 184, textureX, textureY);
        super.heliMainRotorModels[0][0].addBox(-1.0F, 48.0F, -1.0F, 2, 8, 2);
        super.heliMainRotorModels[0][1] = new ModelRendererTurbo(this, 110, 184, textureX, textureY);
        super.heliMainRotorModels[0][1].addBox(-4.0F, 56.0F, -2.0F, 8, 1, 4);
        super.heliMainRotorModels[0][2] = new ModelRendererTurbo(this, 0, 212, textureX, textureY);
        super.heliMainRotorModels[0][2].addBox(4.0F, 56.0F, -2.0F, 72, 1, 8);
        super.heliMainRotorModels[0][3] = new ModelRendererTurbo(this, 0, 223, textureX, textureY);
        super.heliMainRotorModels[0][3].addBox(4.0F, 56.0F, -2.0F, 72, 1, 8);
        super.heliMainRotorModels[0][3].rotateAngleY = 3.1415927F;
        super.heliMainRotorOrigins = new Vector3f[]{new Vector3f(0.0F, 3.0F, 0.0F)};
        super.heliTailRotorModels = new ModelRendererTurbo[1][4];
        super.heliTailRotorModels[0][0] = new ModelRendererTurbo(this, 138, 38, textureX, textureY);
        super.heliTailRotorModels[0][0].addBox(111.5F, 43.5F, 1.0F, 1, 1, 4);
        super.heliTailRotorModels[0][1] = new ModelRendererTurbo(this, 150, 38, textureX, textureY);
        super.heliTailRotorModels[0][1].addBox(110.0F, 43.5F, 5.0F, 4, 1, 1);
        super.heliTailRotorModels[0][2] = new ModelRendererTurbo(this, 150, 42, textureX, textureY);
        super.heliTailRotorModels[0][2].addBox(114.0F, 43.0F, 5.0F, 8, 2, 1);
        super.heliTailRotorModels[0][3] = new ModelRendererTurbo(this, 150, 46, textureX, textureY);
        super.heliTailRotorModels[0][3].addBox(102.0F, 43.0F, 5.0F, 8, 2, 1);
        super.heliTailRotorOrigins = new Vector3f[]{new Vector3f(7.0F, 2.75F, 0.0625F)};
        super.heliRotorSpeeds = new float[]{1.0F};
        ModelRendererTurbo[][] noseGun = new ModelRendererTurbo[][]{new ModelRendererTurbo[0],
                new ModelRendererTurbo[1], null, null};
        noseGun[1][0] = new ModelRendererTurbo(this, 198, 206, textureX, textureY);
        noseGun[1][0].addBox(-4.0F, -3.0F, -3.0F, 8, 6, 6);
        noseGun[2] = new ModelRendererTurbo[0];
        noseGun[3] = new ModelRendererTurbo[6];
        noseGun[3][0] = new ModelRendererTurbo(this, 162, 206, textureX, textureY);
        noseGun[3][0].addBox(4.0F, -3.0F, -3.0F, 2, 6, 6);
        noseGun[3][1] = new ModelRendererTurbo(this, 162, 220, textureX, textureY);
        noseGun[3][1].addBox(6.0F, -2.0F, -2.0F, 16, 1, 1);
        noseGun[3][2] = new ModelRendererTurbo(this, 162, 224, textureX, textureY);
        noseGun[3][2].addBox(6.0F, -2.0F, 1.0F, 16, 1, 1);
        noseGun[3][3] = new ModelRendererTurbo(this, 162, 228, textureX, textureY);
        noseGun[3][3].addBox(6.0F, 1.0F, -2.0F, 16, 1, 1);
        noseGun[3][4] = new ModelRendererTurbo(this, 162, 232, textureX, textureY);
        noseGun[3][4].addBox(6.0F, 1.0F, 1.0F, 16, 1, 1);
        noseGun[3][5] = new ModelRendererTurbo(this, 180, 206, textureX, textureY);
        noseGun[3][5].addBox(18.0F, -3.0F, -3.0F, 2, 6, 6);
        ModelRendererTurbo[][] var4 = noseGun;
        int var5 = noseGun.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            ModelRendererTurbo[] dorsalGunParts = var4[var6];
            ModelRendererTurbo[] var8 = dorsalGunParts;
            int var9 = dorsalGunParts.length;

            for (int var10 = 0; var10 < var9; ++var10) {
                ModelRendererTurbo dorsalGunPart = var8[var10];
                dorsalGunPart.setRotationPoint(-64.0F, 12.0F, 0.0F);
            }
        }

        this.registerGunModel("Nose", noseGun);
        this.translateAll(0.0F, -20.0F, 0.0F);
    }
}
