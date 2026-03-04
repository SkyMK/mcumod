package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelSIGP226 extends ModelGun {

    public ModelSIGP226() {
        byte textureX = 32;
        byte textureY = 16;
        super.gunModel = new ModelRendererTurbo[3];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addBox(-1.0F, 3.0F, -1.0F, 7, 1, 2);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 3, textureX, textureY);
        super.gunModel[1].addShapeBox(-1.0F, -1.0F, -1.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
        super.gunModel[2] = new ModelRendererTurbo(this, 8, 3, textureX, textureY);
        super.gunModel[2].addBox(0.5F, 3.5F, -0.5F, 6, 1, 1);
        super.slideModel = new ModelRendererTurbo[2];
        super.slideModel[0] = new ModelRendererTurbo(this, 0, 9, textureX, textureY);
        super.slideModel[0].addShapeBox(-1.0F, 4.0F, -1.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
        super.slideModel[1] = new ModelRendererTurbo(this, 8, 5, textureX, textureY);
        super.slideModel[1].addBox(0.0F, 4.5F, -0.5F, 1, 1, 1);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 16, 5, textureX, textureY);
        super.ammoModel[0].addShapeBox(0.0F, -0.9F, -0.5F, 2, 4, 1, 0.0F, 0.9F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F,
                0.0F, 0.0F, 0.9F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F,
                0.0F);
        this.translateAll(0.0F, 0.0F, 0.0F);
        super.barrelAttachPoint = new Vector3f(0.40625F, 0.25F, 0.0F);
        super.scopeAttachPoint = new Vector3f(0.1875F, 0.3125F, 0.0F);
        super.scopeIsOnSlide = true;
        super.gunSlideDistance = 0.25F;
        super.animationType = EnumAnimationType.PISTOL_CLIP;
    }
}
