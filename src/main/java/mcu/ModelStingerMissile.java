package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelBullet;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.entity.Entity;

public class ModelStingerMissile extends ModelBullet {

    public ModelRendererTurbo[] bulletModel;

    public ModelStingerMissile() {
        byte textureX = 64;
        byte textureY = 32;
        this.bulletModel = new ModelRendererTurbo[3];
        this.bulletModel[0] = new ModelRendererTurbo(this, 60, 0, textureX, textureY);
        this.bulletModel[0].addBox(-0.5F, -10.0F, -0.5F, 1, 20, 1);
        this.bulletModel[1] = new ModelRendererTurbo(this, 55, 0, textureX, textureY);
        this.bulletModel[1].addBox(-1.0F, -10.0F, 0.0F, 2, 1, 0);
        this.bulletModel[2] = new ModelRendererTurbo(this, 55, 2, textureX, textureY);
        this.bulletModel[2].addBox(0.0F, -10.0F, -1.0F, 0, 1, 2);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        ModelRendererTurbo[] var8 = this.bulletModel;
        int var9 = var8.length;

        for (int var10 = 0; var10 < var9; ++var10) {
            ModelRendererTurbo mrt = var8[var10];
            mrt.render(f5);
        }

    }
}
