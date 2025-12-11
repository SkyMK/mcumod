package com.flansmod.common.driveables;

import com.flansmod.client.model.ModelDriveable;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.vector.Vector3f;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class DriveableType extends InfoType {

    public static ArrayList types = new ArrayList();
    @SideOnly(Side.CLIENT)
    public ModelDriveable model;
    public HashMap health = new HashMap();
    public HashMap partwiseRecipe = new HashMap();
    public ArrayList recipe = new ArrayList();
    public boolean acceptAllAmmo = true;
    public List ammo = new ArrayList();
    public boolean harvestBlocks = false;
    public ArrayList materialsHarvested = new ArrayList();
    public float fallDamageFactor = 1.0F;
    public EnumWeaponType primary;
    public EnumWeaponType secondary;
    public boolean alternatePrimary;
    public boolean alternateSecondary;
    public int shootDelayPrimary;
    public int shootDelaySecondary;
    public EnumFireMode modePrimary;
    public EnumFireMode modeSecondary;
    public String shootSoundPrimary;
    public String shootSoundSecondary;
    public ArrayList shootPointsPrimary;
    public ArrayList shootPointsSecondary;
    public ArrayList pilotGuns;
    public int reloadTimePrimary;
    public int reloadTimeSecondary;
    public String reloadSoundPrimary;
    public String reloadSoundSecondary;
    public int placeTimePrimary;
    public int placeTimeSecondary;
    public String placeSoundPrimary;
    public String placeSoundSecondary;
    public int numPassengers;
    public Seat[] seats;
    public int numPassengerGunners;
    public ArrayList shootParticlesPrimary;
    public ArrayList shootParticlesSecondary;
    public int numCargoSlots;
    public int numBombSlots;
    public int numMissileSlots;
    public int fuelTankSize;
    public float yOffset;
    public float cameraDistance;
    public ArrayList emitters;
    public float maxThrottle;
    public float maxNegativeThrottle;
    public Vector3f turretOrigin;
    public Vector3f turretOriginOffset;
    public DriveablePosition[] wheelPositions;
    public float wheelSpringStrength;
    public float wheelStepHeight;
    public boolean canRoll;
    public ArrayList collisionPoints;
    public float drag;
    public boolean floatOnWater;
    public boolean placeableOnLand;
    public boolean placeableOnWater;
    public boolean placeableOnSponge;
    public float buoyancy;
    public float floatOffset;
    public float bulletDetectionRadius;
    public boolean onRadar;
    public int animFrames;
    public int startSoundRange;
    public String startSound;
    public int startSoundLength;
    public int engineSoundRange;
    public String engineSound;
    public int engineSoundLength;
    public int backSoundRange;
    public String backSound;
    public int backSoundLength;
    public boolean collisionDamageEnable;
    public float collisionDamageThrottle;
    public float collisionDamageTimes;
    public boolean enableReloadTime;
    public boolean canMountEntity;
    public float bulletSpread;
    public float bulletSpeed;
    public boolean isExplosionWhenDestroyed;
    public String lockedOnSound;
    public int soundTime;
    public int canLockOnAngle;
    public int lockOnSoundTime;
    public String lockOnSound;
    public int maxRangeLockOn;
    public int lockedOnSoundRange;
    public String lockingOnSound;
    public boolean lockOnToPlanes;
    public boolean lockOnToVehicles;
    public boolean lockOnToMechas;
    public boolean lockOnToPlayers;
    public boolean lockOnToLivings;

    public DriveableType(TypeFile file) {
        super(file);
        this.primary = EnumWeaponType.NONE;
        this.secondary = EnumWeaponType.NONE;
        this.alternatePrimary = false;
        this.alternateSecondary = false;
        this.shootDelayPrimary = 1;
        this.shootDelaySecondary = 1;
        this.modePrimary = EnumFireMode.FULLAUTO;
        this.modeSecondary = EnumFireMode.FULLAUTO;
        this.shootPointsPrimary = new ArrayList();
        this.shootPointsSecondary = new ArrayList();
        this.pilotGuns = new ArrayList();
        this.reloadTimePrimary = 0;
        this.reloadTimeSecondary = 0;
        this.reloadSoundPrimary = "";
        this.reloadSoundSecondary = "";
        this.placeTimePrimary = 5;
        this.placeTimeSecondary = 5;
        this.placeSoundPrimary = "";
        this.placeSoundSecondary = "";
        this.numPassengers = 0;
        this.numPassengerGunners = 0;
        this.shootParticlesPrimary = new ArrayList();
        this.shootParticlesSecondary = new ArrayList();
        this.fuelTankSize = 100;
        this.yOffset = 0.625F;
        this.cameraDistance = 5.0F;
        this.emitters = new ArrayList();
        this.maxThrottle = 1.0F;
        this.maxNegativeThrottle = 0.0F;
        this.turretOrigin = new Vector3f();
        this.turretOriginOffset = new Vector3f();
        this.wheelPositions = new DriveablePosition[0];
        this.wheelSpringStrength = 0.5F;
        this.wheelStepHeight = 1.0F;
        this.canRoll = false;
        this.collisionPoints = new ArrayList();
        this.drag = 1.0F;
        this.floatOnWater = false;
        this.placeableOnLand = true;
        this.placeableOnWater = false;
        this.placeableOnSponge = false;
        this.buoyancy = 0.0165F;
        this.floatOffset = 0.0F;
        this.bulletDetectionRadius = 5.0F;
        this.onRadar = false;
        this.animFrames = 2;
        this.startSoundRange = 50;
        this.startSound = "";
        this.engineSoundRange = 50;
        this.engineSound = "";
        this.backSoundRange = 50;
        this.backSound = "";
        this.collisionDamageEnable = false;
        this.collisionDamageThrottle = 0.0F;
        this.collisionDamageTimes = 0.0F;
        this.enableReloadTime = false;
        this.canMountEntity = false;
        this.bulletSpread = 0.0F;
        this.bulletSpeed = 3.0F;
        this.isExplosionWhenDestroyed = false;
        this.lockedOnSound = "";
        this.soundTime = 0;
        this.canLockOnAngle = 10;
        this.lockOnSoundTime = 60;
        this.lockOnSound = "";
        this.maxRangeLockOn = 500;
        this.lockedOnSoundRange = 5;
        this.lockingOnSound = "";
        this.lockOnToPlanes = false;
        this.lockOnToVehicles = false;
        this.lockOnToMechas = false;
        this.lockOnToPlayers = false;
        this.lockOnToLivings = false;
    }

    public static DriveableType getDriveable(String find) {
        Iterator var1 = types.iterator();

        DriveableType type;
        do {
            if (!var1.hasNext()) {
                return null;
            }

            type = (DriveableType) var1.next();
        } while (!type.shortName.equals(find));

        return type;
    }

    public void preRead(TypeFile file) {
        super.preRead(file);
        Iterator var2 = file.lines.iterator();

        String line;
        String[] split;
        while (var2.hasNext()) {
            line = (String) var2.next();
            if (line == null) {
                break;
            }

            if (!line.startsWith("//")) {
                split = line.split(" ");
                if (split.length >= 2 && split[0].equals("Passengers")) {
                    this.numPassengers = Integer.parseInt(split[1]);
                    this.seats = new Seat[this.numPassengers + 1];
                    break;
                }
            }
        }

        var2 = file.lines.iterator();

        while (var2.hasNext()) {
            line = (String) var2.next();
            if (line == null) {
                break;
            }

            if (!line.startsWith("//")) {
                split = line.split(" ");
                if (split.length >= 2 && split[0].equals("NumWheels")) {
                    this.wheelPositions = new DriveablePosition[Integer.parseInt(split[1])];
                    break;
                }
            }
        }

        types.add(this);
    }

    protected void read(String[] split, TypeFile file) {
        super.read(split, file);

        int amount;
        String s;
        try {
            if (FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model")) {
                this.model = (ModelDriveable) FlansMod.proxy.loadModel(split[1], super.shortName, ModelDriveable.class);
            } else if (split[0].equals("Texture")) {
                super.texture = split[1];
            } else if (split[0].equals("IsExplosionWhenDestroyed")) {
                this.isExplosionWhenDestroyed = Boolean.parseBoolean(split[1]);
            } else if (split[0].equals("FallDamageFactor")) {
                this.fallDamageFactor = Float.parseFloat(split[1]);
            } else if (split[0].equals("MaxThrottle")) {
                this.maxThrottle = Float.parseFloat(split[1]);
            } else if (split[0].equals("MaxNegativeThrottle")) {
                this.maxNegativeThrottle = Float.parseFloat(split[1]);
            } else if (split[0].equals("Drag")) {
                this.drag = Float.parseFloat(split[1]);
            } else if (split[0].equals("TurretOrigin")) {
                this.turretOrigin = new Vector3f(Float.parseFloat(split[1]) / 16.0F, Float.parseFloat(split[2]) / 16.0F,
                        Float.parseFloat(split[3]) / 16.0F);
            } else if (split[0].equals("TurretOriginOffset")) {
                this.turretOriginOffset = new Vector3f(Float.parseFloat(split[1]) / 16.0F,
                        Float.parseFloat(split[2]) / 16.0F, Float.parseFloat(split[3]) / 16.0F);
            } else if (!split[0].equals("CollisionPoint") && !split[0].equals("AddCollisionPoint")) {
                if (split[0].equals("CollisionDamageEnable")) {
                    this.collisionDamageEnable = Boolean.parseBoolean(split[1]);
                } else if (split[0].equals("CollisionDamageThrottle")) {
                    this.collisionDamageThrottle = Float.parseFloat(split[1]);
                } else if (split[0].equals("CollisionDamageTimes")) {
                    this.collisionDamageTimes = Float.parseFloat(split[1]);
                } else if (split[0].equals("CanLockAngle")) {
                    this.canLockOnAngle = Integer.parseInt(split[1]);
                } else if (split[0].equals("LockOnSoundTime")) {
                    this.lockOnSoundTime = Integer.parseInt(split[1]);
                } else if (split[0].equals("LockOnToDriveables")) {
                    this.lockOnToPlanes = this.lockOnToVehicles = this.lockOnToMechas = Boolean
                            .parseBoolean(split[1].toLowerCase());
                } else if (split[0].equals("LockOnToVehicles")) {
                    this.lockOnToVehicles = Boolean.parseBoolean(split[1].toLowerCase());
                } else if (split[0].equals("LockOnToPlanes")) {
                    this.lockOnToPlanes = Boolean.parseBoolean(split[1].toLowerCase());
                } else if (split[0].equals("LockOnToMechas")) {
                    this.lockOnToMechas = Boolean.parseBoolean(split[1].toLowerCase());
                } else if (split[0].equals("LockOnToPlayers")) {
                    this.lockOnToPlayers = Boolean.parseBoolean(split[1].toLowerCase());
                } else if (split[0].equals("LockOnToLivings")) {
                    this.lockOnToLivings = Boolean.parseBoolean(split[1].toLowerCase());
                } else if (split[0].equals("LockedOnSoundRange")) {
                    this.lockedOnSoundRange = Integer.parseInt(split[1]);
                } else if (split[0].equals("CanRoll")) {
                    this.canRoll = Boolean.parseBoolean(split[1]);
                } else if (split[0].equals("PlaceableOnLand")) {
                    this.placeableOnLand = Boolean.parseBoolean(split[1]);
                } else if (split[0].equals("PlaceableOnWater")) {
                    this.placeableOnWater = Boolean.parseBoolean(split[1]);
                } else if (split[0].equals("PlaceableOnSponge")) {
                    this.placeableOnSponge = Boolean.parseBoolean(split[1]);
                } else if (split[0].equals("FloatOnWater")) {
                    this.floatOnWater = Boolean.parseBoolean(split[1]);
                } else if (split[0].equals("Boat")) {
                    this.placeableOnLand = false;
                    this.placeableOnWater = true;
                    this.floatOnWater = true;
                    this.wheelStepHeight = 0.0F;
                } else if (split[0].equals("Buoyancy")) {
                    this.buoyancy = Float.parseFloat(split[1]);
                } else if (split[0].equals("FloatOffset")) {
                    this.floatOffset = Float.parseFloat(split[1]);
                } else if (split[0].equals("CanMountEntity")) {
                    this.canMountEntity = Boolean.parseBoolean(split[1]);
                } else if (!split[0].equals("Wheel") && !split[0].equals("WheelPosition")) {
                    if (!split[0].equals("WheelRadius") && !split[0].equals("WheelStepHeight")) {
                        if (!split[0].equals("WheelSpringStrength") && !split[0].equals("SpringStrength")) {
                            if (split[0].equals("TrackFrames")) {
                                this.animFrames = Integer.parseInt(split[1]) - 1;
                            } else if (split[0].equals("Harvester")) {
                                this.harvestBlocks = Boolean.parseBoolean(split[1]);
                            } else if (split[0].equals("HarvestMaterial")) {
                                this.materialsHarvested.add(getMaterial(split[1]));
                            } else if (split[0].equals("HarvestToolType")) {
                                if (split[1].equals("Axe")) {
                                    this.materialsHarvested.add(Material.wood);
                                    this.materialsHarvested.add(Material.plants);
                                    this.materialsHarvested.add(Material.vine);
                                } else if (!split[1].equals("Pickaxe") && !split[1].equals("Drill")) {
                                    if (!split[1].equals("Spade") && !split[1].equals("Shovel")
                                            && !split[1].equals("Excavator")) {
                                        if (split[1].equals("Hoe") || split[1].equals("Combine")) {
                                            this.materialsHarvested.add(Material.plants);
                                            this.materialsHarvested.add(Material.leaves);
                                            this.materialsHarvested.add(Material.vine);
                                            this.materialsHarvested.add(Material.cactus);
                                            this.materialsHarvested.add(Material.gourd);
                                        }
                                    } else {
                                        this.materialsHarvested.add(Material.ground);
                                        this.materialsHarvested.add(Material.grass);
                                        this.materialsHarvested.add(Material.sand);
                                        this.materialsHarvested.add(Material.snow);
                                        this.materialsHarvested.add(Material.clay);
                                    }
                                } else {
                                    this.materialsHarvested.add(Material.iron);
                                    this.materialsHarvested.add(Material.anvil);
                                    this.materialsHarvested.add(Material.rock);
                                }
                            } else if (split[0].equals("CargoSlots")) {
                                this.numCargoSlots = Integer.parseInt(split[1]);
                            } else if (!split[0].equals("BombSlots") && !split[0].equals("MineSlots")) {
                                if (!split[0].equals("MissileSlots") && !split[0].equals("ShellSlots")) {
                                    if (split[0].equals("FuelTankSize")) {
                                        this.fuelTankSize = Integer.parseInt(split[1]);
                                    } else if (split[0].equals("BulletDetection")) {
                                        this.bulletDetectionRadius = (float) Integer.parseInt(split[1]);
                                    } else if (split[0].equals("AddAmmo")) {
                                        this.ammo.add(BulletType.getBullet(split[1]));
                                    } else if (!split[0].equals("AllowAllAmmo") && !split[0].equals("AcceptAllAmmo")) {
                                        if (split[0].equals("Primary")) {
                                            this.primary = EnumWeaponType.valueOf(split[1].toUpperCase());
                                        } else if (split[0].equals("Secondary")) {
                                            this.secondary = EnumWeaponType.valueOf(split[1].toUpperCase());
                                        } else if (split[0].equals("ShootDelayPrimary")) {
                                            this.shootDelayPrimary = Integer.parseInt(split[1]);
                                        } else if (split[0].equals("ShootDelaySecondary")) {
                                            this.shootDelaySecondary = Integer.parseInt(split[1]);
                                        } else if (split[0].equals("PlaceTimePrimary")) {
                                            this.placeTimePrimary = Integer.parseInt(split[1]);
                                        } else if (split[0].equals("PlaceTimeSecondary")) {
                                            this.placeTimeSecondary = Integer.parseInt(split[1]);
                                        } else if (split[0].equals("ReloadTimePrimary")) {
                                            this.reloadTimePrimary = Integer.parseInt(split[1]);
                                        } else if (split[0].equals("ReloadTimeSecondary")) {
                                            this.reloadTimeSecondary = Integer.parseInt(split[1]);
                                        } else if (split[0].equals("AlternatePrimary")) {
                                            this.alternatePrimary = Boolean.parseBoolean(split[1]);
                                        } else if (split[0].equals("AlternateSecondary")) {
                                            this.alternateSecondary = Boolean.parseBoolean(split[1]);
                                        } else if (split[0].equals("ModePrimary")) {
                                            this.modePrimary = EnumFireMode.valueOf(split[1].toUpperCase());
                                        } else if (split[0].equals("ModeSecondary")) {
                                            this.modeSecondary = EnumFireMode.valueOf(split[1].toUpperCase());
                                        } else if (split[0].equals("BulletSpeed")) {
                                            this.bulletSpeed = Float.parseFloat(split[1]);
                                        } else if (split[0].equals("BulletSpread")) {
                                            this.bulletSpread = Float.parseFloat(split[1]);
                                        } else {
                                            DriveablePosition e;
                                            if (split[0].equals("ShootPointPrimary")) {
                                                e = this.getShootPoint(split);
                                                this.shootPointsPrimary.add(e);
                                                if (e instanceof PilotGun) {
                                                    this.pilotGuns.add(e);
                                                }
                                            } else if (split[0].equals("ShootPointSecondary")) {
                                                e = this.getShootPoint(split);
                                                this.shootPointsSecondary.add(e);
                                                if (e instanceof PilotGun) {
                                                    this.pilotGuns.add(e);
                                                }
                                            } else if (split[0].equals("EnableReloadTime")) {
                                                this.enableReloadTime = Boolean.parseBoolean(split[1]);
                                            } else if (split[0].equals("ShootParticlesPrimary")) {
                                                this.shootParticlesPrimary.add(new DriveableType.ShootParticle(split[1],
                                                        Float.valueOf(split[2]).floatValue(),
                                                        Float.valueOf(split[3]).floatValue(),
                                                        Float.valueOf(split[4]).floatValue()));
                                            } else if (split[0].equals("ShootParticlesSecondary")) {
                                                this.shootParticlesSecondary.add(new DriveableType.ShootParticle(
                                                        split[1], Float.valueOf(split[2]).floatValue(),
                                                        Float.valueOf(split[3]).floatValue(),
                                                        Float.valueOf(split[4]).floatValue()));
                                            } else if (split[0].equals("AddGun")) {
                                                this.secondary = EnumWeaponType.GUN;
                                                PilotGun var11 = (PilotGun) this.getShootPoint(split);
                                                this.shootPointsSecondary.add(var11);
                                                this.pilotGuns.add(var11);
                                                this.recipe.add(new ItemStack(var11.type.item));
                                            } else if (split[0].equals("BombPosition")) {
                                                this.primary = EnumWeaponType.BOMB;
                                                this.shootPointsPrimary.add(new DriveablePosition(
                                                        new Vector3f(Float.parseFloat(split[1]) / 16.0F,
                                                                Float.parseFloat(split[2]) / 16.0F,
                                                                Float.parseFloat(split[3]) / 16.0F),
                                                        EnumDriveablePart.core));
                                            } else if (split[0].equals("BarrelPosition")) {
                                                this.primary = EnumWeaponType.SHELL;
                                                this.shootPointsPrimary.add(new DriveablePosition(
                                                        new Vector3f(Float.parseFloat(split[1]) / 16.0F,
                                                                Float.parseFloat(split[2]) / 16.0F,
                                                                Float.parseFloat(split[3]) / 16.0F),
                                                        EnumDriveablePart.turret));
                                            } else if (split[0].equals("ShootDelay")) {
                                                this.shootDelaySecondary = Integer.parseInt(split[1]);
                                            } else if (!split[0].equals("ShellDelay")
                                                    && !split[0].equals("BombDelay")) {
                                                EnumDriveablePart var12;
                                                int var17;
                                                if (split[0].equals("AddRecipeParts")) {
                                                    var12 = EnumDriveablePart.getPart(split[1]);
                                                    ItemStack[] var14 = new ItemStack[(split.length - 2) / 2];

                                                    for (var17 = 0; var17 < (split.length - 2) / 2; ++var17) {
                                                        amount = Integer.parseInt(split[2 * var17 + 2]);
                                                        boolean var20 = split[2 * var17 + 3].contains(".");
                                                        s = var20 ? split[2 * var17 + 3].split("\\.")[0]
                                                                : split[2 * var17 + 3];
                                                        int damage = var20
                                                                ? Integer.parseInt(split[2 * var17 + 3].split("\\.")[1])
                                                                : 0;
                                                        var14[var17] = getRecipeElement(s, amount, damage,
                                                                super.shortName);
                                                        this.recipe.add(var14[var17]);
                                                    }

                                                    this.partwiseRecipe.put(var12, var14);
                                                } else if (split[0].equals("AddDye")) {
                                                    int var13 = Integer.parseInt(split[1]);
                                                    int var15 = -1;

                                                    for (var17 = 0; var17 < ItemDye.field_150923_a.length; ++var17) {
                                                        if (ItemDye.field_150923_a[var17].equals(split[2])) {
                                                            var15 = var17;
                                                        }
                                                    }

                                                    if (var15 == -1) {
                                                        FlansMod.log("Failed to find dye colour : " + split[2]
                                                                + " while adding " + file.name);
                                                        return;
                                                    }

                                                    this.recipe.add(new ItemStack(Items.dye, var13, var15));
                                                } else if (split[0].equals("SetupPart")) {
                                                    var12 = EnumDriveablePart.getPart(split[1]);
                                                    CollisionBox var19 = new CollisionBox(Integer.parseInt(split[2]),
                                                            Integer.parseInt(split[3]), Integer.parseInt(split[4]),
                                                            Integer.parseInt(split[5]), Integer.parseInt(split[6]),
                                                            Integer.parseInt(split[7]), Integer.parseInt(split[8]));
                                                    this.health.put(var12, var19);
                                                } else if (!split[0].equals("Driver") && !split[0].equals("Pilot")) {
                                                    if (split[0].equals("RotatedDriverOffset")) {
                                                        this.seats[0].rotatedOffset = new Vector3f(
                                                                (float) Integer.parseInt(split[1]) / 16.0F,
                                                                (float) Integer.parseInt(split[2]) / 16.0F,
                                                                (float) Integer.parseInt(split[3]) / 16.0F);
                                                    } else if (split[0].equals("RotatedPassengerOffset")) {
                                                        this.seats[Integer
                                                                .parseInt(split[1])].rotatedOffset = new Vector3f(
                                                                (float) Integer.parseInt(split[2]) / 16.0F,
                                                                (float) Integer.parseInt(split[3]) / 16.0F,
                                                                (float) Integer.parseInt(split[4]) / 16.0F);
                                                    } else if (split[0].equals("DriverAimSpeed")) {
                                                        this.seats[0].aimingSpeed = new Vector3f(
                                                                Float.parseFloat(split[1]), Float.parseFloat(split[2]),
                                                                Float.parseFloat(split[3]));
                                                    } else if (split[0].equals("PassengerAimSpeed")) {
                                                        this.seats[Integer
                                                                .parseInt(split[1])].aimingSpeed = new Vector3f(
                                                                Float.parseFloat(split[2]),
                                                                Float.parseFloat(split[3]),
                                                                Float.parseFloat(split[4]));
                                                    } else if (split[0].equals("DriverLegacyAiming")) {
                                                        this.seats[0].legacyAiming = Boolean.parseBoolean(split[1]);
                                                    } else if (split[0].equals("PassengerLegacyAiming")) {
                                                        this.seats[Integer.parseInt(split[1])].legacyAiming = Boolean
                                                                .parseBoolean(split[2]);
                                                    } else if (split[0].equals("DriverYawBeforePitch")) {
                                                        this.seats[0].yawBeforePitch = Boolean.parseBoolean(split[1]);
                                                    } else if (split[0].equals("PassengerYawBeforePitch")) {
                                                        this.seats[Integer.parseInt(split[1])].yawBeforePitch = Boolean
                                                                .parseBoolean(split[2]);
                                                    } else if (split[0].equals("DriverLatePitch")) {
                                                        this.seats[0].latePitch = Boolean.parseBoolean(split[1]);
                                                    } else if (split[0].equals("PassengerLatePitch")) {
                                                        this.seats[Integer.parseInt(split[1])].latePitch = Boolean
                                                                .parseBoolean(split[2]);
                                                    } else if (split[0].equals("DriverTraverseSounds")) {
                                                        this.seats[0].traverseSounds = Boolean.parseBoolean(split[1]);
                                                    } else if (split[0].equals("PassengerTraverseSounds")) {
                                                        this.seats[Integer.parseInt(split[1])].traverseSounds = Boolean
                                                                .parseBoolean(split[2]);
                                                    } else if (split[0].equals("Passenger")) {
                                                        Seat var16 = new Seat(split);
                                                        this.seats[var16.id] = var16;
                                                        if (var16.gunType != null) {
                                                            var16.gunnerID = this.numPassengerGunners++;
                                                            this.recipe.add(new ItemStack(var16.gunType.item));
                                                        }
                                                    } else if (split[0].equals("GunOrigin")) {
                                                        this.seats[Integer.parseInt(split[1])].gunOrigin = new Vector3f(
                                                                Float.parseFloat(split[2]) / 16.0F,
                                                                Float.parseFloat(split[3]) / 16.0F,
                                                                Float.parseFloat(split[4]) / 16.0F);
                                                    } else if (split[0].equals("YOffset")) {
                                                        this.yOffset = Float.parseFloat(split[1]);
                                                    } else if (split[0].equals("CameraDistance")) {
                                                        this.cameraDistance = Float.parseFloat(split[1]);
                                                    } else if (split[0].equals("StartSoundRange")) {
                                                        this.startSoundRange = Integer.parseInt(split[1]);
                                                    } else if (split[0].equals("StartSoundLength")) {
                                                        this.startSoundLength = Integer.parseInt(split[1]);
                                                    } else if (split[0].equals("EngineSoundRange")) {
                                                        this.engineSoundRange = Integer.parseInt(split[1]);
                                                    } else if (split[0].equals("EngineSoundLength")) {
                                                        this.engineSoundLength = Integer.parseInt(split[1]);
                                                    } else if (split[0].equals("BackSoundRange")) {
                                                        this.backSoundRange = Integer.parseInt(split[1]);
                                                    } else if (split[0].equals("BackSoundLength")) {
                                                        this.backSoundLength = Integer.parseInt(split[1]);
                                                    } else if (split[0].equals("SoundTime")) {
                                                        this.soundTime = Integer.parseInt(split[1]);
                                                    } else if (split[0].equals("YawSoundLength")) {
                                                        this.seats[0].yawSoundLength = Integer.parseInt(split[1]);
                                                    } else if (split[0].equals("PitchSoundLength")) {
                                                        this.seats[0].pitchSoundLength = Integer.parseInt(split[1]);
                                                    } else if (split[0].equals("PassengerYawSoundLength")) {
                                                        this.seats[Integer.parseInt(split[1])].yawSoundLength = Integer
                                                                .parseInt(split[2]);
                                                    } else if (split[0].equals("PassengerPitchSoundLength")) {
                                                        this.seats[Integer
                                                                .parseInt(split[1])].pitchSoundLength = Integer
                                                                .parseInt(split[2]);
                                                    } else if (split[0].equals("StartSound")) {
                                                        this.startSound = split[1];
                                                        FlansMod.proxy.loadSound(super.contentPack, "driveables",
                                                                split[1]);
                                                    } else if (split[0].equals("EngineSound")) {
                                                        this.engineSound = split[1];
                                                        FlansMod.proxy.loadSound(super.contentPack, "driveables",
                                                                split[1]);
                                                    } else if (split[0].equals("BackSound")) {
                                                        this.backSound = split[1];
                                                        FlansMod.proxy.loadSound(super.contentPack, "driveables",
                                                                split[1]);
                                                    } else if (split[0].equals("YawSound")) {
                                                        this.seats[0].yawSound = split[1];
                                                        FlansMod.proxy.loadSound(super.contentPack, "driveables",
                                                                split[1]);
                                                    } else if (split[0].equals("PitchSound")) {
                                                        this.seats[0].pitchSound = split[1];
                                                        FlansMod.proxy.loadSound(super.contentPack, "driveables",
                                                                split[1]);
                                                    } else if (split[0].equals("PassengerYawSound")) {
                                                        this.seats[Integer.parseInt(split[1])].yawSound = split[2];
                                                        FlansMod.proxy.loadSound(super.contentPack, "driveables",
                                                                split[1]);
                                                    } else if (split[0].equals("PassengerPitchSound")) {
                                                        this.seats[Integer.parseInt(split[1])].pitchSound = split[2];
                                                        FlansMod.proxy.loadSound(super.contentPack, "driveables",
                                                                split[1]);
                                                    } else if (!split[0].equals("ShootMainSound")
                                                            && !split[0].equals("ShootSoundPrimary")
                                                            && !split[0].equals("ShellSound")
                                                            && !split[0].equals("BombSound")) {
                                                        if (!split[0].equals("ShootSecondarySound")
                                                                && !split[0].equals("ShootSoundSecondary")) {
                                                            if (split[0].equals("PlaceSoundPrimary")) {
                                                                this.placeSoundPrimary = split[1];
                                                                FlansMod.proxy.loadSound(super.contentPack,
                                                                        "driveables", split[1]);
                                                            } else if (split[0].equals("PlaceSoundSecondary")) {
                                                                this.placeSoundSecondary = split[1];
                                                                FlansMod.proxy.loadSound(super.contentPack,
                                                                        "driveables", split[1]);
                                                            } else if (split[0].equals("ReloadSoundPrimary")) {
                                                                this.reloadSoundPrimary = split[1];
                                                                FlansMod.proxy.loadSound(super.contentPack,
                                                                        "driveables", split[1]);
                                                            } else if (split[0].equals("ReloadSoundSecondary")) {
                                                                this.reloadSoundSecondary = split[1];
                                                                FlansMod.proxy.loadSound(super.contentPack,
                                                                        "driveables", split[1]);
                                                            } else if (split[0].equals("LockedOnSound")) {
                                                                this.lockedOnSound = split[1];
                                                                FlansMod.proxy.loadSound(super.contentPack,
                                                                        "driveables", split[1]);
                                                            } else if (split[0].equals("LockOnSound")) {
                                                                this.lockOnSound = split[1];
                                                                FlansMod.proxy.loadSound(super.contentPack, "guns",
                                                                        split[1]);
                                                            } else if (split[0].equals("LockingOnSound")) {
                                                                this.lockingOnSound = split[1];
                                                                FlansMod.proxy.loadSound(super.contentPack, "guns",
                                                                        split[1]);
                                                            } else if (split[0].equals("OnRadar")) {
                                                                this.onRadar = split[1].equals("True");
                                                            } else if (split[0].equalsIgnoreCase("AddParticle")
                                                                    || split[0].equalsIgnoreCase("AddEmitter")) {
                                                                DriveableType.ParticleEmitter var18 = new DriveableType.ParticleEmitter();
                                                                var18.effectType = split[1];
                                                                var18.emitRate = Integer.parseInt(split[2]);
                                                                var18.origin = new Vector3f(split[3], super.shortName);
                                                                var18.extents = new Vector3f(split[4], super.shortName);
                                                                var18.velocity = new Vector3f(split[5],
                                                                        super.shortName);
                                                                var18.minThrottle = Float.parseFloat(split[6]);
                                                                var18.maxThrottle = Float.parseFloat(split[7]);
                                                                var18.minHealth = Float.parseFloat(split[8]);
                                                                var18.maxHealth = Float.parseFloat(split[9]);
                                                                var18.part = split[10];
                                                                var18.origin.scale(0.0625F);
                                                                var18.extents.scale(0.0625F);
                                                                var18.velocity.scale(0.0625F);
                                                                this.emitters.add(var18);
                                                            }
                                                        } else {
                                                            this.shootSoundSecondary = split[1];
                                                            FlansMod.proxy.loadSound(super.contentPack, "driveables",
                                                                    split[1]);
                                                        }
                                                    } else {
                                                        this.shootSoundPrimary = split[1];
                                                        FlansMod.proxy.loadSound(super.contentPack, "driveables",
                                                                split[1]);
                                                    }
                                                } else if (split.length > 4) {
                                                    this.seats[0] = new Seat(Integer.parseInt(split[1]),
                                                            Integer.parseInt(split[2]), Integer.parseInt(split[3]),
                                                            Float.parseFloat(split[4]), Float.parseFloat(split[5]),
                                                            Float.parseFloat(split[6]), Float.parseFloat(split[7]));
                                                } else {
                                                    this.seats[0] = new Seat(Integer.parseInt(split[1]),
                                                            Integer.parseInt(split[2]), Integer.parseInt(split[3]));
                                                }
                                            } else {
                                                this.shootDelayPrimary = Integer.parseInt(split[1]);
                                            }
                                        }
                                    } else {
                                        this.acceptAllAmmo = Boolean.parseBoolean(split[1]);
                                    }
                                } else {
                                    this.numMissileSlots = Integer.parseInt(split[1]);
                                }
                            } else {
                                this.numBombSlots = Integer.parseInt(split[1]);
                            }
                        } else {
                            this.wheelSpringStrength = Float.parseFloat(split[1]);
                        }
                    } else {
                        this.wheelStepHeight = Float.parseFloat(split[1]);
                    }
                } else {
                    this.wheelPositions[Integer.parseInt(split[1])] = new DriveablePosition(
                            new Vector3f(Float.parseFloat(split[2]) / 16.0F, Float.parseFloat(split[3]) / 16.0F,
                                    Float.parseFloat(split[4]) / 16.0F),
                            split.length > 5 ? EnumDriveablePart.getPart(split[5]) : EnumDriveablePart.coreWheel);
                }
            } else {
                this.collisionPoints.add(new DriveablePosition(split));
            }
        } catch (Exception var10) {
            if (split != null) {
                String msg = " : ";
                String[] i = split;
                amount = split.length;

                for (int damaged = 0; damaged < amount; ++damaged) {
                    s = i[damaged];
                    msg = msg + " " + s;
                }

                FlansMod.log("Errored reading " + file.name + "");
            } else {
                FlansMod.log("Errored reading " + file.name);
            }

            if (FlansMod.printStackTrace) {
                var10.printStackTrace();
            }
        }

    }

    private DriveablePosition getShootPoint(String[] split) {
        return split.length == 6 ? new PilotGun(split)
                : (split.length == 5 ? new DriveablePosition(split)
                : new DriveablePosition(new Vector3f(), EnumDriveablePart.core));
    }

    public ArrayList shootPoints(boolean s) {
        return s ? this.shootPointsSecondary : this.shootPointsPrimary;
    }

    public boolean alternate(boolean s) {
        return s ? this.alternateSecondary : this.alternatePrimary;
    }

    public EnumWeaponType weaponType(boolean s) {
        return s ? this.secondary : this.primary;
    }

    public int shootDelay(boolean s) {
        return s ? this.shootDelaySecondary : this.shootDelayPrimary;
    }

    public String shootSound(boolean s) {
        return s ? this.shootSoundSecondary : this.shootSoundPrimary;
    }

    public ArrayList shootParticle(boolean s) {
        return s ? this.shootParticlesSecondary : this.shootParticlesPrimary;
    }

    public int numEngines() {
        return 1;
    }

    public int ammoSlots() {
        return this.numPassengerGunners + this.pilotGuns.size();
    }

    public boolean isValidAmmo(BulletType bulletType, EnumWeaponType weaponType) {
        return (this.acceptAllAmmo || this.ammo.contains(bulletType)) && bulletType.weaponType == weaponType;
    }

    public ArrayList getItemsRequired(DriveablePart part, PartType engine) {
        ArrayList stacks = new ArrayList();
        int gun;
        int var6;
        if (this.partwiseRecipe.get(part.type) != null) {
            ItemStack[] var4 = (ItemStack[]) this.partwiseRecipe.get(part.type);
            gun = var4.length;

            for (var6 = 0; var6 < gun; ++var6) {
                ItemStack seat = var4[var6];
                stacks.add(seat.copy());
            }
        }

        Iterator var8 = this.pilotGuns.iterator();

        while (var8.hasNext()) {
            PilotGun var10 = (PilotGun) var8.next();
            if (var10.part == part.type) {
                stacks.add(new ItemStack(var10.type.item));
            }
        }

        Seat[] var9 = this.seats;
        gun = var9.length;

        for (var6 = 0; var6 < gun; ++var6) {
            Seat var11 = var9[var6];
            if (var11 != null && var11.part == part.type && var11.gunType != null) {
                stacks.add(new ItemStack(var11.gunType.item));
            }
        }

        return stacks;
    }

    public class ParticleEmitter {

        public String effectType;
        public int emitRate;
        public Vector3f origin;
        public Vector3f extents;
        public Vector3f velocity;
        public float minThrottle;
        public float maxThrottle;
        public String part;
        public float minHealth;
        public float maxHealth;

    }

    public class ShootParticle {

        float x = 0.0F;
        float y = 0.0F;
        float z = 0.0F;
        String name;

        public ShootParticle(String s, float x1, float y1, float z1) {
            this.x = x1;
            this.y = y1;
            this.z = z1;
            this.name = s;
        }
    }
}
