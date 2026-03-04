// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelMinigun extends ModelGun {
    public ModelMinigun() {
        final int textureX = 64;
        final int textureY = 64;
        this.gunModel = new ModelRendererTurbo[5];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(0.0f, -4.0f,
                -3.0f, 8, 6, 6);
        (this.gunModel[1] = new ModelRendererTurbo(this, 22, 0, textureX, textureY)).addBox(1.0f, -4.0f,
                3.0f, 6, 3, 3);
        (this.gunModel[2] = new ModelRendererTurbo(this, 28, 6, textureX, textureY)).addBox(7.0f, 2.0f,
                -3.0f, 1, 3, 1);
        (this.gunModel[3] = new ModelRendererTurbo(this, 32, 6, textureX, textureY)).addBox(7.0f, 2.0f,
                2.0f, 1, 3, 1);
        (this.gunModel[4] = new ModelRendererTurbo(this, 36, 6, textureX, textureY)).addBox(7.0f, 5.0f,
                -2.0f, 1, 1, 4);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 0, 46, textureX, textureY)).addBox(1.0f, -3.0f,
                -7.0f, 6, 4, 4);
        this.animationType = EnumAnimationType.SIDE_CLIP;
    }
}
