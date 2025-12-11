// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.svz;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelAngledGrip extends ModelAttachment {
    int textureX;
    int textureY;

    public ModelAngledGrip() {
        this.textureX = 64;
        this.textureY = 128;
        (this.attachmentModel = new ModelRendererTurbo[13])[0] = new ModelRendererTurbo(this, 0, 0,
                this.textureX, this.textureY);
        this.attachmentModel[1] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[2] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[3] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[4] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[5] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[6] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[7] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[8] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[9] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[10] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[11] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[12] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[0].addBox(0.0f, -0.5f, 0.0f, 1, 2, 2, 0.0f);
        this.attachmentModel[0].setRotationPoint(-13.0f, -1.0f, -1.0f);
        this.attachmentModel[0].rotateAngleZ = -0.8726646f;
        this.attachmentModel[1].addBox(2.0f, -0.5f, 0.0f, 1, 2, 2, 0.0f);
        this.attachmentModel[1].setRotationPoint(-13.0f, -1.0f, -1.0f);
        this.attachmentModel[1].rotateAngleZ = -0.8726646f;
        this.attachmentModel[2].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[2].setRotationPoint(0.0f, -0.5f, -0.5f);
        this.attachmentModel[3].addBox(3.6f, -0.2f, 0.0f, 6, 2, 2, 0.0f);
        this.attachmentModel[3].setRotationPoint(-13.0f, -1.5f, -1.0f);
        this.attachmentModel[3].rotateAngleZ = -0.8726646f;
        this.attachmentModel[4].addBox(0.0f, 0.0f, 0.0f, 10, 1, 3, 0.0f);
        this.attachmentModel[4].setRotationPoint(-13.0f, -1.0f, -1.5f);
        this.attachmentModel[4].rotateAngleZ = -0.8726646f;
        this.attachmentModel[5].addBox(0.0f, 0.0f, -0.5f, 18, 2, 3, 0.0f);
        this.attachmentModel[5].setRotationPoint(-7.0f, -9.0f, -1.0f);
        this.attachmentModel[5].rotateAngleZ = 0.418879f;
        this.attachmentModel[6].addBox(15.0f, -0.5f, 0.0f, 1, 3, 2, 0.0f);
        this.attachmentModel[6].setRotationPoint(-7.0f, -9.0f, -1.0f);
        this.attachmentModel[6].rotateAngleZ = 0.418879f;
        this.attachmentModel[7].addBox(13.0f, -0.5f, 0.0f, 1, 3, 2, 0.0f);
        this.attachmentModel[7].setRotationPoint(-7.0f, -9.0f, -1.0f);
        this.attachmentModel[7].rotateAngleZ = 0.418879f;
        this.attachmentModel[8].addBox(0.0f, -0.5f, 0.0f, 12, 3, 2, 0.0f);
        this.attachmentModel[8].setRotationPoint(-7.0f, -9.0f, -1.0f);
        this.attachmentModel[8].rotateAngleZ = 0.418879f;
        this.attachmentModel[9].addBox(0.0f, 0.0f, 0.0f, 28, 2, 3, 0.0f);
        this.attachmentModel[9].setRotationPoint(-13.0f, -1.0f, -1.5f);
        this.attachmentModel[10].addBox(0.0f, 0.0f, 0.0f, 8, 1, 3, 0.0f);
        this.attachmentModel[10].setRotationPoint(7.0f, -2.0f, -1.5f);
        this.attachmentModel[11].addBox(-1.0f, 0.0f, 0.0f, 1, 3, 3, 0.0f);
        this.attachmentModel[11].setRotationPoint(14.0f, -2.0f, -1.5f);
        this.attachmentModel[11].rotateAngleZ = -2.827433f;
        this.attachmentModel[12].addBox(0.0f, -6.0f, 0.0f, 1, 6, 3, 0.0f);
        this.attachmentModel[12].setRotationPoint(15.0f, 1.0f, -1.5f);
    }
}
