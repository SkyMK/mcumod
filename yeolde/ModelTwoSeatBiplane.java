package com.flansmod.client.model.yeolde;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelTwoSeatBiplane extends ModelPlane {

    public ModelTwoSeatBiplane() {
        short textureX = 128;
        byte textureY = 64;
        super.propellerModels = new ModelRendererTurbo[1][3];
        super.propellerModels[0][0] = new ModelRendererTurbo(this, 56, 8, textureX, textureY);
        super.propellerModels[0][1] = new ModelRendererTurbo(this, 56, 8, textureX, textureY);
        super.propellerModels[0][2] = new ModelRendererTurbo(this, 56, 8, textureX, textureY);
        super.propellerModels[0][0].addBox(-1.0F, 2.0F, -1.0F, 2, 5, 2, 0.0F);
        super.propellerModels[0][1].addBox(-1.0F, 2.0F, -1.0F, 2, 5, 2, 0.0F);
        super.propellerModels[0][2].addBox(-1.0F, 2.0F, -1.0F, 2, 5, 2, 0.0F);
        super.propellerModels[0][0].setRotationPoint(-14.0F, 0.0F, 0.0F);
        super.propellerModels[0][1].setRotationPoint(-14.0F, 0.0F, 0.0F);
        super.propellerModels[0][2].setRotationPoint(-14.0F, 0.0F, 0.0F);
        super.yawFlapModel = new ModelRendererTurbo[1];
        super.yawFlapModel[0] = new ModelRendererTurbo(this, 104, 0, textureX, textureY);
        super.yawFlapModel[0].addBox(0.0F, 0.0F, 0.0F, 10, 10, 2, 0.0F);
        super.yawFlapModel[0].setPosition(44.0F, -12.0F, -1.0F);
        super.pitchFlapLeftModel = new ModelRendererTurbo[1];
        super.pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 104, 0, textureX, textureY);
        super.pitchFlapLeftModel[0].addBox(0.0F, 0.0F, 0.0F, 10, 15, 2, 0.0F);
        super.pitchFlapLeftModel[0].rotateAngleX = 1.570796F;
        super.pitchFlapLeftModel[0].setPosition(44.0F, 3.0F, -15.0F);
        super.pitchFlapRightModel = new ModelRendererTurbo[1];
        super.pitchFlapRightModel[0] = new ModelRendererTurbo(this, 104, 0, textureX, textureY);
        super.pitchFlapRightModel[0].addBox(0.0F, 0.0F, 0.0F, 10, 15, 2, 0.0F);
        super.pitchFlapRightModel[0].rotateAngleX = 1.570796F;
        super.pitchFlapRightModel[0].setPosition(44.0F, 3.0F, 0.0F);
        super.bodyModel = new ModelRendererTurbo[6];
        super.bodyModel[0] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
        super.bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.bodyModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.bodyModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.bodyModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.bodyModel[5] = new ModelRendererTurbo(this, 44, 0, textureX, textureY);
        byte length = 24;
        byte sidePieceHeight = 6;
        byte width = 20;
        byte boatDepth = 4;
        super.bodyModel[0].addBox((float) (-length / 2), (float) (-width / 2 + 2), -3.0F, length, width - 4, 4, 0.0F);
        super.bodyModel[0].setPosition(0.0F, boatDepth, 0.0F);
        super.bodyModel[1].addBox((float) (-length / 2 + 2), (float) (-sidePieceHeight - 1), -1.0F, length - 4,
                sidePieceHeight, 2, 0.0F);
        super.bodyModel[1].setPosition((float) (-length / 2 + 1), boatDepth, 0.0F);
        super.bodyModel[2].addBox((float) (-length / 2 + 2), (float) (-sidePieceHeight - 1), -1.0F, length - 4,
                sidePieceHeight, 2, 0.0F);
        super.bodyModel[2].setPosition((float) (length / 2 - 1), boatDepth, 0.0F);
        super.bodyModel[3].addBox((float) (-length / 2 + 2), (float) (-sidePieceHeight - 1), -1.0F, length - 4,
                sidePieceHeight, 2, 0.0F);
        super.bodyModel[3].setPosition(0.0F, boatDepth, (float) (-width / 2 + 1));
        super.bodyModel[4].addBox((float) (-length / 2 + 2), (float) (-sidePieceHeight - 1), -1.0F, length - 4,
                sidePieceHeight, 2, 0.0F);
        super.bodyModel[4].setPosition(0.0F, boatDepth, (float) (width / 2 - 1));
        super.bodyModel[5].addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        super.bodyModel[5].setPosition(-15.0F, -2.0F, -2.0F);
        super.bodyModel[0].rotateAngleX = 1.570796F;
        super.bodyModel[1].rotateAngleY = 4.712389F;
        super.bodyModel[2].rotateAngleY = 1.570796F;
        super.bodyModel[3].rotateAngleY = 3.141593F;
        super.bayModel = new ModelRendererTurbo[5];
        super.bayModel[0] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
        super.bayModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.bayModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.bayModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.bayModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.bayModel[0].addBox((float) (-length / 2), (float) (-width / 2 + 2), -3.0F, length, width - 4, 4, 0.0F);
        super.bayModel[0].setPosition(length, boatDepth, 0.0F);
        super.bayModel[1].addBox((float) (-length / 2 + 2), (float) (-sidePieceHeight - 1), -1.0F, length - 4,
                sidePieceHeight, 2, 0.0F);
        super.bayModel[1].setPosition((float) (length - length / 2 + 1), boatDepth, 0.0F);
        super.bayModel[2].addBox((float) (-length / 2 + 2), (float) (-sidePieceHeight - 1), -1.0F, length - 4,
                sidePieceHeight, 2, 0.0F);
        super.bayModel[2].setPosition((float) (length + length / 2 - 1), boatDepth, 0.0F);
        super.bayModel[3].addBox((float) (-length / 2 + 2), (float) (-sidePieceHeight - 1), -1.0F, length - 4,
                sidePieceHeight, 2, 0.0F);
        super.bayModel[3].setPosition(length, boatDepth, (float) (-width / 2 + 1));
        super.bayModel[4].addBox((float) (-length / 2 + 2), (float) (-sidePieceHeight - 1), -1.0F, length - 4,
                sidePieceHeight, 2, 0.0F);
        super.bayModel[4].setPosition(length, boatDepth, (float) (width / 2 - 1));
        super.bayModel[0].rotateAngleX = 1.570796F;
        super.bayModel[1].rotateAngleY = 4.712389F;
        super.bayModel[2].rotateAngleY = 1.570796F;
        super.bayModel[3].rotateAngleY = 3.141593F;
        super.bodyWheelModel = new ModelRendererTurbo[4];
        super.bodyWheelModel[0] = new ModelRendererTurbo(this, 0, 32, textureX, textureY);
        super.bodyWheelModel[1] = new ModelRendererTurbo(this, 0, 32, textureX, textureY);
        super.bodyWheelModel[2] = new ModelRendererTurbo(this, 56, 15, textureX, textureY);
        super.bodyWheelModel[3] = new ModelRendererTurbo(this, 56, 15, textureX, textureY);
        super.bodyWheelModel[0].addBox(-4.0F, 11.0F, 5.0F, 4, 4, 2, 0.0F);
        super.bodyWheelModel[1].addBox(-4.0F, 11.0F, -7.0F, 4, 4, 2, 0.0F);
        super.bodyWheelModel[2].addBox(-3.0F, 6.0F, 5.0F, 2, 5, 2, 0.0F);
        super.bodyWheelModel[3].addBox(-3.0F, 6.0F, -7.0F, 2, 5, 2, 0.0F);
        super.rightWingModel = new ModelRendererTurbo[2];
        super.rightWingModel[0] = new ModelRendererTurbo(this, 64, 0, textureX, textureY);
        super.rightWingModel[1] = new ModelRendererTurbo(this, 56, 15, textureX, textureY);
        super.rightWingModel[0].addBox(0.0F, 0.0F, 0.0F, 18, 41, 2, 0.0F);
        super.rightWingModel[0].rotateAngleX = -1.570796F;
        super.rightWingModel[0].setPosition(-9.0F, 0.0F, -9.0F);
        super.rightWingModel[1].addBox(-1.0F, -18.0F, -40.0F, 2, 18, 2, 0.0F);
        super.leftWingModel = new ModelRendererTurbo[2];
        super.leftWingModel[0] = new ModelRendererTurbo(this, 64, 0, textureX, textureY);
        super.leftWingModel[1] = new ModelRendererTurbo(this, 56, 15, textureX, textureY);
        super.leftWingModel[0].addBox(0.0F, 0.0F, 0.0F, 18, 41, 2, 0.0F);
        super.leftWingModel[0].rotateAngleX = -1.570796F;
        super.leftWingModel[0].setPosition(-9.0F, 0.0F, 50.0F);
        super.leftWingModel[1].addBox(-1.0F, -18.0F, 38.0F, 2, 18, 2, 0.0F);
        super.topWingModel = new ModelRendererTurbo[3];
        super.topWingModel[0] = new ModelRendererTurbo(this, 64, 0, textureX, textureY);
        super.topWingModel[1] = new ModelRendererTurbo(this, 64, 0, textureX, textureY);
        super.topWingModel[2] = new ModelRendererTurbo(this, 64, 0, textureX, textureY);
        super.topWingModel[0].addBox(0.0F, 0.0F, 0.0F, 18, 18, 2, 0.0F);
        super.topWingModel[0].rotateAngleX = -1.570796F;
        super.topWingModel[0].setPosition(-9.0F, -20.0F, 9.0F);
        super.topWingModel[1].addBox(0.0F, 0.0F, 0.0F, 18, 41, 2, 0.0F);
        super.topWingModel[1].rotateAngleX = -1.570796F;
        super.topWingModel[1].setPosition(-9.0F, -20.0F, 50.0F);
        super.topWingModel[2].addBox(0.0F, 0.0F, 0.0F, 18, 41, 2, 0.0F);
        super.topWingModel[2].rotateAngleX = -1.570796F;
        super.topWingModel[2].setPosition(-9.0F, -20.0F, -9.0F);
        super.tailModel = new ModelRendererTurbo[1];
        super.tailModel[0] = new ModelRendererTurbo(this, 0, 43, textureX, textureY);
        super.tailModel[0].addBox(35.0F, -2.0F, -5.0F, 20, 8, 10, 0.0F);
        super.tailWheelModel = new ModelRendererTurbo[1];
        super.tailWheelModel[0] = new ModelRendererTurbo(this, 0, 32, textureX, textureY);
        super.tailWheelModel[0].addBox(44.0F, 6.0F, -1.0F, 4, 4, 2, 0.0F);
        this.flipAll();
    }
}
