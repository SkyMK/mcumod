package com.flansmod.client.model.ww2;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelFragGrenade extends ModelBase {

    public ModelRendererTurbo headModel;
    public ModelRendererTurbo bodyModel = new ModelRendererTurbo(this, 0, 0, 16, 8);

    public ModelFragGrenade() {
        this.bodyModel.addBox(-1.0F, -1.0F, -1.5F, 2, 2, 3);
        this.headModel = new ModelRendererTurbo(this, 8, 0, 16, 8);
        this.headModel.addBox(-0.5F, -0.5F, 1.0F, 1, 1, 1);
        this.bodyModel.rotateAngleX = -1.5707964F;
        this.headModel.rotateAngleX = -1.5707964F;
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.headModel.render(f5);
        this.bodyModel.render(f5);
    }
}
