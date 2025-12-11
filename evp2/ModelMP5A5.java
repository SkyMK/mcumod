package com.flansmod.client.model.evp2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelMP5A5 extends ModelGun {

    public ModelMP5A5() {
        short textureX = 512;
        short textureY = 512;
        super.gunModel = new ModelRendererTurbo[1];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/MP5A5.obj");
        super.gunModel[0].setRotationPoint(3.5F, 2.0F, 0.0F);
        super.animationType = EnumAnimationType.RIFLE_TOP;
        super.numBulletsInReloadAnimation = 1.0F;
        super.tiltGunTime = 0.279F;
        super.unloadClipTime = 0.0F;
        super.loadClipTime = 0.6F;
        super.untiltGunTime = 0.163F;
        this.translateAll(0.0F, 1.0F, 0.0F);
    }
}
