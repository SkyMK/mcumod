package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelG43 extends ModelGun {

    int textureX = 64;
    int textureY = 64;

    public ModelG43() {
        super.gunModel = new ModelRendererTurbo[27];
        super.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        super.gunModel[8] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
        super.gunModel[9] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
        super.gunModel[10] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
        super.gunModel[11] = new ModelRendererTurbo(this, 33, 33, this.textureX, this.textureY);
        super.gunModel[12] = new ModelRendererTurbo(this, 41, 33, this.textureX, this.textureY);
        super.gunModel[13] = new ModelRendererTurbo(this, 49, 33, this.textureX, this.textureY);
        super.gunModel[14] = new ModelRendererTurbo(this, 9, 41, this.textureX, this.textureY);
        super.gunModel[15] = new ModelRendererTurbo(this, 17, 41, this.textureX, this.textureY);
        super.gunModel[16] = new ModelRendererTurbo(this, 25, 41, this.textureX, this.textureY);
        super.gunModel[17] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
        super.gunModel[18] = new ModelRendererTurbo(this, 49, 41, this.textureX, this.textureY);
        super.gunModel[19] = new ModelRendererTurbo(this, 33, 49, this.textureX, this.textureY);
        super.gunModel[20] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
        super.gunModel[21] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        super.gunModel[22] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        super.gunModel[23] = new ModelRendererTurbo(this, 50, 15, this.textureX, this.textureY);
        super.gunModel[24] = new ModelRendererTurbo(this, 1, 45, this.textureX, this.textureY);
        super.gunModel[25] = new ModelRendererTurbo(this, 24, 12, this.textureX, this.textureY);
        super.gunModel[26] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
        super.gunModel[0].addShapeBox(0.0F, -1.0F, 0.0F, 18, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
        super.gunModel[0].setRotationPoint(8.0F, -4.0F, -1.5F);
        super.gunModel[1].addBox(0.0F, -4.0F, 0.0F, 8, 3, 3, 0.0F);
        super.gunModel[1].setRotationPoint(0.0F, -1.0F, -1.5F);
        super.gunModel[2].addShapeBox(0.0F, -1.0F, 0.0F, 2, 3, 2, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F,
                -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[2].setRotationPoint(26.0F, -5.0F, -1.0F);
        super.gunModel[3].addBox(0.0F, -1.0F, 0.0F, 8, 1, 1, 0.0F);
        super.gunModel[3].setRotationPoint(28.0F, -4.0F, -0.5F);
        super.gunModel[4].addShapeBox(0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F,
                0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F,
                -0.4F);
        super.gunModel[4].setRotationPoint(34.5F, -4.75F, -0.5F);
        super.gunModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 8, 3, 2, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F,
                -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F,
                0.0F);
        super.gunModel[5].setRotationPoint(0.0F, -6.0F, -1.0F);
        super.gunModel[6].addShapeBox(0.0F, -1.0F, 0.0F, 12, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F,
                0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[6].setRotationPoint(14.0F, -5.0F, -1.5F);
        super.gunModel[7].addShapeBox(0.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F,
                -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F,
                -0.2F, -0.4F);
        super.gunModel[7].setRotationPoint(34.5F, -5.75F, 1.5F);
        super.gunModel[7].rotateAngleX = 1.5707964F;
        super.gunModel[8].addShapeBox(0.0F, -1.0F, 0.0F, 3, 1, 3, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F,
                -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.22F, 0.0F, -0.1F, -0.22F, 0.0F, -0.1F, -0.22F, 0.0F,
                -0.1F, -0.22F);
        super.gunModel[8].setRotationPoint(11.0F, -5.0F, -1.5F);
        super.gunModel[9].addShapeBox(0.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F,
                -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F,
                -0.4F, -0.4F);
        super.gunModel[9].setRotationPoint(-0.25F, -4.0F, -0.5F);
        super.gunModel[10].addShapeBox(0.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F,
                -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F,
                -0.1F, -0.4F);
        super.gunModel[10].setRotationPoint(34.5F, -5.2F, -0.13F);
        super.gunModel[11].addShapeBox(0.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F,
                -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F, -0.1F, -0.4F, 0.0F,
                -0.1F, -0.4F);
        super.gunModel[11].setRotationPoint(34.5F, -5.2F, -0.87F);
        super.gunModel[12].addShapeBox(0.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F,
                -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F,
                -0.2F, -0.4F);
        super.gunModel[12].setRotationPoint(34.5F, -6.7F, 1.5F);
        super.gunModel[12].rotateAngleX = 1.5707964F;
        super.gunModel[13].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, -0.7F, 0.0F,
                -0.3F, -0.7F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, -0.7F, 0.0F,
                -0.3F, -0.7F);
        super.gunModel[13].setRotationPoint(11.0F, -6.5F, -1.0F);
        super.gunModel[13].rotateAngleZ = -0.05235988F;
        super.gunModel[14].addShapeBox(0.0F, -1.0F, 0.0F, 1, 3, 2, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F,
                -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[14].setRotationPoint(28.0F, -5.0F, -1.0F);
        super.gunModel[15].addShapeBox(0.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F,
                0.0F, -0.4F, 0.0F, -1.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F,
                -0.4F);
        super.gunModel[15].setRotationPoint(33.5F, -3.75F, -0.5F);
        super.gunModel[16].addShapeBox(0.0F, 0.0F, 0.0F, 5, 3, 3, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
        super.gunModel[16].setRotationPoint(-6.0F, -5.0F, -1.5F);
        super.gunModel[17].addShapeBox(0.0F, 0.0F, 0.0F, 9, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F);
        super.gunModel[17].setRotationPoint(-15.0F, -3.5F, -1.5F);
        super.gunModel[18].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[18].setRotationPoint(-8.0F, -4.5F, -1.5F);
        super.gunModel[19].addShapeBox(0.0F, 0.0F, 0.0F, 7, 1, 3, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[19].setRotationPoint(-15.0F, -4.5F, -1.5F);
        super.gunModel[20].addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
        super.gunModel[20].setRotationPoint(-1.0F, -5.0F, -1.5F);
        super.gunModel[21].addShapeBox(0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F,
                -0.2F, 0.0F, -0.3F, -0.2F, 0.0F, -0.3F, -0.2F, 0.0F, -0.3F, -0.2F, 0.0F, -0.3F, -0.2F, 0.0F, -0.3F,
                -0.2F, 0.0F);
        super.gunModel[21].setRotationPoint(10.63F, -5.5F, -0.7F);
        super.gunModel[22].addShapeBox(0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, -0.3F, -0.2F, 0.0F, -0.3F, -0.2F, 0.0F, -0.3F,
                0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -0.2F, 0.0F, -0.3F, -0.2F, 0.0F, -0.3F, -0.2F, 0.0F, -0.3F, -0.2F,
                0.0F);
        super.gunModel[22].setRotationPoint(10.63F, -5.5F, -0.3F);
        super.gunModel[23].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F,
                0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F,
                0.0F, -0.2F);
        super.gunModel[23].setRotationPoint(0.0F, -2.0F, -0.5F);
        super.gunModel[23].rotateAngleZ = 0.15707964F;
        super.gunModel[24].addBox(0.0F, 2.5F, 0.0F, 3, 2, 1, 0.0F);
        super.gunModel[24].setRotationPoint(-1.0F, -5.0F, -0.5F);
        super.gunModel[25].addShapeBox(0.0F, 0.0F, 0.0F, 6, 1, 2, 0.0F, 0.0F, -0.3F, 0.1F, 0.0F, -0.3F, 0.1F, 0.0F,
                -0.3F, 0.1F, 0.0F, -0.3F, 0.1F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F,
                0.3F);
        super.gunModel[25].setRotationPoint(9.0F, -5.5F, -1.0F);
        super.gunModel[26].addShapeBox(0.0F, 0.0F, 0.0F, 8, 3, 2, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F,
                -0.3F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -1.3F, 0.0F, 0.0F, -1.3F, 0.0F, 0.0F, -1.3F, -1.0F, 0.0F, -1.3F,
                -1.0F);
        super.gunModel[26].setRotationPoint(0.0F, -5.5F, -1.7F);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        super.ammoModel[0].addBox(8.0F, -2.0F, -0.5F, 5, 4, 1, 0.0F);
        super.ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.ammoModel[0].rotateAngleZ = 0.13962634F;
        super.slideModel = new ModelRendererTurbo[4];
        super.slideModel[0] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
        super.slideModel[1] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
        super.slideModel[2] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
        super.slideModel[3] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
        super.slideModel[0].addShapeBox(0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.slideModel[0].setRotationPoint(8.0F, -5.0F, -1.5F);
        super.slideModel[1].addShapeBox(0.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F,
                -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F, -0.2F, -0.4F, 0.0F,
                -0.2F, -0.4F);
        super.slideModel[1].setRotationPoint(9.0F, -5.0F, -1.5F);
        super.slideModel[2].addShapeBox(0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F,
                -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F,
                -0.2F, -0.2F, -0.5F);
        super.slideModel[2].setRotationPoint(8.0F, -5.0F, 1.25F);
        super.slideModel[2].rotateAngleX = 0.7853982F;
        super.slideModel[2].rotateAngleY = 0.01745329F;
        super.slideModel[3].addShapeBox(0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F,
                0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F,
                -0.3F);
        super.slideModel[3].setRotationPoint(8.0F, -5.75F, 2.0F);
        super.slideModel[3].rotateAngleX = 0.7853982F;
        super.slideModel[3].rotateAngleY = 0.01745329F;
        super.barrelAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
        super.stockAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
        super.scopeAttachPoint = new Vector3f(0.1875F, 0.5F, 0.0F);
        super.gripAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
        super.gunSlideDistance = 0.5F;
        super.animationType = EnumAnimationType.BOTTOM_CLIP;
        this.translateAll(0.0F, -4.0F, 0.0F);
        this.flipAll();
    }
}
