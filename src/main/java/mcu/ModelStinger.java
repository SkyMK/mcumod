package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelStinger extends ModelGun {

    public ModelStinger() {
        byte textureX = 64;
        byte textureY = 32;
        super.gunModel = new ModelRendererTurbo[5];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addBox(-15.0F, 2.5F, -1.0F, 25, 2, 2);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
        super.gunModel[1].addBox(-16.0F, 2.0F, -1.5F, 1, 3, 3);
        super.gunModel[2] = new ModelRendererTurbo(this, 8, 4, textureX, textureY);
        super.gunModel[2].addBox(10.0F, 2.0F, -1.5F, 2, 3, 3);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
        super.gunModel[3].addBox(0.0F, -0.5F, -0.5F, 1, 3, 1);
        super.gunModel[4] = new ModelRendererTurbo(this, 4, 10, textureX, textureY);
        super.gunModel[4].addBox(3.0F, -0.5F, -1.0F, 6, 3, 2);

        int i;
        for (i = 0; i < 5; ++i) {
            super.gunModel[i].setRotationPoint(0.0F, 0.0F, 2.0F);
        }

        super.scopeAttachPoint = new Vector3f(0.09375F, 0.3125F, 0.0F);
        super.barrelAttachPoint = new Vector3f(1.125F, 0.25F, 0.0F);
        super.stockAttachPoint = new Vector3f(-0.0625F, 0.0625F, 0.0F);
        super.ammoModel = new ModelRendererTurbo[3];
        super.ammoModel[0] = new ModelRendererTurbo(this, 60, 0, textureX, textureY);
        super.ammoModel[0].addBox(-0.5F, -10.0F, -0.5F, 1, 20, 1);
        super.ammoModel[1] = new ModelRendererTurbo(this, 55, 0, textureX, textureY);
        super.ammoModel[1].addBox(-1.0F, -10.0F, 0.0F, 2, 1, 0);
        super.ammoModel[2] = new ModelRendererTurbo(this, 55, 2, textureX, textureY);
        super.ammoModel[2].addBox(0.0F, -10.0F, -1.0F, 0, 1, 2);

        for (i = 0; i < 3; ++i) {
            super.ammoModel[i].setRotationPoint(0.0F, 3.5F, 2.0F);
            super.ammoModel[i].rotateAngleZ = -1.5707964F;
        }

        super.gunSlideDistance = 0.5F;
        super.animationType = EnumAnimationType.END_LOADED;
        super.tiltGunTime = 0.25F;
        super.unloadClipTime = 0.25F;
        super.loadClipTime = 0.25F;
        super.untiltGunTime = 0.25F;
    }
}
