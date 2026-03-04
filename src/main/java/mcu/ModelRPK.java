package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelRPK extends ModelGun {

    public ModelRPK() {
        byte textureX = 64;
        byte textureY = 16;
        super.gunModel = new ModelRendererTurbo[4];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addBox(-4.0F, 2.0F, -1.0F, 12, 3, 2);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 5, textureX, textureY);
        super.gunModel[1].addBox(-0.0F, -2.0F, -1.0F, 2, 4, 2);
        super.gunModel[2] = new ModelRendererTurbo(this, 8, 5, textureX, textureY);
        super.gunModel[2].addBox(6.9F, 4.2F, -0.5F, 1, 1, 1);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 12, textureX, textureY);
        super.gunModel[3].addBox(8.0F, 2.25F, -1.0F, 6, 2, 2);
        super.scopeAttachPoint = new Vector3f(0.25F, 0.3125F, 0.0F);
        super.defaultStockModel = new ModelRendererTurbo[2];
        super.defaultStockModel[0] = new ModelRendererTurbo(this, 8, 7, textureX, textureY);
        super.defaultStockModel[0].addBox(-7.0F, 2.0F, -1.0F, 3, 2, 2);
        super.defaultStockModel[1] = new ModelRendererTurbo(this, 18, 6, textureX, textureY);
        super.defaultStockModel[1].addBox(-11.0F, 0.0F, -1.0F, 4, 4, 2);
        super.stockAttachPoint = new Vector3f(-0.25F, 0.21875F, 0.0F);
        super.defaultBarrelModel = new ModelRendererTurbo[4];
        super.defaultBarrelModel[0] = new ModelRendererTurbo(this, 30, 14, textureX, textureY);
        super.defaultBarrelModel[0].addBox(14.0F, 2.5F, -0.5F, 8, 1, 1);
        super.defaultBarrelModel[1] = new ModelRendererTurbo(this, 16, 12, textureX, textureY);
        super.defaultBarrelModel[1].addBox(22.0F, 2.5F, -0.5F, 1, 2, 1);
        super.defaultBarrelModel[2] = new ModelRendererTurbo(this, 38, 0, textureX, textureY);
        super.defaultBarrelModel[2].addShapeBox(20.0F, -2.5F, -1.0F, 1, 5, 1, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F,
                0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.defaultBarrelModel[3] = new ModelRendererTurbo(this, 38, 0, textureX, textureY);
        super.defaultBarrelModel[3].addShapeBox(20.0F, -2.5F, 0.0F, 1, 5, 1, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F,
                0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.barrelAttachPoint = new Vector3f(0.875F, 0.203125F, 0.0F);
        super.ammoModel = new ModelRendererTurbo[3];
        super.ammoModel[0] = new ModelRendererTurbo(this, 28, 0, textureX, textureY);
        super.ammoModel[0].addBox(4.0F, -1.0F, -1.0F, 3, 3, 2);
        super.ammoModel[1] = new ModelRendererTurbo(this, 20, 12, textureX, textureY);
        super.ammoModel[1].addBox(5.0F, -3.0F, -1.0F, 3, 2, 2);
        super.ammoModel[2] = new ModelRendererTurbo(this, 30, 7, textureX, textureY);
        super.ammoModel[2].addBox(6.0F, -5.0F, -1.0F, 3, 2, 2);
        super.gunSlideDistance = 0.5F;
        super.animationType = EnumAnimationType.BOTTOM_CLIP;
    }
}
