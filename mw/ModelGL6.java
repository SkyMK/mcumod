package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelGL6 extends ModelGun {

    public ModelGL6() {
        byte textureX = 64;
        byte textureY = 16;
        super.gunModel = new ModelRendererTurbo[13];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addShapeBox(-12.0F, 1.0F, -1.0F, 9, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[1] = new ModelRendererTurbo(this, 22, 0, textureX, textureY);
        super.gunModel[1].addBox(-3.0F, 1.0F, -1.0F, 3, 3, 2);
        super.gunModel[2] = new ModelRendererTurbo(this, 32, 0, textureX, textureY);
        super.gunModel[2].addShapeBox(-3.0F, -2.0F, -1.0F, 2, 3, 2, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F,
                0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 5, textureX, textureY);
        super.gunModel[3].addBox(-2.0F, 4.0F, -1.0F, 10, 1, 2);
        super.gunModel[4] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
        super.gunModel[4].addBox(0.0F, -2.0F, -1.0F, 1, 6, 2);
        super.gunModel[5] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
        super.gunModel[5].addShapeBox(0.0F, -2.0F, 1.0F, 1, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F,
                0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
        super.gunModel[6] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
        super.gunModel[6].addShapeBox(0.0F, -2.0F, -3.0F, 1, 6, 2, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[7] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
        super.gunModel[7].addBox(7.0F, -2.0F, -1.0F, 1, 6, 2);
        super.gunModel[8] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
        super.gunModel[8].addShapeBox(7.0F, -2.0F, 1.0F, 1, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F,
                0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
        super.gunModel[9] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
        super.gunModel[9].addShapeBox(7.0F, -2.0F, -3.0F, 1, 6, 2, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[10] = new ModelRendererTurbo(this, 22, 13, textureX, textureY);
        super.gunModel[10].addBox(0.0F, -3.0F, -1.0F, 8, 1, 2);
        super.gunModel[11] = new ModelRendererTurbo(this, 22, 9, textureX, textureY);
        super.gunModel[11].addBox(8.0F, 1.5F, -1.0F, 8, 2, 2);
        super.gunModel[12] = new ModelRendererTurbo(this, 40, 0, textureX, textureY);
        super.gunModel[12].addBox(8.0F, 1.0F, -1.5F, 4, 3, 3);
        super.ammoModel = new ModelRendererTurbo[6];

        for (int i = 0; i < 6; ++i) {
            super.ammoModel[i] = new ModelRendererTurbo(this, 42, 12, textureX, textureY);
            super.ammoModel[i].addBox(0.9F, -2.75F, -0.75F, 4.0F, 1.5F, 1.5F);
            super.ammoModel[i].setRotationPoint(0.0F, 1.0F, 0.0F);
            super.ammoModel[i].rotateAngleX = 1.0471976F * (float) i;
        }

        super.barrelAttachPoint = new Vector3f(0.46875F, 0.25F, 0.0F);
        super.scopeAttachPoint = new Vector3f(0.375F, 0.3125F, 0.0F);
        this.translateAll(6.0F, 0.0F, 0.0F);
        super.gunSlideDistance = 0.25F;
        super.animationType = EnumAnimationType.REVOLVER;
        super.tiltGunTime = 0.2F;
        super.unloadClipTime = 0.2F;
        super.loadClipTime = 0.4F;
        super.untiltGunTime = 0.2F;
    }
}
