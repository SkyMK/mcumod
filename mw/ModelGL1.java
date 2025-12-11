package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelGL1 extends ModelGun {

    public ModelGL1() {
        byte textureX = 64;
        byte textureY = 16;
        super.gunModel = new ModelRendererTurbo[4];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addShapeBox(-8.0F, 2.0F, -1.0F, 4, 3, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F,
                0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[1] = new ModelRendererTurbo(this, 12, 0, textureX, textureY);
        super.gunModel[1].addShapeBox(-4.0F, 2.0F, -1.0F, 4, 2, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
        super.gunModel[2] = new ModelRendererTurbo(this, 24, 0, textureX, textureY);
        super.gunModel[2].addShapeBox(0.0F, 2.0F, -1.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 5, textureX, textureY);
        super.gunModel[3].addBox(3.0F, 2.0F, -1.0F, 5, 1, 2);
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 20, 12, textureX, textureY);
        super.ammoModel[0].addBox(2.9F, 3.25F, -0.75F, 3.0F, 1.5F, 1.5F);
        super.barrelAttachPoint = new Vector3f(0.46875F, 0.25F, 0.0F);
        super.scopeAttachPoint = new Vector3f(0.1875F, 0.3125F, 0.0F);
        super.scopeIsOnSlide = true;
        this.translateAll(-4.0F, 0.0F, 0.0F);
        super.gunSlideDistance = 0.25F;
        super.animationType = EnumAnimationType.BREAK_ACTION;
        super.tiltGunTime = 0.2F;
        super.unloadClipTime = 0.2F;
        super.loadClipTime = 0.2F;
        super.untiltGunTime = 0.4F;
    }
}
