// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.svz;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelSilencer extends ModelAttachment {
    int textureX;
    int textureY;

    public ModelSilencer() {
        this.textureX = 64;
        this.textureY = 32;
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
        this.attachmentModel[0].addBox(0.0f, 0.0f, 0.0f, 13, 3, 3, 0.0f);
        this.attachmentModel[0].setRotationPoint(4.0f, -1.5f, -2.0f);
        this.attachmentModel[1].addBox(0.0f, 0.0f, 0.0f, 13, 3, 3, 0.0f);
        this.attachmentModel[1].setRotationPoint(4.0f, -1.5f, -1.0f);
        this.attachmentModel[2].addBox(0.0f, 0.0f, 0.0f, 17, 3, 3, 0.0f);
        this.attachmentModel[2].setRotationPoint(0.0f, -2.0f, -1.5f);
        this.attachmentModel[3].addBox(0.0f, 0.0f, 0.0f, 17, 3, 3, 0.0f);
        this.attachmentModel[3].setRotationPoint(0.0f, -1.0f, -1.5f);
        this.attachmentModel[4].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[4].setRotationPoint(0.0f, -0.5f, -0.5f);
        this.attachmentModel[5].addBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f);
        this.attachmentModel[5].setRotationPoint(0.0f, -1.5f, -2.0f);
        this.attachmentModel[6].addBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f);
        this.attachmentModel[6].setRotationPoint(0.0f, 0.5f, -2.0f);
        this.attachmentModel[7].addBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f);
        this.attachmentModel[7].setRotationPoint(0.0f, -1.5f, 1.0f);
        this.attachmentModel[8].addBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f);
        this.attachmentModel[8].setRotationPoint(0.0f, 0.5f, 1.0f);
        this.attachmentModel[9].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[9].setRotationPoint(0.0f, -0.5f, 1.0f);
        this.attachmentModel[10].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[10].setRotationPoint(2.0f, -0.5f, 1.0f);
        this.attachmentModel[11].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[11].setRotationPoint(0.0f, -0.5f, -2.0f);
        this.attachmentModel[12].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[12].setRotationPoint(2.0f, -0.5f, -2.0f);
    }
}
