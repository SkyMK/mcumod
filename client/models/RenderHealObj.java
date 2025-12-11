// 
// Decompiled by Procyon v0.5.36
// 

package mcu.client.models;

import mcu.items.ItemHeal;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

import java.util.HashMap;
import java.util.Map;

public class RenderHealObj implements IItemRenderer {
    public static final RenderHealObj instance;
    private static final Map<ItemHeal, Integer> _displayLists_dont_touch;

    static {
        instance = new RenderHealObj();
        _displayLists_dont_touch = new HashMap<ItemHeal, Integer>();
    }

    public static int getDisplayListId(final ItemHeal itemHeal) {
        final Integer n = RenderHealObj._displayLists_dont_touch.get(itemHeal);
        int n2;
        if (n != null) {
            n2 = n;
        } else {
            n2 = GL11.glGenLists(1);
            GL11.glNewList(n2, 4864);
            try {
                MCUObject object = new MCUObject(itemHeal.name + ".obj",
                        RenderHealObj.class.getResourceAsStream("/assets/mcuniversal/obj/" + itemHeal.name + ".obj"));
                object.renderAll();
            } catch (RuntimeException ex) {
                System.err.println("Item name: " + itemHeal.name);
                throw ex;
            }
            GL11.glEndList();
            RenderHealObj._displayLists_dont_touch.put(itemHeal, n2);
        }
        return n2;
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return type == ItemRenderType.EQUIPPED_FIRST_PERSON || type == ItemRenderType.EQUIPPED || type == ItemRenderType.ENTITY;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        final ItemHeal itemHeal = (ItemHeal) item.getItem();
        if (item != null) {
            final ResourceLocation resourceLocation = ItemHeal.textures.get(itemHeal.name);
            if (resourceLocation != null && type == ItemRenderType.EQUIPPED_FIRST_PERSON) {
                GL11.glEnable(32826);
                Minecraft.getMinecraft().renderEngine.bindTexture(resourceLocation);
                final String name = ((ItemHeal) item.getItem()).name;
                switch (name) {
                    case "firstAidKit":
                    case "firstAidKit_b": {
                        GL11.glPushMatrix();
                        GL11.glTranslated(2.2, 1.1, 1.5);
                        GL11.glRotatef(50.0f, 0.0f, 1.0f, 0.0f);
                        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
                        GL11.glRotatef(25.0f, 1.0f, 0.0f, 0.0f);
                        GL11.glScalef(1.9f, 1.9f, 1.9f);
                        GL11.glCallList(getDisplayListId((ItemHeal) item.getItem()));
                        GL11.glPopMatrix();
                        break;
                    }
                    case "small_firstAidKit": {
                        GL11.glPushMatrix();
                        GL11.glTranslated(1.0, 2.3, 1.0);
                        GL11.glRotatef(70.0f, 0.0f, 1.0f, 0.0f);
                        GL11.glRotatef(60.0f, 1.0f, 0.0f, 0.0f);
                        GL11.glCullFace(1028);
                        GL11.glScalef(3.0f, 3.0f, -3.0f);
                        GL11.glCallList(getDisplayListId((ItemHeal) item.getItem()));
                        GL11.glCullFace(1029);
                        GL11.glPopMatrix();
                        break;
                    }
                    case "pills": {
                        GL11.glPushMatrix();
                        GL11.glTranslated(0.98, 0.5, 0.25);
                        GL11.glRotatef(-20.0f, 0.0f, 1.0f, 0.0f);
                        GL11.glRotatef(-80.0f, 0.0f, 0.0f, 1.0f);
                        GL11.glRotatef(-10.0f, 1.0f, 0.0f, 0.0f);
                        GL11.glCullFace(1028);
                        GL11.glScalef(2.5f, 2.5f, -2.5f);
                        GL11.glCallList(getDisplayListId((ItemHeal) item.getItem()));
                        GL11.glCullFace(1029);
                        GL11.glPopMatrix();
                        break;
                    }
                }
            } else if (type == ItemRenderType.EQUIPPED) {
                GL11.glEnable(32826);
                Minecraft.getMinecraft().renderEngine.bindTexture(resourceLocation);
                final String name2 = ((ItemHeal) item.getItem()).name;
                switch (name2) {
                    case "firstAidKit":
                    case "firstAidKit_b": {
                        GL11.glPushMatrix();
                        GL11.glRotatef(-90.0f, 0.0f, 0.0f, 1.0f);
                        GL11.glRotatef(-90.0f, 0.0f, 1.0f, 0.0f);
                        GL11.glTranslated(0.0, 0.6800000071525574, 1.3600000143051147);
                        GL11.glScalef(1.0f, 1.0f, 1.0f);
                        GL11.glCallList(getDisplayListId((ItemHeal) item.getItem()));
                        GL11.glPopMatrix();
                        break;
                    }
                    case "pills": {
                        GL11.glPushMatrix();
                        GL11.glRotatef(-100.0f, 0.0f, 0.0f, 1.0f);
                        GL11.glTranslated(-0.5799999833106995, 0.7200000286102295, -0.019999999552965164);
                        GL11.glScalef(1.0f, 1.0f, 1.0f);
                        GL11.glCallList(getDisplayListId((ItemHeal) item.getItem()));
                        GL11.glPopMatrix();
                        break;
                    }
                    case "small_firstAidKit": {
                        GL11.glPushMatrix();
                        GL11.glRotatef(-90.0f, 0.0f, 0.0f, 1.0f);
                        GL11.glRotatef(-90.0f, 0.0f, 1.0f, 0.0f);
                        GL11.glTranslated(0.0, 0.6800000071525574, 1.2599999904632568);
                        GL11.glScalef(1.0f, 1.0f, 1.0f);
                        GL11.glCallList(getDisplayListId((ItemHeal) item.getItem()));
                        GL11.glPopMatrix();
                        break;
                    }
                }
            } else if (type == ItemRenderType.ENTITY) {
                final float rotationYaw = ((EntityItem) data[1]).rotationYaw;
                GL11.glEnable(32826);
                Minecraft.getMinecraft().renderEngine.bindTexture(resourceLocation);
                final String name3 = ((ItemHeal) item.getItem()).name;
                switch (name3) {
                    case "firstAidKit":
                    case "firstAidKit_b": {
                        GL11.glPushMatrix();
                        GL11.glRotatef(rotationYaw, 0.0f, -1.0f, 0.0f);
                        GL11.glTranslated(0.0, 0.20000000298023224, 2.0);
                        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
                        GL11.glScalef(2.5f, 2.5f, 2.5f);
                        GL11.glCallList(getDisplayListId((ItemHeal) item.getItem()));
                        GL11.glPopMatrix();
                        break;
                    }
                    case "small_firstAidKit": {
                        GL11.glPushMatrix();
                        GL11.glRotatef(rotationYaw, 0.0f, -1.0f, 0.0f);
                        GL11.glTranslated(0.0, -0.25, -2.0);
                        GL11.glCullFace(1028);
                        GL11.glScalef(2.5f, 2.5f, -2.5f);
                        GL11.glCallList(getDisplayListId((ItemHeal) item.getItem()));
                        GL11.glCullFace(1029);
                        GL11.glPopMatrix();
                        break;
                    }
                    case "pills": {
                        GL11.glPushMatrix();
                        GL11.glRotatef(rotationYaw, 0.0f, -1.0f, 0.0f);
                        GL11.glCullFace(1028);
                        GL11.glScalef(2.5f, 2.5f, -2.5f);
                        GL11.glCallList(getDisplayListId((ItemHeal) item.getItem()));
                        GL11.glCullFace(1029);
                        GL11.glPopMatrix();
                        break;
                    }
                }
            }
        }
    }
}
