package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelA91 extends ModelGun {

    int textureX = 64;
    int textureY = 16;

    public ModelA91() {
        super.gunModel = new ModelRendererTurbo[16];
        super.gunModel[0] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 32, 5, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 0, 5, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 0, 9, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 0, 12, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 10, 3, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 10, 5, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 22, 3, this.textureX, this.textureY);
        super.gunModel[8] = new ModelRendererTurbo(this, 14, 5, this.textureX, this.textureY);
        super.gunModel[9] = new ModelRendererTurbo(this, 32, 0, this.textureX, this.textureY);
        super.gunModel[10] = new ModelRendererTurbo(this, 36, 0, this.textureX, this.textureY);
        super.gunModel[11] = new ModelRendererTurbo(this, 12, 13, this.textureX, this.textureY);
        super.gunModel[12] = new ModelRendererTurbo(this, 6, 12, this.textureX, this.textureY);
        super.gunModel[13] = new ModelRendererTurbo(this, 16, 7, this.textureX, this.textureY);
        super.gunModel[14] = new ModelRendererTurbo(this, 0, 5, this.textureX, this.textureY);
        super.gunModel[15] = new ModelRendererTurbo(this, 40, 0, this.textureX, this.textureY);
        super.gunModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 15, 1, 2, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[0].setRotationPoint(-7.0F, -3.0F, -1.0F);
        super.gunModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F,
                -0.25F);
        super.gunModel[1].setRotationPoint(4.0F, -2.0F, -1.0F);
        super.gunModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F,
                -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F,
                -0.25F, -0.25F, -0.5F, -0.25F);
        super.gunModel[2].setRotationPoint(0.0F, -2.0F, -1.0F);
        super.gunModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 2, 0.0F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F,
                0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F,
                0.0F);
        super.gunModel[3].setRotationPoint(-7.0F, -4.0F, -1.0F);
        super.gunModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 1.0F, -0.5F, 0.0F,
                1.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.gunModel[4].setRotationPoint(-2.0F, -4.0F, -1.0F);
        super.gunModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
        super.gunModel[5].setRotationPoint(-1.0F, -5.0F, -0.5F);
        super.gunModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F,
                0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F,
                0.0F, -0.25F);
        super.gunModel[6].setRotationPoint(3.5F, -5.0F, -1.0F);
        super.gunModel[7].addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
        super.gunModel[7].setRotationPoint(-1.0F, -3.5F, -0.5F);
        super.gunModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F,
                -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F,
                0.0F, -0.25F, -0.25F);
        super.gunModel[8].setRotationPoint(8.0F, -3.0F, -0.5F);
        super.gunModel[9].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F,
                -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F,
                -0.1F, -0.1F);
        super.gunModel[9].setRotationPoint(11.0F, -3.0F, -0.5F);
        super.gunModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[10].setRotationPoint(7.0F, -5.0F, -0.5F);
        super.gunModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.25F, -0.8F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F,
                -0.8F, -0.25F, 0.25F, -0.8F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F,
                0.0F, -0.25F);
        super.gunModel[11].setRotationPoint(2.0F, -1.5F, -1.0F);
        super.gunModel[12].addShapeBox(-8.0F, -4.0F, -1.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.gunModel[13].addShapeBox(-6.0F, -2.0F, -1.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
        super.gunModel[14].addShapeBox(0.0F, -0.5F, -1.0F, 2, 2, 2, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F,
                -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F,
                -0.25F, -0.25F, -0.5F, -0.25F);
        super.gunModel[15].addShapeBox(-8.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        super.ammoModel = new ModelRendererTurbo[3];
        super.ammoModel[0] = new ModelRendererTurbo(this, 24, 5, this.textureX, this.textureY);
        super.ammoModel[1] = new ModelRendererTurbo(this, 24, 8, this.textureX, this.textureY);
        super.ammoModel[2] = new ModelRendererTurbo(this, 24, 12, this.textureX, this.textureY);
        super.ammoModel[0].addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        super.ammoModel[0].setRotationPoint(-4.0F, -2.0F, -1.0F);
        super.ammoModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
        super.ammoModel[1].setRotationPoint(-4.0F, -1.0F, -1.0F);
        super.ammoModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F);
        super.ammoModel[2].setRotationPoint(-3.75F, 1.0F, -1.0F);
        super.barrelAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
        super.stockAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
        super.scopeAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
        super.gripAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
        super.gunSlideDistance = 0.0F;
        super.animationType = EnumAnimationType.BULLPUP;
        this.translateAll(0.0F, 0.0F, 0.0F);
        this.flipAll();
    }
}
