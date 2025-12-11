package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelHind extends ModelPlane {

    int textureX = 1024;
    int textureY = 1024;

    public ModelHind() {
        super.noseModel = new ModelRendererTurbo[21];
        super.noseModel[0] = new ModelRendererTurbo(this, 0, 96, this.textureX, this.textureY);
        super.noseModel[1] = new ModelRendererTurbo(this, 0, 141, this.textureX, this.textureY);
        super.noseModel[2] = new ModelRendererTurbo(this, 0, 141, this.textureX, this.textureY);
        super.noseModel[3] = new ModelRendererTurbo(this, 0, 141, this.textureX, this.textureY);
        super.noseModel[4] = new ModelRendererTurbo(this, 0, 141, this.textureX, this.textureY);
        super.noseModel[5] = new ModelRendererTurbo(this, 0, 170, this.textureX, this.textureY);
        super.noseModel[6] = new ModelRendererTurbo(this, 0, 170, this.textureX, this.textureY);
        super.noseModel[7] = new ModelRendererTurbo(this, 0, 180, this.textureX, this.textureY);
        super.noseModel[8] = new ModelRendererTurbo(this, 0, 180, this.textureX, this.textureY);
        super.noseModel[9] = new ModelRendererTurbo(this, 0, 200, this.textureX, this.textureY);
        super.noseModel[10] = new ModelRendererTurbo(this, 0, 300, this.textureX, this.textureY);
        super.noseModel[11] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        super.noseModel[12] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        super.noseModel[13] = new ModelRendererTurbo(this, 0, 360, this.textureX, this.textureY);
        super.noseModel[14] = new ModelRendererTurbo(this, 0, 380, this.textureX, this.textureY);
        super.noseModel[15] = new ModelRendererTurbo(this, 0, 410, this.textureX, this.textureY);
        super.noseModel[16] = new ModelRendererTurbo(this, 0, 410, this.textureX, this.textureY);
        super.noseModel[17] = new ModelRendererTurbo(this, 0, 430, this.textureX, this.textureY);
        super.noseModel[18] = new ModelRendererTurbo(this, 0, 430, this.textureX, this.textureY);
        super.noseModel[19] = new ModelRendererTurbo(this, 0, 450, this.textureX, this.textureY);
        super.noseModel[20] = new ModelRendererTurbo(this, 0, 450, this.textureX, this.textureY);
        super.noseModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 36, 13, 30, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, -4.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F,
                -4.0F);
        super.noseModel[0].setRotationPoint(-120.0F, -5.0F, -15.0F);
        super.noseModel[1].addBox(0.0F, 0.0F, 0.0F, 2, 2, 20, 0.0F);
        super.noseModel[1].setRotationPoint(-120.0F, -7.0F, -10.0F);
        super.noseModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 20, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.noseModel[2].setRotationPoint(-114.0F, -22.0F, -10.0F);
        super.noseModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 2, 13, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
        super.noseModel[3].setRotationPoint(-114.0F, -20.0F, -10.0F);
        super.noseModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 2, 13, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
        super.noseModel[4].setRotationPoint(-114.0F, -20.0F, 7.0F);
        super.noseModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 12, 2, 3, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F);
        super.noseModel[5].setRotationPoint(-112.0F, -26.0F, -10.0F);
        super.noseModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 12, 2, 3, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F);
        super.noseModel[6].setRotationPoint(-112.0F, -26.0F, 7.0F);
        super.noseModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 16, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F,
                -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
        super.noseModel[7].setRotationPoint(-100.0F, -26.0F, -10.0F);
        super.noseModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 16, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F,
                0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        super.noseModel[8].setRotationPoint(-100.0F, -26.0F, 7.0F);
        super.noseModel[9].addBox(0.0F, 0.0F, 0.0F, 33, 20, 30, 0.0F);
        super.noseModel[9].setRotationPoint(-84.0F, -12.0F, -15.0F);
        super.noseModel[10].addBox(0.0F, 0.0F, 0.0F, 4, 14, 22, 0.0F);
        super.noseModel[10].setRotationPoint(-84.0F, -26.0F, -11.0F);
        super.noseModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 33, 14, 4, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F,
                4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.noseModel[11].setRotationPoint(-84.0F, -26.0F, -15.0F);
        super.noseModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 33, 14, 4, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F,
                4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.noseModel[12].setRotationPoint(-84.0F, -26.0F, 11.0F);
        super.noseModel[13].addBox(0.0F, 0.0F, 0.0F, 11, 2, 14, 0.0F);
        super.noseModel[13].setRotationPoint(-69.0F, -19.0F, -7.0F);
        super.noseModel[14].addBox(0.0F, 0.0F, 0.0F, 2, 14, 14, 0.0F);
        super.noseModel[14].setRotationPoint(-60.0F, -33.0F, -7.0F);
        super.noseModel[15].addShapeBox(0.0F, 0.0F, 0.0F, 2, 12, 3, 0.0F, -7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F,
                0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.noseModel[15].setRotationPoint(-84.0F, -38.0F, -10.0F);
        super.noseModel[16].addShapeBox(0.0F, 0.0F, 0.0F, 2, 12, 3, 0.0F, -7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F,
                0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.noseModel[16].setRotationPoint(-84.0F, -38.0F, 7.0F);
        super.noseModel[17].addShapeBox(0.0F, 0.0F, 0.0F, 26, 2, 3, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F,
                2.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.noseModel[17].setRotationPoint(-77.0F, -40.0F, 7.0F);
        super.noseModel[18].addShapeBox(0.0F, 0.0F, 0.0F, 26, 2, 3, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F,
                2.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.noseModel[18].setRotationPoint(-77.0F, -40.0F, -10.0F);
        super.noseModel[19].addShapeBox(0.0F, 0.0F, 0.0F, 36, 21, 5, 0.0F, 0.0F, -19.0F, -4.0F, 0.0F, -4.0F, 0.0F, 0.0F,
                -4.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.noseModel[19].setRotationPoint(-120.0F, -26.0F, -15.0F);
        super.noseModel[20].addShapeBox(0.0F, 0.0F, 0.0F, 36, 21, 5, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F,
                -4.0F, 0.0F, 0.0F, -19.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -4.0F);
        super.noseModel[20].setRotationPoint(-120.0F, -26.0F, 10.0F);
        super.bodyModel = new ModelRendererTurbo[16];
        super.bodyModel[0] = new ModelRendererTurbo(this, 0, 480, this.textureX, this.textureY);
        super.bodyModel[1] = new ModelRendererTurbo(this, 0, 570, this.textureX, this.textureY);
        super.bodyModel[2] = new ModelRendererTurbo(this, 0, 630, this.textureX, this.textureY);
        super.bodyModel[3] = new ModelRendererTurbo(this, 0, 680, this.textureX, this.textureY);
        super.bodyModel[4] = new ModelRendererTurbo(this, 0, 730, this.textureX, this.textureY);
        super.bodyModel[5] = new ModelRendererTurbo(this, 0, 780, this.textureX, this.textureY);
        super.bodyModel[6] = new ModelRendererTurbo(this, 0, 850, this.textureX, this.textureY);
        super.bodyModel[7] = new ModelRendererTurbo(this, 0, 900, this.textureX, this.textureY);
        super.bodyModel[8] = new ModelRendererTurbo(this, 0, 900, this.textureX, this.textureY);
        super.bodyModel[9] = new ModelRendererTurbo(this, 0, 930, this.textureX, this.textureY);
        super.bodyModel[10] = new ModelRendererTurbo(this, 200, 100, this.textureX, this.textureY);
        super.bodyModel[11] = new ModelRendererTurbo(this, 200, 160, this.textureX, this.textureY);
        super.bodyModel[12] = new ModelRendererTurbo(this, 200, 200, this.textureX, this.textureY);
        super.bodyModel[13] = new ModelRendererTurbo(this, 200, 260, this.textureX, this.textureY);
        super.bodyModel[14] = new ModelRendererTurbo(this, 200, 300, this.textureX, this.textureY);
        super.bodyModel[15] = new ModelRendererTurbo(this, 200, 330, this.textureX, this.textureY);
        super.bodyModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 22, 52, 36, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -3.0F);
        super.bodyModel[0].setRotationPoint(-51.0F, -44.0F, -18.0F);
        super.bodyModel[1].addBox(0.0F, 0.0F, 0.0F, 50, 9, 36, 0.0F);
        super.bodyModel[1].setRotationPoint(-29.0F, -1.0F, -18.0F);
        super.bodyModel[2].addBox(0.0F, 0.0F, 0.0F, 62, 40, 2, 0.0F);
        super.bodyModel[2].setRotationPoint(-1.0F, -41.0F, -18.0F);
        super.bodyModel[3].addBox(0.0F, 0.0F, 0.0F, 62, 40, 2, 0.0F);
        super.bodyModel[3].setRotationPoint(-1.0F, -41.0F, 16.0F);
        super.bodyModel[4].addBox(0.0F, 0.0F, 0.0F, 40, 9, 36, 0.0F);
        super.bodyModel[4].setRotationPoint(21.0F, -1.0F, -18.0F);
        super.bodyModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 32, 43, 24, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 9.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 9.0F, 6.0F);
        super.bodyModel[5].setRotationPoint(61.0F, -44.0F, -12.0F);
        super.bodyModel[6].addBox(0.0F, 0.0F, 0.0F, 90, 3, 36, 0.0F);
        super.bodyModel[6].setRotationPoint(-29.0F, -44.0F, -18.0F);
        super.bodyModel[7].addBox(0.0F, 0.0F, 0.0F, 25, 12, 12, 0.0F);
        super.bodyModel[7].setRotationPoint(-51.0F, -56.0F, -14.0F);
        super.bodyModel[8].addBox(0.0F, 0.0F, 0.0F, 25, 12, 12, 0.0F);
        super.bodyModel[8].setRotationPoint(-51.0F, -56.0F, 2.0F);
        super.bodyModel[9].addShapeBox(0.0F, 0.0F, 0.0F, 60, 14, 36, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[9].setRotationPoint(-26.0F, -58.0F, -18.0F);
        super.bodyModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 27, 14, 36, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, -4.0F, -4.0F, 0.0F,
                -4.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.bodyModel[10].setRotationPoint(34.0F, -58.0F, -18.0F);
        super.bodyModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 32, 4, 24, 0.0F, 0.0F, 6.0F, 2.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F, -4.0F, 0.0F, 6.0F, 2.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F);
        super.bodyModel[11].setRotationPoint(61.0F, -48.0F, -12.0F);
        super.bodyModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 12, 12, 37, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.bodyModel[12].setRotationPoint(-18.0F, -57.0F, -18.5F);
        super.bodyModel[13].addBox(0.0F, 0.0F, 0.0F, 38, 4, 20, 0.0F);
        super.bodyModel[13].setRotationPoint(23.0F, -5.0F, -10.0F);
        super.bodyModel[14].addBox(0.0F, 0.0F, 0.0F, 38, 22, 4, 0.0F);
        super.bodyModel[14].setRotationPoint(23.0F, -27.0F, -2.0F);
        super.bodyModel[15].addShapeBox(0.0F, 0.0F, 0.0F, 40, 4, 20, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F);
        super.bodyModel[15].setRotationPoint(-16.0F, -62.0F, -10.0F);
        super.bodyModel[15].rotateAngleZ = -0.03490658F;
        super.tailModel = new ModelRendererTurbo[7];
        super.tailModel[0] = new ModelRendererTurbo(this, 200, 360, this.textureX, this.textureY);
        super.tailModel[1] = new ModelRendererTurbo(this, 200, 400, this.textureX, this.textureY);
        super.tailModel[2] = new ModelRendererTurbo(this, 200, 420, this.textureX, this.textureY);
        super.tailModel[3] = new ModelRendererTurbo(this, 200, 500, this.textureX, this.textureY);
        super.tailModel[4] = new ModelRendererTurbo(this, 200, 580, this.textureX, this.textureY);
        super.tailModel[5] = new ModelRendererTurbo(this, 200, 610, this.textureX, this.textureY);
        super.tailModel[6] = new ModelRendererTurbo(this, 200, 610, this.textureX, this.textureY);
        super.tailModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 114, 12, 8, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 23.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 23.0F, 6.0F);
        super.tailModel[0].setRotationPoint(108.0F, -44.0F, -4.0F);
        super.tailModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 114, 4, 8, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F);
        super.tailModel[1].setRotationPoint(108.0F, -48.0F, -4.0F);
        super.tailModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 50, 35, 4, 0.0F, -31.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F,
                0.0F, -1.0F, -31.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.tailModel[2].setRotationPoint(191.0F, -82.0F, -2.0F);
        super.tailModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 15, 35, 20, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 8.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 2.0F);
        super.tailModel[3].setRotationPoint(93.0F, -44.0F, -10.0F);
        super.tailModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 15, 4, 20, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F, -4.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F);
        super.tailModel[4].setRotationPoint(93.0F, -48.0F, -10.0F);
        super.tailModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 15, 4, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F,
                -1.0F, 0.0F, -5.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, -1.0F, 0.0F, -5.0F, -1.0F,
                0.0F);
        super.tailModel[5].setRotationPoint(196.0F, -44.0F, 4.0F);
        super.tailModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 15, 4, 30, 0.0F, -5.0F, -1.0F, 0.0F, -5.0F, -1.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, -1.0F, 0.0F, -5.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.tailModel[6].setRotationPoint(196.0F, -44.0F, -34.0F);
        super.leftWingModel = new ModelRendererTurbo[26];
        super.leftWingModel[0] = new ModelRendererTurbo(this, 200, 650, this.textureX, this.textureY);
        super.leftWingModel[1] = new ModelRendererTurbo(this, 200, 730, this.textureX, this.textureY);
        super.leftWingModel[2] = new ModelRendererTurbo(this, 200, 750, this.textureX, this.textureY);
        super.leftWingModel[3] = new ModelRendererTurbo(this, 200, 765, this.textureX, this.textureY);
        super.leftWingModel[4] = new ModelRendererTurbo(this, 200, 765, this.textureX, this.textureY);
        super.leftWingModel[5] = new ModelRendererTurbo(this, 200, 780, this.textureX, this.textureY);
        super.leftWingModel[6] = new ModelRendererTurbo(this, 200, 780, this.textureX, this.textureY);
        super.leftWingModel[7] = new ModelRendererTurbo(this, 200, 800, this.textureX, this.textureY);
        super.leftWingModel[8] = new ModelRendererTurbo(this, 200, 815, this.textureX, this.textureY);
        super.leftWingModel[9] = new ModelRendererTurbo(this, 200, 830, this.textureX, this.textureY);
        super.leftWingModel[10] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.leftWingModel[11] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.leftWingModel[12] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.leftWingModel[13] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.leftWingModel[14] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.leftWingModel[15] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.leftWingModel[16] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.leftWingModel[17] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.leftWingModel[18] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.leftWingModel[19] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.leftWingModel[20] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.leftWingModel[21] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.leftWingModel[22] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.leftWingModel[23] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.leftWingModel[24] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.leftWingModel[25] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.leftWingModel[0].addShapeBox(0.0F, 0.0F, -65.0F, 25, 6, 65, 0.0F, -7.5F, 0.0F, 0.0F, -7.5F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.5F, -3.0F, 0.0F, -7.5F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F);
        super.leftWingModel[0].setRotationPoint(14.0F, -35.0F, -18.0F);
        super.leftWingModel[0].rotateAngleX = 0.2617994F;
        super.leftWingModel[1].addBox(0.0F, 0.0F, 0.0F, 10, 12, 2, 0.0F);
        super.leftWingModel[1].setRotationPoint(21.5F, -18.3F, -81.0F);
        super.leftWingModel[2].addBox(0.0F, 0.0F, 0.0F, 10, 2, 8, 0.0F);
        super.leftWingModel[2].setRotationPoint(21.5F, -6.3F, -84.0F);
        super.leftWingModel[3].addBox(0.0F, 0.0F, 0.0F, 30, 3, 3, 0.0F);
        super.leftWingModel[3].setRotationPoint(11.5F, -6.8F, -87.0F);
        super.leftWingModel[4].addBox(0.0F, 0.0F, 0.0F, 30, 3, 3, 0.0F);
        super.leftWingModel[4].setRotationPoint(11.5F, -6.8F, -76.0F);
        super.leftWingModel[5].addBox(0.0F, 0.0F, 0.0F, 10, 14, 3, 0.0F);
        super.leftWingModel[5].setRotationPoint(21.5F, -29.0F, -37.0F);
        super.leftWingModel[6].addBox(0.0F, 0.0F, 0.0F, 10, 14, 3, 0.0F);
        super.leftWingModel[6].setRotationPoint(21.5F, -24.3F, -55.0F);
        super.leftWingModel[7].addBox(0.0F, 0.0F, 0.0F, 30, 4, 4, 0.0F);
        super.leftWingModel[7].setRotationPoint(14.5F, -16.0F, -37.5F);
        super.leftWingModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -1.5F, -1.5F, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F,
                -1.5F);
        super.leftWingModel[8].setRotationPoint(10.5F, -16.0F, -37.5F);
        super.leftWingModel[9].addBox(0.0F, 0.0F, 0.0F, 25, 9, 9, 0.0F);
        super.leftWingModel[9].setRotationPoint(16.5F, -10.3F, -58.0F);
        super.leftWingModel[10].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.leftWingModel[10].setRotationPoint(13.5F, -9.3F, -57.0F);
        super.leftWingModel[11].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.leftWingModel[11].setRotationPoint(13.5F, -9.3F, -55.0F);
        super.leftWingModel[12].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.leftWingModel[12].setRotationPoint(13.5F, -9.3F, -53.0F);
        super.leftWingModel[13].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.leftWingModel[13].setRotationPoint(13.5F, -9.3F, -51.0F);
        super.leftWingModel[14].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.leftWingModel[14].setRotationPoint(13.5F, -7.3F, -57.0F);
        super.leftWingModel[15].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.leftWingModel[15].setRotationPoint(13.5F, -7.3F, -55.0F);
        super.leftWingModel[16].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.leftWingModel[16].setRotationPoint(13.5F, -7.3F, -53.0F);
        super.leftWingModel[17].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.leftWingModel[17].setRotationPoint(13.5F, -7.3F, -51.0F);
        super.leftWingModel[18].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.leftWingModel[18].setRotationPoint(13.5F, -5.3F, -51.0F);
        super.leftWingModel[19].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.leftWingModel[19].setRotationPoint(13.5F, -5.3F, -53.0F);
        super.leftWingModel[20].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.leftWingModel[20].setRotationPoint(13.5F, -5.3F, -55.0F);
        super.leftWingModel[21].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.leftWingModel[21].setRotationPoint(13.5F, -5.3F, -57.0F);
        super.leftWingModel[22].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.leftWingModel[22].setRotationPoint(13.5F, -3.3F, -57.0F);
        super.leftWingModel[23].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.leftWingModel[23].setRotationPoint(13.5F, -3.3F, -55.0F);
        super.leftWingModel[24].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.leftWingModel[24].setRotationPoint(13.5F, -3.3F, -53.0F);
        super.leftWingModel[25].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.leftWingModel[25].setRotationPoint(13.5F, -3.3F, -51.0F);
        super.rightWingModel = new ModelRendererTurbo[26];
        super.rightWingModel[0] = new ModelRendererTurbo(this, 200, 650, this.textureX, this.textureY);
        super.rightWingModel[1] = new ModelRendererTurbo(this, 200, 730, this.textureX, this.textureY);
        super.rightWingModel[2] = new ModelRendererTurbo(this, 200, 750, this.textureX, this.textureY);
        super.rightWingModel[3] = new ModelRendererTurbo(this, 200, 765, this.textureX, this.textureY);
        super.rightWingModel[4] = new ModelRendererTurbo(this, 200, 765, this.textureX, this.textureY);
        super.rightWingModel[5] = new ModelRendererTurbo(this, 200, 780, this.textureX, this.textureY);
        super.rightWingModel[6] = new ModelRendererTurbo(this, 200, 780, this.textureX, this.textureY);
        super.rightWingModel[7] = new ModelRendererTurbo(this, 200, 800, this.textureX, this.textureY);
        super.rightWingModel[8] = new ModelRendererTurbo(this, 200, 815, this.textureX, this.textureY);
        super.rightWingModel[9] = new ModelRendererTurbo(this, 200, 830, this.textureX, this.textureY);
        super.rightWingModel[10] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.rightWingModel[11] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.rightWingModel[12] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.rightWingModel[13] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.rightWingModel[14] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.rightWingModel[15] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.rightWingModel[16] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.rightWingModel[17] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.rightWingModel[18] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.rightWingModel[19] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.rightWingModel[20] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.rightWingModel[21] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.rightWingModel[22] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.rightWingModel[23] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.rightWingModel[24] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.rightWingModel[25] = new ModelRendererTurbo(this, 300, 830, this.textureX, this.textureY);
        super.rightWingModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 25, 6, 65, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -7.5F, 0.0F, 0.0F, -7.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.5F, -3.0F, 0.0F, -7.5F,
                -3.0F, 0.0F);
        super.rightWingModel[0].setRotationPoint(14.0F, -35.0F, 18.0F);
        super.rightWingModel[0].rotateAngleX = -0.2617994F;
        super.rightWingModel[1].addBox(0.0F, 0.0F, 0.0F, 10, 12, 2, 0.0F);
        super.rightWingModel[1].setRotationPoint(21.5F, -18.3F, 79.0F);
        super.rightWingModel[2].addBox(0.0F, 0.0F, 0.0F, 10, 2, 8, 0.0F);
        super.rightWingModel[2].setRotationPoint(21.5F, -6.3F, 76.0F);
        super.rightWingModel[3].addBox(0.0F, 0.0F, 0.0F, 30, 3, 3, 0.0F);
        super.rightWingModel[3].setRotationPoint(11.5F, -6.8F, 84.0F);
        super.rightWingModel[4].addBox(0.0F, 0.0F, 0.0F, 30, 3, 3, 0.0F);
        super.rightWingModel[4].setRotationPoint(11.5F, -6.8F, 73.0F);
        super.rightWingModel[5].addBox(0.0F, 0.0F, 0.0F, 10, 14, 3, 0.0F);
        super.rightWingModel[5].setRotationPoint(21.5F, -29.0F, 34.0F);
        super.rightWingModel[6].addBox(0.0F, 0.0F, 0.0F, 10, 14, 3, 0.0F);
        super.rightWingModel[6].setRotationPoint(21.5F, -24.3F, 52.0F);
        super.rightWingModel[7].addBox(0.0F, 0.0F, 0.0F, 30, 4, 4, 0.0F);
        super.rightWingModel[7].setRotationPoint(14.5F, -16.0F, 33.5F);
        super.rightWingModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, -1.5F, -1.5F, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F,
                -1.5F);
        super.rightWingModel[8].setRotationPoint(10.5F, -16.0F, 33.5F);
        super.rightWingModel[9].addBox(0.0F, 0.0F, 0.0F, 25, 9, 9, 0.0F);
        super.rightWingModel[9].setRotationPoint(16.5F, -10.3F, 49.0F);
        super.rightWingModel[10].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.rightWingModel[10].setRotationPoint(13.5F, -9.3F, 56.0F);
        super.rightWingModel[11].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.rightWingModel[11].setRotationPoint(13.5F, -9.3F, 54.0F);
        super.rightWingModel[12].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.rightWingModel[12].setRotationPoint(13.5F, -9.3F, 52.0F);
        super.rightWingModel[13].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.rightWingModel[13].setRotationPoint(13.5F, -9.3F, 50.0F);
        super.rightWingModel[14].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.rightWingModel[14].setRotationPoint(13.5F, -7.3F, 56.0F);
        super.rightWingModel[15].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.rightWingModel[15].setRotationPoint(13.5F, -7.3F, 54.0F);
        super.rightWingModel[16].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.rightWingModel[16].setRotationPoint(13.5F, -7.3F, 52.0F);
        super.rightWingModel[17].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.rightWingModel[17].setRotationPoint(13.5F, -7.3F, 50.0F);
        super.rightWingModel[18].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.rightWingModel[18].setRotationPoint(13.5F, -5.3F, 56.0F);
        super.rightWingModel[19].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.rightWingModel[19].setRotationPoint(13.5F, -5.3F, 54.0F);
        super.rightWingModel[20].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.rightWingModel[20].setRotationPoint(13.5F, -5.3F, 52.0F);
        super.rightWingModel[21].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.rightWingModel[21].setRotationPoint(13.5F, -5.3F, 50.0F);
        super.rightWingModel[22].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.rightWingModel[22].setRotationPoint(13.5F, -3.3F, 56.0F);
        super.rightWingModel[23].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.rightWingModel[23].setRotationPoint(13.5F, -3.3F, 54.0F);
        super.rightWingModel[24].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.rightWingModel[24].setRotationPoint(13.5F, -3.3F, 52.0F);
        super.rightWingModel[25].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.rightWingModel[25].setRotationPoint(13.5F, -3.3F, 50.0F);
        super.heliMainRotorModels = new ModelRendererTurbo[1][7];
        super.heliMainRotorModels[0][0] = new ModelRendererTurbo(this, 200, 960, this.textureX, this.textureY);
        super.heliMainRotorModels[0][1] = new ModelRendererTurbo(this, 200, 980, this.textureX, this.textureY);
        super.heliMainRotorModels[0][2] = new ModelRendererTurbo(this, 200, 1000, this.textureX, this.textureY);
        super.heliMainRotorModels[0][3] = new ModelRendererTurbo(this, 200, 1000, this.textureX, this.textureY);
        super.heliMainRotorModels[0][4] = new ModelRendererTurbo(this, 200, 1000, this.textureX, this.textureY);
        super.heliMainRotorModels[0][5] = new ModelRendererTurbo(this, 200, 1000, this.textureX, this.textureY);
        super.heliMainRotorModels[0][6] = new ModelRendererTurbo(this, 200, 1000, this.textureX, this.textureY);
        super.heliMainRotorModels[0][0].addBox(-3.0F, -66.0F, -3.0F, 6, 5, 6, 0.0F);
        super.heliMainRotorModels[0][1].addBox(-4.0F, -71.0F, -4.0F, 8, 5, 8, 0.0F);
        super.heliMainRotorModels[0][2].addBox(0.0F, -70.0F, -3.0F, 160, 2, 6, 0.0F);
        super.heliMainRotorModels[0][3].addBox(0.0F, -70.0F, -3.0F, 160, 2, 6, 0.0F);
        super.heliMainRotorModels[0][3].rotateAngleY = 1.2566371F;
        super.heliMainRotorModels[0][4].addBox(0.0F, -70.0F, -3.0F, 160, 2, 6, 0.0F);
        super.heliMainRotorModels[0][4].rotateAngleY = -1.2566371F;
        super.heliMainRotorModels[0][5].addBox(0.0F, -70.0F, -3.0F, 160, 2, 6, 0.0F);
        super.heliMainRotorModels[0][5].rotateAngleY = 2.5132742F;
        super.heliMainRotorModels[0][6].addBox(0.0F, -70.0F, -3.0F, 160, 2, 6, 0.0F);
        super.heliMainRotorModels[0][6].rotateAngleY = -2.5132742F;
        super.heliMainRotorOrigins = new Vector3f[]{new Vector3f(0.0F, 3.0F, 0.0F)};
        super.heliTailRotorModels = new ModelRendererTurbo[1][3];
        super.heliTailRotorModels[0][0] = new ModelRendererTurbo(this, 200, 900, this.textureX, this.textureY);
        super.heliTailRotorModels[0][1] = new ModelRendererTurbo(this, 200, 920, this.textureX, this.textureY);
        super.heliTailRotorModels[0][2] = new ModelRendererTurbo(this, 200, 920, this.textureX, this.textureY);
        super.heliTailRotorModels[0][0].addBox(222.0F, -80.0F, -6.0F, 4, 4, 6, 0.0F);
        super.heliTailRotorModels[0][1].addBox(221.0F, -108.0F, -4.0F, 4, 30, 2, 0.0F);
        super.heliTailRotorModels[0][2].addBox(221.0F, -78.0F, -4.0F, 4, 30, 2, 0.0F);
        super.heliTailRotorOrigins = new Vector3f[]{new Vector3f(14.0F, 4.875F, -0.5F)};
        super.heliRotorSpeeds = new float[]{1.0F};
        super.bodyWheelModel = new ModelRendererTurbo[3];
        super.bodyWheelModel[0] = new ModelRendererTurbo(this, 400, 100, this.textureX, this.textureY);
        super.bodyWheelModel[1] = new ModelRendererTurbo(this, 400, 200, this.textureX, this.textureY);
        super.bodyWheelModel[2] = new ModelRendererTurbo(this, 400, 200, this.textureX, this.textureY);
        super.bodyWheelModel[0].addBox(0.0F, 0.0F, 0.0F, 4, 14, 4, 0.0F);
        super.bodyWheelModel[0].setRotationPoint(-77.0F, 8.0F, -2.0F);
        super.bodyWheelModel[1].addBox(0.0F, 0.0F, 0.0F, 10, 10, 3, 0.0F);
        super.bodyWheelModel[1].setRotationPoint(-80.0F, 17.0F, 2.0F);
        super.bodyWheelModel[2].addBox(0.0F, 0.0F, 0.0F, 10, 10, 3, 0.0F);
        super.bodyWheelModel[2].setRotationPoint(-80.0F, 17.0F, -5.0F);
        super.leftWingWheelModel = new ModelRendererTurbo[3];
        super.leftWingWheelModel[0] = new ModelRendererTurbo(this, 400, 240, this.textureX, this.textureY);
        super.leftWingWheelModel[1] = new ModelRendererTurbo(this, 400, 265, this.textureX, this.textureY);
        super.leftWingWheelModel[2] = new ModelRendererTurbo(this, 400, 300, this.textureX, this.textureY);
        super.leftWingWheelModel[0].addBox(0.0F, 0.0F, 0.0F, 14, 14, 6, 0.0F);
        super.leftWingWheelModel[0].setRotationPoint(19.0F, 13.0F, -35.0F);
        super.leftWingWheelModel[1].addBox(0.0F, -3.0F, -1.0F, 4, 4, 23, 0.0F);
        super.leftWingWheelModel[1].setRotationPoint(24.0F, 19.0F, -29.0F);
        super.leftWingWheelModel[1].rotateAngleX = 0.8901179F;
        super.leftWingWheelModel[2].addBox(0.0F, -3.0F, -1.0F, 2, 2, 23, 0.0F);
        super.leftWingWheelModel[2].setRotationPoint(25.0F, 21.0F, -29.0F);
        super.leftWingWheelModel[2].rotateAngleX = 0.6027204F;
        super.rightWingWheelModel = new ModelRendererTurbo[3];
        super.rightWingWheelModel[0] = new ModelRendererTurbo(this, 400, 240, this.textureX, this.textureY);
        super.rightWingWheelModel[1] = new ModelRendererTurbo(this, 400, 265, this.textureX, this.textureY);
        super.rightWingWheelModel[2] = new ModelRendererTurbo(this, 400, 300, this.textureX, this.textureY);
        super.rightWingWheelModel[0].addBox(0.0F, 0.0F, 0.0F, 14, 14, 6, 0.0F);
        super.rightWingWheelModel[0].setRotationPoint(19.0F, 13.0F, 29.0F);
        super.rightWingWheelModel[1].addBox(0.0F, -3.0F, -21.0F, 4, 4, 23, 0.0F);
        super.rightWingWheelModel[1].setRotationPoint(24.0F, 19.0F, 29.0F);
        super.rightWingWheelModel[1].rotateAngleX = -0.8901179F;
        super.rightWingWheelModel[2].addBox(0.0F, -3.0F, -23.0F, 2, 2, 23, 0.0F);
        super.rightWingWheelModel[2].setRotationPoint(25.0F, 21.0F, 29.0F);
        super.rightWingWheelModel[2].rotateAngleX = -0.6027145F;
        super.bodyDoorOpenModel = new ModelRendererTurbo[12];
        super.bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 400, 440, this.textureX, this.textureY);
        super.bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 400, 460, this.textureX, this.textureY);
        super.bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 400, 460, this.textureX, this.textureY);
        super.bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 400, 460, this.textureX, this.textureY);
        super.bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 400, 480, this.textureX, this.textureY);
        super.bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 400, 500, this.textureX, this.textureY);
        super.bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 400, 440, this.textureX, this.textureY);
        super.bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 400, 460, this.textureX, this.textureY);
        super.bodyDoorOpenModel[8] = new ModelRendererTurbo(this, 400, 460, this.textureX, this.textureY);
        super.bodyDoorOpenModel[9] = new ModelRendererTurbo(this, 400, 460, this.textureX, this.textureY);
        super.bodyDoorOpenModel[10] = new ModelRendererTurbo(this, 400, 480, this.textureX, this.textureY);
        super.bodyDoorOpenModel[11] = new ModelRendererTurbo(this, 400, 500, this.textureX, this.textureY);
        super.bodyDoorOpenModel[0].addBox(0.0F, 0.0F, 0.0F, 28, 7, 2, 0.0F);
        super.bodyDoorOpenModel[0].setRotationPoint(-29.0F, -41.0F, -18.0F);
        super.bodyDoorOpenModel[0].rotateAngleX = -1.396263F;
        super.bodyDoorOpenModel[1].addBox(0.0F, 7.0F, 0.0F, 5, 9, 2, 0.0F);
        super.bodyDoorOpenModel[1].setRotationPoint(-29.0F, -41.0F, -18.0F);
        super.bodyDoorOpenModel[1].rotateAngleX = -1.396263F;
        super.bodyDoorOpenModel[2].addBox(23.0F, 7.0F, 0.0F, 5, 9, 2, 0.0F);
        super.bodyDoorOpenModel[2].setRotationPoint(-29.0F, -41.0F, -18.0F);
        super.bodyDoorOpenModel[2].rotateAngleX = -1.396263F;
        super.bodyDoorOpenModel[3].addBox(13.0F, 7.0F, 0.0F, 2, 9, 2, 0.0F);
        super.bodyDoorOpenModel[3].setRotationPoint(-29.0F, -41.0F, -18.0F);
        super.bodyDoorOpenModel[3].rotateAngleX = -1.396263F;
        super.bodyDoorOpenModel[4].addBox(0.0F, 16.0F, 0.0F, 28, 2, 2, 0.0F);
        super.bodyDoorOpenModel[4].setRotationPoint(-29.0F, -41.0F, -18.0F);
        super.bodyDoorOpenModel[4].rotateAngleX = -1.396263F;
        super.bodyDoorOpenModel[5].addBox(0.0F, -22.0F, -2.0F, 28, 22, 2, 0.0F);
        super.bodyDoorOpenModel[5].setRotationPoint(-29.0F, -1.0F, -18.0F);
        super.bodyDoorOpenModel[5].rotateAngleX = 2.443461F;
        super.bodyDoorOpenModel[6].addBox(0.0F, 0.0F, -2.0F, 28, 7, 2, 0.0F);
        super.bodyDoorOpenModel[6].setRotationPoint(-29.0F, -41.0F, 18.0F);
        super.bodyDoorOpenModel[6].rotateAngleX = 1.396263F;
        super.bodyDoorOpenModel[7].addBox(0.0F, 7.0F, -2.0F, 5, 9, 2, 0.0F);
        super.bodyDoorOpenModel[7].setRotationPoint(-29.0F, -41.0F, 18.0F);
        super.bodyDoorOpenModel[7].rotateAngleX = 1.396263F;
        super.bodyDoorOpenModel[8].addBox(23.0F, 7.0F, -2.0F, 5, 9, 2, 0.0F);
        super.bodyDoorOpenModel[8].setRotationPoint(-29.0F, -41.0F, 18.0F);
        super.bodyDoorOpenModel[8].rotateAngleX = 1.396263F;
        super.bodyDoorOpenModel[9].addBox(13.0F, 7.0F, -2.0F, 2, 9, 2, 0.0F);
        super.bodyDoorOpenModel[9].setRotationPoint(-29.0F, -41.0F, 18.0F);
        super.bodyDoorOpenModel[9].rotateAngleX = 1.396263F;
        super.bodyDoorOpenModel[10].addBox(0.0F, 16.0F, -2.0F, 28, 2, 2, 0.0F);
        super.bodyDoorOpenModel[10].setRotationPoint(-29.0F, -41.0F, 18.0F);
        super.bodyDoorOpenModel[10].rotateAngleX = 1.396263F;
        super.bodyDoorOpenModel[11].addBox(0.0F, -22.0F, 0.0F, 28, 22, 2, 0.0F);
        super.bodyDoorOpenModel[11].setRotationPoint(-29.0F, -1.0F, 18.0F);
        super.bodyDoorOpenModel[11].rotateAngleX = -2.443461F;
        super.bodyDoorCloseModel = new ModelRendererTurbo[12];
        super.bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 400, 440, this.textureX, this.textureY);
        super.bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 400, 460, this.textureX, this.textureY);
        super.bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 400, 460, this.textureX, this.textureY);
        super.bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 400, 460, this.textureX, this.textureY);
        super.bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 400, 480, this.textureX, this.textureY);
        super.bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 400, 500, this.textureX, this.textureY);
        super.bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 400, 440, this.textureX, this.textureY);
        super.bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 400, 460, this.textureX, this.textureY);
        super.bodyDoorCloseModel[8] = new ModelRendererTurbo(this, 400, 460, this.textureX, this.textureY);
        super.bodyDoorCloseModel[9] = new ModelRendererTurbo(this, 400, 460, this.textureX, this.textureY);
        super.bodyDoorCloseModel[10] = new ModelRendererTurbo(this, 400, 480, this.textureX, this.textureY);
        super.bodyDoorCloseModel[11] = new ModelRendererTurbo(this, 400, 500, this.textureX, this.textureY);
        super.bodyDoorCloseModel[0].addBox(0.0F, 0.0F, 0.0F, 28, 7, 2, 0.0F);
        super.bodyDoorCloseModel[0].setRotationPoint(-29.0F, -41.0F, -18.0F);
        super.bodyDoorCloseModel[1].addBox(0.0F, 7.0F, 0.0F, 5, 9, 2, 0.0F);
        super.bodyDoorCloseModel[1].setRotationPoint(-29.0F, -41.0F, -18.0F);
        super.bodyDoorCloseModel[2].addBox(23.0F, 7.0F, 0.0F, 5, 9, 2, 0.0F);
        super.bodyDoorCloseModel[2].setRotationPoint(-29.0F, -41.0F, -18.0F);
        super.bodyDoorCloseModel[3].addBox(13.0F, 7.0F, 0.0F, 2, 9, 2, 0.0F);
        super.bodyDoorCloseModel[3].setRotationPoint(-29.0F, -41.0F, -18.0F);
        super.bodyDoorCloseModel[4].addBox(0.0F, 16.0F, 0.0F, 28, 2, 2, 0.0F);
        super.bodyDoorCloseModel[4].setRotationPoint(-29.0F, -41.0F, -18.0F);
        super.bodyDoorCloseModel[5].addBox(0.0F, -22.0F, 0.0F, 28, 22, 2, 0.0F);
        super.bodyDoorCloseModel[5].setRotationPoint(-29.0F, -1.0F, -18.0F);
        super.bodyDoorCloseModel[6].addBox(0.0F, 0.0F, -2.0F, 28, 7, 2, 0.0F);
        super.bodyDoorCloseModel[6].setRotationPoint(-29.0F, -41.0F, 18.0F);
        super.bodyDoorCloseModel[7].addBox(0.0F, 7.0F, -2.0F, 5, 9, 2, 0.0F);
        super.bodyDoorCloseModel[7].setRotationPoint(-29.0F, -41.0F, 18.0F);
        super.bodyDoorCloseModel[8].addBox(23.0F, 7.0F, -2.0F, 5, 9, 2, 0.0F);
        super.bodyDoorCloseModel[8].setRotationPoint(-29.0F, -41.0F, 18.0F);
        super.bodyDoorCloseModel[9].addBox(13.0F, 7.0F, -2.0F, 2, 9, 2, 0.0F);
        super.bodyDoorCloseModel[9].setRotationPoint(-29.0F, -41.0F, 18.0F);
        super.bodyDoorCloseModel[10].addBox(0.0F, 16.0F, -2.0F, 28, 2, 2, 0.0F);
        super.bodyDoorCloseModel[10].setRotationPoint(-29.0F, -41.0F, 18.0F);
        super.bodyDoorCloseModel[11].addBox(0.0F, -22.0F, -2.0F, 28, 22, 2, 0.0F);
        super.bodyDoorCloseModel[11].setRotationPoint(-29.0F, -1.0F, 18.0F);
        ModelRendererTurbo[][] noseGunModel = new ModelRendererTurbo[][]{new ModelRendererTurbo[4], null, null};
        noseGunModel[0][0] = new ModelRendererTurbo(this, 400, 550, this.textureX, this.textureY);
        noseGunModel[0][1] = new ModelRendererTurbo(this, 400, 600, this.textureX, this.textureY);
        noseGunModel[0][2] = new ModelRendererTurbo(this, 400, 600, this.textureX, this.textureY);
        noseGunModel[0][3] = new ModelRendererTurbo(this, 400, 640, this.textureX, this.textureY);
        noseGunModel[0][0].addBox(-10.0F, 0.0F, -10.0F, 20, 5, 20, 0.0F);
        noseGunModel[0][1].addShapeBox(-10.0F, 5.0F, -10.0F, 20, 5, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, -4.0F, -4.0F, 0.0F, -4.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F);
        noseGunModel[0][2].addShapeBox(-10.0F, 5.0F, 4.0F, 20, 5, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, -4.0F, -4.0F, 0.0F,
                -4.0F);
        noseGunModel[0][3].addShapeBox(-10.0F, 5.0F, -4.0F, 5, 5, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
        ModelRendererTurbo[] var2 = noseGunModel[0];
        int var3 = var2.length;

        int var4;
        ModelRendererTurbo noseGunPart;
        for (var4 = 0; var4 < var3; ++var4) {
            noseGunPart = var2[var4];
            noseGunPart.setRotationPoint(-102.0F, 0.0F, 0.0F);
        }

        noseGunModel[1] = new ModelRendererTurbo[0];
        noseGunModel[2] = new ModelRendererTurbo[5];
        noseGunModel[2][0] = new ModelRendererTurbo(this, 400, 660, this.textureX, this.textureY);
        noseGunModel[2][1] = new ModelRendererTurbo(this, 0, 96, this.textureX, this.textureY);
        noseGunModel[2][2] = new ModelRendererTurbo(this, 400, 680, this.textureX, this.textureY);
        noseGunModel[2][3] = new ModelRendererTurbo(this, 400, 680, this.textureX, this.textureY);
        noseGunModel[2][4] = new ModelRendererTurbo(this, 400, 700, this.textureX, this.textureY);
        noseGunModel[2][0].addBox(-5.0F, -2.0F, -4.0F, 7, 5, 8, 0.0F);
        noseGunModel[2][1].addBox(2.0F, -1.0F, -2.5F, 7, 3, 5, 0.0F);
        noseGunModel[2][2].addBox(9.0F, 0.0F, -1.5F, 25, 1, 1, 0.0F);
        noseGunModel[2][3].addBox(9.0F, 0.0F, 0.5F, 25, 1, 1, 0.0F);
        noseGunModel[2][4].addBox(21.0F, -0.5F, -2.0F, 4, 2, 4, 0.0F);
        var2 = noseGunModel[2];
        var3 = var2.length;

        for (var4 = 0; var4 < var3; ++var4) {
            noseGunPart = var2[var4];
            noseGunPart.setRotationPoint(-102.0F, 7.0F, 0.0F);
        }

        this.registerGunModel("Nose", noseGunModel);
        this.flipAll();
    }

    private ModelRendererTurbo[] makeProp(int i, int j, int k) {
        ModelRendererTurbo[] prop = new ModelRendererTurbo[0];
        return prop;
    }
}
