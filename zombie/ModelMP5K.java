package com.flansmod.client.model.zombie;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelMP5K extends ModelGun {

    public ModelMP5K() {
        byte textureX = 64;
        byte textureY = 16;
        super.gunModel = new ModelRendererTurbo[6];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.gunModel[0].addBox(-0.5F, 4.0F, -0.75F, 9.0F, 1.0F, 1.5F);
        super.gunModel[1] = new ModelRendererTurbo(this, 0, 3, textureX, textureY);
        super.gunModel[1].addBox(-0.5F, 3.0F, -1.0F, 9, 1, 2);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
        super.gunModel[2].addBox(-0.5F, 2.0F, -1.0F, 6, 1, 2);
        super.gunModel[3] = new ModelRendererTurbo(this, 26, 0, textureX, textureY);
        super.gunModel[3].addBox(8.5F, 3.0F, -0.5F, 1, 1, 1);
        super.gunModel[5] = new ModelRendererTurbo(this, 26, 0, textureX, textureY);
        super.gunModel[5].addBox(7.0F, 5.0F, -0.5F, 1, 1, 1);
        super.gunModel[4] = new ModelRendererTurbo(this, 0, 9, textureX, textureY);
        super.gunModel[4].addBox(-0.75F, -3.0F, -0.75F, 1.5F, 4.0F, 1.5F);
        super.gunModel[4].setRotationPoint(1.0F, 2.0F, 0.0F);
        super.gunModel[4].rotateAngleZ = -0.5F;
        super.ammoModel = new ModelRendererTurbo[1];
        super.ammoModel[0] = new ModelRendererTurbo(this, 8, 9, textureX, textureY);
        super.ammoModel[0].addShapeBox(3.0F, -1.0F, -0.5F, 2, 4, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.8F, -0.2F, 0.0F, 0.8F,
                -0.2F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.stockAttachPoint = new Vector3f(-0.0625F, 0.21875F, 0.0F);
        super.defaultGripModel = new ModelRendererTurbo[1];
        super.defaultGripModel[0] = new ModelRendererTurbo(this, 21, 9, textureX, textureY);
        super.defaultGripModel[0].addBox(7.0F, 1.0F, -0.5F, 1, 2, 1);
        super.barrelAttachPoint = new Vector3f(0.5625F, 0.21875F, 0.0F);
        super.scopeAttachPoint = new Vector3f(0.125F, 0.3125F, 0.0F);
        super.gunSlideDistance = 0.25F;
        super.animationType = EnumAnimationType.PISTOL_CLIP;
    }
}
