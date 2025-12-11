// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.svz;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;

public class ModelAK74 extends ModelGun {
    int textureX;
    int textureY;

    public ModelAK74() {
        this.textureX = 64;
        this.textureY = 128;
        (this.gunModel = new ModelRendererTurbo[25])[0] = new ModelRendererTurbo(this, 0, 3, this.textureX,
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
        this.gunModel[10] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.gunModel[20] = new ModelRendererTurbo(this, 0, 30, this.textureX, this.textureY);
        this.gunModel[21] = new ModelRendererTurbo(this, 0, 30, this.textureX, this.textureY);
        this.gunModel[22] = new ModelRendererTurbo(this, 0, 30, this.textureX, this.textureY);
        this.gunModel[23] = new ModelRendererTurbo(this, 0, 30, this.textureX, this.textureY);
        this.gunModel[24] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[0].addBox(0.0f, 0.0f, 0.0f, 8, 1, 1, 0.0f);
        this.gunModel[0].setRotationPoint(0.0f, -4.0f, -0.7f);
        this.gunModel[1].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.gunModel[1].setRotationPoint(-0.7f, -3.0f, -0.8f);
        this.gunModel[1].rotateAngleZ = 0.01745329f;
        this.gunModel[2].addBox(0.0f, 0.0f, 0.0f, 8, 1, 1, 0.0f);
        this.gunModel[2].setRotationPoint(0.0f, -4.0f, -0.3f);
        this.gunModel[3].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.gunModel[3].setRotationPoint(-0.7f, -3.0f, -0.2f);
        this.gunModel[3].rotateAngleZ = 0.01745329f;
        this.gunModel[4].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[4].setRotationPoint(0.0f, -4.0f, -0.3f);
        this.gunModel[4].rotateAngleZ = -0.7853982f;
        this.gunModel[5].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[5].setRotationPoint(0.0f, -4.0f, -0.7f);
        this.gunModel[5].rotateAngleZ = -0.7853982f;
        this.gunModel[6].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[6].setRotationPoint(-0.7f, -3.3f, -0.2f);
        this.gunModel[7].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[7].setRotationPoint(-0.7f, -3.3f, -0.8f);
        this.gunModel[8].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[8].setRotationPoint(6.0f, -3.1f, -0.2f);
        this.gunModel[9].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[9].setRotationPoint(6.0f, -3.1f, -0.8f);
        this.gunModel[10].addBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[10].setRotationPoint(0.5f, -3.0f, -0.5f);
        this.gunModel[10].rotateAngleZ = -0.2792527f;
        this.gunModel[11].addBox(0.0f, 0.0f, 0.0f, 1, 0, 1, 0.0f);
        this.gunModel[11].setRotationPoint(1.0f, -1.5f, -0.5f);
        this.gunModel[12].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[12].setRotationPoint(7.0f, -2.8f, -0.8f);
        this.gunModel[13].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[13].setRotationPoint(7.0f, -2.8f, -0.2f);
        this.gunModel[14].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[14].setRotationPoint(7.0f, -3.0f, -0.2f);
        this.gunModel[15].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[15].setRotationPoint(7.0f, -3.0f, -0.8f);
        this.gunModel[16].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.gunModel[16].setRotationPoint(8.0f, -4.0f, -0.2f);
        this.gunModel[17].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.gunModel[17].setRotationPoint(8.0f, -4.0f, -0.8f);
        this.gunModel[18].addBox(0.0f, 0.0f, 0.0f, 3, 2, 1, 0.0f);
        this.gunModel[18].setRotationPoint(9.0f, -4.0f, -0.7f);
        this.gunModel[19].addBox(0.0f, 0.0f, 0.0f, 3, 2, 1, 0.0f);
        this.gunModel[19].setRotationPoint(9.0f, -4.0f, -0.2f);
        this.gunModel[20].addBox(0.0f, 0.0f, 0.0f, 6, 1, 1, 0.0f);
        this.gunModel[20].setRotationPoint(12.0f, -3.0f, -0.5f);
        this.gunModel[21].addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[21].setRotationPoint(12.0f, -3.7f, -0.5f);
        this.gunModel[22].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[22].setRotationPoint(14.0f, -3.7f, -0.5f);
        this.gunModel[22].rotateAngleZ = -0.7853982f;
        this.gunModel[23].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.gunModel[23].setRotationPoint(16.0f, -4.5f, -0.5f);
        this.gunModel[24].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[24].setRotationPoint(2.0f, -2.4f, -0.5f);
        (this.defaultStockModel = new ModelRendererTurbo[6])[0] = new ModelRendererTurbo(this, 0, 10,
                this.textureX, this.textureY);
        this.defaultStockModel[1] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.defaultStockModel[2] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.defaultStockModel[3] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.defaultStockModel[4] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.defaultStockModel[5] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.defaultStockModel[0].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.defaultStockModel[0].setRotationPoint(-7.0f, -1.5f, -0.3f);
        this.defaultStockModel[0].rotateAngleZ = 0.2268928f;
        this.defaultStockModel[1].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.defaultStockModel[1].setRotationPoint(-7.0f, -1.5f, -0.7f);
        this.defaultStockModel[1].rotateAngleZ = 0.2268928f;
        this.defaultStockModel[2].addBox(0.0f, -0.4f, 0.0f, 7, 1, 1, 0.0f);
        this.defaultStockModel[2].setRotationPoint(-7.0f, -1.5f, -0.7f);
        this.defaultStockModel[2].rotateAngleZ = 0.2268928f;
        this.defaultStockModel[3].addBox(0.0f, -0.4f, 0.0f, 7, 1, 1, 0.0f);
        this.defaultStockModel[3].setRotationPoint(-7.0f, -1.5f, -0.3f);
        this.defaultStockModel[3].rotateAngleZ = 0.2268928f;
        this.defaultStockModel[4].addBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f);
        this.defaultStockModel[4].setRotationPoint(-7.0f, -3.5f, -0.3f);
        this.defaultStockModel[5].addBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f);
        this.defaultStockModel[5].setRotationPoint(-7.0f, -3.5f, -0.7f);
        (this.ammoModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo(this, 0, 20, this.textureX,
                this.textureY);
        this.ammoModel[1] = new ModelRendererTurbo(this, 0, 20, this.textureX, this.textureY);
        this.ammoModel[0].addBox(0.0f, 0.0f, 0.0f, 2, 2, 1, 0.0f);
        this.ammoModel[0].setRotationPoint(3.0f, -2.5f, -0.5f);
        this.ammoModel[0].rotateAngleZ = 0.1570796f;
        this.ammoModel[1].addBox(0.0f, 0.0f, 0.0f, 2, 2, 1, 0.0f);
        this.ammoModel[1].setRotationPoint(3.3f, -0.5f, -0.5f);
        this.ammoModel[1].rotateAngleZ = 0.3141593f;
        this.barrelAttachPoint = new Vector3f(1.0625f, 0.15625f, 0.0f);
        this.stockAttachPoint = new Vector3f(0.0f, 0.19375f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.0625f, 0.2625f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.5625f, 0.125f, 0.0f);
        this.animationType = EnumAnimationType.BOTTOM_CLIP;
        this.flipAll();
    }
}
