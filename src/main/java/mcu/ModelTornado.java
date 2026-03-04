package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelTornado extends ModelPlane {

    int textureX = 512;
    int textureY = 512;

    public ModelTornado() {
        super.noseModel = new ModelRendererTurbo[2];
        super.noseModel[0] = new ModelRendererTurbo(this, 0, 45, this.textureX, this.textureY);
        super.noseModel[1] = new ModelRendererTurbo(this, 0, 85, this.textureX, this.textureY);
        super.noseModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 35, 18, 18, 0.0F, 0.0F, -8.5F, -8.5F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -8.5F, -8.5F, 0.0F, -8.5F, -8.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.5F,
                -8.5F);
        super.noseModel[0].setRotationPoint(-81.0F, -28.0F, -9.0F);
        super.noseModel[1].addBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F);
        super.noseModel[1].setRotationPoint(-91.0F, -19.5F, -0.5F);
        super.bodyModel = new ModelRendererTurbo[41];
        super.bodyModel[0] = new ModelRendererTurbo(this, 0, 90, this.textureX, this.textureY);
        super.bodyModel[1] = new ModelRendererTurbo(this, 0, 135, this.textureX, this.textureY);
        super.bodyModel[2] = new ModelRendererTurbo(this, 0, 165, this.textureX, this.textureY);
        super.bodyModel[3] = new ModelRendererTurbo(this, 0, 180, this.textureX, this.textureY);
        super.bodyModel[4] = new ModelRendererTurbo(this, 0, 205, this.textureX, this.textureY);
        super.bodyModel[5] = new ModelRendererTurbo(this, 0, 205, this.textureX, this.textureY);
        super.bodyModel[6] = new ModelRendererTurbo(this, 0, 220, this.textureX, this.textureY);
        super.bodyModel[7] = new ModelRendererTurbo(this, 0, 250, this.textureX, this.textureY);
        super.bodyModel[8] = new ModelRendererTurbo(this, 0, 220, this.textureX, this.textureY);
        super.bodyModel[9] = new ModelRendererTurbo(this, 0, 275, this.textureX, this.textureY);
        super.bodyModel[10] = new ModelRendererTurbo(this, 0, 300, this.textureX, this.textureY);
        super.bodyModel[11] = new ModelRendererTurbo(this, 0, 335, this.textureX, this.textureY);
        super.bodyModel[12] = new ModelRendererTurbo(this, 0, 350, this.textureX, this.textureY);
        super.bodyModel[13] = new ModelRendererTurbo(this, 20, 350, this.textureX, this.textureY);
        super.bodyModel[14] = new ModelRendererTurbo(this, 20, 350, this.textureX, this.textureY);
        super.bodyModel[15] = new ModelRendererTurbo(this, 35, 350, this.textureX, this.textureY);
        super.bodyModel[16] = new ModelRendererTurbo(this, 50, 350, this.textureX, this.textureY);
        super.bodyModel[17] = new ModelRendererTurbo(this, 0, 365, this.textureX, this.textureY);
        super.bodyModel[18] = new ModelRendererTurbo(this, 0, 380, this.textureX, this.textureY);
        super.bodyModel[19] = new ModelRendererTurbo(this, 0, 410, this.textureX, this.textureY);
        super.bodyModel[20] = new ModelRendererTurbo(this, 30, 410, this.textureX, this.textureY);
        super.bodyModel[21] = new ModelRendererTurbo(this, 30, 410, this.textureX, this.textureY);
        super.bodyModel[22] = new ModelRendererTurbo(this, 0, 425, this.textureX, this.textureY);
        super.bodyModel[23] = new ModelRendererTurbo(this, 0, 450, this.textureX, this.textureY);
        super.bodyModel[24] = new ModelRendererTurbo(this, 120, 0, this.textureX, this.textureY);
        super.bodyModel[25] = new ModelRendererTurbo(this, 120, 30, this.textureX, this.textureY);
        super.bodyModel[26] = new ModelRendererTurbo(this, 120, 50, this.textureX, this.textureY);
        super.bodyModel[27] = new ModelRendererTurbo(this, 120, 65, this.textureX, this.textureY);
        super.bodyModel[28] = new ModelRendererTurbo(this, 120, 50, this.textureX, this.textureY);
        super.bodyModel[29] = new ModelRendererTurbo(this, 120, 30, this.textureX, this.textureY);
        super.bodyModel[30] = new ModelRendererTurbo(this, 120, 50, this.textureX, this.textureY);
        super.bodyModel[31] = new ModelRendererTurbo(this, 120, 50, this.textureX, this.textureY);
        super.bodyModel[32] = new ModelRendererTurbo(this, 120, 65, this.textureX, this.textureY);
        super.bodyModel[33] = new ModelRendererTurbo(this, 120, 160, this.textureX, this.textureY);
        super.bodyModel[34] = new ModelRendererTurbo(this, 120, 210, this.textureX, this.textureY);
        super.bodyModel[35] = new ModelRendererTurbo(this, 120, 270, this.textureX, this.textureY);
        super.bodyModel[36] = new ModelRendererTurbo(this, 120, 300, this.textureX, this.textureY);
        super.bodyModel[37] = new ModelRendererTurbo(this, 120, 120, this.textureX, this.textureY);
        super.bodyModel[38] = new ModelRendererTurbo(this, 120, 140, this.textureX, this.textureY);
        super.bodyModel[39] = new ModelRendererTurbo(this, 120, 120, this.textureX, this.textureY);
        super.bodyModel[40] = new ModelRendererTurbo(this, 120, 140, this.textureX, this.textureY);
        super.bodyModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 24, 20, 22, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -2.0F);
        super.bodyModel[0].setRotationPoint(-46.0F, -30.0F, -11.0F);
        super.bodyModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 12, 10, 12, 0.0F, 0.0F, -8.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, -3.0F, 0.0F, -8.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -3.0F);
        super.bodyModel[1].setRotationPoint(-36.0F, -38.0F, -6.0F);
        super.bodyModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 8, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[2].setRotationPoint(-24.0F, -39.0F, -4.0F);
        super.bodyModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 2, 10, 12, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[3].setRotationPoint(-24.0F, -38.0F, -6.0F);
        super.bodyModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 2, 10, 1, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F,
                -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[4].setRotationPoint(-24.0F, -38.0F, 6.0F);
        super.bodyModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 2, 10, 1, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[5].setRotationPoint(-24.0F, -38.0F, -7.0F);
        super.bodyModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 34, 20, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
        super.bodyModel[6].setRotationPoint(-22.0F, -30.0F, -11.0F);
        super.bodyModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 19, 10, 14, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -1.0F);
        super.bodyModel[7].setRotationPoint(-22.0F, -40.0F, -7.0F);
        super.bodyModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 34, 20, 4, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[8].setRotationPoint(-22.0F, -30.0F, 7.0F);
        super.bodyModel[9].addBox(0.0F, 0.0F, 0.0F, 34, 4, 14, 0.0F);
        super.bodyModel[9].setRotationPoint(-22.0F, -14.0F, -7.0F);
        super.bodyModel[10].addBox(-4.0F, 0.0F, 0.0F, 4, 20, 14, 0.0F);
        super.bodyModel[10].setRotationPoint(-21.0F, -30.0F, -7.0F);
        super.bodyModel[10].rotateAngleZ = 0.5235988F;
        super.bodyModel[11].addBox(0.0F, -3.0F, -3.0F, 0, 6, 6, 0.0F);
        super.bodyModel[11].setRotationPoint(-15.0F, -34.0F, 0.0F);
        super.bodyModel[12].addBox(0.0F, 2.0F, 0.0F, 2, 6, 6, 0.0F);
        super.bodyModel[12].setRotationPoint(-21.0F, -30.0F, -3.0F);
        super.bodyModel[12].rotateAngleZ = 0.5235988F;
        super.bodyModel[13].addBox(0.0F, 8.0F, 5.0F, 1, 4, 4, 0.0F);
        super.bodyModel[13].setRotationPoint(-21.0F, -30.0F, -3.0F);
        super.bodyModel[13].rotateAngleZ = 0.5235988F;
        super.bodyModel[14].addBox(0.0F, 8.0F, -3.0F, 1, 4, 4, 0.0F);
        super.bodyModel[14].setRotationPoint(-21.0F, -30.0F, -3.0F);
        super.bodyModel[14].rotateAngleZ = 0.5235988F;
        super.bodyModel[15].addBox(0.0F, 0.0F, 0.0F, 4, 6, 3, 0.0F);
        super.bodyModel[15].setRotationPoint(-15.0F, -21.0F, -1.5F);
        super.bodyModel[16].addBox(0.0F, 0.0F, 0.0F, 3, 5, 1, 0.0F);
        super.bodyModel[16].setRotationPoint(-14.5F, -26.0F, -0.5F);
        super.bodyModel[17].addBox(0.0F, 0.0F, 0.0F, 10, 2, 10, 0.0F);
        super.bodyModel[17].setRotationPoint(-4.0F, -16.0F, -5.0F);
        super.bodyModel[18].addBox(0.0F, 0.0F, 0.0F, 2, 18, 10, 0.0F);
        super.bodyModel[18].setRotationPoint(6.0F, -32.0F, -5.0F);
        super.bodyModel[19].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 8, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[19].setRotationPoint(-5.0F, -41.0F, -4.0F);
        super.bodyModel[20].addShapeBox(0.0F, 0.0F, 0.0F, 2, 10, 1, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F,
                0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[20].setRotationPoint(-5.0F, -40.0F, 7.0F);
        super.bodyModel[21].addShapeBox(0.0F, 0.0F, 0.0F, 2, 10, 1, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[21].setRotationPoint(-5.0F, -40.0F, -8.0F);
        super.bodyModel[22].addShapeBox(0.0F, 0.0F, 0.0F, 15, 9, 14, 0.0F, 0.0F, 1.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F, -4.0F, 0.0F, 1.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[22].setRotationPoint(-3.0F, -39.0F, -7.0F);
        super.bodyModel[23].addShapeBox(0.0F, 0.0F, 0.0F, 25, 14, 46, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F,
                0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[23].setRotationPoint(24.0F, -30.0F, -23.0F);
        super.bodyModel[24].addShapeBox(0.0F, 0.0F, 0.0F, 12, 10, 15, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, -0.5F, -4.5F, 0.0F,
                -0.5F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[24].setRotationPoint(12.0F, -40.0F, -7.5F);
        super.bodyModel[25].addBox(0.0F, 0.0F, 0.0F, 22, 4, 12, 0.0F);
        super.bodyModel[25].setRotationPoint(2.0F, -30.0F, -23.0F);
        super.bodyModel[26].addShapeBox(0.0F, 0.0F, 0.0F, 22, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -12.0F, 0.0F,
                0.0F);
        super.bodyModel[26].setRotationPoint(2.0F, -26.0F, -13.0F);
        super.bodyModel[27].addBox(0.0F, 0.0F, 0.0F, 10, 2, 12, 0.0F);
        super.bodyModel[27].setRotationPoint(14.0F, -18.0F, -23.0F);
        super.bodyModel[28].addShapeBox(0.0F, 0.0F, 0.0F, 22, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -12.0F, 0.0F,
                0.0F);
        super.bodyModel[28].setRotationPoint(2.0F, -26.0F, -23.0F);
        super.bodyModel[29].addBox(0.0F, 0.0F, 0.0F, 22, 4, 12, 0.0F);
        super.bodyModel[29].setRotationPoint(2.0F, -30.0F, 11.0F);
        super.bodyModel[30].addShapeBox(0.0F, 0.0F, 0.0F, 22, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -12.0F, 0.0F,
                0.0F);
        super.bodyModel[30].setRotationPoint(2.0F, -26.0F, 11.0F);
        super.bodyModel[31].addShapeBox(0.0F, 0.0F, 0.0F, 22, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -12.0F, 0.0F,
                0.0F);
        super.bodyModel[31].setRotationPoint(2.0F, -26.0F, 21.0F);
        super.bodyModel[32].addBox(0.0F, 0.0F, 0.0F, 10, 2, 12, 0.0F);
        super.bodyModel[32].setRotationPoint(14.0F, -18.0F, 11.0F);
        super.bodyModel[33].addBox(0.0F, 0.0F, 0.0F, 12, 20, 22, 0.0F);
        super.bodyModel[33].setRotationPoint(12.0F, -30.0F, -11.0F);
        super.bodyModel[34].addBox(0.0F, 0.0F, 0.0F, 44, 14, 36, 0.0F);
        super.bodyModel[34].setRotationPoint(49.0F, -30.0F, -18.0F);
        super.bodyModel[35].addShapeBox(0.0F, 0.0F, 0.0F, 69, 9, 14, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[35].setRotationPoint(24.0F, -39.0F, -7.0F);
        super.bodyModel[36].addBox(0.0F, 0.0F, 0.0F, 69, 6, 22, 0.0F);
        super.bodyModel[36].setRotationPoint(24.0F, -16.0F, -11.0F);
        super.bodyModel[37].addShapeBox(0.0F, 0.0F, 0.0F, 28, 6, 11, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[37].setRotationPoint(39.0F, -29.0F, -29.0F);
        super.bodyModel[38].addShapeBox(0.0F, 0.0F, 0.0F, 20, 6, 11, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[38].setRotationPoint(19.0F, -29.0F, -29.0F);
        super.bodyModel[39].addShapeBox(0.0F, 0.0F, 0.0F, 28, 6, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[39].setRotationPoint(39.0F, -29.0F, 18.0F);
        super.bodyModel[40].addShapeBox(0.0F, 0.0F, 0.0F, 20, 6, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F);
        super.bodyModel[40].setRotationPoint(19.0F, -29.0F, 18.0F);
        super.tailModel = new ModelRendererTurbo[10];
        super.tailModel[0] = new ModelRendererTurbo(this, 120, 330, this.textureX, this.textureY);
        super.tailModel[1] = new ModelRendererTurbo(this, 120, 380, this.textureX, this.textureY);
        super.tailModel[2] = new ModelRendererTurbo(this, 120, 400, this.textureX, this.textureY);
        super.tailModel[3] = new ModelRendererTurbo(this, 200, 450, this.textureX, this.textureY);
        super.tailModel[4] = new ModelRendererTurbo(this, 200, 450, this.textureX, this.textureY);
        super.tailModel[5] = new ModelRendererTurbo(this, 240, 0, this.textureX, this.textureY);
        super.tailModel[6] = new ModelRendererTurbo(this, 240, 20, this.textureX, this.textureY);
        super.tailModel[7] = new ModelRendererTurbo(this, 240, 40, this.textureX, this.textureY);
        super.tailModel[8] = new ModelRendererTurbo(this, 240, 140, this.textureX, this.textureY);
        super.tailModel[9] = new ModelRendererTurbo(this, 240, 140, this.textureX, this.textureY);
        super.tailModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 41, 14, 32, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F);
        super.tailModel[0].setRotationPoint(93.0F, -30.0F, -16.0F);
        super.tailModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 41, 6, 10, 0.0F, 0.0F, 3.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 3.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F);
        super.tailModel[1].setRotationPoint(93.0F, -36.0F, -5.0F);
        super.tailModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 41, 6, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.tailModel[2].setRotationPoint(93.0F, -16.0F, -11.0F);
        super.tailModel[3].addBox(0.0F, 0.0F, 0.0F, 14, 12, 12, 0.0F);
        super.tailModel[3].setRotationPoint(134.0F, -29.0F, -15.0F);
        super.tailModel[4].addBox(0.0F, 0.0F, 0.0F, 14, 12, 12, 0.0F);
        super.tailModel[4].setRotationPoint(134.0F, -29.0F, 3.0F);
        super.tailModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 52, 8, 6, 0.0F, -18.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F,
                0.0F, 0.0F, -18.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.tailModel[5].setRotationPoint(61.0F, -44.0F, -3.0F);
        super.tailModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 19, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
        super.tailModel[6].setRotationPoint(79.0F, -50.0F, -3.0F);
        super.tailModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 47, 43, 2, 0.0F, -45.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, -45.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.tailModel[7].setRotationPoint(87.0F, -79.0F, -1.0F);
        super.tailModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 47, 2, 34, 0.0F, -45.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -45.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.tailModel[8].setRotationPoint(93.0F, -22.0F, -50.0F);
        super.tailModel[9].addShapeBox(0.0F, 0.0F, 0.0F, 47, 2, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, -45.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -45.0F, 0.0F,
                0.0F);
        super.tailModel[9].setRotationPoint(93.0F, -22.0F, 16.0F);
        super.yawFlapModel = new ModelRendererTurbo[1];
        super.yawFlapModel[0] = new ModelRendererTurbo(this, 240, 90, this.textureX, this.textureY);
        super.yawFlapModel[0].addShapeBox(0.0F, 0.0F, -1.0F, 27, 43, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -26.0F, 0.0F, 0.0F, -26.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.yawFlapModel[0].setRotationPoint(134.0F, -79.0F, 0.0F);
        super.pitchFlapLeftModel = new ModelRendererTurbo[1];
        super.pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 300, 200, this.textureX, this.textureY);
        super.pitchFlapLeftModel[0].addShapeBox(0.0F, -1.0F, 0.0F, 16, 2, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -15.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.pitchFlapLeftModel[0].setRotationPoint(140.0F, -21.0F, -50.0F);
        super.pitchFlapRightModel = new ModelRendererTurbo[1];
        super.pitchFlapRightModel[0] = new ModelRendererTurbo(this, 300, 200, this.textureX, this.textureY);
        super.pitchFlapRightModel[0].addShapeBox(0.0F, -1.0F, 0.0F, 16, 2, 34, 0.0F, 0.0F, 0.0F, 0.0F, -15.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.pitchFlapRightModel[0].setRotationPoint(140.0F, -21.0F, 16.0F);
        super.rightWingPos2Model = new ModelRendererTurbo[1];
        super.rightWingPos2Model[0] = new ModelRendererTurbo(this, 240, 300, this.textureX, this.textureY);
        super.rightWingPos2Model[0].addShapeBox(0.0F, 0.0F, -83.0F, 40, 3, 83, 0.0F, -27.0F, 0.0F, -4.0F, 10.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -27.0F, 0.0F, -4.0F, 10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F);
        super.rightWingPos2Model[0].setRotationPoint(38.0F, -28.0F, -18.0F);
        super.leftWingPos1Model = new ModelRendererTurbo[1];
        super.leftWingPos1Model[0] = new ModelRendererTurbo(this, 240, 300, this.textureX, this.textureY);
        super.leftWingPos1Model[0].addShapeBox(0.0F, 0.0F, 0.0F, 40, 3, 83, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                10.0F, 0.0F, 0.0F, -27.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F, -27.0F,
                0.0F, -4.0F);
        super.leftWingPos1Model[0].setRotationPoint(34.0F, -28.0F, 20.0F);
        super.leftWingPos1Model[0].rotateAngleY = -0.7679449F;
        super.rightWingPos1Model = new ModelRendererTurbo[1];
        super.rightWingPos1Model[0] = new ModelRendererTurbo(this, 240, 300, this.textureX, this.textureY);
        super.rightWingPos1Model[0].addShapeBox(0.0F, 0.0F, -83.0F, 40, 3, 83, 0.0F, -27.0F, 0.0F, -4.0F, 10.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -27.0F, 0.0F, -4.0F, 10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F);
        super.rightWingPos1Model[0].setRotationPoint(34.0F, -28.0F, -20.0F);
        super.rightWingPos1Model[0].rotateAngleY = 0.7679449F;
        super.bodyWheelModel = new ModelRendererTurbo[8];
        super.bodyWheelModel[0] = new ModelRendererTurbo(this, 400, 0, this.textureX, this.textureY);
        super.bodyWheelModel[1] = new ModelRendererTurbo(this, 400, 20, this.textureX, this.textureY);
        super.bodyWheelModel[2] = new ModelRendererTurbo(this, 400, 45, this.textureX, this.textureY);
        super.bodyWheelModel[3] = new ModelRendererTurbo(this, 400, 60, this.textureX, this.textureY);
        super.bodyWheelModel[4] = new ModelRendererTurbo(this, 400, 60, this.textureX, this.textureY);
        super.bodyWheelModel[5] = new ModelRendererTurbo(this, 400, 45, this.textureX, this.textureY);
        super.bodyWheelModel[6] = new ModelRendererTurbo(this, 400, 60, this.textureX, this.textureY);
        super.bodyWheelModel[7] = new ModelRendererTurbo(this, 400, 60, this.textureX, this.textureY);
        super.bodyWheelModel[0].addBox(0.0F, 0.0F, 0.0F, 10, 6, 6, 0.0F);
        super.bodyWheelModel[0].setRotationPoint(-17.0F, -10.0F, -3.0F);
        super.bodyWheelModel[1].addBox(0.0F, 0.0F, 0.0F, 6, 10, 2, 0.0F);
        super.bodyWheelModel[1].setRotationPoint(-15.0F, -4.0F, -1.0F);
        super.bodyWheelModel[2].addBox(0.0F, 0.0F, 0.0F, 10, 6, 2, 0.0F);
        super.bodyWheelModel[2].setRotationPoint(-17.0F, 2.0F, -3.0F);
        super.bodyWheelModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 10, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyWheelModel[3].setRotationPoint(-17.0F, 0.0F, -3.0F);
        super.bodyWheelModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F);
        super.bodyWheelModel[4].setRotationPoint(-17.0F, 8.0F, -3.0F);
        super.bodyWheelModel[5].addBox(0.0F, 0.0F, 0.0F, 10, 6, 2, 0.0F);
        super.bodyWheelModel[5].setRotationPoint(-17.0F, 2.0F, 1.0F);
        super.bodyWheelModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 10, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyWheelModel[6].setRotationPoint(-17.0F, 0.0F, 1.0F);
        super.bodyWheelModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F);
        super.bodyWheelModel[7].setRotationPoint(-17.0F, 8.0F, 1.0F);
        super.leftWingWheelModel = new ModelRendererTurbo[5];
        super.leftWingWheelModel[0] = new ModelRendererTurbo(this, 400, 80, this.textureX, this.textureY);
        super.leftWingWheelModel[1] = new ModelRendererTurbo(this, 400, 20, this.textureX, this.textureY);
        super.leftWingWheelModel[2] = new ModelRendererTurbo(this, 400, 45, this.textureX, this.textureY);
        super.leftWingWheelModel[3] = new ModelRendererTurbo(this, 400, 60, this.textureX, this.textureY);
        super.leftWingWheelModel[4] = new ModelRendererTurbo(this, 400, 60, this.textureX, this.textureY);
        super.leftWingWheelModel[0].addBox(0.0F, 0.0F, 0.0F, 10, 12, 6, 0.0F);
        super.leftWingWheelModel[0].setRotationPoint(73.0F, -16.0F, -18.0F);
        super.leftWingWheelModel[1].addBox(0.0F, 0.0F, 0.0F, 6, 10, 2, 0.0F);
        super.leftWingWheelModel[1].setRotationPoint(75.0F, -4.0F, -16.0F);
        super.leftWingWheelModel[2].addBox(0.0F, 0.0F, 0.0F, 10, 6, 2, 0.0F);
        super.leftWingWheelModel[2].setRotationPoint(73.0F, 2.0F, -18.0F);
        super.leftWingWheelModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 10, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftWingWheelModel[3].setRotationPoint(73.0F, 0.0F, -18.0F);
        super.leftWingWheelModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F,
                0.0F, 0.0F);
        super.leftWingWheelModel[4].setRotationPoint(73.0F, 8.0F, -18.0F);
        super.rightWingWheelModel = new ModelRendererTurbo[5];
        super.rightWingWheelModel[0] = new ModelRendererTurbo(this, 400, 80, this.textureX, this.textureY);
        super.rightWingWheelModel[1] = new ModelRendererTurbo(this, 400, 20, this.textureX, this.textureY);
        super.rightWingWheelModel[2] = new ModelRendererTurbo(this, 400, 45, this.textureX, this.textureY);
        super.rightWingWheelModel[3] = new ModelRendererTurbo(this, 400, 60, this.textureX, this.textureY);
        super.rightWingWheelModel[4] = new ModelRendererTurbo(this, 400, 60, this.textureX, this.textureY);
        super.rightWingWheelModel[0].addBox(0.0F, 0.0F, 0.0F, 10, 12, 6, 0.0F);
        super.rightWingWheelModel[0].setRotationPoint(73.0F, -16.0F, 12.0F);
        super.rightWingWheelModel[1].addBox(0.0F, 0.0F, 0.0F, 6, 10, 2, 0.0F);
        super.rightWingWheelModel[1].setRotationPoint(75.0F, -4.0F, 14.0F);
        super.rightWingWheelModel[2].addBox(0.0F, 0.0F, 0.0F, 10, 6, 2, 0.0F);
        super.rightWingWheelModel[2].setRotationPoint(73.0F, 2.0F, 16.0F);
        super.rightWingWheelModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 10, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightWingWheelModel[3].setRotationPoint(73.0F, 0.0F, 16.0F);
        super.rightWingWheelModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F,
                0.0F, 0.0F);
        super.rightWingWheelModel[4].setRotationPoint(73.0F, 8.0F, 16.0F);
        super.leftWingPos2Model = new ModelRendererTurbo[1];
        super.leftWingPos2Model[0] = new ModelRendererTurbo(this, 240, 300, this.textureX, this.textureY);
        super.leftWingPos2Model[0].addShapeBox(0.0F, 0.0F, 0.0F, 40, 3, 83, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                10.0F, 0.0F, 0.0F, -27.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F, -27.0F,
                0.0F, -4.0F);
        super.leftWingPos2Model[0].setRotationPoint(38.0F, -28.0F, 18.0F);
        this.translateAll(0, 0, 0);
        super.propellerModels = new ModelRendererTurbo[1][1];
        super.propellerModels[0][0] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        super.propellerModels[0][0].addBox(0.0F, 0.0F, 0.0F, 10, 2, 2, 0.0F);
        super.propellerModels[0][0].setRotationPoint(65.0F, -23.0F, -1.0F);
        this.flipAll();
    }

    private ModelRendererTurbo[] makeProp(int i, int j, int k) {
        ModelRendererTurbo[] prop = new ModelRendererTurbo[0];
        return prop;
    }
}
