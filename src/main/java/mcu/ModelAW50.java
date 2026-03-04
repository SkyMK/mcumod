package com.flansmod.client.model.evp2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelAW50 extends ModelGun {

    public ModelAW50() {
        short textureX = 512;
        short textureY = 512;
        super.gunModel = new ModelRendererTurbo[1];
        super.ammoModel = new ModelRendererTurbo[1];
        super.pumpModel = new ModelRendererTurbo[1];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/aw50.obj");
        super.gunModel[0].setRotationPoint(3.5F, 2.0F, 0.0F);
        super.ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.ammoModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/aw50mag.obj");
        super.ammoModel[0].setRotationPoint(3.5F, 2.0F, 0.0F);
        super.pumpModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.pumpModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/aw50_cock.obj");
        super.pumpModel[0].setRotationPoint(3.5F, 2.0F, 0.0F);
        super.animationType = EnumAnimationType.PISTOL_CLIP;
        super.numBulletsInReloadAnimation = 1.0F;
        super.tiltGunTime = 0.1F;
        super.unloadClipTime = 0.0F;
        super.loadClipTime = 0.625F;
        super.untiltGunTime = 0.275F;
        super.pumpDelayAfterReload = 104;
        super.pumpDelay = 1;
        super.pumpTime = 9;
        this.translateAll(-3.5F, -1.8F, 0.0F);
    }
}
