package com.flansmod.client.model.zombie;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelM4Carbine extends ModelGun {

    public ModelM4Carbine() {
        byte textureX = 64;
        byte textureY = 16;
        super.gunModel = new ModelRendererTurbo[6];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addBox(-1.0F, 2.0F, -1.0F, 7, 3, 2);
        super.gunModel[1] = new ModelRendererTurbo(this, 32, 4, textureX, textureY);
        super.gunModel[1].addBox(0.0F, -1.0F, -1.0F, 1, 3, 2);
        super.gunModel[2] = new ModelRendererTurbo(this, 20, 0, textureX, textureY);
        super.gunModel[2].addBox(1.0F, 1.0F, -1.0F, 1, 1, 2);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 5, textureX, textureY);
        super.gunModel[3].addBox(6.0F, 3.0F, -1.0F, 5, 2, 2);
        super.gunModel[4] = new ModelRendererTurbo(this, 12, 14, textureX, textureY);
        super.gunModel[4].addBox(12.0F, 4.5F, -0.5F, 1, 1, 1);
        super.gunModel[5] = new ModelRendererTurbo(this, 0, 9, textureX, textureY);
        super.gunModel[5].addBox(6.0F, 3.5F, -0.5F, 10, 1, 1);
        super.scopeAttachPoint = new Vector3f(0.21875F, 0.3125F, 0.0F);
        super.defaultStockModel = new ModelRendererTurbo[3];
        super.defaultStockModel[0] = new ModelRendererTurbo(this, 20, 3, textureX, textureY);
        super.defaultStockModel[0].addBox(-8.0F, 1.0F, -1.0F, 2, 4, 2);
        super.defaultStockModel[1] = new ModelRendererTurbo(this, 0, 11, textureX, textureY);
        super.defaultStockModel[1].addBox(-6.0F, 2.0F, -1.0F, 2, 3, 2);
        super.defaultStockModel[2] = new ModelRendererTurbo(this, 10, 11, textureX, textureY);
        super.defaultStockModel[2].addBox(-4.0F, 3.5F, -0.5F, 3, 1, 1);
        super.stockAttachPoint = new Vector3f(0.0625F, 0.25F, 0.0F);
        super.barrelAttachPoint = new Vector3f(1.0F, 0.25F, 0.0F);
        super.gripAttachPoint = new Vector3f(0.625F, 0.1875F, 0.0F);
        super.defaultGripModel = new ModelRendererTurbo[2];
        super.defaultGripModel[0] = new ModelRendererTurbo(this, 30, 0, textureX, textureY);
        super.defaultGripModel[0].addBox(7.5F, 2.0F, -1.0F, 2, 1, 2);
        super.defaultGripModel[1] = new ModelRendererTurbo(this, 38, 0, textureX, textureY);
        super.defaultGripModel[1].addBox(8.0F, 0.0F, -0.5F, 1, 2, 1);
        super.ammoModel = new ModelRendererTurbo[2];
        super.ammoModel[0] = new ModelRendererTurbo(this, 20, 11, textureX, textureY);
        super.ammoModel[0].addBox(3.0F, 0.0F, -1.0F, 3, 2, 2);
        super.ammoModel[1] = new ModelRendererTurbo(this, 30, 11, textureX, textureY);
        super.ammoModel[1].addBox(4.0F, -2.0F, -1.0F, 3, 2, 2);
        super.gunSlideDistance = 0.5F;
        super.animationType = EnumAnimationType.BOTTOM_CLIP;
    }
}
