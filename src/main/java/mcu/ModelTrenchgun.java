package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelTrenchgun extends ModelGun {

    int textureX = 512;
    int textureY = 512;

    public ModelTrenchgun() {
        super.gunModel = new ModelRendererTurbo[9];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 290, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 300, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 310, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 320, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 0, 330, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 0, 350, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 0, 360, this.textureX, this.textureY);
        super.gunModel[8] = new ModelRendererTurbo(this, 0, 370, this.textureX, this.textureY);
        super.gunModel[0].addBox(0.0F, 0.0F, 0.0F, 25, 1, 1, 0.0F);
        super.gunModel[0].setRotationPoint(-1.0F, -4.0F, -0.5F);
        super.gunModel[1].addBox(0.0F, 0.0F, 0.0F, 15, 1, 0, 0.0F);
        super.gunModel[1].setRotationPoint(4.0F, -3.5F, 0.0F);
        super.gunModel[2].addBox(0.0F, 0.0F, 0.0F, 19, 1, 1, 0.0F);
        super.gunModel[2].setRotationPoint(0.0F, -2.9F, -0.5F);
        super.gunModel[3].addBox(0.0F, 0.0F, 0.0F, 10, 1, 2, 0.0F);
        super.gunModel[3].setRotationPoint(-2.0F, -3.0F, -1.0F);
        super.gunModel[4].addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        super.gunModel[4].setRotationPoint(1.0F, -2.0F, -0.5F);
        super.gunModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.gunModel[5].setRotationPoint(22.0F, -4.5F, -0.5F);
        super.gunModel[5].rotateAngleZ = 0.08726646F;
        super.gunModel[6].addBox(0.0F, 0.0F, 0.0F, 8, 2, 2, 0.0F);
        super.gunModel[6].setRotationPoint(-10.0F, -3.0F, -1.0F);
        super.gunModel[7].addBox(0.0F, 0.0F, 0.0F, 5, 1, 2, 0.0F);
        super.gunModel[7].setRotationPoint(-5.5F, -3.5F, -1.0F);
        super.gunModel[8].addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        super.gunModel[8].setRotationPoint(-11.0F, -3.0F, -1.0F);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 0, 390, this.textureX, this.textureY);
        super.ammoModel[0].addBox(5.0F, -3.0F, -0.5F, 2, 1, 1, 0.0F);
        super.ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.pumpModel = new ModelRendererTurbo[1];
        super.pumpModel[0] = new ModelRendererTurbo(this, 0, 380, this.textureX, this.textureY);
        super.pumpModel[0].addBox(0.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F);
        super.pumpModel[0].setRotationPoint(12.5F, -3.2F, -1.0F);
        super.gunSlideDistance = 0.5F;
        super.pumpDelayAfterReload = 105;
        super.pumpDelay = 11;
        super.pumpTime = 9;
        super.gunSlideDistance = 0.3F;
        super.animationType = EnumAnimationType.SHOTGUN;
        this.flipAll();
        this.translateAll(0.0F, 2.0F, 0.0F);
        super.numBulletsInReloadAnimation = 8.0F;
        super.tiltGunTime = 0.279F;
        super.unloadClipTime = 0.0F;
        super.loadClipTime = 0.558F;
        super.untiltGunTime = 0.163F;
    }
}
