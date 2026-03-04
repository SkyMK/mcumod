package com.flansmod.client.model.ww2;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelZF4Scope extends ModelAttachment {

    int textureX = 32;
    int textureY = 32;

    public ModelZF4Scope() {
        super.attachmentModel = new ModelRendererTurbo[8];
        super.attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        super.attachmentModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        super.attachmentModel[2] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        super.attachmentModel[3] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        super.attachmentModel[4] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        super.attachmentModel[5] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        super.attachmentModel[6] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        super.attachmentModel[7] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        super.attachmentModel[0].addShapeBox(-2.0F, -2.0F, -1.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.attachmentModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.attachmentModel[1].addShapeBox(1.0F, -2.0F, -1.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.attachmentModel[1].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.attachmentModel[2].addShapeBox(-3.0F, -3.0F, -0.5F, 6, 1, 1, 0.0F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F,
                0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F,
                0.2F);
        super.attachmentModel[2].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.attachmentModel[3].addShapeBox(1.0F, -3.0F, -0.5F, 1, 1, 1, 0.0F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F,
                0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F,
                0.3F);
        super.attachmentModel[3].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.attachmentModel[4].addShapeBox(-2.0F, -3.0F, -0.5F, 1, 1, 1, 0.0F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F,
                0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F,
                0.3F);
        super.attachmentModel[4].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.attachmentModel[5].addShapeBox(-0.5F, -3.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.attachmentModel[5].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.attachmentModel[6].addShapeBox(-0.5F, -3.5F, -0.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        super.attachmentModel[6].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.attachmentModel[7].addShapeBox(1.0F, -2.0F, -1.5F, 1, 2, 1, 0.0F, 3.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F,
                0.0F, -1.5F, 0.0F, 3.0F, -1.5F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F,
                0.0F);
        super.attachmentModel[7].setRotationPoint(0.0F, 0.0F, 0.0F);
        super.renderOffset = 0.0F;
    }
}
