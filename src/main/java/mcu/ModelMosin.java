package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelMosin extends ModelGun {

    public ModelMosin() {
        byte textureX = 64;
        byte textureY = 16;
        super.gunModel = new ModelRendererTurbo[8];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addShapeBox(-8.0F, -2.0F, -1.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 5, textureX, textureY);
        super.gunModel[1].addShapeBox(-4.0F, -1.0F, -1.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 9, textureX, textureY);
        super.gunModel[2].addShapeBox(-3.0F, -1.0F, -1.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.5F, 0.0F);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 12, textureX, textureY);
        super.gunModel[3].addBox(0.0F, 0.0F, -1.0F, 8, 2, 2, 0.0F);
        super.gunModel[4] = new ModelRendererTurbo(this, 12, 0, textureX, textureY);
        super.gunModel[4].addShapeBox(0.0F, -1.0F, -1.0F, 4, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F,
                0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[5] = new ModelRendererTurbo(this, 12, 3, textureX, textureY);
        super.gunModel[5].addBox(1.0F, 1.5F, -0.5F, 18, 1, 1, 0.0F);
        super.gunModel[6] = new ModelRendererTurbo(this, 24, 0, textureX, textureY);
        super.gunModel[6].addBox(16.0F, 2.5F, -0.5F, 1, 1, 1, 0.0F);
        super.gunModel[7] = new ModelRendererTurbo(this, 9, 6, textureX, textureY);
        super.gunModel[7].addBox(8.0F, 1.0F, -1.0F, 5, 1, 2, 0.0F);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 23, 12, textureX, textureY);
        super.ammoModel[0].addBox(1.0F, -1.0F, -0.5F, 3, 3, 1);
        this.translateAll(0.0F, 2.5F, 0.0F);
        super.gunSlideDistance = 0.5F;
        super.animationType = EnumAnimationType.RIFLE_TOP;
        super.numBulletsInReloadAnimation = 1.0F;
        super.tiltGunTime = 0.279F;
        super.unloadClipTime = 0.0F;
        super.loadClipTime = 0.558F;
        super.untiltGunTime = 0.163F;
    }
}
