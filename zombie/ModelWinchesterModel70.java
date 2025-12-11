package com.flansmod.client.model.zombie;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelWinchesterModel70 extends ModelGun {

    public ModelWinchesterModel70() {
        byte textureX = 64;
        byte textureY = 16;
        super.gunModel = new ModelRendererTurbo[2];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addBox(1.0F, 1.5F, -0.5F, 16, 1, 1);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 2, textureX, textureY);
        super.gunModel[1].addShapeBox(-1.0F, 0.0F, -1.0F, 13, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.defaultScopeModel = new ModelRendererTurbo[5];
        super.defaultScopeModel[0] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
        super.defaultScopeModel[0].addBox(-1.0F, 3.0F, -1.0F, 2, 2, 2);
        super.defaultScopeModel[1] = new ModelRendererTurbo(this, 0, 14, textureX, textureY);
        super.defaultScopeModel[1].addBox(1.0F, 3.5F, -0.5F, 5, 1, 1);
        super.defaultScopeModel[2] = new ModelRendererTurbo(this, 8, 10, textureX, textureY);
        super.defaultScopeModel[2].addBox(6.0F, 3.0F, -1.0F, 3, 2, 2);
        super.defaultScopeModel[3] = new ModelRendererTurbo(this, 12, 14, textureX, textureY);
        super.defaultScopeModel[3].addBox(1.5F, 2.5F, -0.5F, 1, 1, 1);
        super.defaultScopeModel[4] = new ModelRendererTurbo(this, 16, 14, textureX, textureY);
        super.defaultScopeModel[4].addBox(4.5F, 2.5F, -0.5F, 1, 1, 1);
        super.scopeAttachPoint = new Vector3f(0.1875F, 0.3125F, 0.0F);
        super.barrelAttachPoint = new Vector3f(1.0625F, 0.28125F, 0.0F);
        super.defaultStockModel = new ModelRendererTurbo[2];
        super.defaultStockModel[0] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
        super.defaultStockModel[0].addBox(-4.0F, -0.5F, -1.0F, 3, 2, 2);
        super.defaultStockModel[1] = new ModelRendererTurbo(this, 16, 6, textureX, textureY);
        super.defaultStockModel[1].addShapeBox(-9.0F, -2.0F, -1.0F, 5, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F,
                0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.stockAttachPoint = new Vector3f(-0.0625F, 0.0625F, 0.0F);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 34, 0, textureX, textureY);
        super.ammoModel[0].addBox(1.0F, 0.5F, -0.5F, 3, 1, 1);
        this.translateAll(0.0F, 2.5F, 0.0F);
        super.gunSlideDistance = 0.5F;
        super.animationType = EnumAnimationType.RIFLE;
        super.numBulletsInReloadAnimation = 5.0F;
        super.tiltGunTime = 0.279F;
        super.unloadClipTime = 0.0F;
        super.loadClipTime = 0.558F;
        super.untiltGunTime = 0.163F;
    }
}
