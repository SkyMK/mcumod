package com.flansmod.common.driveables;

import com.flansmod.client.model.ModelDriveable;
import com.flansmod.client.model.ModelPlane;
import com.flansmod.common.FlansMod;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.Iterator;

public class PlaneType extends DriveableType {

    public static ArrayList types = new ArrayList();
    public EnumPlaneMode mode;
    public float lookDownModifier;
    public float lookUpModifier;
    public float rollLeftModifier;
    public float rollRightModifier;
    public float turnLeftModifier;
    public float turnRightModifier;
    public float lift;
    public Vector3f bombPosition;
    public int planeShootDelay;
    public int planeBombDelay;
    public ArrayList propellers;
    public ArrayList heliPropellers;
    public ArrayList heliTailPropellers;
    public boolean hasGear;
    public boolean hasDoor;
    public boolean hasWing;
    public float restingPitch;
    public boolean invInflight;
    public boolean hasFlare;
    public int flareDelay;
    public String flareSound;
    public int timeFlareUsing;

    public PlaneType(TypeFile file) {
        super(file);
        this.mode = EnumPlaneMode.PLANE;
        this.lookDownModifier = 1.0F;
        this.lookUpModifier = 1.0F;
        this.rollLeftModifier = 1.0F;
        this.rollRightModifier = 1.0F;
        this.turnLeftModifier = 1.0F;
        this.turnRightModifier = 1.0F;
        this.lift = 1.0F;
        this.propellers = new ArrayList();
        this.heliPropellers = new ArrayList();
        this.heliTailPropellers = new ArrayList();
        this.hasGear = false;
        this.hasDoor = false;
        this.hasWing = false;
        this.restingPitch = 0.0F;
        this.invInflight = true;
        this.hasFlare = false;
        this.flareDelay = 200;
        this.flareSound = "";
        this.timeFlareUsing = 5;
        types.add(this);
    }

    public static PlaneType getPlane(String find) {
        Iterator var1 = types.iterator();

        PlaneType type;
        do {
            if (!var1.hasNext()) {
                return null;
            }

            type = (PlaneType) var1.next();
        } while (!type.shortName.equals(find));

        return type;
    }

    public void preRead(TypeFile file) {
        super.preRead(file);
    }

    protected void read(String[] split, TypeFile file) {
        super.read(split, file);

        try {
            if (split[0].equals("Mode")) {
                this.mode = EnumPlaneMode.getMode(split[1]);
            }

            if (split[0].equals("TurnLeftSpeed")) {
                this.turnLeftModifier = Float.parseFloat(split[1]);
            }

            if (split[0].equals("TurnRightSpeed")) {
                this.turnRightModifier = Float.parseFloat(split[1]);
            }

            if (split[0].equals("LookUpSpeed")) {
                this.lookUpModifier = Float.parseFloat(split[1]);
            }

            if (split[0].equals("LookDownSpeed")) {
                this.lookDownModifier = Float.parseFloat(split[1]);
            }

            if (split[0].equals("RollLeftSpeed")) {
                this.rollLeftModifier = Float.parseFloat(split[1]);
            }

            if (split[0].equals("RollRightSpeed")) {
                this.rollRightModifier = Float.parseFloat(split[1]);
            }

            if (split[0].equals("Lift")) {
                this.lift = Float.parseFloat(split[1]);
            }

            if (split[0].equals("ShootDelay")) {
                this.planeShootDelay = Integer.parseInt(split[1]);
            }

            if (split[0].equals("BombDelay")) {
                this.planeBombDelay = Integer.parseInt(split[1]);
            }

            Propeller propeller;
            if (split[0].equals("Propeller")) {
                propeller = new Propeller(Integer.parseInt(split[1]), Integer.parseInt(split[2]),
                        Integer.parseInt(split[3]), Integer.parseInt(split[4]), EnumDriveablePart.getPart(split[5]),
                        PartType.getPart(split[6]));
                this.propellers.add(propeller);
                super.recipe.add(new ItemStack(propeller.itemType.item));
            }

            if (split[0].equals("HeliPropeller")) {
                propeller = new Propeller(Integer.parseInt(split[1]), Integer.parseInt(split[2]),
                        Integer.parseInt(split[3]), Integer.parseInt(split[4]), EnumDriveablePart.getPart(split[5]),
                        PartType.getPart(split[6]));
                this.heliPropellers.add(propeller);
                super.recipe.add(new ItemStack(propeller.itemType.item));
            }

            if (split[0].equals("HeliTailPropeller")) {
                propeller = new Propeller(Integer.parseInt(split[1]), Integer.parseInt(split[2]),
                        Integer.parseInt(split[3]), Integer.parseInt(split[4]), EnumDriveablePart.getPart(split[5]),
                        PartType.getPart(split[6]));
                this.heliTailPropellers.add(propeller);
                super.recipe.add(new ItemStack(propeller.itemType.item));
            }

            if (split[0].equals("HasFlare")) {
                this.hasFlare = split[1].equals("True");
            }

            if (split[0].equals("FlareDelay")) {
                this.flareDelay = Integer.parseInt(split[1]);
                if (this.flareDelay <= 0) {
                    this.flareDelay = 1;
                }
            }

            if (split[0].equals("TimeFlareUsing")) {
                this.timeFlareUsing = Integer.parseInt(split[1]);
                if (this.timeFlareUsing <= 0) {
                    this.timeFlareUsing = 1;
                }
            }

            if (split[0].equals("PropSoundLength")) {
                super.engineSoundLength = Integer.parseInt(split[1]);
            }

            if (split[0].equals("PropSound")) {
                super.engineSound = split[1];
                FlansMod.proxy.loadSound(super.contentPack, "driveables", split[1]);
            }

            if (split[0].equals("ShootSound")) {
                super.shootSoundPrimary = split[1];
                FlansMod.proxy.loadSound(super.contentPack, "driveables", split[1]);
            }

            if (split[0].equals("BombSound")) {
                super.shootSoundSecondary = split[1];
                FlansMod.proxy.loadSound(super.contentPack, "driveables", split[1]);
            }

            if (split[0].equals("FlareSound")) {
                this.flareSound = split[1];
                FlansMod.proxy.loadSound(super.contentPack, "driveables", split[1]);
            }

            if (split[0].equals("HasGear")) {
                this.hasGear = split[1].equals("True");
            }

            if (split[0].equals("HasDoor")) {
                this.hasDoor = split[1].equals("True");
            }

            if (split[0].equals("HasWing")) {
                this.hasWing = split[1].equals("True");
            }

            if (split[0].equals("RestingPitch")) {
                this.restingPitch = Float.parseFloat(split[1]);
            }

            if (split[0].equals("InflightInventory")) {
                this.invInflight = split[1].equals("False");
            }
        } catch (Exception var4) {
        }

    }

    public int numEngines() {
        switch (this.mode) {
            case VTOL:
                return Math.max(this.propellers.size(), this.heliPropellers.size());
            case PLANE:
                return this.propellers.size();
            case HELI:
                return this.heliPropellers.size();
            default:
                return 1;
        }
    }

    public ArrayList getItemsRequired(DriveablePart part, PartType engine) {
        ArrayList stacks = super.getItemsRequired(part, engine);
        Iterator var4 = this.propellers.iterator();

        while (var4.hasNext()) {
            Propeller propeller = (Propeller) var4.next();
            if (propeller.planePart == part.type) {
                stacks.add(new ItemStack(propeller.itemType.item));
                stacks.add(new ItemStack(engine.item));
            }
        }

        return stacks;
    }

    public void reloadModel() {
        super.model = (ModelDriveable) FlansMod.proxy.loadModel(super.modelString, super.shortName, ModelPlane.class);
    }

}
