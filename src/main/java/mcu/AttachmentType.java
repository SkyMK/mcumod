package com.flansmod.common.guns;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.util.ArrayList;
import java.util.Iterator;

public class AttachmentType extends InfoType implements IScope {

    public static ArrayList attachments = new ArrayList();
    public EnumAttachmentType type;
    public boolean silencer;
    public boolean flashlight;
    public float flashlightRange;
    public int flashlightStrength;
    public float spreadMultiplier;
    public float recoilMultiplier;
    public float damageMultiplier;
    public float meleeDamageMultiplier;
    public float bulletSpeedMultiplier;
    public float reloadTimeMultiplier;
    public EnumFireMode modeOverride;
    public float zoomLevel;
    public float yOffset;
    public float FOVZoomLevel;
    public String zoomOverlay;
    public boolean hasScopeOverlay;
    @SideOnly(Side.CLIENT)
    public ModelAttachment model;
    public float modelScale;
    public int maxStackSize;
    public boolean bipod;

    public AttachmentType(TypeFile file) {
        super(file);
        this.type = EnumAttachmentType.generic;
        this.silencer = false;
        this.flashlight = false;
        this.flashlightRange = 10.0F;
        this.flashlightStrength = 12;
        this.spreadMultiplier = 1.0F;
        this.recoilMultiplier = 1.0F;
        this.damageMultiplier = 1.0F;
        this.meleeDamageMultiplier = 1.0F;
        this.bulletSpeedMultiplier = 1.0F;
        this.reloadTimeMultiplier = 1.0F;
        this.modeOverride = null;
        this.zoomLevel = 1.0F;
        this.FOVZoomLevel = 1.0F;
        this.hasScopeOverlay = false;
        this.modelScale = 1.0F;
        this.maxStackSize = 1;
        attachments.add(this);
    }

    public static AttachmentType getFromNBT(NBTTagCompound tags) {
        ItemStack stack = ItemStack.loadItemStackFromNBT(tags);
        return stack != null && stack.getItem() instanceof ItemAttachment ? ((ItemAttachment) stack.getItem()).type
                : null;
    }

    public static AttachmentType getAttachment(String s) {
        Iterator var1 = attachments.iterator();

        AttachmentType attachment;
        do {
            if (!var1.hasNext()) {
                return null;
            }

            attachment = (AttachmentType) var1.next();
        } while (!attachment.shortName.equals(s));

        return attachment;
    }

    protected void read(String[] split, TypeFile file) {
        super.read(split, file);

        try {
            if (split[0].equals("ModelScale")) {
                this.modelScale = Float.parseFloat(split[1]);
            }
            if (split[0].equals("Bipod")) {
                this.bipod = Boolean.valueOf(split[1]);
            }
            if (split[0].equals("yOffset")) {
                this.yOffset = Float.parseFloat(split[1]);
            }
            if (split[0].equals("AttachmentType")) {
                this.type = EnumAttachmentType.get(split[1]);
            } else if (FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model")) {
                this.model = (ModelAttachment) FlansMod.proxy.loadModel(split[1], super.shortName,
                        ModelAttachment.class);
            } else if (split[0].equals("ModelScale")) {
                this.modelScale = Float.parseFloat(split[1]);
            } else if (split[0].equals("Texture")) {
                super.texture = split[1];
            } else if (split[0].equals("Silencer")) {
                this.silencer = Boolean.parseBoolean(split[1].toLowerCase());
            } else if (split[0].equals("Flashlight")) {
                this.flashlight = Boolean.parseBoolean(split[1].toLowerCase());
            } else if (split[0].equals("FlashlightRange")) {
                this.flashlightRange = Float.parseFloat(split[1]);
            } else if (split[0].equals("FlashlightStrength")) {
                this.flashlightStrength = Integer.parseInt(split[1]);
            } else if (split[0].equals("ModeOverride")) {
                this.modeOverride = EnumFireMode.getFireMode(split[1]);
            } else if (split[0].equals("MeleeDamageMultiplier")) {
                this.meleeDamageMultiplier = Float.parseFloat(split[1]);
            } else if (split[0].equals("DamageMultiplier")) {
                this.damageMultiplier = Float.parseFloat(split[1]);
            } else if (split[0].equals("SpreadMultiplier")) {
                this.spreadMultiplier = Float.parseFloat(split[1]);
            } else if (split[0].equals("RecoilMultiplier")) {
                this.recoilMultiplier = Float.parseFloat(split[1]);
            } else if (split[0].equals("BulletSpeedMultiplier")) {
                this.bulletSpeedMultiplier = Float.parseFloat(split[1]);
            } else if (split[0].equals("ReloadTimeMultiplier")) {
                this.reloadTimeMultiplier = Float.parseFloat(split[1]);
            } else if (split[0].equals("ZoomLevel")) {
                this.zoomLevel = Float.parseFloat(split[1]);
            } else if (split[0].equals("FOVZoomLevel")) {
                this.FOVZoomLevel = Float.parseFloat(split[1]);
            } else if (split[0].equals("ZoomOverlay")) {
                this.hasScopeOverlay = true;
                if (split[1].equals("None")) {
                    this.hasScopeOverlay = false;
                } else {
                    this.zoomOverlay = split[1];
                }
            }
        } catch (Exception var4) {
            System.out.println("Reading attachment file failed.");
            if (FlansMod.printStackTrace) {
                var4.printStackTrace();
            }
        }

    }

    public void reloadModel() {
        this.model = (ModelAttachment) FlansMod.proxy.loadModel(super.modelString, super.shortName,
                ModelAttachment.class);
    }

    public float getZoomFactor() {
        return this.zoomLevel;
    }

    public boolean hasZoomOverlay() {
        return this.hasScopeOverlay;
    }

    public String getZoomOverlay() {
        return this.zoomOverlay;
    }

    public float getFOVFactor() {
        return this.FOVZoomLevel;
    }

}
