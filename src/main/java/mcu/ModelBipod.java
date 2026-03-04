// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.svz;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelBipod extends ModelAttachment {
    int textureX;
    int textureY;

    public ModelBipod() {
        this.textureX = 128;
        this.textureY = 64;
        (this.attachmentModel = new ModelRendererTurbo[14])[0] = new ModelRendererTurbo(this, 0, 0,
                this.textureX, this.textureY);
        this.attachmentModel[1] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[2] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[3] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[4] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[5] = new ModelRendererTurbo(this, 30, 0, this.textureX, this.textureY);
        this.attachmentModel[6] = new ModelRendererTurbo(this, 30, 0, this.textureX, this.textureY);
        this.attachmentModel[7] = new ModelRendererTurbo(this, 30, 3, this.textureX, this.textureY);
        this.attachmentModel[8] = new ModelRendererTurbo(this, 30, 0, this.textureX, this.textureY);
        this.attachmentModel[9] = new ModelRendererTurbo(this, 30, 0, this.textureX, this.textureY);
        this.attachmentModel[10] = new ModelRendererTurbo(this, 30, 3, this.textureX, this.textureY);
        this.attachmentModel[11] = new ModelRendererTurbo(this, 30, 3, this.textureX, this.textureY);
        this.attachmentModel[12] = new ModelRendererTurbo(this, 30, 3, this.textureX, this.textureY);
        this.attachmentModel[13] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[0].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[0].setRotationPoint(-0.5f, 0.0f, -0.5f);
        this.attachmentModel[1].addBox(0.0f, 0.0f, 0.0f, 3, 1, 7, 0.0f);
        this.attachmentModel[1].setRotationPoint(-1.0f, 0.0f, -3.5f);
        this.attachmentModel[2].addBox(0.0f, -13.0f, 0.0f, 2, 13, 2, 0.0f);
        this.attachmentModel[2].setRotationPoint(-0.5f, 0.0f, 0.2f);
        this.attachmentModel[2].rotateAngleX = -0.3141593f;
        this.attachmentModel[3].addBox(0.0f, 0.0f, 0.0f, 3, 2, 1, 0.0f);
        this.attachmentModel[3].setRotationPoint(-1.0f, -2.0f, 2.5f);
        this.attachmentModel[4].addBox(0.0f, 0.0f, 0.0f, 3, 2, 1, 0.0f);
        this.attachmentModel[4].setRotationPoint(-1.0f, -2.0f, -3.5f);
        this.attachmentModel[5].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[5].setRotationPoint(0.0f, -1.0f, 2.6f);
        this.attachmentModel[6].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[6].setRotationPoint(0.0f, -1.0f, -3.6f);
        this.attachmentModel[7].addBox(0.0f, 0.0f, 0.0f, 3, 2, 2, 0.0f);
        this.attachmentModel[7].setRotationPoint(-0.9f, -2.0f, 0.0f);
        this.attachmentModel[7].rotateAngleX = -0.7853982f;
        this.attachmentModel[8].addBox(0.5f, -13.5f, -1.5f, 1, 1, 1, 0.0f);
        this.attachmentModel[8].setRotationPoint(-0.5f, 0.0f, -0.2f);
        this.attachmentModel[8].rotateAngleX = 0.3141593f;
        this.attachmentModel[9].addBox(-0.5f, -13.5f, 0.5f, 1, 1, 1, 0.0f);
        this.attachmentModel[9].setRotationPoint(0.5f, 0.0f, 0.2f);
        this.attachmentModel[9].rotateAngleX = -0.3141593f;
        this.attachmentModel[10].addBox(-1.0f, -14.5f, -2.0f, 2, 1, 2, 0.0f);
        this.attachmentModel[10].setRotationPoint(0.5f, 0.0f, -0.2f);
        this.attachmentModel[10].rotateAngleX = 0.3141593f;
        this.attachmentModel[11].addBox(0.0f, -14.5f, 0.0f, 2, 1, 2, 0.0f);
        this.attachmentModel[11].setRotationPoint(-0.5f, 0.0f, 0.2f);
        this.attachmentModel[11].rotateAngleX = -0.3141593f;
        this.attachmentModel[12].addBox(0.0f, 0.0f, 0.0f, 3, 2, 2, 0.0f);
        this.attachmentModel[12].setRotationPoint(-1.1f, -2.0f, 0.0f);
        this.attachmentModel[12].rotateAngleX = -0.7853982f;
        this.attachmentModel[13].addBox(0.0f, -13.0f, -2.0f, 2, 13, 2, 0.0f);
        this.attachmentModel[13].setRotationPoint(-0.5f, 0.0f, -0.2f);
        this.attachmentModel[13].rotateAngleX = 0.3141593f;
    }
}
