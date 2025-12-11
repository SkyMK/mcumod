package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelLeeenfieldS extends ModelGun {

    int textureX = 128;
    int textureY = 128;

    public ModelLeeenfieldS() {
        super.gunModel = new ModelRendererTurbo[11];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 9, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 17, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 26, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 34, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 0, 39, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 0, 53, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 0, 58, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 0, 67, this.textureX, this.textureY);
        super.gunModel[8] = new ModelRendererTurbo(this, 0, 88, this.textureX, this.textureY);
        super.gunModel[9] = new ModelRendererTurbo(this, 0, 98, this.textureX, this.textureY);
        super.gunModel[10] = new ModelRendererTurbo(this, 0, 108, this.textureX, this.textureY);
        super.gunModel[0].addBox(0.0F, 0.0F, 0.0F, 7, 2, 3, 0.0F);
        super.gunModel[0].setRotationPoint(0.0F, 1.0F, -1.5F);
        super.gunModel[1].addShapeBox(0.0F, -1.0F, 0.0F, 20, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F,
                0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F,
                0.0F);
        super.gunModel[1].setRotationPoint(7.0F, 0.0F, -1.5F);
        super.gunModel[2].addBox(0.0F, -1.0F, 0.0F, 2, 3, 2, 0.0F);
        super.gunModel[2].setRotationPoint(27.0F, 0.0F, -1.0F);
        super.gunModel[3].addBox(0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F);
        super.gunModel[3].setRotationPoint(29.0F, 0.5F, -0.5F);
        super.gunModel[4].addBox(0.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F);
        super.gunModel[4].setRotationPoint(29.0F, 0.5F, -0.5F);
        super.gunModel[5].addBox(0.0F, 0.0F, 0.0F, 7, 1, 2, 0.0F);
        super.gunModel[5].setRotationPoint(0.0F, 0.0F, -1.0F);
        super.gunModel[6].addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
        super.gunModel[6].setRotationPoint(-1.0F, 0.0F, -1.5F);
        super.gunModel[7].addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        super.gunModel[7].setRotationPoint(0.0F, -1.0F, -1.0F);
        super.gunModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 5, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[8].setRotationPoint(-6.0F, 0.0F, -1.5F);
        super.gunModel[9].addShapeBox(0.0F, 0.0F, 0.0F, 8, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[9].setRotationPoint(-14.0F, 0.0F, -1.5F);
        super.gunModel[10].addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        super.gunModel[10].setRotationPoint(0.0F, 3.0F, -0.5F);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 0, 43, this.textureX, this.textureY);
        super.ammoModel[0].addShapeBox(0.0F, -1.0F, 0.0F, 5, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.ammoModel[0].setRotationPoint(2.0F, 2.0F, -1.0F);
        super.pumpModel = new ModelRendererTurbo[3];
        super.pumpModel[0] = new ModelRendererTurbo(this, 0, 73, this.textureX, this.textureY);
        super.pumpModel[1] = new ModelRendererTurbo(this, 0, 78, this.textureX, this.textureY);
        super.pumpModel[2] = new ModelRendererTurbo(this, 0, 83, this.textureX, this.textureY);
        super.pumpModel[0].addBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F);
        super.pumpModel[0].setRotationPoint(2.0F, -0.8F, -0.5F);
        super.pumpModel[1].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.pumpModel[1].setRotationPoint(6.0F, -0.8F, -1.5F);
        super.pumpModel[2].addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        super.pumpModel[2].setRotationPoint(6.0F, -0.8F, -2.5F);
        super.defaultScopeModel = new ModelRendererTurbo[6];
        super.defaultScopeModel[0] = new ModelRendererTurbo(this, 40, 29, this.textureX, this.textureY);
        super.defaultScopeModel[1] = new ModelRendererTurbo(this, 40, 29, this.textureX, this.textureY);
        super.defaultScopeModel[2] = new ModelRendererTurbo(this, 40, 34, this.textureX, this.textureY);
        super.defaultScopeModel[3] = new ModelRendererTurbo(this, 40, 41, this.textureX, this.textureY);
        super.defaultScopeModel[4] = new ModelRendererTurbo(this, 40, 50, this.textureX, this.textureY);
        super.defaultScopeModel[5] = new ModelRendererTurbo(this, 40, 59, this.textureX, this.textureY);
        super.defaultScopeModel[0].addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
        super.defaultScopeModel[0].setRotationPoint(0.0F, -1.0F, -0.5F);
        super.defaultScopeModel[1].addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
        super.defaultScopeModel[1].setRotationPoint(7.0F, -1.0F, -0.5F);
        super.defaultScopeModel[2].addBox(0.0F, -1.0F, 0.0F, 9, 2, 2, 0.0F);
        super.defaultScopeModel[2].setRotationPoint(0.0F, -3.0F, -1.0F);
        super.defaultScopeModel[3].addBox(0.0F, -1.0F, 0.0F, 2, 3, 3, 0.0F);
        super.defaultScopeModel[3].setRotationPoint(-2.0F, -3.5F, -1.5F);
        super.defaultScopeModel[4].addBox(0.0F, -1.0F, 0.0F, 2, 3, 3, 0.0F);
        super.defaultScopeModel[4].setRotationPoint(9.0F, -3.5F, -1.5F);
        super.defaultScopeModel[5].addBox(0.0F, -1.0F, 0.0F, 2, 3, 3, 0.0F);
        super.defaultScopeModel[5].setRotationPoint(11.0F, -3.5F, -1.5F);
        super.barrelAttachPoint = new Vector3f(1.8125F, 0.375F, 0.0F);
        super.gunSlideDistance = 0.5F;
        super.pumpDelayAfterReload = 65;
        super.pumpDelay = 6;
        super.pumpTime = 9;
        super.animationType = EnumAnimationType.BOTTOM_CLIP;
        this.flipAll();
        this.translateAll(0.0F, 6.0F, 0.0F);
    }
}
