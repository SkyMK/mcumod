package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelT34 extends ModelVehicle {

    int textureX = 512;
    int textureY = 1024;

    public ModelT34() {
        super.bodyModel = new ModelRendererTurbo[21];
        super.bodyModel[0] = new ModelRendererTurbo(this, 0, 50, this.textureX, this.textureY);
        super.bodyModel[1] = new ModelRendererTurbo(this, 0, 110, this.textureX, this.textureY);
        super.bodyModel[2] = new ModelRendererTurbo(this, 0, 160, this.textureX, this.textureY);
        super.bodyModel[3] = new ModelRendererTurbo(this, 0, 630, this.textureX, this.textureY);
        super.bodyModel[4] = new ModelRendererTurbo(this, 0, 240, this.textureX, this.textureY);
        super.bodyModel[5] = new ModelRendererTurbo(this, 0, 280, this.textureX, this.textureY);
        super.bodyModel[6] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        super.bodyModel[7] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        super.bodyModel[8] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        super.bodyModel[9] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        super.bodyModel[10] = new ModelRendererTurbo(this, 0, 410, this.textureX, this.textureY);
        super.bodyModel[11] = new ModelRendererTurbo(this, 0, 410, this.textureX, this.textureY);
        super.bodyModel[12] = new ModelRendererTurbo(this, 0, 430, this.textureX, this.textureY);
        super.bodyModel[13] = new ModelRendererTurbo(this, 0, 450, this.textureX, this.textureY);
        super.bodyModel[14] = new ModelRendererTurbo(this, 0, 540, this.textureX, this.textureY);
        super.bodyModel[15] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        super.bodyModel[16] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        super.bodyModel[17] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        super.bodyModel[18] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        super.bodyModel[19] = new ModelRendererTurbo(this, 0, 630, this.textureX, this.textureY);
        super.bodyModel[20] = new ModelRendererTurbo(this, 0, 690, this.textureX, this.textureY);
        super.bodyModel[0].addShapeBox(0.0F, 0.0F, -1.0F, 108, 14, 37, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -5.0F, 0.0F,
                0.0F);
        super.bodyModel[0].setRotationPoint(-73.0F, -11.0F, -18.0F);
        super.bodyModel[1].addBox(0.0F, 0.0F, 0.0F, 89, 4, 37, 0.0F);
        super.bodyModel[1].setRotationPoint(-62.0F, -1.5F, -19.0F);
        super.bodyModel[2].addBox(0.0F, 0.0F, 0.0F, 93, 3, 54, 0.0F);
        super.bodyModel[2].setRotationPoint(-65.0F, -14.0F, -27.0F);
        super.bodyModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 13, 3, 9, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -5.0F, 0.0F, -1.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 4.0F,
                0.0F);
        super.bodyModel[3].setRotationPoint(-78.0F, -14.0F, 18.0F);
        super.bodyModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 41, 14, 24, 0.0F, 35.0F, -2.0F, 7.0F, 0.0F, -2.0F, 7.0F, 0.0F,
                -2.0F, 7.0F, 35.0F, -2.0F, 7.0F, 50.0F, 0.0F, 15.0F, 15.0F, 0.0F, 15.0F, 15.0F, 0.0F, 15.0F, 50.0F,
                0.0F, 15.0F);
        super.bodyModel[4].setRotationPoint(-20.3F, -25.0F, -12.0F);
        super.bodyModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 4, 9, 37, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 10.0F, 0.0F, 15.0F, -3.0F, 0.0F, 15.0F, -3.0F, 0.0F, -6.0F, 10.0F,
                0.0F);
        super.bodyModel[5].setRotationPoint(25.0F, -17.0F, -19.0F);
        super.bodyModel[5].rotateAngleZ = -0.15707964F;
        super.bodyModel[6].addBox(0.0F, 0.0F, -3.0F, 17, 8, 3, 0.0F);
        super.bodyModel[6].setRotationPoint(-56.0F, -22.0F, -20.0F);
        super.bodyModel[6].rotateAngleX = -0.17453294F;
        super.bodyModel[7].addBox(0.0F, 0.0F, 0.0F, 17, 8, 3, 0.0F);
        super.bodyModel[7].setRotationPoint(-56.0F, -22.0F, 19.0F);
        super.bodyModel[7].rotateAngleX = 0.17453294F;
        super.bodyModel[8].addBox(0.0F, 0.0F, -3.0F, 17, 8, 3, 0.0F);
        super.bodyModel[8].setRotationPoint(-37.0F, -22.0F, -20.0F);
        super.bodyModel[8].rotateAngleX = -0.17453294F;
        super.bodyModel[9].addBox(0.0F, 0.0F, 0.0F, 17, 8, 3, 0.0F);
        super.bodyModel[9].setRotationPoint(-37.0F, -22.0F, 19.0F);
        super.bodyModel[9].rotateAngleX = 0.17453294F;
        super.bodyModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 18, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F,
                -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[10].setRotationPoint(28.0F, -14.0F, 18.0F);
        super.bodyModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 19, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F,
                -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[11].setRotationPoint(28.0F, -14.0F, -27.0F);
        super.bodyModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 7, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F,
                -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F);
        super.bodyModel[12].setRotationPoint(25.0F, -19.0F, -13.0F);
        super.bodyModel[13].addShapeBox(0.0F, 0.0F, 0.0F, 1, 9, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F,
                -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[13].setRotationPoint(27.0F, -18.0F, 0.0F);
        super.bodyModel[13].rotateAngleZ = 0.87266463F;
        super.bodyModel[14].addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
        super.bodyModel[14].setRotationPoint(31.0F, -16.5F, -11.0F);
        super.bodyModel[15].addShapeBox(0.0F, 0.0F, 3.0F, 17, 8, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F,
                0.0F);
        super.bodyModel[15].setRotationPoint(-37.0F, -22.0F, 19.0F);
        super.bodyModel[15].rotateAngleX = 0.17453294F;
        super.bodyModel[16].addShapeBox(0.0F, 0.0F, 3.0F, 17, 8, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F,
                0.0F);
        super.bodyModel[16].setRotationPoint(-56.0F, -22.0F, 19.0F);
        super.bodyModel[16].rotateAngleX = 0.17453294F;
        super.bodyModel[17].addShapeBox(0.0F, 0.0F, -6.0F, 17, 8, 3, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[17].setRotationPoint(-37.0F, -22.0F, -20.0F);
        super.bodyModel[17].rotateAngleX = -0.17453294F;
        super.bodyModel[18].addShapeBox(0.0F, 0.0F, -6.0F, 17, 8, 3, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[18].setRotationPoint(-56.0F, -22.0F, -20.0F);
        super.bodyModel[18].rotateAngleX = -0.17453294F;
        super.bodyModel[19].addShapeBox(0.0F, 0.0F, 0.0F, 13, 3, 9, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -5.0F, 0.0F, -1.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 4.0F,
                0.0F);
        super.bodyModel[19].setRotationPoint(-78.0F, -14.0F, -27.0F);
        super.bodyModel[20].addShapeBox(0.0F, 0.0F, 0.0F, 35, 1, 7, 0.0F, 0.0F, 0.0F, 29.0F, 0.0F, 0.0F, 29.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 30.0F, 1.0F, 0.0F, 30.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F);
        super.bodyModel[20].setRotationPoint(-54.3F, -24.0F, 11.0F);
        super.turretModel = new ModelRendererTurbo[14];
        super.turretModel[0] = new ModelRendererTurbo(this, 0, 710, this.textureX, this.textureY);
        super.turretModel[1] = new ModelRendererTurbo(this, 0, 740, this.textureX, this.textureY);
        super.turretModel[2] = new ModelRendererTurbo(this, 0, 770, this.textureX, this.textureY);
        super.turretModel[3] = new ModelRendererTurbo(this, 0, 800, this.textureX, this.textureY);
        super.turretModel[4] = new ModelRendererTurbo(this, 0, 830, this.textureX, this.textureY);
        super.turretModel[5] = new ModelRendererTurbo(this, 0, 860, this.textureX, this.textureY);
        super.turretModel[6] = new ModelRendererTurbo(this, 0, 890, this.textureX, this.textureY);
        super.turretModel[7] = new ModelRendererTurbo(this, 0, 940, this.textureX, this.textureY);
        super.turretModel[8] = new ModelRendererTurbo(this, 200, 300, this.textureX, this.textureY);
        super.turretModel[9] = new ModelRendererTurbo(this, 200, 350, this.textureX, this.textureY);
        super.turretModel[10] = new ModelRendererTurbo(this, 200, 380, this.textureX, this.textureY);
        super.turretModel[11] = new ModelRendererTurbo(this, 200, 410, this.textureX, this.textureY);
        super.turretModel[12] = new ModelRendererTurbo(this, 200, 410, this.textureX, this.textureY);
        super.turretModel[13] = new ModelRendererTurbo(this, 200, 440, this.textureX, this.textureY);
        super.turretModel[0].addShapeBox(-1.0F, -25.0F, -12.0F, 18, 2, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F,
                0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F,
                0.0F);
        super.turretModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.turretModel[1].addShapeBox(-6.0F, -25.0F, -12.0F, 5, 2, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.turretModel[1].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.turretModel[2].addShapeBox(-18.0F, -25.0F, -12.0F, 12, 2, 24, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -5.0F);
        super.turretModel[2].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.turretModel[3].addShapeBox(-1.0F, -26.0F, -13.0F, 19, 1, 26, 0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F, -3.0F,
                2.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F,
                0.0F);
        super.turretModel[3].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.turretModel[4].addShapeBox(-6.0F, -26.0F, -13.0F, 3, 1, 26, 0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F, 3.0F,
                2.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.turretModel[4].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.turretModel[5].addShapeBox(-20.0F, -26.0F, -13.0F, 12, 1, 26, 0.0F, 1.0F, 0.0F, -3.0F, 2.0F, 0.0F, 3.0F,
                2.0F, 0.0F, 3.0F, 1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -5.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -5.0F);
        super.turretModel[5].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.turretModel[6].addShapeBox(-1.0F, -38.0F, -13.0F, 18, 12, 26, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -6.0F,
                -1.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, -3.0F, 3.0F, 0.0F, -3.0F, 0.0F,
                0.0F, 3.0F);
        super.turretModel[6].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.turretModel[7].addShapeBox(-6.0F, -38.0F, -13.0F, 3, 12, 26, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F,
                2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F, 3.0F, 2.0F, 0.0F, 3.0F, 0.0F, 0.0F,
                3.0F);
        super.turretModel[7].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.turretModel[8].addShapeBox(-18.0F, -38.0F, -13.0F, 12, 12, 26, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 3.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F,
                -3.0F);
        super.turretModel[8].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.turretModel[9].addBox(15.0F, -36.0F, -6.0F, 4, 9, 12, 0.0F);
        super.turretModel[9].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.turretModel[10].addBox(-9.5F, -40.0F, -5.5F, 11, 2, 15, 0.0F);
        super.turretModel[10].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.turretModel[11].addShapeBox(-11.5F, -40.0F, -5.5F, 2, 2, 15, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -2.0F);
        super.turretModel[11].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.turretModel[12].addShapeBox(1.5F, -40.0F, -5.5F, 2, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F,
                0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                0.0F);
        super.turretModel[12].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.turretModel[13].addShapeBox(19.0F, -36.0F, -6.0F, 2, 9, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.turretModel[13].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.barrelModel = new ModelRendererTurbo[2];
        super.barrelModel[0] = new ModelRendererTurbo(this, 200, 470, this.textureX, this.textureY);
        super.barrelModel[1] = new ModelRendererTurbo(this, 200, 490, this.textureX, this.textureY);
        super.barrelModel[0].addShapeBox(8.0F, -2.0F, -1.0F, 35, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F,
                -0.2F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, 0.0F,
                0.0F);
        super.barrelModel[0].setRotationPoint(20.0F, -31.5F, 0.0F);
        super.barrelModel[1].addShapeBox(0.0F, -3.0F, -2.0F, 8, 6, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.barrelModel[1].setRotationPoint(20.0F, -31.5F, 0.0F);
        super.leftTrackModel = new ModelRendererTurbo[27];
        super.leftTrackModel[0] = new ModelRendererTurbo(this, 200, 510, this.textureX, this.textureY);
        super.leftTrackModel[1] = new ModelRendererTurbo(this, 200, 530, this.textureX, this.textureY);
        super.leftTrackModel[2] = new ModelRendererTurbo(this, 200, 560, this.textureX, this.textureY);
        super.leftTrackModel[3] = new ModelRendererTurbo(this, 200, 590, this.textureX, this.textureY);
        super.leftTrackModel[4] = new ModelRendererTurbo(this, 200, 620, this.textureX, this.textureY);
        super.leftTrackModel[5] = new ModelRendererTurbo(this, 200, 650, this.textureX, this.textureY);
        super.leftTrackModel[6] = new ModelRendererTurbo(this, 0, 480, this.textureX, this.textureY);
        super.leftTrackModel[7] = new ModelRendererTurbo(this, 0, 500, this.textureX, this.textureY);
        super.leftTrackModel[8] = new ModelRendererTurbo(this, 0, 500, this.textureX, this.textureY);
        super.leftTrackModel[9] = new ModelRendererTurbo(this, 0, 500, this.textureX, this.textureY);
        super.leftTrackModel[10] = new ModelRendererTurbo(this, 0, 500, this.textureX, this.textureY);
        super.leftTrackModel[11] = new ModelRendererTurbo(this, 0, 500, this.textureX, this.textureY);
        super.leftTrackModel[12] = new ModelRendererTurbo(this, 0, 520, this.textureX, this.textureY);
        super.leftTrackModel[13] = new ModelRendererTurbo(this, 0, 550, this.textureX, this.textureY);
        super.leftTrackModel[14] = new ModelRendererTurbo(this, 0, 570, this.textureX, this.textureY);
        super.leftTrackModel[15] = new ModelRendererTurbo(this, 0, 590, this.textureX, this.textureY);
        super.leftTrackModel[16] = new ModelRendererTurbo(this, 0, 610, this.textureX, this.textureY);
        super.leftTrackModel[17] = new ModelRendererTurbo(this, 0, 590, this.textureX, this.textureY);
        super.leftTrackModel[18] = new ModelRendererTurbo(this, 0, 590, this.textureX, this.textureY);
        super.leftTrackModel[19] = new ModelRendererTurbo(this, 0, 590, this.textureX, this.textureY);
        super.leftTrackModel[20] = new ModelRendererTurbo(this, 0, 590, this.textureX, this.textureY);
        super.leftTrackModel[21] = new ModelRendererTurbo(this, 0, 610, this.textureX, this.textureY);
        super.leftTrackModel[22] = new ModelRendererTurbo(this, 0, 610, this.textureX, this.textureY);
        super.leftTrackModel[23] = new ModelRendererTurbo(this, 0, 610, this.textureX, this.textureY);
        super.leftTrackModel[24] = new ModelRendererTurbo(this, 0, 610, this.textureX, this.textureY);
        super.leftTrackModel[25] = new ModelRendererTurbo(this, 0, 650, this.textureX, this.textureY);
        super.leftTrackModel[26] = new ModelRendererTurbo(this, 0, 670, this.textureX, this.textureY);
        super.leftTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 109, 1, 8, 0.0F);
        super.leftTrackModel[0].setRotationPoint(-73.0F, -9.0F, 18.0F);
        super.leftTrackModel[1].addBox(0.0F, 0.0F, 0.0F, 1, 9, 8, 0.0F);
        super.leftTrackModel[1].setRotationPoint(-73.0F, -8.0F, 18.0F);
        super.leftTrackModel[2].addBox(0.0F, 0.0F, 0.0F, 1, 7, 8, 0.0F);
        super.leftTrackModel[2].setRotationPoint(35.0F, -8.0F, 18.0F);
        super.leftTrackModel[3].addBox(0.0F, 0.0F, 0.0F, 85, 1, 8, 0.0F);
        super.leftTrackModel[3].setRotationPoint(-62.0F, 9.0F, 18.0F);
        super.leftTrackModel[4].addBox(0.0F, 0.0F, 0.0F, 1, 17, 8, 0.0F);
        super.leftTrackModel[4].setRotationPoint(36.0F, -1.0F, 26.01F);
        super.leftTrackModel[4].rotateAngleY = -3.1415927F;
        super.leftTrackModel[4].rotateAngleZ = 0.8552113F;
        super.leftTrackModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 14, 8, 0.0F);
        super.leftTrackModel[5].setRotationPoint(-73.0F, 1.0F, 18.01F);
        super.leftTrackModel[5].rotateAngleZ = 0.89011794F;
        super.leftTrackModel[6].addBox(0.0F, 2.0F, 0.0F, 8, 4, 7, 0.0F);
        super.leftTrackModel[6].setRotationPoint(27.0F, -8.0F, 18.0F);
        super.leftTrackModel[7].addBox(0.0F, 0.0F, 0.0F, 13, 9, 7, 0.0F);
        super.leftTrackModel[7].setRotationPoint(10.0F, -2.0F, 19.0F);
        super.leftTrackModel[8].addBox(0.0F, 2.0F, 0.0F, 13, 9, 7, 0.0F);
        super.leftTrackModel[8].setRotationPoint(-8.0F, -4.0F, 19.0F);
        super.leftTrackModel[9].addBox(0.0F, 2.0F, 0.0F, 13, 9, 7, 0.0F);
        super.leftTrackModel[9].setRotationPoint(-26.0F, -4.0F, 19.0F);
        super.leftTrackModel[10].addBox(0.0F, 2.0F, 0.0F, 13, 9, 7, 0.0F);
        super.leftTrackModel[10].setRotationPoint(-44.0F, -4.0F, 19.0F);
        super.leftTrackModel[11].addBox(0.0F, 2.0F, 0.0F, 13, 9, 7, 0.0F);
        super.leftTrackModel[11].setRotationPoint(-62.0F, -4.0F, 18.0F);
        super.leftTrackModel[12].addBox(0.0F, 2.0F, 0.0F, 9, 5, 7, 0.0F);
        super.leftTrackModel[12].setRotationPoint(-72.0F, -8.0F, 19.0F);
        super.leftTrackModel[13].addShapeBox(0.0F, 0.0F, 0.0F, 8, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F);
        super.leftTrackModel[13].setRotationPoint(27.0F, -2.0F, 18.0F);
        super.leftTrackModel[14].addShapeBox(0.0F, 0.0F, 0.0F, 8, 2, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftTrackModel[14].setRotationPoint(27.0F, -8.0F, 18.0F);
        super.leftTrackModel[15].addShapeBox(0.0F, -2.0F, 0.0F, 13, 2, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftTrackModel[15].setRotationPoint(10.0F, -2.0F, 19.0F);
        super.leftTrackModel[16].addShapeBox(0.0F, 9.0F, 0.0F, 13, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F);
        super.leftTrackModel[16].setRotationPoint(10.0F, -2.0F, 19.0F);
        super.leftTrackModel[17].addShapeBox(0.0F, -2.0F, 0.0F, 13, 2, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftTrackModel[17].setRotationPoint(-8.0F, -2.0F, 19.0F);
        super.leftTrackModel[18].addShapeBox(0.0F, -2.0F, 0.0F, 13, 2, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftTrackModel[18].setRotationPoint(-26.0F, -2.0F, 19.0F);
        super.leftTrackModel[19].addShapeBox(0.0F, -2.0F, 0.0F, 13, 2, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftTrackModel[19].setRotationPoint(-44.0F, -2.0F, 19.0F);
        super.leftTrackModel[20].addShapeBox(0.0F, -2.0F, 0.0F, 13, 2, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftTrackModel[20].setRotationPoint(-62.0F, -2.0F, 18.0F);
        super.leftTrackModel[21].addShapeBox(0.0F, 9.0F, 0.0F, 13, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F);
        super.leftTrackModel[21].setRotationPoint(-8.0F, -2.0F, 19.0F);
        super.leftTrackModel[22].addShapeBox(0.0F, 9.0F, 0.0F, 13, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F);
        super.leftTrackModel[22].setRotationPoint(-26.0F, -2.0F, 19.0F);
        super.leftTrackModel[23].addShapeBox(0.0F, 9.0F, 0.0F, 13, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F);
        super.leftTrackModel[23].setRotationPoint(-44.0F, -2.0F, 19.0F);
        super.leftTrackModel[24].addShapeBox(0.0F, 9.0F, 0.0F, 13, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F);
        super.leftTrackModel[24].setRotationPoint(-62.0F, -2.0F, 18.0F);
        super.leftTrackModel[25].addShapeBox(0.0F, 0.0F, 0.0F, 9, 2, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftTrackModel[25].setRotationPoint(-72.0F, -8.0F, 19.0F);
        super.leftTrackModel[26].addShapeBox(0.0F, 0.0F, 0.0F, 9, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F);
        super.leftTrackModel[26].setRotationPoint(-72.0F, -1.0F, 19.0F);
        super.rightTrackModel = new ModelRendererTurbo[27];
        super.rightTrackModel[0] = new ModelRendererTurbo(this, 200, 510, this.textureX, this.textureY);
        super.rightTrackModel[1] = new ModelRendererTurbo(this, 200, 530, this.textureX, this.textureY);
        super.rightTrackModel[2] = new ModelRendererTurbo(this, 200, 560, this.textureX, this.textureY);
        super.rightTrackModel[3] = new ModelRendererTurbo(this, 200, 590, this.textureX, this.textureY);
        super.rightTrackModel[4] = new ModelRendererTurbo(this, 200, 620, this.textureX, this.textureY);
        super.rightTrackModel[5] = new ModelRendererTurbo(this, 200, 650, this.textureX, this.textureY);
        super.rightTrackModel[6] = new ModelRendererTurbo(this, 0, 480, this.textureX, this.textureY);
        super.rightTrackModel[7] = new ModelRendererTurbo(this, 0, 500, this.textureX, this.textureY);
        super.rightTrackModel[8] = new ModelRendererTurbo(this, 0, 500, this.textureX, this.textureY);
        super.rightTrackModel[9] = new ModelRendererTurbo(this, 0, 500, this.textureX, this.textureY);
        super.rightTrackModel[10] = new ModelRendererTurbo(this, 0, 500, this.textureX, this.textureY);
        super.rightTrackModel[11] = new ModelRendererTurbo(this, 0, 500, this.textureX, this.textureY);
        super.rightTrackModel[12] = new ModelRendererTurbo(this, 0, 520, this.textureX, this.textureY);
        super.rightTrackModel[13] = new ModelRendererTurbo(this, 0, 570, this.textureX, this.textureY);
        super.rightTrackModel[14] = new ModelRendererTurbo(this, 0, 550, this.textureX, this.textureY);
        super.rightTrackModel[15] = new ModelRendererTurbo(this, 0, 590, this.textureX, this.textureY);
        super.rightTrackModel[16] = new ModelRendererTurbo(this, 0, 610, this.textureX, this.textureY);
        super.rightTrackModel[17] = new ModelRendererTurbo(this, 0, 590, this.textureX, this.textureY);
        super.rightTrackModel[18] = new ModelRendererTurbo(this, 0, 590, this.textureX, this.textureY);
        super.rightTrackModel[19] = new ModelRendererTurbo(this, 0, 590, this.textureX, this.textureY);
        super.rightTrackModel[20] = new ModelRendererTurbo(this, 0, 590, this.textureX, this.textureY);
        super.rightTrackModel[21] = new ModelRendererTurbo(this, 0, 610, this.textureX, this.textureY);
        super.rightTrackModel[22] = new ModelRendererTurbo(this, 0, 610, this.textureX, this.textureY);
        super.rightTrackModel[23] = new ModelRendererTurbo(this, 0, 610, this.textureX, this.textureY);
        super.rightTrackModel[24] = new ModelRendererTurbo(this, 0, 610, this.textureX, this.textureY);
        super.rightTrackModel[25] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        super.rightTrackModel[26] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        super.rightTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 109, 1, 8, 0.0F);
        super.rightTrackModel[0].setRotationPoint(-73.0F, -9.0F, -27.0F);
        super.rightTrackModel[1].addBox(0.0F, 0.0F, 0.0F, 1, 9, 8, 0.0F);
        super.rightTrackModel[1].setRotationPoint(-73.0F, -8.0F, -27.0F);
        super.rightTrackModel[2].addBox(0.0F, 0.0F, 0.0F, 1, 7, 8, 0.0F);
        super.rightTrackModel[2].setRotationPoint(35.0F, -8.0F, -27.0F);
        super.rightTrackModel[3].addBox(0.0F, 0.0F, 0.0F, 85, 1, 8, 0.0F);
        super.rightTrackModel[3].setRotationPoint(-62.0F, 9.0F, -27.0F);
        super.rightTrackModel[4].addBox(0.0F, 0.0F, 0.0F, 1, 17, 8, 0.0F);
        super.rightTrackModel[4].setRotationPoint(36.0F, -1.0F, -19.01F);
        super.rightTrackModel[4].rotateAngleY = -3.1415927F;
        super.rightTrackModel[4].rotateAngleZ = 0.87266463F;
        super.rightTrackModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 14, 8, 0.0F);
        super.rightTrackModel[5].setRotationPoint(-73.0F, 1.0F, -27.01F);
        super.rightTrackModel[5].rotateAngleZ = 0.89011794F;
        super.rightTrackModel[6].addBox(0.0F, 2.0F, 0.0F, 8, 4, 7, 0.0F);
        super.rightTrackModel[6].setRotationPoint(27.0F, -8.0F, -26.0F);
        super.rightTrackModel[7].addBox(0.0F, 2.0F, 0.0F, 13, 9, 7, 0.0F);
        super.rightTrackModel[7].setRotationPoint(10.0F, -4.0F, -26.0F);
        super.rightTrackModel[8].addBox(0.0F, 2.0F, 0.0F, 13, 9, 7, 0.0F);
        super.rightTrackModel[8].setRotationPoint(-8.0F, -4.0F, -26.0F);
        super.rightTrackModel[9].addBox(0.0F, 2.0F, 0.0F, 13, 9, 7, 0.0F);
        super.rightTrackModel[9].setRotationPoint(-26.0F, -4.0F, -26.0F);
        super.rightTrackModel[10].addBox(0.0F, 2.0F, 0.0F, 13, 9, 7, 0.0F);
        super.rightTrackModel[10].setRotationPoint(-44.0F, -4.0F, -26.0F);
        super.rightTrackModel[11].addBox(0.0F, 2.0F, 0.0F, 13, 9, 7, 0.0F);
        super.rightTrackModel[11].setRotationPoint(-62.0F, -4.0F, -26.0F);
        super.rightTrackModel[12].addBox(0.0F, 2.0F, 0.0F, 9, 5, 7, 0.0F);
        super.rightTrackModel[12].setRotationPoint(-72.0F, -8.0F, -26.0F);
        super.rightTrackModel[13].addShapeBox(0.0F, 0.0F, 0.0F, 8, 2, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightTrackModel[13].setRotationPoint(27.0F, -8.0F, -26.0F);
        super.rightTrackModel[14].addShapeBox(0.0F, 0.0F, 0.0F, 8, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F);
        super.rightTrackModel[14].setRotationPoint(27.0F, -2.0F, -26.0F);
        super.rightTrackModel[15].addShapeBox(0.0F, 0.0F, 0.0F, 13, 2, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightTrackModel[15].setRotationPoint(10.0F, -4.0F, -26.0F);
        super.rightTrackModel[16].addShapeBox(0.0F, 0.0F, 0.0F, 13, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F,
                0.0F, 0.0F);
        super.rightTrackModel[16].setRotationPoint(10.0F, 7.0F, -26.0F);
        super.rightTrackModel[17].addShapeBox(0.0F, 0.0F, 0.0F, 13, 2, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightTrackModel[17].setRotationPoint(-8.0F, -4.0F, -26.0F);
        super.rightTrackModel[18].addShapeBox(0.0F, 0.0F, 0.0F, 13, 2, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightTrackModel[18].setRotationPoint(-26.0F, -4.0F, -26.0F);
        super.rightTrackModel[19].addShapeBox(0.0F, 0.0F, 0.0F, 13, 2, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightTrackModel[19].setRotationPoint(-44.0F, -4.0F, -26.0F);
        super.rightTrackModel[20].addShapeBox(0.0F, 0.0F, 0.0F, 13, 2, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightTrackModel[20].setRotationPoint(-62.0F, -4.0F, -26.0F);
        super.rightTrackModel[21].addShapeBox(0.0F, 0.0F, 0.0F, 13, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F,
                0.0F, 0.0F);
        super.rightTrackModel[21].setRotationPoint(-8.0F, 7.0F, -26.0F);
        super.rightTrackModel[22].addShapeBox(0.0F, 0.0F, 0.0F, 13, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F,
                0.0F, 0.0F);
        super.rightTrackModel[22].setRotationPoint(-26.0F, 7.0F, -26.0F);
        super.rightTrackModel[23].addShapeBox(0.0F, 0.0F, 0.0F, 13, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F,
                0.0F, 0.0F);
        super.rightTrackModel[23].setRotationPoint(-44.0F, 7.0F, -26.0F);
        super.rightTrackModel[24].addShapeBox(0.0F, 0.0F, 0.0F, 13, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F,
                0.0F, 0.0F);
        super.rightTrackModel[24].setRotationPoint(-62.0F, 7.0F, -26.0F);
        super.rightTrackModel[25].addShapeBox(0.0F, 0.0F, 0.0F, 9, 2, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightTrackModel[25].setRotationPoint(-72.0F, -8.0F, -26.0F);
        super.rightTrackModel[26].addShapeBox(0.0F, 0.0F, 0.0F, 9, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F);
        super.rightTrackModel[26].setRotationPoint(-72.0F, -1.0F, -26.0F);
        this.translateAll(0.0F, 0.0F, 0.0F);
        this.flipAll();
    }
}
