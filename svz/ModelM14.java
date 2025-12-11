// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.svz;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;

public class ModelM14 extends ModelGun {
    int textureX;
    int textureY;

    public ModelM14() {
        this.textureX = 64;
        this.textureY = 128;
        (this.gunModel = new ModelRendererTurbo[29])[0] = new ModelRendererTurbo(this, 0, 0, this.textureX,
                this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 10, 15, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 10, 15, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 10, 15, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[20] = new ModelRendererTurbo(this, 0, 21, this.textureX, this.textureY);
        this.gunModel[21] = new ModelRendererTurbo(this, 0, 21, this.textureX, this.textureY);
        this.gunModel[22] = new ModelRendererTurbo(this, 0, 21, this.textureX, this.textureY);
        this.gunModel[23] = new ModelRendererTurbo(this, 0, 21, this.textureX, this.textureY);
        this.gunModel[24] = new ModelRendererTurbo(this, 0, 21, this.textureX, this.textureY);
        this.gunModel[25] = new ModelRendererTurbo(this, 0, 13, this.textureX, this.textureY);
        this.gunModel[26] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.gunModel[27] = new ModelRendererTurbo(this, 0, 16, this.textureX, this.textureY);
        this.gunModel[28] = new ModelRendererTurbo(this, 0, 16, this.textureX, this.textureY);
        this.gunModel[0].addBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[0].setRotationPoint(1.2f, -3.0f, -0.5f);
        this.gunModel[0].rotateAngleZ = -0.8726646f;
        this.gunModel[1].addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[1].setRotationPoint(1.0f, -3.0f, -0.6f);
        this.gunModel[1].rotateAngleZ = 0.2268928f;
        this.gunModel[2].addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[2].setRotationPoint(1.0f, -3.0f, -0.4f);
        this.gunModel[2].rotateAngleZ = 0.2268928f;
        this.gunModel[3].addBox(-2.0f, -1.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[3].setRotationPoint(3.8f, -1.7f, -0.3f);
        this.gunModel[3].rotateAngleZ = -0.08726646f;
        this.gunModel[4].addBox(0.0f, 0.0f, 0.0f, 11, 1, 1, 0.0f);
        this.gunModel[4].setRotationPoint(3.0f, -3.2f, -0.3f);
        this.gunModel[5].addBox(0.0f, 0.0f, 0.0f, 11, 1, 1, 0.0f);
        this.gunModel[5].setRotationPoint(3.0f, -3.2f, -0.7f);
        this.gunModel[6].addBox(-2.0f, -1.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[6].setRotationPoint(3.8f, -1.7f, -0.7f);
        this.gunModel[6].rotateAngleZ = -0.08726646f;
        this.gunModel[7].addBox(0.0f, 0.0f, 0.0f, 1, 0, 1, 0.0f);
        this.gunModel[7].setRotationPoint(2.8f, -1.3f, -0.5f);
        this.gunModel[8].addBox(0.0f, -1.0f, 0.0f, 0, 1, 1, 0.0f);
        this.gunModel[8].setRotationPoint(2.8f, -1.3f, -0.5f);
        this.gunModel[8].rotateAngleZ = 0.296706f;
        this.gunModel[9].addBox(0.0f, -1.0f, 0.0f, 0, 1, 1, 0.0f);
        this.gunModel[9].setRotationPoint(3.8f, -1.3f, -0.5f);
        this.gunModel[9].rotateAngleZ = -0.08726646f;
        this.gunModel[10].addBox(0.0f, 0.0f, 0.0f, 6, 2, 1, 0.0f);
        this.gunModel[10].setRotationPoint(-7.0f, -3.0f, -0.6f);
        this.gunModel[11].addBox(-7.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.gunModel[11].setRotationPoint(0.0f, -1.7f, -0.5f);
        this.gunModel[11].rotateAngleZ = 0.1919862f;
        this.gunModel[12].addBox(0.0f, 0.0f, 0.0f, 6, 2, 1, 0.0f);
        this.gunModel[12].setRotationPoint(-7.0f, -3.0f, -0.4f);
        this.gunModel[13].addBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f);
        this.gunModel[13].setRotationPoint(-7.0f, -1.4f, -0.5f);
        this.gunModel[14].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[14].setRotationPoint(-7.0f, -0.5f, -0.5f);
        this.gunModel[15].addBox(-1.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.gunModel[15].setRotationPoint(-1.0f, -3.0f, -0.6f);
        this.gunModel[15].rotateAngleZ = 0.7330383f;
        this.gunModel[16].addBox(-1.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.gunModel[16].setRotationPoint(-1.0f, -3.0f, -0.4f);
        this.gunModel[16].rotateAngleZ = 0.7330383f;
        this.gunModel[17].addBox(0.4f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[17].setRotationPoint(1.2f, -3.0f, -0.5f);
        this.gunModel[17].rotateAngleZ = -0.8726646f;
        this.gunModel[18].addBox(0.0f, -1.0f, 0.0f, 4, 1, 1, 0.0f);
        this.gunModel[18].setRotationPoint(3.8f, -1.7f, -0.3f);
        this.gunModel[18].rotateAngleZ = 0.122173f;
        this.gunModel[19].addBox(0.0f, -1.0f, 0.0f, 4, 1, 1, 0.0f);
        this.gunModel[19].setRotationPoint(3.8f, -1.7f, -0.7f);
        this.gunModel[19].rotateAngleZ = 0.122173f;
        this.gunModel[20].addBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f);
        this.gunModel[20].setRotationPoint(3.0f, -3.7f, -0.6f);
        this.gunModel[21].addBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f);
        this.gunModel[21].setRotationPoint(3.0f, -3.7f, -0.4f);
        this.gunModel[22].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.gunModel[22].setRotationPoint(7.0f, -3.8f, -0.6f);
        this.gunModel[23].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.gunModel[23].setRotationPoint(7.0f, -3.8f, -0.4f);
        this.gunModel[24].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.gunModel[24].setRotationPoint(7.0f, -3.9f, -0.5f);
        this.gunModel[25].addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[25].setRotationPoint(14.0f, -3.3f, -0.5f);
        this.gunModel[26].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.gunModel[26].setRotationPoint(14.0f, -3.8f, -0.5f);
        this.gunModel[27].addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[27].setRotationPoint(3.5f, -4.1f, -0.5f);
        this.gunModel[28].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[28].setRotationPoint(18.0f, -4.1f, -0.5f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 0, 5, this.textureX, this.textureY)).addBox(0.0f,
                0.0f, 0.0f, 2, 3, 1, 0.0f);
        this.ammoModel[0].setRotationPoint(4.0f, -2.0f, -0.5f);
        this.ammoModel[0].rotateAngleZ = 0.122173f;
        this.barrelAttachPoint = new Vector3f(1.0625f, 0.20625f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.21875f, 0.2375f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.6875f, 0.115625f, 0.0f);
        this.animationType = EnumAnimationType.BOTTOM_CLIP;
        this.flipAll();
    }
}
