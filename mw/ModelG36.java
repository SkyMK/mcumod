// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;

public class ModelG36 extends ModelGun {
    public ModelG36() {
        final int textureX = 64;
        final int textureY = 16;
        this.gunModel = new ModelRendererTurbo[7];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-1.0f, 2.0f,
                -1.0f, 15, 2, 2);
        (this.gunModel[1] = new ModelRendererTurbo(this, 0, 4, textureX, textureY)).addBox(1.0f, 4.0f,
                -1.0f, 5.0f, 0.5f, 2.0f);
        (this.gunModel[2] = new ModelRendererTurbo(this, 0, 7, textureX, textureY)).addBox(2.0f, 4.5f,
                -1.0f, 9.0f, 0.5f, 2.0f);
        (this.gunModel[3] = new ModelRendererTurbo(this, 14, 4, textureX, textureY)).addBox(10.0f, 4.0f,
                -1.0f, 2.0f, 0.5f, 2.0f);
        (this.gunModel[4] = new ModelRendererTurbo(this, 32, 0, textureX, textureY)).addBox(14.0f, 2.5f,
                -0.5f, 1, 1, 1);
        (this.gunModel[5] = new ModelRendererTurbo(this, 22, 4, textureX, textureY)).addBox(1.0f, 1.0f,
                -1.0f, 6, 1, 2);
        (this.gunModel[6] = new ModelRendererTurbo(this, 0, 10, textureX, textureY)).addBox(-0.5f, -2.0f,
                -0.5f, 1, 3, 1);
        this.gunModel[6].setRotationPoint(2.0f, 1.0f, 0.0f);
        this.gunModel[6].rotateAngleZ = -0.5f;
        this.scopeAttachPoint = new Vector3f(0.25f, 0.3125f, 0.0f);
        this.defaultStockModel = new ModelRendererTurbo[5];
        (this.defaultStockModel[0] = new ModelRendererTurbo(this, 4, 10, textureX, textureY)).addBox(-7.0f,
                1.0f, -0.5f, 1, 3, 1);
        (this.defaultStockModel[1] = new ModelRendererTurbo(this, 0, 14, textureX, textureY)).addBox(-6.0f,
                1.5f, -0.5f, 2.0f, 0.5f, 1.0f);
        (this.defaultStockModel[2] = new ModelRendererTurbo(this, 6, 14, textureX, textureY)).addBox(-4.0f,
                2.0f, -0.5f, 3.0f, 0.5f, 1.0f);
        (this.defaultStockModel[3] = new ModelRendererTurbo(this, 14, 14, textureX, textureY)).addBox(-6.0f,
                3.5f, -0.5f, 5.0f, 0.5f, 1.0f);
        (this.defaultStockModel[4] = new ModelRendererTurbo(this, 26, 14, textureX, textureY)).addBox(-3.0f,
                2.5f, -0.5f, 1, 1, 1);
        this.stockAttachPoint = new Vector3f(-0.25f, 0.21875f, 0.0f);
        this.barrelAttachPoint = new Vector3f(0.9375f, 0.1875f, 0.0f);
        this.defaultGripModel = new ModelRendererTurbo[2];
        (this.defaultGripModel[0] = new ModelRendererTurbo(this, 8, 10, textureX, textureY)).addBox(11.0f,
                1.0f, -1.0f, 2, 1, 2);
        (this.defaultGripModel[1] = new ModelRendererTurbo(this, 16, 10, textureX, textureY)).addBox(11.5f,
                -1.0f, -0.5f, 1, 2, 1);
        this.gripAttachPoint = new Vector3f(0.625f, 0.1875f, 0.0f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 22, 7, textureX, textureY)).addBox(-1.0f, -4.0f,
                -0.5f, 2, 5, 1);
        this.ammoModel[0].setRotationPoint(6.0f, 1.0f, 0.0f);
        this.ammoModel[0].rotateAngleZ = 0.25f;
        this.gunSlideDistance = 0.5f;
        this.animationType = EnumAnimationType.BOTTOM_CLIP;
    }
}
