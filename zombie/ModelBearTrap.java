package com.flansmod.client.model.zombie;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelBearTrap extends ModelBase {

    public ModelRendererTurbo[] mineModel = new ModelRendererTurbo[7];
    public ModelRendererTurbo buttonModel;
    public ModelRendererTurbo[] spikeModel;

    public ModelBearTrap() {
        this.mineModel[0] = new ModelRendererTurbo(this, 4, 0, 32, 8);
        this.mineModel[0].addBox(-2.0F, 0.0F, -3.0F, 4, 1, 1);
        this.mineModel[1] = new ModelRendererTurbo(this, 14, 0, 32, 8);
        this.mineModel[1].addBox(-3.0F, 0.0F, -2.0F, 1, 1, 4);
        this.mineModel[2] = new ModelRendererTurbo(this, 14, 0, 32, 8);
        this.mineModel[2].addBox(-3.0F, 0.0F, -2.0F, 1, 1, 4);
        this.mineModel[2].rotateAngleY = 3.1415927F;
        this.mineModel[3] = new ModelRendererTurbo(this, 4, 0, 32, 8);
        this.mineModel[3].addBox(-2.0F, 0.0F, -3.0F, 4, 1, 1);
        this.mineModel[3].rotateAngleY = 3.1415927F;
        this.mineModel[4] = new ModelRendererTurbo(this, 14, 0, 32, 8);
        this.mineModel[4].addBox(-0.5F, 0.0F, -2.0F, 1, 1, 4);
        this.mineModel[5] = new ModelRendererTurbo(this, 22, 0, 32, 8);
        this.mineModel[5].addBox(-0.5F, 0.0F, -5.0F, 1, 1, 2);
        this.mineModel[6] = new ModelRendererTurbo(this, 22, 0, 32, 8);
        this.mineModel[6].addBox(-0.5F, 0.0F, 3.0F, 1, 1, 2);
        this.buttonModel = new ModelRendererTurbo(this, 0, 0, 32, 8);
        this.buttonModel.addBox(-0.5F, 0.5F, -0.5F, 1, 1, 1);
        this.spikeModel = new ModelRendererTurbo[10];
        this.spikeModel[0] = new ModelRendererTurbo(this, 0, 0, 32, 8);
        this.spikeModel[0].addTrapezoid(-2.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, -0.5F, 5);
        this.spikeModel[1] = new ModelRendererTurbo(this, 0, 0, 32, 8);
        this.spikeModel[1].addTrapezoid(-3.0F, 1.0F, -2.0F, 1, 1, 1, 0.0F, -0.5F, 5);
        this.spikeModel[2] = new ModelRendererTurbo(this, 0, 0, 32, 8);
        this.spikeModel[2].addTrapezoid(-3.0F, 1.0F, -0.5F, 1, 1, 1, 0.0F, -0.5F, 5);
        this.spikeModel[3] = new ModelRendererTurbo(this, 0, 0, 32, 8);
        this.spikeModel[3].addTrapezoid(-3.0F, 1.0F, 1.0F, 1, 1, 1, 0.0F, -0.5F, 5);
        this.spikeModel[4] = new ModelRendererTurbo(this, 0, 0, 32, 8);
        this.spikeModel[4].addTrapezoid(-2.0F, 1.0F, 2.0F, 1, 1, 1, 0.0F, -0.5F, 5);
        this.spikeModel[5] = new ModelRendererTurbo(this, 0, 0, 32, 8);
        this.spikeModel[5].addTrapezoid(1.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, -0.5F, 5);
        this.spikeModel[6] = new ModelRendererTurbo(this, 0, 0, 32, 8);
        this.spikeModel[6].addTrapezoid(2.0F, 1.0F, -2.0F, 1, 1, 1, 0.0F, -0.5F, 5);
        this.spikeModel[7] = new ModelRendererTurbo(this, 0, 0, 32, 8);
        this.spikeModel[7].addTrapezoid(2.0F, 1.0F, -0.5F, 1, 1, 1, 0.0F, -0.5F, 5);
        this.spikeModel[8] = new ModelRendererTurbo(this, 0, 0, 32, 8);
        this.spikeModel[8].addTrapezoid(2.0F, 1.0F, 1.0F, 1, 1, 1, 0.0F, -0.5F, 5);
        this.spikeModel[9] = new ModelRendererTurbo(this, 0, 0, 32, 8);
        this.spikeModel[9].addTrapezoid(1.0F, 1.0F, 2.0F, 1, 1, 1, 0.0F, -0.5F, 5);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        ModelRendererTurbo[] var8 = this.mineModel;
        int var9 = var8.length;

        int var10;
        ModelRendererTurbo spikeModelBit;
        for (var10 = 0; var10 < var9; ++var10) {
            spikeModelBit = var8[var10];
            spikeModelBit.render(f5);
        }

        this.buttonModel.render(f5);
        var8 = this.spikeModel;
        var9 = var8.length;

        for (var10 = 0; var10 < var9; ++var10) {
            spikeModelBit = var8[var10];
            spikeModelBit.render(f5);
        }

    }
}
