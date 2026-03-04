// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;

public class ModelP90 extends ModelGun {
    public ModelP90() {
        final int textureX = 64;
        final int textureY = 16;
        this.gunModel = new ModelRendererTurbo[8];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-2.0f, 1.0f,
                -1.0f, 12, 2, 2);
        (this.gunModel[1] = new ModelRendererTurbo(this, 0, 4, textureX, textureY)).addBox(-8.0f, -1.0f,
                -1.0f, 6, 5, 2);
        (this.gunModel[2] = new ModelRendererTurbo(this, 0, 11, textureX, textureY)).addBox(-2.0f, -2.0f,
                -1.0f, 3, 3, 2);
        (this.gunModel[3] = new ModelRendererTurbo(this, 10, 13, textureX, textureY)).addBox(1.0f, -2.0f,
                -1.0f, 8, 1, 2);
        (this.gunModel[4] = new ModelRendererTurbo(this, 14, 9, textureX, textureY)).addBox(5.0f, -1.0f,
                -1.0f, 1, 2, 2);
        (this.gunModel[5] = new ModelRendererTurbo(this, 18, 7, textureX, textureY)).addBox(8.0f, -1.0f,
                -1.0f, 1, 2, 2);
        (this.gunModel[6] = new ModelRendererTurbo(this, 16, 4, textureX, textureY)).addBox(9.0f, 0.0f,
                -1.0f, 1, 1, 2);
        (this.gunModel[7] = new ModelRendererTurbo(this, 25, 1, textureX, textureY)).addBox(4.9f, 2.0f,
                -1.5f, 5, 3, 3);
        this.scopeAttachPoint = new Vector3f(0.46875f, 0.3125f, 0.0f);
        this.defaultBarrelModel = new ModelRendererTurbo[1];
        (this.defaultBarrelModel[0] = new ModelRendererTurbo(this, 21, 11, textureX, textureY))
                .addBox(10.0f, 1.5f, -0.5f, 1, 1, 1);
        this.barrelAttachPoint = new Vector3f(0.625f, 0.125f, 0.0f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 28, 13, textureX, textureY)).addBox(-2.0f, 3.0f,
                -1.0f, 11, 1, 2);
        this.gunSlideDistance = 0.5f;
        this.animationType = EnumAnimationType.P90;
    }
}
