// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.manus_modern_warfare;

import com.flansmod.client.model.ModelMG;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelM148Javelin extends ModelMG {
    int textureX;
    int textureY;

    public ModelM148Javelin() {
        this.textureX = 128;
        this.textureY = 64;
        (this.bipodModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo(this, 0, 25,
                this.textureX, this.textureY);
        this.bipodModel[1] = new ModelRendererTurbo(this, 21, 20, this.textureX, this.textureY);
        this.bipodModel[2] = new ModelRendererTurbo(this, 26, 20, this.textureX, this.textureY);
        this.bipodModel[3] = new ModelRendererTurbo(this, 21, 16, this.textureX, this.textureY);
        this.bipodModel[0].addBox(0.0f, 0.0f, 0.0f, 6, 1, 4, 0.0f);
        this.bipodModel[0].setRotationPoint(-3.0f, 0.0f, -2.0f);
        this.bipodModel[1].addBox(0.0f, 0.0f, 0.0f, 1, 7, 1, 0.0f);
        this.bipodModel[1].setRotationPoint(-2.5f, 1.0f, -0.5f);
        this.bipodModel[1].rotateAngleZ = -0.2617994f;
        this.bipodModel[2].addBox(-1.0f, 0.0f, 0.0f, 1, 7, 1, 0.0f);
        this.bipodModel[2].setRotationPoint(2.5f, 1.0f, -0.5f);
        this.bipodModel[2].rotateAngleZ = 0.2617994f;
        this.bipodModel[3].addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.bipodModel[3].setRotationPoint(-1.0f, 7.0f, -0.5f);
        (this.gunModel = new ModelRendererTurbo[8])[0] = new ModelRendererTurbo(this, 0, 0, this.textureX,
                this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 0, 14, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 45, 0, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 21, 10, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 45, 11, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 45, 14, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 45, 20, this.textureX, this.textureY);
        this.gunModel[0].addBox(5.0f, -2.0f, -8.0f, 4, 4, 32, 0.0f);
        this.gunModel[0].setRotationPoint(0.0f, 11.0f, 0.0f);
        this.gunModel[1].addBox(4.0f, -3.0f, 20.0f, 6, 6, 3, 0.0f);
        this.gunModel[1].setRotationPoint(0.0f, 11.0f, 0.0f);
        this.gunModel[1].rotateAngleZ = -0.01745329f;
        this.gunModel[2].addTrapezoid(4.0f, -3.0f, 23.0f, 6, 6, 1, 0.0f, -1.0f, 1);
        this.gunModel[2].setRotationPoint(0.0f, 11.0f, 0.0f);
        this.gunModel[3].addBox(-3.0f, -3.0f, -1.0f, 9, 4, 4, 0.0f);
        this.gunModel[3].setRotationPoint(0.0f, 11.0f, 0.0f);
        this.gunModel[4].addBox(3.0f, -6.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[4].setRotationPoint(0.0f, 11.0f, 0.0f);
        this.gunModel[5].addBox(-3.0f, 1.0f, 3.0f, 6, 0, 1, 0.0f);
        this.gunModel[5].setRotationPoint(0.0f, 11.0f, 0.0f);
        this.gunModel[6].addBox(-3.0f, -2.0f, 3.0f, 0, 3, 1, 0.0f);
        this.gunModel[6].setRotationPoint(0.0f, 11.0f, 0.0f);
        this.gunModel[7].addBox(-2.0f, -2.0f, -1.5f, 4, 2, 1, 0.0f);
        this.gunModel[7].setRotationPoint(0.0f, 11.0f, 0.0f);
        this.ammoModel = new ModelRendererTurbo[0];
    }
}
