package com.flansmod.client.model.zombie;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelFlareGun extends ModelGun {

    public ModelFlareGun() {
        byte textureX = 64;
        byte textureY = 16;
        super.gunModel = new ModelRendererTurbo[3];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addShapeBox(-1.0F, -2.0F, -0.5F, 2, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
        super.gunModel[1] = new ModelRendererTurbo(this, 6, 0, textureX, textureY);
        super.gunModel[1].addShapeBox(1.0F, 0.0F, -0.5F, 5, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
        super.gunModel[2] = new ModelRendererTurbo(this, 18, 0, textureX, textureY);
        super.gunModel[2].addShapeBox(0.0F, 2.0F, -0.5F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 0, 14, textureX, textureY);
        super.ammoModel[0].addBox(2.5F, 2.5F, -0.5F, 5, 1, 1);
        super.barrelAttachPoint = new Vector3f(0.46875F, 0.25F, 0.0F);
        super.scopeAttachPoint = new Vector3f(0.25F, 0.3125F, 0.0F);
        this.translateAll(0.0F, 1.0F, 0.0F);
        super.gunSlideDistance = 0.25F;
        super.animationType = EnumAnimationType.BREAK_ACTION;
    }
}
