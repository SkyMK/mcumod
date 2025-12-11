// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.svz;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;

public class ModelMosin extends ModelGun {
    int textureX;
    int textureY;

    public ModelMosin() {
        this.textureX = 64;
        this.textureY = 128;
        (this.gunModel = new ModelRendererTurbo[31])[0] = new ModelRendererTurbo(this, 0, 0, this.textureX,
                this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 0, 25, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 0, 25, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 0, 25, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 0, 25, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[20] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[21] = new ModelRendererTurbo(this, 0, 25, this.textureX, this.textureY);
        this.gunModel[22] = new ModelRendererTurbo(this, 0, 25, this.textureX, this.textureY);
        this.gunModel[23] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[24] = new ModelRendererTurbo(this, 0, 25, this.textureX, this.textureY);
        this.gunModel[25] = new ModelRendererTurbo(this, 0, 25, this.textureX, this.textureY);
        this.gunModel[26] = new ModelRendererTurbo(this, 0, 25, this.textureX, this.textureY);
        this.gunModel[27] = new ModelRendererTurbo(this, 0, 25, this.textureX, this.textureY);
        this.gunModel[28] = new ModelRendererTurbo(this, 0, 24, this.textureX, this.textureY);
        this.gunModel[29] = new ModelRendererTurbo(this, 0, 24, this.textureX, this.textureY);
        this.gunModel[30] = new ModelRendererTurbo(this, 0, 25, this.textureX, this.textureY);
        this.gunModel[0].addBox(0.3f, 0.0f, 0.0f, 1, 8, 1, 0.0f);
        this.gunModel[0].setRotationPoint(1.0f, -2.4f, -0.6f);
        this.gunModel[0].rotateAngleZ = -1.308997f;
        this.gunModel[1].addBox(0.3f, 0.0f, 0.0f, 1, 8, 1, 0.0f);
        this.gunModel[1].setRotationPoint(1.0f, -2.4f, -0.4f);
        this.gunModel[1].rotateAngleZ = -1.308997f;
        this.gunModel[2].addBox(-0.4f, 0.0f, 0.0f, 1, 8, 1, 0.0f);
        this.gunModel[2].setRotationPoint(1.2f, -2.4f, -0.6f);
        this.gunModel[2].rotateAngleZ = -1.308997f;
        this.gunModel[3].addBox(-0.4f, 0.0f, 0.0f, 1, 8, 1, 0.0f);
        this.gunModel[3].setRotationPoint(1.2f, -2.4f, -0.4f);
        this.gunModel[3].rotateAngleZ = -1.308997f;
        this.gunModel[4].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.gunModel[4].setRotationPoint(-7.0f, -1.0f, -0.6f);
        this.gunModel[5].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.gunModel[5].setRotationPoint(-7.0f, -1.0f, -0.4f);
        this.gunModel[6].addBox(0.0f, 0.0f, 0.0f, 5, 2, 1, 0.0f);
        this.gunModel[6].setRotationPoint(-7.0f, -2.3f, -0.6f);
        this.gunModel[7].addBox(0.0f, 0.0f, 0.0f, 5, 2, 1, 0.0f);
        this.gunModel[7].setRotationPoint(-7.0f, -2.3f, -0.4f);
        this.gunModel[8].addBox(0.0f, 0.0f, 0.0f, 8, 1, 1, 0.0f);
        this.gunModel[8].setRotationPoint(1.0f, -3.0f, -0.3f);
        this.gunModel[9].addBox(0.0f, 0.0f, 0.0f, 8, 1, 1, 0.0f);
        this.gunModel[9].setRotationPoint(1.0f, -3.0f, -0.7f);
        this.gunModel[10].addBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f);
        this.gunModel[10].setRotationPoint(1.0f, -2.0f, -0.7f);
        this.gunModel[11].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[11].setRotationPoint(9.0f, -3.1f, -0.2f);
        this.gunModel[12].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[12].setRotationPoint(9.0f, -3.1f, -0.8f);
        this.gunModel[13].addBox(0.0f, -1.0f, 0.0f, 4, 1, 1, 0.0f);
        this.gunModel[13].setRotationPoint(6.0f, -1.0f, -0.3f);
        this.gunModel[13].rotateAngleZ = 0.05235988f;
        this.gunModel[14].addBox(0.0f, -1.0f, 0.0f, 4, 1, 1, 0.0f);
        this.gunModel[14].setRotationPoint(6.0f, -1.0f, -0.7f);
        this.gunModel[14].rotateAngleZ = 0.05235988f;
        this.gunModel[15].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[15].setRotationPoint(9.0f, -2.1f, -0.2f);
        this.gunModel[16].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[16].setRotationPoint(9.0f, -2.1f, -0.8f);
        this.gunModel[17].addBox(0.0f, -1.0f, 0.0f, 11, 1, 1, 0.0f);
        this.gunModel[17].setRotationPoint(9.0f, -1.2f, -0.6f);
        this.gunModel[17].rotateAngleY = 0.008726646f;
        this.gunModel[17].rotateAngleZ = 0.01745329f;
        this.gunModel[18].addBox(0.0f, -1.0f, 0.0f, 11, 1, 1, 0.0f);
        this.gunModel[18].setRotationPoint(9.0f, -1.2f, -0.4f);
        this.gunModel[18].rotateAngleY = -0.008726646f;
        this.gunModel[18].rotateAngleZ = 0.01745329f;
        this.gunModel[19].addBox(0.0f, 0.0f, 0.0f, 10, 1, 1, 0.0f);
        this.gunModel[19].setRotationPoint(10.0f, -3.2f, -0.6f);
        this.gunModel[19].rotateAngleY = 0.008726646f;
        this.gunModel[20].addBox(0.0f, 0.0f, 0.0f, 10, 1, 1, 0.0f);
        this.gunModel[20].setRotationPoint(10.0f, -3.2f, -0.4f);
        this.gunModel[20].rotateAngleY = -0.008726646f;
        this.gunModel[21].addBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f);
        this.gunModel[21].setRotationPoint(20.0f, -3.2f, -0.5f);
        this.gunModel[22].addBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f);
        this.gunModel[22].setRotationPoint(5.0f, -3.3f, -0.6f);
        this.gunModel[23].addBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f);
        this.gunModel[23].setRotationPoint(1.0f, -2.0f, -0.3f);
        this.gunModel[24].addBox(0.0f, -1.0f, 0.0f, 0, 1, 1, 0.0f);
        this.gunModel[24].setRotationPoint(1.5f, -0.3f, -0.5f);
        this.gunModel[24].rotateAngleZ = 0.3665192f;
        this.gunModel[25].addBox(0.0f, 0.0f, 0.0f, 1, 0, 1, 0.0f);
        this.gunModel[25].setRotationPoint(1.5f, -0.3f, -0.5f);
        this.gunModel[26].addBox(0.0f, -1.0f, 0.0f, 3, 1, 1, 0.0f);
        this.gunModel[26].setRotationPoint(2.5f, -0.3f, -0.5f);
        this.gunModel[26].rotateAngleZ = 0.2268928f;
        this.gunModel[27].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[27].setRotationPoint(22.0f, -3.5f, -0.5f);
        this.gunModel[28].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.gunModel[28].setRotationPoint(17.0f, -3.3f, -0.6f);
        this.gunModel[29].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.gunModel[29].setRotationPoint(17.0f, -3.3f, -0.4f);
        this.gunModel[30].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.gunModel[30].setRotationPoint(1.0f, -3.3f, -0.4f);
        this.defaultScopeModel = new ModelRendererTurbo[1];
        (this.defaultScopeModel[0] = new ModelRendererTurbo(this, 0, 25, this.textureX, this.textureY))
                .addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.defaultScopeModel[0].setRotationPoint(7.0f, -3.5f, -0.5f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 6, 5, this.textureX, this.textureY)).addBox(0.0f,
                0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.ammoModel[0].setRotationPoint(2.0f, -2.5f, -0.5f);
        (this.pumpModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo(this, 0, 15, this.textureX,
                this.textureY);
        this.pumpModel[1] = new ModelRendererTurbo(this, 0, 15, this.textureX, this.textureY);
        this.pumpModel[0].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.pumpModel[0].setRotationPoint(0.8f, -3.2f, -0.5f);
        this.pumpModel[1].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.pumpModel[1].setRotationPoint(2.0f, -3.2f, -1.2f);
        this.barrelAttachPoint = new Vector3f(1.4375f, 0.175f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.28125f, 0.20625f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.875f, 0.05625f, 0.0f);
        this.numBulletsInReloadAnimation = 5.0f;
        this.tiltGunTime = 0.159f;
        this.unloadClipTime = 0.0f;
        this.loadClipTime = 0.71f;
        this.untiltGunTime = 0.133f;
        this.pumpDelayAfterReload = 70;
        this.pumpDelay = 10;
        this.pumpTime = 30;
        this.animationType = EnumAnimationType.RIFLE;
        this.flipAll();
    }
}
