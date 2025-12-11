package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelLeopard2A6 extends ModelVehicle {

    int textureX = 2048;
    int textureY = 4096;

    public ModelLeopard2A6() {
        super.bodyModel = new ModelRendererTurbo[174];
        super.bodyModel[0] = new ModelRendererTurbo(this, 0, 100, this.textureX, this.textureY);
        super.bodyModel[1] = new ModelRendererTurbo(this, 0, 162, this.textureX, this.textureY);
        super.bodyModel[2] = new ModelRendererTurbo(this, 0, 223, this.textureX, this.textureY);
        super.bodyModel[3] = new ModelRendererTurbo(this, 0, 240, this.textureX, this.textureY);
        super.bodyModel[4] = new ModelRendererTurbo(this, 0, 223, this.textureX, this.textureY);
        super.bodyModel[5] = new ModelRendererTurbo(this, 0, 240, this.textureX, this.textureY);
        super.bodyModel[6] = new ModelRendererTurbo(this, 0, 224, this.textureX, this.textureY);
        super.bodyModel[7] = new ModelRendererTurbo(this, 0, 295, this.textureX, this.textureY);
        super.bodyModel[8] = new ModelRendererTurbo(this, 0, 295, this.textureX, this.textureY);
        super.bodyModel[9] = new ModelRendererTurbo(this, 0, 299, this.textureX, this.textureY);
        super.bodyModel[10] = new ModelRendererTurbo(this, 0, 375, this.textureX, this.textureY);
        super.bodyModel[11] = new ModelRendererTurbo(this, 0, 375, this.textureX, this.textureY);
        super.bodyModel[12] = new ModelRendererTurbo(this, 0, 390, this.textureX, this.textureY);
        super.bodyModel[13] = new ModelRendererTurbo(this, 0, 400, this.textureX, this.textureY);
        super.bodyModel[14] = new ModelRendererTurbo(this, 0, 408, this.textureX, this.textureY);
        super.bodyModel[15] = new ModelRendererTurbo(this, 0, 417, this.textureX, this.textureY);
        super.bodyModel[16] = new ModelRendererTurbo(this, 0, 426, this.textureX, this.textureY);
        super.bodyModel[17] = new ModelRendererTurbo(this, 0, 390, this.textureX, this.textureY);
        super.bodyModel[18] = new ModelRendererTurbo(this, 0, 400, this.textureX, this.textureY);
        super.bodyModel[19] = new ModelRendererTurbo(this, 0, 408, this.textureX, this.textureY);
        super.bodyModel[20] = new ModelRendererTurbo(this, 0, 417, this.textureX, this.textureY);
        super.bodyModel[21] = new ModelRendererTurbo(this, 0, 426, this.textureX, this.textureY);
        super.bodyModel[22] = new ModelRendererTurbo(this, 0, 440, this.textureX, this.textureY);
        super.bodyModel[23] = new ModelRendererTurbo(this, 0, 453, this.textureX, this.textureY);
        super.bodyModel[24] = new ModelRendererTurbo(this, 0, 472, this.textureX, this.textureY);
        super.bodyModel[25] = new ModelRendererTurbo(this, 0, 440, this.textureX, this.textureY);
        super.bodyModel[26] = new ModelRendererTurbo(this, 0, 453, this.textureX, this.textureY);
        super.bodyModel[27] = new ModelRendererTurbo(this, 0, 472, this.textureX, this.textureY);
        super.bodyModel[28] = new ModelRendererTurbo(this, 0, 497, this.textureX, this.textureY);
        super.bodyModel[29] = new ModelRendererTurbo(this, 0, 580, this.textureX, this.textureY);
        super.bodyModel[30] = new ModelRendererTurbo(this, 0, 580, this.textureX, this.textureY);
        super.bodyModel[31] = new ModelRendererTurbo(this, 0, 600, this.textureX, this.textureY);
        super.bodyModel[32] = new ModelRendererTurbo(this, 0, 625, this.textureX, this.textureY);
        super.bodyModel[33] = new ModelRendererTurbo(this, 0, 600, this.textureX, this.textureY);
        super.bodyModel[34] = new ModelRendererTurbo(this, 0, 625, this.textureX, this.textureY);
        super.bodyModel[35] = new ModelRendererTurbo(this, 0, 601, this.textureX, this.textureY);
        super.bodyModel[36] = new ModelRendererTurbo(this, 0, 682, this.textureX, this.textureY);
        super.bodyModel[37] = new ModelRendererTurbo(this, 0, 782, this.textureX, this.textureY);
        super.bodyModel[38] = new ModelRendererTurbo(this, 0, 882, this.textureX, this.textureY);
        super.bodyModel[39] = new ModelRendererTurbo(this, 0, 895, this.textureX, this.textureY);
        super.bodyModel[40] = new ModelRendererTurbo(this, 0, 908, this.textureX, this.textureY);
        super.bodyModel[41] = new ModelRendererTurbo(this, 0, 882, this.textureX, this.textureY);
        super.bodyModel[42] = new ModelRendererTurbo(this, 0, 895, this.textureX, this.textureY);
        super.bodyModel[43] = new ModelRendererTurbo(this, 0, 908, this.textureX, this.textureY);
        super.bodyModel[44] = new ModelRendererTurbo(this, 0, 883, this.textureX, this.textureY);
        super.bodyModel[45] = new ModelRendererTurbo(this, 0, 972, this.textureX, this.textureY);
        super.bodyModel[46] = new ModelRendererTurbo(this, 0, 972, this.textureX, this.textureY);
        super.bodyModel[47] = new ModelRendererTurbo(this, 0, 998, this.textureX, this.textureY);
        super.bodyModel[48] = new ModelRendererTurbo(this, 0, 1010, this.textureX, this.textureY);
        super.bodyModel[49] = new ModelRendererTurbo(this, 0, 1010, this.textureX, this.textureY);
        super.bodyModel[50] = new ModelRendererTurbo(this, 0, 1010, this.textureX, this.textureY);
        super.bodyModel[51] = new ModelRendererTurbo(this, 0, 998, this.textureX, this.textureY);
        super.bodyModel[52] = new ModelRendererTurbo(this, 0, 1010, this.textureX, this.textureY);
        super.bodyModel[53] = new ModelRendererTurbo(this, 0, 1010, this.textureX, this.textureY);
        super.bodyModel[54] = new ModelRendererTurbo(this, 0, 1010, this.textureX, this.textureY);
        super.bodyModel[55] = new ModelRendererTurbo(this, 0, 1019, this.textureX, this.textureY);
        super.bodyModel[56] = new ModelRendererTurbo(this, 0, 1024, this.textureX, this.textureY);
        super.bodyModel[57] = new ModelRendererTurbo(this, 0, 1019, this.textureX, this.textureY);
        super.bodyModel[58] = new ModelRendererTurbo(this, 0, 1024, this.textureX, this.textureY);
        super.bodyModel[59] = new ModelRendererTurbo(this, 0, 1029, this.textureX, this.textureY);
        super.bodyModel[60] = new ModelRendererTurbo(this, 0, 1036, this.textureX, this.textureY);
        super.bodyModel[61] = new ModelRendererTurbo(this, 0, 1000, this.textureX, this.textureY);
        super.bodyModel[62] = new ModelRendererTurbo(this, 0, 1061, this.textureX, this.textureY);
        super.bodyModel[63] = new ModelRendererTurbo(this, 0, 1135, this.textureX, this.textureY);
        super.bodyModel[64] = new ModelRendererTurbo(this, 0, 1149, this.textureX, this.textureY);
        super.bodyModel[65] = new ModelRendererTurbo(this, 0, 1162, this.textureX, this.textureY);
        super.bodyModel[66] = new ModelRendererTurbo(this, 0, 1175, this.textureX, this.textureY);
        super.bodyModel[67] = new ModelRendererTurbo(this, 0, 1175, this.textureX, this.textureY);
        super.bodyModel[68] = new ModelRendererTurbo(this, 0, 1175, this.textureX, this.textureY);
        super.bodyModel[69] = new ModelRendererTurbo(this, 0, 1175, this.textureX, this.textureY);
        super.bodyModel[70] = new ModelRendererTurbo(this, 0, 1175, this.textureX, this.textureY);
        super.bodyModel[71] = new ModelRendererTurbo(this, 0, 1177, this.textureX, this.textureY);
        super.bodyModel[72] = new ModelRendererTurbo(this, 0, 1188, this.textureX, this.textureY);
        super.bodyModel[73] = new ModelRendererTurbo(this, 0, 1256, this.textureX, this.textureY);
        super.bodyModel[74] = new ModelRendererTurbo(this, 0, 1331, this.textureX, this.textureY);
        super.bodyModel[75] = new ModelRendererTurbo(this, 0, 1402, this.textureX, this.textureY);
        super.bodyModel[76] = new ModelRendererTurbo(this, 0, 1472, this.textureX, this.textureY);
        super.bodyModel[77] = new ModelRendererTurbo(this, 0, 1494, this.textureX, this.textureY);
        super.bodyModel[78] = new ModelRendererTurbo(this, 0, 1494, this.textureX, this.textureY);
        super.bodyModel[79] = new ModelRendererTurbo(this, 0, 1501, this.textureX, this.textureY);
        super.bodyModel[80] = new ModelRendererTurbo(this, 0, 1501, this.textureX, this.textureY);
        super.bodyModel[81] = new ModelRendererTurbo(this, 0, 1506, this.textureX, this.textureY);
        super.bodyModel[82] = new ModelRendererTurbo(this, 0, 1472, this.textureX, this.textureY);
        super.bodyModel[83] = new ModelRendererTurbo(this, 0, 1494, this.textureX, this.textureY);
        super.bodyModel[84] = new ModelRendererTurbo(this, 0, 1494, this.textureX, this.textureY);
        super.bodyModel[85] = new ModelRendererTurbo(this, 0, 1501, this.textureX, this.textureY);
        super.bodyModel[86] = new ModelRendererTurbo(this, 0, 1501, this.textureX, this.textureY);
        super.bodyModel[87] = new ModelRendererTurbo(this, 0, 1506, this.textureX, this.textureY);
        super.bodyModel[88] = new ModelRendererTurbo(this, 0, 1510, this.textureX, this.textureY);
        super.bodyModel[89] = new ModelRendererTurbo(this, 0, 1510, this.textureX, this.textureY);
        super.bodyModel[90] = new ModelRendererTurbo(this, 0, 1510, this.textureX, this.textureY);
        super.bodyModel[91] = new ModelRendererTurbo(this, 0, 1510, this.textureX, this.textureY);
        super.bodyModel[92] = new ModelRendererTurbo(this, 0, 1509, this.textureX, this.textureY);
        super.bodyModel[93] = new ModelRendererTurbo(this, 0, 1510, this.textureX, this.textureY);
        super.bodyModel[94] = new ModelRendererTurbo(this, 0, 1510, this.textureX, this.textureY);
        super.bodyModel[95] = new ModelRendererTurbo(this, 0, 1510, this.textureX, this.textureY);
        super.bodyModel[96] = new ModelRendererTurbo(this, 0, 1510, this.textureX, this.textureY);
        super.bodyModel[97] = new ModelRendererTurbo(this, 0, 1509, this.textureX, this.textureY);
        super.bodyModel[98] = new ModelRendererTurbo(this, 0, 1530, this.textureX, this.textureY);
        super.bodyModel[99] = new ModelRendererTurbo(this, 0, 1530, this.textureX, this.textureY);
        super.bodyModel[100] = new ModelRendererTurbo(this, 0, 1530, this.textureX, this.textureY);
        super.bodyModel[101] = new ModelRendererTurbo(this, 0, 1536, this.textureX, this.textureY);
        super.bodyModel[102] = new ModelRendererTurbo(this, 0, 1536, this.textureX, this.textureY);
        super.bodyModel[103] = new ModelRendererTurbo(this, 0, 1536, this.textureX, this.textureY);
        super.bodyModel[104] = new ModelRendererTurbo(this, 0, 1541, this.textureX, this.textureY);
        super.bodyModel[105] = new ModelRendererTurbo(this, 0, 1541, this.textureX, this.textureY);
        super.bodyModel[106] = new ModelRendererTurbo(this, 0, 1541, this.textureX, this.textureY);
        super.bodyModel[107] = new ModelRendererTurbo(this, 0, 1536, this.textureX, this.textureY);
        super.bodyModel[108] = new ModelRendererTurbo(this, 0, 1536, this.textureX, this.textureY);
        super.bodyModel[109] = new ModelRendererTurbo(this, 0, 1536, this.textureX, this.textureY);
        super.bodyModel[110] = new ModelRendererTurbo(this, 0, 1541, this.textureX, this.textureY);
        super.bodyModel[111] = new ModelRendererTurbo(this, 0, 1541, this.textureX, this.textureY);
        super.bodyModel[112] = new ModelRendererTurbo(this, 0, 1541, this.textureX, this.textureY);
        super.bodyModel[113] = new ModelRendererTurbo(this, 0, 1530, this.textureX, this.textureY);
        super.bodyModel[114] = new ModelRendererTurbo(this, 0, 1530, this.textureX, this.textureY);
        super.bodyModel[115] = new ModelRendererTurbo(this, 0, 1530, this.textureX, this.textureY);
        super.bodyModel[116] = new ModelRendererTurbo(this, 0, 1546, this.textureX, this.textureY);
        super.bodyModel[117] = new ModelRendererTurbo(this, 0, 1546, this.textureX, this.textureY);
        super.bodyModel[118] = new ModelRendererTurbo(this, 0, 1556, this.textureX, this.textureY);
        super.bodyModel[119] = new ModelRendererTurbo(this, 0, 1568, this.textureX, this.textureY);
        super.bodyModel[120] = new ModelRendererTurbo(this, 0, 1571, this.textureX, this.textureY);
        super.bodyModel[121] = new ModelRendererTurbo(this, 0, 1571, this.textureX, this.textureY);
        super.bodyModel[122] = new ModelRendererTurbo(this, 0, 1577, this.textureX, this.textureY);
        super.bodyModel[123] = new ModelRendererTurbo(this, 0, 1577, this.textureX, this.textureY);
        super.bodyModel[124] = new ModelRendererTurbo(this, 0, 1571, this.textureX, this.textureY);
        super.bodyModel[125] = new ModelRendererTurbo(this, 0, 1577, this.textureX, this.textureY);
        super.bodyModel[126] = new ModelRendererTurbo(this, 0, 1577, this.textureX, this.textureY);
        super.bodyModel[127] = new ModelRendererTurbo(this, 0, 1556, this.textureX, this.textureY);
        super.bodyModel[128] = new ModelRendererTurbo(this, 0, 1571, this.textureX, this.textureY);
        super.bodyModel[129] = new ModelRendererTurbo(this, 0, 1571, this.textureX, this.textureY);
        super.bodyModel[130] = new ModelRendererTurbo(this, 0, 1577, this.textureX, this.textureY);
        super.bodyModel[131] = new ModelRendererTurbo(this, 0, 1577, this.textureX, this.textureY);
        super.bodyModel[132] = new ModelRendererTurbo(this, 0, 1571, this.textureX, this.textureY);
        super.bodyModel[133] = new ModelRendererTurbo(this, 0, 1577, this.textureX, this.textureY);
        super.bodyModel[134] = new ModelRendererTurbo(this, 0, 1577, this.textureX, this.textureY);
        super.bodyModel[135] = new ModelRendererTurbo(this, 0, 1584, this.textureX, this.textureY);
        super.bodyModel[136] = new ModelRendererTurbo(this, 0, 1590, this.textureX, this.textureY);
        super.bodyModel[137] = new ModelRendererTurbo(this, 0, 1590, this.textureX, this.textureY);
        super.bodyModel[138] = new ModelRendererTurbo(this, 0, 1590, this.textureX, this.textureY);
        super.bodyModel[139] = new ModelRendererTurbo(this, 0, 1590, this.textureX, this.textureY);
        super.bodyModel[140] = new ModelRendererTurbo(this, 0, 1590, this.textureX, this.textureY);
        super.bodyModel[141] = new ModelRendererTurbo(this, 0, 1598, this.textureX, this.textureY);
        super.bodyModel[142] = new ModelRendererTurbo(this, 0, 1598, this.textureX, this.textureY);
        super.bodyModel[143] = new ModelRendererTurbo(this, 0, 1584, this.textureX, this.textureY);
        super.bodyModel[144] = new ModelRendererTurbo(this, 0, 1590, this.textureX, this.textureY);
        super.bodyModel[145] = new ModelRendererTurbo(this, 0, 1590, this.textureX, this.textureY);
        super.bodyModel[146] = new ModelRendererTurbo(this, 0, 1590, this.textureX, this.textureY);
        super.bodyModel[147] = new ModelRendererTurbo(this, 0, 1590, this.textureX, this.textureY);
        super.bodyModel[148] = new ModelRendererTurbo(this, 0, 1590, this.textureX, this.textureY);
        super.bodyModel[149] = new ModelRendererTurbo(this, 0, 1598, this.textureX, this.textureY);
        super.bodyModel[150] = new ModelRendererTurbo(this, 0, 1598, this.textureX, this.textureY);
        super.bodyModel[151] = new ModelRendererTurbo(this, 0, 1605, this.textureX, this.textureY);
        super.bodyModel[152] = new ModelRendererTurbo(this, 0, 1610, this.textureX, this.textureY);
        super.bodyModel[153] = new ModelRendererTurbo(this, 0, 1620, this.textureX, this.textureY);
        super.bodyModel[154] = new ModelRendererTurbo(this, 0, 1650, this.textureX, this.textureY);
        super.bodyModel[155] = new ModelRendererTurbo(this, 0, 1656, this.textureX, this.textureY);
        super.bodyModel[156] = new ModelRendererTurbo(this, 0, 1667, this.textureX, this.textureY);
        super.bodyModel[157] = new ModelRendererTurbo(this, 0, 1673, this.textureX, this.textureY);
        super.bodyModel[158] = new ModelRendererTurbo(this, 0, 1682, this.textureX, this.textureY);
        super.bodyModel[159] = new ModelRendererTurbo(this, 0, 1691, this.textureX, this.textureY);
        super.bodyModel[160] = new ModelRendererTurbo(this, 0, 1700, this.textureX, this.textureY);
        super.bodyModel[161] = new ModelRendererTurbo(this, 0, 1715, this.textureX, this.textureY);
        super.bodyModel[162] = new ModelRendererTurbo(this, 0, 1726, this.textureX, this.textureY);
        super.bodyModel[163] = new ModelRendererTurbo(this, 0, 1737, this.textureX, this.textureY);
        super.bodyModel[164] = new ModelRendererTurbo(this, 0, 1691, this.textureX, this.textureY);
        super.bodyModel[165] = new ModelRendererTurbo(this, 0, 1700, this.textureX, this.textureY);
        super.bodyModel[166] = new ModelRendererTurbo(this, 0, 1715, this.textureX, this.textureY);
        super.bodyModel[167] = new ModelRendererTurbo(this, 0, 1726, this.textureX, this.textureY);
        super.bodyModel[168] = new ModelRendererTurbo(this, 0, 1737, this.textureX, this.textureY);
        super.bodyModel[169] = new ModelRendererTurbo(this, 0, 1743, this.textureX, this.textureY);
        super.bodyModel[170] = new ModelRendererTurbo(this, 0, 1743, this.textureX, this.textureY);
        super.bodyModel[171] = new ModelRendererTurbo(this, 0, 1694, this.textureX, this.textureY);
        super.bodyModel[172] = new ModelRendererTurbo(this, 0, 1753, this.textureX, this.textureY);
        super.bodyModel[173] = new ModelRendererTurbo(this, 0, 1568, this.textureX, this.textureY);
        super.bodyModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 7, 7, 53, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[0].setRotationPoint(83.0F, -19.0F, -26.5F);
        super.bodyModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 7, 6, 53, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[1].setRotationPoint(83.0F, -12.0F, -26.5F);
        super.bodyModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 7, 7, 8, 0.0F, 0.0F, -1.0F, 0.0F, -6.0F, -1.0F, 0.0F, -6.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F,
                0.0F);
        super.bodyModel[2].setRotationPoint(83.0F, -19.0F, -42.5F);
        super.bodyModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 7, 7, 8, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[3].setRotationPoint(83.0F, -19.0F, -34.5F);
        super.bodyModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 7, 7, 8, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F,
                -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F,
                0.0F);
        super.bodyModel[4].setRotationPoint(83.0F, -19.0F, 34.5F);
        super.bodyModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 7, 7, 8, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F,
                0.0F);
        super.bodyModel[5].setRotationPoint(83.0F, -19.0F, 26.5F);
        super.bodyModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 12, 2, 69, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, -11.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[6].setRotationPoint(72.0F, -21.0F, -34.5F);
        super.bodyModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 12, 2, 8, 0.0F, 0.0F, -1.0F, 0.0F, -11.0F, -1.0F, 0.0F, -11.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[7].setRotationPoint(72.0F, -21.0F, -42.5F);
        super.bodyModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 12, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, -11.0F,
                -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
        super.bodyModel[8].setRotationPoint(72.0F, -21.0F, 34.5F);
        super.bodyModel[9].addShapeBox(0.0F, 0.0F, 0.0F, 35, 6, 69, 0.0F, 0.0F, 0.0F, 0.0F, -34.0F, 0.0F, 0.0F, -34.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[9].setRotationPoint(38.0F, -27.0F, -34.5F);
        super.bodyModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 35, 6, 8, 0.0F, 0.0F, -1.0F, 0.0F, -34.0F, -1.0F, 0.0F,
                -34.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[10].setRotationPoint(38.0F, -27.0F, -42.5F);
        super.bodyModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 35, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, -34.0F, 0.0F, 0.0F, -34.0F,
                -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
        super.bodyModel[11].setRotationPoint(38.0F, -27.0F, 34.5F);
        super.bodyModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 5, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[12].setRotationPoint(83.0F, -18.0F, -46.5F);
        super.bodyModel[13].addShapeBox(0.0F, 0.0F, 0.0F, 5, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[13].setRotationPoint(83.0F, -14.0F, -46.5F);
        super.bodyModel[14].addShapeBox(0.0F, 0.0F, 0.0F, 12, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, -0.0909F,
                -11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[14].setRotationPoint(72.0F, -20.0F, -47.5F);
        super.bodyModel[15].addShapeBox(0.0F, 0.0F, 0.0F, 12, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, -0.0909F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[15].setRotationPoint(72.0F, -11.0F, -47.5F);
        super.bodyModel[16].addShapeBox(0.0F, 0.0F, 0.0F, 11, 7, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[16].setRotationPoint(72.0F, -18.0F, -47.5F);
        super.bodyModel[17].addShapeBox(0.0F, 0.0F, 0.0F, 5, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[17].setRotationPoint(83.0F, -18.0F, 42.5F);
        super.bodyModel[18].addShapeBox(0.0F, 0.0F, 0.0F, 5, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[18].setRotationPoint(83.0F, -14.0F, 42.5F);
        super.bodyModel[19].addShapeBox(0.0F, 0.0F, 0.0F, 12, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, -11.0F,
                0.0F, -0.0909F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[19].setRotationPoint(72.0F, -20.0F, 42.5F);
        super.bodyModel[20].addShapeBox(0.0F, 0.0F, 0.0F, 12, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, -11.0F, 0.0F, -0.0909F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[20].setRotationPoint(72.0F, -11.0F, 42.5F);
        super.bodyModel[21].addShapeBox(0.0F, 0.0F, 0.0F, 11, 7, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[21].setRotationPoint(72.0F, -18.0F, 42.5F);
        super.bodyModel[22].addShapeBox(0.0F, 0.0F, 0.0F, 35, 6, 5, 0.0F, 0.0F, 0.0F, 0.0F, -34.0F, 0.0F, 0.0F, -34.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[22].setRotationPoint(38.0F, -26.0F, -47.5F);
        super.bodyModel[23].addShapeBox(0.0F, 0.0F, 0.0F, 34, 11, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
        super.bodyModel[23].setRotationPoint(38.0F, -20.0F, -47.5F);
        super.bodyModel[24].addShapeBox(0.0F, 0.0F, 0.0F, 67, 18, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[24].setRotationPoint(-29.0F, -26.0F, -47.5F);
        super.bodyModel[25].addShapeBox(0.0F, 0.0F, 0.0F, 35, 6, 5, 0.0F, 0.0F, 0.0F, 0.0F, -34.0F, 0.0F, 0.0F, -34.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[25].setRotationPoint(38.0F, -26.0F, 42.5F);
        super.bodyModel[26].addShapeBox(0.0F, 0.0F, 0.0F, 34, 11, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
        super.bodyModel[26].setRotationPoint(38.0F, -20.0F, 42.5F);
        super.bodyModel[27].addShapeBox(0.0F, 0.0F, 0.0F, 67, 18, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[27].setRotationPoint(-29.0F, -26.0F, 42.5F);
        super.bodyModel[28].addShapeBox(0.0F, 0.0F, 0.0F, 67, 10, 69, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[28].setRotationPoint(-29.0F, -27.0F, -34.5F);
        super.bodyModel[29].addShapeBox(0.0F, 0.0F, 0.0F, 67, 10, 8, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[29].setRotationPoint(-29.0F, -27.0F, -42.5F);
        super.bodyModel[30].addShapeBox(0.0F, 0.0F, 0.0F, 67, 10, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[30].setRotationPoint(-29.0F, -27.0F, 34.5F);
        super.bodyModel[31].addShapeBox(0.0F, 0.0F, 0.0F, 5, 18, 5, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[31].setRotationPoint(-34.0F, -26.0F, -47.5F);
        super.bodyModel[32].addShapeBox(0.0F, 0.0F, 0.0F, 5, 10, 8, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[32].setRotationPoint(-34.0F, -27.0F, -42.5F);
        super.bodyModel[33].addShapeBox(0.0F, 0.0F, 0.0F, 5, 18, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
        super.bodyModel[33].setRotationPoint(-34.0F, -26.0F, 42.5F);
        super.bodyModel[34].addShapeBox(0.0F, 0.0F, 0.0F, 5, 10, 8, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[34].setRotationPoint(-34.0F, -27.0F, 34.5F);
        super.bodyModel[35].addShapeBox(0.0F, 0.0F, 0.0F, 5, 10, 69, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[35].setRotationPoint(-34.0F, -27.0F, -34.5F);
        super.bodyModel[36].addShapeBox(0.0F, 0.0F, 0.0F, 40, 12, 85, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[36].setRotationPoint(-74.0F, -29.0F, -42.5F);
        super.bodyModel[37].addShapeBox(0.0F, 0.0F, 0.0F, 25, 12, 85, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
        super.bodyModel[37].setRotationPoint(-99.0F, -29.0F, -42.5F);
        super.bodyModel[38].addShapeBox(0.0F, 0.0F, 0.0F, 36, 10, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[38].setRotationPoint(-69.0F, -18.0F, -43.5F);
        super.bodyModel[39].addShapeBox(0.0F, 0.0F, 0.0F, 5, 10, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F);
        super.bodyModel[39].setRotationPoint(-74.0F, -18.0F, -43.5F);
        super.bodyModel[40].addShapeBox(0.0F, 0.0F, 0.0F, 21, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[40].setRotationPoint(-95.0F, -18.0F, -43.5F);
        super.bodyModel[41].addShapeBox(0.0F, 0.0F, 0.0F, 36, 10, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[41].setRotationPoint(-69.0F, -18.0F, 42.5F);
        super.bodyModel[42].addShapeBox(0.0F, 0.0F, 0.0F, 5, 10, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F);
        super.bodyModel[42].setRotationPoint(-74.0F, -18.0F, 42.5F);
        super.bodyModel[43].addShapeBox(0.0F, 0.0F, 0.0F, 21, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[43].setRotationPoint(-95.0F, -18.0F, 42.5F);
        super.bodyModel[44].addShapeBox(0.0F, 0.0F, 0.0F, 47, 3, 83, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[44].setRotationPoint(-98.0F, -30.0F, -41.5F);
        super.bodyModel[45].addShape3D(0.0F, 0.0F, 0.0F,
                new Shape2D(new Coord2D[]{new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(20.0D, 0.0D, 20, 0),
                        new Coord2D(27.0D, 7.0D, 27, 7), new Coord2D(27.0D, 17.0D, 27, 17),
                        new Coord2D(20.0D, 24.0D, 20, 24), new Coord2D(10.0D, 24.0D, 10, 24),
                        new Coord2D(3.0D, 17.0D, 3, 17), new Coord2D(3.0D, 7.0D, 3, 7)}),
                1.0F, 27, 24, 80, 1, 0, new float[]{10.0F, 10.0F, 10.0F, 10.0F, 10.0F, 10.0F, 10.0F, 10.0F});
        super.bodyModel[45].setRotationPoint(-64.0F, -31.0F, -2.0F);
        super.bodyModel[45].rotateAngleX = 1.5707964F;
        super.bodyModel[46].addShape3D(0.0F, 0.0F, 0.0F,
                new Shape2D(new Coord2D[]{new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(20.0D, 0.0D, 20, 0),
                        new Coord2D(27.0D, 7.0D, 27, 7), new Coord2D(27.0D, 17.0D, 27, 17),
                        new Coord2D(20.0D, 24.0D, 20, 24), new Coord2D(10.0D, 24.0D, 10, 24),
                        new Coord2D(3.0D, 17.0D, 3, 17), new Coord2D(3.0D, 7.0D, 3, 7)}),
                1.0F, 27, 24, 80, 1, 0, new float[]{10.0F, 10.0F, 10.0F, 10.0F, 10.0F, 10.0F, 10.0F, 10.0F});
        super.bodyModel[46].setRotationPoint(-64.0F, -31.0F, 26.0F);
        super.bodyModel[46].rotateAngleX = 1.5707964F;
        super.bodyModel[47].addShapeBox(0.0F, 0.0F, 0.0F, 8, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[47].setRotationPoint(-51.0F, -29.0F, -36.5F);
        super.bodyModel[48].addShapeBox(0.0F, 0.0F, 0.0F, 12, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[48].setRotationPoint(-48.0F, -29.0F, -20.5F);
        super.bodyModel[49].addShapeBox(0.0F, 0.0F, 0.0F, 12, 3, 4, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[49].setRotationPoint(-48.0F, -29.0F, -24.5F);
        super.bodyModel[50].addShapeBox(0.0F, 0.0F, 0.0F, 12, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F,
                0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F);
        super.bodyModel[50].setRotationPoint(-48.0F, -29.0F, -16.5F);
        super.bodyModel[51].addShapeBox(0.0F, 0.0F, 0.0F, 8, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[51].setRotationPoint(-51.0F, -29.0F, 29.5F);
        super.bodyModel[52].addShapeBox(0.0F, 0.0F, 0.0F, 12, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[52].setRotationPoint(-48.0F, -29.0F, 16.5F);
        super.bodyModel[53].addShapeBox(0.0F, 0.0F, 0.0F, 12, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F,
                0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F);
        super.bodyModel[53].setRotationPoint(-48.0F, -29.0F, 20.5F);
        super.bodyModel[54].addShapeBox(0.0F, 0.0F, 0.0F, 12, 3, 4, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[54].setRotationPoint(-48.0F, -29.0F, 12.5F);
        super.bodyModel[55].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[55].setRotationPoint(-98.0F, -31.0F, -38.5F);
        super.bodyModel[56].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[56].setRotationPoint(-99.0F, -31.0F, -38.5F);
        super.bodyModel[57].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[57].setRotationPoint(-98.0F, -31.0F, 37.5F);
        super.bodyModel[58].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[58].setRotationPoint(-99.0F, -31.0F, 37.5F);
        super.bodyModel[59].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[59].setRotationPoint(-98.0F, -31.0F, -2.0F);
        super.bodyModel[60].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[60].setRotationPoint(-99.0F, -31.0F, -2.0F);
        super.bodyModel[61].addShapeBox(0.0F, 0.0F, 0.0F, 16, 6, 53, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[61].setRotationPoint(68.0F, -6.0F, -26.5F);
        super.bodyModel[62].addShapeBox(0.0F, 0.0F, 0.0F, 135, 17, 55, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[62].setRotationPoint(-67.0F, -17.0F, -27.5F);
        super.bodyModel[63].addShapeBox(-28.0F, 0.0F, -5.0F, 56, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[63].setRotationPoint(9.0F, -28.0F, 0.0F);
        super.bodyModel[64].addShapeBox(-28.0F, 0.0F, -5.0F, 56, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[64].setRotationPoint(9.0F, -28.0F, 0.0F);
        super.bodyModel[64].rotateAngleY = -0.34906584F;
        super.bodyModel[65].addShapeBox(-28.0F, 0.0F, -5.0F, 56, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[65].setRotationPoint(9.0F, -28.0F, 0.0F);
        super.bodyModel[65].rotateAngleY = -0.6981317F;
        super.bodyModel[66].addShapeBox(-28.0F, 0.0F, -5.0F, 56, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[66].setRotationPoint(9.0F, -28.0F, 0.0F);
        super.bodyModel[66].rotateAngleY = -1.0471976F;
        super.bodyModel[67].addShapeBox(-28.0F, 0.0F, -5.0F, 56, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[67].setRotationPoint(9.0F, -28.0F, 0.0F);
        super.bodyModel[67].rotateAngleY = -1.3962634F;
        super.bodyModel[68].addShapeBox(-28.0F, 0.0F, -5.0F, 56, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[68].setRotationPoint(9.0F, -28.0F, 0.0F);
        super.bodyModel[68].rotateAngleY = -1.7453293F;
        super.bodyModel[69].addShapeBox(-28.0F, 0.0F, -5.0F, 56, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[69].setRotationPoint(9.0F, -28.0F, 0.0F);
        super.bodyModel[69].rotateAngleY = -2.0943952F;
        super.bodyModel[70].addShapeBox(-28.0F, 0.0F, -5.0F, 56, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[70].setRotationPoint(9.0F, -28.0F, 0.0F);
        super.bodyModel[70].rotateAngleY = -2.443461F;
        super.bodyModel[71].addShapeBox(-28.0F, 0.0F, -5.0F, 56, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[71].setRotationPoint(9.0F, -28.0F, 0.0F);
        super.bodyModel[71].rotateAngleY = -2.7925267F;
        super.bodyModel[72].addShapeBox(0.0F, 0.0F, 0.0F, 15, 13, 53, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[72].setRotationPoint(68.0F, -19.0F, -26.5F);
        super.bodyModel[73].addShapeBox(0.0F, 0.0F, 0.0F, 30, 4, 69, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[73].setRotationPoint(38.0F, -21.0F, -34.5F);
        super.bodyModel[74].addShapeBox(0.0F, 0.0F, 0.0F, 4, 17, 51, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F);
        super.bodyModel[74].setRotationPoint(-90.0F, -17.0F, -25.5F);
        super.bodyModel[75].addShapeBox(0.0F, 0.0F, 0.0F, 19, 17, 51, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[75].setRotationPoint(-86.0F, -17.0F, -25.5F);
        super.bodyModel[76].addShapeBox(0.0F, 0.0F, 0.0F, 2, 5, 16, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[76].setRotationPoint(-95.0F, -18.0F, -41.5F);
        super.bodyModel[77].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F,
                0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[77].setRotationPoint(-96.0F, -16.0F, -40.5F);
        super.bodyModel[78].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
        super.bodyModel[78].setRotationPoint(-96.0F, -15.0F, -40.5F);
        super.bodyModel[79].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F,
                0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F,
                -0.4F);
        super.bodyModel[79].setRotationPoint(-96.0F, -16.0F, -35.0F);
        super.bodyModel[80].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F,
                0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                -1.0F);
        super.bodyModel[80].setRotationPoint(-96.0F, -15.0F, -35.0F);
        super.bodyModel[81].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[81].setRotationPoint(-96.0F, -15.5F, -31.0F);
        super.bodyModel[82].addShapeBox(0.0F, 0.0F, 0.0F, 2, 5, 16, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[82].setRotationPoint(-95.0F, -18.0F, 25.5F);
        super.bodyModel[83].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F,
                0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[83].setRotationPoint(-96.0F, -16.0F, 35.5F);
        super.bodyModel[84].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
        super.bodyModel[84].setRotationPoint(-96.0F, -15.0F, 35.5F);
        super.bodyModel[85].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F,
                0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F,
                -0.4F);
        super.bodyModel[85].setRotationPoint(-96.0F, -16.0F, 32.0F);
        super.bodyModel[86].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F,
                0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                -1.0F);
        super.bodyModel[86].setRotationPoint(-96.0F, -15.0F, 32.0F);
        super.bodyModel[87].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[87].setRotationPoint(-96.0F, -15.5F, 30.0F);
        super.bodyModel[88].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[88].setRotationPoint(-92.0F, -16.0F, -23.5F);
        super.bodyModel[89].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[89].setRotationPoint(-92.0F, -13.0F, -23.5F);
        super.bodyModel[90].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F);
        super.bodyModel[90].setRotationPoint(-92.0F, -13.0F, -20.5F);
        super.bodyModel[91].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[91].setRotationPoint(-92.0F, -16.0F, -20.5F);
        super.bodyModel[92].addShapeBox(0.0F, 0.0F, 0.0F, 2, 7, 12, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[92].setRotationPoint(-92.0F, -16.0F, -15.5F);
        super.bodyModel[93].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[93].setRotationPoint(-92.0F, -16.0F, 20.5F);
        super.bodyModel[94].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F);
        super.bodyModel[94].setRotationPoint(-92.0F, -13.0F, 20.5F);
        super.bodyModel[95].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[95].setRotationPoint(-92.0F, -13.0F, 17.5F);
        super.bodyModel[96].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[96].setRotationPoint(-92.0F, -16.0F, 17.5F);
        super.bodyModel[97].addShapeBox(0.0F, 0.0F, 0.0F, 2, 7, 12, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[97].setRotationPoint(-92.0F, -16.0F, 3.5F);
        super.bodyModel[98].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F,
                0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[98].setRotationPoint(-91.0F, -6.0F, -18.5F);
        super.bodyModel[99].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[99].setRotationPoint(-91.0F, -5.0F, -18.5F);
        super.bodyModel[100].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                -1.0F);
        super.bodyModel[100].setRotationPoint(-91.0F, -4.0F, -18.5F);
        super.bodyModel[101].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[101].setRotationPoint(-93.0F, -7.0F, -22.5F);
        super.bodyModel[102].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F,
                0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[102].setRotationPoint(-93.0F, -8.0F, -22.5F);
        super.bodyModel[103].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F,
                -0.5F);
        super.bodyModel[103].setRotationPoint(-93.0F, -6.0F, -22.5F);
        super.bodyModel[104].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[104].setRotationPoint(-92.0F, -5.0F, -22.0F);
        super.bodyModel[105].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F,
                0.0F);
        super.bodyModel[105].setRotationPoint(-94.0F, -4.0F, -22.0F);
        super.bodyModel[106].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[106].setRotationPoint(-94.0F, -6.0F, -22.0F);
        super.bodyModel[107].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[107].setRotationPoint(-93.0F, -7.0F, 20.5F);
        super.bodyModel[108].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F,
                0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[108].setRotationPoint(-93.0F, -8.0F, 20.5F);
        super.bodyModel[109].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F,
                -0.5F);
        super.bodyModel[109].setRotationPoint(-93.0F, -6.0F, 20.5F);
        super.bodyModel[110].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[110].setRotationPoint(-92.0F, -5.0F, 21.0F);
        super.bodyModel[111].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F,
                0.0F);
        super.bodyModel[111].setRotationPoint(-94.0F, -4.0F, 21.0F);
        super.bodyModel[112].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[112].setRotationPoint(-94.0F, -6.0F, 21.0F);
        super.bodyModel[113].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F,
                0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[113].setRotationPoint(-91.0F, -6.0F, 15.5F);
        super.bodyModel[114].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[114].setRotationPoint(-91.0F, -5.0F, 15.5F);
        super.bodyModel[115].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                -1.0F);
        super.bodyModel[115].setRotationPoint(-91.0F, -4.0F, 15.5F);
        super.bodyModel[116].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F,
                0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[116].setRotationPoint(-91.0F, -8.0F, -3.0F);
        super.bodyModel[117].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                -1.0F);
        super.bodyModel[117].setRotationPoint(-91.0F, -6.0F, -3.0F);
        super.bodyModel[118].addShapeBox(0.0F, 0.0F, 0.0F, 3, 3, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[118].setRotationPoint(-30.0F, -29.0F, -46.5F);
        super.bodyModel[119].addShapeBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[119].setRotationPoint(-30.0F, -27.0F, -38.5F);
        super.bodyModel[120].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[120].setRotationPoint(-23.0F, -26.5F, -42.5F);
        super.bodyModel[121].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[121].setRotationPoint(-13.0F, -26.5F, -45.5F);
        super.bodyModel[122].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[122].setRotationPoint(-1.0F, -27.0F, -43.5F);
        super.bodyModel[123].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[123].setRotationPoint(5.0F, -27.0F, -43.5F);
        super.bodyModel[124].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[124].setRotationPoint(14.0F, -26.5F, -45.5F);
        super.bodyModel[125].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[125].setRotationPoint(27.0F, -26.5F, -44.5F);
        super.bodyModel[126].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[126].setRotationPoint(33.0F, -26.5F, -44.5F);
        super.bodyModel[127].addShapeBox(0.0F, 0.0F, 0.0F, 3, 3, 8, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[127].setRotationPoint(-30.0F, -29.0F, 38.5F);
        super.bodyModel[128].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[128].setRotationPoint(-23.0F, -26.5F, 40.5F);
        super.bodyModel[129].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[129].setRotationPoint(-13.0F, -26.5F, 43.5F);
        super.bodyModel[130].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[130].setRotationPoint(-1.0F, -27.0F, 39.5F);
        super.bodyModel[131].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[131].setRotationPoint(5.0F, -27.0F, 39.5F);
        super.bodyModel[132].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[132].setRotationPoint(14.0F, -26.5F, 43.5F);
        super.bodyModel[133].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[133].setRotationPoint(27.0F, -26.5F, 40.5F);
        super.bodyModel[134].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[134].setRotationPoint(33.0F, -26.5F, 40.5F);
        super.bodyModel[135].addShapeBox(0.0F, 0.0F, 0.0F, 5, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[135].setRotationPoint(37.0F, -27.0F, -45.5F);
        super.bodyModel[136].addShapeBox(4.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[136].setRotationPoint(39.0F, -27.0F, -44.5F);
        super.bodyModel[136].rotateAngleZ = -0.17453294F;
        super.bodyModel[137].addShapeBox(8.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[137].setRotationPoint(39.0F, -27.0F, -44.5F);
        super.bodyModel[137].rotateAngleZ = -0.17453294F;
        super.bodyModel[138].addShapeBox(18.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[138].setRotationPoint(39.0F, -27.0F, -44.5F);
        super.bodyModel[138].rotateAngleZ = -0.17453294F;
        super.bodyModel[139].addShapeBox(22.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[139].setRotationPoint(39.0F, -27.0F, -44.5F);
        super.bodyModel[139].rotateAngleZ = -0.17453294F;
        super.bodyModel[140].addShapeBox(31.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[140].setRotationPoint(39.0F, -27.0F, -44.5F);
        super.bodyModel[140].rotateAngleZ = -0.17453294F;
        super.bodyModel[141].addShapeBox(26.0F, 0.0F, 0.0F, 4, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[141].setRotationPoint(39.0F, -27.0F, -45.5F);
        super.bodyModel[141].rotateAngleZ = -0.17453294F;
        super.bodyModel[142].addShapeBox(12.0F, 0.0F, 0.0F, 4, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[142].setRotationPoint(39.0F, -27.0F, -45.5F);
        super.bodyModel[142].rotateAngleZ = -0.17453294F;
        super.bodyModel[143].addShapeBox(0.0F, 0.0F, 0.0F, 5, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[143].setRotationPoint(37.0F, -27.0F, 42.5F);
        super.bodyModel[144].addShapeBox(4.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[144].setRotationPoint(39.0F, -27.0F, 40.5F);
        super.bodyModel[144].rotateAngleZ = -0.17453294F;
        super.bodyModel[145].addShapeBox(8.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[145].setRotationPoint(39.0F, -27.0F, 40.5F);
        super.bodyModel[145].rotateAngleZ = -0.17453294F;
        super.bodyModel[146].addShapeBox(18.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[146].setRotationPoint(39.0F, -27.0F, 40.5F);
        super.bodyModel[146].rotateAngleZ = -0.17453294F;
        super.bodyModel[147].addShapeBox(22.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[147].setRotationPoint(39.0F, -27.0F, 40.5F);
        super.bodyModel[147].rotateAngleZ = -0.17453294F;
        super.bodyModel[148].addShapeBox(31.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[148].setRotationPoint(39.0F, -27.0F, 40.5F);
        super.bodyModel[148].rotateAngleZ = -0.17453294F;
        super.bodyModel[149].addShapeBox(26.0F, 0.0F, 0.0F, 4, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[149].setRotationPoint(39.0F, -27.0F, 42.5F);
        super.bodyModel[149].rotateAngleZ = -0.17453294F;
        super.bodyModel[150].addShapeBox(12.0F, 0.0F, 0.0F, 4, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[150].setRotationPoint(39.0F, -27.0F, 42.5F);
        super.bodyModel[150].rotateAngleZ = -0.17453294F;
        super.bodyModel[151].addShapeBox(8.0F, -1.0F, 0.0F, 18, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[151].setRotationPoint(39.0F, -27.0F, -40.5F);
        super.bodyModel[151].rotateAngleZ = -0.17453294F;
        super.bodyModel[152].addShapeBox(8.0F, -1.0F, 0.0F, 7, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[152].setRotationPoint(39.0F, -27.0F, -38.5F);
        super.bodyModel[152].rotateAngleZ = -0.17453294F;
        super.bodyModel[153].addShapeBox(8.0F, -1.0F, 0.0F, 2, 2, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[153].setRotationPoint(39.0F, -27.0F, -33.5F);
        super.bodyModel[153].rotateAngleZ = -0.17453294F;
        super.bodyModel[154].addShapeBox(8.0F, -2.0F, 0.0F, 7, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[154].setRotationPoint(39.0F, -27.0F, -8.5F);
        super.bodyModel[154].rotateAngleZ = -0.17453294F;
        super.bodyModel[155].addShapeBox(8.0F, -2.0F, 0.0F, 7, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[155].setRotationPoint(39.0F, -27.0F, -5.5F);
        super.bodyModel[155].rotateAngleZ = -0.17453294F;
        super.bodyModel[156].addShapeBox(8.0F, -2.0F, 0.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
        super.bodyModel[156].setRotationPoint(39.0F, -27.0F, 1.5F);
        super.bodyModel[156].rotateAngleZ = -0.17453294F;
        super.bodyModel[157].addShapeBox(15.0F, -2.0F, 0.0F, 8, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[157].setRotationPoint(39.0F, -27.0F, -2.5F);
        super.bodyModel[157].rotateAngleZ = -0.17453294F;
        super.bodyModel[158].addShapeBox(23.0F, -3.0F, 0.0F, 8, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[158].setRotationPoint(39.0F, -27.0F, -2.5F);
        super.bodyModel[158].rotateAngleZ = -0.17453294F;
        super.bodyModel[159].addShapeBox(0.0F, 0.0F, 0.0F, 5, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[159].setRotationPoint(83.0F, -19.0F, -25.5F);
        super.bodyModel[160].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[160].setRotationPoint(83.0F, -19.0F, -24.5F);
        super.bodyModel[161].addShapeBox(0.0F, 0.0F, 0.0F, 4, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[161].setRotationPoint(86.0F, -18.0F, -23.5F);
        super.bodyModel[162].addTrapezoid(0.0F, 0.0F, 0.0F, 1, 4, 5, 0.0F, -1.0F, 2);
        super.bodyModel[162].setRotationPoint(90.0F, -18.0F, -23.5F);
        super.bodyModel[163].addShapeBox(0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[163].setRotationPoint(86.0F, -17.0F, -17.5F);
        super.bodyModel[164].addShapeBox(0.0F, 0.0F, 0.0F, 5, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[164].setRotationPoint(83.0F, -19.0F, 24.5F);
        super.bodyModel[165].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[165].setRotationPoint(83.0F, -19.0F, 12.5F);
        super.bodyModel[166].addShapeBox(0.0F, 0.0F, 0.0F, 4, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[166].setRotationPoint(86.0F, -18.0F, 18.5F);
        super.bodyModel[167].addTrapezoid(0.0F, 0.0F, 0.0F, 1, 4, 5, 0.0F, -1.0F, 2);
        super.bodyModel[167].setRotationPoint(90.0F, -18.0F, 18.5F);
        super.bodyModel[168].addShapeBox(0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[168].setRotationPoint(86.0F, -17.0F, 15.5F);
        super.bodyModel[169].addShapeBox(0.0F, 0.0F, 0.0F, 25, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[169].setRotationPoint(-94.0F, -31.0F, -28.5F);
        super.bodyModel[170].addShapeBox(0.0F, 0.0F, 0.0F, 25, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[170].setRotationPoint(-94.0F, -31.0F, 27.5F);
        super.bodyModel[171].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 55, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[171].setRotationPoint(-94.0F, -31.0F, -27.5F);
        super.bodyModel[172].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[172].setRotationPoint(-90.0F, -31.0F, -5.0F);
        super.bodyModel[173].addShapeBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[173].setRotationPoint(-30.0F, -27.0F, 37.5F);
        super.turretModel = new ModelRendererTurbo[77];
        super.turretModel[0] = new ModelRendererTurbo(this, 0, 1755, this.textureX, this.textureY);
        super.turretModel[1] = new ModelRendererTurbo(this, 0, 1840, this.textureX, this.textureY);
        super.turretModel[2] = new ModelRendererTurbo(this, 0, 1865, this.textureX, this.textureY);
        super.turretModel[3] = new ModelRendererTurbo(this, 0, 1950, this.textureX, this.textureY);
        super.turretModel[4] = new ModelRendererTurbo(this, 0, 1972, this.textureX, this.textureY);
        super.turretModel[5] = new ModelRendererTurbo(this, 0, 2007, this.textureX, this.textureY);
        super.turretModel[6] = new ModelRendererTurbo(this, 0, 2026, this.textureX, this.textureY);
        super.turretModel[7] = new ModelRendererTurbo(this, 0, 2044, this.textureX, this.textureY);
        super.turretModel[8] = new ModelRendererTurbo(this, 0, 2078, this.textureX, this.textureY);
        super.turretModel[9] = new ModelRendererTurbo(this, 0, 2102, this.textureX, this.textureY);
        super.turretModel[10] = new ModelRendererTurbo(this, 0, 2112, this.textureX, this.textureY);
        super.turretModel[11] = new ModelRendererTurbo(this, 0, 2126, this.textureX, this.textureY);
        super.turretModel[12] = new ModelRendererTurbo(this, 0, 1972, this.textureX, this.textureY);
        super.turretModel[13] = new ModelRendererTurbo(this, 0, 2007, this.textureX, this.textureY);
        super.turretModel[14] = new ModelRendererTurbo(this, 0, 2044, this.textureX, this.textureY);
        super.turretModel[15] = new ModelRendererTurbo(this, 0, 2078, this.textureX, this.textureY);
        super.turretModel[16] = new ModelRendererTurbo(this, 0, 2102, this.textureX, this.textureY);
        super.turretModel[17] = new ModelRendererTurbo(this, 0, 2079, this.textureX, this.textureY);
        super.turretModel[18] = new ModelRendererTurbo(this, 0, 2165, this.textureX, this.textureY);
        super.turretModel[19] = new ModelRendererTurbo(this, 0, 2250, this.textureX, this.textureY);
        super.turretModel[20] = new ModelRendererTurbo(this, 0, 2333, this.textureX, this.textureY);
        super.turretModel[21] = new ModelRendererTurbo(this, 0, 2403, this.textureX, this.textureY);
        super.turretModel[22] = new ModelRendererTurbo(this, 0, 2429, this.textureX, this.textureY);
        super.turretModel[23] = new ModelRendererTurbo(this, 0, 2455, this.textureX, this.textureY);
        super.turretModel[24] = new ModelRendererTurbo(this, 0, 2478, this.textureX, this.textureY);
        super.turretModel[25] = new ModelRendererTurbo(this, 0, 2500, this.textureX, this.textureY);
        super.turretModel[26] = new ModelRendererTurbo(this, 0, 2523, this.textureX, this.textureY);
        super.turretModel[27] = new ModelRendererTurbo(this, 0, 2548, this.textureX, this.textureY);
        super.turretModel[28] = new ModelRendererTurbo(this, 0, 2574, this.textureX, this.textureY);
        super.turretModel[29] = new ModelRendererTurbo(this, 0, 2590, this.textureX, this.textureY);
        super.turretModel[30] = new ModelRendererTurbo(this, 0, 2590, this.textureX, this.textureY);
        super.turretModel[31] = new ModelRendererTurbo(this, 0, 2590, this.textureX, this.textureY);
        super.turretModel[32] = new ModelRendererTurbo(this, 0, 2609, this.textureX, this.textureY);
        super.turretModel[33] = new ModelRendererTurbo(this, 0, 2618, this.textureX, this.textureY);
        super.turretModel[34] = new ModelRendererTurbo(this, 0, 2637, this.textureX, this.textureY);
        super.turretModel[35] = new ModelRendererTurbo(this, 0, 2655, this.textureX, this.textureY);
        super.turretModel[36] = new ModelRendererTurbo(this, 0, 2675, this.textureX, this.textureY);
        super.turretModel[37] = new ModelRendererTurbo(this, 0, 2675, this.textureX, this.textureY);
        super.turretModel[38] = new ModelRendererTurbo(this, 0, 2682, this.textureX, this.textureY);
        super.turretModel[39] = new ModelRendererTurbo(this, 0, 2692, this.textureX, this.textureY);
        super.turretModel[40] = new ModelRendererTurbo(this, 0, 2695, this.textureX, this.textureY);
        super.turretModel[41] = new ModelRendererTurbo(this, 0, 2700, this.textureX, this.textureY);
        super.turretModel[42] = new ModelRendererTurbo(this, 0, 2700, this.textureX, this.textureY);
        super.turretModel[43] = new ModelRendererTurbo(this, 0, 2705, this.textureX, this.textureY);
        super.turretModel[44] = new ModelRendererTurbo(this, 0, 2700, this.textureX, this.textureY);
        super.turretModel[45] = new ModelRendererTurbo(this, 0, 2700, this.textureX, this.textureY);
        super.turretModel[46] = new ModelRendererTurbo(this, 0, 2705, this.textureX, this.textureY);
        super.turretModel[47] = new ModelRendererTurbo(this, 0, 2026, this.textureX, this.textureY);
        super.turretModel[48] = new ModelRendererTurbo(this, 0, 2753, this.textureX, this.textureY);
        super.turretModel[49] = new ModelRendererTurbo(this, 0, 2753, this.textureX, this.textureY);
        super.turretModel[50] = new ModelRendererTurbo(this, 0, 2762, this.textureX, this.textureY);
        super.turretModel[51] = new ModelRendererTurbo(this, 0, 1840, this.textureX, this.textureY);
        super.turretModel[52] = new ModelRendererTurbo(this, 0, 1950, this.textureX, this.textureY);
        super.turretModel[53] = new ModelRendererTurbo(this, 0, 2112, this.textureX, this.textureY);
        super.turretModel[54] = new ModelRendererTurbo(this, 0, 2126, this.textureX, this.textureY);
        super.turretModel[55] = new ModelRendererTurbo(this, 0, 2762, this.textureX, this.textureY);
        super.turretModel[56] = new ModelRendererTurbo(this, 0, 2786, this.textureX, this.textureY);
        super.turretModel[57] = new ModelRendererTurbo(this, 0, 2786, this.textureX, this.textureY);
        super.turretModel[58] = new ModelRendererTurbo(this, 0, 2795, this.textureX, this.textureY);
        super.turretModel[59] = new ModelRendererTurbo(this, 0, 2802, this.textureX, this.textureY);
        super.turretModel[60] = new ModelRendererTurbo(this, 0, 2802, this.textureX, this.textureY);
        super.turretModel[61] = new ModelRendererTurbo(this, 0, 2802, this.textureX, this.textureY);
        super.turretModel[62] = new ModelRendererTurbo(this, 0, 2802, this.textureX, this.textureY);
        super.turretModel[63] = new ModelRendererTurbo(this, 0, 2802, this.textureX, this.textureY);
        super.turretModel[64] = new ModelRendererTurbo(this, 0, 2802, this.textureX, this.textureY);
        super.turretModel[65] = new ModelRendererTurbo(this, 0, 2802, this.textureX, this.textureY);
        super.turretModel[66] = new ModelRendererTurbo(this, 0, 2802, this.textureX, this.textureY);
        super.turretModel[67] = new ModelRendererTurbo(this, 0, 2795, this.textureX, this.textureY);
        super.turretModel[68] = new ModelRendererTurbo(this, 0, 2802, this.textureX, this.textureY);
        super.turretModel[69] = new ModelRendererTurbo(this, 0, 2802, this.textureX, this.textureY);
        super.turretModel[70] = new ModelRendererTurbo(this, 0, 2802, this.textureX, this.textureY);
        super.turretModel[71] = new ModelRendererTurbo(this, 0, 2802, this.textureX, this.textureY);
        super.turretModel[72] = new ModelRendererTurbo(this, 0, 2802, this.textureX, this.textureY);
        super.turretModel[73] = new ModelRendererTurbo(this, 0, 2802, this.textureX, this.textureY);
        super.turretModel[74] = new ModelRendererTurbo(this, 0, 2802, this.textureX, this.textureY);
        super.turretModel[75] = new ModelRendererTurbo(this, 0, 2802, this.textureX, this.textureY);
        super.turretModel[76] = new ModelRendererTurbo(this, 2, 3542, this.textureX, this.textureY);
        super.turretModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 30, 18, 65, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[0].setRotationPoint(-6.0F, -46.0F, -32.5F);
        super.turretModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 30, 18, 4, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.turretModel[1].setRotationPoint(-6.0F, -46.0F, -36.5F);
        super.turretModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 13, 16, 65, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F,
                -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                0.0F);
        super.turretModel[2].setRotationPoint(24.0F, -44.0F, -32.5F);
        super.turretModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 13, 16, 4, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, -2.0F, 0.0F,
                -1.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F,
                0.0F);
        super.turretModel[3].setRotationPoint(24.0F, -44.0F, -36.5F);
        super.turretModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 15, 8, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, -1.0F, 0.0F,
                -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[4].setRotationPoint(37.0F, -43.0F, -30.5F);
        super.turretModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 10, 7, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[5].setRotationPoint(37.0F, -35.0F, -15.5F);
        super.turretModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 21, 7, 9, 0.0F, 0.0F, 0.0F, 0.0F, -6.2609F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -20.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.turretModel[6].setRotationPoint(47.0F, -35.0F, -15.5F);
        super.turretModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 16, 8, 24, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, -23.0F,
                0.0F, -7.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -23.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.turretModel[7].setRotationPoint(52.0F, -43.0F, -29.5F);
        super.turretModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 15, 7, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F,
                9.7391F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.turretModel[8].setRotationPoint(37.0F, -35.0F, -30.5F);
        super.turretModel[9].addShapeBox(0.0F, 0.0F, 0.0F, 21, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.turretModel[9].setRotationPoint(47.0F, -35.0F, -6.5F);
        super.turretModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 15, 8, 4, 0.0F, 0.0F, -6.0F, 0.0F, -1.0F, -7.5F, -4.0F,
                0.0F, -7.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -4.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F,
                0.0F);
        super.turretModel[10].setRotationPoint(37.0F, -43.0F, -34.5F);
        super.turretModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 15, 7, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -4.0F, 0.0F,
                0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, -14.0F, -6.0F, 0.0F, -14.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.turretModel[11].setRotationPoint(37.0F, -35.0F, -34.5F);
        super.turretModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 15, 8, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                -7.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                0.0F);
        super.turretModel[12].setRotationPoint(37.0F, -43.0F, 5.5F);
        super.turretModel[13].addShapeBox(0.0F, 0.0F, 0.0F, 10, 7, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[13].setRotationPoint(37.0F, -35.0F, 5.5F);
        super.turretModel[14].addShapeBox(0.0F, 0.0F, 0.0F, 16, 8, 24, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F,
                -7.0F, -23.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -23.0F, 0.0F, 0.0F,
                0.0F);
        super.turretModel[14].setRotationPoint(52.0F, -43.0F, 5.5F);
        super.turretModel[15].addShapeBox(0.0F, 0.0F, 0.0F, 15, 7, 15, 0.0F, 0.0F, 0.0F, 0.0F, 9.7391F, 0.0F, 0.0F,
                0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.turretModel[15].setRotationPoint(37.0F, -35.0F, 15.5F);
        super.turretModel[16].addShapeBox(0.0F, 0.0F, 0.0F, 21, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.turretModel[16].setRotationPoint(47.0F, -35.0F, 5.5F);
        super.turretModel[17].addShapeBox(0.0F, 0.0F, 0.0F, 22, 18, 65, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[17].setRotationPoint(-28.0F, -46.0F, -32.5F);
        super.turretModel[18].addShapeBox(0.0F, 0.0F, 0.0F, 10, 18, 65, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
        super.turretModel[18].setRotationPoint(-38.0F, -46.0F, -32.5F);
        super.turretModel[19].addShapeBox(0.0F, 0.0F, 0.0F, 25, 15, 65, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -2.0F);
        super.turretModel[19].setRotationPoint(-63.0F, -46.0F, -32.5F);
        super.turretModel[20].addShapeBox(0.0F, 0.0F, 0.0F, 14, 15, 53, 0.0F, 0.0F, -3.0F, -2.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -1.0F, -2.0F);
        super.turretModel[20].setRotationPoint(-77.0F, -46.0F, -26.5F);
        super.turretModel[21].addShapeBox(0.0F, 0.0F, 0.0F, 2, 9, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[21].setRotationPoint(-79.0F, -42.0F, 2.5F);
        super.turretModel[22].addShapeBox(0.0F, 0.0F, 0.0F, 1, 9, 15, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[22].setRotationPoint(-80.0F, -42.0F, 2.5F);
        super.turretModel[23].addShapeBox(0.0F, 0.0F, 0.0F, 6, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[23].setRotationPoint(-11.0F, -48.0F, -24.5F);
        super.turretModel[24].addShapeBox(0.0F, 0.0F, 0.0F, 6, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F,
                0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F,
                0.0F);
        super.turretModel[24].setRotationPoint(-5.0F, -48.0F, -24.5F);
        super.turretModel[25].addShapeBox(0.0F, 0.0F, 0.0F, 6, 3, 18, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -6.0F);
        super.turretModel[25].setRotationPoint(-17.0F, -48.0F, -24.5F);
        super.turretModel[26].addShapeBox(0.0F, 0.0F, 0.0F, 7, 3, 19, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -3.0F);
        super.turretModel[26].setRotationPoint(-15.0F, -48.0F, 5.5F);
        super.turretModel[27].addShapeBox(0.0F, 0.0F, 0.0F, 9, 4, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                0.0F);
        super.turretModel[27].setRotationPoint(-8.0F, -48.0F, 5.5F);
        super.turretModel[28].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[28].setRotationPoint(-17.0F, -48.0F, 6.5F);
        super.turretModel[29].addShapeBox(0.0F, 0.0F, 0.0F, 3, 8, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[29].setRotationPoint(-21.0F, -53.0F, 3.0F);
        super.turretModel[30].addShapeBox(0.0F, 0.0F, 0.0F, 3, 8, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                0.0F);
        super.turretModel[30].setRotationPoint(-18.0F, -53.0F, 3.0F);
        super.turretModel[31].addShapeBox(0.0F, 0.0F, 0.0F, 3, 8, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -3.0F);
        super.turretModel[31].setRotationPoint(-24.0F, -53.0F, 3.0F);
        super.turretModel[32].addShapeBox(0.0F, 0.0F, 0.0F, 7, 3, 4, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[32].setRotationPoint(-23.0F, -56.0F, 6.0F);
        super.turretModel[33].addShapeBox(0.0F, 0.0F, 0.0F, 8, 5, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[33].setRotationPoint(1.0F, -48.0F, 9.5F);
        super.turretModel[34].addShapeBox(0.0F, 0.0F, 0.0F, 16, 5, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F,
                -2.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[34].setRotationPoint(9.0F, -48.0F, 10.5F);
        super.turretModel[35].addShapeBox(0.0F, 0.0F, 0.0F, 11, 6, 12, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[35].setRotationPoint(22.0F, -47.0F, 11.5F);
        super.turretModel[36].addShapeBox(0.0F, 0.0F, 0.0F, 6, 4, 1, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F,
                0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[36].setRotationPoint(22.0F, -47.0F, 7.5F);
        super.turretModel[37].addShapeBox(0.0F, 0.0F, 0.0F, 6, 4, 1, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F,
                0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[37].setRotationPoint(22.0F, -47.0F, -8.5F);
        super.turretModel[38].addShapeBox(0.0F, 0.0F, 0.0F, 11, 2, 6, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F,
                1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[38].setRotationPoint(-33.0F, -48.0F, 4.0F);
        super.turretModel[39].addShapeBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[39].setRotationPoint(-35.0F, -47.0F, 0.0F);
        super.turretModel[40].addShapeBox(0.0F, 0.0F, 0.0F, 6, 2, 1, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F,
                0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[40].setRotationPoint(-35.0F, -49.0F, 0.0F);
        super.turretModel[41].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[41].setRotationPoint(-56.0F, -47.0F, 22.0F);
        super.turretModel[42].addTrapezoid(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, -0.5F, 4);
        super.turretModel[42].setRotationPoint(-56.0F, -48.0F, 22.0F);
        super.turretModel[43].addTrapezoid(0.0F, 0.0F, 0.0F, 1, 44, 1, 0.0F, -0.5F, 4);
        super.turretModel[43].setRotationPoint(-55.5F, -92.0F, 22.5F);
        super.turretModel[44].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[44].setRotationPoint(-56.0F, -47.0F, -24.0F);
        super.turretModel[45].addTrapezoid(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, -0.5F, 4);
        super.turretModel[45].setRotationPoint(-56.0F, -48.0F, -24.0F);
        super.turretModel[46].addTrapezoid(0.0F, 0.0F, 0.0F, 1, 44, 1, 0.0F, -0.5F, 4);
        super.turretModel[46].setRotationPoint(-55.5F, -92.0F, -23.5F);
        super.turretModel[47].addShapeBox(0.0F, 0.0F, 0.0F, 21, 7, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -6.2609F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -20.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.turretModel[47].setRotationPoint(47.0F, -35.0F, 6.5F);
        super.turretModel[48].addShapeBox(0.0F, 0.0F, 0.0F, 2, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[48].setRotationPoint(33.0F, -47.0F, 11.5F);
        super.turretModel[49].addShapeBox(0.0F, 0.0F, 0.0F, 2, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[49].setRotationPoint(33.0F, -47.0F, 22.5F);
        super.turretModel[50].addShapeBox(0.0F, 0.0F, 0.0F, 14, 18, 4, 0.0F, 0.0F, 0.0F, -3.99F, 0.0F, -9.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.99F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.turretModel[50].setRotationPoint(-20.0F, -46.0F, -36.5F);
        super.turretModel[51].addShapeBox(0.0F, 0.0F, 0.0F, 30, 18, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F,
                0.0F);
        super.turretModel[51].setRotationPoint(-6.0F, -46.0F, 32.5F);
        super.turretModel[52].addShapeBox(0.0F, 0.0F, 0.0F, 13, 16, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 2.0F, 0.0F,
                -7.0F, -2.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, -6.0F, -2.0F, 0.0F, -6.0F,
                0.0F);
        super.turretModel[52].setRotationPoint(24.0F, -44.0F, 32.5F);
        super.turretModel[53].addShapeBox(0.0F, 0.0F, 0.0F, 15, 8, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 1.0F, -1.0F,
                -7.5F, -4.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, -4.0F, 0.0F, 0.0F,
                0.0F);
        super.turretModel[53].setRotationPoint(37.0F, -43.0F, 30.5F);
        super.turretModel[54].addShapeBox(0.0F, 0.0F, 0.0F, 15, 7, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F,
                0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, -14.0F, -6.0F, 0.0F, 0.0F, -6.0F,
                0.0F);
        super.turretModel[54].setRotationPoint(37.0F, -35.0F, 30.5F);
        super.turretModel[55].addShapeBox(0.0F, 0.0F, 0.0F, 14, 18, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -9.0F, 0.0F, 0.0F, 0.0F, -3.99F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F,
                -3.99F);
        super.turretModel[55].setRotationPoint(-20.0F, -46.0F, 32.5F);
        super.turretModel[56].addShapeBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[56].setRotationPoint(32.5F, -46.0F, 18.5F);
        super.turretModel[57].addShapeBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[57].setRotationPoint(32.5F, -46.0F, 13.5F);
        super.turretModel[58].addShapeBox(0.0F, 0.0F, 0.0F, 16, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[58].setRotationPoint(-48.0F, -42.0F, -34.5F);
        super.turretModel[59].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[59].setRotationPoint(-46.8F, -44.8F, -34.0F);
        super.turretModel[59].rotateAngleZ = -0.34906584F;
        super.turretModel[60].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[60].setRotationPoint(-43.8F, -44.8F, -34.0F);
        super.turretModel[60].rotateAngleZ = -0.34906584F;
        super.turretModel[61].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[61].setRotationPoint(-40.8F, -44.8F, -34.0F);
        super.turretModel[61].rotateAngleZ = -0.34906584F;
        super.turretModel[62].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[62].setRotationPoint(-37.8F, -44.8F, -34.0F);
        super.turretModel[62].rotateAngleZ = -0.34906584F;
        super.turretModel[63].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[63].setRotationPoint(-34.8F, -44.8F, -34.0F);
        super.turretModel[63].rotateAngleZ = -0.34906584F;
        super.turretModel[64].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[64].setRotationPoint(-47.5F, -41.7F, -34.0F);
        super.turretModel[64].rotateAngleZ = -0.34906584F;
        super.turretModel[65].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[65].setRotationPoint(-44.5F, -41.7F, -34.0F);
        super.turretModel[65].rotateAngleZ = -0.34906584F;
        super.turretModel[66].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[66].setRotationPoint(-41.5F, -41.7F, -34.0F);
        super.turretModel[66].rotateAngleZ = -0.34906584F;
        super.turretModel[67].addShapeBox(0.0F, 0.0F, 0.0F, 16, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[67].setRotationPoint(-48.0F, -42.0F, 31.5F);
        super.turretModel[68].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[68].setRotationPoint(-46.8F, -44.8F, 32.0F);
        super.turretModel[68].rotateAngleZ = -0.34906584F;
        super.turretModel[69].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[69].setRotationPoint(-43.8F, -44.8F, 32.0F);
        super.turretModel[69].rotateAngleZ = -0.34906584F;
        super.turretModel[70].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[70].setRotationPoint(-40.8F, -44.8F, 32.0F);
        super.turretModel[70].rotateAngleZ = -0.34906584F;
        super.turretModel[71].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[71].setRotationPoint(-37.8F, -44.8F, 32.0F);
        super.turretModel[71].rotateAngleZ = -0.34906584F;
        super.turretModel[72].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[72].setRotationPoint(-34.8F, -44.8F, 32.0F);
        super.turretModel[72].rotateAngleZ = -0.34906584F;
        super.turretModel[73].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[73].setRotationPoint(-47.5F, -41.7F, 32.0F);
        super.turretModel[73].rotateAngleZ = -0.34906584F;
        super.turretModel[74].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[74].setRotationPoint(-44.5F, -41.7F, 32.0F);
        super.turretModel[74].rotateAngleZ = -0.34906584F;
        super.turretModel[75].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.turretModel[75].setRotationPoint(-41.5F, -41.7F, 32.0F);
        super.turretModel[75].rotateAngleZ = -0.34906584F;
        super.turretModel[76].addShapeBox(0.0F, 0.0F, 0.0F, 13, 13, 65, 0.0F, -3.0F, -3.0F, -0.99F, -3.0F, -3.0F,
                -0.99F, -3.0F, -3.0F, 2.01F, -3.0F, -3.0F, 2.01F, -3.0F, -3.0F, -0.99F, -3.0F, -3.0F, -0.99F, -3.0F,
                -3.0F, 2.01F, -3.0F, -3.0F, 2.01F);
        super.turretModel[76].setRotationPoint(-33.0F, -44.0F, -33.5F);
        super.barrelModel = new ModelRendererTurbo[18];
        super.barrelModel[0] = new ModelRendererTurbo(this, 0, 2804, this.textureX, this.textureY);
        super.barrelModel[1] = new ModelRendererTurbo(this, 0, 2825, this.textureX, this.textureY);
        super.barrelModel[2] = new ModelRendererTurbo(this, 0, 2846, this.textureX, this.textureY);
        super.barrelModel[3] = new ModelRendererTurbo(this, 0, 2866, this.textureX, this.textureY);
        super.barrelModel[4] = new ModelRendererTurbo(this, 0, 2872, this.textureX, this.textureY);
        super.barrelModel[5] = new ModelRendererTurbo(this, 0, 2880, this.textureX, this.textureY);
        super.barrelModel[6] = new ModelRendererTurbo(this, 0, 2892, this.textureX, this.textureY);
        super.barrelModel[7] = new ModelRendererTurbo(this, 0, 2905, this.textureX, this.textureY);
        super.barrelModel[8] = new ModelRendererTurbo(this, 0, 2922, this.textureX, this.textureY);
        super.barrelModel[9] = new ModelRendererTurbo(this, 0, 2934, this.textureX, this.textureY);
        super.barrelModel[10] = new ModelRendererTurbo(this, 0, 2946, this.textureX, this.textureY);
        super.barrelModel[11] = new ModelRendererTurbo(this, 0, 2958, this.textureX, this.textureY);
        super.barrelModel[12] = new ModelRendererTurbo(this, 0, 2968, this.textureX, this.textureY);
        super.barrelModel[13] = new ModelRendererTurbo(this, 0, 2974, this.textureX, this.textureY);
        super.barrelModel[14] = new ModelRendererTurbo(this, 0, 2980, this.textureX, this.textureY);
        super.barrelModel[15] = new ModelRendererTurbo(this, 0, 2984, this.textureX, this.textureY);
        super.barrelModel[16] = new ModelRendererTurbo(this, 0, 2988, this.textureX, this.textureY);
        super.barrelModel[17] = new ModelRendererTurbo(this, 0, 2993, this.textureX, this.textureY);
        super.barrelModel[0].addShapeBox(0.0F, -8.0F, -5.5F, 15, 8, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.barrelModel[0].setRotationPoint(37.0F, -35.0F, 0.0F);
        super.barrelModel[1].addShapeBox(0.0F, -1.0F, -5.5F, 31, 8, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.barrelModel[1].setRotationPoint(37.0F, -35.0F, 0.0F);
        super.barrelModel[2].addShapeBox(15.0F, -7.0F, -5.5F, 16, 7, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F,
                0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.barrelModel[2].setRotationPoint(37.0F, -35.0F, 0.0F);
        super.barrelModel[3].addShapeBox(3.0F, -9.0F, -1.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.barrelModel[3].setRotationPoint(37.0F, -35.0F, 0.0F);
        super.barrelModel[4].addShapeBox(8.0F, -9.5F, -1.5F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.barrelModel[4].setRotationPoint(37.0F, -35.0F, 0.0F);
        super.barrelModel[5].addShapeBox(24.0F, -2.5F, -1.5F, 12, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.barrelModel[5].setRotationPoint(37.0F, -35.0F, 0.0F);
        super.barrelModel[6].addShapeBox(36.0F, -2.5F, -1.5F, 2, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F,
                2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        super.barrelModel[6].setRotationPoint(37.0F, -35.0F, 0.0F);
        super.barrelModel[7].addShapeBox(38.0F, -4.5F, -2.5F, 11, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.barrelModel[7].setRotationPoint(37.0F, -35.0F, 0.0F);
        super.barrelModel[8].addShapeBox(49.0F, -2.5F, -1.5F, 2, 5, 5, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
        super.barrelModel[8].setRotationPoint(37.0F, -35.0F, 0.0F);
        super.barrelModel[9].addShapeBox(51.0F, -2.5F, -1.5F, 2, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.barrelModel[9].setRotationPoint(37.0F, -35.0F, 0.0F);
        super.barrelModel[10].addTrapezoid(51.0F, -2.5F, -1.5F, 1, 5, 5, 0.0F, -0.5F, 2);
        super.barrelModel[10].setRotationPoint(39.0F, -35.0F, 0.0F);
        super.barrelModel[11].addTrapezoid(52.0F, -2.0F, -1.0F, 39, 4, 4, 0.0F, 0.0F, 4);
        super.barrelModel[11].setRotationPoint(39.0F, -35.0F, 0.0F);
        super.barrelModel[12].addShapeBox(91.0F, -1.5F, -0.5F, 7, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.barrelModel[12].setRotationPoint(39.0F, -35.0F, 0.0F);
        super.barrelModel[13].addShapeBox(91.0F, 0.5F, -0.5F, 7, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.barrelModel[13].setRotationPoint(39.0F, -35.0F, 0.0F);
        super.barrelModel[14].addTrapezoid(91.0F, -0.5F, -0.5F, 7, 1, 1, 0.0F, 0.0F, 4);
        super.barrelModel[14].setRotationPoint(39.0F, -35.0F, 0.0F);
        super.barrelModel[15].addTrapezoid(91.0F, -0.5F, 1.5F, 7, 1, 1, 0.0F, 0.0F, 4);
        super.barrelModel[15].setRotationPoint(39.0F, -35.0F, 0.0F);
        super.barrelModel[16].addBox(93.0F, -0.5F, -1.5F, 4, 1, 1, 0.0F);
        super.barrelModel[16].setRotationPoint(39.0F, -35.0F, 0.0F);
        super.barrelModel[17].addShapeBox(24.0F, -2.5F, -3.5F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.barrelModel[17].setRotationPoint(37.0F, -35.0F, 0.0F);
        super.leftTrackWheelModels = new ModelRendererTurbo[115];
        super.leftTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 2998, this.textureX, this.textureY);
        super.leftTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 3015, this.textureX, this.textureY);
        super.leftTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 3030, this.textureX, this.textureY);
        super.leftTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 3044, this.textureX, this.textureY);
        super.leftTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 3058, this.textureX, this.textureY);
        super.leftTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.leftTrackWheelModels[6] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.leftTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 3086, this.textureX, this.textureY);
        super.leftTrackWheelModels[8] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.leftTrackWheelModels[9] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.leftTrackWheelModels[10] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.leftTrackWheelModels[11] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.leftTrackWheelModels[12] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.leftTrackWheelModels[13] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.leftTrackWheelModels[14] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.leftTrackWheelModels[15] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.leftTrackWheelModels[16] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.leftTrackWheelModels[17] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.leftTrackWheelModels[18] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.leftTrackWheelModels[19] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.leftTrackWheelModels[20] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.leftTrackWheelModels[21] = new ModelRendererTurbo(this, 0, 3086, this.textureX, this.textureY);
        super.leftTrackWheelModels[22] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.leftTrackWheelModels[23] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.leftTrackWheelModels[24] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.leftTrackWheelModels[25] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.leftTrackWheelModels[26] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.leftTrackWheelModels[27] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.leftTrackWheelModels[28] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.leftTrackWheelModels[29] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.leftTrackWheelModels[30] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.leftTrackWheelModels[31] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.leftTrackWheelModels[32] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.leftTrackWheelModels[33] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.leftTrackWheelModels[34] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.leftTrackWheelModels[35] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.leftTrackWheelModels[36] = new ModelRendererTurbo(this, 0, 3086, this.textureX, this.textureY);
        super.leftTrackWheelModels[37] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.leftTrackWheelModels[38] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.leftTrackWheelModels[39] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.leftTrackWheelModels[40] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.leftTrackWheelModels[41] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.leftTrackWheelModels[42] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.leftTrackWheelModels[43] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.leftTrackWheelModels[44] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.leftTrackWheelModels[45] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.leftTrackWheelModels[46] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.leftTrackWheelModels[47] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.leftTrackWheelModels[48] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.leftTrackWheelModels[49] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.leftTrackWheelModels[50] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.leftTrackWheelModels[51] = new ModelRendererTurbo(this, 0, 3086, this.textureX, this.textureY);
        super.leftTrackWheelModels[52] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.leftTrackWheelModels[53] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.leftTrackWheelModels[54] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.leftTrackWheelModels[55] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.leftTrackWheelModels[56] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.leftTrackWheelModels[57] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.leftTrackWheelModels[58] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.leftTrackWheelModels[59] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.leftTrackWheelModels[60] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.leftTrackWheelModels[61] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.leftTrackWheelModels[62] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.leftTrackWheelModels[63] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.leftTrackWheelModels[64] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.leftTrackWheelModels[65] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.leftTrackWheelModels[66] = new ModelRendererTurbo(this, 0, 3086, this.textureX, this.textureY);
        super.leftTrackWheelModels[67] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.leftTrackWheelModels[68] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.leftTrackWheelModels[69] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.leftTrackWheelModels[70] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.leftTrackWheelModels[71] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.leftTrackWheelModels[72] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.leftTrackWheelModels[73] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.leftTrackWheelModels[74] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.leftTrackWheelModels[75] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.leftTrackWheelModels[76] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.leftTrackWheelModels[77] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.leftTrackWheelModels[78] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.leftTrackWheelModels[79] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.leftTrackWheelModels[80] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.leftTrackWheelModels[81] = new ModelRendererTurbo(this, 0, 3086, this.textureX, this.textureY);
        super.leftTrackWheelModels[82] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.leftTrackWheelModels[83] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.leftTrackWheelModels[84] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.leftTrackWheelModels[85] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.leftTrackWheelModels[86] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.leftTrackWheelModels[87] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.leftTrackWheelModels[88] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.leftTrackWheelModels[89] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.leftTrackWheelModels[90] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.leftTrackWheelModels[91] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.leftTrackWheelModels[92] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.leftTrackWheelModels[93] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.leftTrackWheelModels[94] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.leftTrackWheelModels[95] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.leftTrackWheelModels[96] = new ModelRendererTurbo(this, 0, 3086, this.textureX, this.textureY);
        super.leftTrackWheelModels[97] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.leftTrackWheelModels[98] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.leftTrackWheelModels[99] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.leftTrackWheelModels[100] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.leftTrackWheelModels[101] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.leftTrackWheelModels[102] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.leftTrackWheelModels[103] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.leftTrackWheelModels[104] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.leftTrackWheelModels[105] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.leftTrackWheelModels[106] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.leftTrackWheelModels[107] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.leftTrackWheelModels[108] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.leftTrackWheelModels[109] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.leftTrackWheelModels[110] = new ModelRendererTurbo(this, 0, 3155, this.textureX, this.textureY);
        super.leftTrackWheelModels[111] = new ModelRendererTurbo(this, 0, 3168, this.textureX, this.textureY);
        super.leftTrackWheelModels[112] = new ModelRendererTurbo(this, 0, 3183, this.textureX, this.textureY);
        super.leftTrackWheelModels[113] = new ModelRendererTurbo(this, 0, 3200, this.textureX, this.textureY);
        super.leftTrackWheelModels[114] = new ModelRendererTurbo(this, 0, 3215, this.textureX, this.textureY);
        super.leftTrackWheelModels[0].addShapeBox(-7.5F, -2.5F, 0.0F, 15, 5, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[0].setRotationPoint(75.5F, -7.5F, -38.5F);
        super.leftTrackWheelModels[1].addShapeBox(-7.5F, 2.5F, 0.0F, 15, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[1].setRotationPoint(75.5F, -7.5F, -38.5F);
        super.leftTrackWheelModels[2].addShapeBox(-5.5F, 5.5F, 0.0F, 11, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[2].setRotationPoint(75.5F, -7.5F, -38.5F);
        super.leftTrackWheelModels[3].addShapeBox(-7.5F, -5.5F, 0.0F, 15, 3, 9, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[3].setRotationPoint(75.5F, -7.5F, -38.5F);
        super.leftTrackWheelModels[4].addShapeBox(-5.5F, -7.5F, 0.0F, 11, 2, 9, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[4].setRotationPoint(75.5F, -7.5F, -38.5F);
        super.leftTrackWheelModels[5].addShapeBox(-5.5F, -7.5F, 0.0F, 11, 2, 3, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[5].setRotationPoint(54.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[6].addShapeBox(-7.5F, -5.5F, 0.0F, 15, 3, 3, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[6].setRotationPoint(54.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[7].addShapeBox(-7.5F, -2.5F, 0.0F, 15, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[7].setRotationPoint(54.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[8].addShapeBox(-5.5F, 5.5F, 0.0F, 11, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[8].setRotationPoint(54.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[9].addShapeBox(-7.5F, 2.5F, 0.0F, 15, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[9].setRotationPoint(54.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[10].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.leftTrackWheelModels[10].setRotationPoint(54.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[11].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[11].setRotationPoint(54.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[12].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.leftTrackWheelModels[12].setRotationPoint(54.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[13].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.leftTrackWheelModels[13].setRotationPoint(54.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[14].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F,
                0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.leftTrackWheelModels[14].setRotationPoint(54.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[15].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F,
                0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.leftTrackWheelModels[15].setRotationPoint(54.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[16].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.leftTrackWheelModels[16].setRotationPoint(54.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[17].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[17].setRotationPoint(54.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[18].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.leftTrackWheelModels[18].setRotationPoint(54.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[19].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.leftTrackWheelModels[19].setRotationPoint(54.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[20].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.leftTrackWheelModels[20].setRotationPoint(33.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[21].addShapeBox(-7.5F, -2.5F, 0.0F, 15, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[21].setRotationPoint(33.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[22].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.leftTrackWheelModels[22].setRotationPoint(33.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[23].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[23].setRotationPoint(33.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[24].addShapeBox(-7.5F, -5.5F, 0.0F, 15, 3, 3, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[24].setRotationPoint(33.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[25].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[25].setRotationPoint(33.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[26].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.leftTrackWheelModels[26].setRotationPoint(33.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[27].addShapeBox(-7.5F, 2.5F, 0.0F, 15, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[27].setRotationPoint(33.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[28].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.leftTrackWheelModels[28].setRotationPoint(33.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[29].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F,
                0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.leftTrackWheelModels[29].setRotationPoint(33.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[30].addShapeBox(-5.5F, 5.5F, 0.0F, 11, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                -3.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[30].setRotationPoint(33.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[31].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F,
                0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.leftTrackWheelModels[31].setRotationPoint(33.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[32].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.leftTrackWheelModels[32].setRotationPoint(33.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[33].addShapeBox(-5.5F, -7.5F, 0.0F, 11, 2, 3, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[33].setRotationPoint(33.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[34].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.leftTrackWheelModels[34].setRotationPoint(33.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[35].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.leftTrackWheelModels[35].setRotationPoint(14.5F, 3.0F, -32.5F);
        super.leftTrackWheelModels[36].addShapeBox(-7.5F, -2.5F, 0.0F, 15, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[36].setRotationPoint(14.5F, 3.0F, -35.5F);
        super.leftTrackWheelModels[37].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.leftTrackWheelModels[37].setRotationPoint(14.5F, 3.0F, -39.5F);
        super.leftTrackWheelModels[38].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[38].setRotationPoint(14.5F, 3.0F, -39.5F);
        super.leftTrackWheelModels[39].addShapeBox(-7.5F, -5.5F, 0.0F, 15, 3, 3, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[39].setRotationPoint(14.5F, 3.0F, -35.5F);
        super.leftTrackWheelModels[40].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[40].setRotationPoint(14.5F, 3.0F, -32.5F);
        super.leftTrackWheelModels[41].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.leftTrackWheelModels[41].setRotationPoint(14.5F, 3.0F, -32.5F);
        super.leftTrackWheelModels[42].addShapeBox(-7.5F, 2.5F, 0.0F, 15, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[42].setRotationPoint(14.5F, 3.0F, -35.5F);
        super.leftTrackWheelModels[43].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.leftTrackWheelModels[43].setRotationPoint(14.5F, 3.0F, -39.5F);
        super.leftTrackWheelModels[44].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F,
                0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.leftTrackWheelModels[44].setRotationPoint(14.5F, 3.0F, -39.5F);
        super.leftTrackWheelModels[45].addShapeBox(-5.5F, 5.5F, 0.0F, 11, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                -3.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[45].setRotationPoint(14.5F, 3.0F, -35.5F);
        super.leftTrackWheelModels[46].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F,
                0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.leftTrackWheelModels[46].setRotationPoint(14.5F, 3.0F, -32.5F);
        super.leftTrackWheelModels[47].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.leftTrackWheelModels[47].setRotationPoint(14.5F, 3.0F, -32.5F);
        super.leftTrackWheelModels[48].addShapeBox(-5.5F, -7.5F, 0.0F, 11, 2, 3, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[48].setRotationPoint(14.5F, 3.0F, -35.5F);
        super.leftTrackWheelModels[49].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.leftTrackWheelModels[49].setRotationPoint(14.5F, 3.0F, -39.5F);
        super.leftTrackWheelModels[50].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.leftTrackWheelModels[50].setRotationPoint(-4.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[51].addShapeBox(-7.5F, -2.5F, 0.0F, 15, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[51].setRotationPoint(-4.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[52].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.leftTrackWheelModels[52].setRotationPoint(-4.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[53].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[53].setRotationPoint(-4.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[54].addShapeBox(-7.5F, -5.5F, 0.0F, 15, 3, 3, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[54].setRotationPoint(-4.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[55].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[55].setRotationPoint(-4.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[56].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.leftTrackWheelModels[56].setRotationPoint(-4.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[57].addShapeBox(-7.5F, 2.5F, 0.0F, 15, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[57].setRotationPoint(-4.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[58].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.leftTrackWheelModels[58].setRotationPoint(-4.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[59].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F,
                0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.leftTrackWheelModels[59].setRotationPoint(-4.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[60].addShapeBox(-5.5F, 5.5F, 0.0F, 11, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                -3.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[60].setRotationPoint(-4.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[61].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F,
                0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.leftTrackWheelModels[61].setRotationPoint(-4.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[62].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.leftTrackWheelModels[62].setRotationPoint(-4.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[63].addShapeBox(-5.5F, -7.5F, 0.0F, 11, 2, 3, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[63].setRotationPoint(-4.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[64].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.leftTrackWheelModels[64].setRotationPoint(-4.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[65].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.leftTrackWheelModels[65].setRotationPoint(-24.5F, 3.0F, -32.5F);
        super.leftTrackWheelModels[66].addShapeBox(-7.5F, -2.5F, 0.0F, 15, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[66].setRotationPoint(-24.5F, 3.0F, -35.5F);
        super.leftTrackWheelModels[67].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.leftTrackWheelModels[67].setRotationPoint(-24.5F, 3.0F, -39.5F);
        super.leftTrackWheelModels[68].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[68].setRotationPoint(-24.5F, 3.0F, -39.5F);
        super.leftTrackWheelModels[69].addShapeBox(-7.5F, -5.5F, 0.0F, 15, 3, 3, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[69].setRotationPoint(-24.5F, 3.0F, -35.5F);
        super.leftTrackWheelModels[70].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[70].setRotationPoint(-24.5F, 3.0F, -32.5F);
        super.leftTrackWheelModels[71].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.leftTrackWheelModels[71].setRotationPoint(-24.5F, 3.0F, -32.5F);
        super.leftTrackWheelModels[72].addShapeBox(-7.5F, 2.5F, 0.0F, 15, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[72].setRotationPoint(-24.5F, 3.0F, -35.5F);
        super.leftTrackWheelModels[73].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.leftTrackWheelModels[73].setRotationPoint(-24.5F, 3.0F, -39.5F);
        super.leftTrackWheelModels[74].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F,
                0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.leftTrackWheelModels[74].setRotationPoint(-24.5F, 3.0F, -39.5F);
        super.leftTrackWheelModels[75].addShapeBox(-5.5F, 5.5F, 0.0F, 11, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                -3.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[75].setRotationPoint(-24.5F, 3.0F, -35.5F);
        super.leftTrackWheelModels[76].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F,
                0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.leftTrackWheelModels[76].setRotationPoint(-24.5F, 3.0F, -32.5F);
        super.leftTrackWheelModels[77].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.leftTrackWheelModels[77].setRotationPoint(-24.5F, 3.0F, -32.5F);
        super.leftTrackWheelModels[78].addShapeBox(-5.5F, -7.5F, 0.0F, 11, 2, 3, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[78].setRotationPoint(-24.5F, 3.0F, -35.5F);
        super.leftTrackWheelModels[79].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.leftTrackWheelModels[79].setRotationPoint(-24.5F, 3.0F, -39.5F);
        super.leftTrackWheelModels[80].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.leftTrackWheelModels[80].setRotationPoint(-45.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[81].addShapeBox(-7.5F, -2.5F, 0.0F, 15, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[81].setRotationPoint(-45.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[82].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.leftTrackWheelModels[82].setRotationPoint(-45.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[83].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[83].setRotationPoint(-45.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[84].addShapeBox(-7.5F, -5.5F, 0.0F, 15, 3, 3, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[84].setRotationPoint(-45.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[85].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[85].setRotationPoint(-45.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[86].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.leftTrackWheelModels[86].setRotationPoint(-45.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[87].addShapeBox(-7.5F, 2.5F, 0.0F, 15, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[87].setRotationPoint(-45.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[88].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.leftTrackWheelModels[88].setRotationPoint(-45.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[89].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F,
                0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.leftTrackWheelModels[89].setRotationPoint(-45.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[90].addShapeBox(-5.5F, 5.5F, 0.0F, 11, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                -3.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[90].setRotationPoint(-45.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[91].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F,
                0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.leftTrackWheelModels[91].setRotationPoint(-45.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[92].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.leftTrackWheelModels[92].setRotationPoint(-45.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[93].addShapeBox(-5.5F, -7.5F, 0.0F, 11, 2, 3, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[93].setRotationPoint(-45.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[94].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.leftTrackWheelModels[94].setRotationPoint(-45.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[95].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.leftTrackWheelModels[95].setRotationPoint(-66.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[96].addShapeBox(-7.5F, -2.5F, 0.0F, 15, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[96].setRotationPoint(-66.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[97].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.leftTrackWheelModels[97].setRotationPoint(-66.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[98].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[98].setRotationPoint(-66.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[99].addShapeBox(-7.5F, -5.5F, 0.0F, 15, 3, 3, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[99].setRotationPoint(-66.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[100].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[100].setRotationPoint(-66.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[101].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.leftTrackWheelModels[101].setRotationPoint(-66.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[102].addShapeBox(-7.5F, 2.5F, 0.0F, 15, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[102].setRotationPoint(-66.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[103].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.leftTrackWheelModels[103].setRotationPoint(-66.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[104].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F,
                0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.leftTrackWheelModels[104].setRotationPoint(-66.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[105].addShapeBox(-5.5F, 5.5F, 0.0F, 11, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                -3.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[105].setRotationPoint(-66.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[106].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F,
                0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.leftTrackWheelModels[106].setRotationPoint(-66.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[107].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.leftTrackWheelModels[107].setRotationPoint(-66.0F, 3.0F, -32.5F);
        super.leftTrackWheelModels[108].addShapeBox(-5.5F, -7.5F, 0.0F, 11, 2, 3, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[108].setRotationPoint(-66.0F, 3.0F, -35.5F);
        super.leftTrackWheelModels[109].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.leftTrackWheelModels[109].setRotationPoint(-66.0F, 3.0F, -39.5F);
        super.leftTrackWheelModels[110].addShapeBox(-5.5F, 5.5F, 0.0F, 11, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                -3.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[110].setRotationPoint(-81.5F, -7.5F, -38.5F);
        super.leftTrackWheelModels[111].addShapeBox(-7.5F, 2.5F, 0.0F, 15, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F);
        super.leftTrackWheelModels[111].setRotationPoint(-81.5F, -7.5F, -38.5F);
        super.leftTrackWheelModels[112].addShapeBox(-7.5F, -2.5F, 0.0F, 15, 5, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[112].setRotationPoint(-81.5F, -7.5F, -38.5F);
        super.leftTrackWheelModels[113].addShapeBox(-5.5F, -7.5F, 0.0F, 11, 2, 9, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[113].setRotationPoint(-81.5F, -7.5F, -38.5F);
        super.leftTrackWheelModels[114].addShapeBox(-7.5F, -5.5F, 0.0F, 15, 3, 9, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftTrackWheelModels[114].setRotationPoint(-81.5F, -7.5F, -38.5F);
        super.rightTrackWheelModels = new ModelRendererTurbo[115];
        super.rightTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 2998, this.textureX, this.textureY);
        super.rightTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 3015, this.textureX, this.textureY);
        super.rightTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 3030, this.textureX, this.textureY);
        super.rightTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 3044, this.textureX, this.textureY);
        super.rightTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 3058, this.textureX, this.textureY);
        super.rightTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.rightTrackWheelModels[6] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.rightTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.rightTrackWheelModels[8] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.rightTrackWheelModels[9] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.rightTrackWheelModels[10] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.rightTrackWheelModels[11] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.rightTrackWheelModels[12] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.rightTrackWheelModels[13] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.rightTrackWheelModels[14] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.rightTrackWheelModels[15] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.rightTrackWheelModels[16] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.rightTrackWheelModels[17] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.rightTrackWheelModels[18] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.rightTrackWheelModels[19] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.rightTrackWheelModels[20] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.rightTrackWheelModels[21] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.rightTrackWheelModels[22] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.rightTrackWheelModels[23] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.rightTrackWheelModels[24] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.rightTrackWheelModels[25] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.rightTrackWheelModels[26] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.rightTrackWheelModels[27] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.rightTrackWheelModels[28] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.rightTrackWheelModels[29] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.rightTrackWheelModels[30] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.rightTrackWheelModels[31] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.rightTrackWheelModels[32] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.rightTrackWheelModels[33] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.rightTrackWheelModels[34] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.rightTrackWheelModels[35] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.rightTrackWheelModels[36] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.rightTrackWheelModels[37] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.rightTrackWheelModels[38] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.rightTrackWheelModels[39] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.rightTrackWheelModels[40] = new ModelRendererTurbo(this, 0, 3155, this.textureX, this.textureY);
        super.rightTrackWheelModels[41] = new ModelRendererTurbo(this, 0, 3168, this.textureX, this.textureY);
        super.rightTrackWheelModels[42] = new ModelRendererTurbo(this, 0, 3183, this.textureX, this.textureY);
        super.rightTrackWheelModels[43] = new ModelRendererTurbo(this, 0, 3200, this.textureX, this.textureY);
        super.rightTrackWheelModels[44] = new ModelRendererTurbo(this, 0, 3215, this.textureX, this.textureY);
        super.rightTrackWheelModels[45] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.rightTrackWheelModels[46] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.rightTrackWheelModels[47] = new ModelRendererTurbo(this, 0, 3086, this.textureX, this.textureY);
        super.rightTrackWheelModels[48] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.rightTrackWheelModels[49] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.rightTrackWheelModels[50] = new ModelRendererTurbo(this, 0, 3086, this.textureX, this.textureY);
        super.rightTrackWheelModels[51] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.rightTrackWheelModels[52] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.rightTrackWheelModels[53] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.rightTrackWheelModels[54] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.rightTrackWheelModels[55] = new ModelRendererTurbo(this, 0, 3086, this.textureX, this.textureY);
        super.rightTrackWheelModels[56] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.rightTrackWheelModels[57] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.rightTrackWheelModels[58] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.rightTrackWheelModels[59] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.rightTrackWheelModels[60] = new ModelRendererTurbo(this, 0, 3086, this.textureX, this.textureY);
        super.rightTrackWheelModels[61] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.rightTrackWheelModels[62] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.rightTrackWheelModels[63] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.rightTrackWheelModels[64] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.rightTrackWheelModels[65] = new ModelRendererTurbo(this, 0, 3086, this.textureX, this.textureY);
        super.rightTrackWheelModels[66] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.rightTrackWheelModels[67] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.rightTrackWheelModels[68] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.rightTrackWheelModels[69] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.rightTrackWheelModels[70] = new ModelRendererTurbo(this, 0, 3086, this.textureX, this.textureY);
        super.rightTrackWheelModels[71] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.rightTrackWheelModels[72] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.rightTrackWheelModels[73] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.rightTrackWheelModels[74] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.rightTrackWheelModels[75] = new ModelRendererTurbo(this, 0, 3086, this.textureX, this.textureY);
        super.rightTrackWheelModels[76] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.rightTrackWheelModels[77] = new ModelRendererTurbo(this, 0, 3080, this.textureX, this.textureY);
        super.rightTrackWheelModels[78] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.rightTrackWheelModels[79] = new ModelRendererTurbo(this, 0, 3072, this.textureX, this.textureY);
        super.rightTrackWheelModels[80] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.rightTrackWheelModels[81] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.rightTrackWheelModels[82] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.rightTrackWheelModels[83] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.rightTrackWheelModels[84] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.rightTrackWheelModels[85] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.rightTrackWheelModels[86] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.rightTrackWheelModels[87] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.rightTrackWheelModels[88] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.rightTrackWheelModels[89] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.rightTrackWheelModels[90] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.rightTrackWheelModels[91] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.rightTrackWheelModels[92] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.rightTrackWheelModels[93] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.rightTrackWheelModels[94] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.rightTrackWheelModels[95] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.rightTrackWheelModels[96] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.rightTrackWheelModels[97] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.rightTrackWheelModels[98] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.rightTrackWheelModels[99] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.rightTrackWheelModels[100] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.rightTrackWheelModels[101] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.rightTrackWheelModels[102] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.rightTrackWheelModels[103] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.rightTrackWheelModels[104] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.rightTrackWheelModels[105] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.rightTrackWheelModels[106] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.rightTrackWheelModels[107] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.rightTrackWheelModels[108] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.rightTrackWheelModels[109] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.rightTrackWheelModels[110] = new ModelRendererTurbo(this, 0, 3100, this.textureX, this.textureY);
        super.rightTrackWheelModels[111] = new ModelRendererTurbo(this, 0, 3115, this.textureX, this.textureY);
        super.rightTrackWheelModels[112] = new ModelRendererTurbo(this, 0, 3135, this.textureX, this.textureY);
        super.rightTrackWheelModels[113] = new ModelRendererTurbo(this, 0, 3145, this.textureX, this.textureY);
        super.rightTrackWheelModels[114] = new ModelRendererTurbo(this, 0, 3125, this.textureX, this.textureY);
        super.rightTrackWheelModels[0].addShapeBox(-7.5F, -2.5F, 0.0F, 15, 5, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[0].setRotationPoint(75.5F, -7.5F, 29.5F);
        super.rightTrackWheelModels[1].addShapeBox(-7.5F, 2.5F, 0.0F, 15, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[1].setRotationPoint(75.5F, -7.5F, 29.5F);
        super.rightTrackWheelModels[2].addShapeBox(-5.5F, 5.5F, 0.0F, 11, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                -3.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[2].setRotationPoint(75.5F, -7.5F, 29.5F);
        super.rightTrackWheelModels[3].addShapeBox(-7.5F, -5.5F, 0.0F, 15, 3, 9, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[3].setRotationPoint(75.5F, -7.5F, 29.5F);
        super.rightTrackWheelModels[4].addShapeBox(-5.5F, -7.5F, 0.0F, 11, 2, 9, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[4].setRotationPoint(75.5F, -7.5F, 29.5F);
        super.rightTrackWheelModels[5].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F,
                0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.rightTrackWheelModels[5].setRotationPoint(54.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[6].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.rightTrackWheelModels[6].setRotationPoint(54.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[7].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[7].setRotationPoint(54.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[8].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.rightTrackWheelModels[8].setRotationPoint(54.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[9].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.rightTrackWheelModels[9].setRotationPoint(54.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[10].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.rightTrackWheelModels[10].setRotationPoint(33.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[11].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[11].setRotationPoint(33.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[12].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.rightTrackWheelModels[12].setRotationPoint(33.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[13].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F,
                0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.rightTrackWheelModels[13].setRotationPoint(33.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[14].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.rightTrackWheelModels[14].setRotationPoint(33.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[15].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.rightTrackWheelModels[15].setRotationPoint(14.5F, 3.0F, 28.5F);
        super.rightTrackWheelModels[16].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[16].setRotationPoint(14.5F, 3.0F, 28.5F);
        super.rightTrackWheelModels[17].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.rightTrackWheelModels[17].setRotationPoint(14.5F, 3.0F, 28.5F);
        super.rightTrackWheelModels[18].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F,
                0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.rightTrackWheelModels[18].setRotationPoint(14.5F, 3.0F, 28.5F);
        super.rightTrackWheelModels[19].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.rightTrackWheelModels[19].setRotationPoint(14.5F, 3.0F, 28.5F);
        super.rightTrackWheelModels[20].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.rightTrackWheelModels[20].setRotationPoint(-4.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[21].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[21].setRotationPoint(-4.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[22].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.rightTrackWheelModels[22].setRotationPoint(-4.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[23].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F,
                0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.rightTrackWheelModels[23].setRotationPoint(-4.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[24].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.rightTrackWheelModels[24].setRotationPoint(-4.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[25].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.rightTrackWheelModels[25].setRotationPoint(-24.5F, 3.0F, 28.5F);
        super.rightTrackWheelModels[26].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[26].setRotationPoint(-24.5F, 3.0F, 28.5F);
        super.rightTrackWheelModels[27].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.rightTrackWheelModels[27].setRotationPoint(-24.5F, 3.0F, 28.5F);
        super.rightTrackWheelModels[28].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F,
                0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.rightTrackWheelModels[28].setRotationPoint(-24.5F, 3.0F, 28.5F);
        super.rightTrackWheelModels[29].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.rightTrackWheelModels[29].setRotationPoint(-24.5F, 3.0F, 28.5F);
        super.rightTrackWheelModels[30].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.rightTrackWheelModels[30].setRotationPoint(-45.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[31].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[31].setRotationPoint(-45.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[32].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.rightTrackWheelModels[32].setRotationPoint(-45.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[33].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F,
                0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.rightTrackWheelModels[33].setRotationPoint(-45.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[34].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.rightTrackWheelModels[34].setRotationPoint(-45.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[35].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.rightTrackWheelModels[35].setRotationPoint(-66.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[36].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[36].setRotationPoint(-66.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[37].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.rightTrackWheelModels[37].setRotationPoint(-66.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[38].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F,
                0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.rightTrackWheelModels[38].setRotationPoint(-66.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[39].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.rightTrackWheelModels[39].setRotationPoint(-66.0F, 3.0F, 28.5F);
        super.rightTrackWheelModels[40].addShapeBox(-5.5F, 5.5F, 0.0F, 11, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                -3.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[40].setRotationPoint(-81.5F, -7.5F, 29.5F);
        super.rightTrackWheelModels[41].addShapeBox(-7.5F, 2.5F, 0.0F, 15, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[41].setRotationPoint(-81.5F, -7.5F, 29.5F);
        super.rightTrackWheelModels[42].addShapeBox(-7.5F, -2.5F, 0.0F, 15, 5, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[42].setRotationPoint(-81.5F, -7.5F, 29.5F);
        super.rightTrackWheelModels[43].addShapeBox(-5.5F, -7.5F, 0.0F, 11, 2, 9, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[43].setRotationPoint(-81.5F, -7.5F, 29.5F);
        super.rightTrackWheelModels[44].addShapeBox(-7.5F, -5.5F, 0.0F, 15, 3, 9, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[44].setRotationPoint(-81.5F, -7.5F, 29.5F);
        super.rightTrackWheelModels[45].addShapeBox(-5.5F, -7.5F, 0.0F, 11, 2, 3, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[45].setRotationPoint(54.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[46].addShapeBox(-7.5F, -5.5F, 0.0F, 15, 3, 3, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[46].setRotationPoint(54.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[47].addShapeBox(-7.5F, -2.5F, 0.0F, 15, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[47].setRotationPoint(54.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[48].addShapeBox(-5.5F, 5.5F, 0.0F, 11, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                -3.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[48].setRotationPoint(54.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[49].addShapeBox(-7.5F, 2.5F, 0.0F, 15, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[49].setRotationPoint(54.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[50].addShapeBox(-7.5F, -2.5F, 0.0F, 15, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[50].setRotationPoint(33.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[51].addShapeBox(-7.5F, -5.5F, 0.0F, 15, 3, 3, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[51].setRotationPoint(33.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[52].addShapeBox(-7.5F, 2.5F, 0.0F, 15, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[52].setRotationPoint(33.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[53].addShapeBox(-5.5F, 5.5F, 0.0F, 11, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                -3.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[53].setRotationPoint(33.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[54].addShapeBox(-5.5F, -7.5F, 0.0F, 11, 2, 3, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[54].setRotationPoint(33.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[55].addShapeBox(-7.5F, -2.5F, 0.0F, 15, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[55].setRotationPoint(14.5F, 3.0F, 32.5F);
        super.rightTrackWheelModels[56].addShapeBox(-7.5F, -5.5F, 0.0F, 15, 3, 3, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[56].setRotationPoint(14.5F, 3.0F, 32.5F);
        super.rightTrackWheelModels[57].addShapeBox(-7.5F, 2.5F, 0.0F, 15, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[57].setRotationPoint(14.5F, 3.0F, 32.5F);
        super.rightTrackWheelModels[58].addShapeBox(-5.5F, 5.5F, 0.0F, 11, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                -3.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[58].setRotationPoint(14.5F, 3.0F, 32.5F);
        super.rightTrackWheelModels[59].addShapeBox(-5.5F, -7.5F, 0.0F, 11, 2, 3, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[59].setRotationPoint(14.5F, 3.0F, 32.5F);
        super.rightTrackWheelModels[60].addShapeBox(-7.5F, -2.5F, 0.0F, 15, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[60].setRotationPoint(-4.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[61].addShapeBox(-7.5F, -5.5F, 0.0F, 15, 3, 3, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[61].setRotationPoint(-4.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[62].addShapeBox(-7.5F, 2.5F, 0.0F, 15, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[62].setRotationPoint(-4.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[63].addShapeBox(-5.5F, 5.5F, 0.0F, 11, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                -3.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[63].setRotationPoint(-4.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[64].addShapeBox(-5.5F, -7.5F, 0.0F, 11, 2, 3, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[64].setRotationPoint(-4.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[65].addShapeBox(-7.5F, -2.5F, 0.0F, 15, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[65].setRotationPoint(-24.5F, 3.0F, 32.5F);
        super.rightTrackWheelModels[66].addShapeBox(-7.5F, -5.5F, 0.0F, 15, 3, 3, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[66].setRotationPoint(-24.5F, 3.0F, 32.5F);
        super.rightTrackWheelModels[67].addShapeBox(-7.5F, 2.5F, 0.0F, 15, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[67].setRotationPoint(-24.5F, 3.0F, 32.5F);
        super.rightTrackWheelModels[68].addShapeBox(-5.5F, 5.5F, 0.0F, 11, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                -3.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[68].setRotationPoint(-24.5F, 3.0F, 32.5F);
        super.rightTrackWheelModels[69].addShapeBox(-5.5F, -7.5F, 0.0F, 11, 2, 3, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[69].setRotationPoint(-24.5F, 3.0F, 32.5F);
        super.rightTrackWheelModels[70].addShapeBox(-7.5F, -2.5F, 0.0F, 15, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[70].setRotationPoint(-45.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[71].addShapeBox(-7.5F, -5.5F, 0.0F, 15, 3, 3, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[71].setRotationPoint(-45.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[72].addShapeBox(-7.5F, 2.5F, 0.0F, 15, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[72].setRotationPoint(-45.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[73].addShapeBox(-5.5F, 5.5F, 0.0F, 11, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                -3.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[73].setRotationPoint(-45.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[74].addShapeBox(-5.5F, -7.5F, 0.0F, 11, 2, 3, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[74].setRotationPoint(-45.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[75].addShapeBox(-7.5F, -2.5F, 0.0F, 15, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[75].setRotationPoint(-66.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[76].addShapeBox(-7.5F, -5.5F, 0.0F, 15, 3, 3, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[76].setRotationPoint(-66.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[77].addShapeBox(-7.5F, 2.5F, 0.0F, 15, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[77].setRotationPoint(-66.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[78].addShapeBox(-5.5F, 5.5F, 0.0F, 11, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F,
                -3.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[78].setRotationPoint(-66.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[79].addShapeBox(-5.5F, -7.5F, 0.0F, 11, 2, 3, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F,
                0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightTrackWheelModels[79].setRotationPoint(-66.0F, 3.0F, 32.5F);
        super.rightTrackWheelModels[80].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.rightTrackWheelModels[80].setRotationPoint(54.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[81].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[81].setRotationPoint(54.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[82].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.rightTrackWheelModels[82].setRotationPoint(54.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[83].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.rightTrackWheelModels[83].setRotationPoint(54.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[84].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F,
                0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.rightTrackWheelModels[84].setRotationPoint(54.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[85].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.rightTrackWheelModels[85].setRotationPoint(33.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[86].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[86].setRotationPoint(33.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[87].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.rightTrackWheelModels[87].setRotationPoint(33.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[88].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F,
                0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.rightTrackWheelModels[88].setRotationPoint(33.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[89].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.rightTrackWheelModels[89].setRotationPoint(33.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[90].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.rightTrackWheelModels[90].setRotationPoint(14.5F, 3.0F, 35.5F);
        super.rightTrackWheelModels[91].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[91].setRotationPoint(14.5F, 3.0F, 35.5F);
        super.rightTrackWheelModels[92].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.rightTrackWheelModels[92].setRotationPoint(14.5F, 3.0F, 35.5F);
        super.rightTrackWheelModels[93].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F,
                0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.rightTrackWheelModels[93].setRotationPoint(14.5F, 3.0F, 35.5F);
        super.rightTrackWheelModels[94].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.rightTrackWheelModels[94].setRotationPoint(14.5F, 3.0F, 35.5F);
        super.rightTrackWheelModels[95].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.rightTrackWheelModels[95].setRotationPoint(-4.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[96].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[96].setRotationPoint(-4.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[97].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.rightTrackWheelModels[97].setRotationPoint(-4.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[98].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F,
                0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.rightTrackWheelModels[98].setRotationPoint(-4.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[99].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.rightTrackWheelModels[99].setRotationPoint(-4.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[100].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.rightTrackWheelModels[100].setRotationPoint(-24.5F, 3.0F, 35.5F);
        super.rightTrackWheelModels[101].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[101].setRotationPoint(-24.5F, 3.0F, 35.5F);
        super.rightTrackWheelModels[102].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.rightTrackWheelModels[102].setRotationPoint(-24.5F, 3.0F, 35.5F);
        super.rightTrackWheelModels[103].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F,
                0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.rightTrackWheelModels[103].setRotationPoint(-24.5F, 3.0F, 35.5F);
        super.rightTrackWheelModels[104].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.rightTrackWheelModels[104].setRotationPoint(-24.5F, 3.0F, 35.5F);
        super.rightTrackWheelModels[105].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.rightTrackWheelModels[105].setRotationPoint(-45.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[106].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[106].setRotationPoint(-45.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[107].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.rightTrackWheelModels[107].setRotationPoint(-45.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[108].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F,
                0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.rightTrackWheelModels[108].setRotationPoint(-45.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[109].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.rightTrackWheelModels[109].setRotationPoint(-45.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[110].addShapeBox(-8.0F, -2.5F, 0.0F, 16, 5, 4, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F,
                0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F,
                0.0F, 0.15F, 0.0F);
        super.rightTrackWheelModels[110].setRotationPoint(-66.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[111].addShapeBox(-8.0F, -5.65F, 0.0F, 16, 3, 4, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F,
                0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F);
        super.rightTrackWheelModels[111].setRotationPoint(-66.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[112].addShapeBox(-8.0F, 2.65F, 0.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F, -1.77F, 0.5F, 0.0F,
                -1.77F, 0.5F, 0.0F);
        super.rightTrackWheelModels[112].setRotationPoint(-66.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[113].addShapeBox(-8.0F, 6.15F, 0.0F, 16, 2, 4, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F,
                0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F);
        super.rightTrackWheelModels[113].setRotationPoint(-66.0F, 3.0F, 35.5F);
        super.rightTrackWheelModels[114].addShapeBox(-8.0F, -8.15F, 0.0F, 16, 2, 4, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F,
                -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -5.33F, -0.22F, 0.0F, -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F,
                -1.77F, 0.0F, 0.0F, -1.77F, 0.0F, 0.0F);
        super.rightTrackWheelModels[114].setRotationPoint(-66.0F, 3.0F, 35.5F);
        super.leftAnimTrackModel1 = new ModelRendererTurbo[9];
        super.leftAnimTrackModel1[0] = new ModelRendererTurbo(this, 0, 3230, this.textureX, this.textureY);
        super.leftAnimTrackModel1[1] = new ModelRendererTurbo(this, 0, 3250, this.textureX, this.textureY);
        super.leftAnimTrackModel1[2] = new ModelRendererTurbo(this, 0, 3270, this.textureX, this.textureY);
        super.leftAnimTrackModel1[3] = new ModelRendererTurbo(this, 0, 3290, this.textureX, this.textureY);
        super.leftAnimTrackModel1[4] = new ModelRendererTurbo(this, 0, 3310, this.textureX, this.textureY);
        super.leftAnimTrackModel1[5] = new ModelRendererTurbo(this, 0, 3330, this.textureX, this.textureY);
        super.leftAnimTrackModel1[6] = new ModelRendererTurbo(this, 0, 3352, this.textureX, this.textureY);
        super.leftAnimTrackModel1[7] = new ModelRendererTurbo(this, 0, 3370, this.textureX, this.textureY);
        super.leftAnimTrackModel1[8] = new ModelRendererTurbo(this, 0, 3390, this.textureX, this.textureY);
        super.leftAnimTrackModel1[0].addShapeBox(0.0F, 0.0F, 0.0F, 7, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel1[0].setRotationPoint(79.5F, -15.5F, -41.5F);
        super.leftAnimTrackModel1[0].rotateAngleZ = -0.6981317F;
        super.leftAnimTrackModel1[1].addShapeBox(0.0F, 0.0F, 0.0F, 6, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel1[1].setRotationPoint(84.9F, -11.0F, -41.5F);
        super.leftAnimTrackModel1[1].rotateAngleZ = -1.5707964F;
        super.leftAnimTrackModel1[2].addShapeBox(0.0F, 0.0F, 0.0F, 6, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel1[2].setRotationPoint(84.9F, -5.0F, -41.5F);
        super.leftAnimTrackModel1[2].rotateAngleZ = -2.1293018F;
        super.leftAnimTrackModel1[3].addShapeBox(0.0F, 0.0F, 0.0F, 27, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel1[3].setRotationPoint(81.8F, 0.1F, -41.5F);
        super.leftAnimTrackModel1[3].rotateAngleZ = -2.6441739F;
        super.leftAnimTrackModel1[4].addShapeBox(0.0F, 0.0F, 0.0F, 129, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel1[4].setRotationPoint(58.1F, 13.0F, -41.5F);
        super.leftAnimTrackModel1[4].rotateAngleZ = -3.1415927F;
        super.leftAnimTrackModel1[5].addShapeBox(0.0F, 0.0F, 0.0F, 24, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel1[5].setRotationPoint(-70.9F, 13.0F, -41.5F);
        super.leftAnimTrackModel1[5].rotateAngleZ = -3.8048177F;
        super.leftAnimTrackModel1[6].addShapeBox(0.0F, 0.0F, 0.0F, 9, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel1[6].setRotationPoint(-89.8F, -1.7F, -41.5F);
        super.leftAnimTrackModel1[6].rotateAngleZ = -4.712389F;
        super.leftAnimTrackModel1[7].addShapeBox(0.0F, 0.0F, 0.0F, 7, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel1[7].setRotationPoint(-89.8F, -10.7F, -41.5F);
        super.leftAnimTrackModel1[7].rotateAngleZ = -5.305801F;
        super.leftAnimTrackModel1[8].addShapeBox(0.0F, 0.0F, 0.0F, 163, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel1[8].setRotationPoint(-85.8F, -16.7F, -41.5F);
        super.rightAnimTrackModel1 = new ModelRendererTurbo[9];
        super.rightAnimTrackModel1[0] = new ModelRendererTurbo(this, 0, 3230, this.textureX, this.textureY);
        super.rightAnimTrackModel1[1] = new ModelRendererTurbo(this, 0, 3250, this.textureX, this.textureY);
        super.rightAnimTrackModel1[2] = new ModelRendererTurbo(this, 0, 3270, this.textureX, this.textureY);
        super.rightAnimTrackModel1[3] = new ModelRendererTurbo(this, 0, 3290, this.textureX, this.textureY);
        super.rightAnimTrackModel1[4] = new ModelRendererTurbo(this, 0, 3310, this.textureX, this.textureY);
        super.rightAnimTrackModel1[5] = new ModelRendererTurbo(this, 0, 3330, this.textureX, this.textureY);
        super.rightAnimTrackModel1[6] = new ModelRendererTurbo(this, 0, 3352, this.textureX, this.textureY);
        super.rightAnimTrackModel1[7] = new ModelRendererTurbo(this, 0, 3370, this.textureX, this.textureY);
        super.rightAnimTrackModel1[8] = new ModelRendererTurbo(this, 0, 3390, this.textureX, this.textureY);
        super.rightAnimTrackModel1[0].addShapeBox(0.0F, 0.0F, 0.0F, 7, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightAnimTrackModel1[0].setRotationPoint(79.5F, -15.5F, 26.5F);
        super.rightAnimTrackModel1[0].rotateAngleZ = -0.6981317F;
        super.rightAnimTrackModel1[1].addShapeBox(0.0F, 0.0F, 0.0F, 6, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightAnimTrackModel1[1].setRotationPoint(84.9F, -11.0F, 26.5F);
        super.rightAnimTrackModel1[1].rotateAngleZ = -1.5707964F;
        super.rightAnimTrackModel1[2].addShapeBox(0.0F, 0.0F, 0.0F, 6, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightAnimTrackModel1[2].setRotationPoint(84.9F, -5.0F, 26.5F);
        super.rightAnimTrackModel1[2].rotateAngleZ = -2.1293018F;
        super.rightAnimTrackModel1[3].addShapeBox(0.0F, 0.0F, 0.0F, 27, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightAnimTrackModel1[3].setRotationPoint(81.8F, 0.1F, 26.5F);
        super.rightAnimTrackModel1[3].rotateAngleZ = -2.6441739F;
        super.rightAnimTrackModel1[4].addShapeBox(0.0F, 0.0F, 0.0F, 129, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightAnimTrackModel1[4].setRotationPoint(58.1F, 13.0F, 26.5F);
        super.rightAnimTrackModel1[4].rotateAngleZ = -3.1415927F;
        super.rightAnimTrackModel1[5].addShapeBox(0.0F, 0.0F, 0.0F, 24, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightAnimTrackModel1[5].setRotationPoint(-70.9F, 13.0F, 26.5F);
        super.rightAnimTrackModel1[5].rotateAngleZ = -3.8048177F;
        super.rightAnimTrackModel1[6].addShapeBox(0.0F, 0.0F, 0.0F, 9, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightAnimTrackModel1[6].setRotationPoint(-89.8F, -1.7F, 26.5F);
        super.rightAnimTrackModel1[6].rotateAngleZ = -4.712389F;
        super.rightAnimTrackModel1[7].addShapeBox(0.0F, 0.0F, 0.0F, 7, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightAnimTrackModel1[7].setRotationPoint(-89.8F, -10.7F, 26.5F);
        super.rightAnimTrackModel1[7].rotateAngleZ = -5.305801F;
        super.rightAnimTrackModel1[8].addShapeBox(0.0F, 0.0F, 0.0F, 163, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightAnimTrackModel1[8].setRotationPoint(-85.8F, -16.7F, 26.5F);
        super.leftAnimTrackModel2 = new ModelRendererTurbo[9];
        super.leftAnimTrackModel2[0] = new ModelRendererTurbo(this, 420, 3230, this.textureX, this.textureY);
        super.leftAnimTrackModel2[1] = new ModelRendererTurbo(this, 420, 3250, this.textureX, this.textureY);
        super.leftAnimTrackModel2[2] = new ModelRendererTurbo(this, 420, 3270, this.textureX, this.textureY);
        super.leftAnimTrackModel2[3] = new ModelRendererTurbo(this, 420, 3290, this.textureX, this.textureY);
        super.leftAnimTrackModel2[4] = new ModelRendererTurbo(this, 420, 3310, this.textureX, this.textureY);
        super.leftAnimTrackModel2[5] = new ModelRendererTurbo(this, 420, 3330, this.textureX, this.textureY);
        super.leftAnimTrackModel2[6] = new ModelRendererTurbo(this, 420, 3352, this.textureX, this.textureY);
        super.leftAnimTrackModel2[7] = new ModelRendererTurbo(this, 420, 3370, this.textureX, this.textureY);
        super.leftAnimTrackModel2[8] = new ModelRendererTurbo(this, 420, 3390, this.textureX, this.textureY);
        super.leftAnimTrackModel2[0].addShapeBox(0.0F, 0.0F, 0.0F, 7, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel2[0].setRotationPoint(79.5F, -15.5F, -41.5F);
        super.leftAnimTrackModel2[0].rotateAngleZ = -0.6981317F;
        super.leftAnimTrackModel2[1].addShapeBox(0.0F, 0.0F, 0.0F, 6, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel2[1].setRotationPoint(84.9F, -11.0F, -41.5F);
        super.leftAnimTrackModel2[1].rotateAngleZ = -1.5707964F;
        super.leftAnimTrackModel2[2].addShapeBox(0.0F, 0.0F, 0.0F, 6, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel2[2].setRotationPoint(84.9F, -5.0F, -41.5F);
        super.leftAnimTrackModel2[2].rotateAngleZ = -2.1293018F;
        super.leftAnimTrackModel2[3].addShapeBox(0.0F, 0.0F, 0.0F, 27, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel2[3].setRotationPoint(81.8F, 0.1F, -41.5F);
        super.leftAnimTrackModel2[3].rotateAngleZ = -2.6441739F;
        super.leftAnimTrackModel2[4].addShapeBox(0.0F, 0.0F, 0.0F, 129, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel2[4].setRotationPoint(58.1F, 13.0F, -41.5F);
        super.leftAnimTrackModel2[4].rotateAngleZ = -3.1415927F;
        super.leftAnimTrackModel2[5].addShapeBox(0.0F, 0.0F, 0.0F, 24, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel2[5].setRotationPoint(-70.9F, 13.0F, -41.5F);
        super.leftAnimTrackModel2[5].rotateAngleZ = -3.8048177F;
        super.leftAnimTrackModel2[6].addShapeBox(0.0F, 0.0F, 0.0F, 9, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel2[6].setRotationPoint(-89.8F, -1.7F, -41.5F);
        super.leftAnimTrackModel2[6].rotateAngleZ = -4.712389F;
        super.leftAnimTrackModel2[7].addShapeBox(0.0F, 0.0F, 0.0F, 7, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel2[7].setRotationPoint(-89.8F, -10.7F, -41.5F);
        super.leftAnimTrackModel2[7].rotateAngleZ = -5.305801F;
        super.leftAnimTrackModel2[8].addShapeBox(0.0F, 0.0F, 0.0F, 163, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel2[8].setRotationPoint(-85.8F, -16.7F, -41.5F);
        super.rightAnimTrackModel2 = new ModelRendererTurbo[9];
        super.rightAnimTrackModel2[0] = new ModelRendererTurbo(this, 420, 3230, this.textureX, this.textureY);
        super.rightAnimTrackModel2[1] = new ModelRendererTurbo(this, 420, 3250, this.textureX, this.textureY);
        super.rightAnimTrackModel2[2] = new ModelRendererTurbo(this, 420, 3270, this.textureX, this.textureY);
        super.rightAnimTrackModel2[3] = new ModelRendererTurbo(this, 420, 3290, this.textureX, this.textureY);
        super.rightAnimTrackModel2[4] = new ModelRendererTurbo(this, 420, 3310, this.textureX, this.textureY);
        super.rightAnimTrackModel2[5] = new ModelRendererTurbo(this, 420, 3330, this.textureX, this.textureY);
        super.rightAnimTrackModel2[6] = new ModelRendererTurbo(this, 420, 3352, this.textureX, this.textureY);
        super.rightAnimTrackModel2[7] = new ModelRendererTurbo(this, 420, 3370, this.textureX, this.textureY);
        super.rightAnimTrackModel2[8] = new ModelRendererTurbo(this, 420, 3390, this.textureX, this.textureY);
        super.rightAnimTrackModel2[0].addShapeBox(0.0F, 0.0F, 0.0F, 7, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightAnimTrackModel2[0].setRotationPoint(79.5F, -15.5F, 26.5F);
        super.rightAnimTrackModel2[0].rotateAngleZ = -0.6981317F;
        super.rightAnimTrackModel2[1].addShapeBox(0.0F, 0.0F, 0.0F, 6, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightAnimTrackModel2[1].setRotationPoint(84.9F, -11.0F, 26.5F);
        super.rightAnimTrackModel2[1].rotateAngleZ = -1.5707964F;
        super.rightAnimTrackModel2[2].addShapeBox(0.0F, 0.0F, 0.0F, 6, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightAnimTrackModel2[2].setRotationPoint(84.9F, -5.0F, 26.5F);
        super.rightAnimTrackModel2[2].rotateAngleZ = -2.1293018F;
        super.rightAnimTrackModel2[3].addShapeBox(0.0F, 0.0F, 0.0F, 27, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightAnimTrackModel2[3].setRotationPoint(81.8F, 0.1F, 26.5F);
        super.rightAnimTrackModel2[3].rotateAngleZ = -2.6441739F;
        super.rightAnimTrackModel2[4].addShapeBox(0.0F, 0.0F, 0.0F, 129, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightAnimTrackModel2[4].setRotationPoint(58.1F, 13.0F, 26.5F);
        super.rightAnimTrackModel2[4].rotateAngleZ = -3.1415927F;
        super.rightAnimTrackModel2[5].addShapeBox(0.0F, 0.0F, 0.0F, 24, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightAnimTrackModel2[5].setRotationPoint(-70.9F, 13.0F, 26.5F);
        super.rightAnimTrackModel2[5].rotateAngleZ = -3.8048177F;
        super.rightAnimTrackModel2[6].addShapeBox(0.0F, 0.0F, 0.0F, 9, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightAnimTrackModel2[6].setRotationPoint(-89.8F, -1.7F, 26.5F);
        super.rightAnimTrackModel2[6].rotateAngleZ = -4.712389F;
        super.rightAnimTrackModel2[7].addShapeBox(0.0F, 0.0F, 0.0F, 7, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightAnimTrackModel2[7].setRotationPoint(-89.8F, -10.7F, 26.5F);
        super.rightAnimTrackModel2[7].rotateAngleZ = -5.305801F;
        super.rightAnimTrackModel2[8].addShapeBox(0.0F, 0.0F, 0.0F, 163, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightAnimTrackModel2[8].setRotationPoint(-85.8F, -16.7F, 26.5F);
        super.leftAnimTrackModel3 = new ModelRendererTurbo[9];
        super.leftAnimTrackModel3[0] = new ModelRendererTurbo(this, 820, 3230, this.textureX, this.textureY);
        super.leftAnimTrackModel3[1] = new ModelRendererTurbo(this, 820, 3250, this.textureX, this.textureY);
        super.leftAnimTrackModel3[2] = new ModelRendererTurbo(this, 820, 3270, this.textureX, this.textureY);
        super.leftAnimTrackModel3[3] = new ModelRendererTurbo(this, 820, 3290, this.textureX, this.textureY);
        super.leftAnimTrackModel3[4] = new ModelRendererTurbo(this, 820, 3310, this.textureX, this.textureY);
        super.leftAnimTrackModel3[5] = new ModelRendererTurbo(this, 820, 3330, this.textureX, this.textureY);
        super.leftAnimTrackModel3[6] = new ModelRendererTurbo(this, 820, 3352, this.textureX, this.textureY);
        super.leftAnimTrackModel3[7] = new ModelRendererTurbo(this, 820, 3370, this.textureX, this.textureY);
        super.leftAnimTrackModel3[8] = new ModelRendererTurbo(this, 820, 3390, this.textureX, this.textureY);
        super.leftAnimTrackModel3[0].addShapeBox(0.0F, 0.0F, 0.0F, 7, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel3[0].setRotationPoint(79.5F, -15.5F, -41.5F);
        super.leftAnimTrackModel3[0].rotateAngleZ = -0.6981317F;
        super.leftAnimTrackModel3[1].addShapeBox(0.0F, 0.0F, 0.0F, 6, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel3[1].setRotationPoint(84.9F, -11.0F, -41.5F);
        super.leftAnimTrackModel3[1].rotateAngleZ = -1.5707964F;
        super.leftAnimTrackModel3[2].addShapeBox(0.0F, 0.0F, 0.0F, 6, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel3[2].setRotationPoint(84.9F, -5.0F, -41.5F);
        super.leftAnimTrackModel3[2].rotateAngleZ = -2.1293018F;
        super.leftAnimTrackModel3[3].addShapeBox(0.0F, 0.0F, 0.0F, 27, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel3[3].setRotationPoint(81.8F, 0.1F, -41.5F);
        super.leftAnimTrackModel3[3].rotateAngleZ = -2.6441739F;
        super.leftAnimTrackModel3[4].addShapeBox(0.0F, 0.0F, 0.0F, 129, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel3[4].setRotationPoint(58.1F, 13.0F, -41.5F);
        super.leftAnimTrackModel3[4].rotateAngleZ = -3.1415927F;
        super.leftAnimTrackModel3[5].addShapeBox(0.0F, 0.0F, 0.0F, 24, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel3[5].setRotationPoint(-70.9F, 13.0F, -41.5F);
        super.leftAnimTrackModel3[5].rotateAngleZ = -3.8048177F;
        super.leftAnimTrackModel3[6].addShapeBox(0.0F, 0.0F, 0.0F, 9, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel3[6].setRotationPoint(-89.8F, -1.7F, -41.5F);
        super.leftAnimTrackModel3[6].rotateAngleZ = -4.712389F;
        super.leftAnimTrackModel3[7].addShapeBox(0.0F, 0.0F, 0.0F, 7, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel3[7].setRotationPoint(-89.8F, -10.7F, -41.5F);
        super.leftAnimTrackModel3[7].rotateAngleZ = -5.305801F;
        super.leftAnimTrackModel3[8].addShapeBox(0.0F, 0.0F, 0.0F, 163, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftAnimTrackModel3[8].setRotationPoint(-85.8F, -16.7F, -41.5F);
        super.rightAnimTrackModel3 = new ModelRendererTurbo[9];
        super.rightAnimTrackModel3[0] = new ModelRendererTurbo(this, 820, 3230, this.textureX, this.textureY);
        super.rightAnimTrackModel3[1] = new ModelRendererTurbo(this, 820, 3250, this.textureX, this.textureY);
        super.rightAnimTrackModel3[2] = new ModelRendererTurbo(this, 820, 3270, this.textureX, this.textureY);
        super.rightAnimTrackModel3[3] = new ModelRendererTurbo(this, 820, 3290, this.textureX, this.textureY);
        super.rightAnimTrackModel3[4] = new ModelRendererTurbo(this, 820, 3310, this.textureX, this.textureY);
        super.rightAnimTrackModel3[5] = new ModelRendererTurbo(this, 820, 3330, this.textureX, this.textureY);
        super.rightAnimTrackModel3[6] = new ModelRendererTurbo(this, 820, 3352, this.textureX, this.textureY);
        super.rightAnimTrackModel3[7] = new ModelRendererTurbo(this, 820, 3370, this.textureX, this.textureY);
        super.rightAnimTrackModel3[8] = new ModelRendererTurbo(this, 820, 3390, this.textureX, this.textureY);
        super.rightAnimTrackModel3[0].addShapeBox(0.0F, 0.0F, 0.0F, 7, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightAnimTrackModel3[0].setRotationPoint(79.5F, -15.5F, 26.5F);
        super.rightAnimTrackModel3[0].rotateAngleZ = -0.6981317F;
        super.rightAnimTrackModel3[1].addShapeBox(0.0F, 0.0F, 0.0F, 6, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightAnimTrackModel3[1].setRotationPoint(84.9F, -11.0F, 26.5F);
        super.rightAnimTrackModel3[1].rotateAngleZ = -1.5707964F;
        super.rightAnimTrackModel3[2].addShapeBox(0.0F, 0.0F, 0.0F, 6, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightAnimTrackModel3[2].setRotationPoint(84.9F, -5.0F, 26.5F);
        super.rightAnimTrackModel3[2].rotateAngleZ = -2.1293018F;
        super.rightAnimTrackModel3[3].addShapeBox(0.0F, 0.0F, 0.0F, 27, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightAnimTrackModel3[3].setRotationPoint(81.8F, 0.1F, 26.5F);
        super.rightAnimTrackModel3[3].rotateAngleZ = -2.6441739F;
        super.rightAnimTrackModel3[4].addShapeBox(0.0F, 0.0F, 0.0F, 129, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightAnimTrackModel3[4].setRotationPoint(58.1F, 13.0F, 26.5F);
        super.rightAnimTrackModel3[4].rotateAngleZ = -3.1415927F;
        super.rightAnimTrackModel3[5].addShapeBox(0.0F, 0.0F, 0.0F, 24, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightAnimTrackModel3[5].setRotationPoint(-70.9F, 13.0F, 26.5F);
        super.rightAnimTrackModel3[5].rotateAngleZ = -3.8048177F;
        super.rightAnimTrackModel3[6].addShapeBox(0.0F, 0.0F, 0.0F, 9, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightAnimTrackModel3[6].setRotationPoint(-89.8F, -1.7F, 26.5F);
        super.rightAnimTrackModel3[6].rotateAngleZ = -4.712389F;
        super.rightAnimTrackModel3[7].addShapeBox(0.0F, 0.0F, 0.0F, 7, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightAnimTrackModel3[7].setRotationPoint(-89.8F, -10.7F, 26.5F);
        super.rightAnimTrackModel3[7].rotateAngleZ = -5.305801F;
        super.rightAnimTrackModel3[8].addShapeBox(0.0F, 0.0F, 0.0F, 163, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.rightAnimTrackModel3[8].setRotationPoint(-85.8F, -16.7F, 26.5F);
        ModelRendererTurbo[][] noseGunModel = new ModelRendererTurbo[][]{new ModelRendererTurbo[11], null, null};
        noseGunModel[0][0] = new ModelRendererTurbo(this, 0, 3453, this.textureX, this.textureY);
        noseGunModel[0][1] = new ModelRendererTurbo(this, 0, 3453, this.textureX, this.textureY);
        noseGunModel[0][2] = new ModelRendererTurbo(this, 0, 3453, this.textureX, this.textureY);
        noseGunModel[0][3] = new ModelRendererTurbo(this, 0, 3460, this.textureX, this.textureY);
        noseGunModel[0][4] = new ModelRendererTurbo(this, 0, 3470, this.textureX, this.textureY);
        noseGunModel[0][5] = new ModelRendererTurbo(this, 0, 3487, this.textureX, this.textureY);
        noseGunModel[0][6] = new ModelRendererTurbo(this, 0, 3487, this.textureX, this.textureY);
        noseGunModel[0][7] = new ModelRendererTurbo(this, 0, 3497, this.textureX, this.textureY);
        noseGunModel[0][8] = new ModelRendererTurbo(this, 0, 3504, this.textureX, this.textureY);
        noseGunModel[0][9] = new ModelRendererTurbo(this, 0, 3515, this.textureX, this.textureY);
        noseGunModel[0][10] = new ModelRendererTurbo(this, 0, 3526, this.textureX, this.textureY);
        noseGunModel[0][0].addShapeBox(-3.0F, 0.0F, -1.0F, 6, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        noseGunModel[0][1].addShapeBox(-3.0F, 0.0F, -3.0F, 6, 1, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        noseGunModel[0][2].addShapeBox(-3.0F, 0.0F, 1.0F, 6, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F,
                0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F);
        noseGunModel[0][3].addShapeBox(-2.0F, -3.0F, -2.0F, 4, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        noseGunModel[0][4].addShapeBox(-5.0F, -5.0F, -6.0F, 10, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        noseGunModel[0][5].addShapeBox(-4.0F, -11.0F, -3.0F, 6, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
        noseGunModel[0][6].addShapeBox(-4.0F, -11.0F, 3.0F, 6, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
        noseGunModel[0][7].addShapeBox(-6.0F, -12.0F, 4.0F, 5, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        noseGunModel[0][8].addShapeBox(-7.0F, -10.0F, 6.0F, 7, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F);
        noseGunModel[0][9].addShapeBox(-7.0F, -13.0F, 6.0F, 7, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        noseGunModel[0][10].addShapeBox(-11.0F, -5.0F, -4.0F, 6, 3, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
        ModelRendererTurbo[] var2 = noseGunModel[0];
        int var3 = var2.length;

        int var4;
        ModelRendererTurbo noseGunPart;
        for (var4 = 0; var4 < var3; ++var4) {
            noseGunPart = var2[var4];
            noseGunPart.setRotationPoint(-27.0F, -47.0F, -15.0F);
        }

        noseGunModel[1] = new ModelRendererTurbo[0];
        noseGunModel[2] = new ModelRendererTurbo[6];
        noseGunModel[2][0] = new ModelRendererTurbo(this, 0, 3410, this.textureX, this.textureY);
        noseGunModel[2][1] = new ModelRendererTurbo(this, 0, 3418, this.textureX, this.textureY);
        noseGunModel[2][2] = new ModelRendererTurbo(this, 0, 3424, this.textureX, this.textureY);
        noseGunModel[2][3] = new ModelRendererTurbo(this, 0, 3430, this.textureX, this.textureY);
        noseGunModel[2][4] = new ModelRendererTurbo(this, 0, 3433, this.textureX, this.textureY);
        noseGunModel[2][5] = new ModelRendererTurbo(this, 0, 3440, this.textureX, this.textureY);
        noseGunModel[2][0].addShapeBox(-10.0F, -2.0F, -1.5F, 13, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        noseGunModel[2][1].addShapeBox(3.0F, -1.5F, -1.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        noseGunModel[2][2].addTrapezoid(8.0F, -1.5F, -1.0F, 1, 2, 2, 0.0F, -0.5F, 2);
        noseGunModel[2][3].addTrapezoid(9.0F, -1.0F, -0.5F, 11, 1, 1, 0.0F, 0.0F, 4);
        noseGunModel[2][4].addShapeBox(0.0F, -2.5F, -3.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        noseGunModel[2][5].addShapeBox(0.0F, -2.5F, -9.0F, 2, 5, 6, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        var2 = noseGunModel[2];
        var3 = var2.length;

        for (var4 = 0; var4 < var3; ++var4) {
            noseGunPart = var2[var4];
            noseGunPart.setRotationPoint(-27.0F, -54.0F, -15.0F);
        }

        this.registerGunModel("MG3", noseGunModel);
        this.translateAll(0.0F, 0.0F, 0.0F);
        this.flipAll();
    }
}
