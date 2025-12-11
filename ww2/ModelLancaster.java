package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelLancaster extends ModelPlane {

    private final int textureX = 512;
    private final int textureY = 512;

    public ModelLancaster() {
        super.bodyModel = new ModelRendererTurbo[25];
        super.bodyModel[0] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        super.bodyModel[0].addTrapezoid(-160.0F, -80.0F, -16.0F, 16, 32, 32, 0.0F, -4.0F, 3);
        super.bodyModel[18] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        super.bodyModel[18].flip = true;
        super.bodyModel[18].addTrapezoid(-160.0F, -80.0F, -16.0F, 16, 32, 32, 0.0F, -4.0F, 3);
        super.bodyModel[1] = new ModelRendererTurbo(this, 64, 0, this.textureX, this.textureY);
        super.bodyModel[1].addBox(-144.0F, -80.0F, -15.0F, 16, 1, 30, 0.0F);
        super.bodyModel[2] = new ModelRendererTurbo(this, 127, 1, this.textureX, this.textureY);
        super.bodyModel[2].addBox(-144.0F, -49.0F, -15.0F, 112, 1, 30, 0.0F);
        super.bodyModel[3] = new ModelRendererTurbo(this, 64, 32, this.textureX, this.textureY);
        super.bodyModel[3].addTrapezoid(-128.0F, -96.0F, -16.0F, 64, 16, 32, 0.0F, -8.0F, 4);
        super.bodyModel[16] = new ModelRendererTurbo(this, 64, 32, this.textureX, this.textureY);
        super.bodyModel[16].flip = true;
        super.bodyModel[16].addTrapezoid(-128.0F, -96.0F, -16.0F, 64, 16, 32, 0.0F, -8.0F, 4);
        super.bodyModel[4] = new ModelRendererTurbo(this, 0, 80, this.textureX, this.textureY);
        super.bodyModel[4].addBox(-144.0F, -80.0F, -16.0F, 112, 32, 1, 0.0F);
        super.bodyModel[5] = new ModelRendererTurbo(this, 0, 80, this.textureX, this.textureY);
        super.bodyModel[5].addBox(-144.0F, -80.0F, -16.0F, 112, 32, 1, 0.0F);
        super.bodyModel[5].setRotationPoint(-176.0F, 0.0F, 0.0F);
        super.bodyModel[5].rotateAngleY = 3.1415927F;
        super.bodyModel[19] = new ModelRendererTurbo(this, 0, 445, this.textureX, this.textureY);
        super.bodyModel[19].addBox(-8.0F, 16.0F, -8.0F, 16, 2, 16, 0.0F);
        super.bodyModel[19].setRotationPoint(-116.0F, -88.0F, 0.0F);
        super.bodyModel[19].rotateAngleY = 3.1415927F;
        super.bodyModel[20] = new ModelRendererTurbo(this, 0, 463, this.textureX, this.textureY);
        super.bodyModel[20].addBox(-8.0F, 0.0F, -8.0F, 2, 16, 16, 0.0F);
        super.bodyModel[20].setRotationPoint(-116.0F, -88.0F, 0.0F);
        super.bodyModel[20].rotateAngleY = 3.1415927F;
        super.bodyModel[21] = new ModelRendererTurbo(this, 0, 445, this.textureX, this.textureY);
        super.bodyModel[21].addBox(-8.0F, 16.0F, -8.0F, 16, 2, 16, 0.0F);
        super.bodyModel[21].setRotationPoint(-90.0F, -76.0F, 0.0F);
        super.bodyModel[21].rotateAngleY = 3.1415927F;
        super.bodyModel[22] = new ModelRendererTurbo(this, 0, 463, this.textureX, this.textureY);
        super.bodyModel[22].addBox(-8.0F, 0.0F, -8.0F, 2, 16, 16, 0.0F);
        super.bodyModel[22].setRotationPoint(-90.0F, -76.0F, 0.0F);
        super.bodyModel[22].rotateAngleY = 3.1415927F;
        super.bodyModel[23] = new ModelRendererTurbo(this, 0, 445, this.textureX, this.textureY);
        super.bodyModel[23].addBox(-8.0F, 16.0F, -8.0F, 16, 2, 16, 0.0F);
        super.bodyModel[23].setRotationPoint(-68.0F, -76.0F, 0.0F);
        super.bodyModel[23].rotateAngleY = 3.1415927F;
        super.bodyModel[24] = new ModelRendererTurbo(this, 0, 463, this.textureX, this.textureY);
        super.bodyModel[24].addBox(-8.0F, 0.0F, -8.0F, 2, 16, 16, 0.0F);
        super.bodyModel[24].setRotationPoint(-68.0F, -76.0F, 0.0F);
        super.bodyModel[24].rotateAngleY = 3.1415927F;
        super.bodyModel[6] = new ModelRendererTurbo(this, 226, 80, this.textureX, this.textureY);
        super.bodyModel[6].addBox(-71.0F, -96.0F, -15.0F, 103, 1, 30, 0.0F);
        super.bodyModel[7] = new ModelRendererTurbo(this, 432, 24, this.textureX, this.textureY);
        super.bodyModel[7].addBox(-72.0F, -96.0F, -16.0F, 1, 16, 32, 0.0F);
        super.bodyModel[8] = new ModelRendererTurbo(this, 0, 245, this.textureX, this.textureY);
        super.bodyModel[8].addBox(0.0F, 0.0F, -16.0F, 199, 16, 1, 0.0F);
        super.bodyModel[8].setRotationPoint(-71.0F, -96.0F, 0.0F);
        super.bodyModel[9] = new ModelRendererTurbo(this, 0, 245, this.textureX, this.textureY);
        super.bodyModel[9].addBox(0.0F, 0.0F, -16.0F, 199, 16, 1, 0.0F);
        super.bodyModel[9].setRotationPoint(-71.0F, -96.0F, 0.0F);
        super.bodyModel[9].doMirror(false, false, true);
        super.bodyModel[10] = new ModelRendererTurbo(this, 38, 262, this.textureX, this.textureY);
        super.bodyModel[10].addBox(0.0F, 0.0F, -16.0F, 160, 16, 1, 0.0F);
        super.bodyModel[10].setRotationPoint(-32.0F, -80.0F, 0.0F);
        super.bodyModel[11] = new ModelRendererTurbo(this, 38, 262, this.textureX, this.textureY);
        super.bodyModel[11].addBox(0.0F, 0.0F, -16.0F, 160, 16, 1, 0.0F);
        super.bodyModel[11].setRotationPoint(-32.0F, -80.0F, 0.0F);
        super.bodyModel[11].doMirror(false, false, true);
        super.bodyModel[12] = new ModelRendererTurbo(this, 144, 279, this.textureX, this.textureY);
        super.bodyModel[12].addTrapezoid(32.0F, -112.0F, -16.0F, 32, 16, 32, 0.0F, -8.0F, 4);
        super.bodyModel[17] = new ModelRendererTurbo(this, 144, 279, this.textureX, this.textureY);
        super.bodyModel[17].flip = true;
        super.bodyModel[17].addTrapezoid(32.0F, -112.0F, -16.0F, 32, 16, 32, 0.0F, -8.0F, 4);
        ModelRendererTurbo[][] dorsalModel = new ModelRendererTurbo[][]{new ModelRendererTurbo[4], null, null};
        dorsalModel[0][0] = new ModelRendererTurbo(this, 0, 445, this.textureX, this.textureY);
        dorsalModel[0][0].addBox(-8.0F, 16.0F, -8.0F, 16, 2, 16, 0.0F);
        dorsalModel[0][1] = new ModelRendererTurbo(this, 0, 463, this.textureX, this.textureY);
        dorsalModel[0][1].addBox(-8.0F, 0.0F, -8.0F, 2, 16, 16, 0.0F);
        dorsalModel[0][2] = new ModelRendererTurbo(this, 40, 381, this.textureX, this.textureY);
        dorsalModel[0][2].addBox(8.0F, -6.0F, -7.0F, 2, 24, 2, 0.0F);
        dorsalModel[0][3] = new ModelRendererTurbo(this, 40, 381, this.textureX, this.textureY);
        dorsalModel[0][3].addBox(8.0F, -6.0F, 5.0F, 2, 24, 2, 0.0F);
        dorsalModel[1] = new ModelRendererTurbo[3];
        dorsalModel[1][0] = new ModelRendererTurbo(this, 40, 411, this.textureX, this.textureY);
        dorsalModel[1][0].addBox(8.0F, -1.0F, 3.0F, 24, 2, 2, 0.0F);
        dorsalModel[1][1] = new ModelRendererTurbo(this, 40, 411, this.textureX, this.textureY);
        dorsalModel[1][1].addBox(8.0F, -1.0F, -5.0F, 24, 2, 2, 0.0F);
        dorsalModel[1][2] = new ModelRendererTurbo(this, 40, 415, this.textureX, this.textureY);
        dorsalModel[1][2].addBox(8.0F, -1.0F, -3.0F, 2, 2, 6, 0.0F);
        dorsalModel[2] = new ModelRendererTurbo[0];
        ModelRendererTurbo[][] noseGunModel = dorsalModel;
        int tailGunModel = dorsalModel.length;

        int var4;
        ModelRendererTurbo[] noseGunParts;
        int var8;
        for (var4 = 0; var4 < tailGunModel; ++var4) {
            ModelRendererTurbo[] dorsalGunParts = noseGunModel[var4];
            noseGunParts = dorsalGunParts;
            int tailGunParts = dorsalGunParts.length;

            for (var8 = 0; var8 < tailGunParts; ++var8) {
                ModelRendererTurbo dorsalGunPart = noseGunParts[var8];
                dorsalGunPart.setRotationPoint(48.0F, -104.0F, 0.0F);
            }
        }

        this.registerGunModel("Dorsal", dorsalModel);
        noseGunModel = new ModelRendererTurbo[][]{new ModelRendererTurbo[4], null, null};
        noseGunModel[0][0] = new ModelRendererTurbo(this, 0, 445, this.textureX, this.textureY);
        noseGunModel[0][0].addBox(-8.0F, 16.0F, -8.0F, 16, 2, 16, 0.0F);
        noseGunModel[0][1] = new ModelRendererTurbo(this, 0, 463, this.textureX, this.textureY);
        noseGunModel[0][1].addBox(-8.0F, 0.0F, -8.0F, 2, 16, 16, 0.0F);
        noseGunModel[0][2] = new ModelRendererTurbo(this, 40, 381, this.textureX, this.textureY);
        noseGunModel[0][2].addBox(8.0F, -6.0F, -7.0F, 2, 24, 2, 0.0F);
        noseGunModel[0][3] = new ModelRendererTurbo(this, 40, 381, this.textureX, this.textureY);
        noseGunModel[0][3].addBox(8.0F, -6.0F, 5.0F, 2, 24, 2, 0.0F);
        noseGunModel[1] = new ModelRendererTurbo[3];
        noseGunModel[1][0] = new ModelRendererTurbo(this, 40, 411, this.textureX, this.textureY);
        noseGunModel[1][0].addBox(8.0F, -1.0F, 3.0F, 24, 2, 2, 0.0F);
        noseGunModel[1][1] = new ModelRendererTurbo(this, 40, 411, this.textureX, this.textureY);
        noseGunModel[1][1].addBox(8.0F, -1.0F, -5.0F, 24, 2, 2, 0.0F);
        noseGunModel[1][2] = new ModelRendererTurbo(this, 40, 415, this.textureX, this.textureY);
        noseGunModel[1][2].addBox(8.0F, -1.0F, -3.0F, 2, 2, 6, 0.0F);
        noseGunModel[2] = new ModelRendererTurbo[0];
        ModelRendererTurbo[][] var12 = noseGunModel;
        var4 = noseGunModel.length;

        int var14;
        ModelRendererTurbo[] var16;
        int var18;
        for (var14 = 0; var14 < var4; ++var14) {
            noseGunParts = var12[var14];
            var16 = noseGunParts;
            var8 = noseGunParts.length;

            for (var18 = 0; var18 < var8; ++var18) {
                ModelRendererTurbo noseGunPart = var16[var18];
                noseGunPart.setRotationPoint(-148.0F, -70.0F, 0.0F);
            }
        }

        this.registerGunModel("Nose", noseGunModel);
        var12 = new ModelRendererTurbo[][]{new ModelRendererTurbo[4], null, null};
        var12[0][0] = new ModelRendererTurbo(this, 0, 445, this.textureX, this.textureY);
        var12[0][0].addBox(-8.0F, 16.0F, -8.0F, 16, 2, 16, 0.0F);
        var12[0][1] = new ModelRendererTurbo(this, 0, 463, this.textureX, this.textureY);
        var12[0][1].addBox(-8.0F, 0.0F, -8.0F, 2, 16, 16, 0.0F);
        var12[0][2] = new ModelRendererTurbo(this, 40, 381, this.textureX, this.textureY);
        var12[0][2].addBox(8.0F, -6.0F, -7.0F, 2, 24, 2, 0.0F);
        var12[0][3] = new ModelRendererTurbo(this, 40, 381, this.textureX, this.textureY);
        var12[0][3].addBox(8.0F, -6.0F, 5.0F, 2, 24, 2, 0.0F);
        var12[1] = new ModelRendererTurbo[3];
        var12[1][0] = new ModelRendererTurbo(this, 40, 411, this.textureX, this.textureY);
        var12[1][0].addBox(8.0F, -1.0F, 3.0F, 24, 2, 2, 0.0F);
        var12[1][1] = new ModelRendererTurbo(this, 40, 411, this.textureX, this.textureY);
        var12[1][1].addBox(8.0F, -1.0F, -5.0F, 24, 2, 2, 0.0F);
        var12[1][2] = new ModelRendererTurbo(this, 40, 415, this.textureX, this.textureY);
        var12[1][2].addBox(8.0F, -1.0F, -3.0F, 2, 2, 6, 0.0F);
        var12[2] = new ModelRendererTurbo[0];
        ModelRendererTurbo[][] var13 = var12;
        var14 = var12.length;

        for (int var15 = 0; var15 < var14; ++var15) {
            var16 = var13[var15];
            ModelRendererTurbo[] var17 = var16;
            var18 = var16.length;

            for (int var19 = 0; var19 < var18; ++var19) {
                ModelRendererTurbo tailGunPart = var17[var19];
                tailGunPart.setRotationPoint(128.0F, -88.0F, 0.0F);
            }
        }

        this.registerGunModel("Tail", var12);
        super.bodyModel[13] = new ModelRendererTurbo(this, 52, 362, this.textureX, this.textureY);
        super.bodyModel[13].addShape3D(128.0F, -65.0F, -15.0F,
                new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(160.0D, 16.0D, 160, 0),
                        new Coord2D(160.0D, 17.0D, 160, 1), new Coord2D(0.0D, 1.0D, 0, 1)}),
                30.0F, 160, 1, 322, 30, 0, new float[]{1.0F, 160.0F, 1.0F, 160.0F});
        super.bodyModel[13].rotateAngleX = 3.1415927F;
        super.bodyModel[14] = new ModelRendererTurbo(this, 52, 345, this.textureX, this.textureY);
        super.bodyModel[14].addShape3D(128.0F, -64.0F, -16.0F,
                new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(160.0D, 0.0D, 160, 0),
                        new Coord2D(160.0D, 16.0D, 160, 16)}),
                1.0F, 160, 16, 336, 1, 0, new float[]{160.0F, 16.0F, 160.0F});
        super.bodyModel[14].rotateAngleX = 3.1415927F;
        super.bodyModel[15] = new ModelRendererTurbo(this, 52, 394, this.textureX, this.textureY);
        super.bodyModel[15].addShape3D(128.0F, -64.0F, 15.0F,
                new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(160.0D, 0.0D, 160, 0),
                        new Coord2D(160.0D, 16.0D, 160, 16)}),
                1.0F, 160, 16, 336, 1, 0, new float[]{160.0F, 16.0F, 160.0F});
        super.bodyModel[15].rotateAngleX = 3.1415927F;
        super.tailModel = new ModelRendererTurbo[7];
        super.tailModel[0] = new ModelRendererTurbo(this, 0, 279, this.textureX, this.textureY);
        super.tailModel[0].addBox(96.0F, 16.0F, -82.0F, 16, 64, 2, 0.0F);
        super.tailModel[0].rotateAngleX = -1.5707964F;
        super.tailModel[1] = new ModelRendererTurbo(this, 0, 279, this.textureX, this.textureY);
        super.tailModel[1].addBox(96.0F, 16.0F, -82.0F, 16, 64, 2, 0.0F);
        super.tailModel[1].doMirror(false, true, false);
        super.tailModel[1].rotateAngleX = -1.5707964F;
        super.tailModel[2] = new ModelRendererTurbo(this, 72, 279, this.textureX, this.textureY);
        super.tailModel[2].addBox(96.0F, -128.0F, 80.0F, 16, 64, 2, 0.0F);
        super.tailModel[3] = new ModelRendererTurbo(this, 72, 279, this.textureX, this.textureY);
        super.tailModel[3].addBox(96.0F, -128.0F, -82.0F, 16, 64, 2, 0.0F);
        super.tailModel[4] = new ModelRendererTurbo(this, 240, 279, this.textureX, this.textureY);
        super.tailModel[4].addBox(64.0F, -96.0F, -15.0F, 64, 1, 30, 0.0F);
        super.tailModel[5] = new ModelRendererTurbo(this, 304, 111, this.textureX, this.textureY);
        super.tailModel[5].addTrapezoid(128.0F, -96.0F, -16.0F, 16, 32, 32, 0.0F, -6.0F, 2);
        super.tailModel[6] = new ModelRendererTurbo(this, 304, 111, this.textureX, this.textureY);
        super.tailModel[6].flip = true;
        super.tailModel[6].addTrapezoid(128.0F, -96.0F, -16.0F, 16, 32, 32, 0.0F, -6.0F, 2);
        super.tailWheelModel = new ModelRendererTurbo[2];
        super.tailWheelModel[0] = new ModelRendererTurbo(this, 36, 463, this.textureX, this.textureY);
        super.tailWheelModel[0].addBox(98.0F, -63.0F, -3.0F, 4, 16, 6);
        super.tailWheelModel[1] = new ModelRendererTurbo(this, 84, 447, this.textureX, this.textureY);
        super.tailWheelModel[1].addBox(94.0F, -53.0F, -2.0F, 12, 12, 4);
        super.leftWingModel = new ModelRendererTurbo[6];
        super.leftWingModel[0] = new ModelRendererTurbo(this, 0, 113, this.textureX, this.textureY);
        super.leftWingModel[0].addBox(-64.0F, 16.0F, -82.0F, 64, 96, 4, 0.0F);
        super.leftWingModel[0].rotateAngleX = -1.5707964F;
        super.leftWingModel[1] = new ModelRendererTurbo(this, 136, 113, this.textureX, this.textureY);
        super.leftWingModel[1].addTrapezoid(-64.0F, 112.0F, -82.0F, 80, 128, 4, 0.0F, -2.0F, 5);
        super.leftWingModel[1].rotateAngleX = -1.5707964F;
        super.leftWingModel[2] = new ModelRendererTurbo(this, 256, 32, this.textureX, this.textureY);
        super.leftWingModel[2].addTrapezoid(-112.0F, -80.0F, -64.0F, 64, 24, 24, 0.0F, -2.0F, 5);
        super.leftWingModel[3] = new ModelRendererTurbo(this, 256, 32, this.textureX, this.textureY);
        super.leftWingModel[3].addTrapezoid(-96.0F, -80.0F, -128.0F, 64, 24, 24, 0.0F, -2.0F, 5);
        super.leftWingModel[4] = new ModelRendererTurbo(this, 408, 24, this.textureX, this.textureY);
        super.leftWingModel[4].addBox(-115.0F, -76.0F, -60.0F, 6, 16, 16, 0.0F);
        super.leftWingModel[5] = new ModelRendererTurbo(this, 408, 24, this.textureX, this.textureY);
        super.leftWingModel[5].addBox(-99.0F, -76.0F, -124.0F, 6, 16, 16, 0.0F);
        super.leftWingWheelModel = new ModelRendererTurbo[2];
        super.leftWingWheelModel[0] = new ModelRendererTurbo(this, 48, 415, this.textureX, this.textureY);
        super.leftWingWheelModel[0].addBox(-82.0F, -56.0F, -58.0F, 4, 24, 12);
        super.leftWingWheelModel[1] = new ModelRendererTurbo(this, 80, 415, this.textureX, this.textureY);
        super.leftWingWheelModel[1].addBox(-92.0F, -44.0F, -56.0F, 24, 24, 8);
        super.rightWingModel = new ModelRendererTurbo[6];
        super.rightWingModel[0] = new ModelRendererTurbo(this, 0, 113, this.textureX, this.textureY);
        super.rightWingModel[0].addBox(-64.0F, 16.0F, -82.0F, 64, 96, 4, 0.0F);
        super.rightWingModel[0].doMirror(false, true, false);
        super.rightWingModel[0].rotateAngleX = -1.5707964F;
        super.rightWingModel[1] = new ModelRendererTurbo(this, 136, 113, this.textureX, this.textureY);
        super.rightWingModel[1].addTrapezoid(-64.0F, 112.0F, -82.0F, 80, 128, 4, 0.0F, -2.0F, 5);
        super.rightWingModel[1].doMirror(false, true, false);
        super.rightWingModel[1].rotateAngleX = -1.5707964F;
        super.rightWingModel[2] = new ModelRendererTurbo(this, 256, 32, this.textureX, this.textureY);
        super.rightWingModel[2].addTrapezoid(-112.0F, -80.0F, 40.0F, 64, 24, 24, 0.0F, -2.0F, 5);
        super.rightWingModel[3] = new ModelRendererTurbo(this, 256, 32, this.textureX, this.textureY);
        super.rightWingModel[3].addTrapezoid(-96.0F, -80.0F, 104.0F, 64, 24, 24, 0.0F, -2.0F, 5);
        super.rightWingModel[4] = new ModelRendererTurbo(this, 408, 24, this.textureX, this.textureY);
        super.rightWingModel[4].addBox(-115.0F, -76.0F, 44.0F, 6, 16, 16, 0.0F);
        super.rightWingModel[5] = new ModelRendererTurbo(this, 408, 24, this.textureX, this.textureY);
        super.rightWingModel[5].addBox(-99.0F, -76.0F, 108.0F, 6, 16, 16, 0.0F);
        super.rightWingWheelModel = new ModelRendererTurbo[2];
        super.rightWingWheelModel[0] = new ModelRendererTurbo(this, 48, 415, this.textureX, this.textureY);
        super.rightWingWheelModel[0].addBox(-82.0F, -56.0F, 46.0F, 4, 24, 12);
        super.rightWingWheelModel[1] = new ModelRendererTurbo(this, 80, 415, this.textureX, this.textureY);
        super.rightWingWheelModel[1].addBox(-92.0F, -44.0F, 48.0F, 24, 24, 8);
        super.propellerModels = new ModelRendererTurbo[4][3];
        super.propellerModels[1] = this.makeProp(-114, -68, 52);
        super.propellerModels[0] = this.makeProp(-114, -68, -52);
        super.propellerModels[3] = this.makeProp(-98, -68, 116);
        super.propellerModels[2] = this.makeProp(-98, -68, -116);
        super.yawFlapModel = new ModelRendererTurbo[2];
        super.yawFlapModel[0] = new ModelRendererTurbo(this, 108, 279, this.textureX, this.textureY);
        super.yawFlapModel[0].addBox(0.0F, -48.0F, -1.0F, 16, 64, 2, 0.0F);
        super.yawFlapModel[0].setPosition(112.0F, -80.0F, 81.0F);
        super.yawFlapModel[1] = new ModelRendererTurbo(this, 108, 279, this.textureX, this.textureY);
        super.yawFlapModel[1].addBox(0.0F, -48.0F, -1.0F, 16, 64, 2, 0.0F);
        super.yawFlapModel[1].setPosition(112.0F, -80.0F, -81.0F);
        super.pitchFlapLeftWingModel = new ModelRendererTurbo[1];
        super.pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 0, 345, this.textureX, this.textureY);
        super.pitchFlapLeftWingModel[0].addBox(0.0F, -48.0F, -2.0F, 16, 96, 4, 0.0F);
        super.pitchFlapLeftWingModel[0].rotateAngleX = 1.570796F;
        super.pitchFlapLeftWingModel[0].setPosition(0.0F, -80.0F, -64.0F);
        super.pitchFlapLeftModel = new ModelRendererTurbo[1];
        super.pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 36, 279, this.textureX, this.textureY);
        super.pitchFlapLeftModel[0].addBox(0.0F, -32.0F, -1.0F, 16, 64, 2, 0.0F);
        super.pitchFlapLeftModel[0].rotateAngleX = 1.570796F;
        super.pitchFlapLeftModel[0].setPosition(112.0F, -81.0F, 48.0F);
        super.pitchFlapRightWingModel = new ModelRendererTurbo[1];
        super.pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 0, 345, this.textureX, this.textureY);
        super.pitchFlapRightWingModel[0].addBox(0.0F, -48.0F, -2.0F, 16, 96, 4, 0.0F);
        super.pitchFlapRightWingModel[0].doMirror(false, true, false);
        super.pitchFlapRightWingModel[0].rotateAngleX = 1.570796F;
        super.pitchFlapRightWingModel[0].setPosition(0.0F, -80.0F, 64.0F);
        super.pitchFlapRightModel = new ModelRendererTurbo[1];
        super.pitchFlapRightModel[0] = new ModelRendererTurbo(this, 36, 279, this.textureX, this.textureY);
        super.pitchFlapRightModel[0].addBox(0.0F, -32.0F, -1.0F, 16, 64, 2, 0.0F);
        super.pitchFlapRightModel[0].rotateAngleX = 1.570796F;
        super.pitchFlapRightModel[0].setPosition(112.0F, -81.0F, -48.0F);
        this.translateAll(0, 52, 0);
        this.flipAll();
    }

    private ModelRendererTurbo[] makeProp(int i, int j, int k) {
        ModelRendererTurbo[] prop = new ModelRendererTurbo[]{
                new ModelRendererTurbo(this, 40, 345, this.textureX, this.textureY),
                new ModelRendererTurbo(this, 40, 345, this.textureX, this.textureY),
                new ModelRendererTurbo(this, 40, 345, this.textureX, this.textureY)};
        prop[0].addBox(-0.0F, -32.0F, -2.0F, 2, 32, 4, 0.0F);
        prop[0].setRotationPoint((float) i, (float) j, (float) k);
        prop[1].addBox(-0.0F, -32.0F, -2.0F, 2, 32, 4, 0.0F);
        prop[1].setRotationPoint((float) i, (float) j, (float) k);
        prop[2].addBox(-0.0F, -32.0F, -2.0F, 2, 32, 4, 0.0F);
        prop[2].setRotationPoint((float) i, (float) j, (float) k);
        return prop;
    }
}
