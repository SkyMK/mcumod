package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelPanzerfaust3 extends ModelGun {

    int textureX = 256;
    int textureY = 16;

    public ModelPanzerfaust3() {
        super.gunModel = new ModelRendererTurbo[13];
        super.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        super.gunModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        super.gunModel[2] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        super.gunModel[3] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        super.gunModel[4] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        super.gunModel[5] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
        super.gunModel[6] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        super.gunModel[7] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
        super.gunModel[8] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
        super.gunModel[9] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
        super.gunModel[10] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
        super.gunModel[11] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
        super.gunModel[12] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
        super.gunModel[0].addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        super.gunModel[0].setRotationPoint(-1.0F, -3.23F, -0.5F);
        super.gunModel[1].addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        super.gunModel[1].setRotationPoint(-2.0F, -4.5F, -0.5F);
        super.gunModel[2].addBox(0.0F, 0.0F, 0.0F, 17, 2, 2, 0.0F);
        super.gunModel[2].setRotationPoint(-18.0F, -6.0F, -1.0F);
        super.gunModel[3].addBox(0.0F, 0.0F, 0.0F, 6, 3, 3, 0.0F);
        super.gunModel[3].setRotationPoint(-12.0F, -6.5F, -1.5F);
        super.gunModel[4].addBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
        super.gunModel[4].setRotationPoint(-1.0F, -6.5F, -1.5F);
        super.gunModel[5].addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
        super.gunModel[5].setRotationPoint(-2.0F, -6.0F, 2.3F);
        super.gunModel[6].addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        super.gunModel[6].setRotationPoint(-1.0F, -6.0F, 0.3F);
        super.gunModel[7].addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
        super.gunModel[7].setRotationPoint(-19.0F, -6.5F, -1.5F);
        super.gunModel[8].addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        super.gunModel[8].setRotationPoint(-13.0F, -4.0F, 0.0F);
        super.gunModel[9].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.gunModel[9].setRotationPoint(-13.0F, -2.0F, 0.0F);
        super.gunModel[10].addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
        super.gunModel[10].setRotationPoint(-2.0F, -7.0F, 1.3F);
        super.gunModel[11].addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
        super.gunModel[11].setRotationPoint(-2.0F, -8.0F, 2.3F);
        super.gunModel[12].addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
        super.gunModel[12].setRotationPoint(-2.0F, -7.0F, 3.3F);
        super.ammoModel = new ModelRendererTurbo[2];
        super.ammoModel[0] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
        super.ammoModel[1] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
        super.ammoModel[0].addBox(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F);
        super.ammoModel[0].setRotationPoint(0.0F, -5.5F, -0.5F);
        super.ammoModel[1].addBox(0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F);
        super.ammoModel[1].setRotationPoint(2.0F, -6.0F, -1.0F);
        super.gunSlideDistance = 0.0F;
        super.animationType = EnumAnimationType.NONE;
        this.flipAll();
        this.translateAll(0.0F, 0.0F, 3.0F);
    }
}
