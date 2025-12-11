package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class Model4xScope extends ModelAttachment {

    int textureX = 32;
    int textureY = 32;

    public Model4xScope() {
        super.attachmentModel = new ModelRendererTurbo[7];
        super.attachmentModel[0] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        super.attachmentModel[1] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        super.attachmentModel[2] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        super.attachmentModel[3] = new ModelRendererTurbo(this, 0, 15, this.textureX, this.textureY);
        super.attachmentModel[4] = new ModelRendererTurbo(this, 9, 15, this.textureX, this.textureY);
        super.attachmentModel[5] = new ModelRendererTurbo(this, 0, 20, this.textureX, this.textureY);
        super.attachmentModel[6] = new ModelRendererTurbo(this, 0, 20, this.textureX, this.textureY);
        super.attachmentModel[0].addBox(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F);
        super.attachmentModel[0].setRotationPoint(-4.0F, -2.0F, -0.5F);
        super.attachmentModel[1].addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        super.attachmentModel[1].setRotationPoint(-2.0F, -1.0F, -0.5F);
        super.attachmentModel[2].addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        super.attachmentModel[2].setRotationPoint(2.0F, -1.0F, -0.5F);
        super.attachmentModel[3].addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        super.attachmentModel[3].setRotationPoint(-5.0F, -2.5F, -1.0F);
        super.attachmentModel[4].addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        super.attachmentModel[4].setRotationPoint(4.0F, -2.5F, -1.0F);
        super.attachmentModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.attachmentModel[5].setRotationPoint(-1.0F, -2.5F, -0.5F);
        super.attachmentModel[6].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        super.attachmentModel[6].setRotationPoint(-1.0F, -2.0F, -1.0F);
        super.renderOffset = 0.0F;
    }
}
