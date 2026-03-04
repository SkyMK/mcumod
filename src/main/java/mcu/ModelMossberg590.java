// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.svz;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;

public class ModelMossberg590 extends ModelGun {
    int textureX;
    int textureY;

    public ModelMossberg590() {
        this.textureX = 128;
        this.textureY = 32;
        (this.gunModel = new ModelRendererTurbo[23])[0] = new ModelRendererTurbo(this, 0, 0, this.textureX,
                this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 31, 0, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 42, 0, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 0, 5, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 0, 9, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 0, 12, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 0, 15, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 11, 6, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 17, 6, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 20, 0, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 20, 0, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 20, 0, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 44, 6, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 56, 0, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 70, 0, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 0, 18, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 33, 10, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 20, 0, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 60, 6, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[20] = new ModelRendererTurbo(this, 0, 9, this.textureX, this.textureY);
        this.gunModel[21] = new ModelRendererTurbo(this, 0, 9, this.textureX, this.textureY);
        this.gunModel[22] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[0].addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[0].setRotationPoint(-2.0f, -1.0f, -0.5f);
        this.gunModel[0].rotateAngleZ = -0.2268928f;
        this.gunModel[1].addBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f);
        this.gunModel[1].setRotationPoint(-2.0f, -1.0f, -0.5f);
        this.gunModel[1].rotateAngleZ = 0.6981317f;
        this.gunModel[2].addBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f);
        this.gunModel[2].setRotationPoint(-1.4f, -0.5f, -0.5f);
        this.gunModel[2].rotateAngleZ = 0.6283185f;
        this.gunModel[3].addBox(0.0f, 0.0f, 0.0f, 3, 2, 1, 0.0f);
        this.gunModel[3].setRotationPoint(2.2f, -3.6f, -0.3f);
        this.gunModel[4].addBox(0.0f, 0.0f, 0.0f, 13, 1, 1, 0.0f);
        this.gunModel[4].setRotationPoint(4.0f, -3.6f, -0.5f);
        this.gunModel[5].addBox(0.0f, 0.0f, 0.0f, 15, 1, 1, 0.0f);
        this.gunModel[5].setRotationPoint(2.0f, -2.4f, -0.5f);
        this.gunModel[6].addBox(-2.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[6].setRotationPoint(2.2f, -2.6f, -0.5f);
        this.gunModel[6].rotateAngleZ = 0.3316126f;
        this.gunModel[7].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[7].setRotationPoint(2.5f, -3.0f, -0.5f);
        this.gunModel[8].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[8].setRotationPoint(11.0f, -3.0f, -0.5f);
        this.gunModel[9].addBox(0.0f, -1.0f, 0.0f, 0, 1, 1, 0.0f);
        this.gunModel[9].setRotationPoint(1.8f, -0.8f, -0.5f);
        this.gunModel[9].rotateAngleZ = 0.3490658f;
        this.gunModel[10].addBox(0.0f, 0.0f, 0.0f, 1, 0, 1, 0.0f);
        this.gunModel[10].setRotationPoint(1.8f, -0.8f, -0.5f);
        this.gunModel[11].addBox(0.0f, 0.0f, 0.0f, 0, 1, 1, 0.0f);
        this.gunModel[11].setRotationPoint(2.8f, -0.8f, -0.5f);
        this.gunModel[11].rotateAngleZ = 2.792527f;
        this.gunModel[12].addBox(-5.8f, 0.0f, 0.0f, 6, 1, 1, 0.0f);
        this.gunModel[12].setRotationPoint(-1.5f, -1.7f, -0.5f);
        this.gunModel[12].rotateAngleZ = 0.296706f;
        this.gunModel[13].addBox(-1.0f, 0.0f, 0.0f, 2, 2, 1, 0.0f);
        this.gunModel[13].setRotationPoint(-0.6f, -2.6f, -0.5f);
        this.gunModel[13].rotateAngleZ = -0.2792527f;
        this.gunModel[14].addBox(-5.0f, 0.0f, 0.0f, 5, 2, 1, 0.0f);
        this.gunModel[14].setRotationPoint(-1.6f, -2.9f, -0.5f);
        this.gunModel[14].rotateAngleZ = 0.1047198f;
        this.gunModel[15].addBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[15].setRotationPoint(-7.0f, -2.4f, -0.5f);
        this.gunModel[16].addBox(0.0f, 0.0f, 0.0f, 3, 2, 1, 0.0f);
        this.gunModel[16].setRotationPoint(2.2f, -3.6f, -0.7f);
        this.gunModel[17].addBox(0.0f, 0.0f, 0.0f, 1, 1, 0, 0.0f);
        this.gunModel[17].setRotationPoint(16.3f, -4.0f, 0.0f);
        this.gunModel[17].rotateAngleZ = -0.7853982f;
        this.gunModel[18].addBox(-2.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[18].setRotationPoint(2.2f, -3.6f, -0.5f);
        this.gunModel[18].rotateAngleZ = 0.3316126f;
        this.gunModel[19].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[19].setRotationPoint(1.3f, -2.4f, -0.5f);
        this.gunModel[20].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[20].setRotationPoint(15.0f, -3.0f, -0.5f);
        this.gunModel[21].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[21].setRotationPoint(12.5f, -3.0f, -0.5f);
        this.gunModel[22].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[22].setRotationPoint(-6.0f, -1.0f, -0.5f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 0, 25, this.textureX, this.textureY)).addBox(0.0f,
                0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.ammoModel[0].setRotationPoint(3.0f, -3.0f, -0.5f);
        (this.pumpModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo(this, 30, 5, this.textureX,
                this.textureY);
        this.pumpModel[1] = new ModelRendererTurbo(this, 30, 5, this.textureX, this.textureY);
        this.pumpModel[0].addBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f);
        this.pumpModel[0].setRotationPoint(8.0f, -3.2f, -0.3f);
        this.pumpModel[1].addBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f);
        this.pumpModel[1].setRotationPoint(8.0f, -3.2f, -0.7f);
        this.barrelAttachPoint = new Vector3f(1.0f, 0.19375f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.1875f, 0.225f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.60625f, 0.05625f, 0.0f);
        this.numBulletsInReloadAnimation = 8.0f;
        this.tiltGunTime = 0.159f;
        this.unloadClipTime = 0.0f;
        this.loadClipTime = 0.7f;
        this.untiltGunTime = 0.133f;
        this.pumpDelayAfterReload = 160;
        this.pumpDelay = 8;
        this.pumpTime = 10;
        this.animationType = EnumAnimationType.SHOTGUN;
        this.flipAll();
    }
}
