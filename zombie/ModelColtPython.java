package com.flansmod.client.model.zombie;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelColtPython extends ModelGun {

    public ModelColtPython() {
        byte textureX = 64;
        byte textureY = 16;
        super.gunModel = new ModelRendererTurbo[6];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addShapeBox(-1.0F, -1.0F, -0.5F, 2, 3, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F,
                0.0F);
        super.gunModel[1] = new ModelRendererTurbo(this, 6, 0, textureX, textureY);
        super.gunModel[1].addShapeBox(1.0F, 1.0F, -0.5F, 1, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F);
        super.gunModel[2] = new ModelRendererTurbo(this, 10, 0, textureX, textureY);
        super.gunModel[2].addBox(2.0F, 1.0F, -0.5F, 3.0F, 0.25F, 1.0F);
        super.gunModel[3] = new ModelRendererTurbo(this, 10, 2, textureX, textureY);
        super.gunModel[3].addBox(2.0F, 3.25F, -0.5F, 3.0F, 0.25F, 1.0F);
        super.gunModel[4] = new ModelRendererTurbo(this, 18, 0, textureX, textureY);
        super.gunModel[4].addBox(5.0F, 1.0F, -0.5F, 0.5F, 2.5F, 1.0F);
        super.gunModel[5] = new ModelRendererTurbo(this, 22, 0, textureX, textureY);
        super.gunModel[5].addBox(5.5F, 2.0F, -0.5F, 6.0F, 1.5F, 1.0F);
        super.ammoModel = new ModelRendererTurbo[6];

        for (int i = 0; i < 6; ++i) {
            super.ammoModel[i] = new ModelRendererTurbo(this, 10, 4, textureX, textureY);
            super.ammoModel[i].addBox(0.0F, 0.35F, -0.5F, 2.0F, 0.5F, 0.5F);
            super.ammoModel[i].setRotationPoint(2.5F, 2.25F, 0.0F);
            super.ammoModel[i].rotateAngleX = 1.0471976F * (float) i;
        }

        super.barrelAttachPoint = new Vector3f(0.6875F, 0.28125F, 0.0F);
        super.scopeAttachPoint = new Vector3f(0.25F, 0.3125F, 0.0F);
        this.translateAll(0.0F, 1.5F, 0.0F);
        super.gunSlideDistance = 0.25F;
        super.animationType = EnumAnimationType.REVOLVER;
    }
}
