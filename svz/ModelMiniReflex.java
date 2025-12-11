// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.svz;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelMiniReflex extends ModelAttachment {
    int textureX;
    int textureY;

    public ModelMiniReflex() {
        this.textureX = 128;
        this.textureY = 64;
        (this.attachmentModel = new ModelRendererTurbo[13])[0] = new ModelRendererTurbo(this, 0, 0,
                this.textureX, this.textureY);
        this.attachmentModel[1] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[2] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[3] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[4] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[5] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[6] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[7] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[8] = new ModelRendererTurbo(this, 0, 25, this.textureX, this.textureY);
        this.attachmentModel[9] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[10] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[11] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[12] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[0].addBox(0.0f, 0.0f, 0.0f, 20, 5, 16, 0.0f);
        this.attachmentModel[0].setRotationPoint(-10.0f, -1.0f, -8.0f);
        this.attachmentModel[1].addBox(0.0f, 0.0f, 0.0f, 4, 11, 1, 0.0f);
        this.attachmentModel[1].setRotationPoint(6.0f, 3.0f, -8.0f);
        this.attachmentModel[2].addBox(0.0f, 0.0f, 0.0f, 4, 11, 1, 0.0f);
        this.attachmentModel[2].setRotationPoint(6.0f, 3.0f, 7.0f);
        this.attachmentModel[3].addBox(0.0f, 0.0f, -1.0f, 4, 4, 1, 0.0f);
        this.attachmentModel[3].setRotationPoint(6.0f, 14.0f, 8.0f);
        this.attachmentModel[3].rotateAngleX = -0.7853982f;
        this.attachmentModel[4].addBox(0.0f, 0.0f, 0.0f, 4, 4, 1, 0.0f);
        this.attachmentModel[4].setRotationPoint(6.0f, 14.0f, -8.0f);
        this.attachmentModel[4].rotateAngleX = 0.7853982f;
        this.attachmentModel[5].addBox(0.0f, 0.0f, 0.0f, 4, 1, 10, 0.0f);
        this.attachmentModel[5].setRotationPoint(6.0f, 16.0f, -5.0f);
        this.attachmentModel[6].addBox(0.0f, 0.0f, 0.0f, 2, 11, 1, 0.0f);
        this.attachmentModel[6].setRotationPoint(4.0f, 2.7f, -8.0f);
        this.attachmentModel[6].rotateAngleZ = -0.1919862f;
        this.attachmentModel[7].addBox(0.0f, 0.0f, 0.0f, 2, 11, 1, 0.0f);
        this.attachmentModel[7].setRotationPoint(4.0f, 2.7f, 7.0f);
        this.attachmentModel[7].rotateAngleZ = -0.1919862f;
        this.attachmentModel[8].addBox(0.0f, 0.0f, 0.0f, 0, 1, 1, 0.0f);
        this.attachmentModel[8].setRotationPoint(9.0f, 10.0f, -0.5f);
        this.attachmentModel[9].addBox(0.0f, 0.0f, 0.0f, 20, 3, 1, 0.0f);
        this.attachmentModel[9].setRotationPoint(-10.0f, -4.0f, -8.0f);
        this.attachmentModel[10].addBox(0.0f, 0.0f, 0.0f, 20, 3, 1, 0.0f);
        this.attachmentModel[10].setRotationPoint(-10.0f, -4.0f, 7.0f);
        this.attachmentModel[11].addBox(0.0f, -3.0f, 0.0f, 13, 3, 1, 0.0f);
        this.attachmentModel[11].setRotationPoint(-7.0f, 4.0f, -8.0f);
        this.attachmentModel[11].rotateAngleZ = 0.2617994f;
        this.attachmentModel[12].addBox(0.0f, -3.0f, 0.0f, 13, 3, 1, 0.0f);
        this.attachmentModel[12].setRotationPoint(-7.0f, 4.0f, 7.0f);
        this.attachmentModel[12].rotateAngleZ = 0.2617994f;
        this.renderOffset = 0.0f;
    }
}
