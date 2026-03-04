package com.flansmod.client.model.evp2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelPL14 extends ModelGun {

    public ModelPL14() {
        short textureX = 1024;
        short textureY = 1024;
        super.gunModel = new ModelRendererTurbo[1];
        super.ammoModel = new ModelRendererTurbo[1];
        super.slideModel = new ModelRendererTurbo[1];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/pl14_body.obj");
        super.gunModel[0].setRotationPoint(3.5F, 2.0F, 0.0F);
        super.ammoModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.ammoModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/pl14_magazine.obj");
        super.ammoModel[0].setRotationPoint(3.5F, 2.0F, 0.0F);
        super.slideModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.slideModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/pl14_slide.obj");
        super.slideModel[0].setRotationPoint(3.5F, 2.0F, 0.0F);
        super.animationType = EnumAnimationType.PISTOL_CLIP;
        super.gunSlideDistance = 0.2F;
        super.numBulletsInReloadAnimation = 1.0F;
        super.tiltGunTime = 0.1F;
        super.unloadClipTime = 0.0F;
        super.loadClipTime = 0.625F;
        super.untiltGunTime = 0.275F;
        this.translateAll(-3.5F, -1.8F, 0.0F);
    }
}
