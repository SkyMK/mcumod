package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelEC665 extends ModelPlane {

    int textureX = 1024;
    int textureY = 2048;

    public ModelEC665() {
        super.bodyModel = new ModelRendererTurbo[78];
        super.bodyModel[0] = new ModelRendererTurbo(this, 0, 75, this.textureX, this.textureY);
        super.bodyModel[1] = new ModelRendererTurbo(this, 0, 127, this.textureX, this.textureY);
        super.bodyModel[2] = new ModelRendererTurbo(this, 0, 178, this.textureX, this.textureY);
        super.bodyModel[3] = new ModelRendererTurbo(this, 30, 178, this.textureX, this.textureY);
        super.bodyModel[4] = new ModelRendererTurbo(this, 0, 203, this.textureX, this.textureY);
        super.bodyModel[5] = new ModelRendererTurbo(this, 0, 230, this.textureX, this.textureY);
        super.bodyModel[6] = new ModelRendererTurbo(this, 30, 230, this.textureX, this.textureY);
        super.bodyModel[7] = new ModelRendererTurbo(this, 0, 250, this.textureX, this.textureY);
        super.bodyModel[8] = new ModelRendererTurbo(this, 0, 280, this.textureX, this.textureY);
        super.bodyModel[9] = new ModelRendererTurbo(this, 30, 280, this.textureX, this.textureY);
        super.bodyModel[10] = new ModelRendererTurbo(this, 0, 304, this.textureX, this.textureY);
        super.bodyModel[11] = new ModelRendererTurbo(this, 0, 331, this.textureX, this.textureY);
        super.bodyModel[12] = new ModelRendererTurbo(this, 0, 331, this.textureX, this.textureY);
        super.bodyModel[13] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        super.bodyModel[14] = new ModelRendererTurbo(this, 0, 365, this.textureX, this.textureY);
        super.bodyModel[15] = new ModelRendererTurbo(this, 0, 365, this.textureX, this.textureY);
        super.bodyModel[16] = new ModelRendererTurbo(this, 0, 375, this.textureX, this.textureY);
        super.bodyModel[17] = new ModelRendererTurbo(this, 45, 375, this.textureX, this.textureY);
        super.bodyModel[18] = new ModelRendererTurbo(this, 0, 407, this.textureX, this.textureY);
        super.bodyModel[19] = new ModelRendererTurbo(this, 0, 435, this.textureX, this.textureY);
        super.bodyModel[20] = new ModelRendererTurbo(this, 0, 457, this.textureX, this.textureY);
        super.bodyModel[21] = new ModelRendererTurbo(this, 0, 457, this.textureX, this.textureY);
        super.bodyModel[22] = new ModelRendererTurbo(this, 0, 472, this.textureX, this.textureY);
        super.bodyModel[23] = new ModelRendererTurbo(this, 0, 510, this.textureX, this.textureY);
        super.bodyModel[24] = new ModelRendererTurbo(this, 0, 530, this.textureX, this.textureY);
        super.bodyModel[25] = new ModelRendererTurbo(this, 0, 550, this.textureX, this.textureY);
        super.bodyModel[26] = new ModelRendererTurbo(this, 0, 570, this.textureX, this.textureY);
        super.bodyModel[27] = new ModelRendererTurbo(this, 0, 585, this.textureX, this.textureY);
        super.bodyModel[28] = new ModelRendererTurbo(this, 40, 585, this.textureX, this.textureY);
        super.bodyModel[29] = new ModelRendererTurbo(this, 0, 617, this.textureX, this.textureY);
        super.bodyModel[30] = new ModelRendererTurbo(this, 0, 617, this.textureX, this.textureY);
        super.bodyModel[31] = new ModelRendererTurbo(this, 0, 626, this.textureX, this.textureY);
        super.bodyModel[32] = new ModelRendererTurbo(this, 0, 648, this.textureX, this.textureY);
        super.bodyModel[33] = new ModelRendererTurbo(this, 0, 717, this.textureX, this.textureY);
        super.bodyModel[34] = new ModelRendererTurbo(this, 0, 755, this.textureX, this.textureY);
        super.bodyModel[35] = new ModelRendererTurbo(this, 0, 795, this.textureX, this.textureY);
        super.bodyModel[36] = new ModelRendererTurbo(this, 0, 860, this.textureX, this.textureY);
        super.bodyModel[37] = new ModelRendererTurbo(this, 0, 914, this.textureX, this.textureY);
        super.bodyModel[38] = new ModelRendererTurbo(this, 0, 947, this.textureX, this.textureY);
        super.bodyModel[39] = new ModelRendererTurbo(this, 0, 990, this.textureX, this.textureY);
        super.bodyModel[40] = new ModelRendererTurbo(this, 0, 1105, this.textureX, this.textureY);
        super.bodyModel[41] = new ModelRendererTurbo(this, 0, 1024, this.textureX, this.textureY);
        super.bodyModel[42] = new ModelRendererTurbo(this, 0, 1070, this.textureX, this.textureY);
        super.bodyModel[43] = new ModelRendererTurbo(this, 0, 1140, this.textureX, this.textureY);
        super.bodyModel[44] = new ModelRendererTurbo(this, 0, 1164, this.textureX, this.textureY);
        super.bodyModel[45] = new ModelRendererTurbo(this, 0, 1164, this.textureX, this.textureY);
        super.bodyModel[46] = new ModelRendererTurbo(this, 0, 1140, this.textureX, this.textureY);
        super.bodyModel[47] = new ModelRendererTurbo(this, 0, 1190, this.textureX, this.textureY);
        super.bodyModel[48] = new ModelRendererTurbo(this, 0, 1244, this.textureX, this.textureY);
        super.bodyModel[49] = new ModelRendererTurbo(this, 0, 1267, this.textureX, this.textureY);
        super.bodyModel[50] = new ModelRendererTurbo(this, 0, 1290, this.textureX, this.textureY);
        super.bodyModel[51] = new ModelRendererTurbo(this, 0, 1320, this.textureX, this.textureY);
        super.bodyModel[52] = new ModelRendererTurbo(this, 0, 1362, this.textureX, this.textureY);
        super.bodyModel[53] = new ModelRendererTurbo(this, 0, 1404, this.textureX, this.textureY);
        super.bodyModel[54] = new ModelRendererTurbo(this, 0, 1446, this.textureX, this.textureY);
        super.bodyModel[55] = new ModelRendererTurbo(this, 0, 1477, this.textureX, this.textureY);
        super.bodyModel[56] = new ModelRendererTurbo(this, 0, 1500, this.textureX, this.textureY);
        super.bodyModel[57] = new ModelRendererTurbo(this, 0, 1525, this.textureX, this.textureY);
        super.bodyModel[58] = new ModelRendererTurbo(this, 0, 1542, this.textureX, this.textureY);
        super.bodyModel[59] = new ModelRendererTurbo(this, 0, 1560, this.textureX, this.textureY);
        super.bodyModel[60] = new ModelRendererTurbo(this, 0, 1576, this.textureX, this.textureY);
        super.bodyModel[61] = new ModelRendererTurbo(this, 0, 1594, this.textureX, this.textureY);
        super.bodyModel[62] = new ModelRendererTurbo(this, 0, 1627, this.textureX, this.textureY);
        super.bodyModel[63] = new ModelRendererTurbo(this, 0, 1648, this.textureX, this.textureY);
        super.bodyModel[64] = new ModelRendererTurbo(this, 0, 1662, this.textureX, this.textureY);
        super.bodyModel[65] = new ModelRendererTurbo(this, 0, 1662, this.textureX, this.textureY);
        super.bodyModel[66] = new ModelRendererTurbo(this, 0, 1662, this.textureX, this.textureY);
        super.bodyModel[67] = new ModelRendererTurbo(this, 0, 1662, this.textureX, this.textureY);
        super.bodyModel[68] = new ModelRendererTurbo(this, 0, 1662, this.textureX, this.textureY);
        super.bodyModel[69] = new ModelRendererTurbo(this, 0, 1662, this.textureX, this.textureY);
        super.bodyModel[70] = new ModelRendererTurbo(this, 0, 1680, this.textureX, this.textureY);
        super.bodyModel[71] = new ModelRendererTurbo(this, 0, 510, this.textureX, this.textureY);
        super.bodyModel[72] = new ModelRendererTurbo(this, 0, 530, this.textureX, this.textureY);
        super.bodyModel[73] = new ModelRendererTurbo(this, 0, 550, this.textureX, this.textureY);
        super.bodyModel[74] = new ModelRendererTurbo(this, 0, 472, this.textureX, this.textureY);
        super.bodyModel[75] = new ModelRendererTurbo(this, 0, 1690, this.textureX, this.textureY);
        super.bodyModel[76] = new ModelRendererTurbo(this, 0, 1718, this.textureX, this.textureY);
        super.bodyModel[77] = new ModelRendererTurbo(this, 0, 1761, this.textureX, this.textureY);
        super.bodyModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 29, 19, 24, 0.0F, 0.0F, -12.0F, -7.5F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -12.0F, -7.5F, 0.0F, -3.0F, -7.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F,
                -7.5F);
        super.bodyModel[0].setRotationPoint(-100.0F, -26.0F, -12.0F);
        super.bodyModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 4, 19, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F,
                2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[1].setRotationPoint(-71.0F, -26.0F, -12.0F);
        super.bodyModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 5, 21, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F,
                -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F);
        super.bodyModel[2].setRotationPoint(-67.0F, -28.0F, -12.0F);
        super.bodyModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 5, 21, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F,
                -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F);
        super.bodyModel[3].setRotationPoint(-67.0F, -28.0F, 10.0F);
        super.bodyModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 5, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F);
        super.bodyModel[4].setRotationPoint(-67.0F, -9.0F, -10.0F);
        super.bodyModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 9, 15, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[5].setRotationPoint(-62.0F, -21.0F, -12.0F);
        super.bodyModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 9, 15, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[6].setRotationPoint(-62.0F, -21.0F, 10.0F);
        super.bodyModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 9, 3, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[7].setRotationPoint(-62.0F, -9.0F, -10.0F);
        super.bodyModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 9, 16, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F,
                10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[8].setRotationPoint(-53.0F, -21.0F, -12.0F);
        super.bodyModel[9].addShapeBox(0.0F, 0.0F, 0.0F, 9, 16, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F,
                10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[9].setRotationPoint(-53.0F, -21.0F, 10.0F);
        super.bodyModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 9, 4, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[10].setRotationPoint(-53.0F, -9.0F, -10.0F);
        super.bodyModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 9, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 11.0F, -4.0F, 0.0F,
                11.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, -4.0F, 0.0F, -11.0F, 4.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[11].setRotationPoint(-67.0F, -28.0F, -12.0F);
        super.bodyModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 9, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 11.0F, 4.0F, 0.0F,
                11.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 4.0F, 0.0F, -11.0F, -4.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[12].setRotationPoint(-67.0F, -28.0F, 10.0F);
        super.bodyModel[13].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.307F, 0.0F, 0.0F,
                0.307F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.307F, 0.0F, 0.0F, -0.307F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[13].setRotationPoint(-58.0F, -39.0F, -8.0F);
        super.bodyModel[14].addShapeBox(0.0F, 0.0F, 0.0F, 11, 2, 2, 0.0F, 0.0F, 0.307F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F,
                2.0F, 0.0F, 0.0F, 0.307F, 0.0F, 0.0F, -0.307F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -0.307F, 0.0F);
        super.bodyModel[14].setRotationPoint(-56.0F, -39.0F, -8.0F);
        super.bodyModel[15].addShapeBox(0.0F, 0.0F, 0.0F, 11, 2, 2, 0.0F, 0.0F, 0.307F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F,
                2.0F, 0.0F, 0.0F, 0.307F, 0.0F, 0.0F, -0.307F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -0.307F, 0.0F);
        super.bodyModel[15].setRotationPoint(-56.0F, -39.0F, 6.0F);
        super.bodyModel[16].addShapeBox(0.0F, 0.0F, 0.0F, 17, 27, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[16].setRotationPoint(-44.0F, -31.0F, -12.0F);
        super.bodyModel[17].addShapeBox(0.0F, 0.0F, 0.0F, 17, 27, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[17].setRotationPoint(-44.0F, -31.0F, 10.0F);
        super.bodyModel[18].addShapeBox(0.0F, 0.0F, 0.0F, 28, 5, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[18].setRotationPoint(-44.0F, -9.0F, -10.0F);
        super.bodyModel[19].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[19].setRotationPoint(-45.0F, -41.0F, -8.0F);
        super.bodyModel[20].addShapeBox(0.0F, 0.0F, 0.0F, 2, 10, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 0.0F, 2.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F,
                -2.0F);
        super.bodyModel[20].setRotationPoint(-45.0F, -41.0F, -10.0F);
        super.bodyModel[21].addShapeBox(0.0F, 0.0F, 0.0F, 2, 10, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 2.0F, -1.0F, 0.0F,
                2.0F);
        super.bodyModel[21].setRotationPoint(-45.0F, -41.0F, 8.0F);
        super.bodyModel[22].addShapeBox(0.0F, 0.0F, 0.0F, 4, 20, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[22].setRotationPoint(-48.0F, -29.0F, -7.0F);
        super.bodyModel[23].addShapeBox(0.0F, 0.0F, 0.0F, 13, 4, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[23].setRotationPoint(-61.0F, -13.0F, -7.0F);
        super.bodyModel[24].addShapeBox(0.0F, 0.0F, 0.0F, 2, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[24].setRotationPoint(-49.0F, -33.0F, -4.0F);
        super.bodyModel[25].addShapeBox(0.0F, 0.0F, 0.0F, 1, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[25].setRotationPoint(-47.0F, -33.0F, -4.0F);
        super.bodyModel[26].addShapeBox(0.0F, 0.0F, 0.0F, 21, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[26].setRotationPoint(-97.0F, -10.0F, -4.0F);
        super.bodyModel[27].addShapeBox(0.0F, 0.0F, 0.0F, 11, 27, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F,
                11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[27].setRotationPoint(-27.0F, -31.0F, -12.0F);
        super.bodyModel[28].addShapeBox(0.0F, 0.0F, 0.0F, 11, 27, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F,
                11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[28].setRotationPoint(-27.0F, -31.0F, 10.0F);
        super.bodyModel[29].addShapeBox(0.0F, 0.0F, 0.0F, 17, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F,
                10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[29].setRotationPoint(-43.0F, -41.0F, -8.0F);
        super.bodyModel[30].addShapeBox(0.0F, 0.0F, 0.0F, 17, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 10.0F, 0.0F, 0.0F,
                10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[30].setRotationPoint(-43.0F, -41.0F, 6.0F);
        super.bodyModel[31].addShapeBox(0.0F, 0.0F, 0.0F, 10, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[31].setRotationPoint(-26.0F, -51.0F, -8.0F);
        super.bodyModel[32].addShapeBox(0.0F, 0.0F, 0.0F, 57, 38, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[32].setRotationPoint(-16.0F, -42.0F, -12.0F);
        super.bodyModel[33].addShapeBox(0.0F, 0.0F, 0.0F, 57, 9, 24, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[33].setRotationPoint(-16.0F, -51.0F, -12.0F);
        super.bodyModel[34].addShapeBox(0.0F, 0.0F, 0.0F, 31, 9, 24, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, -3.0F, -4.0F, 0.0F,
                -3.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[34].setRotationPoint(41.0F, -51.0F, -12.0F);
        super.bodyModel[35].addShapeBox(0.0F, 0.0F, 0.0F, 31, 38, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F,
                -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[35].setRotationPoint(41.0F, -42.0F, -12.0F);
        super.bodyModel[36].addShapeBox(0.0F, 0.0F, 0.0F, 18, 25, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, -3.0F, 0.0F, -2.0F, -3.0F, 0.0F, -1.0F,
                0.0F);
        super.bodyModel[36].setRotationPoint(87.0F, -32.0F, -12.0F);
        super.bodyModel[37].addShapeBox(0.0F, 0.0F, 0.0F, 20, 5, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F);
        super.bodyModel[37].setRotationPoint(67.0F, -48.0F, -12.0F);
        super.bodyModel[38].addShapeBox(0.0F, 0.0F, 0.0F, 20, 6, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[38].setRotationPoint(67.0F, -43.0F, -17.0F);
        super.bodyModel[39].addShapeBox(0.0F, 0.0F, 0.0F, 20, 5, 24, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F,
                0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[39].setRotationPoint(67.0F, -37.0F, -12.0F);
        super.bodyModel[40].addShapeBox(0.0F, 0.0F, 0.0F, 18, 5, 24, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, -3.0F, -3.0F, 0.0F,
                -3.0F, -3.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[40].setRotationPoint(87.0F, -37.0F, -12.0F);
        super.bodyModel[41].addShapeBox(0.0F, 0.0F, 0.0F, 18, 6, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, -11.0F, 0.0F,
                -7.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, -8.0F, 0.0F, 3.0F, -8.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[41].setRotationPoint(87.0F, -43.0F, -17.0F);
        super.bodyModel[42].addShapeBox(0.0F, 0.0F, 0.0F, 18, 5, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, -9.0F, 0.0F,
                -10.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 7.0F, -6.0F, 0.0F, 7.0F, -6.0F, 0.0F, 0.0F,
                5.0F);
        super.bodyModel[42].setRotationPoint(87.0F, -48.0F, -12.0F);
        super.bodyModel[43].addShapeBox(0.0F, 0.0F, 0.0F, 8, 11, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[43].setRotationPoint(87.0F, -47.0F, -12.0F);
        super.bodyModel[44].addShapeBox(0.0F, 0.0F, 0.0F, 2, 11, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[44].setRotationPoint(95.0F, -47.0F, -12.0F);
        super.bodyModel[45].addShapeBox(0.0F, 0.0F, 0.0F, 2, 11, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[45].setRotationPoint(95.0F, -47.0F, 4.0F);
        super.bodyModel[46].addShapeBox(0.0F, 0.0F, 0.0F, 8, 11, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[46].setRotationPoint(87.0F, -47.0F, 4.0F);
        super.bodyModel[47].addShapeBox(0.0F, 0.0F, 0.0F, 15, 25, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[47].setRotationPoint(72.0F, -32.0F, -12.0F);
        super.bodyModel[48].addShapeBox(0.0F, 0.0F, 0.0F, 4, 7, 12, 0.0F, 0.0F, -6.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -6.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -3.0F);
        super.bodyModel[48].setRotationPoint(-20.0F, -58.0F, -6.0F);
        super.bodyModel[49].addShapeBox(0.0F, 0.0F, 0.0F, 7, 7, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F,
                3.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[49].setRotationPoint(-16.0F, -58.0F, -6.0F);
        super.bodyModel[50].addShapeBox(0.0F, 0.0F, 0.0F, 18, 10, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[50].setRotationPoint(-9.0F, -61.0F, -8.0F);
        super.bodyModel[51].addShapeBox(0.0F, 0.0F, 0.0F, 15, 6, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
        super.bodyModel[51].setRotationPoint(45.0F, -43.0F, -16.0F);
        super.bodyModel[52].addShapeBox(0.0F, 0.0F, 0.0F, 13, 6, 32, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F,
                0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
        super.bodyModel[52].setRotationPoint(47.0F, -49.0F, -16.0F);
        super.bodyModel[53].addShapeBox(0.0F, 0.0F, 0.0F, 17, 6, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 2.0F, 0.0F,
                -6.0F);
        super.bodyModel[53].setRotationPoint(43.0F, -37.0F, -16.0F);
        super.bodyModel[54].addShapeBox(0.0F, 0.0F, 0.0F, 29, 10, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, -4.5F, 0.0F,
                -8.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[54].setRotationPoint(9.0F, -61.0F, -8.0F);
        super.bodyModel[55].addShapeBox(0.0F, 0.0F, 0.0F, 4, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[55].setRotationPoint(105.0F, -34.0F, -9.0F);
        super.bodyModel[56].addShapeBox(0.0F, 0.0F, 0.0F, 4, 4, 18, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, -2.0F, -6.0F, 0.0F,
                -2.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[56].setRotationPoint(105.0F, -38.0F, -9.0F);
        super.bodyModel[57].addShapeBox(0.0F, 0.0F, 0.0F, 26, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[57].setRotationPoint(109.0F, -34.0F, -5.0F);
        super.bodyModel[58].addShapeBox(0.0F, 0.0F, 0.0F, 26, 2, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[58].setRotationPoint(109.0F, -36.0F, -5.0F);
        super.bodyModel[59].addShapeBox(0.0F, 0.0F, 0.0F, 26, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -2.5F, 0.0F,
                -1.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.5F, 0.0F, 1.0F, -2.5F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[59].setRotationPoint(135.0F, -34.0F, -5.0F);
        super.bodyModel[60].addShapeBox(0.0F, 0.0F, 0.0F, 26, 2, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, -4.5F, 0.0F,
                -1.0F, -4.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.5F, 0.0F, 1.0F, -2.5F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[60].setRotationPoint(135.0F, -36.0F, -5.0F);
        super.bodyModel[61].addShapeBox(0.0F, 0.0F, 0.0F, 5, 21, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[61].setRotationPoint(-2.5F, -82.0F, -2.5F);
        super.bodyModel[62].addShapeBox(0.0F, 0.0F, 0.0F, 12, 8, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[62].setRotationPoint(-6.0F, -90.0F, -2.5F);
        super.bodyModel[63].addShapeBox(0.0F, 0.0F, 0.0F, 12, 4, 5, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F,
                0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[63].setRotationPoint(-6.0F, -94.0F, -2.5F);
        super.bodyModel[64].addShapeBox(0.0F, 0.0F, 0.0F, 9, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[64].setRotationPoint(-4.5F, -90.0F, -9.5F);
        super.bodyModel[65].addShapeBox(0.0F, 0.0F, 0.0F, 9, 3, 7, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F,
                0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[65].setRotationPoint(-4.5F, -93.0F, -9.5F);
        super.bodyModel[66].addShapeBox(0.0F, 0.0F, 0.0F, 9, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
        super.bodyModel[66].setRotationPoint(-4.5F, -87.0F, -9.5F);
        super.bodyModel[67].addShapeBox(0.0F, 0.0F, 0.0F, 9, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
        super.bodyModel[67].setRotationPoint(-4.5F, -87.0F, 2.5F);
        super.bodyModel[68].addShapeBox(0.0F, 0.0F, 0.0F, 9, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[68].setRotationPoint(-4.5F, -90.0F, 2.5F);
        super.bodyModel[69].addShapeBox(0.0F, 0.0F, 0.0F, 9, 3, 7, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F,
                0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[69].setRotationPoint(-4.5F, -93.0F, 2.5F);
        super.bodyModel[70].addShapeBox(0.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[70].setRotationPoint(-4.5F, -92.0F, -7.5F);
        super.bodyModel[71].addShapeBox(0.0F, 0.0F, 0.0F, 13, 4, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[71].setRotationPoint(-36.0F, -26.0F, -7.0F);
        super.bodyModel[72].addShapeBox(0.0F, 0.0F, 0.0F, 2, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[72].setRotationPoint(-24.0F, -46.0F, -4.0F);
        super.bodyModel[73].addShapeBox(0.0F, 0.0F, 0.0F, 1, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[73].setRotationPoint(-22.0F, -46.0F, -4.0F);
        super.bodyModel[74].addShapeBox(0.0F, 0.0F, 0.0F, 4, 20, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[74].setRotationPoint(-23.0F, -42.0F, -7.0F);
        super.bodyModel[75].addShapeBox(0.0F, 0.0F, 0.0F, 28, 4, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[75].setRotationPoint(-44.0F, -18.0F, -10.0F);
        super.bodyModel[76].addShapeBox(0.0F, 0.0F, 0.0F, 4, 19, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F,
                -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[76].setRotationPoint(-67.0F, -26.0F, -10.0F);
        super.bodyModel[77].addShapeBox(0.0F, 0.0F, 0.0F, 4, 19, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F,
                -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[77].setRotationPoint(-44.0F, -31.0F, -10.0F);
        super.tailModel = new ModelRendererTurbo[14];
        super.tailModel[0] = new ModelRendererTurbo(this, 0, 1803, this.textureX, this.textureY);
        super.tailModel[1] = new ModelRendererTurbo(this, 0, 1848, this.textureX, this.textureY);
        super.tailModel[2] = new ModelRendererTurbo(this, 0, 1886, this.textureX, this.textureY);
        super.tailModel[3] = new ModelRendererTurbo(this, 0, 1910, this.textureX, this.textureY);
        super.tailModel[4] = new ModelRendererTurbo(this, 0, 1939, this.textureX, this.textureY);
        super.tailModel[5] = new ModelRendererTurbo(this, 0, 1963, this.textureX, this.textureY);
        super.tailModel[6] = new ModelRendererTurbo(this, 200, 0, this.textureX, this.textureY);
        super.tailModel[7] = new ModelRendererTurbo(this, 200, 72, this.textureX, this.textureY);
        super.tailModel[8] = new ModelRendererTurbo(this, 200, 95, this.textureX, this.textureY);
        super.tailModel[9] = new ModelRendererTurbo(this, 200, 95, this.textureX, this.textureY);
        super.tailModel[10] = new ModelRendererTurbo(this, 200, 72, this.textureX, this.textureY);
        super.tailModel[11] = new ModelRendererTurbo(this, 200, 110, this.textureX, this.textureY);
        super.tailModel[12] = new ModelRendererTurbo(this, 200, 125, this.textureX, this.textureY);
        super.tailModel[13] = new ModelRendererTurbo(this, 200, 125, this.textureX, this.textureY);
        super.tailModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 30, 23, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -2.0F, 0.0F, -3.0F, -2.0F, 0.0F, 0.0F,
                0.0F);
        super.tailModel[0].setRotationPoint(105.0F, -32.0F, -9.0F);
        super.tailModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 52, 20, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -5.0F, 0.0F,
                -2.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -16.0F, -3.0F, -5.0F, -16.0F, -3.0F, -5.0F, 0.0F,
                0.0F, 0.0F);
        super.tailModel[1].setRotationPoint(135.0F, -32.0F, -7.0F);
        super.tailModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 40, 12, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, -4.0F, -5.0F, 0.0F, -4.0F, -5.0F, 0.0F, -14.0F, 0.0F,
                0.0F);
        super.tailModel[2].setRotationPoint(129.0F, -15.0F, -2.0F);
        super.tailModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 35, 6, 14, 0.0F, 0.0F, 0.0F, -1.6346F, 0.0F, 0.0F, -5.0F, 0.0F,
                0.0F, -5.0F, 0.0F, 0.0F, -1.6346F, 0.0F, -1.346F, -1.6346F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F,
                -1.346F, -1.6346F);
        super.tailModel[3].setRotationPoint(152.0F, -36.0F, -7.0F);
        super.tailModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 8, 6, 14, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -1.6346F, 0.0F,
                0.0F, -1.6346F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, -1.346F, -1.6346F, 0.0F, -1.346F, -1.6346F,
                0.0F, 0.0F, -5.0F);
        super.tailModel[4].setRotationPoint(144.0F, -36.0F, -7.0F);
        super.tailModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 35, 30, 14, 0.0F, -42.0F, 0.0F, -5.0F, 20.0F, 0.0F, -5.0F,
                20.0F, 0.0F, -5.0F, -42.0F, 0.0F, -5.0F, 0.0F, 0.0F, -1.6346F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F,
                0.0F, 0.0F, -1.6346F);
        super.tailModel[5].setRotationPoint(152.0F, -66.0F, -7.0F);
        super.tailModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 14, 2, 66, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.tailModel[6].setRotationPoint(152.0F, -32.0F, -33.0F);
        super.tailModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 16, 14, 2, 0.0F, -16.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, 11.0F,
                0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.tailModel[7].setRotationPoint(150.0F, -44.5F, -35.0F);
        super.tailModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 16, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
        super.tailModel[8].setRotationPoint(150.0F, -30.5F, -35.0F);
        super.tailModel[9].addShapeBox(0.0F, 0.0F, 0.0F, 16, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
        super.tailModel[9].setRotationPoint(150.0F, -30.5F, 33.0F);
        super.tailModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 16, 14, 2, 0.0F, -16.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, 11.0F,
                0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.tailModel[10].setRotationPoint(150.0F, -44.5F, 33.0F);
        super.tailModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 8, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.tailModel[11].setRotationPoint(190.0F, -61.0F, 2.0F);
        super.tailModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F,
                0.0F);
        super.tailModel[12].setRotationPoint(188.0F, -61.0F, 2.0F);
        super.tailModel[13].addShapeBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.tailModel[13].setRotationPoint(198.0F, -61.0F, 2.0F);
        super.leftWingModel = new ModelRendererTurbo[12];
        super.leftWingModel[0] = new ModelRendererTurbo(this, 200, 140, this.textureX, this.textureY);
        super.leftWingModel[1] = new ModelRendererTurbo(this, 200, 170, this.textureX, this.textureY);
        super.leftWingModel[2] = new ModelRendererTurbo(this, 200, 191, this.textureX, this.textureY);
        super.leftWingModel[3] = new ModelRendererTurbo(this, 200, 200, this.textureX, this.textureY);
        super.leftWingModel[4] = new ModelRendererTurbo(this, 200, 210, this.textureX, this.textureY);
        super.leftWingModel[5] = new ModelRendererTurbo(this, 200, 210, this.textureX, this.textureY);
        super.leftWingModel[6] = new ModelRendererTurbo(this, 200, 191, this.textureX, this.textureY);
        super.leftWingModel[7] = new ModelRendererTurbo(this, 200, 220, this.textureX, this.textureY);
        super.leftWingModel[8] = new ModelRendererTurbo(this, 200, 235, this.textureX, this.textureY);
        super.leftWingModel[9] = new ModelRendererTurbo(this, 200, 252, this.textureX, this.textureY);
        super.leftWingModel[10] = new ModelRendererTurbo(this, 200, 270, this.textureX, this.textureY);
        super.leftWingModel[11] = new ModelRendererTurbo(this, 200, 280, this.textureX, this.textureY);
        super.leftWingModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 21, 4, 20, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.leftWingModel[0].setRotationPoint(-16.0F, -31.0F, -32.0F);
        super.leftWingModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 16, 4, 13, 0.0F, -5.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftWingModel[1].setRotationPoint(-11.0F, -31.0F, -45.0F);
        super.leftWingModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 9, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.leftWingModel[2].setRotationPoint(-5.0F, -25.0F, -44.0F);
        super.leftWingModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 33, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.leftWingModel[3].setRotationPoint(-16.0F, -21.0F, -46.0F);
        super.leftWingModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 41, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.leftWingModel[4].setRotationPoint(-20.0F, -20.5F, -45.5F);
        super.leftWingModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 41, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.leftWingModel[5].setRotationPoint(-20.0F, -20.5F, -42.5F);
        super.leftWingModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 9, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.leftWingModel[6].setRotationPoint(-5.0F, -28.0F, -32.0F);
        super.leftWingModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 30, 2, 8, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F,
                0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftWingModel[7].setRotationPoint(-17.0F, -24.0F, -35.0F);
        super.leftWingModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 30, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
        super.leftWingModel[8].setRotationPoint(-17.0F, -22.0F, -35.0F);
        super.leftWingModel[9].addShapeBox(0.0F, 0.0F, 0.0F, 32, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 1.0F, 0.0F,
                -2.0F);
        super.leftWingModel[9].setRotationPoint(-19.0F, -18.0F, -35.0F);
        super.leftWingModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.leftWingModel[10].setRotationPoint(-23.0F, -22.0F, -32.0F);
        super.leftWingModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F,
                0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F);
        super.leftWingModel[11].setRotationPoint(-27.0F, -22.0F, -32.0F);
        super.rightWingModel = new ModelRendererTurbo[18];
        super.rightWingModel[0] = new ModelRendererTurbo(this, 200, 140, this.textureX, this.textureY);
        super.rightWingModel[1] = new ModelRendererTurbo(this, 200, 170, this.textureX, this.textureY);
        super.rightWingModel[2] = new ModelRendererTurbo(this, 200, 191, this.textureX, this.textureY);
        super.rightWingModel[3] = new ModelRendererTurbo(this, 200, 191, this.textureX, this.textureY);
        super.rightWingModel[4] = new ModelRendererTurbo(this, 200, 200, this.textureX, this.textureY);
        super.rightWingModel[5] = new ModelRendererTurbo(this, 200, 210, this.textureX, this.textureY);
        super.rightWingModel[6] = new ModelRendererTurbo(this, 200, 210, this.textureX, this.textureY);
        super.rightWingModel[7] = new ModelRendererTurbo(this, 200, 290, this.textureX, this.textureY);
        super.rightWingModel[8] = new ModelRendererTurbo(this, 200, 305, this.textureX, this.textureY);
        super.rightWingModel[9] = new ModelRendererTurbo(this, 200, 314, this.textureX, this.textureY);
        super.rightWingModel[10] = new ModelRendererTurbo(this, 200, 314, this.textureX, this.textureY);
        super.rightWingModel[11] = new ModelRendererTurbo(this, 200, 305, this.textureX, this.textureY);
        super.rightWingModel[12] = new ModelRendererTurbo(this, 200, 290, this.textureX, this.textureY);
        super.rightWingModel[13] = new ModelRendererTurbo(this, 200, 191, this.textureX, this.textureY);
        super.rightWingModel[14] = new ModelRendererTurbo(this, 200, 305, this.textureX, this.textureY);
        super.rightWingModel[15] = new ModelRendererTurbo(this, 200, 314, this.textureX, this.textureY);
        super.rightWingModel[16] = new ModelRendererTurbo(this, 200, 305, this.textureX, this.textureY);
        super.rightWingModel[17] = new ModelRendererTurbo(this, 200, 314, this.textureX, this.textureY);
        super.rightWingModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 21, 4, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
        super.rightWingModel[0].setRotationPoint(-16.0F, -31.0F, 12.0F);
        super.rightWingModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 16, 4, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -5.0F, 0.0F, -5.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, -5.0F, 3.0F,
                0.0F);
        super.rightWingModel[1].setRotationPoint(-11.0F, -31.0F, 32.0F);
        super.rightWingModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 9, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.rightWingModel[2].setRotationPoint(-5.0F, -28.0F, 30.0F);
        super.rightWingModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 9, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.rightWingModel[3].setRotationPoint(-5.0F, -25.0F, 42.0F);
        super.rightWingModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 33, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.rightWingModel[4].setRotationPoint(-16.0F, -21.0F, 40.0F);
        super.rightWingModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 41, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.rightWingModel[5].setRotationPoint(-20.0F, -20.5F, 43.5F);
        super.rightWingModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 41, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.rightWingModel[6].setRotationPoint(-20.0F, -20.5F, 40.5F);
        super.rightWingModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 9, 2, 8, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.rightWingModel[7].setRotationPoint(-5.0F, -24.0F, 27.0F);
        super.rightWingModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 24, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.rightWingModel[8].setRotationPoint(-14.0F, -22.0F, 26.0F);
        super.rightWingModel[9].addTrapezoid(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F, -1.0F, 3);
        super.rightWingModel[9].setRotationPoint(-16.0F, -22.0F, 26.0F);
        super.rightWingModel[10].addTrapezoid(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F, -1.0F, 3);
        super.rightWingModel[10].setRotationPoint(-16.0F, -22.0F, 33.0F);
        super.rightWingModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 24, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.rightWingModel[11].setRotationPoint(-14.0F, -22.0F, 33.0F);
        super.rightWingModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 9, 2, 8, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F,
                0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightWingModel[12].setRotationPoint(-5.0F, -19.0F, 27.0F);
        super.rightWingModel[13].addShapeBox(0.0F, 0.0F, 0.0F, 9, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.rightWingModel[13].setRotationPoint(-5.0F, -22.0F, 30.0F);
        super.rightWingModel[14].addShapeBox(0.0F, 0.0F, 0.0F, 24, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.rightWingModel[14].setRotationPoint(-14.0F, -17.0F, 26.0F);
        super.rightWingModel[15].addTrapezoid(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F, -1.0F, 3);
        super.rightWingModel[15].setRotationPoint(-16.0F, -17.0F, 26.0F);
        super.rightWingModel[16].addShapeBox(0.0F, 0.0F, 0.0F, 24, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.rightWingModel[16].setRotationPoint(-14.0F, -17.0F, 33.0F);
        super.rightWingModel[17].addTrapezoid(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F, -1.0F, 3);
        super.rightWingModel[17].setRotationPoint(-16.0F, -17.0F, 33.0F);
        super.tailWheelModel = new ModelRendererTurbo[4];
        super.tailWheelModel[0] = new ModelRendererTurbo(this, 200, 325, this.textureX, this.textureY);
        super.tailWheelModel[1] = new ModelRendererTurbo(this, 200, 347, this.textureX, this.textureY);
        super.tailWheelModel[2] = new ModelRendererTurbo(this, 200, 357, this.textureX, this.textureY);
        super.tailWheelModel[3] = new ModelRendererTurbo(this, 200, 367, this.textureX, this.textureY);
        super.tailWheelModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 4, 16, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.tailWheelModel[0].setRotationPoint(146.0F, -7.0F, -1.0F);
        super.tailWheelModel[0].rotateAngleZ = 0.62831855F;
        super.tailWheelModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F);
        super.tailWheelModel[1].setRotationPoint(149.0F, 6.0F, 1.0F);
        super.tailWheelModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.tailWheelModel[2].setRotationPoint(149.0F, 2.0F, 1.0F);
        super.tailWheelModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F,
                -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.tailWheelModel[3].setRotationPoint(149.0F, -2.0F, 1.0F);
        super.leftWingWheelModel = new ModelRendererTurbo[7];
        super.leftWingWheelModel[0] = new ModelRendererTurbo(this, 200, 377, this.textureX, this.textureY);
        super.leftWingWheelModel[1] = new ModelRendererTurbo(this, 200, 405, this.textureX, this.textureY);
        super.leftWingWheelModel[2] = new ModelRendererTurbo(this, 200, 411, this.textureX, this.textureY);
        super.leftWingWheelModel[3] = new ModelRendererTurbo(this, 200, 423, this.textureX, this.textureY);
        super.leftWingWheelModel[4] = new ModelRendererTurbo(this, 200, 357, this.textureX, this.textureY);
        super.leftWingWheelModel[5] = new ModelRendererTurbo(this, 200, 347, this.textureX, this.textureY);
        super.leftWingWheelModel[6] = new ModelRendererTurbo(this, 200, 367, this.textureX, this.textureY);
        super.leftWingWheelModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 2, 19, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 8.0F, 11.0F, 0.0F, 8.0F, 11.0F, 0.0F, -8.0F, -11.0F,
                0.0F, -8.0F);
        super.leftWingWheelModel[0].setRotationPoint(-44.0F, -21.0F, -14.0F);
        super.leftWingWheelModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftWingWheelModel[1].setRotationPoint(-44.0F, -23.0F, -14.0F);
        super.leftWingWheelModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftWingWheelModel[2].setRotationPoint(-33.0F, -2.0F, -22.0F);
        super.leftWingWheelModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -11.0F, 4.0F, 0.0F, 11.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, -4.0F, 0.0F, 11.0F,
                -4.0F, 0.0F);
        super.leftWingWheelModel[3].setRotationPoint(-33.0F, -2.0F, -20.0F);
        super.leftWingWheelModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftWingWheelModel[4].setRotationPoint(-38.0F, 2.0F, -25.0F);
        super.leftWingWheelModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F,
                0.0F, 0.0F);
        super.leftWingWheelModel[5].setRotationPoint(-38.0F, 6.0F, -25.0F);
        super.leftWingWheelModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F,
                -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftWingWheelModel[6].setRotationPoint(-38.0F, -2.0F, -25.0F);
        super.rightWingWheelModel = new ModelRendererTurbo[7];
        super.rightWingWheelModel[0] = new ModelRendererTurbo(this, 200, 405, this.textureX, this.textureY);
        super.rightWingWheelModel[1] = new ModelRendererTurbo(this, 200, 423, this.textureX, this.textureY);
        super.rightWingWheelModel[2] = new ModelRendererTurbo(this, 200, 377, this.textureX, this.textureY);
        super.rightWingWheelModel[3] = new ModelRendererTurbo(this, 200, 411, this.textureX, this.textureY);
        super.rightWingWheelModel[4] = new ModelRendererTurbo(this, 200, 367, this.textureX, this.textureY);
        super.rightWingWheelModel[5] = new ModelRendererTurbo(this, 200, 357, this.textureX, this.textureY);
        super.rightWingWheelModel[6] = new ModelRendererTurbo(this, 200, 347, this.textureX, this.textureY);
        super.rightWingWheelModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightWingWheelModel[0].setRotationPoint(-44.0F, -23.0F, 12.0F);
        super.rightWingWheelModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F, 11.0F, 4.0F, 0.0F, -11.0F, 4.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 11.0F, -4.0F, 0.0F, -11.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightWingWheelModel[1].setRotationPoint(-33.0F, -2.0F, 12.0F);
        super.rightWingWheelModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 2, 19, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, -8.0F, 11.0F, 0.0F, -8.0F, 11.0F, 0.0F, 8.0F, -11.0F,
                0.0F, 8.0F);
        super.rightWingWheelModel[2].setRotationPoint(-44.0F, -21.0F, 12.0F);
        super.rightWingWheelModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightWingWheelModel[3].setRotationPoint(-33.0F, -2.0F, 20.0F);
        super.rightWingWheelModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F,
                -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightWingWheelModel[4].setRotationPoint(-38.0F, -2.0F, 22.0F);
        super.rightWingWheelModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightWingWheelModel[5].setRotationPoint(-38.0F, 2.0F, 22.0F);
        super.rightWingWheelModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F,
                0.0F, 0.0F);
        super.rightWingWheelModel[6].setRotationPoint(-38.0F, 6.0F, 22.0F);
        super.heliMainRotorModels = new ModelRendererTurbo[1][21];
        super.heliMainRotorModels[0][0] = new ModelRendererTurbo(this, 200, 440, this.textureX, this.textureY);
        super.heliMainRotorModels[0][1] = new ModelRendererTurbo(this, 200, 455, this.textureX, this.textureY);
        super.heliMainRotorModels[0][2] = new ModelRendererTurbo(this, 200, 470, this.textureX, this.textureY);
        super.heliMainRotorModels[0][3] = new ModelRendererTurbo(this, 200, 482, this.textureX, this.textureY);
        super.heliMainRotorModels[0][4] = new ModelRendererTurbo(this, 200, 493, this.textureX, this.textureY);
        super.heliMainRotorModels[0][5] = new ModelRendererTurbo(this, 200, 510, this.textureX, this.textureY);
        super.heliMainRotorModels[0][6] = new ModelRendererTurbo(this, 200, 455, this.textureX, this.textureY);
        super.heliMainRotorModels[0][7] = new ModelRendererTurbo(this, 200, 470, this.textureX, this.textureY);
        super.heliMainRotorModels[0][8] = new ModelRendererTurbo(this, 200, 482, this.textureX, this.textureY);
        super.heliMainRotorModels[0][9] = new ModelRendererTurbo(this, 200, 493, this.textureX, this.textureY);
        super.heliMainRotorModels[0][10] = new ModelRendererTurbo(this, 200, 510, this.textureX, this.textureY);
        super.heliMainRotorModels[0][11] = new ModelRendererTurbo(this, 200, 455, this.textureX, this.textureY);
        super.heliMainRotorModels[0][12] = new ModelRendererTurbo(this, 200, 470, this.textureX, this.textureY);
        super.heliMainRotorModels[0][13] = new ModelRendererTurbo(this, 200, 482, this.textureX, this.textureY);
        super.heliMainRotorModels[0][14] = new ModelRendererTurbo(this, 200, 493, this.textureX, this.textureY);
        super.heliMainRotorModels[0][15] = new ModelRendererTurbo(this, 200, 510, this.textureX, this.textureY);
        super.heliMainRotorModels[0][16] = new ModelRendererTurbo(this, 200, 455, this.textureX, this.textureY);
        super.heliMainRotorModels[0][17] = new ModelRendererTurbo(this, 200, 470, this.textureX, this.textureY);
        super.heliMainRotorModels[0][18] = new ModelRendererTurbo(this, 200, 482, this.textureX, this.textureY);
        super.heliMainRotorModels[0][19] = new ModelRendererTurbo(this, 200, 493, this.textureX, this.textureY);
        super.heliMainRotorModels[0][20] = new ModelRendererTurbo(this, 200, 510, this.textureX, this.textureY);
        super.heliMainRotorModels[0][0].addShapeBox(-3.0F, 0.0F, -3.0F, 6, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.heliMainRotorModels[0][0].setRotationPoint(0.0F, -68.0F, 0.0F);
        super.heliMainRotorModels[0][1].addShapeBox(3.0F, 0.0F, -3.0F, 8, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F,
                -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F,
                0.0F, 0.0F, 0.0F);
        super.heliMainRotorModels[0][1].setRotationPoint(0.0F, -68.0F, 0.0F);
        super.heliMainRotorModels[0][2].addShapeBox(11.0F, 2.0F, -2.0F, 12, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.heliMainRotorModels[0][2].setRotationPoint(0.0F, -68.0F, 0.0F);
        super.heliMainRotorModels[0][3].addShapeBox(23.0F, 2.0F, -2.0F, 7, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F,
                0.0F, 0.0F);
        super.heliMainRotorModels[0][3].setRotationPoint(0.0F, -68.0F, 0.0F);
        super.heliMainRotorModels[0][4].addShapeBox(30.0F, 2.0F, -2.0F, 86, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.heliMainRotorModels[0][4].setRotationPoint(0.0F, -68.0F, 0.0F);
        super.heliMainRotorModels[0][5].addShapeBox(116.0F, 2.0F, -2.0F, 9, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.heliMainRotorModels[0][5].setRotationPoint(0.0F, -68.0F, 0.0F);
        super.heliMainRotorModels[0][6].addShapeBox(3.0F, 0.0F, -3.0F, 8, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F,
                -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F,
                0.0F, 0.0F, 0.0F);
        super.heliMainRotorModels[0][6].setRotationPoint(0.0F, -68.0F, 0.0F);
        super.heliMainRotorModels[0][6].rotateAngleY = -1.5707964F;
        super.heliMainRotorModels[0][7].addShapeBox(11.0F, 2.0F, -2.0F, 12, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.heliMainRotorModels[0][7].setRotationPoint(0.0F, -68.0F, 0.0F);
        super.heliMainRotorModels[0][7].rotateAngleY = -1.5707964F;
        super.heliMainRotorModels[0][8].addShapeBox(23.0F, 2.0F, -2.0F, 7, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F,
                0.0F, 0.0F);
        super.heliMainRotorModels[0][8].setRotationPoint(0.0F, -68.0F, 0.0F);
        super.heliMainRotorModels[0][8].rotateAngleY = -1.5707964F;
        super.heliMainRotorModels[0][9].addShapeBox(30.0F, 2.0F, -2.0F, 86, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.heliMainRotorModels[0][9].setRotationPoint(0.0F, -68.0F, 0.0F);
        super.heliMainRotorModels[0][9].rotateAngleY = -1.5707964F;
        super.heliMainRotorModels[0][10].addShapeBox(116.0F, 2.0F, -2.0F, 9, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.heliMainRotorModels[0][10].setRotationPoint(0.0F, -68.0F, 0.0F);
        super.heliMainRotorModels[0][10].rotateAngleY = -1.5707964F;
        super.heliMainRotorModels[0][11].addShapeBox(3.0F, 0.0F, -3.0F, 8, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F,
                -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F,
                0.0F, 0.0F, 0.0F);
        super.heliMainRotorModels[0][11].setRotationPoint(0.0F, -68.0F, 0.0F);
        super.heliMainRotorModels[0][11].rotateAngleY = -3.1415927F;
        super.heliMainRotorModels[0][12].addShapeBox(11.0F, 2.0F, -2.0F, 12, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.heliMainRotorModels[0][12].setRotationPoint(0.0F, -68.0F, 0.0F);
        super.heliMainRotorModels[0][12].rotateAngleY = -3.1415927F;
        super.heliMainRotorModels[0][13].addShapeBox(23.0F, 2.0F, -2.0F, 7, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F,
                0.0F, 0.0F);
        super.heliMainRotorModels[0][13].setRotationPoint(0.0F, -68.0F, 0.0F);
        super.heliMainRotorModels[0][13].rotateAngleY = -3.1415927F;
        super.heliMainRotorModels[0][14].addShapeBox(30.0F, 2.0F, -2.0F, 86, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.heliMainRotorModels[0][14].setRotationPoint(0.0F, -68.0F, 0.0F);
        super.heliMainRotorModels[0][14].rotateAngleY = -3.1415927F;
        super.heliMainRotorModels[0][15].addShapeBox(116.0F, 2.0F, -2.0F, 9, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.heliMainRotorModels[0][15].setRotationPoint(0.0F, -68.0F, 0.0F);
        super.heliMainRotorModels[0][15].rotateAngleY = -3.1415927F;
        super.heliMainRotorModels[0][16].addShapeBox(3.0F, 0.0F, -3.0F, 8, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F,
                -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F,
                0.0F, 0.0F, 0.0F);
        super.heliMainRotorModels[0][16].setRotationPoint(0.0F, -68.0F, 0.0F);
        super.heliMainRotorModels[0][16].rotateAngleY = -4.712389F;
        super.heliMainRotorModels[0][17].addShapeBox(11.0F, 2.0F, -2.0F, 12, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.heliMainRotorModels[0][17].setRotationPoint(0.0F, -68.0F, 0.0F);
        super.heliMainRotorModels[0][17].rotateAngleY = -4.712389F;
        super.heliMainRotorModels[0][18].addShapeBox(23.0F, 2.0F, -2.0F, 7, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F,
                0.0F, 0.0F);
        super.heliMainRotorModels[0][18].setRotationPoint(0.0F, -68.0F, 0.0F);
        super.heliMainRotorModels[0][18].rotateAngleY = -4.712389F;
        super.heliMainRotorModels[0][19].addShapeBox(30.0F, 2.0F, -2.0F, 86, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.heliMainRotorModels[0][19].setRotationPoint(0.0F, -68.0F, 0.0F);
        super.heliMainRotorModels[0][19].rotateAngleY = -4.712389F;
        super.heliMainRotorModels[0][20].addShapeBox(116.0F, 2.0F, -2.0F, 9, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.heliMainRotorModels[0][20].setRotationPoint(0.0F, -68.0F, 0.0F);
        super.heliMainRotorModels[0][20].rotateAngleY = -4.712389F;
        super.heliTailRotorModels = new ModelRendererTurbo[1][4];
        super.heliTailRotorModels[0][0] = new ModelRendererTurbo(this, 200, 527, this.textureX, this.textureY);
        super.heliTailRotorModels[0][1] = new ModelRendererTurbo(this, 200, 543, this.textureX, this.textureY);
        super.heliTailRotorModels[0][2] = new ModelRendererTurbo(this, 200, 564, this.textureX, this.textureY);
        super.heliTailRotorModels[0][3] = new ModelRendererTurbo(this, 200, 543, this.textureX, this.textureY);
        super.heliTailRotorModels[0][0].addShapeBox(-1.0F, -1.0F, 0.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.heliTailRotorModels[0][0].setRotationPoint(194.0F, -58.0F, 4.0F);
        super.heliTailRotorModels[0][1].addShapeBox(-1.0F, -25.0F, 9.0F, 4, 18, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.heliTailRotorModels[0][1].setRotationPoint(194.0F, -58.0F, 4.0F);
        super.heliTailRotorModels[0][2].addShapeBox(-1.0F, -7.0F, 9.0F, 2, 14, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.heliTailRotorModels[0][2].setRotationPoint(194.0F, -58.0F, 4.0F);
        super.heliTailRotorModels[0][3].addShapeBox(-3.0F, 7.0F, 9.0F, 4, 18, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.heliTailRotorModels[0][3].setRotationPoint(194.0F, -58.0F, 4.0F);
        super.heliMainRotorOrigins = new Vector3f[]{new Vector3f(0.0F, 0.0F, 0.0F)};
        super.heliTailRotorOrigins = new Vector3f[]{new Vector3f(12.125F, 3.625F, 0.25F)};
        super.heliRotorSpeeds = new float[]{1.0F};
        this.translateAll(0.0F, 0.0F, 0.0F);
        this.flipAll();
    }
}
