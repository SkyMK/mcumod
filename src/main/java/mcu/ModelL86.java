package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelL86 extends ModelGun {

    public ModelL86() {
        byte textureX = 64;
        byte textureY = 16;
        super.gunModel = new ModelRendererTurbo[8];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addBox(-8.0F, 1.0F, -1.0F, 1, 4, 2);
        super.gunModel[1] = new ModelRendererTurbo(this, 6, 0, textureX, textureY);
        super.gunModel[1].addShapeBox(-7.0F, 2.0F, -1.0F, 8, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F,
                -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[2] = new ModelRendererTurbo(this, 26, 0, textureX, textureY);
        super.gunModel[2].addShapeBox(-4.0F, 1.0F, -1.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.625F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.625F,
                0.0F);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
        super.gunModel[3].addBox(1.0F, 3.0F, -1.0F, 8, 2, 2);
        super.gunModel[4] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
        super.gunModel[4].addBox(9.0F, 3.5F, -0.5F, 8, 1, 1);
        super.gunModel[5] = new ModelRendererTurbo(this, 0, 12, textureX, textureY);
        super.gunModel[5].addBox(9.0F, 3.0F, -1.0F, 6, 1, 2);
        super.gunModel[6] = new ModelRendererTurbo(this, 18, 5, textureX, textureY);
        super.gunModel[6].addBox(7.5F, 4.5F, -0.5F, 1, 1, 1);
        super.gunModel[7] = new ModelRendererTurbo(this, 17, 11, textureX, textureY);
        super.gunModel[7].addShapeBox(3.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F,
                0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.ammoModel = new ModelRendererTurbo[3];
        super.ammoModel[0] = new ModelRendererTurbo(this, 25, 9, textureX, textureY);
        super.ammoModel[0].addBox(-4.0F, -4.0F, -1.0F, 2, 5, 2);
        super.ammoModel[1] = new ModelRendererTurbo(this, 41, 9, textureX, textureY);
        super.ammoModel[1].addShapeBox(-4.0F, -4.0F, -3.0F, 2, 5, 2, 0.0F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.ammoModel[2] = new ModelRendererTurbo(this, 33, 9, textureX, textureY);
        super.ammoModel[2].addShapeBox(-4.0F, -4.0F, 1.0F, 2, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F,
                -0.5F);
        super.stockAttachPoint = new Vector3f(-0.0625F, 0.25F, 0.0F);
        super.barrelAttachPoint = new Vector3f(0.734375F, 0.21875F, 0.0F);
        super.scopeAttachPoint = new Vector3f(0.125F, 0.3125F, 0.0F);
        super.gripAttachPoint = new Vector3f(0.875F, 0.1875F, 0.0F);
        super.defaultGripModel = new ModelRendererTurbo[3];
        super.defaultGripModel[0] = new ModelRendererTurbo(this, 34, 0, textureX, textureY);
        super.defaultGripModel[0].addBox(15.0F, 2.0F, -1.0F, 1, 1, 2);
        super.defaultGripModel[1] = new ModelRendererTurbo(this, 44, 0, textureX, textureY);
        super.defaultGripModel[1].addShapeBox(15.0F, -3.0F, -1.0F, 1, 5, 1, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F,
                0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.defaultGripModel[2] = new ModelRendererTurbo(this, 40, 0, textureX, textureY);
        super.defaultGripModel[2].addShapeBox(15.0F, -3.0F, 0.0F, 1, 5, 1, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F,
                0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.gunSlideDistance = 0.25F;
        super.animationType = EnumAnimationType.BULLPUP;
        super.tiltGunTime = 0.1F;
        super.unloadClipTime = 0.2F;
        super.loadClipTime = 0.2F;
        super.untiltGunTime = 0.5F;
    }
}
