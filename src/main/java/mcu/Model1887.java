package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class Model1887 extends ModelGun {

    public Model1887() {
        byte textureX = 64;
        byte textureY = 16;
        super.gunModel = new ModelRendererTurbo[5];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addShapeBox(0.0F, 3.0F, -1.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
        super.gunModel[1] = new ModelRendererTurbo(this, 10, 0, textureX, textureY);
        super.gunModel[1].addShapeBox(0.0F, 2.0F, -1.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
        super.gunModel[2].addBox(3.0F, 3.05F, -0.45F, 7.0F, 0.9F, 0.9F);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
        super.gunModel[3].addBox(3.0F, 4.05F, -0.45F, 10.0F, 0.9F, 0.9F);
        super.gunModel[4] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
        super.gunModel[4].addBox(3.0F, 3.25F, -0.75F, 5.0F, 1.5F, 1.5F);
        super.scopeAttachPoint = new Vector3f(0.3125F, 0.3125F, 0.0F);
        super.defaultStockModel = new ModelRendererTurbo[2];
        super.defaultStockModel[0] = new ModelRendererTurbo(this, 18, 0, textureX, textureY);
        super.defaultStockModel[0].addShapeBox(-2.0F, 1.0F, -1.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F,
                0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.defaultStockModel[1] = new ModelRendererTurbo(this, 28, 0, textureX, textureY);
        super.defaultStockModel[1].addShapeBox(-8.0F, 0.0F, -1.0F, 6, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F,
                0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.stockAttachPoint = new Vector3f(0.0F, 0.1875F, 0.0F);
        super.barrelAttachPoint = new Vector3f(1.125F, 0.25F, 0.0F);
        super.gripAttachPoint = new Vector3f(0.5625F, 0.140625F, 0.0F);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 0, 14, textureX, textureY);
        super.ammoModel[0].addBox(1.0F, 3.0F, -0.5F, 2, 1, 1);
        this.translateAll(0.0F, -0.5F, 0.0F);
        super.gunSlideDistance = 0.5F;
        super.animationType = EnumAnimationType.RIFLE_TOP;
        super.pumpDelayAfterReload = 86;
        super.pumpDelay = 7;
        super.pumpTime = 12;
        super.pumpHandleDistance = -0.25F;
        super.numBulletsInReloadAnimation = 5.0F;
        super.tiltGunTime = 0.159F;
        super.unloadClipTime = 0.0F;
        super.loadClipTime = 0.708F;
        super.untiltGunTime = 0.133F;
    }
}
