// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.svz;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class Modelbaionet extends ModelAttachment {
    int textureX;
    int textureY;

    public Modelbaionet() {
        this.textureX = 64;
        this.textureY = 64;
        (this.attachmentModel = new ModelRendererTurbo[15])[0] = new ModelRendererTurbo(this, 30, 0,
                this.textureX, this.textureY);
        this.attachmentModel[1] = new ModelRendererTurbo(this, 0, 30, this.textureX, this.textureY);
        this.attachmentModel[2] = new ModelRendererTurbo(this, 0, 30, this.textureX, this.textureY);
        this.attachmentModel[3] = new ModelRendererTurbo(this, 30, 10, this.textureX, this.textureY);
        this.attachmentModel[4] = new ModelRendererTurbo(this, 0, 30, this.textureX, this.textureY);
        this.attachmentModel[5] = new ModelRendererTurbo(this, 30, 10, this.textureX, this.textureY);
        this.attachmentModel[6] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[7] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[8] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[9] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[10] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[11] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[12] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[13] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[14] = new ModelRendererTurbo(this, 0, 30, this.textureX, this.textureY);
        this.attachmentModel[0].addBox(0.0f, 0.0f, 0.0f, 6, 2, 2, 0.0f);
        this.attachmentModel[0].setRotationPoint(0.0f, 3.0f, -0.5f);
        this.attachmentModel[1].addBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f);
        this.attachmentModel[1].setRotationPoint(0.0f, 3.3f, -0.5f);
        this.attachmentModel[2].addBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f);
        this.attachmentModel[2].setRotationPoint(0.0f, 2.7f, -0.5f);
        this.attachmentModel[3].addBox(0.0f, 0.0f, 0.0f, 1, 4, 2, 0.0f);
        this.attachmentModel[3].setRotationPoint(6.0f, 2.0f, -0.8f);
        this.attachmentModel[4].addBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f);
        this.attachmentModel[4].setRotationPoint(0.0f, 3.0f, -0.2f);
        this.attachmentModel[5].addBox(0.0f, 0.0f, 0.0f, 1, 4, 2, 0.0f);
        this.attachmentModel[5].setRotationPoint(6.0f, 2.0f, -0.2f);
        this.attachmentModel[6].addBox(0.0f, 0.0f, 0.0f, 8, 2, 1, 0.0f);
        this.attachmentModel[6].setRotationPoint(7.0f, 3.0f, 0.0f);
        this.attachmentModel[7].addBox(-2.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.attachmentModel[7].setRotationPoint(15.0f, 5.0f, 0.0f);
        this.attachmentModel[7].rotateAngleZ = -2.775074f;
        this.attachmentModel[8].addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.attachmentModel[8].setRotationPoint(15.0f, 3.0f, 0.0f);
        this.attachmentModel[8].rotateAngleZ = -0.1047198f;
        this.attachmentModel[9].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[9].setRotationPoint(9.0f, 2.7f, 0.0f);
        this.attachmentModel[9].rotateAngleZ = -0.7853982f;
        this.attachmentModel[10].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[10].setRotationPoint(10.0f, 2.7f, 0.0f);
        this.attachmentModel[10].rotateAngleZ = -0.7853982f;
        this.attachmentModel[11].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[11].setRotationPoint(11.0f, 2.7f, 0.0f);
        this.attachmentModel[11].rotateAngleZ = -0.7853982f;
        this.attachmentModel[12].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[12].setRotationPoint(12.0f, 2.7f, 0.0f);
        this.attachmentModel[12].rotateAngleZ = -0.7853982f;
        this.attachmentModel[13].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[13].setRotationPoint(13.0f, 2.7f, 0.0f);
        this.attachmentModel[13].rotateAngleZ = -0.7853982f;
        this.attachmentModel[14].addBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f);
        this.attachmentModel[14].setRotationPoint(0.0f, 3.0f, -0.8f);
    }
}
