package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelMIM23 extends ModelVehicle {

    public ModelMIM23() {
        short textureX = 256;
        short textureY = 256;
        super.bodyModel = new ModelRendererTurbo[4];
        super.bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.bodyModel[0].addBox(-24.0F, -4.0F, -8.0F, 48, 9, 16);
        super.bodyModel[1] = new ModelRendererTurbo(this, 0, 25, textureX, textureY);
        super.bodyModel[1].addBox(-24.0F, 5.0F, -16.0F, 48, 1, 32);
        super.bodyModel[2] = new ModelRendererTurbo(this, 0, 58, textureX, textureY);
        super.bodyModel[2].addBox(0.0F, -1.0F, -16.0F, 6, 1, 32);
        super.bodyModel[2].setRotationPoint(24.0F, 6.0F, 0.0F);
        super.bodyModel[2].rotateAngleZ = -0.7853982F;
        super.bodyModel[3] = new ModelRendererTurbo(this, 0, 58, textureX, textureY);
        super.bodyModel[3].addBox(0.0F, -1.0F, -16.0F, 6, 1, 32);
        super.bodyModel[3].setRotationPoint(-24.0F, 6.0F, 0.0F);
        super.bodyModel[3].rotateAngleZ = -0.7853982F;
        super.bodyModel[3].rotateAngleY = 3.1415927F;
        super.leftTrackModel = new ModelRendererTurbo[8];
        super.leftTrackModel[0] = new ModelRendererTurbo(this, 0, 94, textureX, textureY);
        super.leftTrackModel[0].addBox(-23.0F, -8.0F, -16.0F, 46, 1, 8);
        super.leftTrackModel[1] = new ModelRendererTurbo(this, 0, 104, textureX, textureY);
        super.leftTrackModel[1].addBox(-23.0F, 3.0F, -16.0F, 46, 1, 8);
        super.leftTrackModel[2] = new ModelRendererTurbo(this, 0, 114, textureX, textureY);
        super.leftTrackModel[2].addBox(-23.0F, -7.0F, -16.0F, 1, 10, 8);
        super.leftTrackModel[3] = new ModelRendererTurbo(this, 20, 114, textureX, textureY);
        super.leftTrackModel[3].addBox(22.0F, -7.0F, -16.0F, 1, 10, 8);
        super.leftTrackModel[4] = new ModelRendererTurbo(this, 40, 114, textureX, textureY);
        super.leftTrackModel[4].addBox(-21.5F, -6.5F, -16.0F, 9, 9, 4);
        super.leftTrackModel[5] = new ModelRendererTurbo(this, 40, 114, textureX, textureY);
        super.leftTrackModel[5].addBox(-10.5F, -6.5F, -16.0F, 9, 9, 4);
        super.leftTrackModel[6] = new ModelRendererTurbo(this, 40, 114, textureX, textureY);
        super.leftTrackModel[6].addBox(1.5F, -6.5F, -16.0F, 9, 9, 4);
        super.leftTrackModel[7] = new ModelRendererTurbo(this, 40, 114, textureX, textureY);
        super.leftTrackModel[7].addBox(12.5F, -6.5F, -16.0F, 9, 9, 4);
        super.rightTrackModel = new ModelRendererTurbo[8];
        super.rightTrackModel[0] = new ModelRendererTurbo(this, 0, 94, textureX, textureY);
        super.rightTrackModel[0].addBox(-23.0F, -8.0F, -16.0F, 46, 1, 8);
        super.rightTrackModel[0].rotateAngleY = 3.1415927F;
        super.rightTrackModel[1] = new ModelRendererTurbo(this, 0, 104, textureX, textureY);
        super.rightTrackModel[1].addBox(-23.0F, 3.0F, -16.0F, 46, 1, 8);
        super.rightTrackModel[1].rotateAngleY = 3.1415927F;
        super.rightTrackModel[2] = new ModelRendererTurbo(this, 0, 114, textureX, textureY);
        super.rightTrackModel[2].addBox(-23.0F, -7.0F, -16.0F, 1, 10, 8);
        super.rightTrackModel[2].rotateAngleY = 3.1415927F;
        super.rightTrackModel[3] = new ModelRendererTurbo(this, 20, 114, textureX, textureY);
        super.rightTrackModel[3].addBox(22.0F, -7.0F, -16.0F, 1, 10, 8);
        super.rightTrackModel[3].rotateAngleY = 3.1415927F;
        super.rightTrackModel[4] = new ModelRendererTurbo(this, 40, 114, textureX, textureY);
        super.rightTrackModel[4].addBox(-21.5F, -6.5F, -16.0F, 9, 9, 4);
        super.rightTrackModel[4].rotateAngleY = 3.1415927F;
        super.rightTrackModel[5] = new ModelRendererTurbo(this, 40, 114, textureX, textureY);
        super.rightTrackModel[5].addBox(-10.5F, -6.5F, -16.0F, 9, 9, 4);
        super.rightTrackModel[5].rotateAngleY = 3.1415927F;
        super.rightTrackModel[6] = new ModelRendererTurbo(this, 40, 114, textureX, textureY);
        super.rightTrackModel[6].addBox(1.5F, -6.5F, -16.0F, 9, 9, 4);
        super.rightTrackModel[6].rotateAngleY = 3.1415927F;
        super.rightTrackModel[7] = new ModelRendererTurbo(this, 40, 114, textureX, textureY);
        super.rightTrackModel[7].addBox(12.5F, -6.5F, -16.0F, 9, 9, 4);
        super.rightTrackModel[7].rotateAngleY = 3.1415927F;
        super.turretModel = new ModelRendererTurbo[7];
        super.turretModel[0] = new ModelRendererTurbo(this, 0, 134, textureX, textureY);
        super.turretModel[0].addBox(-12.0F, 6.0F, -12.0F, 24, 2, 24);
        super.turretModel[1] = new ModelRendererTurbo(this, 0, 162, textureX, textureY);
        super.turretModel[1].addBox(4.0F, 8.0F, -6.0F, 1, 16, 12);
        super.turretModel[2] = new ModelRendererTurbo(this, 28, 162, textureX, textureY);
        super.turretModel[2].addBox(12.0F, 6.0F, -6.0F, 4, 2, 12);
        super.turretModel[3] = new ModelRendererTurbo(this, 0, 192, textureX, textureY);
        super.turretModel[3].addShapeBox(-12.0F, 8.0F, -6.0F, 16, 16, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F);
        super.turretModel[4] = new ModelRendererTurbo(this, 0, 212, textureX, textureY);
        super.turretModel[4].addBox(-4.0F, 24.0F, -6.0F, 8, 8, 2);
        super.turretModel[5] = new ModelRendererTurbo(this, 38, 192, textureX, textureY);
        super.turretModel[5].addShapeBox(-12.0F, 8.0F, 4.0F, 16, 16, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F);
        super.turretModel[6] = new ModelRendererTurbo(this, 38, 212, textureX, textureY);
        super.turretModel[6].addBox(-4.0F, 24.0F, 4.0F, 8, 8, 2);
        super.barrelModel = new ModelRendererTurbo[4];
        super.barrelModel[0] = new ModelRendererTurbo(this, 0, 224, textureX, textureY);
        super.barrelModel[0].addBox(-12.0F, -4.0F, -4.0F, 24, 8, 8);
        super.barrelModel[0].setRotationPoint(0.0F, 32.0F, 0.0F);
        super.barrelModel[1] = new ModelRendererTurbo(this, 0, 242, textureX, textureY);
        super.barrelModel[1].addBox(-6.0F, 4.0F, -1.0F, 12, 8, 2);
        super.barrelModel[1].setRotationPoint(0.0F, 32.0F, 0.0F);
        super.barrelModel[2] = new ModelRendererTurbo(this, 30, 242, textureX, textureY);
        super.barrelModel[2].addBox(-6.0F, -1.0F, -12.0F, 12, 2, 8);
        super.barrelModel[2].setRotationPoint(0.0F, 32.0F, 0.0F);
        super.barrelModel[3] = new ModelRendererTurbo(this, 30, 242, textureX, textureY);
        super.barrelModel[3].addBox(-6.0F, -1.0F, 4.0F, 12, 2, 8);
        super.barrelModel[3].setRotationPoint(0.0F, 32.0F, 0.0F);
        super.ammoModel = new ModelRendererTurbo[3][4];

        for (int i = 0; i < 3; ++i) {
            float yOffset = i == 1 ? 12.0F : 0.0F;
            super.ammoModel[i] = new ModelRendererTurbo[4];
            super.ammoModel[i][0] = new ModelRendererTurbo(this, 72, 212, textureX, textureY);
            super.ammoModel[i][0].addBox(-20.0F, -3.0F + yOffset, -3.0F + (float) i * 12.0F - 12.0F, 40, 6, 6);
            super.ammoModel[i][1] = new ModelRendererTurbo(this, 72, 226, textureX, textureY);
            super.ammoModel[i][1].addTrapezoid(20.0F, -3.0F + yOffset, -3.0F + (float) i * 12.0F - 12.0F, 8, 6, 6, 0.0F,
                    -3.0F, 2);
            super.ammoModel[i][2] = new ModelRendererTurbo(this, 102, 226, textureX, textureY);
            super.ammoModel[i][2].addShapeBox(-20.0F, -7.0F + yOffset, 0.0F + (float) i * 12.0F - 12.0F, 20, 14, 0,
                    0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                    0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            super.ammoModel[i][3] = new ModelRendererTurbo(this, 88, 242, textureX, textureY);
            super.ammoModel[i][3].addShapeBox(-20.0F, 0.0F + yOffset, -7.0F + (float) i * 12.0F - 12.0F, 20, 0, 14,
                    0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                    0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);

            for (int j = 0; j < 4; ++j) {
                super.ammoModel[i][j].setRotationPoint(0.0F, 32.0F, 0.0F);
            }
        }

    }
}
