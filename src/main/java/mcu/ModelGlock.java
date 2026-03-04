package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelGlock extends ModelGun {

    int textureX = 256;
    int textureY = 16;

    public ModelGlock() {
        super.gunModel = new ModelRendererTurbo[6];
        super.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
        super.gunModel[0].addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        super.gunModel[0].setRotationPoint(0.0F, -2.5F, -1.0F);
        super.gunModel[0].rotateAngleZ = -0.1396263F;
        super.gunModel[1].addBox(0.0F, 0.0F, 0.0F, 9, 1, 2, 0.0F);
        super.gunModel[1].setRotationPoint(-1.0F, -3.0F, -1.0F);
        super.gunModel[2].addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
        super.gunModel[2].setRotationPoint(1.0F, -2.5F, -0.5F);
        super.gunModel[3].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.gunModel[3].setRotationPoint(7.5F, -3.5F, -0.5F);
        super.gunModel[4].addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        super.gunModel[4].setRotationPoint(1.5F, -1.5F, -0.5F);
        super.gunModel[5].addBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        super.gunModel[5].setRotationPoint(0.0F, -3.5F, -0.5F);
        super.ammoModel = new ModelRendererTurbo[3];
        super.ammoModel[0] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        super.ammoModel[1] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
        super.ammoModel[2] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        super.ammoModel[0].addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        super.ammoModel[0].setRotationPoint(0.0F, 2.0F, -0.5F);
        super.ammoModel[0].rotateAngleZ = -0.1396263F;
        super.ammoModel[1].addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        super.ammoModel[1].setRotationPoint(-0.5F, 1.9F, -0.5F);
        super.ammoModel[1].rotateAngleZ = -0.1396263F;
        super.ammoModel[2].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.ammoModel[2].setRotationPoint(-0.9F, 6.3F, -0.5F);
        super.ammoModel[2].rotateAngleZ = -0.1396263F;
        super.slideModel = new ModelRendererTurbo[2];
        super.slideModel[0] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
        super.slideModel[1] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
        super.slideModel[0].addBox(0.0F, 0.0F, 0.0F, 9, 1, 2, 0.0F);
        super.slideModel[0].setRotationPoint(-1.0F, -4.0F, -1.0F);
        super.slideModel[1].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.slideModel[1].setRotationPoint(7.0F, -4.5F, -0.5F);
        super.barrelAttachPoint = new Vector3f(0.53125F, 0.25F, 0.0F);
        super.scopeAttachPoint = new Vector3f(0.1875F, 0.3125F, 0.0F);
        super.scopeIsOnSlide = true;
        super.gunSlideDistance = 0.2F;
        super.animationType = EnumAnimationType.PISTOL_CLIP;
        this.flipAll();
        this.translateAll(0.0F, 1.0F, 0.0F);
    }
}
