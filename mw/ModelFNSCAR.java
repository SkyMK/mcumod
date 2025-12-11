package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelFNSCAR extends ModelGun {

    public ModelFNSCAR() {
        byte textureX = 64;
        byte textureY = 16;
        super.gunModel = new ModelRendererTurbo[8];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addBox(0.0F, 2.0F, -1.0F, 8, 3, 2);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 5, textureX, textureY);
        super.gunModel[1].addShapeBox(1.0F, -1.0F, -1.0F, 1, 3, 2, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F,
                0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[2] = new ModelRendererTurbo(this, 6, 5, textureX, textureY);
        super.gunModel[2].addBox(4.0F, 1.0F, -1.0F, 3, 1, 2);
        super.gunModel[3] = new ModelRendererTurbo(this, 20, 0, textureX, textureY);
        super.gunModel[3].addBox(8.0F, 3.0F, -1.0F, 5, 2, 2);
        super.gunModel[4] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
        super.gunModel[4].addBox(7.5F, 2.5F, -0.5F, 5, 1, 1);
        super.gunModel[5] = new ModelRendererTurbo(this, 6, 8, textureX, textureY);
        super.gunModel[5].addBox(13.0F, 4.5F, -0.5F, 1, 1, 1);
        super.gunModel[6] = new ModelRendererTurbo(this, 0, 12, textureX, textureY);
        super.gunModel[6].addBox(13.0F, 3.25F, -0.5F, 4, 1, 1);
        super.gunModel[7] = new ModelRendererTurbo(this, 10, 8, textureX, textureY);
        super.gunModel[7].addBox(0.5F, 4.5F, -0.5F, 1, 1, 1);
        super.scopeAttachPoint = new Vector3f(0.21875F, 0.3125F, 0.0F);
        super.defaultStockModel = new ModelRendererTurbo[2];
        super.defaultStockModel[0] = new ModelRendererTurbo(this, 16, 5, textureX, textureY);
        super.defaultStockModel[0].addShapeBox(-6.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F,
                0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.defaultStockModel[1] = new ModelRendererTurbo(this, 24, 5, textureX, textureY);
        super.defaultStockModel[1].addShapeBox(-4.0F, 2.0F, -1.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F,
                0.0F);
        super.stockAttachPoint = new Vector3f(0.0625F, 0.25F, 0.0F);
        super.barrelAttachPoint = new Vector3f(1.0625F, 0.234375F, 0.0F);
        super.gripAttachPoint = new Vector3f(0.625F, 0.1875F, 0.0F);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 12, 11, textureX, textureY);
        super.ammoModel[0].addShapeBox(4.5F, -2.0F, -0.5F, 2, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunSlideDistance = 0.5F;
        super.animationType = EnumAnimationType.BOTTOM_CLIP;
    }
}
