// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.manus_dayz;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;

public class ModelChevroletSuburban2010_B extends ModelVehicle {
    int textureX;
    int textureY;

    public ModelChevroletSuburban2010_B() {
        this.textureX = 512;
        this.textureY = 512;
        (this.bodyModel = new ModelRendererTurbo[186])[0] = new ModelRendererTurbo(this, 0, 474,
                this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo(this, 0, 474, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo(this, 93, 486, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo(this, 127, 465, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo(this, 184, 468, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo(this, 329, 476, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo(this, 399, 485, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo(this, 437, 482, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo(this, 43, 485, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo(this, 0, 474, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo(this, 0, 446, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo(this, 0, 489, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo(this, 43, 446, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo(this, 85, 419, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo(this, 0, 407, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo(this, 172, 413, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo(this, 210, 458, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo(this, 318, 458, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo(this, 254, 438, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo(this, 254, 423, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo(this, 78, 403, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo(this, 244, 403, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo(this, 78, 412, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo(this, 143, 412, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo(this, 0, 403, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo(this, 0, 412, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo(this, 361, 433, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo(this, 385, 433, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo(this, 361, 413, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo(this, 410, 458, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo(this, 434, 452, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo(this, 454, 458, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo(this, 472, 479, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo(this, 410, 403, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo(this, 455, 403, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo(this, 410, 415, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo(this, 410, 420, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo(this, 410, 425, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo(this, 422, 425, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo(this, 434, 425, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo(this, 448, 425, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo(this, 0, 380, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo(this, 12, 380, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo(this, 0, 393, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo(this, 12, 393, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo(this, 24, 380, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo(this, 36, 380, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo(this, 48, 380, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo(this, 68, 380, this.textureX, this.textureY);
        this.bodyModel[49] = new ModelRendererTurbo(this, 88, 380, this.textureX, this.textureY);
        this.bodyModel[50] = new ModelRendererTurbo(this, 100, 380, this.textureX, this.textureY);
        this.bodyModel[51] = new ModelRendererTurbo(this, 85, 374, this.textureX, this.textureY);
        this.bodyModel[52] = new ModelRendererTurbo(this, 236, 397, this.textureX, this.textureY);
        this.bodyModel[53] = new ModelRendererTurbo(this, 236, 393, this.textureX, this.textureY);
        this.bodyModel[54] = new ModelRendererTurbo(this, 336, 376, this.textureX, this.textureY);
        this.bodyModel[55] = new ModelRendererTurbo(this, 365, 371, this.textureX, this.textureY);
        this.bodyModel[56] = new ModelRendererTurbo(this, 236, 374, this.textureX, this.textureY);
        this.bodyModel[57] = new ModelRendererTurbo(this, 236, 379, this.textureX, this.textureY);
        this.bodyModel[58] = new ModelRendererTurbo(this, 0, 421, this.textureX, this.textureY);
        this.bodyModel[59] = new ModelRendererTurbo(this, 78, 421, this.textureX, this.textureY);
        this.bodyModel[60] = new ModelRendererTurbo(this, 0, 350, this.textureX, this.textureY);
        this.bodyModel[61] = new ModelRendererTurbo(this, 18, 350, this.textureX, this.textureY);
        this.bodyModel[62] = new ModelRendererTurbo(this, 36, 350, this.textureX, this.textureY);
        this.bodyModel[63] = new ModelRendererTurbo(this, 54, 350, this.textureX, this.textureY);
        this.bodyModel[64] = new ModelRendererTurbo(this, 72, 350, this.textureX, this.textureY);
        this.bodyModel[65] = new ModelRendererTurbo(this, 90, 350, this.textureX, this.textureY);
        this.bodyModel[66] = new ModelRendererTurbo(this, 108, 350, this.textureX, this.textureY);
        this.bodyModel[67] = new ModelRendererTurbo(this, 126, 350, this.textureX, this.textureY);
        this.bodyModel[68] = new ModelRendererTurbo(this, 145, 350, this.textureX, this.textureY);
        this.bodyModel[69] = new ModelRendererTurbo(this, 155, 350, this.textureX, this.textureY);
        this.bodyModel[70] = new ModelRendererTurbo(this, 225, 350, this.textureX, this.textureY);
        this.bodyModel[71] = new ModelRendererTurbo(this, 225, 355, this.textureX, this.textureY);
        this.bodyModel[72] = new ModelRendererTurbo(this, 165, 350, this.textureX, this.textureY);
        this.bodyModel[73] = new ModelRendererTurbo(this, 175, 350, this.textureX, this.textureY);
        this.bodyModel[74] = new ModelRendererTurbo(this, 185, 350, this.textureX, this.textureY);
        this.bodyModel[75] = new ModelRendererTurbo(this, 195, 350, this.textureX, this.textureY);
        this.bodyModel[76] = new ModelRendererTurbo(this, 225, 360, this.textureX, this.textureY);
        this.bodyModel[77] = new ModelRendererTurbo(this, 225, 365, this.textureX, this.textureY);
        this.bodyModel[78] = new ModelRendererTurbo(this, 205, 350, this.textureX, this.textureY);
        this.bodyModel[79] = new ModelRendererTurbo(this, 215, 350, this.textureX, this.textureY);
        this.bodyModel[80] = new ModelRendererTurbo(this, 403, 348, this.textureX, this.textureY);
        this.bodyModel[81] = new ModelRendererTurbo(this, 292, 350, this.textureX, this.textureY);
        this.bodyModel[82] = new ModelRendererTurbo(this, 292, 360, this.textureX, this.textureY);
        this.bodyModel[83] = new ModelRendererTurbo(this, 282, 350, this.textureX, this.textureY);
        this.bodyModel[84] = new ModelRendererTurbo(this, 2, 300, this.textureX, this.textureY);
        this.bodyModel[85] = new ModelRendererTurbo(this, 0, 300, this.textureX, this.textureY);
        this.bodyModel[86] = new ModelRendererTurbo(this, 52, 300, this.textureX, this.textureY);
        this.bodyModel[87] = new ModelRendererTurbo(this, 0, 318, this.textureX, this.textureY);
        this.bodyModel[88] = new ModelRendererTurbo(this, 0, 325, this.textureX, this.textureY);
        this.bodyModel[89] = new ModelRendererTurbo(this, 52, 319, this.textureX, this.textureY);
        this.bodyModel[90] = new ModelRendererTurbo(this, 84, 334, this.textureX, this.textureY);
        this.bodyModel[91] = new ModelRendererTurbo(this, 116, 335, this.textureX, this.textureY);
        this.bodyModel[92] = new ModelRendererTurbo(this, 152, 335, this.textureX, this.textureY);
        this.bodyModel[93] = new ModelRendererTurbo(this, 116, 325, this.textureX, this.textureY);
        this.bodyModel[94] = new ModelRendererTurbo(this, 152, 325, this.textureX, this.textureY);
        this.bodyModel[95] = new ModelRendererTurbo(this, 84, 300, this.textureX, this.textureY);
        this.bodyModel[96] = new ModelRendererTurbo(this, 84, 300, this.textureX, this.textureY);
        this.bodyModel[97] = new ModelRendererTurbo(this, 84, 305, this.textureX, this.textureY);
        this.bodyModel[98] = new ModelRendererTurbo(this, 84, 305, this.textureX, this.textureY);
        this.bodyModel[99] = new ModelRendererTurbo(this, 96, 300, this.textureX, this.textureY);
        this.bodyModel[100] = new ModelRendererTurbo(this, 96, 300, this.textureX, this.textureY);
        this.bodyModel[101] = new ModelRendererTurbo(this, 106, 300, this.textureX, this.textureY);
        this.bodyModel[102] = new ModelRendererTurbo(this, 106, 300, this.textureX, this.textureY);
        this.bodyModel[103] = new ModelRendererTurbo(this, 114, 300, this.textureX, this.textureY);
        this.bodyModel[104] = new ModelRendererTurbo(this, 114, 300, this.textureX, this.textureY);
        this.bodyModel[105] = new ModelRendererTurbo(this, 0, 373, this.textureX, this.textureY);
        this.bodyModel[106] = new ModelRendererTurbo(this, 14, 373, this.textureX, this.textureY);
        this.bodyModel[107] = new ModelRendererTurbo(this, 116, 309, this.textureX, this.textureY);
        this.bodyModel[108] = new ModelRendererTurbo(this, 143, 309, this.textureX, this.textureY);
        this.bodyModel[109] = new ModelRendererTurbo(this, 169, 309, this.textureX, this.textureY);
        this.bodyModel[110] = new ModelRendererTurbo(this, 185, 309, this.textureX, this.textureY);
        this.bodyModel[111] = new ModelRendererTurbo(this, 201, 309, this.textureX, this.textureY);
        this.bodyModel[112] = new ModelRendererTurbo(this, 217, 309, this.textureX, this.textureY);
        this.bodyModel[113] = new ModelRendererTurbo(this, 83, 309, this.textureX, this.textureY);
        this.bodyModel[114] = new ModelRendererTurbo(this, 94, 309, this.textureX, this.textureY);
        this.bodyModel[115] = new ModelRendererTurbo(this, 188, 322, this.textureX, this.textureY);
        this.bodyModel[116] = new ModelRendererTurbo(this, 206, 322, this.textureX, this.textureY);
        this.bodyModel[117] = new ModelRendererTurbo(this, 234, 300, this.textureX, this.textureY);
        this.bodyModel[118] = new ModelRendererTurbo(this, 290, 300, this.textureX, this.textureY);
        this.bodyModel[119] = new ModelRendererTurbo(this, 279, 300, this.textureX, this.textureY);
        this.bodyModel[120] = new ModelRendererTurbo(this, 234, 320, this.textureX, this.textureY);
        this.bodyModel[121] = new ModelRendererTurbo(this, 290, 320, this.textureX, this.textureY);
        this.bodyModel[122] = new ModelRendererTurbo(this, 279, 320, this.textureX, this.textureY);
        this.bodyModel[123] = new ModelRendererTurbo(this, 348, 300, this.textureX, this.textureY);
        this.bodyModel[124] = new ModelRendererTurbo(this, 404, 300, this.textureX, this.textureY);
        this.bodyModel[125] = new ModelRendererTurbo(this, 393, 300, this.textureX, this.textureY);
        this.bodyModel[126] = new ModelRendererTurbo(this, 450, 300, this.textureX, this.textureY);
        this.bodyModel[127] = new ModelRendererTurbo(this, 348, 320, this.textureX, this.textureY);
        this.bodyModel[128] = new ModelRendererTurbo(this, 404, 320, this.textureX, this.textureY);
        this.bodyModel[129] = new ModelRendererTurbo(this, 393, 320, this.textureX, this.textureY);
        this.bodyModel[130] = new ModelRendererTurbo(this, 450, 320, this.textureX, this.textureY);
        this.bodyModel[131] = new ModelRendererTurbo(this, 0, 270, this.textureX, this.textureY);
        this.bodyModel[132] = new ModelRendererTurbo(this, 84, 270, this.textureX, this.textureY);
        this.bodyModel[133] = new ModelRendererTurbo(this, 0, 270, this.textureX, this.textureY);
        this.bodyModel[134] = new ModelRendererTurbo(this, 0, 280, this.textureX, this.textureY);
        this.bodyModel[135] = new ModelRendererTurbo(this, 145, 270, this.textureX, this.textureY);
        this.bodyModel[136] = new ModelRendererTurbo(this, 145, 277, this.textureX, this.textureY);
        this.bodyModel[137] = new ModelRendererTurbo(this, 185, 270, this.textureX, this.textureY);
        this.bodyModel[138] = new ModelRendererTurbo(this, 185, 279, this.textureX, this.textureY);
        this.bodyModel[139] = new ModelRendererTurbo(this, 192, 254, this.textureX, this.textureY);
        this.bodyModel[140] = new ModelRendererTurbo(this, 228, 250, this.textureX, this.textureY);
        this.bodyModel[141] = new ModelRendererTurbo(this, 302, 253, this.textureX, this.textureY);
        this.bodyModel[142] = new ModelRendererTurbo(this, 0, 250, this.textureX, this.textureY);
        this.bodyModel[143] = new ModelRendererTurbo(this, 0, 265, this.textureX, this.textureY);
        this.bodyModel[144] = new ModelRendererTurbo(this, 14, 260, this.textureX, this.textureY);
        this.bodyModel[145] = new ModelRendererTurbo(this, 22, 250, this.textureX, this.textureY);
        this.bodyModel[146] = new ModelRendererTurbo(this, 44, 250, this.textureX, this.textureY);
        this.bodyModel[147] = new ModelRendererTurbo(this, 28, 260, this.textureX, this.textureY);
        this.bodyModel[148] = new ModelRendererTurbo(this, 42, 260, this.textureX, this.textureY);
        this.bodyModel[149] = new ModelRendererTurbo(this, 64, 250, this.textureX, this.textureY);
        this.bodyModel[150] = new ModelRendererTurbo(this, 48, 260, this.textureX, this.textureY);
        this.bodyModel[151] = new ModelRendererTurbo(this, 86, 250, this.textureX, this.textureY);
        this.bodyModel[152] = new ModelRendererTurbo(this, 65, 260, this.textureX, this.textureY);
        this.bodyModel[153] = new ModelRendererTurbo(this, 79, 260, this.textureX, this.textureY);
        this.bodyModel[154] = new ModelRendererTurbo(this, 108, 250, this.textureX, this.textureY);
        this.bodyModel[155] = new ModelRendererTurbo(this, 127, 250, this.textureX, this.textureY);
        this.bodyModel[156] = new ModelRendererTurbo(this, 92, 265, this.textureX, this.textureY);
        this.bodyModel[157] = new ModelRendererTurbo(this, 106, 260, this.textureX, this.textureY);
        this.bodyModel[158] = new ModelRendererTurbo(this, 149, 250, this.textureX, this.textureY);
        this.bodyModel[159] = new ModelRendererTurbo(this, 134, 223, this.textureX, this.textureY);
        this.bodyModel[160] = new ModelRendererTurbo(this, 0, 235, this.textureX, this.textureY);
        this.bodyModel[161] = new ModelRendererTurbo(this, 33, 235, this.textureX, this.textureY);
        this.bodyModel[162] = new ModelRendererTurbo(this, 66, 235, this.textureX, this.textureY);
        this.bodyModel[163] = new ModelRendererTurbo(this, 99, 235, this.textureX, this.textureY);
        this.bodyModel[164] = new ModelRendererTurbo(this, 183, 223, this.textureX, this.textureY);
        this.bodyModel[165] = new ModelRendererTurbo(this, 0, 220, this.textureX, this.textureY);
        this.bodyModel[166] = new ModelRendererTurbo(this, 14, 220, this.textureX, this.textureY);
        this.bodyModel[167] = new ModelRendererTurbo(this, 27, 220, this.textureX, this.textureY);
        this.bodyModel[168] = new ModelRendererTurbo(this, 0, 230, this.textureX, this.textureY);
        this.bodyModel[169] = new ModelRendererTurbo(this, 14, 230, this.textureX, this.textureY);
        this.bodyModel[170] = new ModelRendererTurbo(this, 28, 230, this.textureX, this.textureY);
        this.bodyModel[171] = new ModelRendererTurbo(this, 42, 230, this.textureX, this.textureY);
        this.bodyModel[172] = new ModelRendererTurbo(this, 41, 220, this.textureX, this.textureY);
        this.bodyModel[173] = new ModelRendererTurbo(this, 0, 100, this.textureX, this.textureY);
        this.bodyModel[174] = new ModelRendererTurbo(this, 72, 100, this.textureX, this.textureY);
        this.bodyModel[175] = new ModelRendererTurbo(this, 145, 100, this.textureX, this.textureY);
        this.bodyModel[176] = new ModelRendererTurbo(this, 220, 100, this.textureX, this.textureY);
        this.bodyModel[177] = new ModelRendererTurbo(this, 145, 120, this.textureX, this.textureY);
        this.bodyModel[178] = new ModelRendererTurbo(this, 220, 120, this.textureX, this.textureY);
        this.bodyModel[179] = new ModelRendererTurbo(this, 134, 232, this.textureX, this.textureY);
        this.bodyModel[180] = new ModelRendererTurbo(this, 134, 223, this.textureX, this.textureY);
        this.bodyModel[181] = new ModelRendererTurbo(this, 79, 484, this.textureX, this.textureY);
        this.bodyModel[182] = new ModelRendererTurbo(this, 79, 496, this.textureX, this.textureY);
        this.bodyModel[183] = new ModelRendererTurbo(this, 0, 50, this.textureX, this.textureY);
        this.bodyModel[184] = new ModelRendererTurbo(this, 0, 50, this.textureX, this.textureY);
        this.bodyModel[185] = new ModelRendererTurbo(this, 0, 50, this.textureX, this.textureY);
        this.bodyModel[0].addBox(0.0f, 0.0f, 0.0f, 2, 2, 36, 0.0f);
        this.bodyModel[0].setRotationPoint(34.0f, 0.5f, -18.0f);
        this.bodyModel[1].addBox(0.0f, 0.0f, 0.0f, 2, 2, 36, 0.0f);
        this.bodyModel[1].setRotationPoint(-36.0f, 0.5f, -18.0f);
        this.bodyModel[2].addBox(0.0f, 0.0f, 0.0f, 4, 2, 24, 0.0f);
        this.bodyModel[2].setRotationPoint(45.0f, 2.0f, -12.0f);
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 20, 16, 28, 0.0f);
        this.bodyModel[3].setRotationPoint(25.0f, -12.0f, -14.0f);
        this.bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 50, 2, 42, 0.0f);
        this.bodyModel[4].setRotationPoint(-25.0f, 2.0f, -21.0f);
        this.bodyModel[5].addBox(0.0f, 0.0f, 0.0f, 20, 5, 28, 0.0f);
        this.bodyModel[5].setRotationPoint(-45.0f, -1.0f, -14.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 14, 3, 14, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f,
                1.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f);
        this.bodyModel[6].setRotationPoint(-60.0f, 1.0f, -7.0f);
        this.bodyModel[7].addBox(0.0f, 0.0f, 0.0f, 4, 5, 22, 0.0f);
        this.bodyModel[7].setRotationPoint(46.5f, -11.0f, -11.0f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 22, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.bodyModel[8].setRotationPoint(47.0f, -10.0f, -11.0f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 4, 5, 9, 0.0f, 0.0f, -2.0f, -2.0f, -2.0f, -4.0f, -2.0f, 0.0f,
                -4.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.bodyModel[9].setRotationPoint(47.0f, -17.0f, -20.0f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 4, 5, 22, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f,
                -4.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[10].setRotationPoint(47.0f, -17.0f, -11.0f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 4, 5, 9, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -4.0f, 0.0f, -2.0f,
                -4.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.bodyModel[11].setRotationPoint(47.0f, -17.0f, 11.0f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 4, 5, 32, 0.0f, 0.0f, -1.8f, -3.0f, 0.0f, -3.8f, -4.0f, 0.0f,
                -3.8f, -4.0f, 0.0f, -1.8f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f,
                -3.0f);
        this.bodyModel[12].setRotationPoint(47.0f, -17.0f, -16.0f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 22, 5, 40, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f,
                -2.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.bodyModel[13].setRotationPoint(25.0f, -17.0f, -20.0f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 22, 5, 32, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.8f, -3.0f, 0.0f,
                -1.8f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f,
                0.0f);
        this.bodyModel[14].setRotationPoint(25.0f, -17.0f, -16.0f);
        this.bodyModel[15].addBox(0.0f, 0.0f, 0.0f, 20, 3, 40, 0.0f);
        this.bodyModel[15].setRotationPoint(25.0f, -12.0f, -20.0f);
        this.bodyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 50, 4, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f);
        this.bodyModel[16].setRotationPoint(-25.0f, -2.0f, 17.0f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 50, 4, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[17].setRotationPoint(-25.0f, -2.0f, -20.0f);
        this.bodyModel[18].addBox(0.0f, 0.0f, 0.0f, 50, 10, 3, 0.0f);
        this.bodyModel[18].setRotationPoint(-25.0f, -12.0f, 17.0f);
        this.bodyModel[19].addBox(0.0f, 0.0f, 0.0f, 50, 10, 3, 0.0f);
        this.bodyModel[19].setRotationPoint(-25.0f, -12.0f, -20.0f);
        this.bodyModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 79, 5, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[20].setRotationPoint(-54.0f, -17.0f, 17.0f);
        this.bodyModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 79, 5, 3, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[21].setRotationPoint(-54.0f, -17.0f, -20.0f);
        this.bodyModel[22].addBox(0.0f, 0.0f, 0.0f, 29, 3, 3, 0.0f);
        this.bodyModel[22].setRotationPoint(-54.0f, -12.0f, 17.0f);
        this.bodyModel[23].addBox(0.0f, 0.0f, 0.0f, 29, 3, 3, 0.0f);
        this.bodyModel[23].setRotationPoint(-54.0f, -12.0f, -20.0f);
        this.bodyModel[24].addBox(0.0f, 0.0f, 0.0f, 9, 4, 3, 0.0f);
        this.bodyModel[24].setRotationPoint(-54.0f, -9.0f, 17.0f);
        this.bodyModel[25].addBox(0.0f, 0.0f, 0.0f, 9, 4, 3, 0.0f);
        this.bodyModel[25].setRotationPoint(-54.0f, -9.0f, -20.0f);
        this.bodyModel[26].addBox(0.0f, 0.0f, 0.0f, 2, 15, 9, 0.0f);
        this.bodyModel[26].setRotationPoint(-58.0f, -17.0f, -17.0f);
        this.bodyModel[27].addBox(0.0f, 0.0f, 0.0f, 2, 15, 9, 0.0f);
        this.bodyModel[27].setRotationPoint(-58.0f, -17.0f, 8.0f);
        this.bodyModel[28].addBox(0.0f, 0.0f, 0.0f, 2, 3, 16, 0.0f);
        this.bodyModel[28].setRotationPoint(-58.0f, -17.0f, -8.0f);
        this.bodyModel[29].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 16, 0.0f, -0.9f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, -0.9f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f,
                0.0f);
        this.bodyModel[29].setRotationPoint(-59.0f, -14.0f, -8.0f);
        this.bodyModel[30].addBox(0.0f, 0.0f, 0.0f, 1, 4, 16, 0.0f);
        this.bodyModel[30].setRotationPoint(-57.0f, -11.0f, -8.0f);
        this.bodyModel[31].addShapeBox(0.0f, 0.0f, 0.0f, 3, 2, 16, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.9f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.9f, 0.0f,
                0.0f);
        this.bodyModel[31].setRotationPoint(-59.0f, -7.0f, -8.0f);
        this.bodyModel[32].addBox(0.0f, 0.0f, 0.0f, 2, 3, 16, 0.0f);
        this.bodyModel[32].setRotationPoint(-58.0f, -5.0f, -8.0f);
        this.bodyModel[33].addBox(0.0f, 0.0f, 0.0f, 20, 9, 1, 0.0f);
        this.bodyModel[33].setRotationPoint(-45.0f, -10.0f, 13.0f);
        this.bodyModel[34].addBox(0.0f, 0.0f, 0.0f, 20, 9, 1, 0.0f);
        this.bodyModel[34].setRotationPoint(-45.0f, -10.0f, -14.0f);
        this.bodyModel[35].addBox(0.0f, 0.0f, 0.0f, 20, 1, 3, 0.0f);
        this.bodyModel[35].setRotationPoint(-45.0f, -10.0f, 14.0f);
        this.bodyModel[36].addBox(0.0f, 0.0f, 0.0f, 20, 1, 3, 0.0f);
        this.bodyModel[36].setRotationPoint(-45.0f, -10.0f, -17.0f);
        this.bodyModel[37].addShapeBox(0.0f, 0.0f, 0.0f, 1, 9, 4, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[37].setRotationPoint(-46.0f, -10.0f, 13.0f);
        this.bodyModel[38].addShapeBox(0.0f, 0.0f, 0.0f, 1, 9, 4, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[38].setRotationPoint(-46.0f, -10.0f, -17.0f);
        this.bodyModel[39].addShapeBox(0.0f, 0.0f, 0.0f, 2, 12, 4, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[39].setRotationPoint(-25.0f, -10.0f, 13.0f);
        this.bodyModel[40].addShapeBox(0.0f, 0.0f, 0.0f, 2, 12, 4, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[40].setRotationPoint(-25.0f, -10.0f, -17.0f);
        this.bodyModel[41].addShapeBox(0.0f, 0.0f, 0.0f, 4, 10, 1, 0.0f, 11.0f, 0.0f, 4.090909f, -12.0f, 0.0f,
                4.090909f, -12.0f, 0.0f, -4.090909f, 11.0f, 0.0f, -4.090909f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[41].setRotationPoint(21.0f, -27.0f, 17.0f);
        this.bodyModel[42].addShapeBox(0.0f, 0.0f, 0.0f, 4, 10, 1, 0.0f, 11.0f, 0.0f, -4.090909f, -12.0f, 0.0f,
                -4.090909f, -12.0f, 0.0f, 4.090909f, 11.0f, 0.0f, 4.090909f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[42].setRotationPoint(21.0f, -27.0f, -18.0f);
        this.bodyModel[43].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 1, 0.0f, -1.9999f, 0.0f, 0.8181818f, 0.0f, 0.0f,
                0.8181818f, 0.0f, 0.0f, -0.8181818f, -1.9999f, 0.0f, -0.8181818f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[43].setRotationPoint(19.0f, -19.0f, 17.0f);
        this.bodyModel[44].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 1, 0.0f, -1.9999f, 0.0f, -0.8181818f, 0.0f, 0.0f,
                -0.8181818f, 0.0f, 0.0f, 0.8181818f, -1.9999f, 0.0f, 0.8181818f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[44].setRotationPoint(19.0f, -19.0f, -18.0f);
        this.bodyModel[45].addShapeBox(0.0f, 0.0f, 0.0f, 4, 10, 1, 0.0f, -1.0f, 0.0f, 4.090909f, 1.0f, 0.0f, 4.090909f,
                1.0f, 0.0f, -4.090909f, -1.0f, 0.0f, -4.090909f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f);
        this.bodyModel[45].setRotationPoint(-4.0f, -27.0f, 17.0f);
        this.bodyModel[46].addShapeBox(0.0f, 0.0f, 0.0f, 4, 10, 1, 0.0f, -1.0f, 0.0f, -4.090909f, 1.0f, 0.0f,
                -4.090909f, 1.0f, 0.0f, 4.090909f, -1.0f, 0.0f, 4.090909f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[46].setRotationPoint(-4.0f, -27.0f, -18.0f);
        this.bodyModel[47].addShapeBox(0.0f, 0.0f, 0.0f, 8, 10, 1, 0.0f, -6.0f, 0.0f, 4.090909f, 3.0f, 0.0f, 4.090909f,
                3.0f, 0.0f, -4.090909f, -6.0f, 0.0f, -4.090909f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f);
        this.bodyModel[47].setRotationPoint(-28.0f, -27.0f, 17.0f);
        this.bodyModel[48].addShapeBox(0.0f, 0.0f, 0.0f, 8, 10, 1, 0.0f, -6.0f, 0.0f, -4.090909f, 3.0f, 0.0f,
                -4.090909f, 3.0f, 0.0f, 4.090909f, -6.0f, 0.0f, 4.090909f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[48].setRotationPoint(-28.0f, -27.0f, -18.0f);
        this.bodyModel[49].addShapeBox(0.0f, 0.0f, 0.0f, 4, 10, 1, 0.0f, -6.0f, 0.0f, 4.090909f, 6.0f, 0.0f, 4.090909f,
                6.0f, 0.0f, -4.090909f, -6.0f, 0.0f, -4.090909f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f);
        this.bodyModel[49].setRotationPoint(-58.0f, -27.0f, 17.0f);
        this.bodyModel[50].addShapeBox(0.0f, 0.0f, 0.0f, 4, 10, 1, 0.0f, -6.0f, 0.0f, -4.090909f, 6.0f, 0.0f,
                -4.090909f, 6.0f, 0.0f, 4.090909f, -6.0f, 0.0f, 4.090909f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[50].setRotationPoint(-58.0f, -27.0f, -18.0f);
        this.bodyModel[51].addShapeBox(0.0f, 0.0f, 0.0f, 61, 1, 27, 0.0f, -1.5f, 0.0f, -0.5f, -4.0f, 0.0f, -0.5f, -4.0f,
                0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f,
                0.0f);
        this.bodyModel[51].setRotationPoint(-52.0f, -29.0f, -13.5f);
        this.bodyModel[52].addShapeBox(0.0f, 0.0f, 0.0f, 61, 1, 1, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4090909f, 0.0f, 0.0f, 0.4090909f, 0.0f, 0.0f, -0.4090909f,
                0.0f, 0.0f, -0.4090909f);
        this.bodyModel[52].setRotationPoint(-52.0f, -28.0f, -13.5f);
        this.bodyModel[53].addShapeBox(0.0f, 0.0f, 0.0f, 61, 1, 1, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4090909f, 0.0f, 0.0f, -0.4090909f, 0.0f, 0.0f, 0.4090909f,
                0.0f, 0.0f, 0.4090909f);
        this.bodyModel[53].setRotationPoint(-52.0f, -28.0f, 12.5f);
        this.bodyModel[54].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 25, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f,
                0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4090909f, 0.0f, 0.0f, 0.4090909f, 0.0f, 0.0f, 0.4090909f,
                0.0f, 0.0f, 0.4090909f);
        this.bodyModel[54].setRotationPoint(-52.0f, -28.0f, -12.5f);
        this.bodyModel[55].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 27, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.9999f, 0.4090909f,
                0.0f, -0.9999f, 0.4090909f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4090909f, 0.0f, 0.0f, 0.4090909f, 0.0f,
                0.0f, 0.4090909f, 0.0f, 0.0f, 0.4090909f);
        this.bodyModel[55].setRotationPoint(9.0f, -28.0f, -13.5f);
        this.bodyModel[58].addBox(0.0f, 0.0f, 0.0f, 4, 1, 10, 0.0f);
        this.bodyModel[58].setRotationPoint(5.0f, -27.5f, 2.0f);
        this.bodyModel[59].addBox(0.0f, 0.0f, 0.0f, 4, 1, 10, 0.0f);
        this.bodyModel[59].setRotationPoint(5.0f, -27.5f, -12.0f);
        this.bodyModel[60].addShapeBox(0.0f, 0.0f, 0.0f, 2, 11, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.bodyModel[60].setRotationPoint(43.0f, -9.0f, -20.0f);
        this.bodyModel[61].addShapeBox(0.0f, 0.0f, 0.0f, 2, 11, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.bodyModel[61].setRotationPoint(43.0f, -9.0f, 14.0f);
        this.bodyModel[62].addShapeBox(0.0f, 0.0f, 0.0f, 2, 11, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[62].setRotationPoint(25.0f, -9.0f, -20.0f);
        this.bodyModel[63].addShapeBox(0.0f, 0.0f, 0.0f, 2, 11, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[63].setRotationPoint(25.0f, -9.0f, 14.0f);
        this.bodyModel[64].addShapeBox(0.0f, 0.0f, 0.0f, 2, 11, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.bodyModel[64].setRotationPoint(-27.0f, -9.0f, -20.0f);
        this.bodyModel[65].addShapeBox(0.0f, 0.0f, 0.0f, 2, 11, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.bodyModel[65].setRotationPoint(-27.0f, -9.0f, 14.0f);
        this.bodyModel[66].addShapeBox(0.0f, 0.0f, 0.0f, 2, 10, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[66].setRotationPoint(-45.0f, -9.0f, -20.0f);
        this.bodyModel[67].addShapeBox(0.0f, 0.0f, 0.0f, 2, 10, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[67].setRotationPoint(-45.0f, -9.0f, 14.0f);
        this.bodyModel[68].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 2, 0.0f, 2.0f, -1.0f, 0.0f, 1.0f, 3.0f, 0.0f, -2.0f,
                0.0f, 0.0f, 2.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[68].setRotationPoint(45.0f, -10.0f, 18.9f);
        this.bodyModel[69].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 2, 0.0f, 2.0f, -1.0f, 0.0f, -2.0f, 0.0f, 0.0f, 1.0f,
                3.0f, 0.0f, 2.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[69].setRotationPoint(45.0f, -10.0f, -20.9f);
        this.bodyModel[70].addShapeBox(0.0f, 0.0f, 0.0f, 16, 1, 2, 0.0f, 4.0f, 3.0f, 0.0f, 4.0f, 3.0f, 0.0f, 1.0f, 0.0f,
                0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[70].setRotationPoint(27.0f, -10.0f, 18.9f);
        this.bodyModel[71].addShapeBox(0.0f, 0.0f, 0.0f, 16, 1, 2, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 4.0f, 3.0f,
                0.0f, 4.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[71].setRotationPoint(27.0f, -10.0f, -20.9f);
        this.bodyModel[72].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 2, 0.0f, 1.0f, 3.0f, 0.0f, 2.0f, -1.0f, 0.0f, 2.0f,
                -1.0f, 0.0f, -2.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[72].setRotationPoint(24.0f, -10.0f, 18.9f);
        this.bodyModel[73].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 2, 0.0f, -2.0f, 0.0f, 0.0f, 2.0f, -1.0f, 0.0f, 2.0f,
                -1.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f);
        this.bodyModel[73].setRotationPoint(24.0f, -10.0f, -20.9f);
        this.bodyModel[74].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 2, 0.0f, 2.0f, -1.0f, 0.0f, 1.0f, 3.0f, 0.0f, -2.0f,
                0.0f, 0.0f, 2.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[74].setRotationPoint(-25.0f, -10.0f, 18.9f);
        this.bodyModel[75].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 2, 0.0f, 2.0f, -1.0f, 0.0f, -2.0f, 0.0f, 0.0f, 1.0f,
                3.0f, 0.0f, 2.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[75].setRotationPoint(-25.0f, -10.0f, -20.9f);
        this.bodyModel[76].addShapeBox(0.0f, 0.0f, 0.0f, 16, 1, 2, 0.0f, 4.0f, 3.0f, 0.0f, 4.0f, 3.0f, 0.0f, 1.0f, 0.0f,
                0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[76].setRotationPoint(-43.0f, -10.0f, 18.9f);
        this.bodyModel[77].addShapeBox(0.0f, 0.0f, 0.0f, 16, 1, 2, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 4.0f, 3.0f,
                0.0f, 4.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[77].setRotationPoint(-43.0f, -10.0f, -20.9f);
        this.bodyModel[78].addShapeBox(0.0f, 0.0f, 0.0f, 1, 11, 2, 0.0f, 1.0f, 3.0f, 0.0f, 2.0f, -1.0f, 0.0f, 2.0f,
                -1.0f, 0.0f, -2.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[78].setRotationPoint(-46.0f, -10.0f, 18.9f);
        this.bodyModel[79].addShapeBox(0.0f, 0.0f, 0.0f, 1, 11, 2, 0.0f, -2.0f, 0.0f, 0.0f, 2.0f, -1.0f, 0.0f, 2.0f,
                -1.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f);
        this.bodyModel[79].setRotationPoint(-46.0f, -10.0f, -20.9f);
        this.bodyModel[80].addBox(0.0f, 0.0f, 0.0f, 2, 6, 40, 0.0f);
        this.bodyModel[80].setRotationPoint(45.0f, -12.0f, -20.0f);
        this.bodyModel[81].addShapeBox(0.0f, 0.0f, 0.0f, 4, 6, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[81].setRotationPoint(47.0f, -12.0f, 11.0f);
        this.bodyModel[82].addShapeBox(0.0f, 0.0f, 0.0f, 4, 6, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[82].setRotationPoint(47.0f, -12.0f, -12.0f);
        this.bodyModel[83].addBox(0.0f, 0.0f, 0.0f, 4, 1, 22, 0.0f);
        this.bodyModel[83].setRotationPoint(47.0f, -12.0f, -11.0f);
        this.bodyModel[84].addShapeBox(0.0f, 0.0f, 0.0f, 6, 9, 34, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f);
        this.bodyModel[84].setRotationPoint(19.0f, -15.0f, -17.0f);
        this.bodyModel[85].addShapeBox(0.0f, 0.0f, 0.0f, 5, 4, 12, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -1.8f, -2.0f, 0.0f,
                -1.8f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.bodyModel[85].setRotationPoint(19.0f, -17.0f, 3.0f);
        this.bodyModel[86].addShapeBox(0.0f, 0.0f, 0.0f, 9, 12, 6, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, -1.0f, -1.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f);
        this.bodyModel[86].setRotationPoint(16.0f, -15.0f, -3.0f);
        this.bodyModel[87].addBox(0.0f, -1.0f, -2.0f, 7, 2, 4, 0.0f);
        this.bodyModel[87].setRotationPoint(15.0f, -13.0f, 9.0f);
        this.bodyModel[87].rotateAngleZ = -0.3316126f;
        this.bodyModel[88].addBox(1.0f, -0.5f, -5.0f, 1, 1, 6, 0.0f);
        this.bodyModel[88].setRotationPoint(15.0f, -13.0f, 9.0f);
        this.bodyModel[88].rotateAngleX = -0.1570796f;
        this.bodyModel[88].rotateAngleZ = -0.3316126f;
        this.bodyModel[89].addShapeBox(0.0f, 0.0f, 0.0f, 23, 7, 6, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f,
                0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[89].setRotationPoint(1.0f, -5.0f, -3.0f);
        this.bodyModel[90].addBox(0.0f, 0.0f, 0.0f, 9, 3, 6, 0.0f);
        this.bodyModel[90].setRotationPoint(1.0f, -8.0f, -3.0f);
        this.bodyModel[91].addShapeBox(0.0f, 0.0f, 0.0f, 15, 6, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[91].setRotationPoint(3.0f, -12.0f, 15.0f);
        this.bodyModel[92].addShapeBox(0.0f, 0.0f, 0.0f, 15, 4, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[92].setRotationPoint(-18.0f, -12.0f, 15.0f);
        this.bodyModel[93].addShapeBox(0.0f, 0.0f, 0.0f, 15, 6, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[93].setRotationPoint(3.0f, -12.0f, -17.0f);
        this.bodyModel[94].addShapeBox(0.0f, 0.0f, 0.0f, 15, 4, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[94].setRotationPoint(-18.0f, -12.0f, -17.0f);
        this.bodyModel[95].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.7f, 0.0f, 0.0f,
                -1.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[95].setRotationPoint(-4.0f, -31.0f, 10.5f);
        this.bodyModel[96].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.7f, 0.0f, 0.0f,
                -1.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[96].setRotationPoint(-4.0f, -31.0f, -11.5f);
        this.bodyModel[97].addBox(0.0f, 0.0f, 0.0f, 41, 1, 1, 0.0f);
        this.bodyModel[97].setRotationPoint(-45.0f, -31.0f, 10.5f);
        this.bodyModel[98].addBox(0.0f, 0.0f, 0.0f, 41, 1, 1, 0.0f);
        this.bodyModel[98].setRotationPoint(-45.0f, -31.0f, -11.5f);
        this.bodyModel[99].addShapeBox(0.0f, 0.0f, 0.0f, 3, 2, 1, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[99].setRotationPoint(-48.0f, -31.0f, 10.5f);
        this.bodyModel[100].addShapeBox(0.0f, 0.0f, 0.0f, 3, 2, 1, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[100].setRotationPoint(-48.0f, -31.0f, -11.5f);
        this.bodyModel[101].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f,
                0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f,
                -0.1f);
        this.bodyModel[101].setRotationPoint(-19.0f, -30.0f, 10.5f);
        this.bodyModel[102].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f,
                0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f,
                -0.1f);
        this.bodyModel[102].setRotationPoint(-19.0f, -30.0f, -11.5f);
        this.bodyModel[103].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f,
                0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f,
                -0.1f);
        this.bodyModel[103].setRotationPoint(-33.0f, -30.0f, 10.5f);
        this.bodyModel[104].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f,
                0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f,
                -0.1f);
        this.bodyModel[104].setRotationPoint(-33.0f, -30.0f, -11.5f);
        this.bodyModel[105].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f,
                0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f,
                0.0f);
        this.bodyModel[105].setRotationPoint(47.5f, -1.0f, -10.0f);
        this.bodyModel[106].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f,
                0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f,
                0.0f);
        this.bodyModel[106].setRotationPoint(47.5f, -1.0f, 7.0f);
        this.bodyModel[107].addShapeBox(0.0f, 0.0f, 0.0f, 4, 5, 8, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f,
                -0.2222222f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -0.2222222f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f);
        this.bodyModel[107].setRotationPoint(47.0f, -12.0f, -20.0f);
        this.bodyModel[108].addShapeBox(0.0f, 0.0f, 0.0f, 4, 5, 8, 0.0f, 0.0f, 0.0f, 0.0f, -0.2222222f, 0.0f, 0.0f,
                -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2222222f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f);
        this.bodyModel[108].setRotationPoint(47.0f, -12.0f, 12.0f);
        this.bodyModel[109].addBox(0.0f, 0.0f, 0.0f, 4, 7, 3, 0.0f);
        this.bodyModel[109].setRotationPoint(-58.0f, -12.0f, -20.0f);
        this.bodyModel[110].addBox(0.0f, 0.0f, 0.0f, 4, 7, 3, 0.0f);
        this.bodyModel[110].setRotationPoint(-58.0f, -12.0f, 17.0f);
        this.bodyModel[111].addShapeBox(0.0f, 0.0f, 0.0f, 4, 5, 3, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[111].setRotationPoint(-58.0f, -17.0f, -20.0f);
        this.bodyModel[112].addShapeBox(0.0f, 0.0f, 0.0f, 4, 5, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[112].setRotationPoint(-58.0f, -17.0f, 17.0f);
        this.bodyModel[113].addBox(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f);
        this.bodyModel[113].setRotationPoint(46.5f, -1.5f, -17.5f);
        this.bodyModel[114].addBox(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f);
        this.bodyModel[114].setRotationPoint(46.5f, -1.5f, 15.5f);
        this.bodyModel[115].addBox(0.0f, 0.0f, 0.0f, 1, 3, 7, 0.0f);
        this.bodyModel[115].setRotationPoint(48.3f, -1.5f, -3.5f);
        this.bodyModel[116].addBox(0.0f, 0.0f, 0.0f, 1, 3, 8, 0.0f);
        this.bodyModel[116].setRotationPoint(-57.5f, -10.5f, -4.0f);
        this.bodyModel[117].addBox(0.0f, 0.0f, 0.0f, 15, 6, 12, 0.0f);
        this.bodyModel[117].setRotationPoint(0.0f, -4.0f, 3.0f);
        this.bodyModel[118].addBox(0.0f, 0.0f, 0.0f, 16, 2, 12, 0.0f);
        this.bodyModel[118].setRotationPoint(0.0f, -3.0f, 3.0f);
        this.bodyModel[118].rotateAngleZ = 1.745329f;
        this.bodyModel[119].addBox(0.0f, 0.0f, 0.0f, 4, 2, 6, 0.0f);
        this.bodyModel[119].setRotationPoint(-2.5f, -19.0f, 6.0f);
        this.bodyModel[119].rotateAngleZ = 1.48353f;
        this.bodyModel[120].addBox(0.0f, 0.0f, 0.0f, 15, 6, 12, 0.0f);
        this.bodyModel[120].setRotationPoint(0.0f, -4.0f, -15.0f);
        this.bodyModel[121].addBox(0.0f, 0.0f, 0.0f, 16, 2, 12, 0.0f);
        this.bodyModel[121].setRotationPoint(0.0f, -3.0f, -15.0f);
        this.bodyModel[121].rotateAngleZ = 1.745329f;
        this.bodyModel[122].addBox(0.0f, 0.0f, 0.0f, 4, 2, 6, 0.0f);
        this.bodyModel[122].setRotationPoint(-2.5f, -19.0f, -12.0f);
        this.bodyModel[122].rotateAngleZ = 1.48353f;
        this.bodyModel[123].addBox(0.0f, 0.0f, 0.0f, 15, 6, 12, 0.0f);
        this.bodyModel[123].setRotationPoint(-21.0f, -4.0f, 3.0f);
        this.bodyModel[124].addBox(0.0f, 0.0f, 0.0f, 16, 2, 12, 0.0f);
        this.bodyModel[124].setRotationPoint(-21.0f, -3.0f, 3.0f);
        this.bodyModel[124].rotateAngleZ = 1.745329f;
        this.bodyModel[125].addBox(0.0f, 0.0f, 0.0f, 4, 2, 6, 0.0f);
        this.bodyModel[125].setRotationPoint(-23.5f, -19.0f, 6.0f);
        this.bodyModel[125].rotateAngleZ = 1.48353f;
        this.bodyModel[126].addBox(0.0f, 0.0f, 0.0f, 10, 2, 2, 0.0f);
        this.bodyModel[126].setRotationPoint(-21.0f, -9.0f, 2.0f);
        this.bodyModel[127].addBox(0.0f, 0.0f, 0.0f, 15, 6, 12, 0.0f);
        this.bodyModel[127].setRotationPoint(-21.0f, -4.0f, -15.0f);
        this.bodyModel[128].addBox(0.0f, 0.0f, 0.0f, 16, 2, 12, 0.0f);
        this.bodyModel[128].setRotationPoint(-21.0f, -3.0f, -15.0f);
        this.bodyModel[128].rotateAngleZ = 1.745329f;
        this.bodyModel[129].addBox(0.0f, 0.0f, 0.0f, 4, 2, 6, 0.0f);
        this.bodyModel[129].setRotationPoint(-23.5f, -19.0f, -12.0f);
        this.bodyModel[129].rotateAngleZ = 1.48353f;
        this.bodyModel[130].addBox(0.0f, 0.0f, 0.0f, 10, 2, 2, 0.0f);
        this.bodyModel[130].setRotationPoint(-21.0f, -9.0f, -4.0f);
        this.bodyModel[131].addBox(0.0f, 0.0f, 0.0f, 15, 3, 26, 0.0f);
        this.bodyModel[131].setRotationPoint(-42.0f, -4.0f, -13.0f);
        this.bodyModel[132].addBox(0.0f, 0.0f, 0.0f, 16, 2, 26, 0.0f);
        this.bodyModel[132].setRotationPoint(-42.0f, -3.0f, -13.0f);
        this.bodyModel[132].rotateAngleZ = 1.745329f;
        this.bodyModel[133].addBox(0.0f, 0.0f, 0.0f, 4, 2, 6, 0.0f);
        this.bodyModel[133].setRotationPoint(-44.5f, -19.0f, -9.0f);
        this.bodyModel[133].rotateAngleZ = 1.48353f;
        this.bodyModel[134].addBox(0.0f, 0.0f, 0.0f, 4, 2, 6, 0.0f);
        this.bodyModel[134].setRotationPoint(-44.5f, -19.0f, 3.0f);
        this.bodyModel[134].rotateAngleZ = 1.48353f;
        this.bodyModel[135].addShapeBox(0.0f, 0.0f, 0.0f, 15, 1, 4, 0.0f, -2.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f,
                0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[135].setRotationPoint(-60.0f, -5.0f, -21.0f);
        this.bodyModel[136].addShapeBox(0.0f, 0.0f, 0.0f, 15, 1, 4, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, -1.0f, -2.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.bodyModel[136].setRotationPoint(-60.0f, -5.0f, 17.0f);
        this.bodyModel[137].addBox(0.0f, 0.0f, 0.0f, 15, 3, 4, 0.0f);
        this.bodyModel[137].setRotationPoint(-60.0f, -4.0f, -21.0f);
        this.bodyModel[138].addBox(0.0f, 0.0f, 0.0f, 15, 3, 4, 0.0f);
        this.bodyModel[138].setRotationPoint(-60.0f, -4.0f, 17.0f);
        this.bodyModel[139].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 34, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[139].setRotationPoint(-60.0f, -2.0f, -17.0f);
        this.bodyModel[140].addBox(0.0f, 0.0f, 0.0f, 15, 2, 42, 0.0f);
        this.bodyModel[140].setRotationPoint(-60.0f, -1.0f, -21.0f);
        this.bodyModel[141].addShapeBox(0.0f, 0.0f, 0.0f, 15, 3, 42, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -2.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, -1.0f, -2.0f,
                -3.0f);
        this.bodyModel[141].setRotationPoint(-60.0f, 1.0f, -21.0f);
        this.bodyModel[142].addShapeBox(0.0f, 0.0f, 0.0f, 7, 5, 3, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f,
                -1.333333f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -4.333333f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f);
        this.bodyModel[142].setRotationPoint(45.0f, -3.0f, -21.0f);
        this.bodyModel[143].addShapeBox(0.0f, 0.0f, 0.0f, 7, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -3.733333f, 0.0f, 0.0f,
                -3.06666f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.33333f, 0.0f, 0.0f, -3.66666f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f);
        this.bodyModel[143].setRotationPoint(45.0f, 1.0f, -18.0f);
        this.bodyModel[144].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -1.33333f, 0.0f, 0.0f,
                -0.666666f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.933333f, 0.0f, 0.0f, -1.266666f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[144].setRotationPoint(49.0f, -3.0f, -18.0f);
        this.bodyModel[145].addShapeBox(0.0f, 0.0f, 0.0f, 7, 5, 3, 0.0f, 0.0f, 0.0f, 0.0f, -0.666666f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.666666f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.bodyModel[145].setRotationPoint(45.0f, -3.0f, -15.0f);
        this.bodyModel[146].addShapeBox(0.0f, 0.0f, 0.0f, 7, 5, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[146].setRotationPoint(45.0f, -3.0f, -12.0f);
        this.bodyModel[147].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[147].setRotationPoint(49.0f, -3.0f, -10.0f);
        this.bodyModel[148].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -2.4f, 0.0f, 0.0f, -2.4f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[148].setRotationPoint(49.0f, 1.0f, -10.0f);
        this.bodyModel[149].addShapeBox(0.0f, 0.0f, 0.0f, 7, 5, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[149].setRotationPoint(45.0f, -3.0f, -7.0f);
        this.bodyModel[150].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[150].setRotationPoint(49.0f, -3.0f, -4.0f);
        this.bodyModel[151].addShapeBox(0.0f, 0.0f, 0.0f, 7, 5, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[151].setRotationPoint(45.0f, -3.0f, 4.0f);
        this.bodyModel[152].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -2.4f, 0.0f, 0.0f, -2.4f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[152].setRotationPoint(49.0f, 1.0f, 7.0f);
        this.bodyModel[153].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[153].setRotationPoint(49.0f, -3.0f, 7.0f);
        this.bodyModel[154].addShapeBox(0.0f, 0.0f, 0.0f, 7, 5, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[154].setRotationPoint(45.0f, -3.0f, 10.0f);
        this.bodyModel[155].addShapeBox(0.0f, 0.0f, 0.0f, 7, 5, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.666666f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.666666f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.bodyModel[155].setRotationPoint(45.0f, -3.0f, 12.0f);
        this.bodyModel[156].addShapeBox(0.0f, 0.0f, 0.0f, 7, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -3.06666f, 0.0f, 0.0f,
                -3.733333f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.66666f, 0.0f, 0.0f, -4.33333f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[156].setRotationPoint(45.0f, 1.0f, 15.0f);
        this.bodyModel[157].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -0.666666f, 0.0f, 0.0f,
                -1.33333f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.266666f, 0.0f, 0.0f, -1.933333f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[157].setRotationPoint(49.0f, -3.0f, 15.0f);
        this.bodyModel[158].addShapeBox(0.0f, 0.0f, 0.0f, 7, 5, 3, 0.0f, 0.0f, 0.0f, 0.0f, -1.333333f, 0.0f, 0.0f,
                -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.333333f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f);
        this.bodyModel[158].setRotationPoint(45.0f, -3.0f, 18.0f);
        this.bodyModel[159].addBox(0.0f, 0.0f, 0.0f, 4, 5, 20, 0.0f);
        this.bodyModel[159].setRotationPoint(45.0f, -3.0f, -10.0f);
        this.bodyModel[160].addShapeBox(0.0f, 0.0f, 0.0f, 7, 3, 9, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[160].setRotationPoint(45.0f, -6.0f, -21.0f);
        this.bodyModel[161].addShapeBox(0.0f, 0.0f, 0.0f, 7, 3, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[161].setRotationPoint(45.0f, -6.0f, 12.0f);
        this.bodyModel[162].addShapeBox(0.0f, 0.0f, 0.0f, 7, 1, 9, 0.0f, 0.0f, 0.0f, -1.0f, -3.0f, 0.0f, -1.0f, -1.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[162].setRotationPoint(45.0f, -7.0f, -21.0f);
        this.bodyModel[163].addShapeBox(0.0f, 0.0f, 0.0f, 7, 1, 9, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -3.0f,
                0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.bodyModel[163].setRotationPoint(45.0f, -7.0f, 12.0f);
        this.bodyModel[164].addBox(0.0f, 0.0f, 0.0f, 7, 3, 24, 0.0f);
        this.bodyModel[164].setRotationPoint(45.0f, -6.0f, -12.0f);
        this.bodyModel[165].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f,
                -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f,
                0.0f);
        this.bodyModel[165].setRotationPoint(21.0f, -19.0f, 18.0f);
        this.bodyModel[165].rotateAngleY = 0.2268928f;
        this.bodyModel[166].addShapeBox(0.0f, 0.0f, -4.0f, 2, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f,
                -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.bodyModel[166].setRotationPoint(21.0f, -19.0f, -18.0f);
        this.bodyModel[166].rotateAngleY = -0.2268928f;
        this.bodyModel[167].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 5, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.5f, -0.5f, -0.5f,
                -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0.0f, 0.0f,
                0.0f);
        this.bodyModel[167].setRotationPoint(8.5f, -27.0f, -2.5f);
        this.bodyModel[168].addBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f);
        this.bodyModel[168].setRotationPoint(-1.0f, -14.0f, 17.5f);
        this.bodyModel[169].addBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f);
        this.bodyModel[169].setRotationPoint(-20.0f, -14.0f, 17.5f);
        this.bodyModel[170].addBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f);
        this.bodyModel[170].setRotationPoint(-1.0f, -14.0f, -20.5f);
        this.bodyModel[171].addBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f);
        this.bodyModel[171].setRotationPoint(-20.0f, -14.0f, -20.5f);
        this.bodyModel[172].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, 1.5f, 0.0f, -0.3f, -2.3f, 0.0f, -0.3f, -2.3f,
                0.0f, -0.3f, 1.5f, 0.0f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[172].setRotationPoint(9.0f, -30.5f, 5.5f);
        this.bodyModel[174].addShapeBox(0.0f, 0.0f, 0.0f, 1, 10, 34, 0.0f, -6.2f, 0.0f, -4.0f, 5.4f, 0.0f, -4.0f, 5.4f,
                0.0f, -4.0f, -6.2f, 0.0f, -4.0f, -0.2f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.2f, 0.0f,
                0.0f);
        this.bodyModel[174].setRotationPoint(-58.0f, -27.0f, -17.0f);
        this.bodyModel[175].addShapeBox(0.0f, 0.0f, 0.0f, 34, 10, 1, 0.0f, -5.0f, 0.0f, -4.7f, 2.0f, 0.0f, -4.7f, 2.0f,
                0.0f, 3.9f, -5.0f, 0.0f, 3.9f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f,
                -0.6f);
        this.bodyModel[175].setRotationPoint(-57.0f, -27.0f, -18.0f);
        this.bodyModel[177].addShapeBox(0.0f, 0.0f, 0.0f, 34, 10, 1, 0.0f, -5.0f, 0.0f, 3.9f, 2.0f, 0.0f, 3.9f, 2.0f,
                0.0f, -4.7f, -5.0f, 0.0f, -4.7f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f,
                -0.2f);
        this.bodyModel[177].setRotationPoint(-57.0f, -27.0f, 17.0f);
        this.bodyModel[179].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 3, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f,
                0.0f);
        this.bodyModel[179].setRotationPoint(44.0f, -3.0f, 15.0f);
        this.bodyModel[180].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 3, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f,
                0.0f);
        this.bodyModel[180].setRotationPoint(44.0f, -3.0f, -18.0f);
        this.bodyModel[181].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 8, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[181].setRotationPoint(45.0f, 2.0f, -20.0f);
        this.bodyModel[182].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[182].setRotationPoint(45.0f, 2.0f, 12.0f);
        this.bodyModel[183].addBox(0.0f, 0.0f, 0.0f, 5, 2, 26, 0.0f);
        this.bodyModel[183].setRotationPoint(1.0f, -32.0f, -13.0f);
        this.bodyModel[184].addBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f);
        this.bodyModel[184].setRotationPoint(1.0f, -30.0f, 11.0f);
        this.bodyModel[185].addBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f);
        this.bodyModel[185].setRotationPoint(1.0f, -30.0f, -12.0f);
        (this.leftFrontWheelModel = new ModelRendererTurbo[19])[0] = new ModelRendererTurbo(this, 50, 190,
                this.textureX, this.textureY);
        this.leftFrontWheelModel[1] = new ModelRendererTurbo(this, 75, 190, this.textureX, this.textureY);
        this.leftFrontWheelModel[2] = new ModelRendererTurbo(this, 100, 190, this.textureX, this.textureY);
        this.leftFrontWheelModel[3] = new ModelRendererTurbo(this, 125, 190, this.textureX, this.textureY);
        this.leftFrontWheelModel[4] = new ModelRendererTurbo(this, 150, 190, this.textureX, this.textureY);
        this.leftFrontWheelModel[5] = new ModelRendererTurbo(this, 175, 190, this.textureX, this.textureY);
        this.leftFrontWheelModel[6] = new ModelRendererTurbo(this, 200, 190, this.textureX, this.textureY);
        this.leftFrontWheelModel[7] = new ModelRendererTurbo(this, 225, 190, this.textureX, this.textureY);
        this.leftFrontWheelModel[8] = new ModelRendererTurbo(this, 250, 190, this.textureX, this.textureY);
        this.leftFrontWheelModel[9] = new ModelRendererTurbo(this, 275, 190, this.textureX, this.textureY);
        this.leftFrontWheelModel[10] = new ModelRendererTurbo(this, 300, 190, this.textureX, this.textureY);
        this.leftFrontWheelModel[11] = new ModelRendererTurbo(this, 325, 190, this.textureX, this.textureY);
        this.leftFrontWheelModel[12] = new ModelRendererTurbo(this, 350, 190, this.textureX, this.textureY);
        this.leftFrontWheelModel[13] = new ModelRendererTurbo(this, 375, 190, this.textureX, this.textureY);
        this.leftFrontWheelModel[14] = new ModelRendererTurbo(this, 50, 205, this.textureX, this.textureY);
        this.leftFrontWheelModel[15] = new ModelRendererTurbo(this, 60, 205, this.textureX, this.textureY);
        this.leftFrontWheelModel[16] = new ModelRendererTurbo(this, 75, 205, this.textureX, this.textureY);
        this.leftFrontWheelModel[17] = new ModelRendererTurbo(this, 85, 205, this.textureX, this.textureY);
        this.leftFrontWheelModel[18] = new ModelRendererTurbo(this, 95, 205, this.textureX, this.textureY);
        this.leftFrontWheelModel[0].addShapeBox(-8.5f, -2.5f, -3.0f, 4, 5, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f,
                0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.leftFrontWheelModel[0].setRotationPoint(35.0f, 1.5f, -18.0f);
        this.leftFrontWheelModel[1].addShapeBox(-8.5f, -6.5f, -3.0f, 4, 4, 6, 0.0f, -2.0f, 0.0f, 0.0f, 1.0f, -3.0f,
                0.0f, 1.0f, -3.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f,
                0.0f, 0.0f);
        this.leftFrontWheelModel[1].setRotationPoint(35.0f, 1.5f, -18.0f);
        this.leftFrontWheelModel[2].addShapeBox(-6.5f, -8.5f, -3.0f, 4, 4, 6, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -3.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -3.0f, 1.0f,
                0.0f);
        this.leftFrontWheelModel[2].setRotationPoint(35.0f, 1.5f, -18.0f);
        this.leftFrontWheelModel[3].addShapeBox(-2.5f, -8.5f, -3.0f, 5, 4, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f,
                0.0f, 0.0f);
        this.leftFrontWheelModel[3].setRotationPoint(35.0f, 1.5f, -18.0f);
        this.leftFrontWheelModel[4].addShapeBox(2.5f, -8.5f, -3.0f, 4, 4, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f,
                0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -3.0f, 1.0f, 0.0f, -3.0f, 1.0f, 0.0f, 1.0f, 0.0f,
                0.0f);
        this.leftFrontWheelModel[4].setRotationPoint(35.0f, 1.5f, -18.0f);
        this.leftFrontWheelModel[5].addShapeBox(4.5f, -6.5f, -3.0f, 4, 4, 6, 0.0f, 1.0f, -3.0f, 0.0f, -2.0f, 0.0f, 0.0f,
                -2.0f, 0.0f, 0.0f, 1.0f, -3.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f,
                0.0f);
        this.leftFrontWheelModel[5].setRotationPoint(35.0f, 1.5f, -18.0f);
        this.leftFrontWheelModel[6].addShapeBox(4.5f, -2.5f, -3.0f, 4, 5, 6, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f,
                0.0f);
        this.leftFrontWheelModel[6].setRotationPoint(35.0f, 1.5f, -18.0f);
        this.leftFrontWheelModel[7].addShapeBox(4.5f, 2.5f, -3.0f, 4, 4, 6, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, -3.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 1.0f,
                -3.0f, 0.0f);
        this.leftFrontWheelModel[7].setRotationPoint(35.0f, 1.5f, -18.0f);
        this.leftFrontWheelModel[8].addShapeBox(2.5f, 4.5f, -3.0f, 4, 4, 6, 0.0f, 1.0f, 0.0f, 0.0f, -3.0f, 1.0f, 0.0f,
                -3.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.leftFrontWheelModel[8].setRotationPoint(35.0f, 1.5f, -18.0f);
        this.leftFrontWheelModel[9].addShapeBox(-2.5f, 4.5f, -3.0f, 5, 4, 6, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f,
                -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.leftFrontWheelModel[9].setRotationPoint(35.0f, 1.5f, -18.0f);
        this.leftFrontWheelModel[10].addShapeBox(-6.5f, 4.5f, -3.0f, 4, 4, 6, 0.0f, -3.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f,
                1.0f, 0.0f, 0.0f, -3.0f, 1.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f,
                0.0f);
        this.leftFrontWheelModel[10].setRotationPoint(35.0f, 1.5f, -18.0f);
        this.leftFrontWheelModel[11].addShapeBox(-8.5f, 2.5f, -3.0f, 4, 4, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f,
                0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 1.0f, -3.0f, 0.0f, 1.0f, -3.0f, 0.0f, -2.0f,
                0.0f, 0.0f);
        this.leftFrontWheelModel[11].setRotationPoint(35.0f, 1.5f, -18.0f);
        this.leftFrontWheelModel[12].addShape3D(1.5f, -1.5f, -3.0f,
                new Shape2D(new Coord2D[]{new Coord2D(1.0, 0.0, 1, 0), new Coord2D(2.0, 0.0, 2, 0),
                        new Coord2D(3.0, 1.0, 3, 1), new Coord2D(3.0, 2.0, 3, 2), new Coord2D(2.0, 3.0, 2, 3),
                        new Coord2D(1.0, 3.0, 1, 3), new Coord2D(0.0, 2.0, 0, 2), new Coord2D(0.0, 1.0, 0, 1)}),
                3.0f, 3, 3, 12, 3, 0, new float[]{2.0f, 1.0f, 2.0f, 1.0f, 2.0f, 1.0f, 2.0f, 1.0f});
        this.leftFrontWheelModel[12].setRotationPoint(35.0f, 1.5f, -21.0f);
        this.leftFrontWheelModel[13].addShape3D(3.0f, -3.0f, 0.0f,
                new Shape2D(new Coord2D[]{new Coord2D(1.0, 0.0, 1, 0), new Coord2D(5.0, 0.0, 5, 0),
                        new Coord2D(6.0, 1.0, 6, 1), new Coord2D(6.0, 5.0, 6, 5), new Coord2D(5.0, 6.0, 5, 6),
                        new Coord2D(1.0, 6.0, 1, 6), new Coord2D(0.0, 5.0, 0, 5), new Coord2D(0.0, 1.0, 0, 1)}),
                1.0f, 6, 6, 24, 1, 0, new float[]{2.0f, 4.0f, 2.0f, 4.0f, 2.0f, 4.0f, 2.0f, 4.0f});
        this.leftFrontWheelModel[13].setRotationPoint(35.0f, 1.5f, -18.5f);
        this.leftFrontWheelModel[14].addShapeBox(-1.5f, -6.0f, -2.5f, 3, 6, 1, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f,
                0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f);
        this.leftFrontWheelModel[14].setRotationPoint(35.0f, 1.5f, -18.0f);
        this.leftFrontWheelModel[15].addShapeBox(-6.0f, -1.5f, -2.5f, 6, 3, 1, 0.0f, 0.0f, 2.0f, 0.0f, 1.0f, 0.0f, 0.0f,
                1.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f,
                0.0f);
        this.leftFrontWheelModel[15].setRotationPoint(35.0f, 1.5f, -18.0f);
        this.leftFrontWheelModel[16].addShapeBox(-1.5f, 0.0f, -2.5f, 3, 6, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f,
                0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 4.0f, 0.0f,
                0.0f);
        this.leftFrontWheelModel[16].setRotationPoint(35.0f, 1.5f, -18.0f);
        this.leftFrontWheelModel[17].addShapeBox(-1.5f, 0.0f, -2.5f, 3, 6, 1, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -5.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, -5.0f, 0.0f,
                0.0f);
        this.leftFrontWheelModel[17].setRotationPoint(35.0f, 1.5f, -18.0f);
        this.leftFrontWheelModel[18].addShapeBox(0.0f, -1.5f, -2.5f, 6, 3, 1, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f,
                0.0f, 2.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.leftFrontWheelModel[18].setRotationPoint(35.0f, 1.5f, -18.0f);
        (this.rightFrontWheelModel = new ModelRendererTurbo[19])[0] = new ModelRendererTurbo(this, 50, 190,
                this.textureX, this.textureY);
        this.rightFrontWheelModel[1] = new ModelRendererTurbo(this, 75, 190, this.textureX, this.textureY);
        this.rightFrontWheelModel[2] = new ModelRendererTurbo(this, 100, 190, this.textureX, this.textureY);
        this.rightFrontWheelModel[3] = new ModelRendererTurbo(this, 125, 190, this.textureX, this.textureY);
        this.rightFrontWheelModel[4] = new ModelRendererTurbo(this, 150, 190, this.textureX, this.textureY);
        this.rightFrontWheelModel[5] = new ModelRendererTurbo(this, 175, 190, this.textureX, this.textureY);
        this.rightFrontWheelModel[6] = new ModelRendererTurbo(this, 200, 190, this.textureX, this.textureY);
        this.rightFrontWheelModel[7] = new ModelRendererTurbo(this, 225, 190, this.textureX, this.textureY);
        this.rightFrontWheelModel[8] = new ModelRendererTurbo(this, 250, 190, this.textureX, this.textureY);
        this.rightFrontWheelModel[9] = new ModelRendererTurbo(this, 275, 190, this.textureX, this.textureY);
        this.rightFrontWheelModel[10] = new ModelRendererTurbo(this, 300, 190, this.textureX,
                this.textureY);
        this.rightFrontWheelModel[11] = new ModelRendererTurbo(this, 325, 190, this.textureX,
                this.textureY);
        this.rightFrontWheelModel[12] = new ModelRendererTurbo(this, 350, 190, this.textureX,
                this.textureY);
        this.rightFrontWheelModel[13] = new ModelRendererTurbo(this, 375, 190, this.textureX,
                this.textureY);
        this.rightFrontWheelModel[14] = new ModelRendererTurbo(this, 50, 205, this.textureX, this.textureY);
        this.rightFrontWheelModel[15] = new ModelRendererTurbo(this, 60, 205, this.textureX, this.textureY);
        this.rightFrontWheelModel[16] = new ModelRendererTurbo(this, 75, 205, this.textureX, this.textureY);
        this.rightFrontWheelModel[17] = new ModelRendererTurbo(this, 85, 205, this.textureX, this.textureY);
        this.rightFrontWheelModel[18] = new ModelRendererTurbo(this, 95, 205, this.textureX, this.textureY);
        this.rightFrontWheelModel[0].addShapeBox(-8.5f, -2.5f, -3.0f, 4, 5, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f,
                0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f,
                0.0f, 0.0f);
        this.rightFrontWheelModel[0].setRotationPoint(35.0f, 1.5f, 18.0f);
        this.rightFrontWheelModel[1].addShapeBox(-8.5f, -6.5f, -3.0f, 4, 4, 6, 0.0f, -2.0f, 0.0f, 0.0f, 1.0f, -3.0f,
                0.0f, 1.0f, -3.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f,
                0.0f, 0.0f);
        this.rightFrontWheelModel[1].setRotationPoint(35.0f, 1.5f, 18.0f);
        this.rightFrontWheelModel[2].addShapeBox(-6.5f, -8.5f, -3.0f, 4, 4, 6, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -3.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -3.0f,
                1.0f, 0.0f);
        this.rightFrontWheelModel[2].setRotationPoint(35.0f, 1.5f, 18.0f);
        this.rightFrontWheelModel[3].addShapeBox(-2.5f, -8.5f, -3.0f, 5, 4, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f,
                0.0f, 0.0f);
        this.rightFrontWheelModel[3].setRotationPoint(35.0f, 1.5f, 18.0f);
        this.rightFrontWheelModel[4].addShapeBox(2.5f, -8.5f, -3.0f, 4, 4, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f,
                0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -3.0f, 1.0f, 0.0f, -3.0f, 1.0f, 0.0f, 1.0f, 0.0f,
                0.0f);
        this.rightFrontWheelModel[4].setRotationPoint(35.0f, 1.5f, 18.0f);
        this.rightFrontWheelModel[5].addShapeBox(4.5f, -6.5f, -3.0f, 4, 4, 6, 0.0f, 1.0f, -3.0f, 0.0f, -2.0f, 0.0f,
                0.0f, -2.0f, 0.0f, 0.0f, 1.0f, -3.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                1.0f, 0.0f);
        this.rightFrontWheelModel[5].setRotationPoint(35.0f, 1.5f, 18.0f);
        this.rightFrontWheelModel[6].addShapeBox(4.5f, -2.5f, -3.0f, 4, 5, 6, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f,
                0.0f);
        this.rightFrontWheelModel[6].setRotationPoint(35.0f, 1.5f, 18.0f);
        this.rightFrontWheelModel[7].addShapeBox(4.5f, 2.5f, -3.0f, 4, 4, 6, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, -3.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 1.0f,
                -3.0f, 0.0f);
        this.rightFrontWheelModel[7].setRotationPoint(35.0f, 1.5f, 18.0f);
        this.rightFrontWheelModel[8].addShapeBox(2.5f, 4.5f, -3.0f, 4, 4, 6, 0.0f, 1.0f, 0.0f, 0.0f, -3.0f, 1.0f, 0.0f,
                -3.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.rightFrontWheelModel[8].setRotationPoint(35.0f, 1.5f, 18.0f);
        this.rightFrontWheelModel[9].addShapeBox(-2.5f, 4.5f, -3.0f, 5, 4, 6, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f,
                0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f);
        this.rightFrontWheelModel[9].setRotationPoint(35.0f, 1.5f, 18.0f);
        this.rightFrontWheelModel[10].addShapeBox(-6.5f, 4.5f, -3.0f, 4, 4, 6, 0.0f, -3.0f, 1.0f, 0.0f, 1.0f, 0.0f,
                0.0f, 1.0f, 0.0f, 0.0f, -3.0f, 1.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                -2.0f, 0.0f);
        this.rightFrontWheelModel[10].setRotationPoint(35.0f, 1.5f, 18.0f);
        this.rightFrontWheelModel[11].addShapeBox(-8.5f, 2.5f, -3.0f, 4, 4, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f,
                0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 1.0f, -3.0f, 0.0f, 1.0f, -3.0f, 0.0f, -2.0f,
                0.0f, 0.0f);
        this.rightFrontWheelModel[11].setRotationPoint(35.0f, 1.5f, 18.0f);
        this.rightFrontWheelModel[12].addShape3D(1.5f, -1.5f, -3.0f,
                new Shape2D(new Coord2D[]{new Coord2D(1.0, 0.0, 1, 0), new Coord2D(2.0, 0.0, 2, 0),
                        new Coord2D(3.0, 1.0, 3, 1), new Coord2D(3.0, 2.0, 3, 2), new Coord2D(2.0, 3.0, 2, 3),
                        new Coord2D(1.0, 3.0, 1, 3), new Coord2D(0.0, 2.0, 0, 2), new Coord2D(0.0, 1.0, 0, 1)}),
                3.0f, 3, 3, 12, 3, 0, new float[]{2.0f, 1.0f, 2.0f, 1.0f, 2.0f, 1.0f, 2.0f, 1.0f});
        this.rightFrontWheelModel[12].setRotationPoint(35.0f, 1.5f, 18.0f);
        this.rightFrontWheelModel[13].addShape3D(3.0f, -3.0f, 0.0f,
                new Shape2D(new Coord2D[]{new Coord2D(1.0, 0.0, 1, 0), new Coord2D(5.0, 0.0, 5, 0),
                        new Coord2D(6.0, 1.0, 6, 1), new Coord2D(6.0, 5.0, 6, 5), new Coord2D(5.0, 6.0, 5, 6),
                        new Coord2D(1.0, 6.0, 1, 6), new Coord2D(0.0, 5.0, 0, 5), new Coord2D(0.0, 1.0, 0, 1)}),
                1.0f, 6, 6, 24, 1, 0, new float[]{2.0f, 4.0f, 2.0f, 4.0f, 2.0f, 4.0f, 2.0f, 4.0f});
        this.rightFrontWheelModel[13].setRotationPoint(35.0f, 1.5f, 19.5f);
        this.rightFrontWheelModel[14].addShapeBox(-1.5f, -6.0f, 1.5f, 3, 6, 1, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f,
                0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f);
        this.rightFrontWheelModel[14].setRotationPoint(35.0f, 1.5f, 18.0f);
        this.rightFrontWheelModel[15].addShapeBox(-6.0f, -1.5f, 1.5f, 6, 3, 1, 0.0f, 0.0f, 2.0f, 0.0f, 1.0f, 0.0f, 0.0f,
                1.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f,
                0.0f);
        this.rightFrontWheelModel[15].setRotationPoint(35.0f, 1.5f, 18.0f);
        this.rightFrontWheelModel[16].addShapeBox(-1.5f, 0.0f, 1.5f, 3, 6, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f,
                0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 4.0f, 0.0f,
                0.0f);
        this.rightFrontWheelModel[16].setRotationPoint(35.0f, 1.5f, 18.0f);
        this.rightFrontWheelModel[17].addShapeBox(-1.5f, 0.0f, 1.5f, 3, 6, 1, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -5.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, -5.0f, 0.0f,
                0.0f);
        this.rightFrontWheelModel[17].setRotationPoint(35.0f, 1.5f, 18.0f);
        this.rightFrontWheelModel[18].addShapeBox(0.0f, -1.5f, 1.5f, 6, 3, 1, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f,
                0.0f, 2.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.rightFrontWheelModel[18].setRotationPoint(35.0f, 1.5f, 18.0f);
        (this.leftBackWheelModel = new ModelRendererTurbo[19])[0] = new ModelRendererTurbo(this, 50, 190,
                this.textureX, this.textureY);
        this.leftBackWheelModel[1] = new ModelRendererTurbo(this, 75, 190, this.textureX, this.textureY);
        this.leftBackWheelModel[2] = new ModelRendererTurbo(this, 100, 190, this.textureX, this.textureY);
        this.leftBackWheelModel[3] = new ModelRendererTurbo(this, 125, 190, this.textureX, this.textureY);
        this.leftBackWheelModel[4] = new ModelRendererTurbo(this, 150, 190, this.textureX, this.textureY);
        this.leftBackWheelModel[5] = new ModelRendererTurbo(this, 175, 190, this.textureX, this.textureY);
        this.leftBackWheelModel[6] = new ModelRendererTurbo(this, 200, 190, this.textureX, this.textureY);
        this.leftBackWheelModel[7] = new ModelRendererTurbo(this, 225, 190, this.textureX, this.textureY);
        this.leftBackWheelModel[8] = new ModelRendererTurbo(this, 250, 190, this.textureX, this.textureY);
        this.leftBackWheelModel[9] = new ModelRendererTurbo(this, 275, 190, this.textureX, this.textureY);
        this.leftBackWheelModel[10] = new ModelRendererTurbo(this, 300, 190, this.textureX, this.textureY);
        this.leftBackWheelModel[11] = new ModelRendererTurbo(this, 325, 190, this.textureX, this.textureY);
        this.leftBackWheelModel[12] = new ModelRendererTurbo(this, 350, 190, this.textureX, this.textureY);
        this.leftBackWheelModel[13] = new ModelRendererTurbo(this, 375, 190, this.textureX, this.textureY);
        this.leftBackWheelModel[14] = new ModelRendererTurbo(this, 50, 205, this.textureX, this.textureY);
        this.leftBackWheelModel[15] = new ModelRendererTurbo(this, 60, 205, this.textureX, this.textureY);
        this.leftBackWheelModel[16] = new ModelRendererTurbo(this, 75, 205, this.textureX, this.textureY);
        this.leftBackWheelModel[17] = new ModelRendererTurbo(this, 85, 205, this.textureX, this.textureY);
        this.leftBackWheelModel[18] = new ModelRendererTurbo(this, 95, 205, this.textureX, this.textureY);
        this.leftBackWheelModel[0].addShapeBox(-8.5f, -2.5f, -3.0f, 4, 5, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f,
                0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.leftBackWheelModel[0].setRotationPoint(-35.0f, 1.5f, -18.0f);
        this.leftBackWheelModel[1].addShapeBox(-8.5f, -6.5f, -3.0f, 4, 4, 6, 0.0f, -2.0f, 0.0f, 0.0f, 1.0f, -3.0f, 0.0f,
                1.0f, -3.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.leftBackWheelModel[1].setRotationPoint(-35.0f, 1.5f, -18.0f);
        this.leftBackWheelModel[2].addShapeBox(-6.5f, -8.5f, -3.0f, 4, 4, 6, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -3.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -3.0f, 1.0f,
                0.0f);
        this.leftBackWheelModel[2].setRotationPoint(-35.0f, 1.5f, -18.0f);
        this.leftBackWheelModel[3].addShapeBox(-2.5f, -8.5f, -3.0f, 5, 4, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f,
                0.0f, 0.0f);
        this.leftBackWheelModel[3].setRotationPoint(-35.0f, 1.5f, -18.0f);
        this.leftBackWheelModel[4].addShapeBox(2.5f, -8.5f, -3.0f, 4, 4, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f,
                0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -3.0f, 1.0f, 0.0f, -3.0f, 1.0f, 0.0f, 1.0f, 0.0f,
                0.0f);
        this.leftBackWheelModel[4].setRotationPoint(-35.0f, 1.5f, -18.0f);
        this.leftBackWheelModel[5].addShapeBox(4.5f, -6.5f, -3.0f, 4, 4, 6, 0.0f, 1.0f, -3.0f, 0.0f, -2.0f, 0.0f, 0.0f,
                -2.0f, 0.0f, 0.0f, 1.0f, -3.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f,
                0.0f);
        this.leftBackWheelModel[5].setRotationPoint(-35.0f, 1.5f, -18.0f);
        this.leftBackWheelModel[6].addShapeBox(4.5f, -2.5f, -3.0f, 4, 5, 6, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f,
                0.0f);
        this.leftBackWheelModel[6].setRotationPoint(-35.0f, 1.5f, -18.0f);
        this.leftBackWheelModel[7].addShapeBox(4.5f, 2.5f, -3.0f, 4, 4, 6, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, -3.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 1.0f,
                -3.0f, 0.0f);
        this.leftBackWheelModel[7].setRotationPoint(-35.0f, 1.5f, -18.0f);
        this.leftBackWheelModel[8].addShapeBox(2.5f, 4.5f, -3.0f, 4, 4, 6, 0.0f, 1.0f, 0.0f, 0.0f, -3.0f, 1.0f, 0.0f,
                -3.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.leftBackWheelModel[8].setRotationPoint(-35.0f, 1.5f, -18.0f);
        this.leftBackWheelModel[9].addShapeBox(-2.5f, 4.5f, -3.0f, 5, 4, 6, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f,
                -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.leftBackWheelModel[9].setRotationPoint(-35.0f, 1.5f, -18.0f);
        this.leftBackWheelModel[10].addShapeBox(-6.5f, 4.5f, -3.0f, 4, 4, 6, 0.0f, -3.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f,
                1.0f, 0.0f, 0.0f, -3.0f, 1.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f,
                0.0f);
        this.leftBackWheelModel[10].setRotationPoint(-35.0f, 1.5f, -18.0f);
        this.leftBackWheelModel[11].addShapeBox(-8.5f, 2.5f, -3.0f, 4, 4, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f,
                0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 1.0f, -3.0f, 0.0f, 1.0f, -3.0f, 0.0f, -2.0f,
                0.0f, 0.0f);
        this.leftBackWheelModel[11].setRotationPoint(-35.0f, 1.5f, -18.0f);
        this.leftBackWheelModel[12].addShape3D(1.5f, -1.5f, -3.0f,
                new Shape2D(new Coord2D[]{new Coord2D(1.0, 0.0, 1, 0), new Coord2D(2.0, 0.0, 2, 0),
                        new Coord2D(3.0, 1.0, 3, 1), new Coord2D(3.0, 2.0, 3, 2), new Coord2D(2.0, 3.0, 2, 3),
                        new Coord2D(1.0, 3.0, 1, 3), new Coord2D(0.0, 2.0, 0, 2), new Coord2D(0.0, 1.0, 0, 1)}),
                3.0f, 3, 3, 12, 3, 0, new float[]{2.0f, 1.0f, 2.0f, 1.0f, 2.0f, 1.0f, 2.0f, 1.0f});
        this.leftBackWheelModel[12].setRotationPoint(-35.0f, 1.5f, -21.0f);
        this.leftBackWheelModel[13].addShape3D(3.0f, -3.0f, 0.0f,
                new Shape2D(new Coord2D[]{new Coord2D(1.0, 0.0, 1, 0), new Coord2D(5.0, 0.0, 5, 0),
                        new Coord2D(6.0, 1.0, 6, 1), new Coord2D(6.0, 5.0, 6, 5), new Coord2D(5.0, 6.0, 5, 6),
                        new Coord2D(1.0, 6.0, 1, 6), new Coord2D(0.0, 5.0, 0, 5), new Coord2D(0.0, 1.0, 0, 1)}),
                1.0f, 6, 6, 24, 1, 0, new float[]{2.0f, 4.0f, 2.0f, 4.0f, 2.0f, 4.0f, 2.0f, 4.0f});
        this.leftBackWheelModel[13].setRotationPoint(-35.0f, 1.5f, -18.5f);
        this.leftBackWheelModel[14].addShapeBox(-1.5f, -6.0f, -2.5f, 3, 6, 1, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f,
                0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f);
        this.leftBackWheelModel[14].setRotationPoint(-35.0f, 1.5f, -18.0f);
        this.leftBackWheelModel[15].addShapeBox(-6.0f, -1.5f, -2.5f, 6, 3, 1, 0.0f, 0.0f, 2.0f, 0.0f, 1.0f, 0.0f, 0.0f,
                1.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f,
                0.0f);
        this.leftBackWheelModel[15].setRotationPoint(-35.0f, 1.5f, -18.0f);
        this.leftBackWheelModel[16].addShapeBox(-1.5f, 0.0f, -2.5f, 3, 6, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f,
                0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 4.0f, 0.0f,
                0.0f);
        this.leftBackWheelModel[16].setRotationPoint(-35.0f, 1.5f, -18.0f);
        this.leftBackWheelModel[17].addShapeBox(-1.5f, 0.0f, -2.5f, 3, 6, 1, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -5.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, -5.0f, 0.0f,
                0.0f);
        this.leftBackWheelModel[17].setRotationPoint(-35.0f, 1.5f, -18.0f);
        this.leftBackWheelModel[18].addShapeBox(0.0f, -1.5f, -2.5f, 6, 3, 1, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f,
                0.0f, 2.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.leftBackWheelModel[18].setRotationPoint(-35.0f, 1.5f, -18.0f);
        (this.rightBackWheelModel = new ModelRendererTurbo[19])[0] = new ModelRendererTurbo(this, 50, 190,
                this.textureX, this.textureY);
        this.rightBackWheelModel[1] = new ModelRendererTurbo(this, 75, 190, this.textureX, this.textureY);
        this.rightBackWheelModel[2] = new ModelRendererTurbo(this, 100, 190, this.textureX, this.textureY);
        this.rightBackWheelModel[3] = new ModelRendererTurbo(this, 125, 190, this.textureX, this.textureY);
        this.rightBackWheelModel[4] = new ModelRendererTurbo(this, 150, 190, this.textureX, this.textureY);
        this.rightBackWheelModel[5] = new ModelRendererTurbo(this, 175, 190, this.textureX, this.textureY);
        this.rightBackWheelModel[6] = new ModelRendererTurbo(this, 200, 190, this.textureX, this.textureY);
        this.rightBackWheelModel[7] = new ModelRendererTurbo(this, 225, 190, this.textureX, this.textureY);
        this.rightBackWheelModel[8] = new ModelRendererTurbo(this, 250, 190, this.textureX, this.textureY);
        this.rightBackWheelModel[9] = new ModelRendererTurbo(this, 275, 190, this.textureX, this.textureY);
        this.rightBackWheelModel[10] = new ModelRendererTurbo(this, 300, 190, this.textureX, this.textureY);
        this.rightBackWheelModel[11] = new ModelRendererTurbo(this, 325, 190, this.textureX, this.textureY);
        this.rightBackWheelModel[12] = new ModelRendererTurbo(this, 350, 190, this.textureX, this.textureY);
        this.rightBackWheelModel[13] = new ModelRendererTurbo(this, 375, 190, this.textureX, this.textureY);
        this.rightBackWheelModel[14] = new ModelRendererTurbo(this, 50, 205, this.textureX, this.textureY);
        this.rightBackWheelModel[15] = new ModelRendererTurbo(this, 60, 205, this.textureX, this.textureY);
        this.rightBackWheelModel[16] = new ModelRendererTurbo(this, 75, 205, this.textureX, this.textureY);
        this.rightBackWheelModel[17] = new ModelRendererTurbo(this, 85, 205, this.textureX, this.textureY);
        this.rightBackWheelModel[18] = new ModelRendererTurbo(this, 95, 205, this.textureX, this.textureY);
        this.rightBackWheelModel[0].addShapeBox(-8.5f, -2.5f, -3.0f, 4, 5, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f,
                0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.rightBackWheelModel[0].setRotationPoint(-35.0f, 1.5f, 18.0f);
        this.rightBackWheelModel[1].addShapeBox(-8.5f, -6.5f, -3.0f, 4, 4, 6, 0.0f, -2.0f, 0.0f, 0.0f, 1.0f, -3.0f,
                0.0f, 1.0f, -3.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f,
                0.0f, 0.0f);
        this.rightBackWheelModel[1].setRotationPoint(-35.0f, 1.5f, 18.0f);
        this.rightBackWheelModel[2].addShapeBox(-6.5f, -8.5f, -3.0f, 4, 4, 6, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -3.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -3.0f, 1.0f,
                0.0f);
        this.rightBackWheelModel[2].setRotationPoint(-35.0f, 1.5f, 18.0f);
        this.rightBackWheelModel[3].addShapeBox(-2.5f, -8.5f, -3.0f, 5, 4, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f,
                0.0f, 0.0f);
        this.rightBackWheelModel[3].setRotationPoint(-35.0f, 1.5f, 18.0f);
        this.rightBackWheelModel[4].addShapeBox(2.5f, -8.5f, -3.0f, 4, 4, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f,
                0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -3.0f, 1.0f, 0.0f, -3.0f, 1.0f, 0.0f, 1.0f, 0.0f,
                0.0f);
        this.rightBackWheelModel[4].setRotationPoint(-35.0f, 1.5f, 18.0f);
        this.rightBackWheelModel[5].addShapeBox(4.5f, -6.5f, -3.0f, 4, 4, 6, 0.0f, 1.0f, -3.0f, 0.0f, -2.0f, 0.0f, 0.0f,
                -2.0f, 0.0f, 0.0f, 1.0f, -3.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f,
                0.0f);
        this.rightBackWheelModel[5].setRotationPoint(-35.0f, 1.5f, 18.0f);
        this.rightBackWheelModel[6].addShapeBox(4.5f, -2.5f, -3.0f, 4, 5, 6, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f,
                0.0f);
        this.rightBackWheelModel[6].setRotationPoint(-35.0f, 1.5f, 18.0f);
        this.rightBackWheelModel[7].addShapeBox(4.5f, 2.5f, -3.0f, 4, 4, 6, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, -3.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 1.0f,
                -3.0f, 0.0f);
        this.rightBackWheelModel[7].setRotationPoint(-35.0f, 1.5f, 18.0f);
        this.rightBackWheelModel[8].addShapeBox(2.5f, 4.5f, -3.0f, 4, 4, 6, 0.0f, 1.0f, 0.0f, 0.0f, -3.0f, 1.0f, 0.0f,
                -3.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.rightBackWheelModel[8].setRotationPoint(-35.0f, 1.5f, 18.0f);
        this.rightBackWheelModel[9].addShapeBox(-2.5f, 4.5f, -3.0f, 5, 4, 6, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f,
                -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.rightBackWheelModel[9].setRotationPoint(-35.0f, 1.5f, 18.0f);
        this.rightBackWheelModel[10].addShapeBox(-6.5f, 4.5f, -3.0f, 4, 4, 6, 0.0f, -3.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f,
                1.0f, 0.0f, 0.0f, -3.0f, 1.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f,
                0.0f);
        this.rightBackWheelModel[10].setRotationPoint(-35.0f, 1.5f, 18.0f);
        this.rightBackWheelModel[11].addShapeBox(-8.5f, 2.5f, -3.0f, 4, 4, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f,
                0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 1.0f, -3.0f, 0.0f, 1.0f, -3.0f, 0.0f, -2.0f,
                0.0f, 0.0f);
        this.rightBackWheelModel[11].setRotationPoint(-35.0f, 1.5f, 18.0f);
        this.rightBackWheelModel[12].addShape3D(1.5f, -1.5f, -3.0f,
                new Shape2D(new Coord2D[]{new Coord2D(1.0, 0.0, 1, 0), new Coord2D(2.0, 0.0, 2, 0),
                        new Coord2D(3.0, 1.0, 3, 1), new Coord2D(3.0, 2.0, 3, 2), new Coord2D(2.0, 3.0, 2, 3),
                        new Coord2D(1.0, 3.0, 1, 3), new Coord2D(0.0, 2.0, 0, 2), new Coord2D(0.0, 1.0, 0, 1)}),
                3.0f, 3, 3, 12, 3, 0, new float[]{2.0f, 1.0f, 2.0f, 1.0f, 2.0f, 1.0f, 2.0f, 1.0f});
        this.rightBackWheelModel[12].setRotationPoint(-35.0f, 1.5f, 18.0f);
        this.rightBackWheelModel[13].addShape3D(3.0f, -3.0f, 0.0f,
                new Shape2D(new Coord2D[]{new Coord2D(1.0, 0.0, 1, 0), new Coord2D(5.0, 0.0, 5, 0),
                        new Coord2D(6.0, 1.0, 6, 1), new Coord2D(6.0, 5.0, 6, 5), new Coord2D(5.0, 6.0, 5, 6),
                        new Coord2D(1.0, 6.0, 1, 6), new Coord2D(0.0, 5.0, 0, 5), new Coord2D(0.0, 1.0, 0, 1)}),
                1.0f, 6, 6, 24, 1, 0, new float[]{2.0f, 4.0f, 2.0f, 4.0f, 2.0f, 4.0f, 2.0f, 4.0f});
        this.rightBackWheelModel[13].setRotationPoint(-35.0f, 1.5f, 19.5f);
        this.rightBackWheelModel[14].addShapeBox(-1.5f, -6.0f, 1.5f, 3, 6, 1, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f,
                0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f);
        this.rightBackWheelModel[14].setRotationPoint(-35.0f, 1.5f, 18.0f);
        this.rightBackWheelModel[15].addShapeBox(-6.0f, -1.5f, 1.5f, 6, 3, 1, 0.0f, 0.0f, 2.0f, 0.0f, 1.0f, 0.0f, 0.0f,
                1.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f,
                0.0f);
        this.rightBackWheelModel[15].setRotationPoint(-35.0f, 1.5f, 18.0f);
        this.rightBackWheelModel[16].addShapeBox(-1.5f, 0.0f, 1.5f, 3, 6, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f,
                0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 4.0f, 0.0f,
                0.0f);
        this.rightBackWheelModel[16].setRotationPoint(-35.0f, 1.5f, 18.0f);
        this.rightBackWheelModel[17].addShapeBox(-1.5f, 0.0f, 1.5f, 3, 6, 1, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -5.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, -5.0f, 0.0f,
                0.0f);
        this.rightBackWheelModel[17].setRotationPoint(-35.0f, 1.5f, 18.0f);
        this.rightBackWheelModel[18].addShapeBox(0.0f, -1.5f, 1.5f, 6, 3, 1, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f,
                0.0f, 2.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.rightBackWheelModel[18].setRotationPoint(-35.0f, 1.5f, 18.0f);
        (this.steeringWheelModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo(this, 0, 170,
                this.textureX, this.textureY);
        this.steeringWheelModel[1] = new ModelRendererTurbo(this, 0, 170, this.textureX, this.textureY);
        this.steeringWheelModel[0].addBox(-1.0f, -4.0f, -4.0f, 1, 8, 8, 0.0f);
        this.steeringWheelModel[0].setRotationPoint(15.0f, -13.0f, 9.0f);
        this.steeringWheelModel[0].rotateAngleZ = -0.3316126f;
        this.steeringWheelModel[1].flip = true;
        this.steeringWheelModel[1].addBox(-1.0f, -4.0f, -4.0f, 1, 8, 8, 0.0f);
        this.steeringWheelModel[1].setRotationPoint(15.0f, -13.0f, 9.0f);
        this.steeringWheelModel[1].rotateAngleZ = -0.3316126f;
        this.translateAll(0, -2, 0);
        this.flipAll();
    }
}
