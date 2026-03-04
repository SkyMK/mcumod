package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSG550 extends ModelGun {

    int textureX = 512;
    int textureY = 16;

    public ModelSG550() {
        super.gunModel = new ModelRendererTurbo[13];
        super.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
        super.gunModel[8] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        super.gunModel[9] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
        super.gunModel[10] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
        super.gunModel[11] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
        super.gunModel[12] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
        super.gunModel[0].addBox(0.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
        super.gunModel[0].setRotationPoint(0.0F, -4.0F, -0.5F);
        super.gunModel[0].rotateAngleZ = -0.2094395F;
        super.gunModel[1].addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        super.gunModel[1].setRotationPoint(1.0F, -2.0F, -0.5F);
        super.gunModel[2].addBox(0.0F, 0.0F, 0.0F, 11, 1, 1, 0.0F);
        super.gunModel[2].setRotationPoint(14.0F, -3.8F, -0.5F);
        super.gunModel[3].addBox(0.0F, 0.0F, 0.0F, 13, 1, 2, 0.0F);
        super.gunModel[3].setRotationPoint(-0.23F, -4.0F, -1.0F);
        super.gunModel[4].addBox(0.0F, 0.0F, 0.0F, 8, 2, 2, 0.0F);
        super.gunModel[4].setRotationPoint(11.0F, -4.5F, -1.0F);
        super.gunModel[5].addBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F);
        super.gunModel[5].setRotationPoint(1.0F, -4.5F, -0.5F);
        super.gunModel[6].addBox(0.0F, 0.0F, 0.0F, 11, 1, 1, 0.0F);
        super.gunModel[6].setRotationPoint(1.0F, -3.0F, -0.5F);
        super.gunModel[7].addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        super.gunModel[7].setRotationPoint(23.0F, -5.5F, -0.5F);
        super.gunModel[8].addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
        super.gunModel[8].setRotationPoint(1.0F, -5.0F, -0.5F);
        super.gunModel[9].addBox(0.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F);
        super.gunModel[9].setRotationPoint(-3.8F, -2.9F, -1.0F);
        super.gunModel[9].rotateAngleZ = 0.2792527F;
        super.gunModel[10].addBox(0.0F, 0.0F, 0.0F, 11, 2, 1, 0.0F);
        super.gunModel[10].setRotationPoint(-9.5F, -2.0F, -0.5F);
        super.gunModel[10].rotateAngleZ = 0.2443461F;
        super.gunModel[11].addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
        super.gunModel[11].setRotationPoint(-10.0F, -3.0F, -0.5F);
        super.gunModel[12].addBox(0.0F, 0.0F, 0.0F, 7, 1, 2, 0.0F);
        super.gunModel[12].setRotationPoint(-7.0F, -2.0F, -1.0F);
        super.gunModel[12].rotateAngleZ = 0.2792527F;
        super.scopeAttachPoint = new Vector3f(0.25F, 0.375F, 0.0F);
        super.gripAttachPoint = new Vector3f(0.9375F, 0.21875F, 0.0F);
        super.barrelAttachPoint = new Vector3f(1.5208334F, 0.28125F, 0.0F);
        super.ammoModel = new ModelRendererTurbo[2];
        super.ammoModel[0] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
        super.ammoModel[1] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
        super.ammoModel[0].addBox(6.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F);
        super.ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.ammoModel[1].addBox(6.2F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        super.ammoModel[1].setRotationPoint(0.0F, 0.0F, -0.5F);
        super.gunSlideDistance = 0.0F;
        super.animationType = EnumAnimationType.BOTTOM_CLIP;
        this.flipAll();
        this.translateAll(0.0F, 1.0F, 0.0F);
    }
}
