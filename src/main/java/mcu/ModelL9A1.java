// 
// Decompiled by Procyon v0.5.36
// 

package com.flansmod.client.model.svz;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;

public class ModelL9A1 extends ModelGun {
    int textureX;
    int textureY;

    public ModelL9A1() {
        this.textureX = 64;
        this.textureY = 32;
        (this.gunModel = new ModelRendererTurbo[15])[0] = new ModelRendererTurbo(this, 5, 0, this.textureX,
                this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 11, 0, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 0, 5, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 25, 6, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 11, 6, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 24, 0, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 0, 9, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 6, 9, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 12, 9, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 17, 6, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 12, 11, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 0, 5, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 11, 3, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 11, 3, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 5, 0, this.textureX, this.textureY);
        this.gunModel[0].addBox(-2.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[0].setRotationPoint(2.0f, -2.2f, -0.4f);
        this.gunModel[0].rotateAngleZ = -0.1396263f;
        this.gunModel[1].addBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f);
        this.gunModel[1].setRotationPoint(0.5f, -2.4f, -0.5f);
        this.gunModel[1].rotateAngleZ = 0.03490658f;
        this.gunModel[2].addBox(-1.5f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[2].setRotationPoint(2.0f, -2.2f, -0.4f);
        this.gunModel[2].rotateAngleZ = -0.1919862f;
        this.gunModel[3].addBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f);
        this.gunModel[3].setRotationPoint(0.9f, -3.0f, -0.5f);
        this.gunModel[4].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[4].setRotationPoint(0.0f, -2.7f, -0.5f);
        this.gunModel[4].rotateAngleZ = -0.7853982f;
        this.gunModel[5].addBox(0.0f, 0.0f, 0.0f, 1, 1, 0, 0.0f);
        this.gunModel[5].setRotationPoint(-0.1f, -3.1f, 0.0f);
        this.gunModel[5].rotateAngleZ = -1.064651f;
        this.gunModel[6].addBox(-1.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[6].setRotationPoint(1.3f, -2.4f, -0.7f);
        this.gunModel[6].rotateAngleZ = -0.1396263f;
        this.gunModel[7].addBox(-1.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[7].setRotationPoint(1.3f, -2.4f, -0.3f);
        this.gunModel[7].rotateAngleZ = -0.1396263f;
        this.gunModel[8].addBox(0.0f, 0.0f, 0.0f, 1, 0, 1, 0.0f);
        this.gunModel[8].setRotationPoint(1.0f, -1.0f, -0.5f);
        this.gunModel[9].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[9].setRotationPoint(5.0f, -2.6f, -0.5f);
        this.gunModel[10].addBox(0.0f, 0.0f, 0.0f, 1, 0, 1, 0.0f);
        this.gunModel[10].setRotationPoint(2.0f, -1.0f, -0.5f);
        this.gunModel[10].rotateAngleZ = 1.186824f;
        this.gunModel[11].addBox(-1.5f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[11].setRotationPoint(2.0f, -2.2f, -0.6f);
        this.gunModel[11].rotateAngleZ = -0.1396263f;
        this.gunModel[12].addBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f);
        this.gunModel[12].setRotationPoint(1.0f, -2.6f, -0.6f);
        this.gunModel[12].rotateAngleZ = 0.03490658f;
        this.gunModel[13].addBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f);
        this.gunModel[13].setRotationPoint(1.0f, -2.6f, -0.4f);
        this.gunModel[13].rotateAngleZ = 0.03490658f;
        this.gunModel[14].addBox(-2.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[14].setRotationPoint(2.0f, -2.2f, -0.6f);
        this.gunModel[14].rotateAngleZ = -0.1396263f;
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 5, 0, this.textureX, this.textureY)).addBox(0.0f,
                0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.ammoModel[0].setRotationPoint(0.3f, -2.4f, -0.5f);
        this.ammoModel[0].rotateAngleZ = -0.1396263f;
        (this.slideModel = new ModelRendererTurbo[7])[0] = new ModelRendererTurbo(this, 0, 0, this.textureX,
                this.textureY);
        this.slideModel[1] = new ModelRendererTurbo(this, 11, 3, this.textureX, this.textureY);
        this.slideModel[2] = new ModelRendererTurbo(this, 11, 3, this.textureX, this.textureY);
        this.slideModel[3] = new ModelRendererTurbo(this, 11, 3, this.textureX, this.textureY);
        this.slideModel[4] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.slideModel[5] = new ModelRendererTurbo(this, 11, 3, this.textureX, this.textureY);
        this.slideModel[6] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.slideModel[0].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.slideModel[0].setRotationPoint(0.0f, -3.0f, -0.6f);
        this.slideModel[1].addBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f);
        this.slideModel[1].setRotationPoint(2.0f, -3.0f, -0.6f);
        this.slideModel[2].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.slideModel[2].setRotationPoint(0.0f, -3.1f, -0.5f);
        this.slideModel[3].addBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f);
        this.slideModel[3].setRotationPoint(2.0f, -3.1f, -0.5f);
        this.slideModel[4].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.slideModel[4].setRotationPoint(-0.5f, -3.1f, -0.5f);
        this.slideModel[5].addBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f);
        this.slideModel[5].setRotationPoint(2.0f, -3.0f, -0.4f);
        this.slideModel[6].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.slideModel[6].setRotationPoint(0.0f, -3.0f, -0.4f);
        this.barrelAttachPoint = new Vector3f(0.375f, 0.15625f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.0f, 0.1875f, 0.0f);
        this.scopeIsOnSlide = true;
        this.gunSlideDistance = 0.25f;
        this.animationType = EnumAnimationType.PISTOL_CLIP;
        this.flipAll();
    }
}
