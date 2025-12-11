package com.flansmod.client.model;

import com.flansmod.common.guns.EntityBullet;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderBullet extends Render {

    public RenderBullet() {
        super.shadowSize = 0.0F;
    }

    public void render(EntityBullet bullet, double d, double d1, double d2, float f, float f1) {
    }

    public void doRender(Entity entity, double d, double d1, double d2, float f, float f1) {
    }

    protected ResourceLocation getEntityTexture(Entity entity) {
        return null;
    }
}
