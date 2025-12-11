// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.svz;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelHolosight extends ModelAttachment {
    int textureX;
    int textureY;

    public ModelHolosight() {
        this.textureX = 128;
        this.textureY = 256;
        (this.attachmentModel = new ModelRendererTurbo[23])[0] = new ModelRendererTurbo(this, 0, 0,
                this.textureX, this.textureY);
        this.attachmentModel[1] = new ModelRendererTurbo(this, 0, 1, this.textureX, this.textureY);
        this.attachmentModel[2] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[3] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[4] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[5] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[6] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[7] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[8] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[9] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[10] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[11] = new ModelRendererTurbo(this, 0, 35, this.textureX, this.textureY);
        this.attachmentModel[12] = new ModelRendererTurbo(this, 0, 35, this.textureX, this.textureY);
        this.attachmentModel[13] = new ModelRendererTurbo(this, 0, 35, this.textureX, this.textureY);
        this.attachmentModel[14] = new ModelRendererTurbo(this, 0, 35, this.textureX, this.textureY);
        this.attachmentModel[15] = new ModelRendererTurbo(this, 0, 35, this.textureX, this.textureY);
        this.attachmentModel[16] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[17] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[18] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[19] = new ModelRendererTurbo(this, 0, 50, this.textureX, this.textureY);
        this.attachmentModel[20] = new ModelRendererTurbo(this, 0, 50, this.textureX, this.textureY);
        this.attachmentModel[21] = new ModelRendererTurbo(this, 0, 50, this.textureX, this.textureY);
        this.attachmentModel[22] = new ModelRendererTurbo(this, 0, 50, this.textureX, this.textureY);
        this.attachmentModel[0].addBox(0.0f, 0.0f, 0.0f, 29, 10, 16, 0.0f);
        this.attachmentModel[0].setRotationPoint(-7.0f, 0.0f, -8.0f);
        this.attachmentModel[1].addBox(0.0f, 0.0f, 0.0f, 8, 1, 16, 0.0f);
        this.attachmentModel[1].setRotationPoint(22.0f, 0.0f, -8.0f);
        this.attachmentModel[1].rotateAngleZ = 1.43117f;
        this.attachmentModel[2].addBox(-1.0f, -3.0f, 0.0f, 1, 3, 16, 0.0f);
        this.attachmentModel[2].setRotationPoint(22.0f, 10.0f, -8.0f);
        this.attachmentModel[2].rotateAngleZ = 0.4363323f;
        this.attachmentModel[3].addBox(0.0f, 0.0f, 0.0f, 2, 2, 16, 0.0f);
        this.attachmentModel[3].setRotationPoint(21.3f, 6.0f, -8.0f);
        this.attachmentModel[4].addBox(-30.0f, -1.0f, 0.0f, 30, 1, 16, 0.0f);
        this.attachmentModel[4].setRotationPoint(22.0f, 10.0f, -8.0f);
        this.attachmentModel[4].rotateAngleZ = 0.05235988f;
        this.attachmentModel[5].addBox(0.0f, 0.0f, 0.0f, 11, 1, 16, 0.0f);
        this.attachmentModel[5].setRotationPoint(-8.0f, 10.0f, -8.0f);
        this.attachmentModel[5].rotateAngleZ = 0.03490658f;
        this.attachmentModel[6].addBox(0.0f, 0.0f, 0.0f, 10, 10, 1, 0.0f);
        this.attachmentModel[6].setRotationPoint(-6.0f, 10.5f, -7.0f);
        this.attachmentModel[6].rotateAngleZ = -0.03490658f;
        this.attachmentModel[7].addBox(0.0f, 0.0f, 0.0f, 10, 10, 1, 0.0f);
        this.attachmentModel[7].setRotationPoint(-6.0f, 10.5f, 6.0f);
        this.attachmentModel[7].rotateAngleZ = -0.03490658f;
        this.attachmentModel[8].addBox(0.0f, 0.0f, 0.0f, 2, 7, 1, 0.0f);
        this.attachmentModel[8].setRotationPoint(-8.0f, 11.0f, 6.0f);
        this.attachmentModel[8].rotateAngleZ = -0.3490658f;
        this.attachmentModel[9].addBox(0.0f, 0.0f, 0.0f, 2, 7, 1, 0.0f);
        this.attachmentModel[9].setRotationPoint(-8.0f, 11.0f, -7.0f);
        this.attachmentModel[9].rotateAngleZ = -0.3490658f;
        this.attachmentModel[10].addBox(0.0f, 0.0f, 0.0f, 10, 1, 14, 0.0f);
        this.attachmentModel[10].setRotationPoint(-6.3f, 20.0f, -7.0f);
        this.attachmentModel[11].addBox(0.0f, 0.0f, 0.0f, 0, 1, 1, 0.0f);
        this.attachmentModel[11].setRotationPoint(0.0f, 15.0f, -0.5f);
        this.attachmentModel[12].addBox(0.0f, 0.0f, 0.0f, 0, 1, 3, 0.0f);
        this.attachmentModel[12].setRotationPoint(0.0f, 13.5f, -1.5f);
        this.attachmentModel[13].addBox(0.0f, 0.0f, 0.0f, 0, 1, 3, 0.0f);
        this.attachmentModel[13].setRotationPoint(0.0f, 16.5f, -1.5f);
        this.attachmentModel[14].addBox(0.0f, 0.0f, 0.0f, 0, 3, 1, 0.0f);
        this.attachmentModel[14].setRotationPoint(0.0f, 14.0f, -2.0f);
        this.attachmentModel[15].addBox(0.0f, 0.0f, 0.0f, 0, 3, 1, 0.0f);
        this.attachmentModel[15].setRotationPoint(0.0f, 14.0f, 1.0f);
        this.attachmentModel[16].addBox(0.0f, 0.0f, 0.0f, 1, 10, 1, 0.0f);
        this.attachmentModel[16].setRotationPoint(-8.0f, 0.0f, -8.0f);
        this.attachmentModel[17].addBox(0.0f, 0.0f, 0.0f, 1, 10, 1, 0.0f);
        this.attachmentModel[17].setRotationPoint(-8.0f, 0.0f, 7.0f);
        this.attachmentModel[18].addBox(0.0f, 0.0f, 0.0f, 1, 1, 16, 0.0f);
        this.attachmentModel[18].setRotationPoint(-8.0f, 0.0f, -8.0f);
        this.attachmentModel[19].addBox(0.0f, 0.0f, 0.0f, 5, 5, 1, 0.0f);
        this.attachmentModel[19].setRotationPoint(0.0f, 2.0f, -9.0f);
        this.attachmentModel[20].addBox(0.0f, 0.0f, 0.0f, 3, 3, 1, 0.0f);
        this.attachmentModel[20].setRotationPoint(-1.0f, 4.0f, 8.0f);
        this.attachmentModel[20].rotateAngleZ = 0.7853982f;
        this.attachmentModel[21].addBox(0.0f, 0.0f, 0.0f, 2, 2, 1, 0.0f);
        this.attachmentModel[21].setRotationPoint(8.0f, 3.0f, 8.0f);
        this.attachmentModel[21].rotateAngleZ = 0.7853982f;
        this.attachmentModel[22].addBox(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f);
        this.attachmentModel[22].setRotationPoint(-8.0f, 7.0f, -1.5f);
        this.attachmentModel[22].rotateAngleX = -0.7853982f;
        this.renderOffset = 0.0f;
    }
}
