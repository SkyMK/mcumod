package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelL96 extends ModelGun {

    public ModelL96() {
        byte textureX = 64;
        byte textureY = 16;
        super.gunModel = new ModelRendererTurbo[3];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addBox(-0.75F, 1.5F, -0.5F, 20, 1, 1);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 2, textureX, textureY);
        super.gunModel[1].addBox(-1.0F, 0.0F, -1.0F, 13, 2, 2);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
        super.gunModel[2].addBox(10.0F, -1.0F, -1.0F, 4, 1, 2);
        super.defaultScopeModel = new ModelRendererTurbo[4];
        super.defaultScopeModel[0] = new ModelRendererTurbo(this, 31, 3, textureX, textureY);
        super.defaultScopeModel[0].addBox(-2.0F, 4.5F, -0.5F, 6, 1, 1);
        super.defaultScopeModel[1] = new ModelRendererTurbo(this, 0, 9, textureX, textureY);
        super.defaultScopeModel[1].addTrapezoid(4.0F, 4.0F, -1.0F, 4, 2, 2, 0.0F, -0.5F, 3);
        super.defaultScopeModel[2] = new ModelRendererTurbo(this, 8, 13, textureX, textureY);
        super.defaultScopeModel[2].addBox(1.0F, 2.5F, -0.5F, 1, 2, 1);
        super.defaultScopeModel[3] = new ModelRendererTurbo(this, 12, 13, textureX, textureY);
        super.defaultScopeModel[3].addBox(3.0F, 2.5F, -0.5F, 1, 2, 1);
        super.scopeAttachPoint = new Vector3f(0.1875F, 0.3125F, 0.0F);
        super.barrelAttachPoint = new Vector3f(1.0625F, 0.28125F, 0.0F);
        super.defaultStockModel = new ModelRendererTurbo[5];
        super.defaultStockModel[0] = new ModelRendererTurbo(this, 27, 10, textureX, textureY);
        super.defaultStockModel[0].addBox(-2.0F, -2.0F, -1.0F, 1, 4, 2);
        super.defaultStockModel[1] = new ModelRendererTurbo(this, 34, 13, textureX, textureY);
        super.defaultStockModel[1].addBox(-5.0F, -2.0F, -1.0F, 3, 1, 2);
        super.defaultStockModel[2] = new ModelRendererTurbo(this, 34, 10, textureX, textureY);
        super.defaultStockModel[2].addBox(-4.0F, 1.0F, -1.0F, 2, 1, 2);
        super.defaultStockModel[3] = new ModelRendererTurbo(this, 30, 5, textureX, textureY);
        super.defaultStockModel[3].addBox(-7.0F, -1.0F, -1.0F, 3, 3, 2);
        super.defaultStockModel[4] = new ModelRendererTurbo(this, 18, 10, textureX, textureY);
        super.defaultStockModel[4].addBox(-9.0F, -2.0F, -1.0F, 2, 4, 2);
        super.stockAttachPoint = new Vector3f(-0.0625F, 0.0625F, 0.0F);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 41, 7, textureX, textureY);
        super.ammoModel[0].addShapeBox(3.0F, -2.0F, -1.0F, 3, 2, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.translateAll(0.0F, 2.5F, 0.0F);
        super.gunSlideDistance = 0.5F;
        super.animationType = EnumAnimationType.BOTTOM_CLIP;
    }
}
