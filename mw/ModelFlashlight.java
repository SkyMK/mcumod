package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelFlashlight extends ModelAttachment {

    public ModelFlashlight() {
        byte textureX = 16;
        byte textureY = 16;
        super.attachmentModel = new ModelRendererTurbo[3];
        super.attachmentModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.attachmentModel[0].addBox(-2.0F, -1.0F, -0.5F, 4, 1, 1);
        super.attachmentModel[1] = new ModelRendererTurbo(this, 0, 2, textureX, textureY);
        super.attachmentModel[1].addBox(-2.5F, -3.0F, -1.0F, 5, 2, 2);
        super.attachmentModel[2] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
        super.attachmentModel[2].addBox(2.5F, -3.5F, -1.5F, 1, 3, 3);
    }
}
