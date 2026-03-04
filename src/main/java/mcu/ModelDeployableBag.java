package com.flansmod.client.model.mw;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelDeployableBag extends ModelBase {

    public ModelRendererTurbo[] bagModel = new ModelRendererTurbo[2];

    public ModelDeployableBag() {
        this.bagModel[0] = new ModelRendererTurbo(this, 0, 0, 32, 32);
        this.bagModel[0].addShapeBox(-3.0F, 0.0F, -6.0F, 6, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.1F, -1.0F, 0.0F);
        this.bagModel[1] = new ModelRendererTurbo(this, 0, 12, 32, 32);
        this.bagModel[1].addShapeBox(-3.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        ModelRendererTurbo[] var8 = this.bagModel;
        int var9 = var8.length;

        for (int var10 = 0; var10 < var9; ++var10) {
            ModelRendererTurbo bagModelBit = var8[var10];
            bagModelBit.render(f5);
        }

    }
}
