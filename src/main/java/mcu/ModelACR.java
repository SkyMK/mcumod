package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelACR extends ModelGun {

    public ModelACR() {
        byte textureX = 64;
        byte textureY = 16;
        super.gunModel = new ModelRendererTurbo[6];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addBox(0.0F, 3.0F, -1.0F, 8, 2, 2);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
        super.gunModel[1].addShapeBox(0.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F,
                0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
        super.gunModel[2] = new ModelRendererTurbo(this, 8, 4, textureX, textureY);
        super.gunModel[2].addBox(5.0F, 2.0F, -1.0F, 3, 1, 2);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 9, textureX, textureY);
        super.gunModel[3].addBox(8.0F, 3.0F, -1.0F, 6, 2, 2);
        super.gunModel[4] = new ModelRendererTurbo(this, 0, 13, textureX, textureY);
        super.gunModel[4].addBox(14.0F, 3.1F, -0.4F, 4.0F, 0.8F, 0.8F);
        super.gunModel[5] = new ModelRendererTurbo(this, 10, 13, textureX, textureY);
        super.gunModel[5].addBox(14.0F, 4.1F, -0.4F, 1.0F, 0.8F, 0.8F);
        super.scopeAttachPoint = new Vector3f(0.21875F, 0.3125F, 0.0F);
        super.defaultStockModel = new ModelRendererTurbo[3];
        super.defaultStockModel[0] = new ModelRendererTurbo(this, 20, 0, textureX, textureY);
        super.defaultStockModel[0].addBox(-8.0F, 1.0F, -1.0F, 1.0F, 3.5F, 2.0F);
        super.defaultStockModel[1] = new ModelRendererTurbo(this, 26, 0, textureX, textureY);
        super.defaultStockModel[1].addShapeBox(-7.0F, 1.0F, -1.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.defaultStockModel[2] = new ModelRendererTurbo(this, 18, 6, textureX, textureY);
        super.defaultStockModel[2].addShapeBox(-7.0F, 3.0F, -1.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F,
                0.0F);
        super.stockAttachPoint = new Vector3f(0.0625F, 0.25F, 0.0F);
        super.barrelAttachPoint = new Vector3f(1.125F, 0.21875F, 0.0F);
        super.gripAttachPoint = new Vector3f(0.6875F, 0.1875F, 0.0F);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 16, 10, textureX, textureY);
        super.ammoModel[0].addShapeBox(5.5F, -2.0F, -1.0F, 2, 4, 2, 0.0F, -0.25F, 0.25F, -0.25F, 0.5F, 0.0F, -0.25F,
                0.5F, 0.0F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F,
                0.0F, 0.0F, -0.25F);
        super.gunSlideDistance = 0.5F;
        super.animationType = EnumAnimationType.BOTTOM_CLIP;
    }
}
