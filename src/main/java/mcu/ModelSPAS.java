package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSPAS extends ModelGun {

    int textureX = 64;
    int textureY = 32;

    public ModelSPAS() {
        super.gunModel = new ModelRendererTurbo[11];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 7, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 8, 7, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 12, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 8, 11, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 8, 16, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 0, 19, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 12, 0, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 15, 2, this.textureX, this.textureY);
        super.gunModel[8] = new ModelRendererTurbo(this, 16, 19, this.textureX, this.textureY);
        super.gunModel[9] = new ModelRendererTurbo(this, 1, 22, this.textureX, this.textureY);
        super.gunModel[10] = new ModelRendererTurbo(this, 12, 0, this.textureX, this.textureY);
        super.gunModel[0].addShapeBox(0.0F, -2.3F, -1.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F,
                0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 1.0F, -0.5F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 1.0F, -0.5F,
                -0.2F);
        super.gunModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[1].addShapeBox(-0.5F, -4.3F, -1.0F, 5, 2, 2, 0.0F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F,
                0.0F, -0.1F, -0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, 0.0F, 0.0F,
                -0.1F);
        super.gunModel[1].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[2].addBox(4.0F, -5.0F, -1.0F, 2, 3, 2, 0.0F);
        super.gunModel[2].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[3].addShapeBox(6.0F, -5.0F, -1.0F, 6, 3, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F,
                -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.gunModel[3].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[4].addBox(6.0F, -3.2F, -0.5F, 8, 1, 1, 0.0F);
        super.gunModel[4].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[5].addBox(7.0F, -4.4F, -0.5F, 8, 1, 1, 0.0F);
        super.gunModel[5].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[6].addBox(12.0F, -5.4F, -0.5F, 1, 1, 1, 0.0F);
        super.gunModel[6].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[7].addShapeBox(-2.0F, -3.1F, -1.5F, 3, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F,
                0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F,
                -0.5F);
        super.gunModel[7].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[7].rotateAngleZ = 0.29670596F;
        super.gunModel[8].addShapeBox(-4.0F, -3.1F, -1.5F, 2, 1, 3, 0.0F, -0.5F, 0.4F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F,
                0.0F, -0.5F, -0.5F, 0.4F, -0.5F, -0.2F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.2F,
                -0.5F, -0.5F);
        super.gunModel[8].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[8].rotateAngleZ = 0.29670596F;
        super.gunModel[9].addBox(-5.3F, -2.5F, -1.0F, 1, 3, 2, 0.0F);
        super.gunModel[9].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.gunModel[9].rotateAngleZ = -0.05235988F;
        super.gunModel[10].addBox(6.0F, -4.4F, -0.5F, 1, 1, 1, 0.0F);
        super.gunModel[10].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        super.ammoModel[0].addBox(2.0F, -3.5F, -0.5F, 2, 1, 1, 0.0F);
        super.ammoModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.pumpModel = new ModelRendererTurbo[1];
        super.pumpModel[0] = new ModelRendererTurbo(this, 23, 6, this.textureX, this.textureY);
        super.pumpModel[0].addShapeBox(6.75F, -4.25F, -1.5F, 4, 3, 3, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F,
                0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F,
                0.0F, -0.5F, -0.25F);
        super.pumpModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.barrelAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
        super.stockAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
        super.scopeAttachPoint = new Vector3f(0.3125F, 0.3125F, 0.0F);
        super.gripAttachPoint = new Vector3f(0.546875F, 0.125F, 0.0F);
        super.pumpDelayAfterReload = 115;
        super.pumpDelay = 6;
        super.pumpTime = 9;
        super.gunSlideDistance = 0.5F;
        super.animationType = EnumAnimationType.SHOTGUN;
        super.numBulletsInReloadAnimation = 7.0F;
        super.tiltGunTime = 0.159F;
        super.unloadClipTime = 0.0F;
        super.loadClipTime = 0.708F;
        super.untiltGunTime = 0.133F;
        this.translateAll(0.0F, 0.0F, 0.0F);
        this.flipAll();
    }
}
