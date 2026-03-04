// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.manus_modern_warfare;

import com.flansmod.client.model.ModelMG;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelBrowningM2HB extends ModelMG {
    int textureX;
    int textureY;

    public ModelBrowningM2HB() {
        this.textureX = 128;
        this.textureY = 32;
        (this.bipodModel = new ModelRendererTurbo[9])[0] = new ModelRendererTurbo(this, 0, 0, this.textureX,
                this.textureY);
        this.bipodModel[1] = new ModelRendererTurbo(this, 0, 4, this.textureX, this.textureY);
        this.bipodModel[2] = new ModelRendererTurbo(this, 0, 8, this.textureX, this.textureY);
        this.bipodModel[3] = new ModelRendererTurbo(this, 0, 16, this.textureX, this.textureY);
        this.bipodModel[4] = new ModelRendererTurbo(this, 24, 0, this.textureX, this.textureY);
        this.bipodModel[5] = new ModelRendererTurbo(this, 29, 0, this.textureX, this.textureY);
        this.bipodModel[6] = new ModelRendererTurbo(this, 0, 13, this.textureX, this.textureY);
        this.bipodModel[7] = new ModelRendererTurbo(this, 9, 8, this.textureX, this.textureY);
        this.bipodModel[8] = new ModelRendererTurbo(this, 9, 0, this.textureX, this.textureY);
        this.bipodModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.bipodModel[0].setRotationPoint(-1.0f, -0.5f, 7.0f);
        this.bipodModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.bipodModel[1].setRotationPoint(-7.0f, -0.5f, -9.0f);
        this.bipodModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.bipodModel[2].setRotationPoint(5.0f, -0.5f, -9.0f);
        this.bipodModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 9, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f,
                0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, -0.5f, 0.0f, -0.25f, -0.5f, 0.0f, -0.25f, -0.5f, 0.0f, -0.25f,
                -0.5f, 0.0f);
        this.bipodModel[3].setRotationPoint(-0.5f, -4.5f, 1.0f);
        this.bipodModel[3].rotateAngleX = -0.4886922f;
        this.bipodModel[4].addShapeBox(-1.0f, 0.0f, 0.0f, 1, 10, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f,
                0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, 0.0f, 0.0f,
                -0.5f);
        this.bipodModel[4].setRotationPoint(0.0f, -4.5f, -1.0f);
        this.bipodModel[4].rotateAngleX = -1.151917f;
        this.bipodModel[4].rotateAngleY = -0.6632251f;
        this.bipodModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 10, 1, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f,
                -0.5f);
        this.bipodModel[5].setRotationPoint(0.0f, -4.5f, -1.0f);
        this.bipodModel[5].rotateAngleX = -1.151917f;
        this.bipodModel[5].rotateAngleY = 0.6806784f;
        this.bipodModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f,
                -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f,
                -0.3f, -0.3f);
        this.bipodModel[6].setRotationPoint(-3.5f, -2.7f, -4.0f);
        this.bipodModel[6].rotateAngleX = -1.151917f;
        this.bipodModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f);
        this.bipodModel[7].setRotationPoint(-1.0f, -4.5f, -1.0f);
        this.bipodModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f,
                0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f,
                0.0f, -0.2f);
        this.bipodModel[8].setRotationPoint(-0.5f, -6.0f, -0.5f);
        (this.gunModel = new ModelRendererTurbo[23])[0] = new ModelRendererTurbo(this, 35, 0, this.textureX,
                this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 48, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 69, 0, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 35, 0, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 84, 0, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 49, 0, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 35, 6, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 49, 7, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 69, 0, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 69, 4, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 99, 0, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 84, 0, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 99, 0, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 109, 0, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 94, 9, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 101, 9, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 94, 9, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 94, 9, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 101, 9, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 94, 9, this.textureX, this.textureY);
        this.gunModel[20] = new ModelRendererTurbo(this, 48, 1, this.textureX, this.textureY);
        this.gunModel[21] = new ModelRendererTurbo(this, 99, 0, this.textureX, this.textureY);
        this.gunModel[22] = new ModelRendererTurbo(this, 109, 0, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(-0.5f, -1.5f, 8.5f, 1, 1, 11, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f,
                -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f,
                -0.1f, 0.0f);
        this.gunModel[0].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[1].addShapeBox(-1.5f, -2.5f, -5.5f, 3, 3, 13, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f,
                -0.85f, -0.85f, 0.0f, -0.85f, -0.85f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.85f, -0.85f,
                0.0f, -0.85f, -0.85f, 0.0f);
        this.gunModel[1].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[2].addBox(-1.0f, -2.5f, -8.5f, 2, 3, 10, 0.0f);
        this.gunModel[2].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[3].addBox(-1.2f, -2.0f, -3.0f, 1, 2, 3, 0.0f);
        this.gunModel[3].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[4].addBox(0.1f, -1.5f, -7.5f, 1, 1, 6, 0.0f);
        this.gunModel[4].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[5].addTrapezoid(-0.5f, -1.5f, -9.5f, 1, 1, 4, 0.0f, -0.2f, 0);
        this.gunModel[5].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[6].addShapeBox(0.3f, -2.5f, -2.5f, 1, 2, 1, 0.0f, -0.9f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f,
                0.0f, 0.0f, -0.9f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f,
                0.0f);
        this.gunModel[6].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[7].addShapeBox(1.3f, -2.5f, -2.5f, 2, 1, 1, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f,
                0.0f);
        this.gunModel[7].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[8].addShapeBox(-0.5f, -3.5f, 0.4f, 1, 2, 1, 0.0f, -0.3f, -0.4f, -0.4f, -0.3f, -0.4f, -0.4f, -0.3f,
                -0.4f, -0.2f, -0.3f, -0.4f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.gunModel[8].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[9].addShapeBox(-0.5f, -3.5f, -7.6f, 1, 2, 2, 0.0f, -0.3f, -0.4f, -0.6f, -0.3f, -0.4f, -0.6f,
                -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f);
        this.gunModel[9].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[10].addBox(-0.5f, -1.5f, 1.5f, 1, 1, 7, 0.0f);
        this.gunModel[10].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[11].addBox(-0.5f, -1.5f, 19.5f, 1, 1, 1, 0.0f);
        this.gunModel[11].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[12].addShapeBox(-0.5f, -0.8f, 7.4f, 1, 1, 1, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f,
                0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f,
                0.0f);
        this.gunModel[12].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[13].addShapeBox(-0.5f, 0.2f, 6.4f, 1, 1, 3, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f,
                0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f,
                0.0f);
        this.gunModel[13].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[14].addShapeBox(-1.5f, -3.0f, -10.0f, 1, 1, 2, 0.0f, 0.0f, -0.6f, 0.0f, -0.4f, -0.6f, 0.0f, 0.0f,
                -0.6f, 0.0f, -0.4999f, -0.6f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4999f,
                0.0f, 0.0f);
        this.gunModel[14].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[15].addShapeBox(-1.5f, -2.0f, -10.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f,
                0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, -0.4f, 0.0f, 0.0f,
                -0.4f);
        this.gunModel[15].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[16].addShapeBox(-1.5f, 0.0f, -10.0f, 1, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, -0.4999f, 0.0f, 0.0f, 0.0f, -0.6f, 0.0f, -0.4f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, -0.4999f,
                -0.6f, 0.0f);
        this.gunModel[16].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[17].addShapeBox(0.5f, -3.0f, -10.0f, 1, 1, 2, 0.0f, -0.4f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f,
                -0.4999f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4999f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f);
        this.gunModel[17].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[18].addShapeBox(0.5f, -2.0f, -10.0f, 1, 2, 1, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, -0.4f, 0.0f,
                -0.4f);
        this.gunModel[18].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[19].addShapeBox(0.5f, 0.0f, -10.0f, 1, 1, 2, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4999f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, -0.4999f, -0.6f, 0.0f, 0.0f, -0.6f,
                0.0f);
        this.gunModel[19].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[20].flip = true;
        this.gunModel[20].addShapeBox(-1.5f, -2.5f, -5.5f, 3, 3, 13, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f,
                -0.85f, -0.85f, 0.0f, -0.85f, -0.85f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.85f, -0.85f,
                0.0f, -0.85f, -0.85f, 0.0f);
        this.gunModel[20].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[21].flip = true;
        this.gunModel[21].addShapeBox(-0.5f, -0.8f, 7.4f, 1, 1, 1, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f,
                0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f,
                0.0f);
        this.gunModel[21].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[22].flip = true;
        this.gunModel[22].addShapeBox(-0.5f, 0.2f, 6.4f, 1, 1, 3, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f,
                0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f,
                0.0f);
        this.gunModel[22].setRotationPoint(0.0f, -6.0f, 0.0f);
        (this.ammoModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo(this, 35, 13,
                this.textureX, this.textureY);
        this.ammoModel[1] = new ModelRendererTurbo(this, 22, 14, this.textureX, this.textureY);
        this.ammoModel[0].addBox(-5.0f, -0.5f, -2.5f, 4, 4, 2, 0.0f);
        this.ammoModel[0].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.ammoModel[1].addShapeBox(-4.0f, -1.5f, -2.5f, 4, 1, 2, 0.0f, 0.0f, -1.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f,
                0.0f, -0.2f, 0.0f, -1.0f, -0.2f, 0.0f, 0.2f, -0.2f, 0.0f, -0.8f, -0.2f, 0.0f, -0.8f, -0.2f, 0.0f, 0.2f,
                -0.2f);
        this.ammoModel[1].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.flipAll();
    }
}
