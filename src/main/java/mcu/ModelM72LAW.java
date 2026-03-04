package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelM72LAW extends ModelGun {

    public ModelM72LAW() {
        byte textureX = 64;
        byte textureY = 16;
        super.gunModel = new ModelRendererTurbo[4];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
        super.gunModel[0].addBox(-12.0F, 1.0F, -1.5F, 26, 3, 3);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 7, textureX, textureY);
        super.gunModel[1].addBox(-12.0F, 4.0F, -1.0F, 3, 1, 2);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[2].addBox(0.0F, 4.0F, -1.0F, 14, 1, 2);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 3, textureX, textureY);
        super.gunModel[3].addBox(0.0F, 5.0F, -0.5F, 1, 2, 1);
        super.scopeAttachPoint = new Vector3f(0.09375F, 0.3125F, 0.0F);
        super.barrelAttachPoint = new Vector3f(1.125F, 0.25F, 0.0F);
        super.stockAttachPoint = new Vector3f(-0.0625F, 0.0625F, 0.0F);
        super.ammoModel = new ModelRendererTurbo[0];
        super.gunSlideDistance = 0.5F;
        super.animationType = EnumAnimationType.END_LOADED;
        super.tiltGunTime = 0.4F;
        super.unloadClipTime = 0.1F;
        super.loadClipTime = 0.1F;
        super.untiltGunTime = 0.4F;
    }
}
