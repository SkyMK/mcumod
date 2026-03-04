package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelBullet;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.entity.Entity;

public class ModelMIM23Rocket extends ModelBullet {

    public ModelRendererTurbo[] bulletModel;

    public ModelMIM23Rocket() {
        short textureX = 256;
        short textureY = 256;
        this.bulletModel = new ModelRendererTurbo[4];
        this.bulletModel = new ModelRendererTurbo[4];
        this.bulletModel[0] = new ModelRendererTurbo(this, 72, 212, textureX, textureY);
        this.bulletModel[0].addBox(-20.0F, -3.0F, -3.0F, 40, 6, 6);
        this.bulletModel[1] = new ModelRendererTurbo(this, 72, 226, textureX, textureY);
        this.bulletModel[1].addTrapezoid(20.0F, -3.0F, -3.0F, 8, 6, 6, 0.0F, -3.0F, 2);
        this.bulletModel[2] = new ModelRendererTurbo(this, 102, 226, textureX, textureY);
        this.bulletModel[2].addShapeBox(-20.0F, -7.0F, 0.0F, 20, 14, 0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F,
                -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F,
                0.0F);
        this.bulletModel[3] = new ModelRendererTurbo(this, 88, 242, textureX, textureY);
        this.bulletModel[3].addShapeBox(-20.0F, 0.0F, -7.0F, 20, 0, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F,
                0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F,
                0.0F);

        for (int i = 0; i < 4; ++i) {
            this.bulletModel[i].rotateAngleZ = 1.5707964F;
        }

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
