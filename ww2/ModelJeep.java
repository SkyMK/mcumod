package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelJeep extends ModelVehicle {

    public ModelJeep() {
        short textureX = 128;
        short textureY = 128;
        super.bodyModel = new ModelRendererTurbo[11];
        super.bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.bodyModel[1] = new ModelRendererTurbo(this, 0, 94, textureX, textureY);
        super.bodyModel[2] = new ModelRendererTurbo(this, 0, 40, textureX, textureY);
        super.bodyModel[3] = new ModelRendererTurbo(this, 0, 40, textureX, textureY);
        super.bodyModel[4] = new ModelRendererTurbo(this, 60, 12, textureX, textureY);
        super.bodyModel[5] = new ModelRendererTurbo(this, 0, 43, textureX, textureY);
        super.bodyModel[6] = new ModelRendererTurbo(this, 60, 0, textureX, textureY);
        super.bodyModel[7] = new ModelRendererTurbo(this, 60, 0, textureX, textureY);
        super.bodyModel[8] = new ModelRendererTurbo(this, 32, 49, textureX, textureY);
        super.bodyModel[9] = new ModelRendererTurbo(this, 90, 28, textureX, textureY);
        super.bodyModel[10] = new ModelRendererTurbo(this, 66, 49, textureX, textureY);
        super.bodyModel[0].addBox(8.0F, -10.0F, -14.0F, 16, 12, 28, 0.0F);
        super.bodyModel[1].addBox(-24.0F, 0.0F, -16.0F, 32, 2, 32, 0.0F);
        super.bodyModel[2].addBox(8.0F, -4.0F, -16.0F, 16, 1, 2, 0.0F);
        super.bodyModel[3].addBox(8.0F, -4.0F, 14.0F, 16, 1, 2, 0.0F);
        super.bodyModel[4].addBox(-6.0F, -8.0F, -14.0F, 1, 8, 28, 0.0F);
        super.bodyModel[5].addBox(-24.0F, -10.0F, -14.0F, 4, 10, 28, 0.0F);
        super.bodyModel[6].addBox(-24.0F, -10.0F, -16.0F, 32, 10, 2, 0.0F);
        super.bodyModel[7].addBox(-24.0F, -10.0F, -16.0F, 32, 10, 2, 0.0F);
        super.bodyModel[7].doMirror(false, false, true);
        super.bodyModel[8].addBox(8.0F, -18.0F, -16.0F, 1, 8, 32, 0.0F);
        super.bodyModel[9].addBox(-4.0F, -4.0F, -1.0F, 8, 8, 2, 0.0F);
        super.bodyModel[9].rotateAngleY = 1.5707964F;
        super.bodyModel[9].setRotationPoint(-25.0F, -6.0F, 0.0F);
        super.bodyModel[10].addBox(-6.0F, -22.0F, -0.5F, 1, 14, 1, 0.0F);
        super.leftBackWheelModel = new ModelRendererTurbo[1];
        super.leftBackWheelModel[0] = new ModelRendererTurbo(this, 90, 22, textureX, textureY);
        super.leftBackWheelModel[0].addBox(-20.0F, 2.0F, -15.0F, 8, 4, 2, 0.0F);
        super.rightBackWheelModel = new ModelRendererTurbo[1];
        super.rightBackWheelModel[0] = new ModelRendererTurbo(this, 90, 22, textureX, textureY);
        super.rightBackWheelModel[0].addBox(-20.0F, 2.0F, 13.0F, 8, 4, 2, 0.0F);
        super.leftFrontWheelModel = new ModelRendererTurbo[1];
        super.leftFrontWheelModel[0] = new ModelRendererTurbo(this, 90, 28, textureX, textureY);
        super.leftFrontWheelModel[0].addBox(-4.0F, -4.0F, -1.0F, 8, 8, 2, 0.0F);
        super.leftFrontWheelModel[0].setRotationPoint(16.0F, 2.0F, 15.0F);
        super.rightFrontWheelModel = new ModelRendererTurbo[1];
        super.rightFrontWheelModel[0] = new ModelRendererTurbo(this, 90, 28, textureX, textureY);
        super.rightFrontWheelModel[0].addBox(-4.0F, -4.0F, -1.0F, 8, 8, 2, 0.0F);
        super.rightFrontWheelModel[0].setRotationPoint(16.0F, 2.0F, -15.0F);
        ModelRendererTurbo[][] browningModel = new ModelRendererTurbo[][]{new ModelRendererTurbo[0],
                new ModelRendererTurbo[4], null};
        browningModel[1][0] = new ModelRendererTurbo(this, 66, 73, textureX, textureY);
        browningModel[1][1] = new ModelRendererTurbo(this, 66, 79, textureX, textureY);
        browningModel[1][2] = new ModelRendererTurbo(this, 80, 68, textureX, textureY);
        browningModel[1][3] = new ModelRendererTurbo(this, 66, 64, textureX, textureY);
        browningModel[1][0].addBox(-7.0F, -1.5F, -1.5F, 12, 3, 3);
        browningModel[1][1].addBox(5.0F, -0.5F, -0.5F, 10, 1, 1);
        browningModel[1][2].addBox(-9.0F, 0.0F, -1.0F, 2, 3, 2);
        browningModel[1][3].addBox(1.0F, -1.0F, -6.0F, 2, 4, 5);
        ModelRendererTurbo[] var4 = browningModel[1];
        int var5 = var4.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            ModelRendererTurbo gunPart = var4[var6];
            gunPart.setRotationPoint(-6.0F, -22.0F, 0.0F);
        }

        browningModel[2] = new ModelRendererTurbo[0];
        this.registerGunModel("Browning", browningModel);
        this.flipAll();
        this.translateAll(0, -4, 0);
    }
}
