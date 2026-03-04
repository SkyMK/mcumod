// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.svz;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelHeavyBarrel extends ModelAttachment {
    int textureX;
    int textureY;

    public ModelHeavyBarrel() {
        this.textureX = 64;
        this.textureY = 128;
        (this.attachmentModel = new ModelRendererTurbo[12])[0] = new ModelRendererTurbo(this, 0, 0,
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
        this.attachmentModel[0].addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.attachmentModel[0].setRotationPoint(-0.5f, -0.5f, -0.5f);
        this.attachmentModel[1].addBox(0.0f, 0.0f, 0.0f, 1, 0, 1, 0.0f);
        this.attachmentModel[1].setRotationPoint(1.5f, -0.6f, -0.5f);
        this.attachmentModel[2].addBox(0.0f, 0.0f, 0.0f, 1, 0, 1, 0.0f);
        this.attachmentModel[2].setRotationPoint(1.5f, 0.6f, -0.5f);
        this.attachmentModel[3].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[3].setRotationPoint(2.0f, -0.5f, -0.5f);
        this.attachmentModel[4].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.attachmentModel[4].setRotationPoint(-5.5f, -0.5f, -0.6f);
        this.attachmentModel[5].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.attachmentModel[5].setRotationPoint(-5.5f, -0.5f, -0.4f);
        this.attachmentModel[6].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.attachmentModel[6].setRotationPoint(-5.5f, -0.6f, -0.5f);
        this.attachmentModel[7].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.attachmentModel[7].setRotationPoint(-5.5f, -0.4f, -0.5f);
        this.attachmentModel[8].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[8].setRotationPoint(2.0f, -0.7f, -0.5f);
        this.attachmentModel[9].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[9].setRotationPoint(2.0f, -0.3f, -0.5f);
        this.attachmentModel[10].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[10].setRotationPoint(2.0f, -0.5f, -0.7f);
        this.attachmentModel[11].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[11].setRotationPoint(2.0f, -0.5f, -0.3f);
    }
}
