package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelSU25 extends ModelPlane {

    int textureX = 1024;
    int textureY = 1024;

    public ModelSU25() {
        super.bodyModel = new ModelRendererTurbo[49];
        super.bodyModel[0] = new ModelRendererTurbo(this, 0, 100, this.textureX, this.textureY);
        super.bodyModel[1] = new ModelRendererTurbo(this, 0, 130, this.textureX, this.textureY);
        super.bodyModel[2] = new ModelRendererTurbo(this, 0, 180, this.textureX, this.textureY);
        super.bodyModel[3] = new ModelRendererTurbo(this, 0, 230, this.textureX, this.textureY);
        super.bodyModel[4] = new ModelRendererTurbo(this, 0, 260, this.textureX, this.textureY);
        super.bodyModel[5] = new ModelRendererTurbo(this, 0, 300, this.textureX, this.textureY);
        super.bodyModel[6] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        super.bodyModel[7] = new ModelRendererTurbo(this, 0, 370, this.textureX, this.textureY);
        super.bodyModel[8] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        super.bodyModel[9] = new ModelRendererTurbo(this, 0, 400, this.textureX, this.textureY);
        super.bodyModel[10] = new ModelRendererTurbo(this, 0, 440, this.textureX, this.textureY);
        super.bodyModel[11] = new ModelRendererTurbo(this, 0, 470, this.textureX, this.textureY);
        super.bodyModel[12] = new ModelRendererTurbo(this, 0, 520, this.textureX, this.textureY);
        super.bodyModel[13] = new ModelRendererTurbo(this, 0, 550, this.textureX, this.textureY);
        super.bodyModel[14] = new ModelRendererTurbo(this, 0, 600, this.textureX, this.textureY);
        super.bodyModel[15] = new ModelRendererTurbo(this, 0, 650, this.textureX, this.textureY);
        super.bodyModel[16] = new ModelRendererTurbo(this, 0, 710, this.textureX, this.textureY);
        super.bodyModel[17] = new ModelRendererTurbo(this, 0, 780, this.textureX, this.textureY);
        super.bodyModel[18] = new ModelRendererTurbo(this, 0, 850, this.textureX, this.textureY);
        super.bodyModel[19] = new ModelRendererTurbo(this, 0, 850, this.textureX, this.textureY);
        super.bodyModel[20] = new ModelRendererTurbo(this, 0, 860, this.textureX, this.textureY);
        super.bodyModel[21] = new ModelRendererTurbo(this, 0, 880, this.textureX, this.textureY);
        super.bodyModel[22] = new ModelRendererTurbo(this, 0, 860, this.textureX, this.textureY);
        super.bodyModel[23] = new ModelRendererTurbo(this, 0, 910, this.textureX, this.textureY);
        super.bodyModel[24] = new ModelRendererTurbo(this, 0, 910, this.textureX, this.textureY);
        super.bodyModel[25] = new ModelRendererTurbo(this, 0, 930, this.textureX, this.textureY);
        super.bodyModel[26] = new ModelRendererTurbo(this, 0, 930, this.textureX, this.textureY);
        super.bodyModel[27] = new ModelRendererTurbo(this, 0, 940, this.textureX, this.textureY);
        super.bodyModel[28] = new ModelRendererTurbo(this, 200, 0, this.textureX, this.textureY);
        super.bodyModel[29] = new ModelRendererTurbo(this, 200, 70, this.textureX, this.textureY);
        super.bodyModel[30] = new ModelRendererTurbo(this, 200, 140, this.textureX, this.textureY);
        super.bodyModel[31] = new ModelRendererTurbo(this, 200, 170, this.textureX, this.textureY);
        super.bodyModel[32] = new ModelRendererTurbo(this, 200, 200, this.textureX, this.textureY);
        super.bodyModel[33] = new ModelRendererTurbo(this, 200, 230, this.textureX, this.textureY);
        super.bodyModel[34] = new ModelRendererTurbo(this, 200, 260, this.textureX, this.textureY);
        super.bodyModel[35] = new ModelRendererTurbo(this, 200, 320, this.textureX, this.textureY);
        super.bodyModel[36] = new ModelRendererTurbo(this, 200, 380, this.textureX, this.textureY);
        super.bodyModel[37] = new ModelRendererTurbo(this, 200, 430, this.textureX, this.textureY);
        super.bodyModel[38] = new ModelRendererTurbo(this, 200, 480, this.textureX, this.textureY);
        super.bodyModel[39] = new ModelRendererTurbo(this, 200, 140, this.textureX, this.textureY);
        super.bodyModel[40] = new ModelRendererTurbo(this, 200, 200, this.textureX, this.textureY);
        super.bodyModel[41] = new ModelRendererTurbo(this, 200, 230, this.textureX, this.textureY);
        super.bodyModel[42] = new ModelRendererTurbo(this, 200, 170, this.textureX, this.textureY);
        super.bodyModel[43] = new ModelRendererTurbo(this, 200, 260, this.textureX, this.textureY);
        super.bodyModel[44] = new ModelRendererTurbo(this, 200, 320, this.textureX, this.textureY);
        super.bodyModel[45] = new ModelRendererTurbo(this, 200, 380, this.textureX, this.textureY);
        super.bodyModel[46] = new ModelRendererTurbo(this, 200, 430, this.textureX, this.textureY);
        super.bodyModel[47] = new ModelRendererTurbo(this, 200, 480, this.textureX, this.textureY);
        super.bodyModel[48] = new ModelRendererTurbo(this, 0, 70, this.textureX, this.textureY);
        super.bodyModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 21, 12, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 5.0F, 0.0F,
                7.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 5.0F, 0.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[0].setRotationPoint(-145.0F, -29.0F, -5.0F);
        super.bodyModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 9, 23, 20, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F,
                0.0F, 1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[1].setRotationPoint(-124.0F, -38.0F, -10.0F);
        super.bodyModel[2].addBox(0.0F, 0.0F, 0.0F, 8, 23, 22, 0.0F);
        super.bodyModel[2].setRotationPoint(-115.0F, -38.0F, -11.0F);
        super.bodyModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 8, 5, 17, 0.0F, 0.0F, -5.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F,
                0.0F, -1.0F, 0.0F, -5.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F,
                -3.0F);
        super.bodyModel[3].setRotationPoint(-115.0F, -43.0F, -8.5F);
        super.bodyModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 39, 29, 2, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[4].setRotationPoint(-107.0F, -44.0F, -11.0F);
        super.bodyModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 39, 29, 2, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[5].setRotationPoint(-107.0F, -44.0F, 9.0F);
        super.bodyModel[6].addBox(0.0F, 0.0F, 0.0F, 79, 2, 18, 0.0F);
        super.bodyModel[6].setRotationPoint(-107.0F, -17.0F, -9.0F);
        super.bodyModel[7].addBox(0.0F, 0.0F, 0.0F, 11, 12, 12, 0.0F);
        super.bodyModel[7].setRotationPoint(-71.0F, -53.0F, -6.0F);
        super.bodyModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 3, 12, 12, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F,
                -1.0F);
        super.bodyModel[8].setRotationPoint(-74.0F, -53.0F, -6.0F);
        super.bodyModel[9].addBox(0.0F, 0.0F, 0.0F, 11, 23, 14, 0.0F);
        super.bodyModel[9].setRotationPoint(-71.0F, -41.0F, -7.0F);
        super.bodyModel[10].addBox(0.0F, 0.0F, 0.0F, 14, 6, 14, 0.0F);
        super.bodyModel[10].setRotationPoint(-85.0F, -24.0F, -7.0F);
        super.bodyModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 10, 23, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 4.0F, -1.0F, 0.0F, 4.0F, -1.0F, 0.0F, 0.0F, -1.0F,
                0.0F);
        super.bodyModel[11].setRotationPoint(-107.0F, -38.0F, -9.0F);
        super.bodyModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 10, 3, 17, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F, -4.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[12].setRotationPoint(-107.0F, -41.0F, -9.0F);
        super.bodyModel[13].addShapeBox(0.0F, 0.0F, 0.0F, 40, 42, 2, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[13].setRotationPoint(-68.0F, -57.0F, -11.0F);
        super.bodyModel[14].addShapeBox(0.0F, 0.0F, 0.0F, 40, 42, 2, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[14].setRotationPoint(-68.0F, -57.0F, 9.0F);
        super.bodyModel[15].addShapeBox(0.0F, 0.0F, 0.0F, 30, 32, 18, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -13.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[15].setRotationPoint(-58.0F, -49.0F, -9.0F);
        super.bodyModel[16].addShapeBox(0.0F, 0.0F, 0.0F, 46, 42, 22, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[16].setRotationPoint(-28.0F, -57.0F, -11.0F);
        super.bodyModel[17].addBox(0.0F, 0.0F, 0.0F, 24, 42, 20, 0.0F);
        super.bodyModel[17].setRotationPoint(-52.0F, -60.0F, -10.0F);
        super.bodyModel[18].addShapeBox(0.0F, 0.0F, 0.0F, 16, 2, 4, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F);
        super.bodyModel[18].setRotationPoint(-68.0F, -60.0F, -10.0F);
        super.bodyModel[19].addShapeBox(0.0F, 0.0F, 0.0F, 16, 2, 4, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F);
        super.bodyModel[19].setRotationPoint(-68.0F, -60.0F, 6.0F);
        super.bodyModel[20].addShapeBox(0.0F, 0.0F, 0.0F, 4, 16, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F);
        super.bodyModel[20].setRotationPoint(-72.0F, -58.0F, -10.0F);
        super.bodyModel[21].addBox(0.0F, 0.0F, 0.0F, 4, 2, 18, 0.0F);
        super.bodyModel[21].setRotationPoint(-72.0F, -58.0F, -9.0F);
        super.bodyModel[22].addShapeBox(0.0F, 0.0F, 0.0F, 4, 16, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[22].setRotationPoint(-72.0F, -58.0F, 9.0F);
        super.bodyModel[23].addShapeBox(0.0F, 0.0F, 0.0F, 1, 13, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 1.0F, 0.0F,
                -0.1F);
        super.bodyModel[23].setRotationPoint(-73.0F, -54.0F, -10.0F);
        super.bodyModel[24].addShapeBox(0.0F, 0.0F, 0.0F, 1, 13, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F,
                0.0F);
        super.bodyModel[24].setRotationPoint(-73.0F, -54.0F, 9.0F);
        super.bodyModel[25].addShapeBox(0.0F, 0.0F, 0.0F, 28, 2, 2, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 11.0F,
                0.0F);
        super.bodyModel[25].setRotationPoint(-100.0F, -58.0F, -10.0F);
        super.bodyModel[26].addShapeBox(0.0F, 0.0F, 0.0F, 28, 2, 2, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 11.0F,
                0.0F);
        super.bodyModel[26].setRotationPoint(-100.0F, -58.0F, 8.0F);
        super.bodyModel[27].addShapeBox(0.0F, 0.0F, 0.0F, 7, 9, 20, 0.0F, 0.0F, -4.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -4.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -0.5F);
        super.bodyModel[27].setRotationPoint(-107.0F, -47.0F, -10.0F);
        super.bodyModel[28].addBox(0.0F, 0.0F, 0.0F, 13, 42, 22, 0.0F);
        super.bodyModel[28].setRotationPoint(18.0F, -57.0F, -11.0F);
        super.bodyModel[29].addShapeBox(0.0F, 0.0F, 0.0F, 23, 42, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[29].setRotationPoint(31.0F, -57.0F, -11.0F);
        super.bodyModel[30].addShapeBox(0.0F, 0.0F, 0.0F, 25, 7, 17, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[30].setRotationPoint(-52.0F, -46.0F, -28.0F);
        super.bodyModel[31].addShapeBox(0.0F, 0.0F, 0.0F, 23, 16, 2, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[31].setRotationPoint(-50.0F, -39.0F, -28.0F);
        super.bodyModel[32].addShapeBox(0.0F, 0.0F, 0.0F, 23, 16, 2, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[32].setRotationPoint(-50.0F, -39.0F, -13.0F);
        super.bodyModel[33].addShapeBox(0.0F, 0.0F, 0.0F, 23, 7, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F);
        super.bodyModel[33].setRotationPoint(-50.0F, -23.0F, -28.0F);
        super.bodyModel[34].addShapeBox(0.0F, 0.0F, 0.0F, 26, 32, 17, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[34].setRotationPoint(-27.0F, -48.0F, -28.0F);
        super.bodyModel[35].addBox(0.0F, 0.0F, 0.0F, 21, 32, 17, 0.0F);
        super.bodyModel[35].setRotationPoint(-1.0F, -48.0F, -28.0F);
        super.bodyModel[36].addShapeBox(0.0F, 0.0F, 0.0F, 13, 29, 17, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
        super.bodyModel[36].setRotationPoint(20.0F, -46.0F, -28.0F);
        super.bodyModel[37].addShapeBox(0.0F, 0.0F, 0.0F, 23, 24, 19, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
        super.bodyModel[37].setRotationPoint(33.0F, -42.0F, -28.0F);
        super.bodyModel[38].addShapeBox(0.0F, 0.0F, 0.0F, 23, 18, 20, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, -7.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[38].setRotationPoint(56.0F, -36.0F, -28.0F);
        super.bodyModel[39].addShapeBox(0.0F, 0.0F, 0.0F, 25, 7, 17, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[39].setRotationPoint(-52.0F, -46.0F, 11.0F);
        super.bodyModel[40].addShapeBox(0.0F, 0.0F, 0.0F, 23, 16, 2, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[40].setRotationPoint(-50.0F, -39.0F, 26.0F);
        super.bodyModel[41].addShapeBox(0.0F, 0.0F, 0.0F, 23, 7, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F);
        super.bodyModel[41].setRotationPoint(-50.0F, -23.0F, 11.0F);
        super.bodyModel[42].addShapeBox(0.0F, 0.0F, 0.0F, 23, 16, 2, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[42].setRotationPoint(-50.0F, -39.0F, 11.0F);
        super.bodyModel[43].addShapeBox(0.0F, 0.0F, 0.0F, 26, 32, 17, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[43].setRotationPoint(-27.0F, -48.0F, 11.0F);
        super.bodyModel[44].addBox(0.0F, 0.0F, 0.0F, 21, 32, 17, 0.0F);
        super.bodyModel[44].setRotationPoint(-1.0F, -48.0F, 11.0F);
        super.bodyModel[45].addShapeBox(0.0F, 0.0F, 0.0F, 13, 29, 17, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
        super.bodyModel[45].setRotationPoint(20.0F, -46.0F, 11.0F);
        super.bodyModel[46].addShapeBox(0.0F, 0.0F, 0.0F, 23, 24, 19, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
        super.bodyModel[46].setRotationPoint(33.0F, -42.0F, 9.0F);
        super.bodyModel[47].addShapeBox(0.0F, 0.0F, 0.0F, 23, 18, 20, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, -7.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, -7.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[47].setRotationPoint(56.0F, -36.0F, 8.0F);
        super.bodyModel[48].addShapeBox(0.0F, 0.0F, 0.0F, 10, 12, 10, 0.0F, 0.0F, -4.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -4.0F, -4.0F, -6.0F, -1.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, -1.5F,
                -2.0F);
        super.bodyModel[48].setRotationPoint(-155.0F, -29.0F, -5.0F);
        super.tailModel = new ModelRendererTurbo[8];
        super.tailModel[0] = new ModelRendererTurbo(this, 200, 530, this.textureX, this.textureY);
        super.tailModel[1] = new ModelRendererTurbo(this, 200, 590, this.textureX, this.textureY);
        super.tailModel[2] = new ModelRendererTurbo(this, 200, 630, this.textureX, this.textureY);
        super.tailModel[3] = new ModelRendererTurbo(this, 200, 700, this.textureX, this.textureY);
        super.tailModel[4] = new ModelRendererTurbo(this, 200, 730, this.textureX, this.textureY);
        super.tailModel[5] = new ModelRendererTurbo(this, 200, 730, this.textureX, this.textureY);
        super.tailModel[6] = new ModelRendererTurbo(this, 200, 790, this.textureX, this.textureY);
        super.tailModel[7] = new ModelRendererTurbo(this, 200, 730, this.textureX, this.textureY);
        super.tailModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 31, 35, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -4.0F, 0.0F,
                -1.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, -4.0F, 0.0F, -11.0F, -4.0F, 0.0F, 0.0F,
                0.0F);
        super.tailModel[0].setRotationPoint(54.0F, -56.0F, -11.0F);
        super.tailModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 44, 23, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.tailModel[1].setRotationPoint(85.0F, -55.0F, -7.0F);
        super.tailModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 51, 54, 4, 0.0F, -37.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, -37.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.tailModel[2].setRotationPoint(66.0F, -109.0F, -2.0F);
        super.tailModel[3].addBox(0.0F, 0.0F, 0.0F, 31, 17, 4, 0.0F);
        super.tailModel[3].setRotationPoint(117.0F, -72.0F, -2.0F);
        super.tailModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 11, 8, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.55F, 0.0F, 0.0F, 1.55F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.tailModel[4].setRotationPoint(117.0F, -109.0F, -2.0F);
        super.tailModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 29, 4, 46, 0.0F, -20.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -20.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.tailModel[5].setRotationPoint(95.0F, -53.0F, -53.0F);
        super.tailModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 23, 14, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, -4.0F, 0.0F, -8.0F, -4.0F, 0.0F, 0.0F,
                0.0F);
        super.tailModel[6].setRotationPoint(129.0F, -55.0F, -7.0F);
        super.tailModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 29, 4, 46, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, -20.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -20.0F, 0.0F,
                0.0F);
        super.tailModel[7].setRotationPoint(95.0F, -53.0F, 7.0F);
        super.leftWingModel = new ModelRendererTurbo[13];
        super.leftWingModel[0] = new ModelRendererTurbo(this, 220, 850, this.textureX, this.textureY);
        super.leftWingModel[1] = new ModelRendererTurbo(this, 200, 890, this.textureX, this.textureY);
        super.leftWingModel[2] = new ModelRendererTurbo(this, 200, 920, this.textureX, this.textureY);
        super.leftWingModel[3] = new ModelRendererTurbo(this, 400, 0, this.textureX, this.textureY);
        super.leftWingModel[4] = new ModelRendererTurbo(this, 200, 940, this.textureX, this.textureY);
        super.leftWingModel[5] = new ModelRendererTurbo(this, 400, 70, this.textureX, this.textureY);
        super.leftWingModel[6] = new ModelRendererTurbo(this, 400, 70, this.textureX, this.textureY);
        super.leftWingModel[7] = new ModelRendererTurbo(this, 400, 70, this.textureX, this.textureY);
        super.leftWingModel[8] = new ModelRendererTurbo(this, 400, 70, this.textureX, this.textureY);
        super.leftWingModel[9] = new ModelRendererTurbo(this, 400, 420, this.textureX, this.textureY);
        super.leftWingModel[10] = new ModelRendererTurbo(this, 400, 460, this.textureX, this.textureY);
        super.leftWingModel[11] = new ModelRendererTurbo(this, 400, 460, this.textureX, this.textureY);
        super.leftWingModel[12] = new ModelRendererTurbo(this, 400, 420, this.textureX, this.textureY);
        super.leftWingModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 57, 6, 121, 0.0F, -48.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -44.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftWingModel[0].setRotationPoint(-27.0F, -46.0F, -149.0F);
        super.leftWingModel[1].addBox(0.0F, 0.0F, 0.0F, 37, 8, 11, 0.0F);
        super.leftWingModel[1].setRotationPoint(11.0F, -47.0F, -160.0F);
        super.leftWingModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 6, 8, 11, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F,
                -2.0F);
        super.leftWingModel[2].setRotationPoint(5.0F, -47.0F, -160.0F);
        super.leftWingModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 11, 6, 52, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F,
                -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.leftWingModel[3].setRotationPoint(30.0F, -46.0F, -149.0F);
        super.leftWingModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 2, 8, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F,
                -2.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F,
                0.0F);
        super.leftWingModel[4].setRotationPoint(48.0F, -47.0F, -160.0F);
        super.leftWingModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 40, 7, 3, 0.0F, -16.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F,
                10.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftWingModel[5].setRotationPoint(-35.0F, -40.0F, -47.0F);
        super.leftWingModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 40, 7, 3, 0.0F, -16.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F,
                10.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftWingModel[6].setRotationPoint(-29.0F, -40.0F, -66.0F);
        super.leftWingModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 40, 7, 3, 0.0F, -16.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F,
                10.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftWingModel[7].setRotationPoint(-15.0F, -40.0F, -104.0F);
        super.leftWingModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 40, 7, 3, 0.0F, -16.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F,
                10.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftWingModel[8].setRotationPoint(-21.0F, -40.0F, -85.0F);
        super.leftWingModel[9].addBox(0.0F, 0.0F, 0.0F, 50, 9, 9, 0.0F);
        super.leftWingModel[9].setRotationPoint(-35.0F, -33.0F, -49.0F);
        super.leftWingModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 9, 9, 9, 0.0F, 0.0F, -4.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -4.0F, -4.0F, 0.0F, -4.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F,
                -4.0F);
        super.leftWingModel[10].setRotationPoint(-44.0F, -33.0F, -49.0F);
        super.leftWingModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 9, 9, 9, 0.0F, 0.0F, -4.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -4.0F, -4.0F, 0.0F, -4.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F,
                -4.0F);
        super.leftWingModel[11].setRotationPoint(-38.0F, -33.0F, -69.0F);
        super.leftWingModel[12].addBox(0.0F, 0.0F, 0.0F, 50, 9, 9, 0.0F);
        super.leftWingModel[12].setRotationPoint(-29.0F, -33.0F, -69.0F);
        super.rightWingModel = new ModelRendererTurbo[13];
        super.rightWingModel[0] = new ModelRendererTurbo(this, 400, 70, this.textureX, this.textureY);
        super.rightWingModel[1] = new ModelRendererTurbo(this, 400, 70, this.textureX, this.textureY);
        super.rightWingModel[2] = new ModelRendererTurbo(this, 400, 70, this.textureX, this.textureY);
        super.rightWingModel[3] = new ModelRendererTurbo(this, 400, 70, this.textureX, this.textureY);
        super.rightWingModel[4] = new ModelRendererTurbo(this, 220, 850, this.textureX, this.textureY);
        super.rightWingModel[5] = new ModelRendererTurbo(this, 400, 0, this.textureX, this.textureY);
        super.rightWingModel[6] = new ModelRendererTurbo(this, 200, 890, this.textureX, this.textureY);
        super.rightWingModel[7] = new ModelRendererTurbo(this, 200, 920, this.textureX, this.textureY);
        super.rightWingModel[8] = new ModelRendererTurbo(this, 200, 940, this.textureX, this.textureY);
        super.rightWingModel[9] = new ModelRendererTurbo(this, 400, 420, this.textureX, this.textureY);
        super.rightWingModel[10] = new ModelRendererTurbo(this, 400, 460, this.textureX, this.textureY);
        super.rightWingModel[11] = new ModelRendererTurbo(this, 400, 460, this.textureX, this.textureY);
        super.rightWingModel[12] = new ModelRendererTurbo(this, 400, 420, this.textureX, this.textureY);
        super.rightWingModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 40, 7, 3, 0.0F, -16.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F,
                10.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightWingModel[0].setRotationPoint(-35.0F, -40.0F, 44.0F);
        super.rightWingModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 40, 7, 3, 0.0F, -16.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F,
                10.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightWingModel[1].setRotationPoint(-29.0F, -40.0F, 63.0F);
        super.rightWingModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 40, 7, 3, 0.0F, -16.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F,
                10.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightWingModel[2].setRotationPoint(-21.0F, -40.0F, 82.0F);
        super.rightWingModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 40, 7, 3, 0.0F, -16.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F,
                10.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightWingModel[3].setRotationPoint(-15.0F, -40.0F, 101.0F);
        super.rightWingModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 57, 6, 121, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -48.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -44.0F,
                0.0F, 0.0F);
        super.rightWingModel[4].setRotationPoint(-27.0F, -46.0F, 28.0F);
        super.rightWingModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 11, 6, 52, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightWingModel[5].setRotationPoint(30.0F, -46.0F, 97.0F);
        super.rightWingModel[6].addBox(0.0F, 0.0F, 0.0F, 37, 8, 11, 0.0F);
        super.rightWingModel[6].setRotationPoint(11.0F, -47.0F, 149.0F);
        super.rightWingModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 6, 8, 11, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -2.0F, -2.0F);
        super.rightWingModel[7].setRotationPoint(5.0F, -47.0F, 149.0F);
        super.rightWingModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 2, 8, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F,
                0.0F, -2.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F,
                0.0F, 0.0F);
        super.rightWingModel[8].setRotationPoint(48.0F, -47.0F, 149.0F);
        super.rightWingModel[9].addBox(0.0F, 0.0F, 0.0F, 50, 9, 9, 0.0F);
        super.rightWingModel[9].setRotationPoint(-29.0F, -33.0F, 60.0F);
        super.rightWingModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 9, 9, 9, 0.0F, 0.0F, -4.0F, -4.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -4.0F, -4.0F, 0.0F, -4.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -4.0F, -4.0F);
        super.rightWingModel[10].setRotationPoint(-38.0F, -33.0F, 60.0F);
        super.rightWingModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 9, 9, 9, 0.0F, 0.0F, -4.0F, -4.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -4.0F, -4.0F, 0.0F, -4.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -4.0F, -4.0F);
        super.rightWingModel[11].setRotationPoint(-44.0F, -33.0F, 40.0F);
        super.rightWingModel[12].addBox(0.0F, 0.0F, 0.0F, 50, 9, 9, 0.0F);
        super.rightWingModel[12].setRotationPoint(-35.0F, -33.0F, 40.0F);
        super.yawFlapModel = new ModelRendererTurbo[1];
        super.yawFlapModel[0] = new ModelRendererTurbo(this, 400, 170, this.textureX, this.textureY);
        super.yawFlapModel[0].addShapeBox(0.0F, 0.0F, -2.0F, 11, 29, 4, 0.0F, 0.0F, 0.0F, 0.0F, 1.55F, 0.0F, 0.0F,
                1.55F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.35F, 0.0F, 0.0F, 7.35F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.yawFlapModel[0].setRotationPoint(117.0F, -101.0F, 0.0F);
        super.pitchFlapLeftModel = new ModelRendererTurbo[1];
        super.pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 200, 830, this.textureX, this.textureY);
        super.pitchFlapLeftModel[0].addShapeBox(0.0F, -2.0F, 0.0F, 12, 4, 48, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.pitchFlapLeftModel[0].setRotationPoint(124.0F, -51.0F, -53.0F);
        super.pitchFlapRightModel = new ModelRendererTurbo[1];
        super.pitchFlapRightModel[0] = new ModelRendererTurbo(this, 200, 830, this.textureX, this.textureY);
        super.pitchFlapRightModel[0].addShapeBox(0.0F, -2.0F, 0.0F, 12, 4, 48, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.pitchFlapRightModel[0].setRotationPoint(124.0F, -51.0F, 5.0F);
        super.pitchFlapLeftWingModel = new ModelRendererTurbo[1];
        super.pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 400, 90, this.textureX, this.textureY);
        super.pitchFlapLeftWingModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 11, 6, 70, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F,
                0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.pitchFlapLeftWingModel[0].setRotationPoint(30.0F, -46.0F, -97.0F);
        super.pitchFlapRightWingModel = new ModelRendererTurbo[1];
        super.pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 400, 90, this.textureX, this.textureY);
        super.pitchFlapRightWingModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 11, 6, 70, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F,
                0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.pitchFlapRightWingModel[0].setRotationPoint(30.0F, -46.0F, 27.0F);
        super.bodyWheelModel = new ModelRendererTurbo[8];
        super.bodyWheelModel[0] = new ModelRendererTurbo(this, 400, 220, this.textureX, this.textureY);
        super.bodyWheelModel[1] = new ModelRendererTurbo(this, 400, 250, this.textureX, this.textureY);
        super.bodyWheelModel[2] = new ModelRendererTurbo(this, 400, 250, this.textureX, this.textureY);
        super.bodyWheelModel[3] = new ModelRendererTurbo(this, 400, 270, this.textureX, this.textureY);
        super.bodyWheelModel[4] = new ModelRendererTurbo(this, 400, 290, this.textureX, this.textureY);
        super.bodyWheelModel[5] = new ModelRendererTurbo(this, 400, 290, this.textureX, this.textureY);
        super.bodyWheelModel[6] = new ModelRendererTurbo(this, 400, 320, this.textureX, this.textureY);
        super.bodyWheelModel[7] = new ModelRendererTurbo(this, 400, 320, this.textureX, this.textureY);
        super.bodyWheelModel[0].addBox(0.0F, 0.0F, 0.0F, 8, 18, 8, 0.0F);
        super.bodyWheelModel[0].setRotationPoint(-67.0F, -23.0F, -4.0F);
        super.bodyWheelModel[1].addBox(0.0F, 0.0F, 0.0F, 8, 8, 1, 0.0F);
        super.bodyWheelModel[1].setRotationPoint(-67.0F, -5.0F, -4.0F);
        super.bodyWheelModel[2].addBox(0.0F, 0.0F, 0.0F, 8, 8, 1, 0.0F);
        super.bodyWheelModel[2].setRotationPoint(-67.0F, -5.0F, 3.0F);
        super.bodyWheelModel[3].addBox(0.0F, 0.0F, 0.0F, 14, 8, 6, 0.0F);
        super.bodyWheelModel[3].setRotationPoint(-70.0F, -2.0F, -3.0F);
        super.bodyWheelModel[4].addBox(0.0F, 0.0F, 0.0F, 12, 17, 1, 0.0F);
        super.bodyWheelModel[4].setRotationPoint(-68.0F, -23.0F, -5.0F);
        super.bodyWheelModel[4].rotateAngleX = -0.13962634F;
        super.bodyWheelModel[5].addBox(0.0F, 0.0F, 0.0F, 12, 17, 1, 0.0F);
        super.bodyWheelModel[5].setRotationPoint(-68.0F, -23.0F, 4.0F);
        super.bodyWheelModel[5].rotateAngleX = 0.13962634F;
        super.bodyWheelModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 14, 3, 6, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyWheelModel[6].setRotationPoint(-70.0F, -5.0F, -3.0F);
        super.bodyWheelModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 14, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F);
        super.bodyWheelModel[7].setRotationPoint(-70.0F, 6.0F, -3.0F);
        super.leftWingWheelModel = new ModelRendererTurbo[10];
        super.leftWingWheelModel[0] = new ModelRendererTurbo(this, 400, 320, this.textureX, this.textureY);
        super.leftWingWheelModel[1] = new ModelRendererTurbo(this, 400, 320, this.textureX, this.textureY);
        super.leftWingWheelModel[2] = new ModelRendererTurbo(this, 400, 340, this.textureX, this.textureY);
        super.leftWingWheelModel[3] = new ModelRendererTurbo(this, 400, 270, this.textureX, this.textureY);
        super.leftWingWheelModel[4] = new ModelRendererTurbo(this, 400, 380, this.textureX, this.textureY);
        super.leftWingWheelModel[5] = new ModelRendererTurbo(this, 400, 380, this.textureX, this.textureY);
        super.leftWingWheelModel[6] = new ModelRendererTurbo(this, 400, 340, this.textureX, this.textureY);
        super.leftWingWheelModel[7] = new ModelRendererTurbo(this, 400, 270, this.textureX, this.textureY);
        super.leftWingWheelModel[8] = new ModelRendererTurbo(this, 400, 320, this.textureX, this.textureY);
        super.leftWingWheelModel[9] = new ModelRendererTurbo(this, 400, 320, this.textureX, this.textureY);
        super.leftWingWheelModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 14, 3, 6, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftWingWheelModel[0].setRotationPoint(17.0F, -5.0F, -21.0F);
        super.leftWingWheelModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 14, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F,
                0.0F, 0.0F);
        super.leftWingWheelModel[1].setRotationPoint(17.0F, 6.0F, -21.0F);
        super.leftWingWheelModel[2].addBox(0.0F, 0.0F, 0.0F, 8, 32, 4, 0.0F);
        super.leftWingWheelModel[2].setRotationPoint(20.0F, -30.0F, -15.0F);
        super.leftWingWheelModel[3].addBox(0.0F, 0.0F, 0.0F, 14, 8, 6, 0.0F);
        super.leftWingWheelModel[3].setRotationPoint(17.0F, -2.0F, -21.0F);
        super.leftWingWheelModel[4].addBox(0.0F, 0.0F, 0.0F, 14, 32, 2, 0.0F);
        super.leftWingWheelModel[4].setRotationPoint(17.0F, -30.0F, -10.0F);
        super.leftWingWheelModel[4].rotateAngleX = 0.08726646F;
        super.leftWingWheelModel[5].addBox(0.0F, 0.0F, 0.0F, 14, 32, 2, 0.0F);
        super.leftWingWheelModel[5].setRotationPoint(17.0F, -30.0F, 8.0F);
        super.leftWingWheelModel[5].rotateAngleX = -0.08726646F;
        super.leftWingWheelModel[6].addBox(0.0F, 0.0F, 0.0F, 8, 32, 4, 0.0F);
        super.leftWingWheelModel[6].setRotationPoint(20.0F, -30.0F, 11.0F);
        super.leftWingWheelModel[7].addBox(0.0F, 0.0F, 0.0F, 14, 8, 6, 0.0F);
        super.leftWingWheelModel[7].setRotationPoint(17.0F, -2.0F, 15.0F);
        super.leftWingWheelModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 14, 3, 6, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftWingWheelModel[8].setRotationPoint(17.0F, -5.0F, 15.0F);
        super.leftWingWheelModel[9].addShapeBox(0.0F, 0.0F, 0.0F, 14, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F,
                0.0F, 0.0F);
        super.leftWingWheelModel[9].setRotationPoint(17.0F, 6.0F, 15.0F);
        this.translateAll(0.0F, 0.0F, 0.0F);
        this.flipAll();
    }
}
