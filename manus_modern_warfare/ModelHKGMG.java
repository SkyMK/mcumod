// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.manus_modern_warfare;

import com.flansmod.client.model.ModelMG;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelHKGMG extends ModelMG {
    int textureX;
    int textureY;

    public ModelHKGMG() {
        this.textureX = 256;
        this.textureY = 32;
        (this.bipodModel = new ModelRendererTurbo[8])[0] = new ModelRendererTurbo(this, 248, 0,
                this.textureX, this.textureY);
        this.bipodModel[1] = new ModelRendererTurbo(this, 248, 0, this.textureX, this.textureY);
        this.bipodModel[2] = new ModelRendererTurbo(this, 248, 0, this.textureX, this.textureY);
        this.bipodModel[3] = new ModelRendererTurbo(this, 242, 4, this.textureX, this.textureY);
        this.bipodModel[4] = new ModelRendererTurbo(this, 242, 4, this.textureX, this.textureY);
        this.bipodModel[5] = new ModelRendererTurbo(this, 242, 4, this.textureX, this.textureY);
        this.bipodModel[6] = new ModelRendererTurbo(this, 243, 0, this.textureX, this.textureY);
        this.bipodModel[7] = new ModelRendererTurbo(this, 230, 0, this.textureX, this.textureY);
        this.bipodModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.bipodModel[0].setRotationPoint(-1.0f, -0.5f, 6.0f);
        this.bipodModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.bipodModel[1].setRotationPoint(-6.0f, -0.5f, -8.0f);
        this.bipodModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.bipodModel[2].setRotationPoint(4.0f, -0.5f, -8.0f);
        this.bipodModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                -4.9999f, 0.0f, 0.0f, -4.9999f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f,
                0.0f, -1.0f);
        this.bipodModel[3].setRotationPoint(-0.5f, -5.0f, 1.0f);
        this.bipodModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 6, 0.0f, 3.5f, -5.0f, 0.0f, -3.5f, -5.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.5f, 0.0f, -1.0f, -3.5f, 0.0f, -1.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f,
                0.0f);
        this.bipodModel[4].setRotationPoint(-2.0f, -5.0f, -7.0f);
        this.bipodModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 6, 0.0f, -3.5f, -5.0f, 0.0f, 3.5f, -5.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.5f, 0.0f, -1.0f, 3.5f, 0.0f, -1.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f,
                0.0f);
        this.bipodModel[5].setRotationPoint(1.0f, -5.0f, -7.0f);
        this.bipodModel[6].addBox(0.0f, 0.0f, 0.0f, 1, 6, 1, 0.0f);
        this.bipodModel[6].setRotationPoint(-0.5f, -7.0f, -0.5f);
        this.bipodModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f,
                0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f);
        this.bipodModel[7].setRotationPoint(-2.0f, -5.0f, -1.0f);
        (this.gunModel = new ModelRendererTurbo[10])[0] = new ModelRendererTurbo(this, 215, 0,
                this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 213, 0, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 196, 0, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 191, 0, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 174, 0, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 169, 0, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 158, 0, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 158, 0, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 81, 0, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[0].addBox(-1.5f, -3.5f, -7.0f, 3, 3, 8, 0.0f);
        this.gunModel[0].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[1].addBox(1.0f, -3.0f, -3.0f, 1, 2, 3, 0.0f);
        this.gunModel[1].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[2].addShapeBox(-0.5f, -2.5f, 1.0f, 1, 1, 7, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f,
                -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f,
                0.0f, -0.15f, -0.15f, 0.0f);
        this.gunModel[2].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[3].addBox(-0.5f, -2.5f, 8.0f, 1, 1, 4, 0.0f);
        this.gunModel[3].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[4].addShapeBox(-4.5f, -1.0f, -6.0f, 9, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f);
        this.gunModel[4].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[5].addBox(-2.0f, -3.0f, -5.5f, 1, 2, 1, 0.0f);
        this.gunModel[5].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[6].addShapeBox(-2.0f, -6.0f, -11.5f, 1, 3, 7, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f,
                -2.9999f, 0.0f, 0.0f, -2.9999f, 0.0f, 0.0f, -2.5f, 0.0f, -0.5f, -2.5f, 0.0f, -0.5f, 0.0f, -1.0f, 0.0f,
                0.0f, -1.0f);
        this.gunModel[6].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[7].addShapeBox(-0.5f, -4.0f, -6.0f, 1, 1, 2, 0.0f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f,
                0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.gunModel[7].setRotationPoint(0.0f, -5.999f, 0.0f);
        this.gunModel[8].addShapeBox(-0.5f, -5.0f, -6.0f, 30, 30, 2, 0.0f, 0.0f, 0.0f, 0.0f, -29.0f, 0.0f, 0.0f, -29.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -29.0f, 0.0f, -29.0f, -29.0f, 0.0f, -29.0f, -29.0f, 0.0f, 0.0f,
                -29.0f, 0.0f);
        this.gunModel[8].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[9].flip = true;
        this.gunModel[9].addShapeBox(-0.5f, -5.0f, -6.0f, 30, 30, 2, 0.0f, 0.0f, 0.0f, 0.0f, -29.0f, 0.0f, 0.0f, -29.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -29.0f, 0.0f, -29.0f, -29.0f, 0.0f, -29.0f, -29.0f, 0.0f, 0.0f,
                -29.0f, 0.0f);
        this.gunModel[9].setRotationPoint(0.0f, -6.0f, 0.0f);
        (this.ammoModel = new ModelRendererTurbo[5])[0] = new ModelRendererTurbo(this, 66, 0, this.textureX,
                this.textureY);
        this.ammoModel[1] = new ModelRendererTurbo(this, 66, 6, this.textureX, this.textureY);
        this.ammoModel[2] = new ModelRendererTurbo(this, 66, 9, this.textureX, this.textureY);
        this.ammoModel[3] = new ModelRendererTurbo(this, 66, 12, this.textureX, this.textureY);
        this.ammoModel[4] = new ModelRendererTurbo(this, 66, 15, this.textureX, this.textureY);
        this.ammoModel[0].addBox(-6.5f, -1.5f, -2.0f, 5, 3, 2, 0.0f);
        this.ammoModel[0].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.ammoModel[1].addShapeBox(-3.3f, -2.0f, -0.9f, 1, 1, 1, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f,
                -0.25f, -0.25f, -0.2f, -0.25f, -0.25f, -0.2f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.25f, -0.25f,
                -0.2f, -0.25f, -0.25f, -0.2f);
        this.ammoModel[1].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.ammoModel[2].addShapeBox(-3.3f, -2.0f, -1.9f, 1, 1, 1, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f,
                -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f,
                -0.1f, 0.0f);
        this.ammoModel[2].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.ammoModel[3].addShapeBox(-2.3f, -2.8f, -0.9f, 1, 1, 1, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f,
                -0.25f, -0.25f, -0.2f, -0.25f, -0.25f, -0.2f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.25f, -0.25f,
                -0.2f, -0.25f, -0.25f, -0.2f);
        this.ammoModel[3].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.ammoModel[4].addShapeBox(-2.3f, -2.8f, -1.9f, 1, 1, 1, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f,
                -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f,
                -0.1f, 0.0f);
        this.ammoModel[4].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.flipAll();
    }
}
