// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.svz;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelAimPoint extends ModelAttachment {
    int textureX;
    int textureY;

    public ModelAimPoint() {
        this.textureX = 128;
        this.textureY = 64;
        (this.attachmentModel = new ModelRendererTurbo[14])[0] = new ModelRendererTurbo(this, 0, 0,
                this.textureX, this.textureY);
        this.attachmentModel[1] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[2] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[3] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[4] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[5] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[6] = new ModelRendererTurbo(this, 0, 25, this.textureX, this.textureY);
        this.attachmentModel[7] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[8] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[9] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[10] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[11] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[12] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[13] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[0].addBox(0.0f, 0.0f, 0.0f, 30, 5, 10, 0.0f);
        this.attachmentModel[0].setRotationPoint(-10.0f, -1.0f, -5.0f);
        this.attachmentModel[1].addBox(0.0f, 0.0f, 0.0f, 30, 10, 1, 0.0f);
        this.attachmentModel[1].setRotationPoint(-10.0f, 6.0f, -8.0f);
        this.attachmentModel[2].addBox(0.0f, 0.0f, 0.0f, 30, 10, 1, 0.0f);
        this.attachmentModel[2].setRotationPoint(-10.0f, 6.0f, 7.0f);
        this.attachmentModel[3].addBox(0.0f, 0.0f, -1.0f, 30, 4, 1, 0.0f);
        this.attachmentModel[3].setRotationPoint(-10.0f, 16.0f, 8.0f);
        this.attachmentModel[3].rotateAngleX = -0.7853982f;
        this.attachmentModel[4].addBox(0.0f, 0.0f, 0.0f, 30, 4, 1, 0.0f);
        this.attachmentModel[4].setRotationPoint(-10.0f, 16.0f, -8.0f);
        this.attachmentModel[4].rotateAngleX = 0.7853982f;
        this.attachmentModel[5].addBox(0.0f, 0.0f, 0.0f, 30, 1, 10, 0.0f);
        this.attachmentModel[5].setRotationPoint(-10.0f, 18.0f, -5.0f);
        this.attachmentModel[6].addBox(0.0f, 0.0f, 0.0f, 0, 1, 1, 0.0f);
        this.attachmentModel[6].setRotationPoint(17.0f, 11.0f, -0.5f);
        this.attachmentModel[7].addBox(0.0f, 0.0f, 0.0f, 30, 3, 1, 0.0f);
        this.attachmentModel[7].setRotationPoint(-10.0f, -4.0f, -5.0f);
        this.attachmentModel[8].addBox(0.0f, 0.0f, 0.0f, 30, 3, 1, 0.0f);
        this.attachmentModel[8].setRotationPoint(-10.0f, -4.0f, 4.0f);
        this.attachmentModel[9].addBox(0.0f, -4.0f, -1.0f, 30, 4, 1, 0.0f);
        this.attachmentModel[9].setRotationPoint(-10.0f, 6.0f, 8.0f);
        this.attachmentModel[9].rotateAngleX = 0.7853982f;
        this.attachmentModel[10].addBox(0.0f, -4.0f, 0.0f, 30, 4, 1, 0.0f);
        this.attachmentModel[10].setRotationPoint(-10.0f, 6.0f, -8.0f);
        this.attachmentModel[10].rotateAngleX = -0.7853982f;
        this.attachmentModel[11].addBox(0.0f, 0.0f, 0.0f, 25, 4, 4, 0.0f);
        this.attachmentModel[11].setRotationPoint(-10.0f, 15.0f, 7.0f);
        this.attachmentModel[12].addBox(0.0f, 0.0f, 0.0f, 7, 3, 7, 0.0f);
        this.attachmentModel[12].setRotationPoint(0.0f, 19.0f, -3.5f);
        this.attachmentModel[13].addBox(0.0f, 0.0f, 0.0f, 7, 7, 3, 0.0f);
        this.attachmentModel[13].setRotationPoint(0.0f, 7.0f, 8.0f);
        this.renderOffset = 0.0f;
    }
}
