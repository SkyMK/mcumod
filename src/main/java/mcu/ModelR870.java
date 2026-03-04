package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelR870 extends ModelGun {

    public ModelR870() {
        byte textureX = 64;
        byte textureY = 16;
        super.gunModel = new ModelRendererTurbo[5];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addBox(2.0F, 3.0F, -1.0F, 4, 2, 2);
        super.gunModel[1] = new ModelRendererTurbo(this, 12, 0, textureX, textureY);
        super.gunModel[1].addBox(3.0F, 4.5F, -0.5F, 15, 1, 1);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
        super.gunModel[2].addShapeBox(-2.0F, 3.0F, -1.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
        super.gunModel[3].addShapeBox(-2.0F, 1.0F, -1.0F, 2, 2, 2, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F,
                0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[4] = new ModelRendererTurbo(this, 0, 12, textureX, textureY);
        super.gunModel[4].addShapeBox(1.0F, 2.0F, -1.0F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F,
                0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.pumpModel = new ModelRendererTurbo[2];
        super.pumpModel[0] = new ModelRendererTurbo(this, 12, 2, textureX, textureY);
        super.pumpModel[0].addBox(2.0F, 3.25F, -0.5F, 10, 1, 1);
        super.pumpModel[1] = new ModelRendererTurbo(this, 12, 4, textureX, textureY);
        super.pumpModel[1].addBox(7.0F, 2.75F, -1.0F, 4, 2, 2);
        super.scopeAttachPoint = new Vector3f(0.3125F, 0.3125F, 0.0F);
        super.defaultStockModel = new ModelRendererTurbo[2];
        super.defaultStockModel[0] = new ModelRendererTurbo(this, 10, 8, textureX, textureY);
        super.defaultStockModel[0].addBox(-8.0F, 1.0F, -1.0F, 1, 3, 2);
        super.defaultStockModel[1] = new ModelRendererTurbo(this, 16, 8, textureX, textureY);
        super.defaultStockModel[1].addShapeBox(-7.0F, 1.0F, -1.0F, 5, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F,
                0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.stockAttachPoint = new Vector3f(0.0625F, 0.25F, 0.0F);
        super.barrelAttachPoint = new Vector3f(1.125F, 0.25F, 0.0F);
        super.gripAttachPoint = new Vector3f(0.5625F, 0.140625F, 0.0F);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 14, 14, textureX, textureY);
        super.ammoModel[0].addBox(4.0F, 3.5F, -0.5F, 2, 1, 1);
        this.translateAll(0.0F, -0.5F, 0.0F);
        super.gunSlideDistance = 0.5F;
        super.animationType = EnumAnimationType.SHOTGUN;
        super.pumpDelayAfterReload = 115;
        super.pumpDelay = 6;
        super.pumpTime = 9;
        super.pumpHandleDistance = -0.25F;
        super.numBulletsInReloadAnimation = 7.0F;
        super.tiltGunTime = 0.159F;
        super.unloadClipTime = 0.0F;
        super.loadClipTime = 0.708F;
        super.untiltGunTime = 0.133F;
    }
}
