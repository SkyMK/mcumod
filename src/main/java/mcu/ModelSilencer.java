// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelSilencer extends ModelAttachment {
    public ModelSilencer() {
        final int textureX = 16;
        final int textureY = 4;
        this.attachmentModel = new ModelRendererTurbo[1];
        (this.attachmentModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(0.0f,
                -1.0f, -1.0f, 6, 2, 2);
    }
}
