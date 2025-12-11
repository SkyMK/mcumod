package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelFg42 extends ModelGun {

    int textureX = 512;
    int textureY = 512;

    public ModelFg42() {
        super.gunModel = new ModelRendererTurbo[11];
        super.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
        super.gunModel[8] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
        super.gunModel[9] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
        super.gunModel[10] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
        super.gunModel[0].addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        super.gunModel[0].setRotationPoint(1.0F, -3.0F, -0.5F);
        super.gunModel[0].rotateAngleZ = -0.1919862F;
        super.gunModel[1].addBox(0.0F, 0.0F, 0.0F, 15, 2, 2, 0.0F);
        super.gunModel[1].setRotationPoint(-3.0F, -4.3F, -1.0F);
        super.gunModel[2].addBox(0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F);
        super.gunModel[2].setRotationPoint(-8.0F, -3.7F, -1.0F);
        super.gunModel[3].addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        super.gunModel[3].setRotationPoint(-4.0F, -4.0F, -1.0F);
        super.gunModel[4].addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        super.gunModel[4].setRotationPoint(-9.0F, -4.0F, -1.0F);
        super.gunModel[5].addBox(0.0F, 0.0F, 0.0F, 11, 1, 1, 0.0F);
        super.gunModel[5].setRotationPoint(12.0F, -4.0F, -0.5F);
        super.gunModel[6].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        super.gunModel[6].setRotationPoint(12.0F, -3.5F, -0.5F);
        super.gunModel[7].addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
        super.gunModel[7].setRotationPoint(12.0F, -2.8F, 0.0F);
        super.gunModel[7].rotateAngleY = 0.03490658F;
        super.gunModel[7].rotateAngleZ = -0.03490658F;
        super.gunModel[8].addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
        super.gunModel[8].setRotationPoint(12.0F, -2.8F, -1.2F);
        super.gunModel[8].rotateAngleY = -0.03490658F;
        super.gunModel[8].rotateAngleZ = -0.03490658F;
        super.gunModel[9].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.gunModel[9].setRotationPoint(2.0F, -5.0F, -0.5F);
        super.gunModel[9].rotateAngleZ = -0.1745329F;
        super.gunModel[10].addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        super.gunModel[10].setRotationPoint(18.0F, -5.3F, -0.5F);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
        super.ammoModel[0].addBox(2.0F, -4.0F, 1.0F, 3, 1, 4, 0.0F);
        super.ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.ammoModel[0].rotateAngleY = -0.05235988F;
        super.barrelAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
        super.stockAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
        super.scopeAttachPoint = new Vector3f(0.1875F, 0.3125F, 0.0F);
        super.gripAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
        super.gunSlideDistance = 0.0F;
        super.animationType = EnumAnimationType.SIDE_CLIP;
        this.flipAll();
        this.translateAll(0.0F, 1.0F, 0.0F);
    }
}
