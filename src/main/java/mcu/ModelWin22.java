// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.svz;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;

public class ModelWin22 extends ModelGun {
    int textureX;
    int textureY;

    public ModelWin22() {
        this.textureX = 64;
        this.textureY = 128;
        (this.gunModel = new ModelRendererTurbo[21])[0] = new ModelRendererTurbo(this, 0, 0, this.textureX,
                this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 0, 5, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 0, 5, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 0, 5, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 0, 5, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 0, 5, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 0, 5, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 0, 5, this.textureX, this.textureY);
        this.gunModel[20] = new ModelRendererTurbo(this, 0, 5, this.textureX, this.textureY);
        this.gunModel[0].addBox(-9.0f, 0.0f, 0.0f, 9, 1, 1, 0.0f);
        this.gunModel[0].setRotationPoint(2.0f, -3.0f, -0.6f);
        this.gunModel[0].rotateAngleZ = 0.3490658f;
        this.gunModel[1].addBox(-9.0f, 0.0f, 0.0f, 9, 1, 1, 0.0f);
        this.gunModel[1].setRotationPoint(2.0f, -3.0f, -0.4f);
        this.gunModel[1].rotateAngleZ = 0.3490658f;
        this.gunModel[2].addBox(-9.0f, 0.5f, 0.0f, 9, 1, 1, 0.0f);
        this.gunModel[2].setRotationPoint(2.0f, -3.0f, -0.5f);
        this.gunModel[2].rotateAngleZ = 0.3490658f;
        this.gunModel[3].addBox(0.0f, 0.0f, 0.0f, 5, 2, 1, 0.0f);
        this.gunModel[3].setRotationPoint(-7.0f, -2.0f, -0.5f);
        this.gunModel[4].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.gunModel[4].setRotationPoint(-7.0f, -0.5f, -0.5f);
        this.gunModel[5].addBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f);
        this.gunModel[5].setRotationPoint(2.0f, -3.0f, -0.7f);
        this.gunModel[6].addBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f);
        this.gunModel[6].setRotationPoint(2.0f, -3.0f, -0.3f);
        this.gunModel[7].addBox(0.0f, -1.0f, 0.0f, 4, 1, 1, 0.0f);
        this.gunModel[7].setRotationPoint(2.0f, -1.5f, -0.4f);
        this.gunModel[7].rotateAngleZ = 0.01745329f;
        this.gunModel[8].addBox(0.0f, -1.0f, 0.0f, 4, 1, 1, 0.0f);
        this.gunModel[8].setRotationPoint(2.0f, -1.5f, -0.6f);
        this.gunModel[8].rotateAngleZ = 0.01745329f;
        this.gunModel[9].addBox(0.0f, 0.0f, 0.0f, 6, 1, 1, 0.0f);
        this.gunModel[9].setRotationPoint(6.0f, -3.0f, -0.7f);
        this.gunModel[9].rotateAngleY = 0.03490658f;
        this.gunModel[10].addBox(0.0f, 0.0f, 0.0f, 6, 1, 1, 0.0f);
        this.gunModel[10].setRotationPoint(6.0f, -3.0f, -0.3f);
        this.gunModel[10].rotateAngleY = -0.03490658f;
        this.gunModel[11].addBox(0.0f, -1.0f, 0.0f, 6, 1, 1, 0.0f);
        this.gunModel[11].setRotationPoint(6.0f, -1.5f, -0.3f);
        this.gunModel[11].rotateAngleY = -0.03490658f;
        this.gunModel[11].rotateAngleZ = 0.01745329f;
        this.gunModel[12].addBox(0.0f, -1.0f, 0.0f, 6, 1, 1, 0.0f);
        this.gunModel[12].setRotationPoint(6.0f, -1.5f, -0.7f);
        this.gunModel[12].rotateAngleY = 0.03490658f;
        this.gunModel[12].rotateAngleZ = 0.01745329f;
        this.gunModel[13].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.gunModel[13].setRotationPoint(12.0f, -3.0f, -0.5f);
        this.gunModel[14].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.gunModel[14].setRotationPoint(12.0f, -2.8f, -0.5f);
        this.gunModel[15].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[15].setRotationPoint(17.0f, -3.3f, -0.5f);
        this.gunModel[16].addBox(0.0f, 0.0f, 0.0f, 1, 1, 0, 0.0f);
        this.gunModel[16].setRotationPoint(1.0f, -3.3f, 0.0f);
        this.gunModel[16].rotateAngleZ = -0.296706f;
        this.gunModel[17].addBox(0.0f, -1.0f, 0.0f, 0, 1, 1, 0.0f);
        this.gunModel[17].setRotationPoint(1.5f, -0.5f, -0.5f);
        this.gunModel[17].rotateAngleZ = 0.5235988f;
        this.gunModel[18].addBox(-2.0f, 0.0f, 0.0f, 3, 0, 1, 0.0f);
        this.gunModel[18].setRotationPoint(1.5f, -0.5f, -0.5f);
        this.gunModel[18].rotateAngleZ = 0.3490658f;
        this.gunModel[19].addBox(0.0f, -1.0f, 0.0f, 0, 1, 1, 0.0f);
        this.gunModel[19].setRotationPoint(2.5f, -0.8f, -0.5f);
        this.gunModel[20].addBox(-2.0f, -1.0f, 0.0f, 0, 1, 1, 0.0f);
        this.gunModel[20].setRotationPoint(1.5f, -0.5f, -0.5f);
        this.gunModel[20].rotateAngleZ = 0.3490658f;
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 0, 5, this.textureX, this.textureY)).addBox(0.0f,
                0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.ammoModel[0].setRotationPoint(3.0f, -2.7f, -0.5f);
        this.scopeAttachPoint = new Vector3f(0.14375f, 0.1875f, 0.0f);
        this.numBulletsInReloadAnimation = 5.0f;
        this.tiltGunTime = 0.159f;
        this.unloadClipTime = 0.0f;
        this.loadClipTime = 0.71f;
        this.untiltGunTime = 0.133f;
        this.animationType = EnumAnimationType.RIFLE;
        this.flipAll();
    }
}
