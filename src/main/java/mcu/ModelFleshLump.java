package com.flansmod.client.model.zombie;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelFleshLump extends ModelBase {

    public ModelRendererTurbo[] fleshModel = new ModelRendererTurbo[2];

    public ModelFleshLump() {
        this.fleshModel[0] = new ModelRendererTurbo(this, 0, 0, 16, 16);
        this.fleshModel[0].addShapeBox(-2.0F, -2.0F, -3.0F, 5, 5, 4, 0.0F, 0.5F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F,
                0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.5F, 1.0F, 0.5F, 0.5F, 1.0F);
        this.fleshModel[1] = new ModelRendererTurbo(this, 8, 0, 16, 16);
        this.fleshModel[1].addShapeBox(-2.0F, -2.0F, 0.0F, 4, 5, 5, 0.0F, 0.0F, -1.0F, 0.5F, -0.5F, 0.5F, 0.0F, 1.0F,
                0.0F, 0.0F, 0.5F, 0.5F, 0.5F, -1.0F, 1.0F, 0.0F, -1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F,
                -1.0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        ModelRendererTurbo[] var8 = this.fleshModel;
        int var9 = var8.length;

        for (int var10 = 0; var10 < var9; ++var10) {
            ModelRendererTurbo m = var8[var10];
            m.render(f5);
        }

    }
}
