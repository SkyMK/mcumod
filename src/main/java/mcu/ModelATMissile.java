// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.manus_modern_warfare;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelATMissile extends ModelBase {
    public ModelRendererTurbo[] missleModel;
    int textureX;
    int textureY;

    public ModelATMissile() {
        this.textureX = 128;
        this.textureY = 64;
        (this.missleModel = new ModelRendererTurbo[8])[0] = new ModelRendererTurbo(this, 9, 0,
                this.textureX, this.textureY);
        this.missleModel[1] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.missleModel[2] = new ModelRendererTurbo(this, 18, 0, this.textureX, this.textureY);
        this.missleModel[3] = new ModelRendererTurbo(this, 18, 10, this.textureX, this.textureY);
        this.missleModel[4] = new ModelRendererTurbo(this, 18, 15, this.textureX, this.textureY);
        this.missleModel[5] = new ModelRendererTurbo(this, 18, 24, this.textureX, this.textureY);
        this.missleModel[6] = new ModelRendererTurbo(this, 33, 0, this.textureX, this.textureY);
        this.missleModel[7] = new ModelRendererTurbo(this, 33, 11, this.textureX, this.textureY);
        this.missleModel[0].addTrapezoid(-1.0f, 28.0f, -1.0f, 2, 4, 2, 0.0f, -1.0f, 5);
        this.missleModel[1].addBox(-1.0f, 0.0f, -1.0f, 2, 28, 2, 0.0f);
        this.missleModel[2].addShapeBox(-0.5f, 20.0f, -3.0f, 1, 3, 6, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f,
                0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, -2.9999f, -0.4f, 0.0f, -2.9999f, -0.4f, 0.0f, -2.9999f,
                -0.4f, 0.0f, -2.9999f);
        this.missleModel[3].addShapeBox(-3.0f, 20.0f, -0.5f, 6, 3, 1, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f,
                0.0f, -0.4f, 0.0f, 0.0f, -0.4f, -2.9999f, 0.0f, -0.4f, -2.9999f, 0.0f, -0.4f, -2.9999f, 0.0f, -0.4f,
                -2.9999f, 0.0f, -0.4f);
        this.missleModel[4].addShapeBox(-0.5f, 18.0f, -3.0f, 1, 2, 6, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f,
                0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f,
                0.0f);
        this.missleModel[5].addShapeBox(-3.0f, 18.0f, -0.5f, 6, 2, 1, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f,
                0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f,
                -0.4f);
        this.missleModel[6].addShapeBox(-0.5f, 0.0f, -3.0f, 1, 4, 6, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f,
                0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f,
                0.0f);
        this.missleModel[7].addShapeBox(-3.0f, 0.0f, -0.5f, 6, 4, 1, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f,
                0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f,
                -0.4f);
    }

    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3,
                       final float f4, final float f5) {
        for (int i = 0; i < 8; ++i) {
            this.missleModel[i].render(f5);
        }
    }

    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4,
                                  final float f5) {
    }
}
