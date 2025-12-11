// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.svz;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelSkeletonStock extends ModelAttachment {
    int textureX;
    int textureY;

    public ModelSkeletonStock() {
        this.textureX = 64;
        this.textureY = 32;
        (this.attachmentModel = new ModelRendererTurbo[13])[0] = new ModelRendererTurbo(this, 0, 0,
                this.textureX, this.textureY);
        this.attachmentModel[1] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[2] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[3] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[4] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[5] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[6] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.attachmentModel[7] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.attachmentModel[8] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.attachmentModel[9] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.attachmentModel[10] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.attachmentModel[11] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.attachmentModel[12] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.attachmentModel[0].addBox(0.0f, 0.0f, 0.0f, 6, 1, 1, 0.0f);
        this.attachmentModel[0].setRotationPoint(-7.0f, 0.0f, -0.6f);
        this.attachmentModel[1].addBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.attachmentModel[1].setRotationPoint(-7.0f, -3.0f, -0.5f);
        this.attachmentModel[2].addBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f);
        this.attachmentModel[2].setRotationPoint(-6.0f, -3.0f, -0.5f);
        this.attachmentModel[2].rotateAngleZ = 0.418879f;
        this.attachmentModel[3].addBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f);
        this.attachmentModel[3].setRotationPoint(-3.0f, -1.5f, -0.5f);
        this.attachmentModel[4].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.attachmentModel[4].setRotationPoint(-1.0f, -1.0f, -0.5f);
        this.attachmentModel[5].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[5].setRotationPoint(-3.0f, -1.0f, -0.5f);
        this.attachmentModel[5].rotateAngleZ = 0.2094395f;
        this.attachmentModel[6].addBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f);
        this.attachmentModel[6].setRotationPoint(-7.5f, -3.0f, -0.6f);
        this.attachmentModel[7].addBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f);
        this.attachmentModel[7].setRotationPoint(-7.5f, -3.0f, -0.4f);
        this.attachmentModel[8].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[8].setRotationPoint(-7.7f, -2.5f, -0.5f);
        this.attachmentModel[9].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[9].setRotationPoint(-7.7f, -0.4666667f, -0.5f);
        this.attachmentModel[10].addBox(0.0f, 0.0f, 0.0f, 6, 1, 1, 0.0f);
        this.attachmentModel[10].setRotationPoint(-7.0f, 0.0f, -0.4f);
        this.attachmentModel[11].addBox(0.0f, 0.0f, 0.0f, 6, 1, 1, 0.0f);
        this.attachmentModel[11].setRotationPoint(-7.0f, 0.1f, -0.5f);
        this.attachmentModel[12].addBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f);
        this.attachmentModel[12].setRotationPoint(-6.0f, -0.1f, -0.5f);
    }
}
