// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.svz;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;

public class ModelIZH43Short extends ModelGun {
    int textureX;
    int textureY;

    public ModelIZH43Short() {
        this.textureX = 64;
        this.textureY = 32;
        (this.gunModel = new ModelRendererTurbo[14])[0] = new ModelRendererTurbo(this, 0, 0, this.textureX,
                this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 17, 0, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 17, 0, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[0].addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[0].setRotationPoint(-2.0f, 0.0f, -0.5f);
        this.gunModel[0].rotateAngleZ = -0.2268928f;
        this.gunModel[1].addBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f);
        this.gunModel[1].setRotationPoint(-1.4f, 0.0f, -0.5f);
        this.gunModel[1].rotateAngleZ = 0.418879f;
        this.gunModel[2].addBox(0.0f, 0.0f, 0.0f, 3, 2, 1, 0.0f);
        this.gunModel[2].setRotationPoint(2.2f, -2.6f, -0.8f);
        this.gunModel[3].addBox(0.0f, 0.0f, 0.0f, 8, 1, 1, 0.0f);
        this.gunModel[3].setRotationPoint(3.0f, -2.7f, -1.0f);
        this.gunModel[4].addBox(-4.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f);
        this.gunModel[4].setRotationPoint(2.2f, -2.6f, -0.5f);
        this.gunModel[4].rotateAngleZ = 0.4537856f;
        this.gunModel[5].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[5].setRotationPoint(1.5f, -2.0f, -0.5f);
        this.gunModel[6].addBox(0.0f, 0.0f, 0.0f, 3, 2, 1, 0.0f);
        this.gunModel[6].setRotationPoint(2.2f, -2.6f, -0.2f);
        this.gunModel[7].addBox(0.0f, -1.0f, 0.0f, 0, 1, 1, 0.0f);
        this.gunModel[7].setRotationPoint(1.8f, 0.2f, -0.5f);
        this.gunModel[7].rotateAngleZ = 0.3490658f;
        this.gunModel[8].addBox(0.0f, 0.0f, 0.0f, 1, 0, 1, 0.0f);
        this.gunModel[8].setRotationPoint(1.8f, 0.2f, -0.5f);
        this.gunModel[9].addBox(0.0f, 0.0f, 0.0f, 0, 1, 1, 0.0f);
        this.gunModel[9].setRotationPoint(2.8f, 0.2f, -0.5f);
        this.gunModel[9].rotateAngleZ = 2.792527f;
        this.gunModel[10].addBox(0.0f, 0.0f, 0.0f, 8, 1, 1, 0.0f);
        this.gunModel[10].setRotationPoint(3.0f, -2.7f, 0.0f);
        this.gunModel[11].addBox(0.0f, -1.0f, 0.0f, 4, 1, 1, 0.0f);
        this.gunModel[11].setRotationPoint(5.2f, -0.6f, -0.2f);
        this.gunModel[11].rotateAngleZ = 0.2617994f;
        this.gunModel[12].addBox(0.0f, -1.0f, 0.0f, 4, 1, 1, 0.0f);
        this.gunModel[12].setRotationPoint(5.2f, -0.6f, -0.8f);
        this.gunModel[12].rotateAngleZ = 0.2617994f;
        this.gunModel[13].addBox(-1.0f, -1.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[13].setRotationPoint(-1.1f, 0.5f, -0.5f);
        this.gunModel[13].rotateAngleZ = -0.5235988f;
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 0, 15, this.textureX, this.textureY)).addBox(0.0f,
                0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.ammoModel[0].setRotationPoint(3.0f, -2.6f, -0.5f);
        this.scopeAttachPoint = new Vector3f(0.25f, 0.16875f, 0.0f);
        this.numBulletsInReloadAnimation = 2.0f;
        this.tiltGunTime = 0.159f;
        this.unloadClipTime = 0.35f;
        this.loadClipTime = 0.35f;
        this.untiltGunTime = 0.133f;
        this.animationType = EnumAnimationType.RIFLE;
        this.flipAll();
    }
}
