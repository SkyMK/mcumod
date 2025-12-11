// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.manus_modern_warfare;

import com.flansmod.client.model.ModelMG;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelMG3ZB extends ModelMG {
    int textureX;
    int textureY;

    public ModelMG3ZB() {
        this.textureX = 128;
        this.textureY = 32;
        (this.bipodModel = new ModelRendererTurbo[5])[0] = new ModelRendererTurbo(this, 112, 0,
                this.textureX, this.textureY);
        this.bipodModel[1] = new ModelRendererTurbo(this, 120, 0, this.textureX, this.textureY);
        this.bipodModel[2] = new ModelRendererTurbo(this, 120, 4, this.textureX, this.textureY);
        this.bipodModel[3] = new ModelRendererTurbo(this, 39, 3, this.textureX, this.textureY);
        this.bipodModel[4] = new ModelRendererTurbo(this, 44, 3, this.textureX, this.textureY);
        this.bipodModel[0].addTrapezoid(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.2f, 5);
        this.bipodModel[0].setRotationPoint(-0.5f, -6.0f, -0.5f);
        this.bipodModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f,
                0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f,
                0.0f);
        this.bipodModel[1].setRotationPoint(-6.0f, -0.5f, -1.0f);
        this.bipodModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f,
                0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f,
                0.0f);
        this.bipodModel[2].setRotationPoint(5.0f, -0.5f, -1.0f);
        this.bipodModel[3].addShapeBox(0.0f, 0.0f, -0.5f, 1, 8, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, 0.0f, -0.4f, -0.6f,
                0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, 0.0f, -0.4f, -0.6f, 0.0f, -0.2f, 0.0f, 0.0f,
                0.0f);
        this.bipodModel[3].setRotationPoint(-0.5f, -6.0f, 0.0f);
        this.bipodModel[3].rotateAngleZ = -0.7504916f;
        this.bipodModel[4].addShapeBox(-1.0f, 0.0f, -0.5f, 1, 8, 1, 0.0f, -0.6f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, -0.6f, 0.0f, -0.2f, -0.6f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, 0.0f,
                -0.2f);
        this.bipodModel[4].setRotationPoint(0.5f, -6.0f, 0.0f);
        this.bipodModel[4].rotateAngleZ = 0.7504916f;
        (this.gunModel = new ModelRendererTurbo[18])[0] = new ModelRendererTurbo(this, 104, 0,
                this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 99, 0, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 85, 0, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 99, 3, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 99, 6, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 60, 0, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 60, 0, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 74, 1, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 52, 1, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 89, 0, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 89, 4, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 89, 4, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 77, 0, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 63, 0, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 63, 4, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 51, 0, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 49, 0, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 55, 5, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(-0.5f, -1.0f, 3.0f, 1, 1, 1, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.1f,
                -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f,
                -0.1f, 0.0f);
        this.gunModel[0].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[1].addShapeBox(-0.5f, -1.0f, 2.0f, 1, 1, 1, 0.0f, -0.05f, -0.05f, 0.0f, -0.05f, -0.05f, 0.0f,
                -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.05f, -0.05f, 0.0f, -0.05f, -0.05f, 0.0f, -0.1f, -0.1f, 0.0f,
                -0.1f, -0.1f, 0.0f);
        this.gunModel[1].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[2].addShapeBox(-0.5f, -1.0f, -9.0f, 1, 1, 11, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f,
                -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f,
                -0.2f, 0.0f);
        this.gunModel[2].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[3].addShapeBox(-0.5f, -2.0f, 0.0f, 1, 1, 1, 0.0f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f,
                0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.3f, -0.3f,
                0.0f, -0.3f);
        this.gunModel[3].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[4].addShapeBox(-0.5f, -2.0f, -8.0f, 1, 1, 2, 0.0f, -0.4f, -0.3f, -0.2f, -0.4f, -0.3f, -0.2f,
                -0.4f, -0.3f, -1.0f, -0.4f, -0.3f, -1.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f,
                -0.3f, 0.0f, 0.0f);
        this.gunModel[4].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[5].addShapeBox(-0.5f, -1.0f, -9.0f, 1, 1, 11, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f,
                -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f,
                0.0f);
        this.gunModel[5].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[6].flip = true;
        this.gunModel[6].addShapeBox(-0.5f, -1.0f, -9.0f, 1, 1, 11, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f,
                -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f,
                0.0f);
        this.gunModel[6].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[7].addBox(-0.5f, -1.0f, -17.0f, 1, 1, 8, 0.0f);
        this.gunModel[7].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[8].addShapeBox(-0.5f, -2.0f, -17.0f, 1, 1, 8, 0.0f, 0.0f, -0.6f, -5.0f, 0.0f, -0.6f, -5.0f, 0.0f,
                -0.6f, -0.4f, 0.0f, -0.6f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.gunModel[8].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[9].addShapeBox(-0.6f, -1.2f, -11.4f, 1, 1, 2, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[9].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[10].addShapeBox(-0.5f, 0.0f, -13.5f, 1, 1, 2, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f,
                0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f,
                -0.3f);
        this.gunModel[10].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[11].flip = true;
        this.gunModel[11].addShapeBox(-0.5f, 0.0f, -13.5f, 1, 1, 2, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f,
                0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f,
                -0.3f);
        this.gunModel[11].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[12].addShapeBox(-0.5f, 0.0f, -13.5f, 1, 3, 1, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f,
                0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, -0.8f, 1.0f, -0.2f, -0.8f, 1.0f, -0.2f, -0.5f, -1.0f, -0.2f,
                -0.5f, -1.0f);
        this.gunModel[12].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[13].addShapeBox(-0.5f, -2.0f, -20.0f, 1, 1, 2, 0.0f, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f,
                -0.2f, -0.5f, -2.0f, -0.2f, -0.5f, -2.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.08f, 0.0f, 0.0f,
                -0.08f, 0.0f, 0.0f);
        this.gunModel[13].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[14].addShapeBox(-0.5f, -1.0f, -20.0f, 1, 1, 3, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.gunModel[14].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[15].addShapeBox(-0.5f, 0.0f, -20.0f, 1, 1, 3, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, 0.0f, -0.9f, -0.3f, 0.0f, -0.9f,
                -0.3f);
        this.gunModel[15].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[16].addShapeBox(0.3f, -1.0f, -12.2f, 1, 1, 1, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, -0.4f, 0.0f,
                -0.25f, -0.1f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, -0.4f, 0.0f, -0.25f, -0.1f, 0.0f,
                -0.25f, 0.0f);
        this.gunModel[16].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[17].addShapeBox(0.5f, -1.5f, -12.0f, 1, 2, 1, 0.0f, -0.5f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f,
                0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f,
                0.0f);
        this.gunModel[17].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 12, 0, this.textureX, this.textureY)).addShapeBox(
                -1.0f, -0.7f, -11.4f, 1, 5, 2, 0.0f, 0.0f, 0.0f, -0.2f, -0.8f, 0.0f, -0.2f, -0.8f, 0.0f, -0.2f, 0.0f,
                0.0f, -0.2f, 0.0f, 0.0f, -0.2f, -0.8f, 0.0f, -0.2f, -0.8f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.ammoModel[0].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.flipAll();
    }
}
