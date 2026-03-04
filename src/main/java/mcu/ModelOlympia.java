package com.flansmod.client.model.zombie;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelOlympia extends ModelGun {

    public ModelOlympia() {
        byte textureX = 64;
        byte textureY = 16;
        super.gunModel = new ModelRendererTurbo[6];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addShapeBox(-5.0F, 2.0F, -1.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[1] = new ModelRendererTurbo(this, 8, 0, textureX, textureY);
        super.gunModel[1].addShapeBox(-3.0F, 2.0F, -1.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 5, textureX, textureY);
        super.gunModel[2].addBox(1.0F, 2.0F, -1.0F, 2, 1, 2);
        super.gunModel[3] = new ModelRendererTurbo(this, 10, 5, textureX, textureY);
        super.gunModel[3].addBox(1.0F, 3.0F, -1.0F, 1, 2, 2);
        super.gunModel[4] = new ModelRendererTurbo(this, 30, 0, textureX, textureY);
        super.gunModel[4].addBox(-1.5F, 4.0F, -0.5F, 1, 1, 1);
        super.gunModel[5] = new ModelRendererTurbo(this, 20, 2, textureX, textureY);
        super.gunModel[5].addShapeBox(-9.0F, 1.0F, -1.0F, 4, 3, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.ammoModel = new ModelRendererTurbo[2];
        super.ammoModel[0] = new ModelRendererTurbo(this, 20, 0, textureX, textureY);
        super.ammoModel[0].addBox(1.9F, 3.0F, -0.4F, 3.0F, 0.8F, 0.8F);
        super.ammoModel[1] = new ModelRendererTurbo(this, 20, 0, textureX, textureY);
        super.ammoModel[1].addBox(1.9F, 4.1F, -0.4F, 3.0F, 0.8F, 0.8F);
        super.barrelAttachPoint = new Vector3f(0.46875F, 0.25F, 0.0F);
        super.scopeAttachPoint = new Vector3f(0.1875F, 0.3125F, 0.0F);
        super.scopeIsOnSlide = true;
        super.gunSlideDistance = 0.25F;
        super.animationType = EnumAnimationType.BREAK_ACTION;
    }
}
