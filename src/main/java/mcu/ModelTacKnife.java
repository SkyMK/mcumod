// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.svz;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelTacKnife extends ModelGun {
    int textureX;
    int textureY;

    public ModelTacKnife() {
        this.textureX = 32;
        this.textureY = 64;
        (this.gunModel = new ModelRendererTurbo[5])[0] = new ModelRendererTurbo(this, 0, 0, this.textureX,
                this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 0, 6, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 3, 6, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 0, 11, this.textureX, this.textureY);
        this.gunModel[0].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.gunModel[0].setRotationPoint(0.3f, -1.7f, -0.5f);
        this.gunModel[1].addBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[1].setRotationPoint(0.0f, -2.3f, -0.5f);
        this.gunModel[2].addBox(0.0f, 0.0f, 0.0f, 1, 4, 0, 0.0f);
        this.gunModel[2].setRotationPoint(-0.2f, -6.0f, 0.0f);
        this.gunModel[3].addBox(0.0f, 0.0f, 0.0f, 1, 1, 0, 0.0f);
        this.gunModel[3].setRotationPoint(-0.2f, -6.0f, 0.0f);
        this.gunModel[3].rotateAngleZ = 0.7853982f;
        this.gunModel[4].addBox(0.0f, 0.0f, 0.0f, 1, 4, 0, 0.0f);
        this.gunModel[4].setRotationPoint(0.2f, -6.0f, 0.0f);
        this.flipAll();
    }
}
