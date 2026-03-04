package com.flansmod.client.model.titan;

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelZeroTitan extends ModelMecha {

    int textureX = 1024;
    int textureY = 1024;

    public ModelZeroTitan() {
        super.hipsAttachmentPoint = new Vector3f(-3.125F, 7.5F, 0.0F);
        super.bodyModel = new ModelRendererTurbo[65];
        super.bodyModel[0] = new ModelRendererTurbo(this, 0, 100, this.textureX, this.textureY);
        super.bodyModel[1] = new ModelRendererTurbo(this, 0, 130, this.textureX, this.textureY);
        super.bodyModel[2] = new ModelRendererTurbo(this, 0, 150, this.textureX, this.textureY);
        super.bodyModel[3] = new ModelRendererTurbo(this, 0, 190, this.textureX, this.textureY);
        super.bodyModel[4] = new ModelRendererTurbo(this, 0, 230, this.textureX, this.textureY);
        super.bodyModel[5] = new ModelRendererTurbo(this, 0, 260, this.textureX, this.textureY);
        super.bodyModel[6] = new ModelRendererTurbo(this, 0, 260, this.textureX, this.textureY);
        super.bodyModel[7] = new ModelRendererTurbo(this, 0, 280, this.textureX, this.textureY);
        super.bodyModel[8] = new ModelRendererTurbo(this, 0, 300, this.textureX, this.textureY);
        super.bodyModel[9] = new ModelRendererTurbo(this, 0, 310, this.textureX, this.textureY);
        super.bodyModel[10] = new ModelRendererTurbo(this, 0, 300, this.textureX, this.textureY);
        super.bodyModel[11] = new ModelRendererTurbo(this, 0, 320, this.textureX, this.textureY);
        super.bodyModel[12] = new ModelRendererTurbo(this, 0, 320, this.textureX, this.textureY);
        super.bodyModel[13] = new ModelRendererTurbo(this, 0, 330, this.textureX, this.textureY);
        super.bodyModel[14] = new ModelRendererTurbo(this, 0, 350, this.textureX, this.textureY);
        super.bodyModel[15] = new ModelRendererTurbo(this, 0, 350, this.textureX, this.textureY);
        super.bodyModel[16] = new ModelRendererTurbo(this, 0, 360, this.textureX, this.textureY);
        super.bodyModel[17] = new ModelRendererTurbo(this, 0, 390, this.textureX, this.textureY);
        super.bodyModel[18] = new ModelRendererTurbo(this, 0, 420, this.textureX, this.textureY);
        super.bodyModel[19] = new ModelRendererTurbo(this, 0, 480, this.textureX, this.textureY);
        super.bodyModel[20] = new ModelRendererTurbo(this, 0, 510, this.textureX, this.textureY);
        super.bodyModel[21] = new ModelRendererTurbo(this, 0, 570, this.textureX, this.textureY);
        super.bodyModel[22] = new ModelRendererTurbo(this, 0, 650, this.textureX, this.textureY);
        super.bodyModel[23] = new ModelRendererTurbo(this, 0, 710, this.textureX, this.textureY);
        super.bodyModel[24] = new ModelRendererTurbo(this, 0, 790, this.textureX, this.textureY);
        super.bodyModel[25] = new ModelRendererTurbo(this, 0, 820, this.textureX, this.textureY);
        super.bodyModel[26] = new ModelRendererTurbo(this, 0, 820, this.textureX, this.textureY);
        super.bodyModel[27] = new ModelRendererTurbo(this, 0, 880, this.textureX, this.textureY);
        super.bodyModel[28] = new ModelRendererTurbo(this, 0, 880, this.textureX, this.textureY);
        super.bodyModel[29] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        super.bodyModel[30] = new ModelRendererTurbo(this, 0, 910, this.textureX, this.textureY);
        super.bodyModel[31] = new ModelRendererTurbo(this, 0, 960, this.textureX, this.textureY);
        super.bodyModel[32] = new ModelRendererTurbo(this, 0, 960, this.textureX, this.textureY);
        super.bodyModel[33] = new ModelRendererTurbo(this, 200, 0, this.textureX, this.textureY);
        super.bodyModel[34] = new ModelRendererTurbo(this, 200, 0, this.textureX, this.textureY);
        super.bodyModel[35] = new ModelRendererTurbo(this, 200, 20, this.textureX, this.textureY);
        super.bodyModel[36] = new ModelRendererTurbo(this, 200, 20, this.textureX, this.textureY);
        super.bodyModel[37] = new ModelRendererTurbo(this, 0, 310, this.textureX, this.textureY);
        super.bodyModel[38] = new ModelRendererTurbo(this, 200, 40, this.textureX, this.textureY);
        super.bodyModel[39] = new ModelRendererTurbo(this, 200, 40, this.textureX, this.textureY);
        super.bodyModel[40] = new ModelRendererTurbo(this, 200, 60, this.textureX, this.textureY);
        super.bodyModel[41] = new ModelRendererTurbo(this, 200, 60, this.textureX, this.textureY);
        super.bodyModel[42] = new ModelRendererTurbo(this, 200, 100, this.textureX, this.textureY);
        super.bodyModel[43] = new ModelRendererTurbo(this, 200, 160, this.textureX, this.textureY);
        super.bodyModel[44] = new ModelRendererTurbo(this, 200, 200, this.textureX, this.textureY);
        super.bodyModel[45] = new ModelRendererTurbo(this, 200, 200, this.textureX, this.textureY);
        super.bodyModel[46] = new ModelRendererTurbo(this, 200, 200, this.textureX, this.textureY);
        super.bodyModel[47] = new ModelRendererTurbo(this, 200, 240, this.textureX, this.textureY);
        super.bodyModel[48] = new ModelRendererTurbo(this, 200, 280, this.textureX, this.textureY);
        super.bodyModel[49] = new ModelRendererTurbo(this, 200, 320, this.textureX, this.textureY);
        super.bodyModel[50] = new ModelRendererTurbo(this, 200, 340, this.textureX, this.textureY);
        super.bodyModel[51] = new ModelRendererTurbo(this, 200, 360, this.textureX, this.textureY);
        super.bodyModel[52] = new ModelRendererTurbo(this, 200, 360, this.textureX, this.textureY);
        super.bodyModel[53] = new ModelRendererTurbo(this, 200, 340, this.textureX, this.textureY);
        super.bodyModel[54] = new ModelRendererTurbo(this, 200, 200, this.textureX, this.textureY);
        super.bodyModel[55] = new ModelRendererTurbo(this, 200, 200, this.textureX, this.textureY);
        super.bodyModel[56] = new ModelRendererTurbo(this, 200, 200, this.textureX, this.textureY);
        super.bodyModel[57] = new ModelRendererTurbo(this, 200, 160, this.textureX, this.textureY);
        super.bodyModel[58] = new ModelRendererTurbo(this, 200, 240, this.textureX, this.textureY);
        super.bodyModel[59] = new ModelRendererTurbo(this, 200, 280, this.textureX, this.textureY);
        super.bodyModel[60] = new ModelRendererTurbo(this, 200, 320, this.textureX, this.textureY);
        super.bodyModel[61] = new ModelRendererTurbo(this, 200, 340, this.textureX, this.textureY);
        super.bodyModel[62] = new ModelRendererTurbo(this, 200, 340, this.textureX, this.textureY);
        super.bodyModel[63] = new ModelRendererTurbo(this, 200, 360, this.textureX, this.textureY);
        super.bodyModel[64] = new ModelRendererTurbo(this, 200, 360, this.textureX, this.textureY);
        super.bodyModel[0].addBox(0.0F, 0.0F, 0.0F, 16, 3, 16, 0.0F);
        super.bodyModel[0].setRotationPoint(31.0F, -120.0F, -8.0F);
        super.bodyModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 16, 1, 16, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, -2.0F,
                0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[1].setRotationPoint(31.0F, -121.0F, -8.0F);
        super.bodyModel[2].addBox(0.0F, 0.0F, 0.0F, 3, 20, 16, 0.0F);
        super.bodyModel[2].setRotationPoint(28.0F, -137.0F, -8.0F);
        super.bodyModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 1, 17, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F,
                -3.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, -3.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[3].setRotationPoint(31.0F, -137.0F, -8.0F);
        super.bodyModel[4].addBox(0.0F, 0.0F, 0.0F, 29, 2, 20, 0.0F);
        super.bodyModel[4].setRotationPoint(28.0F, -117.0F, -10.0F);
        super.bodyModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 3, 20, 3, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
        super.bodyModel[5].setRotationPoint(58.0F, -137.0F, 7.0F);
        super.bodyModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 3, 20, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
        super.bodyModel[6].setRotationPoint(58.0F, -137.0F, -10.0F);
        super.bodyModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 3, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[7].setRotationPoint(58.0F, -140.0F, -8.0F);
        super.bodyModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 30, 3, 2, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 7.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, 0.0F);
        super.bodyModel[8].setRotationPoint(28.0F, -140.0F, 8.0F);
        super.bodyModel[9].addShapeBox(0.0F, 0.0F, 0.0F, 20, 3, 1, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, -12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 12.0F,
                0.0F);
        super.bodyModel[9].setRotationPoint(28.0F, -131.0F, 8.5F);
        super.bodyModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 30, 3, 2, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, 2.0F, 0.0F, 7.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F,
                0.0F);
        super.bodyModel[10].setRotationPoint(28.0F, -140.0F, -10.0F);
        super.bodyModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 30, 1, 2, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -7.0F,
                0.0F);
        super.bodyModel[11].setRotationPoint(28.0F, -139.0F, 6.0F);
        super.bodyModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 30, 1, 2, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, 2.0F, 0.0F, 7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -7.0F,
                0.0F);
        super.bodyModel[12].setRotationPoint(28.0F, -139.0F, -8.0F);
        super.bodyModel[13].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 10, 0.0F, 0.0F, 0.58F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.58F, 0.0F, 0.0F, -0.58F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.58F,
                0.0F);
        super.bodyModel[13].setRotationPoint(55.0F, -139.0F, -5.0F);
        super.bodyModel[14].addShapeBox(0.0F, 0.0F, 0.0F, 3, 20, 1, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F,
                0.0F);
        super.bodyModel[14].setRotationPoint(55.0F, -137.0F, 8.0F);
        super.bodyModel[15].addShapeBox(0.0F, 0.0F, 0.0F, 3, 20, 1, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
        super.bodyModel[15].setRotationPoint(55.0F, -137.0F, -9.0F);
        super.bodyModel[16].addShapeBox(0.0F, 0.0F, 0.0F, 29, 5, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 2.0F, -2.0F, -5.0F, 2.0F, -2.0F, -5.0F, 0.0F, 0.0F,
                -5.0F);
        super.bodyModel[16].setRotationPoint(28.0F, -115.0F, -10.0F);
        super.bodyModel[17].addShapeBox(0.0F, 0.0F, 0.0F, 8, 7, 16, 0.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[17].setRotationPoint(49.0F, -124.0F, -8.0F);
        super.bodyModel[18].addBox(0.0F, 0.0F, 0.0F, 2, 32, 20, 0.0F);
        super.bodyModel[18].setRotationPoint(26.0F, -147.0F, -10.0F);
        super.bodyModel[19].addShapeBox(0.0F, 0.0F, 0.0F, 2, 5, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, -4.0F,
                0.0F);
        super.bodyModel[19].setRotationPoint(26.0F, -115.0F, -10.0F);
        super.bodyModel[20].addShapeBox(0.0F, 0.0F, 0.0F, 18, 32, 20, 0.0F, 0.0F, 4.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 4.0F, 8.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F);
        super.bodyModel[20].setRotationPoint(8.0F, -147.0F, -10.0F);
        super.bodyModel[21].addBox(0.0F, 0.0F, 0.0F, 23, 36, 36, 0.0F);
        super.bodyModel[21].setRotationPoint(-15.0F, -151.0F, -18.0F);
        super.bodyModel[22].addShapeBox(0.0F, 0.0F, 0.0F, 33, 29, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F,
                3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[22].setRotationPoint(-50.0F, -144.0F, -14.0F);
        super.bodyModel[23].addShapeBox(0.0F, 0.0F, 0.0F, 2, 36, 36, 0.0F, 0.0F, -4.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -4.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -4.0F);
        super.bodyModel[23].setRotationPoint(-17.0F, -151.0F, -18.0F);
        super.bodyModel[24].addShapeBox(0.0F, 0.0F, 0.0F, 27, 8, 12, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[24].setRotationPoint(-30.0F, -153.0F, -6.0F);
        super.bodyModel[25].addShapeBox(0.0F, 0.0F, 0.0F, 33, 28, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[25].setRotationPoint(-19.0F, -143.0F, 14.0F);
        super.bodyModel[26].addShapeBox(0.0F, 0.0F, 0.0F, 33, 28, 20, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[26].setRotationPoint(-19.0F, -143.0F, -34.0F);
        super.bodyModel[27].addShapeBox(0.0F, 0.0F, 0.0F, 33, 10, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F,
                0.0F);
        super.bodyModel[27].setRotationPoint(-19.0F, -116.0F, 14.0F);
        super.bodyModel[28].addShapeBox(0.0F, 0.0F, 0.0F, 33, 10, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F,
                0.0F);
        super.bodyModel[28].setRotationPoint(-19.0F, -116.0F, -32.0F);
        super.bodyModel[29].addShapeBox(0.0F, 0.0F, 0.0F, 18, 10, 20, 0.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 4.0F, -4.0F, 0.0F, -4.0F, -4.0F, 0.0F, -4.0F, 0.0F, 0.0F,
                4.0F);
        super.bodyModel[29].setRotationPoint(8.0F, -115.0F, -10.0F);
        super.bodyModel[30].addShapeBox(0.0F, 0.0F, 0.0F, 23, 10, 36, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, -4.0F, 0.0F,
                -4.0F);
        super.bodyModel[30].setRotationPoint(-15.0F, -115.0F, -18.0F);
        super.bodyModel[31].addShapeBox(0.0F, 0.0F, 0.0F, 19, 16, 18, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[31].setRotationPoint(-38.0F, -137.0F, -25.0F);
        super.bodyModel[32].addShapeBox(0.0F, 0.0F, 0.0F, 19, 16, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
        super.bodyModel[32].setRotationPoint(-38.0F, -137.0F, 7.0F);
        super.bodyModel[33].addShapeBox(0.0F, 0.0F, 0.0F, 39, 10, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F,
                3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F);
        super.bodyModel[33].setRotationPoint(-50.0F, -115.0F, -11.0F);
        super.bodyModel[34].addShapeBox(0.0F, 0.0F, 0.0F, 39, 10, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F,
                3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F);
        super.bodyModel[34].setRotationPoint(-50.0F, -115.0F, 3.0F);
        super.bodyModel[35].addShapeBox(0.0F, 0.0F, 0.0F, 3, 11, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[35].setRotationPoint(48.0F, -139.0F, 6.5F);
        super.bodyModel[36].addShapeBox(0.0F, 0.0F, 0.0F, 3, 11, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[36].setRotationPoint(48.0F, -139.0F, -7.5F);
        super.bodyModel[37].addShapeBox(0.0F, 0.0F, 0.0F, 20, 3, 1, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, 2.0F, 0.0F, -12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 12.0F,
                0.0F);
        super.bodyModel[37].setRotationPoint(28.0F, -131.0F, -9.5F);
        super.bodyModel[38].addShapeBox(0.0F, 0.0F, 0.0F, 18, 10, 8, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[38].setRotationPoint(-46.0F, -134.0F, -22.0F);
        super.bodyModel[39].addShapeBox(0.0F, 0.0F, 0.0F, 18, 10, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
        super.bodyModel[39].setRotationPoint(-46.0F, -134.0F, 14.0F);
        super.bodyModel[40].addShapeBox(0.0F, 0.0F, 0.0F, 6, 20, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[40].setRotationPoint(14.0F, -139.0F, 12.0F);
        super.bodyModel[41].addShapeBox(0.0F, 0.0F, 0.0F, 6, 20, 15, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[41].setRotationPoint(14.0F, -139.0F, -27.0F);
        super.bodyModel[42].addShapeBox(0.0F, 0.0F, 0.0F, 5, 20, 20, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F,
                -1.0F);
        super.bodyModel[42].setRotationPoint(-55.0F, -140.0F, -10.0F);
        super.bodyModel[43].addShapeBox(0.0F, 0.0F, 0.0F, 29, 4, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F,
                0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F);
        super.bodyModel[43].setRotationPoint(-17.0F, -134.0F, 34.0F);
        super.bodyModel[44].addShapeBox(0.0F, 0.0F, 0.0F, 4, 4, 26, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[44].setRotationPoint(-13.0F, -138.0F, 34.0F);
        super.bodyModel[45].addShapeBox(0.0F, 0.0F, 0.0F, 4, 4, 26, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[45].setRotationPoint(4.0F, -138.0F, 34.0F);
        super.bodyModel[46].addShapeBox(0.0F, 0.0F, 0.0F, 4, 4, 26, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F,
                -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[46].setRotationPoint(-4.0F, -138.0F, 34.0F);
        super.bodyModel[47].addShapeBox(0.0F, 0.0F, 0.0F, 21, 4, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F);
        super.bodyModel[47].setRotationPoint(-13.0F, -130.0F, 39.0F);
        super.bodyModel[48].addShapeBox(0.0F, 0.0F, 0.0F, 12, 12, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F);
        super.bodyModel[48].setRotationPoint(-9.0F, -126.0F, 43.0F);
        super.bodyModel[49].addBox(0.0F, 0.0F, 0.0F, 20, 2, 16, 0.0F);
        super.bodyModel[49].setRotationPoint(-21.0F, -114.0F, 41.0F);
        super.bodyModel[50].addBox(0.0F, 0.0F, 0.0F, 20, 8, 2, 0.0F);
        super.bodyModel[50].setRotationPoint(-21.0F, -112.0F, 41.0F);
        super.bodyModel[51].addShapeBox(0.0F, 0.0F, 0.0F, 20, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F);
        super.bodyModel[51].setRotationPoint(-21.0F, -104.0F, 41.0F);
        super.bodyModel[52].addShapeBox(0.0F, 0.0F, 0.0F, 20, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F);
        super.bodyModel[52].setRotationPoint(-21.0F, -104.0F, 55.0F);
        super.bodyModel[53].addBox(0.0F, 0.0F, 0.0F, 20, 8, 2, 0.0F);
        super.bodyModel[53].setRotationPoint(-21.0F, -112.0F, 55.0F);
        super.bodyModel[54].addShapeBox(0.0F, 0.0F, 0.0F, 4, 4, 26, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[54].setRotationPoint(-13.0F, -138.0F, -60.0F);
        super.bodyModel[55].addShapeBox(0.0F, 0.0F, 0.0F, 4, 4, 26, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[55].setRotationPoint(-4.0F, -138.0F, -60.0F);
        super.bodyModel[56].addShapeBox(0.0F, 0.0F, 0.0F, 4, 4, 26, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F,
                1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[56].setRotationPoint(4.0F, -138.0F, -60.0F);
        super.bodyModel[57].addShapeBox(0.0F, 0.0F, 0.0F, 29, 4, 26, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[57].setRotationPoint(-17.0F, -134.0F, -60.0F);
        super.bodyModel[58].addShapeBox(0.0F, 0.0F, 0.0F, 21, 4, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F);
        super.bodyModel[58].setRotationPoint(-13.0F, -130.0F, -59.0F);
        super.bodyModel[59].addShapeBox(0.0F, 0.0F, 0.0F, 12, 12, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F);
        super.bodyModel[59].setRotationPoint(-9.0F, -126.0F, -55.0F);
        super.bodyModel[60].addBox(0.0F, 0.0F, 0.0F, 20, 2, 16, 0.0F);
        super.bodyModel[60].setRotationPoint(-21.0F, -114.0F, -57.0F);
        super.bodyModel[61].addBox(0.0F, 0.0F, 0.0F, 20, 8, 2, 0.0F);
        super.bodyModel[61].setRotationPoint(-21.0F, -112.0F, -57.0F);
        super.bodyModel[62].addBox(0.0F, 0.0F, 0.0F, 20, 8, 2, 0.0F);
        super.bodyModel[62].setRotationPoint(-21.0F, -112.0F, -43.0F);
        super.bodyModel[63].addShapeBox(0.0F, 0.0F, 0.0F, 20, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F);
        super.bodyModel[63].setRotationPoint(-21.0F, -104.0F, -43.0F);
        super.bodyModel[64].addShapeBox(0.0F, 0.0F, 0.0F, 20, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F);
        super.bodyModel[64].setRotationPoint(-21.0F, -104.0F, -57.0F);
        super.hipsModel = new ModelRendererTurbo[8];
        super.hipsModel[0] = new ModelRendererTurbo(this, 200, 380, this.textureX, this.textureY);
        super.hipsModel[1] = new ModelRendererTurbo(this, 200, 420, this.textureX, this.textureY);
        super.hipsModel[2] = new ModelRendererTurbo(this, 200, 420, this.textureX, this.textureY);
        super.hipsModel[3] = new ModelRendererTurbo(this, 200, 460, this.textureX, this.textureY);
        super.hipsModel[4] = new ModelRendererTurbo(this, 200, 510, this.textureX, this.textureY);
        super.hipsModel[5] = new ModelRendererTurbo(this, 200, 560, this.textureX, this.textureY);
        super.hipsModel[6] = new ModelRendererTurbo(this, 200, 620, this.textureX, this.textureY);
        super.hipsModel[7] = new ModelRendererTurbo(this, 200, 660, this.textureX, this.textureY);
        super.hipsModel[0].addBox(0.0F, 0.0F, 0.0F, 19, 4, 24, 0.0F);
        super.hipsModel[0].setRotationPoint(-11.0F, -105.0F, -12.0F);
        super.hipsModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 14, 4, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F,
                0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F,
                0.0F);
        super.hipsModel[1].setRotationPoint(8.0F, -105.0F, -12.0F);
        super.hipsModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 14, 4, 24, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -8.0F);
        super.hipsModel[2].setRotationPoint(-25.0F, -105.0F, -12.0F);
        super.hipsModel[3].addBox(0.0F, 0.0F, 0.0F, 38, 14, 28, 0.0F);
        super.hipsModel[3].setRotationPoint(-16.0F, -101.0F, -14.0F);
        super.hipsModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 6, 14, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F,
                -2.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F,
                0.0F);
        super.hipsModel[4].setRotationPoint(22.0F, -101.0F, -14.0F);
        super.hipsModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 17, 14, 28, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, -4.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F,
                -8.0F);
        super.hipsModel[5].setRotationPoint(-33.0F, -101.0F, -14.0F);
        super.hipsModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 21, 7, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F,
                0.0F);
        super.hipsModel[6].setRotationPoint(-11.0F, -87.0F, -14.0F);
        super.hipsModel[7].addBox(0.0F, 0.0F, 0.0F, 14, 14, 38, 0.0F);
        super.hipsModel[7].setRotationPoint(-8.0F, -98.0F, -19.0F);
        super.leftLegModel = new ModelRendererTurbo[19];
        super.leftLegModel[0] = new ModelRendererTurbo(this, 400, 0, this.textureX, this.textureY);
        super.leftLegModel[1] = new ModelRendererTurbo(this, 400, 40, this.textureX, this.textureY);
        super.leftLegModel[2] = new ModelRendererTurbo(this, 400, 70, this.textureX, this.textureY);
        super.leftLegModel[3] = new ModelRendererTurbo(this, 400, 70, this.textureX, this.textureY);
        super.leftLegModel[4] = new ModelRendererTurbo(this, 400, 100, this.textureX, this.textureY);
        super.leftLegModel[5] = new ModelRendererTurbo(this, 400, 150, this.textureX, this.textureY);
        super.leftLegModel[6] = new ModelRendererTurbo(this, 400, 200, this.textureX, this.textureY);
        super.leftLegModel[7] = new ModelRendererTurbo(this, 400, 240, this.textureX, this.textureY);
        super.leftLegModel[8] = new ModelRendererTurbo(this, 400, 300, this.textureX, this.textureY);
        super.leftLegModel[9] = new ModelRendererTurbo(this, 400, 340, this.textureX, this.textureY);
        super.leftLegModel[10] = new ModelRendererTurbo(this, 400, 360, this.textureX, this.textureY);
        super.leftLegModel[11] = new ModelRendererTurbo(this, 400, 340, this.textureX, this.textureY);
        super.leftLegModel[12] = new ModelRendererTurbo(this, 400, 360, this.textureX, this.textureY);
        super.leftLegModel[13] = new ModelRendererTurbo(this, 400, 380, this.textureX, this.textureY);
        super.leftLegModel[14] = new ModelRendererTurbo(this, 400, 420, this.textureX, this.textureY);
        super.leftLegModel[15] = new ModelRendererTurbo(this, 400, 460, this.textureX, this.textureY);
        super.leftLegModel[16] = new ModelRendererTurbo(this, 400, 480, this.textureX, this.textureY);
        super.leftLegModel[17] = new ModelRendererTurbo(this, 400, 520, this.textureX, this.textureY);
        super.leftLegModel[18] = new ModelRendererTurbo(this, 400, 570, this.textureX, this.textureY);
        super.leftLegModel[0].addBox(-6.0F, -10.0F, 0.0F, 23, 20, 18, 0.0F);
        super.leftLegModel[0].setRotationPoint(-1.0F, -91.0F, 19.0F);
        super.leftLegModel[0].rotateAngleX = 0.01745329F;
        super.leftLegModel[0].rotateAngleZ = -0.6981317F;
        super.leftLegModel[1].addBox(17.0F, -10.0F, 0.0F, 4, 2, 18, 0.0F);
        super.leftLegModel[1].setRotationPoint(-1.0F, -91.0F, 19.0F);
        super.leftLegModel[1].rotateAngleX = 0.01745329F;
        super.leftLegModel[1].rotateAngleZ = -0.6981317F;
        super.leftLegModel[2].addBox(17.0F, -8.0F, 0.0F, 4, 18, 2, 0.0F);
        super.leftLegModel[2].setRotationPoint(-1.0F, -91.0F, 19.0F);
        super.leftLegModel[2].rotateAngleX = 0.01745329F;
        super.leftLegModel[2].rotateAngleZ = -0.6981317F;
        super.leftLegModel[3].addBox(17.0F, -8.0F, 16.0F, 4, 18, 2, 0.0F);
        super.leftLegModel[3].setRotationPoint(-1.0F, -91.0F, 19.0F);
        super.leftLegModel[3].rotateAngleX = 0.01745329F;
        super.leftLegModel[3].rotateAngleZ = -0.6981317F;
        super.leftLegModel[4].addBox(7.0F, 10.0F, 2.0F, 10, 25, 14, 0.0F);
        super.leftLegModel[4].setRotationPoint(-1.0F, -91.0F, 19.0F);
        super.leftLegModel[4].rotateAngleX = 0.01745329F;
        super.leftLegModel[4].rotateAngleZ = -0.6981317F;
        super.leftLegModel[5].addBox(-4.0F, 10.0F, 6.0F, 6, 25, 6, 0.0F);
        super.leftLegModel[5].setRotationPoint(-1.0F, -91.0F, 19.0F);
        super.leftLegModel[5].rotateAngleX = 0.01745329F;
        super.leftLegModel[5].rotateAngleZ = -0.6981317F;
        super.leftLegModel[6].addBox(5.0F, 23.0F, 1.0F, 63, 16, 16, 0.0F);
        super.leftLegModel[6].setRotationPoint(-1.0F, -91.0F, 19.0F);
        super.leftLegModel[6].rotateAngleX = 0.01745329F;
        super.leftLegModel[6].rotateAngleZ = -1.0471976F;
        super.leftLegModel[7].addShapeBox(5.0F, 63.0F, -0.5F, 22, 28, 18, 0.0F, 0.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F,
                -16.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftLegModel[7].setRotationPoint(-1.0F, -91.0F, 19.0F);
        super.leftLegModel[7].rotateAngleX = 0.01745329F;
        super.leftLegModel[8].addShapeBox(-13.0F, 75.0F, -0.5F, 18, 16, 18, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftLegModel[8].setRotationPoint(-1.0F, -91.0F, 19.0F);
        super.leftLegModel[8].rotateAngleX = 0.01745329F;
        super.leftLegModel[9].addShapeBox(18.0F, 85.0F, 4.0F, 22, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F,
                -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftLegModel[9].setRotationPoint(-1.0F, -90.9F, 19.0F);
        super.leftLegModel[9].rotateAngleX = 0.01745329F;
        super.leftLegModel[10].addBox(18.0F, 89.0F, 4.0F, 22, 2, 10, 0.0F);
        super.leftLegModel[10].setRotationPoint(-1.0F, -90.9F, 19.0F);
        super.leftLegModel[10].rotateAngleX = 0.01745329F;
        super.leftLegModel[11].addShapeBox(-27.0F, 85.0F, 4.0F, 22, 4, 10, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftLegModel[11].setRotationPoint(-1.0F, -90.9F, 19.0F);
        super.leftLegModel[11].rotateAngleX = 0.01745329F;
        super.leftLegModel[12].addBox(-27.0F, 89.0F, 4.0F, 22, 2, 10, 0.0F);
        super.leftLegModel[12].setRotationPoint(-1.0F, -90.9F, 19.0F);
        super.leftLegModel[12].rotateAngleX = 0.01745329F;
        super.leftLegModel[13].addBox(2.0F, 89.0F, -8.0F, 10, 2, 34, 0.0F);
        super.leftLegModel[13].setRotationPoint(-1.0F, -91.5F, 19.0F);
        super.leftLegModel[13].rotateAngleX = 0.01745329F;
        super.leftLegModel[14].addShapeBox(2.0F, 85.0F, -8.0F, 10, 4, 34, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F,
                0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftLegModel[14].setRotationPoint(-1.0F, -91.5F, 19.0F);
        super.leftLegModel[14].rotateAngleX = 0.01745329F;
        super.leftLegModel[15].addBox(-5.0F, 29.0F, 6.0F, 10, 6, 6, 0.0F);
        super.leftLegModel[15].setRotationPoint(-1.0F, -91.0F, 19.0F);
        super.leftLegModel[15].rotateAngleX = 0.01745329F;
        super.leftLegModel[15].rotateAngleZ = -1.0471976F;
        super.leftLegModel[16].addShapeBox(-9.0F, -10.0F, 0.0F, 3, 20, 18, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F,
                0.0F);
        super.leftLegModel[16].setRotationPoint(-1.0F, -91.0F, 19.0F);
        super.leftLegModel[16].rotateAngleX = 0.01745329F;
        super.leftLegModel[16].rotateAngleZ = -0.6981317F;
        super.leftLegModel[17].addShapeBox(17.0F, -2.0F, 4.0F, 2, 32, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftLegModel[17].setRotationPoint(-1.0F, -91.0F, 19.0F);
        super.leftLegModel[17].rotateAngleX = 0.01745329F;
        super.leftLegModel[17].rotateAngleZ = -0.6981317F;
        super.leftLegModel[18].addBox(-10.0F, 28.0F, 5.0F, 6, 8, 8, 0.0F);
        super.leftLegModel[18].setRotationPoint(-1.0F, -91.0F, 19.0F);
        super.leftLegModel[18].rotateAngleX = 0.01745329F;
        super.leftLegModel[18].rotateAngleZ = -1.0471976F;
        super.rightLegModel = new ModelRendererTurbo[19];
        super.rightLegModel[0] = new ModelRendererTurbo(this, 400, 0, this.textureX, this.textureY);
        super.rightLegModel[1] = new ModelRendererTurbo(this, 400, 480, this.textureX, this.textureY);
        super.rightLegModel[2] = new ModelRendererTurbo(this, 400, 70, this.textureX, this.textureY);
        super.rightLegModel[3] = new ModelRendererTurbo(this, 400, 40, this.textureX, this.textureY);
        super.rightLegModel[4] = new ModelRendererTurbo(this, 400, 70, this.textureX, this.textureY);
        super.rightLegModel[5] = new ModelRendererTurbo(this, 400, 520, this.textureX, this.textureY);
        super.rightLegModel[6] = new ModelRendererTurbo(this, 400, 100, this.textureX, this.textureY);
        super.rightLegModel[7] = new ModelRendererTurbo(this, 400, 150, this.textureX, this.textureY);
        super.rightLegModel[8] = new ModelRendererTurbo(this, 400, 460, this.textureX, this.textureY);
        super.rightLegModel[9] = new ModelRendererTurbo(this, 400, 200, this.textureX, this.textureY);
        super.rightLegModel[10] = new ModelRendererTurbo(this, 400, 240, this.textureX, this.textureY);
        super.rightLegModel[11] = new ModelRendererTurbo(this, 400, 300, this.textureX, this.textureY);
        super.rightLegModel[12] = new ModelRendererTurbo(this, 400, 340, this.textureX, this.textureY);
        super.rightLegModel[13] = new ModelRendererTurbo(this, 400, 340, this.textureX, this.textureY);
        super.rightLegModel[14] = new ModelRendererTurbo(this, 400, 360, this.textureX, this.textureY);
        super.rightLegModel[15] = new ModelRendererTurbo(this, 400, 360, this.textureX, this.textureY);
        super.rightLegModel[16] = new ModelRendererTurbo(this, 400, 420, this.textureX, this.textureY);
        super.rightLegModel[17] = new ModelRendererTurbo(this, 400, 380, this.textureX, this.textureY);
        super.rightLegModel[18] = new ModelRendererTurbo(this, 400, 570, this.textureX, this.textureY);
        super.rightLegModel[0].addBox(-6.0F, -10.0F, 0.0F, 23, 20, 18, 0.0F);
        super.rightLegModel[0].setRotationPoint(-1.0F, -91.0F, -37.0F);
        super.rightLegModel[0].rotateAngleX = 0.01745329F;
        super.rightLegModel[0].rotateAngleZ = -0.6981317F;
        super.rightLegModel[1].addShapeBox(-9.0F, -10.0F, 0.0F, 3, 20, 18, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F,
                0.0F);
        super.rightLegModel[1].setRotationPoint(-1.0F, -91.0F, -37.0F);
        super.rightLegModel[1].rotateAngleX = 0.01745329F;
        super.rightLegModel[1].rotateAngleZ = -0.6981317F;
        super.rightLegModel[2].addBox(17.0F, -8.0F, 16.0F, 4, 18, 2, 0.0F);
        super.rightLegModel[2].setRotationPoint(-1.0F, -91.0F, -37.0F);
        super.rightLegModel[2].rotateAngleX = 0.01745329F;
        super.rightLegModel[2].rotateAngleZ = -0.6981317F;
        super.rightLegModel[3].addBox(17.0F, -10.0F, 0.0F, 4, 2, 18, 0.0F);
        super.rightLegModel[3].setRotationPoint(-1.0F, -91.0F, -37.0F);
        super.rightLegModel[3].rotateAngleX = 0.01745329F;
        super.rightLegModel[3].rotateAngleZ = -0.6981317F;
        super.rightLegModel[4].addBox(17.0F, -8.0F, 0.0F, 4, 18, 2, 0.0F);
        super.rightLegModel[4].setRotationPoint(-1.0F, -91.0F, -37.0F);
        super.rightLegModel[4].rotateAngleX = 0.01745329F;
        super.rightLegModel[4].rotateAngleZ = -0.6981317F;
        super.rightLegModel[5].addShapeBox(17.0F, -2.0F, -4.0F, 2, 32, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightLegModel[5].setRotationPoint(-1.0F, -91.0F, -29.0F);
        super.rightLegModel[5].rotateAngleX = 0.01745329F;
        super.rightLegModel[5].rotateAngleZ = -0.6981317F;
        super.rightLegModel[6].addBox(7.0F, 10.0F, -2.0F, 10, 25, 14, 0.0F);
        super.rightLegModel[6].setRotationPoint(-1.0F, -91.0F, -33.0F);
        super.rightLegModel[6].rotateAngleX = 0.01745329F;
        super.rightLegModel[6].rotateAngleZ = -0.6981317F;
        super.rightLegModel[7].addBox(-4.0F, 10.0F, -6.0F, 6, 25, 6, 0.0F);
        super.rightLegModel[7].setRotationPoint(-1.0F, -91.0F, -25.0F);
        super.rightLegModel[7].rotateAngleX = 0.01745329F;
        super.rightLegModel[7].rotateAngleZ = -0.6981317F;
        super.rightLegModel[8].addBox(-5.0F, 29.0F, -6.0F, 10, 6, 6, 0.0F);
        super.rightLegModel[8].setRotationPoint(-1.0F, -91.0F, -25.0F);
        super.rightLegModel[8].rotateAngleX = 0.01745329F;
        super.rightLegModel[8].rotateAngleZ = -1.0471976F;
        super.rightLegModel[9].addBox(5.0F, 23.0F, -1.0F, 63, 16, 16, 0.0F);
        super.rightLegModel[9].setRotationPoint(-1.0F, -91.0F, -35.0F);
        super.rightLegModel[9].rotateAngleX = 0.01745329F;
        super.rightLegModel[9].rotateAngleZ = -1.0471976F;
        super.rightLegModel[10].addShapeBox(5.0F, 63.0F, -0.5F, 22, 28, 18, 0.0F, 0.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F,
                -16.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightLegModel[10].setRotationPoint(-1.0F, -91.0F, -37.0F);
        super.rightLegModel[10].rotateAngleX = 0.01745329F;
        super.rightLegModel[11].addShapeBox(-13.0F, 75.0F, -0.5F, 18, 16, 18, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightLegModel[11].setRotationPoint(-1.0F, -91.0F, -37.0F);
        super.rightLegModel[11].rotateAngleX = 0.01745329F;
        super.rightLegModel[12].addShapeBox(18.0F, 85.0F, -5.0F, 22, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F,
                -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightLegModel[12].setRotationPoint(-1.0F, -91.0F, -29.0F);
        super.rightLegModel[12].rotateAngleX = 0.01745329F;
        super.rightLegModel[13].addShapeBox(-27.0F, 85.0F, -5.0F, 22, 4, 10, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightLegModel[13].setRotationPoint(-1.0F, -91.0F, -29.0F);
        super.rightLegModel[13].rotateAngleX = 0.01745329F;
        super.rightLegModel[14].addBox(18.0F, 89.0F, -5.0F, 22, 2, 10, 0.0F);
        super.rightLegModel[14].setRotationPoint(-1.0F, -91.0F, -29.0F);
        super.rightLegModel[14].rotateAngleX = 0.01745329F;
        super.rightLegModel[15].addBox(-27.0F, 89.0F, -5.0F, 22, 2, 10, 0.0F);
        super.rightLegModel[15].setRotationPoint(-1.0F, -91.0F, -29.0F);
        super.rightLegModel[15].rotateAngleX = 0.01745329F;
        super.rightLegModel[16].addShapeBox(2.0F, 85.0F, 7.0F, 10, 4, 34, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F,
                0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightLegModel[16].setRotationPoint(-1.0F, -91.0F, -53.0F);
        super.rightLegModel[16].rotateAngleX = 0.01745329F;
        super.rightLegModel[17].addBox(2.0F, 89.0F, 7.0F, 10, 2, 34, 0.0F);
        super.rightLegModel[17].setRotationPoint(-1.0F, -91.0F, -53.0F);
        super.rightLegModel[17].rotateAngleX = 0.01745329F;
        super.rightLegModel[18].addBox(-10.0F, 28.0F, -7.0F, 6, 8, 8, 0.0F);
        super.rightLegModel[18].setRotationPoint(-1.0F, -91.0F, -25.0F);
        super.rightLegModel[18].rotateAngleX = 0.01745329F;
        super.rightLegModel[18].rotateAngleZ = -1.0471976F;
        super.leftArmModel = new ModelRendererTurbo[10];
        super.leftArmModel[0] = new ModelRendererTurbo(this, 200, 720, this.textureX, this.textureY);
        super.leftArmModel[1] = new ModelRendererTurbo(this, 200, 750, this.textureX, this.textureY);
        super.leftArmModel[2] = new ModelRendererTurbo(this, 200, 780, this.textureX, this.textureY);
        super.leftArmModel[3] = new ModelRendererTurbo(this, 200, 810, this.textureX, this.textureY);
        super.leftArmModel[4] = new ModelRendererTurbo(this, 200, 830, this.textureX, this.textureY);
        super.leftArmModel[5] = new ModelRendererTurbo(this, 200, 830, this.textureX, this.textureY);
        super.leftArmModel[6] = new ModelRendererTurbo(this, 200, 850, this.textureX, this.textureY);
        super.leftArmModel[7] = new ModelRendererTurbo(this, 200, 850, this.textureX, this.textureY);
        super.leftArmModel[8] = new ModelRendererTurbo(this, 200, 850, this.textureX, this.textureY);
        super.leftArmModel[9] = new ModelRendererTurbo(this, 200, 870, this.textureX, this.textureY);
        super.leftArmModel[0].addBox(-16.0F, -5.0F, -6.0F, 31, 16, 12, 0.0F);
        super.leftArmModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.leftArmModel[0].rotateAngleZ = -1.5707964F;
        super.leftArmModel[1].addShapeBox(15.0F, -5.0F, -6.0F, 4, 12, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F,
                0.0F);
        super.leftArmModel[1].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.leftArmModel[1].rotateAngleZ = -1.5707964F;
        super.leftArmModel[2].addBox(19.0F, -5.0F, -6.0F, 19, 12, 12, 0.0F);
        super.leftArmModel[2].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.leftArmModel[2].rotateAngleZ = -1.5707964F;
        super.leftArmModel[3].addBox(38.0F, -3.0F, -4.0F, 10, 8, 8, 0.0F);
        super.leftArmModel[3].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.leftArmModel[3].rotateAngleZ = -1.5707964F;
        super.leftArmModel[4].addBox(5.0F, 11.0F, -3.0F, 6, 6, 6, 0.0F);
        super.leftArmModel[4].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.leftArmModel[4].rotateAngleZ = -1.5707964F;
        super.leftArmModel[5].addBox(-7.0F, 11.0F, -3.0F, 6, 6, 6, 0.0F);
        super.leftArmModel[5].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.leftArmModel[5].rotateAngleZ = -1.5707964F;
        super.leftArmModel[6].addShapeBox(-20.0F, -5.0F, -6.0F, 4, 4, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F,
                0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.leftArmModel[6].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.leftArmModel[6].rotateAngleZ = -1.5707964F;
        super.leftArmModel[7].addBox(-20.0F, -1.0F, -6.0F, 4, 4, 12, 0.0F);
        super.leftArmModel[7].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.leftArmModel[7].rotateAngleZ = -1.5707964F;
        super.leftArmModel[8].addShapeBox(-20.0F, 3.0F, -6.0F, 4, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F,
                -4.0F);
        super.leftArmModel[8].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.leftArmModel[8].rotateAngleZ = -1.5707964F;
        super.leftArmModel[9].addBox(-26.0F, -1.0F, -2.0F, 6, 4, 4, 0.0F);
        super.leftArmModel[9].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.leftArmModel[9].rotateAngleZ = -1.5707964F;
        super.rightArmModel = new ModelRendererTurbo[10];
        super.rightArmModel[0] = new ModelRendererTurbo(this, 200, 720, this.textureX, this.textureY);
        super.rightArmModel[1] = new ModelRendererTurbo(this, 200, 750, this.textureX, this.textureY);
        super.rightArmModel[2] = new ModelRendererTurbo(this, 200, 780, this.textureX, this.textureY);
        super.rightArmModel[3] = new ModelRendererTurbo(this, 200, 810, this.textureX, this.textureY);
        super.rightArmModel[4] = new ModelRendererTurbo(this, 200, 830, this.textureX, this.textureY);
        super.rightArmModel[5] = new ModelRendererTurbo(this, 200, 830, this.textureX, this.textureY);
        super.rightArmModel[6] = new ModelRendererTurbo(this, 200, 850, this.textureX, this.textureY);
        super.rightArmModel[7] = new ModelRendererTurbo(this, 200, 850, this.textureX, this.textureY);
        super.rightArmModel[8] = new ModelRendererTurbo(this, 200, 850, this.textureX, this.textureY);
        super.rightArmModel[9] = new ModelRendererTurbo(this, 200, 870, this.textureX, this.textureY);
        super.rightArmModel[0].addBox(-16.0F, -5.0F, -6.0F, 31, 16, 12, 0.0F);
        super.rightArmModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.rightArmModel[0].rotateAngleZ = -1.5707964F;
        super.rightArmModel[1].addShapeBox(15.0F, -5.0F, -6.0F, 4, 12, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F,
                0.0F);
        super.rightArmModel[1].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.rightArmModel[1].rotateAngleZ = -1.5707964F;
        super.rightArmModel[2].addBox(19.0F, -5.0F, -6.0F, 19, 12, 12, 0.0F);
        super.rightArmModel[2].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.rightArmModel[2].rotateAngleZ = -1.5707964F;
        super.rightArmModel[3].addBox(38.0F, -3.0F, -4.0F, 10, 8, 8, 0.0F);
        super.rightArmModel[3].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.rightArmModel[3].rotateAngleZ = -1.5707964F;
        super.rightArmModel[4].addBox(5.0F, 11.0F, -3.0F, 6, 6, 6, 0.0F);
        super.rightArmModel[4].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.rightArmModel[4].rotateAngleZ = -1.5707964F;
        super.rightArmModel[5].addBox(-7.0F, 11.0F, -3.0F, 6, 6, 6, 0.0F);
        super.rightArmModel[5].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.rightArmModel[5].rotateAngleZ = -1.5707964F;
        super.rightArmModel[6].addShapeBox(-20.0F, -5.0F, -6.0F, 4, 4, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F,
                0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.rightArmModel[6].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.rightArmModel[6].rotateAngleZ = -1.5707964F;
        super.rightArmModel[7].addBox(-20.0F, -1.0F, -6.0F, 4, 4, 12, 0.0F);
        super.rightArmModel[7].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.rightArmModel[7].rotateAngleZ = -1.5707964F;
        super.rightArmModel[8].addShapeBox(-20.0F, 3.0F, -6.0F, 4, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F,
                -4.0F);
        super.rightArmModel[8].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.rightArmModel[8].rotateAngleZ = -1.5707964F;
        super.rightArmModel[9].addBox(-26.0F, -1.0F, -2.0F, 6, 4, 4, 0.0F);
        super.rightArmModel[9].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.rightArmModel[9].rotateAngleZ = -1.5707964F;
        this.translateAll(0.0F, 0.0F, 0.0F);
        this.flipAll();
    }
}
