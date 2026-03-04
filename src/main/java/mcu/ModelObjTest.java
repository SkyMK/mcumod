package com.flansmod.client.model.evp2;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.entity.Entity;

public class ModelObjTest extends ModelPlane {

    public ModelObjTest() {
        short textureX = 256;
        short textureY = 128;
        super.bodyModel = new ModelRendererTurbo[1];
        super.bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        super.bodyModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/UKM2013.obj");
        super.bodyModel[0].setRotationPoint(3.5F, 2.0F, 0.0F);
        this.translateAll(-3.5F, -1.8F, 0.0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        ModelRendererTurbo[] var8 = super.bodyModel;
        int var9 = var8.length;

        for (int var10 = 0; var10 < var9; ++var10) {
            ModelRendererTurbo mrt = var8[var10];
            mrt.render(1.0F);
        }

    }
}
