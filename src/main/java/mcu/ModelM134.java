// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.manus_modern_warfare;

import com.flansmod.client.model.ModelMG;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelM134 extends ModelMG {
    int textureX;
    int textureY;

    public ModelM134() {
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
        (this.gunModel = new ModelRendererTurbo[32])[0] = new ModelRendererTurbo(this, 213, 0,
                this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 212, 0, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 203, 0, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 193, 0, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 186, 0, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 177, 0, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 136, 0, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 136, 0, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 136, 0, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 136, 0, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 131, 0, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 131, 0, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 115, 0, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 99, 3, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 83, 0, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 67, 3, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 51, 0, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 35, 3, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 35, 0, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 168, 0, this.textureX, this.textureY);
        this.gunModel[20] = new ModelRendererTurbo(this, 168, 4, this.textureX, this.textureY);
        this.gunModel[21] = new ModelRendererTurbo(this, 168, 7, this.textureX, this.textureY);
        this.gunModel[22] = new ModelRendererTurbo(this, 159, 0, this.textureX, this.textureY);
        this.gunModel[23] = new ModelRendererTurbo(this, 159, 4, this.textureX, this.textureY);
        this.gunModel[24] = new ModelRendererTurbo(this, 159, 7, this.textureX, this.textureY);
        this.gunModel[25] = new ModelRendererTurbo(this, 150, 0, this.textureX, this.textureY);
        this.gunModel[26] = new ModelRendererTurbo(this, 150, 4, this.textureX, this.textureY);
        this.gunModel[27] = new ModelRendererTurbo(this, 150, 7, this.textureX, this.textureY);
        this.gunModel[28] = new ModelRendererTurbo(this, 141, 0, this.textureX, this.textureY);
        this.gunModel[29] = new ModelRendererTurbo(this, 141, 4, this.textureX, this.textureY);
        this.gunModel[30] = new ModelRendererTurbo(this, 141, 7, this.textureX, this.textureY);
        this.gunModel[31] = new ModelRendererTurbo(this, 186, 0, this.textureX, this.textureY);
        this.gunModel[0].addBox(-2.0f, -4.0f, -7.0f, 4, 4, 8, 0.0f);
        this.gunModel[0].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[1].addShapeBox(-3.0f, -2.0f, -4.5f, 1, 1, 3, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f,
                0.0f);
        this.gunModel[1].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[2].addShapeBox(-3.5f, -2.5f, -2.5f, 2, 2, 2, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.3f,
                0.0f);
        this.gunModel[2].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[3].addShapeBox(-1.0f, -5.0f, -5.0f, 2, 2, 2, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f,
                -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.gunModel[3].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[4].addShapeBox(-1.0f, -6.0f, -0.5f, 2, 3, 1, 0.0f, 0.7f, -0.5f, 0.0f, 0.7f, -0.5f, 0.0f, 0.7f,
                -0.5f, 0.0f, 0.7f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[4].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[5].addShapeBox(-1.5f, -3.5f, 0.2f, 3, 3, 1, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f,
                0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f);
        this.gunModel[5].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[6].addShapeBox(-2.0f, -3.0f, -8.0f, 1, 1, 1, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f,
                -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f,
                0.0f);
        this.gunModel[6].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[7].addShapeBox(1.0f, -3.0f, -8.0f, 1, 1, 1, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f,
                -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f,
                0.0f);
        this.gunModel[7].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[8].addShapeBox(-2.0f, -1.0f, -8.0f, 1, 1, 1, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f,
                -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f,
                0.0f);
        this.gunModel[8].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[9].addShapeBox(1.0f, -1.0f, -8.0f, 1, 1, 1, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f,
                -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f,
                0.0f);
        this.gunModel[9].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[10].addBox(-2.0f, -3.0f, -9.0f, 1, 3, 1, 0.0f);
        this.gunModel[10].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[11].addBox(1.0f, -3.0f, -9.0f, 1, 3, 1, 0.0f);
        this.gunModel[11].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[12].addShapeBox(-0.5f, -3.5f, 0.0f, 1, 1, 13, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f,
                0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f,
                0.0f);
        this.gunModel[12].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[13].addShapeBox(-0.5f, -1.5f, 0.0f, 1, 1, 13, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f,
                -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f,
                0.0f);
        this.gunModel[13].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[14].addShapeBox(0.5f, -3.0f, 0.0f, 1, 1, 13, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, -0.4f, -0.4f,
                0.0f);
        this.gunModel[14].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[15].addShapeBox(0.5f, -2.0f, 0.0f, 1, 1, 13, 0.0f, -0.4f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f,
                -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f,
                0.0f);
        this.gunModel[15].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[16].addShapeBox(-1.5f, -3.0f, 0.0f, 1, 1, 13, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f,
                0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, 0.0f, -0.4f,
                0.0f);
        this.gunModel[16].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[17].addShapeBox(-1.5f, -2.0f, 0.0f, 1, 1, 13, 0.0f, 0.0f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f,
                -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f);
        this.gunModel[17].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[18].addShapeBox(-3.5f, -2.5f, -6.5f, 2, 2, 3, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.3f,
                0.0f);
        this.gunModel[18].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[19].addShapeBox(-1.5f, -3.0f, 6.0f, 3, 2, 1, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f,
                0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f);
        this.gunModel[19].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[20].addShapeBox(-1.5f, -4.0f, 6.0f, 3, 1, 1, 0.0f, -1.2f, -0.4f, 0.0f, -1.2f, -0.4f, 0.0f, -1.2f,
                -0.4f, 0.0f, -1.2f, -0.4f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f,
                0.0f);
        this.gunModel[20].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[21].addShapeBox(-1.5f, -1.0f, 6.0f, 3, 1, 1, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f,
                0.0f, 0.1f, 0.0f, 0.0f, -1.2f, -0.4f, 0.0f, -1.2f, -0.4f, 0.0f, -1.2f, -0.4f, 0.0f, -1.2f, -0.4f, 0.0f);
        this.gunModel[21].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[22].addShapeBox(-1.5f, -3.0f, 10.5f, 3, 2, 1, 0.0f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, -0.8f, 0.1f,
                0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f);
        this.gunModel[22].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[23].addShapeBox(-1.5f, -4.0f, 10.5f, 3, 1, 1, 0.0f, -1.2f, -0.4f, -0.8f, -1.2f, -0.4f, -0.8f,
                -1.2f, -0.4f, 0.0f, -1.2f, -0.4f, 0.0f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, 0.0f, 0.1f,
                0.0f, 0.0f);
        this.gunModel[23].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[24].addShapeBox(-1.5f, -1.0f, 10.5f, 3, 1, 1, 0.0f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, -0.8f, 0.1f,
                0.0f, 0.0f, 0.1f, 0.0f, 0.0f, -1.2f, -0.4f, -0.8f, -1.2f, -0.4f, -0.8f, -1.2f, -0.4f, 0.0f, -1.2f,
                -0.4f, 0.0f);
        this.gunModel[24].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[25].addShapeBox(-1.5f, -3.0f, 11.0f, 3, 2, 1, 0.0f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, -0.8f, 0.1f,
                0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f);
        this.gunModel[25].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[26].addShapeBox(-1.5f, -4.0f, 11.0f, 3, 1, 1, 0.0f, -1.2f, -0.4f, -0.8f, -1.2f, -0.4f, -0.8f,
                -1.2f, -0.4f, 0.0f, -1.2f, -0.4f, 0.0f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, 0.0f, 0.1f,
                0.0f, 0.0f);
        this.gunModel[26].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[27].addShapeBox(-1.5f, -1.0f, 11.0f, 3, 1, 1, 0.0f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, -0.8f, 0.1f,
                0.0f, 0.0f, 0.1f, 0.0f, 0.0f, -1.2f, -0.4f, -0.8f, -1.2f, -0.4f, -0.8f, -1.2f, -0.4f, 0.0f, -1.2f,
                -0.4f, 0.0f);
        this.gunModel[27].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[28].addShapeBox(-1.5f, -3.0f, 11.5f, 3, 2, 1, 0.0f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, -0.8f, 0.1f,
                0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f);
        this.gunModel[28].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[29].addShapeBox(-1.5f, -4.0f, 11.5f, 3, 1, 1, 0.0f, -1.2f, -0.4f, -0.8f, -1.2f, -0.4f, -0.8f,
                -1.2f, -0.4f, 0.0f, -1.2f, -0.4f, 0.0f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, 0.0f, 0.1f,
                0.0f, 0.0f);
        this.gunModel[29].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[30].addShapeBox(-1.5f, -1.0f, 11.5f, 3, 1, 1, 0.0f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, -0.8f, 0.1f,
                0.0f, 0.0f, 0.1f, 0.0f, 0.0f, -1.2f, -0.4f, -0.8f, -1.2f, -0.4f, -0.8f, -1.2f, -0.4f, 0.0f, -1.2f,
                -0.4f, 0.0f);
        this.gunModel[30].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.gunModel[31].flip = true;
        this.gunModel[31].addShapeBox(-1.0f, -6.0f, -0.5f, 2, 3, 1, 0.0f, 0.7f, -0.5f, 0.0f, 0.7f, -0.5f, 0.0f, 0.7f,
                -0.5f, 0.0f, 0.7f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[31].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 28, 0, this.textureX, this.textureY)).addShapeBox(
                -2.5f, -0.5f, -5.0f, 1, 6, 2, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f,
                0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.ammoModel[0].setRotationPoint(0.0f, -6.0f, 0.0f);
        this.flipAll();
    }
}
