package com.flansmod.client.model.evp2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelUKM2013 extends ModelGun {

    public ModelUKM2013() {
        short textureX = 256;
        short textureY = 128;
        super.gunModel = new ModelRendererTurbo[1];
        super.ammoModel = new ModelRendererTurbo[1];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/UKM2013.obj");
        super.gunModel[0].setRotationPoint(3.5F, 2.0F, 0.0F);
        super.ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.ammoModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/UKM2013_magazine.obj");
        super.ammoModel[0].setRotationPoint(3.5F, 2.0F, 0.0F);
        super.animationType = EnumAnimationType.BOTTOM_CLIP;
        super.numBulletsInReloadAnimation = 1.0F;
        super.tiltGunTime = 0.279F;
        super.unloadClipTime = 0.0F;
        super.loadClipTime = 0.6F;
        super.untiltGunTime = 0.163F;
        this.translateAll(-3.5F, -1.8F, 0.0F);
    }
}
