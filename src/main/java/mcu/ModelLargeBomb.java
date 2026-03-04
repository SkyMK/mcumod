// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.manus_modern_warfare;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelLargeBomb extends ModelBase {
    public ModelRendererTurbo[] missleModel;
    int textureX;
    int textureY;

    public ModelLargeBomb() {
        this.textureX = 128;
        this.textureY = 64;
        (this.missleModel = new ModelRendererTurbo[5])[0] = new ModelRendererTurbo(this, 9, 0,
                this.textureX, this.textureY);
        this.missleModel[1] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.missleModel[2] = new ModelRendererTurbo(this, 18, 0, this.textureX, this.textureY);
        this.missleModel[3] = new ModelRendererTurbo(this, 18, 10, this.textureX, this.textureY);
        this.missleModel[4] = new ModelRendererTurbo(this, 18, 15, this.textureX, this.textureY);
        this.missleModel[0].addTrapezoid(-3.0f, 0.0f, -3.0f, 6, 10, 6, 0.0f, -2.0f, 4);
        this.missleModel[1].addBox(-3.0f, 10.0f, -3.0f, 6, 16, 6, 0.0f);
        this.missleModel[2].addTrapezoid(-3.0f, 26.0f, -3.0f, 6, 3, 6, 0.0f, -1.5f, 4);
        this.missleModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 10, 4, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f,
                0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f,
                -0.3f);
        this.missleModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.missleModel[3].rotateAngleY = -0.7853982f;
        this.missleModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 10, 4, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f,
                0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f,
                -0.3f);
        this.missleModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.missleModel[4].rotateAngleY = 0.7853982f;
    }

    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3,
                       final float f4, final float f5) {
        for (int i = 0; i < 5; ++i) {
            this.missleModel[i].render(f5);
        }
    }

    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4,
                                  final float f5) {
    }
}
