package com.flansmod.common.driveables;

import com.flansmod.api.IControllable;
import com.flansmod.api.IExplodeable;
import com.flansmod.client.EntityCamera;
import com.flansmod.client.FlansModClient;
import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.common.FlansMod;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.DriveableType.ParticleEmitter;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.guns.*;
import com.flansmod.common.guns.raytracing.BulletHit;
import com.flansmod.common.guns.raytracing.DriveableHit;
import com.flansmod.common.network.*;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.vector.Vector3f;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.*;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class EntityDriveable extends Entity
        implements IControllable, IExplodeable, IEntityAdditionalSpawnData {

    public boolean syncFromServer;
    public int serverPositionTransitionTicker;
    public double field_70118_ct;
    public double field_70117_cu;
    public double field_70116_cv;
    public double serverYaw;
    public double serverPitch;
    public double serverRoll;
    public DriveableData driveableData;
    public String driveableType;
    public float throttle;
    public EntityWheel[] wheels;
    public boolean fuelling;
    public float prevRotationRoll;
    public Vector3f angularVelocity;
    public boolean leftMouseHeld;
    public boolean rightMouseHeld;
    public int shootDelayPrimary;
    public int shootDelaySecondary;
    public float minigunSpeedPrimary;
    public float minigunSpeedSecondary;
    public int currentGunPrimary;
    public int currentGunSecondary;
    public float harvesterAngle;
    public RotatedAxes prevAxes;
    public RotatedAxes axes;
    public EntitySeat[] seats;
    public boolean couldNotFindFuel;
    public boolean isAmmoPlaced;
    public int lockOnSoundDelay;
    public int animCount;
    public int animFrame;
    public boolean isShowedPosition;
    public int tickCount;
    public int impactX;
    public int impactY;
    public int impactZ;
    @SideOnly(Side.CLIENT)
    public EntityLivingBase camera;
    public Entity lastAtkEntity;
    protected int invulnerableUnmountCount;
    private final int foundFuel;
    private int[] emitterTimers;
    private final ItemStack[][] prevInventoryItems;

    public EntityDriveable(World world) {
        super(world);
        this.syncFromServer = true;
        this.angularVelocity = new Vector3f(0.0F, 0.0F, 0.0F);
        this.leftMouseHeld = false;
        this.rightMouseHeld = false;
        this.foundFuel = -1;
        this.couldNotFindFuel = false;
        this.isAmmoPlaced = false;
        this.animCount = 0;
        this.animFrame = 0;
        this.isShowedPosition = false;
        this.tickCount = 0;
        this.prevInventoryItems = new ItemStack[][]{null, null};
        this.lastAtkEntity = null;
        this.axes = new RotatedAxes();
        this.prevAxes = new RotatedAxes();
        super.preventEntitySpawning = true;
        this.setSize(1.0F, 1.0F);
        super.yOffset = 0.375F;
        super.ignoreFrustumCheck = true;
        super.renderDistanceWeight = 200.0D;
    }

    public EntityDriveable(World world, DriveableType t, DriveableData d) {
        this(world);
        this.driveableType = t.shortName;
        this.driveableData = d;
    }

    protected void initType(DriveableType type, boolean clientSide) {
        this.seats = new EntitySeat[type.numPassengers + 1];

        int ps;
        for (ps = 0; ps < type.numPassengers + 1; ++ps) {
            if (!clientSide) {
                this.seats[ps] = new EntitySeat(super.worldObj, this, ps);
                super.worldObj.spawnEntityInWorld(this.seats[ps]);
            }
        }

        this.wheels = new EntityWheel[type.wheelPositions.length];

        for (ps = 0; ps < this.wheels.length; ++ps) {
            if (!clientSide) {
                this.wheels[ps] = new EntityWheel(super.worldObj, this, ps);
                super.worldObj.spawnEntityInWorld(this.wheels[ps]);
            }
        }

        super.stepHeight = type.wheelStepHeight;
        super.yOffset = type.yOffset;
        this.emitterTimers = new int[type.emitters.size()];

        for (ps = 0; ps < type.emitters.size(); ++ps) {
            this.emitterTimers[ps] = super.rand
                    .nextInt(((DriveableType.ParticleEmitter) type.emitters.get(ps)).emitRate);
        }

        this.getEntityData().setBoolean("CanMountEntity", type.canMountEntity);

        for (ps = 0; ps < 2; ++ps) {
            EnumWeaponType weaponType = ps == 0 ? type.primary : type.secondary;
            if (weaponType == EnumWeaponType.GUN) {
                weaponType = EnumWeaponType.NONE;
            }

            int istart = this.getInventoryStart(weaponType);
            if (istart == this.driveableData.getAmmoInventoryStart()) {
                istart += type.numPassengerGunners;
            }

            int isize = this.getInventorySize(weaponType);
            if (istart >= 0 || isize > 0) {
                this.prevInventoryItems[ps] = new ItemStack[isize];

                for (int i = 0; i < isize; ++i) {
                    this.prevInventoryItems[ps][i] = this.driveableData.getStackInSlot(istart + i);
                }
            }
        }

    }

    protected void writeEntityToNBT(NBTTagCompound tag) {
        this.driveableData.writeToNBT(tag);
        tag.setString("Type", this.driveableType);
        tag.setFloat("RotationYaw", this.axes.getYaw());
        tag.setFloat("RotationPitch", this.axes.getPitch());
        tag.setFloat("RotationRoll", this.axes.getRoll());
    }

    protected void readEntityFromNBT(NBTTagCompound tag) {
        this.driveableType = tag.getString("Type");
        this.driveableData = new DriveableData(tag);
        this.initType(DriveableType.getDriveable(this.driveableType), false);
        super.prevRotationYaw = tag.getFloat("RotationYaw");
        super.prevRotationPitch = tag.getFloat("RotationPitch");
        this.prevRotationRoll = tag.getFloat("RotationRoll");
        this.axes = new RotatedAxes(super.prevRotationYaw, super.prevRotationPitch, this.prevRotationRoll);
    }

    public void writeSpawnData(ByteBuf data) {
        ByteBufUtils.writeUTF8String(data, this.driveableType);
        NBTTagCompound tag = new NBTTagCompound();
        this.driveableData.writeToNBT(tag);
        ByteBufUtils.writeTag(data, tag);
        data.writeFloat(this.axes.getYaw());
        data.writeFloat(this.axes.getPitch());
        data.writeFloat(this.axes.getRoll());
        EnumDriveablePart[] var3 = EnumDriveablePart.values();
        int var4 = var3.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            EnumDriveablePart ep = var3[var5];
            DriveablePart part = (DriveablePart) this.getDriveableData().parts.get(ep);
            data.writeShort((short) part.health);
            data.writeBoolean(part.onFire);
        }

    }

    public void readSpawnData(ByteBuf data) {
        try {
            this.driveableType = ByteBufUtils.readUTF8String(data);
            this.driveableData = new DriveableData(ByteBufUtils.readTag(data));
            this.initType(this.getDriveableType(), true);
            this.axes.setAngles(data.readFloat(), data.readFloat(), data.readFloat());
            super.prevRotationYaw = this.axes.getYaw();
            super.prevRotationPitch = this.axes.getPitch();
            this.prevRotationRoll = this.axes.getRoll();
            EnumDriveablePart[] e = EnumDriveablePart.values();
            int var3 = e.length;

            for (int var4 = 0; var4 < var3; ++var4) {
                EnumDriveablePart ep = e[var4];
                DriveablePart part = (DriveablePart) this.getDriveableData().parts.get(ep);
                part.health = data.readShort();
                part.onFire = data.readBoolean();
            }
        } catch (Exception var7) {
            FlansMod.log("Failed to retreive plane type from server.");
            super.setDead();
            var7.printStackTrace();
        }

        this.camera = new EntityCamera(super.worldObj, this);
        super.worldObj.spawnEntityInWorld(this.camera);
    }

    public abstract void onMouseMoved(int var1, int var2);

    @SideOnly(Side.CLIENT)
    public EntityLivingBase getCamera() {
        return this.camera;
    }

    protected boolean canSit(int seat) {
        return this.getDriveableType().numPassengers >= seat && this.seats[seat].riddenByEntity == null;
    }

    protected boolean canTriggerWalking() {
        return false;
    }

    protected void entityInit() {
    }

    public AxisAlignedBB getCollisionBox(Entity entity) {
        if (this.getDriveableType().collisionDamageEnable
                && this.throttle > this.getDriveableType().collisionDamageThrottle) {
            if (entity instanceof EntityLiving) {
                entity.attackEntityFrom(DamageSource.generic,
                        this.throttle * this.getDriveableType().collisionDamageTimes);
            } else if (entity instanceof EntityPlayer) {
                entity.attackEntityFrom(DamageSource.generic,
                        this.throttle * this.getDriveableType().collisionDamageTimes);
            }
        }

        return null;
    }

    public AxisAlignedBB getBoundingBox() {
        return super.boundingBox;
    }

    public boolean canBePushed() {
        return false;
    }

    public double getMountedYOffset() {
        return -0.3D;
    }

    public boolean hitByEntity(Entity player) {
        return super.isDead || player.isDead || (super.ticksExisted < 200 || player.ticksExisted < 300);
    }

    public boolean attackEntityFrom(DamageSource damagesource, float i) {
        if (!super.worldObj.isRemote && !super.isDead) {
            if (this.isMountedEntity(damagesource.getEntity())) {
                return false;
            } else {
                this.attackPart(EnumDriveablePart.core, damagesource, i);
                if (i > 0.0F) {
                    this.checkPartsWhenAttacked();
                    FlansMod.getPacketHandler().sendToAllAround(new PacketDriveableDamage(this), super.posX, super.posY,
                            super.posZ, 100.0F, super.dimension);
                }

                return true;
            }
        } else {
            return true;
        }
    }

    public boolean isMountedEntity(Entity entity) {
        if (entity != null) {
            Entity entity2 = super.worldObj.getEntityByID(entity.getEntityId());
            EntitySeat[] var3 = this.seats;
            int var4 = var3.length;

            for (int var5 = 0; var5 < var4; ++var5) {
                EntitySeat seat = var3[var5];
                if (seat.riddenByEntity != null && (seat.riddenByEntity == entity || seat.riddenByEntity == entity2)) {
                    return true;
                }
            }
        }

        return false;
    }

    public void setDead() {
        super.setDead();
        if (super.worldObj.isRemote) {
            this.camera.setDead();
        }

        EntitySeat[] var1 = this.seats;
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            EntitySeat seat = var1[var3];
            if (seat != null) {
                seat.setDead();
            }
        }

    }

    public void onCollideWithPlayer(EntityPlayer par1EntityPlayer) {
    }

    public boolean canBeCollidedWith() {
        return !super.isDead;
    }

    public void applyEntityCollision(Entity entity) {
        if (!this.isPartOfThis(entity)) {
            super.applyEntityCollision(entity);
        }

    }

    public void setPositionAndRotation2(double d, double d1, double d2, float f, float f1, int i) {
        if (super.ticksExisted <= 1) {
            if (!(super.riddenByEntity instanceof EntityPlayer)
                    || !FlansMod.proxy.isThePlayer((EntityPlayer) super.riddenByEntity)) {
                if (this.syncFromServer) {
                    this.serverPositionTransitionTicker = i + 5;
                } else {
                    double var10 = d - super.posX;
                    double var12 = d1 - super.posY;
                    double var14 = d2 - super.posZ;
                    double var16 = var10 * var10 + var12 * var12 + var14 * var14;
                    if (var16 <= 1.0D) {
                        return;
                    }

                    this.serverPositionTransitionTicker = 3;
                }

                this.field_70118_ct = d;
                this.field_70117_cu = d1;
                this.field_70116_cv = d2;
                this.serverYaw = f;
                this.serverPitch = f1;
            }

        }
    }

    public void setPositionRotationAndMotion(double x, double y, double z, float yaw, float pitch, float roll,
                                             double motX, double motY, double motZ, float velYaw, float velPitch, float velRoll, float throt,
                                             float steeringYaw) {
        if (super.worldObj.isRemote) {
            this.field_70118_ct = x;
            this.field_70117_cu = y;
            this.field_70116_cv = z;
            this.serverYaw = yaw;
            this.serverPitch = pitch;
            this.serverRoll = roll;
            this.serverPositionTransitionTicker = 5;
        } else {
            this.setPosition(x, y, z);
            super.prevRotationYaw = yaw;
            super.prevRotationPitch = pitch;
            this.prevRotationRoll = roll;
            this.setRotation(yaw, pitch, roll);
        }

        super.motionX = motX;
        super.motionY = motY;
        super.motionZ = motZ;
        this.angularVelocity = new Vector3f(velYaw, velPitch, velRoll);
        this.throttle = throt;
    }

    public void setVelocity(double d, double d1, double d2) {
        super.motionX = d;
        super.motionY = d1;
        super.motionZ = d2;
    }

    public boolean pressKey(int key, EntityPlayer player) {
        if (!super.worldObj.isRemote && key == 9 && this.getDriveableType().modePrimary == EnumFireMode.SEMIAUTO) {
            this.shoot(false);
            return true;
        } else if (!super.worldObj.isRemote && key == 8
                && this.getDriveableType().modeSecondary == EnumFireMode.SEMIAUTO) {
            this.shoot(true);
            return true;
        } else {
            return false;
        }
    }

    public void updateKeyHeldState(int key, boolean held) {
        if (super.worldObj.isRemote) {
            FlansMod.getPacketHandler().sendToServer(new PacketDriveableKeyHeld(key, held));
        }

        switch (key) {
            case 8:
                this.rightMouseHeld = held;
                break;
            case 9:
                this.leftMouseHeld = held;
        }

    }

    public void shoot(boolean secondary) {
        DriveableType type = this.getDriveableType();
        if (this.seats[0] != null || this.seats[0].riddenByEntity instanceof EntityLivingBase) {
            if (this.getShootDelay(secondary) <= 0) {
                ArrayList shootPoints = type.shootPoints(secondary);
                EnumWeaponType weaponType = type.weaponType(secondary);
                if (shootPoints.size() == 0) {
                    return;
                }

                int currentGun = this.getCurrentGun(secondary);
                if (type.alternate(secondary)) {
                    currentGun = (currentGun + 1) % shootPoints.size();
                    this.setCurrentGun(currentGun, secondary);
                    this.shootEach(type, (DriveablePosition) shootPoints.get(currentGun), currentGun, secondary,
                            weaponType);
                } else {
                    for (int i = 0; i < shootPoints.size(); ++i) {
                        this.shootEach(type, (DriveablePosition) shootPoints.get(i), i, secondary, weaponType);
                    }
                }
            }

        }
    }

    private boolean driverIsCreative() {
        return this.seats != null && this.seats[0] != null && this.seats[0].riddenByEntity instanceof EntityPlayer
                && ((EntityPlayer) this.seats[0].riddenByEntity).capabilities.isCreativeMode;
    }

    public void spawnParticle(ArrayList list, DriveablePosition shootPoint) {
        float bkz;
        for (Iterator var3 = list.iterator(); var3.hasNext(); shootPoint.position.z = bkz) {
            DriveableType.ShootParticle s = (DriveableType.ShootParticle) var3.next();
            float bkx = shootPoint.position.x;
            float bky = shootPoint.position.y;
            bkz = shootPoint.position.z;
            shootPoint.position.x += s.x;
            shootPoint.position.y += s.y;
            shootPoint.position.z += s.z;
            Vector3f v = this.getOrigin(shootPoint);
            FlansMod.getPacketHandler().sendToAllAround(
                    new PacketParticle(s.name, super.posX + (double) v.x, super.posY + (double) v.y,
                            super.posZ + (double) v.z, 0.0D, 0.0D, 0.0D),
                    super.posX + (double) v.x, super.posY + (double) v.y, super.posZ + (double) v.z, 150.0F,
                    super.dimension);
            shootPoint.position.x = bkx;
            shootPoint.position.y = bky;
        }

    }

    private void shootEach(DriveableType type, DriveablePosition shootPoint, int currentGun, boolean secondary,
                           EnumWeaponType weaponType) {
        Vector3f gunVec = this.getOrigin(shootPoint);
        Vector3f lookVector = this.getLookVector(shootPoint);
        ItemStack bulletItemStack;
        if (shootPoint instanceof PilotGun) {
            PilotGun pilotGun = (PilotGun) shootPoint;
            GunType gunType = pilotGun.type;
            bulletItemStack = this.driveableData.ammo[this.getDriveableType().numPassengerGunners + currentGun];
            if (gunType != null && bulletItemStack != null && bulletItemStack.getItem() instanceof ItemShootable
                    && TeamsManager.bulletsEnabled) {
                ShootableType bullet = ((ItemShootable) bulletItemStack.getItem()).type;
                if (gunType.isAmmo(bullet)) {
                    this.worldObj.spawnEntityInWorld(((ItemShootable) bulletItemStack.getItem()).getEntity(
                            this.worldObj,
                            Vector3f.add(gunVec, new Vector3f((float) this.posX, (float) this.posY, (float) this.posZ),
                                    null),
                            lookVector, (EntityLivingBase) this.seats[0].riddenByEntity, gunType.bulletSpread / 2.0F,
                            gunType.damage, 10.0F, bulletItemStack.getItemDamage(), type));
                    PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0D, this.dimension,
                            type.shootSound(secondary), false);
                    int damage = bulletItemStack.getItemDamage();
                    bulletItemStack.setItemDamage(damage + 1);
                    if (damage + 1 == bulletItemStack.getMaxDamage()) {
                        bulletItemStack.setItemDamage(0);
                        if (!this.driverIsCreative()) {
                            --bulletItemStack.stackSize;
                            if (bulletItemStack.stackSize <= 0) {
                                this.onWeaponInventoryChanged(secondary);
                                bulletItemStack = null;
                            }

                            this.driveableData.setInventorySlotContents(
                                    this.getDriveableType().numPassengerGunners + currentGun, bulletItemStack);
                        }
                    }

                    this.setShootDelay(type.shootDelay(secondary), secondary);
                }
            }
        } else {
            ItemBullet bulletItem;
            EntityShootable bulletEntity;
            int slot;
            int i;
            float shellSpeed;
            ItemStack bulletStack;
            switch (weaponType) {
                case BOMB:
                    if (TeamsManager.bombsEnabled) {
                        slot = -1;

                        for (i = this.driveableData.getBombInventoryStart(); i < this.driveableData.getBombInventoryStart()
                                + type.numBombSlots; ++i) {
                            bulletItemStack = this.driveableData.getStackInSlot(i);
                            if (bulletItemStack != null && bulletItemStack.getItem() instanceof ItemBullet
                                    && type.isValidAmmo(((ItemBullet) bulletItemStack.getItem()).type, weaponType)) {
                                slot = i;
                            }
                        }

                        if (slot != -1) {
                            boolean spread = false;
                            int damageMultiplier = 1;
                            shellSpeed = 0.0F;
                            bulletStack = this.driveableData.getStackInSlot(slot);
                            bulletItem = (ItemBullet) bulletStack.getItem();
                            if (shootPoint instanceof PilotGun) {
                                PilotGun pilotGun = (PilotGun) shootPoint;
                                GunType var15 = pilotGun.type;
                            }

                            bulletEntity = bulletItem.getEntity(this.worldObj,
                                    Vec3.createVectorHelper(this.posX + (double) gunVec.x, this.posY + (double) gunVec.y,
                                            this.posZ + (double) gunVec.z),
                                    this.axes.getYaw(), this.axes.getPitch(), this.motionX, this.motionY, this.motionZ,
                                    (EntityLivingBase) this.seats[0].riddenByEntity, (float) damageMultiplier,
                                    this.driveableData.getStackInSlot(slot).getItemDamage(), type);
                            this.worldObj.spawnEntityInWorld(bulletEntity);
                            this.spawnParticle(type.shootParticle(secondary), shootPoint);
                            if (type.shootSound(secondary) != null) {
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0D, this.dimension,
                                        type.shootSound(secondary), false);
                            }

                            if (!this.driverIsCreative()) {
                                bulletStack.setItemDamage(bulletStack.getItemDamage() + 1);
                                if (bulletStack.getItemDamage() == bulletStack.getMaxDamage()) {
                                    bulletStack.setItemDamage(0);
                                    --bulletStack.stackSize;
                                    if (bulletStack.stackSize == 0) {
                                        this.onWeaponInventoryChanged(secondary);
                                        bulletStack = null;
                                    }
                                }

                                this.driveableData.setInventorySlotContents(slot, bulletStack);
                            }

                            this.setShootDelay(type.shootDelay(secondary), secondary);
                        }
                    }
                    break;
                case MISSILE:
                case SHELL:
                    if (TeamsManager.shellsEnabled) {
                        slot = -1;

                        for (i = this.driveableData.getMissileInventoryStart(); i < this.driveableData
                                .getMissileInventoryStart() + type.numMissileSlots; ++i) {
                            bulletItemStack = this.driveableData.getStackInSlot(i);
                            if (bulletItemStack != null && bulletItemStack.getItem() instanceof ItemBullet
                                    && type.isValidAmmo(((ItemBullet) bulletItemStack.getItem()).type, weaponType)) {
                                slot = i;
                            }
                        }

                        if (slot != -1) {
                            int damageMultiplier = 1;
                            float spread = type.bulletSpread;
                            shellSpeed = type.bulletSpeed;
                            bulletStack = this.driveableData.getStackInSlot(slot);
                            bulletItem = (ItemBullet) bulletStack.getItem();
                            bulletEntity = bulletItem.getEntity(this.worldObj,
                                    Vector3f.add(new Vector3f(this.posX, this.posY, this.posZ), gunVec, null),
                                    lookVector, (EntityLivingBase) this.seats[0].riddenByEntity, spread,
                                    (float) damageMultiplier, shellSpeed,
                                    this.driveableData.getStackInSlot(slot).getItemDamage(), type);
                            this.worldObj.spawnEntityInWorld(bulletEntity);
                            this.spawnParticle(type.shootParticle(secondary), shootPoint);
                            if (type.shootSound(secondary) != null) {
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0D, this.dimension,
                                        type.shootSound(secondary), false);
                            }

                            if (!this.driverIsCreative()) {
                                bulletStack.setItemDamage(bulletStack.getItemDamage() + 1);
                                if (bulletStack.getItemDamage() == bulletStack.getMaxDamage()) {
                                    bulletStack.setItemDamage(0);
                                    --bulletStack.stackSize;
                                    if (bulletStack.stackSize == 0) {
                                        this.onWeaponInventoryChanged(secondary);
                                        bulletStack = null;
                                    }
                                }

                                this.driveableData.setInventorySlotContents(slot, bulletStack);
                            }

                            this.setShootDelay(type.shootDelay(secondary), secondary);
                        }
                    }
                case GUN:
                case MINE:
                case NONE:
            }
        }

    }

    public Vector3f getOrigin(DriveablePosition dp) {
        Vector3f localGunVec = new Vector3f(dp.position);
        if (dp.part == EnumDriveablePart.turret) {
            Vector3f.sub(localGunVec, this.getDriveableType().turretOrigin, localGunVec);
            localGunVec = this.seats[0].looking.findLocalVectorGlobally(localGunVec);
            Vector3f.add(localGunVec, this.getDriveableType().turretOrigin, localGunVec);
            Vector3f turretOriginOffset = new Vector3f(this.getDriveableType().turretOriginOffset);
            turretOriginOffset = this.seats[0].looking.findLocalVectorGloballyYaw(turretOriginOffset);
            Vector3f.add(localGunVec, turretOriginOffset, localGunVec);
        }

        return this.rotate(localGunVec);
    }

    public Vector3f getLookVector(DriveablePosition dp) {
        return this.axes.getXAxis();
    }

    public void correctWheelPos() {
        if (this.ticksExisted % 200 == 0) {
            EntityWheel[] var1 = this.wheels;
            int var2 = var1.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                EntityWheel wheel = var1[var3];
                if (wheel != null) {
                    Vector3f target = this.axes
                            .findLocalVectorGlobally(this.getDriveableType().wheelPositions[wheel.ID].position);
                    target.x = (float) ((double) target.x + this.posX);
                    target.y = (float) ((double) target.y + this.posY);
                    target.z = (float) ((double) target.z + this.posZ);
                    int tf = 1;
                    int cf = 1;
                    int range = 5;
                    if (MathHelper.abs(target.x - (float) wheel.posX) > (float) range) {
                        wheel.posX = (target.x * (float) tf + (float) wheel.posX * (float) cf)
                                / (float) (tf + cf);
                    }

                    if (MathHelper.abs(target.y - (float) wheel.posY) > (float) range) {
                        wheel.posY = (target.y * (float) tf + (float) wheel.posY * (float) cf)
                                / (float) (tf + cf);
                    }

                    if (MathHelper.abs(target.z - (float) wheel.posZ) > (float) range) {
                        wheel.posZ = (target.z * (float) tf + (float) wheel.posZ * (float) cf)
                                / (float) (tf + cf);
                    }
                }
            }
        }

    }

    public void onUpdate() {
        super.onUpdate();
        DriveableType type = this.getDriveableType();
        DriveableData data = this.getDriveableData();
        this.checkInventoryChanged();
        int i;
        Vector3f localPosition2;
        if ((type.lockOnToLivings || type.lockOnToMechas || type.lockOnToPlanes || type.lockOnToPlayers
                || type.lockOnToVehicles) && !this.worldObj.isRemote && this.seats.length > 0
                && this.lockOnSoundDelay <= 0 && this.seats[0] != null
                && this.seats[0].riddenByEntity instanceof EntityPlayer) {
            i = this.getCurrentGun(false);
            Vector3f playerVec = this.getOrigin((DriveablePosition) type.shootPoints(false).get(i));
            Iterator var5 = this.worldObj.loadedEntityList.iterator();

            label431:
            while (true) {
                Entity entity;
                do {
                    if (!var5.hasNext()) {
                        break label431;
                    }

                    Object obj = var5.next();
                    entity = (Entity) obj;
                } while ((!type.lockOnToMechas || !(entity instanceof EntityMecha))
                        && (!type.lockOnToVehicles || !(entity instanceof EntityVehicle))
                        && (!type.lockOnToPlanes || !(entity instanceof EntityPlane))
                        && (!type.lockOnToPlayers || !(entity instanceof EntityPlayer))
                        && (!type.lockOnToLivings || !(entity instanceof EntityLivingBase)));

                double dXYZ = this.getDistanceToEntity(entity);
                if (this.getDistanceSqToEntity(entity) < (double) (type.maxRangeLockOn * type.maxRangeLockOn)) {
                    localPosition2 = new Vector3f(entity.posX - this.posX, entity.posY - this.posY,
                            entity.posZ - this.posZ);
                    float angle = Math.abs(Vector3f.angle(playerVec, localPosition2));
                    if ((double) angle < Math.toRadians(type.canLockOnAngle)) {
                        PacketPlaySound.sendSoundPacket(this.seats[0].posX, this.seats[0].posY, this.seats[0].posZ,
                                10.0D, this.dimension, type.lockOnSound, false);
                        if (entity instanceof EntityDriveable) {
                            PacketPlaySound.sendSoundPacket(entity.posX, entity.posY, entity.posZ,
                                    ((EntityDriveable) entity).getDriveableType().lockedOnSoundRange,
                                    entity.dimension, ((EntityDriveable) entity).getDriveableType().lockingOnSound,
                                    false);
                        }

                        this.lockOnSoundDelay = type.lockOnSoundTime;
                        break;
                    }
                }
            }
        }

        if (this.lockOnSoundDelay > 0) {
            --this.lockOnSoundDelay;
        }

        if (this.ridingEntity != null) {
            this.invulnerableUnmountCount = 80;
        } else if (this.invulnerableUnmountCount > 0) {
            --this.invulnerableUnmountCount;
        }

        if (!this.worldObj.isRemote) {
            for (i = 0; i < this.getDriveableType().numPassengers + 1; ++i) {
                if (this.seats[i] == null || !this.seats[i].addedToChunk) {
                    this.seats[i] = new EntitySeat(this.worldObj, this, i);
                    this.worldObj.spawnEntityInWorld(this.seats[i]);
                }
            }

            for (i = 0; i < type.wheelPositions.length; ++i) {
                if (this.wheels[i] == null || !this.wheels[i].addedToChunk) {
                    this.wheels[i] = new EntityWheel(this.worldObj, this, i);
                    this.worldObj.spawnEntityInWorld(this.wheels[i]);
                }
            }
        }

        if (this.lastAtkEntity != null && this.lastAtkEntity instanceof EntityPlayer && this.isShowedPosition
                && this.worldObj.isRemote && !FlansMod.proxy.isThePlayer((EntityPlayer) this.lastAtkEntity)
                && FlansMod.proxy.isOnSameTeamClientPlayer((EntityLivingBase) this.lastAtkEntity)) {
        }

        if (this.isShowedPosition && this.tickCount > 0) {
            --this.tickCount;
        }

        if (this.tickCount <= 0) {
            this.isShowedPosition = false;
        }

        if (this.hasEnoughFuel()) {
            this.harvesterAngle += this.throttle / 5.0F;
        }

        int damage;
        if (type.harvestBlocks && type.health.get(EnumDriveablePart.harvester) != null) {
            CollisionBox box = (CollisionBox) type.health.get(EnumDriveablePart.harvester);

            for (float x = box.x; x <= box.x + box.w; ++x) {
                for (float y = box.y; y <= box.y + box.h; ++y) {
                    for (float z = box.z; z <= box.z + box.d; ++z) {
                        Vector3f v = this.axes.findLocalVectorGlobally(new Vector3f(x, y, z));
                        int blockX = (int) Math.round(this.posX + (double) v.x);
                        damage = (int) Math.round(this.posY + (double) v.y);
                        int blockZ = (int) Math.round(this.posZ + (double) v.z);
                        Block block = this.worldObj.getBlock(blockX, damage, blockZ);
                        if (type.materialsHarvested.contains(block.getMaterial())
                                && block.getBlockHardness(this.worldObj, blockX, damage, blockZ) >= 0.0F) {
                            ArrayList<ItemStack> stacks = block.getDrops(this.worldObj, blockX, damage, blockZ,
                                    this.worldObj.getBlockMetadata(blockX, damage, blockZ), 0);

                            for (int i1 = 0; i1 < stacks.size(); ++i1) {
                                ItemStack stack = stacks.get(i1);
                                FlansMod.log("");
                                if (!InventoryHelper.addItemStackToInventory(this.driveableData, stack,
                                        this.driverIsCreative()) && !this.worldObj.isRemote
                                        && this.worldObj.getGameRules().getGameRuleBooleanValue("doTileDrops")) {
                                    this.worldObj.spawnEntityInWorld(new EntityItem(this.worldObj,
                                            (float) blockX + 0.5F, (float) damage + 0.5F,
                                            (float) blockZ + 0.5F, stack));
                                }
                            }

                            this.worldObj.func_147480_a(blockX, damage, blockZ, false);
                        }
                    }
                }
            }
        }

        Iterator var17 = this.getDriveableData().parts.values().iterator();

        while (var17.hasNext()) {
            DriveablePart part = (DriveablePart) var17.next();
            if (part.box != null) {
                part.update(this);
                Vector3f pos;
                if (this.worldObj.isRemote) {
                    if (part.onFire) {
                        pos = this.axes
                                .findLocalVectorGlobally(new Vector3f(part.box.x + this.rand.nextFloat() * part.box.w,
                                        part.box.y + this.rand.nextFloat() * part.box.h,
                                        part.box.z + this.rand.nextFloat() * part.box.d));
                        this.worldObj.spawnParticle("flame", this.posX + (double) pos.x, this.posY + (double) pos.y,
                                this.posZ + (double) pos.z, 0.0D, 0.0D, 0.0D);
                    }

                    if (part.health > 0 && part.health < part.maxHealth / 2) {
                        pos = this.axes
                                .findLocalVectorGlobally(new Vector3f(part.box.x + this.rand.nextFloat() * part.box.w,
                                        part.box.y + this.rand.nextFloat() * part.box.h,
                                        part.box.z + this.rand.nextFloat() * part.box.d));
                        this.worldObj.spawnParticle(part.health < part.maxHealth / 4 ? "largesmoke" : "smoke",
                                this.posX + (double) pos.x, this.posY + (double) pos.y, this.posZ + (double) pos.z,
                                0.0D, 0.0D, 0.0D);
                    }
                }

                if (part.onFire) {
                    if (this.worldObj.isRaining() && this.rand.nextInt(40) == 0) {
                        part.onFire = false;
                    }

                    pos = this.axes.findLocalVectorGlobally(new Vector3f(part.box.x + part.box.w / 2.0F,
                            part.box.y + part.box.h / 2.0F, part.box.z + part.box.d / 2.0F));
                    if (this.worldObj
                            .getBlock(MathHelper.floor_double(this.posX + (double) pos.x),
                                    MathHelper.floor_double(this.posY + (double) pos.y),
                                    MathHelper.floor_double(this.posZ + (double) pos.z))
                            .getMaterial() == Material.water) {
                        part.onFire = false;
                    }
                } else {
                    pos = this.axes.findLocalVectorGlobally(new Vector3f(part.box.x / 16.0F + part.box.w / 32.0F,
                            part.box.y / 16.0F + part.box.h / 32.0F, part.box.z / 16.0F + part.box.d / 32.0F));
                    if (this.worldObj
                            .getBlock(MathHelper.floor_double(this.posX + (double) pos.x),
                                    MathHelper.floor_double(this.posY + (double) pos.y),
                                    MathHelper.floor_double(this.posZ + (double) pos.z))
                            .getMaterial() == Material.lava) {
                        part.onFire = true;
                    }
                }
            }
        }

        for (i = 0; i < type.emitters.size(); ++i) {
            ParticleEmitter emitter = (ParticleEmitter) type.emitters.get(i);
            --this.emitterTimers[i];
            boolean canEmit = false;
            DriveablePart part = (DriveablePart) this.getDriveableData().parts
                    .get(EnumDriveablePart.getPart(emitter.part));
            float healthPercentage = (float) part.health / (float) part.maxHealth;
            canEmit = this.isPartIntact(EnumDriveablePart.getPart(emitter.part)) && healthPercentage >= emitter.minHealth
                    && healthPercentage <= emitter.maxHealth;

            if (this.emitterTimers[i] <= 0) {
                if (this.throttle >= emitter.minThrottle && this.throttle <= emitter.maxThrottle && canEmit) {
                    Vector3f velocity = new Vector3f(0.0F, 0.0F, 0.0F);
                    Vector3f pos = new Vector3f(0.0F, 0.0F, 0.0F);
                    if (this.seats != null && this.seats[0] != null) {
                        if (EnumDriveablePart.getPart(emitter.part) != EnumDriveablePart.turret
                                && EnumDriveablePart.getPart(emitter.part) != EnumDriveablePart.head) {
                            localPosition2 = new Vector3f(
                                    emitter.origin.x + this.rand.nextFloat() * emitter.extents.x
                                            - emitter.extents.x * 0.5F,
                                    emitter.origin.y + this.rand.nextFloat() * emitter.extents.y
                                            - emitter.extents.y * 0.5F,
                                    emitter.origin.z + this.rand.nextFloat() * emitter.extents.z
                                            - emitter.extents.z * 0.5F);
                            pos = this.axes.findLocalVectorGlobally(localPosition2);
                            velocity = this.axes.findLocalVectorGlobally(emitter.velocity);
                        } else if (EnumDriveablePart.getPart(emitter.part) == EnumDriveablePart.turret
                                || EnumDriveablePart.getPart(emitter.part) != EnumDriveablePart.head) {
                            localPosition2 = new Vector3f(
                                    emitter.origin.x + this.rand.nextFloat() * emitter.extents.x
                                            - emitter.extents.x * 0.5F,
                                    emitter.origin.y + this.rand.nextFloat() * emitter.extents.y
                                            - emitter.extents.y * 0.5F,
                                    emitter.origin.z + this.rand.nextFloat() * emitter.extents.z
                                            - emitter.extents.z * 0.5F);
                            RotatedAxes yawOnlyLooking = new RotatedAxes(
                                    this.seats[0].looking.getYaw() + this.axes.getYaw(), this.axes.getPitch(),
                                    this.axes.getRoll());
                            pos = yawOnlyLooking.findLocalVectorGlobally(localPosition2);
                            velocity = yawOnlyLooking.findLocalVectorGlobally(emitter.velocity);
                        }

                        this.worldObj.spawnParticle(emitter.effectType, this.posX + (double) pos.x,
                                this.posY + (double) pos.y, this.posZ + (double) pos.z, velocity.x,
                                velocity.y, velocity.z);
                    }
                }

                this.emitterTimers[i] = emitter.emitRate;
            }
        }

        this.checkParts();
        this.prevRotationYaw = this.axes.getYaw();
        this.prevRotationPitch = this.axes.getPitch();
        this.prevRotationRoll = this.axes.getRoll();
        this.prevAxes = this.axes.clone();
        if (this.riddenByEntity != null && this.riddenByEntity.isDead) {
            this.riddenByEntity = null;
        }

        if (this.riddenByEntity != null && this.isDead) {
            this.riddenByEntity.mountEntity(null);
        }

        if (this.riddenByEntity != null) {
            this.riddenByEntity.fallDistance = 0.0F;
        }

        boolean canThrust = this.driverIsCreative() || this.driveableData.fuelInTank > 0.0F;
        if (this.seats[0] != null && this.seats[0].riddenByEntity == null || !canThrust
                && this.getDriveableType().maxThrottle != 0.0F && this.getDriveableType().maxNegativeThrottle != 0.0F) {
            this.throttle *= 0.98F;
        }

        if (this.seats[0] != null && this.seats[0].riddenByEntity == null) {
            this.rightMouseHeld = this.leftMouseHeld = false;
        }

        if (this.shootDelayPrimary > 0) {
            --this.shootDelayPrimary;
        }

        if (this.shootDelaySecondary > 0) {
            --this.shootDelaySecondary;
        }

        if (this.ticksExisted == 1) {
            this.setShootDelay(this.getDriveableType().placeTimePrimary, false);
            this.setShootDelay(this.getDriveableType().placeTimeSecondary, true);
            if (!this.worldObj.isRemote) {
                if (!this.getDriveableType().placeSoundPrimary.isEmpty()) {
                    PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0D, this.dimension,
                            this.getDriveableType().placeSoundPrimary, false);
                }

                if (!this.getDriveableType().placeSoundSecondary.isEmpty()) {
                    PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0D, this.dimension,
                            this.getDriveableType().placeSoundSecondary, false);
                }
            }
        }

        if (!this.worldObj.isRemote) {
            if (this.leftMouseHeld && this.getDriveableType().modePrimary == EnumFireMode.FULLAUTO) {
                this.shoot(false);
            }

            if (this.rightMouseHeld && this.getDriveableType().modeSecondary == EnumFireMode.FULLAUTO) {
                this.shoot(true);
            }

            this.minigunSpeedPrimary *= 0.9F;
            this.minigunSpeedSecondary *= 0.9F;
            if (this.leftMouseHeld && this.getDriveableType().modePrimary == EnumFireMode.MINIGUN) {
                this.minigunSpeedPrimary += 0.1F;
                if (this.minigunSpeedPrimary > 1.0F) {
                    this.shoot(false);
                }
            }

            if (this.rightMouseHeld && this.getDriveableType().modeSecondary == EnumFireMode.MINIGUN) {
                this.minigunSpeedSecondary += 0.1F;
                if (this.minigunSpeedSecondary > 1.0F) {
                    this.shoot(true);
                }
            }
        }

        int fuelMultiplier = 2;
        if (data.fuelInTank < (float) type.fuelTankSize) {
            for (int i1 = 0; i1 < data.getSizeInventory(); ++i1) {
                ItemStack stack = data.getStackInSlot(i1);
                if (stack != null && stack.stackSize > 0) {
                    Item item = stack.getItem();
                    if (data.engine.useRFPower) {
                    } else if (item instanceof ItemPart) {
                        PartType part = ((ItemPart) item).type;
                        if (part.category == 9) {
                            data.fuelInTank += (float) fuelMultiplier;
                            damage = stack.getItemDamage();
                            stack.setItemDamage(damage + 1);
                            if (damage >= stack.getMaxDamage()) {
                                stack.setItemDamage(0);
                                --stack.stackSize;
                                if (stack.stackSize <= 0) {
                                    data.setInventorySlotContents(i1, null);
                                }
                            }
                            break;
                        }
                    } else if (FlansMod.hooks.BuildCraftLoaded && stack.isItemEqual(FlansMod.hooks.BuildCraftOilBucket)
                            && data.fuelInTank + (float) (1000 * fuelMultiplier) <= (float) type.fuelTankSize) {
                        data.fuelInTank += (float) (1000 * fuelMultiplier);
                        data.setInventorySlotContents(i1, new ItemStack(Items.bucket));
                    } else if (FlansMod.hooks.BuildCraftLoaded && stack.isItemEqual(FlansMod.hooks.BuildCraftFuelBucket)
                            && data.fuelInTank + (float) (2000 * fuelMultiplier) <= (float) type.fuelTankSize) {
                        data.fuelInTank += (float) (2000 * fuelMultiplier);
                        data.setInventorySlotContents(i1, new ItemStack(Items.bucket));
                    }
                }
            }

        }
    }

    public void checkInventoryChanged() {
        DriveableType type = this.getDriveableType();
        if (type != null) {
            if (!this.worldObj.isRemote) {
                if (this.driveableData.inventoryChanged) {
                    this.driveableData.inventoryChanged = false;

                    try {
                        for (int ps = 0; ps < 2; ++ps) {
                            EnumWeaponType weaponType = ps == 0 ? type.primary : type.secondary;
                            if (weaponType == EnumWeaponType.GUN) {
                                weaponType = EnumWeaponType.NONE;
                            }

                            int istart = this.getInventoryStart(weaponType);
                            if (istart == this.driveableData.getAmmoInventoryStart()) {
                                istart += type.numPassengerGunners;
                            }

                            int isize = this.getInventorySize(weaponType);
                            if (istart >= 0 || isize > 0) {
                                if (this.prevInventoryItems[ps] == null) {
                                    this.prevInventoryItems[ps] = new ItemStack[isize];
                                }

                                int i;
                                for (i = 0; i < isize; ++i) {
                                    ItemStack itemStack = this.driveableData.getStackInSlot(istart + i);
                                    if (itemStack != null && itemStack.getItem() instanceof ItemBullet
                                            && (this.prevInventoryItems[ps][i] == null || !ItemStack
                                            .areItemStacksEqual(itemStack, this.prevInventoryItems[ps][i]))
                                            && type.isValidAmmo(((ItemBullet) itemStack.getItem()).type, weaponType)) {
                                        this.onWeaponInventoryChanged(ps == 1);
                                        break;
                                    }
                                }

                                for (i = 0; i < isize; ++i) {
                                    this.prevInventoryItems[ps][i] = this.driveableData.getStackInSlot(istart + i);
                                }
                            }
                        }
                    } catch (Exception var8) {
                        var8.printStackTrace();
                    }

                }
            }
        }
    }

    public void onWeaponInventoryChanged(boolean secondary) {
        DriveableType type = this.getDriveableType();
        if (!secondary) {
            if (type.reloadTimePrimary > 0 && this.getShootDelay(secondary) <= 0) {
                FlansMod.log("EntityDriveable Reload Primary " + type.reloadTimePrimary + " tick");
                this.setShootDelay(type.reloadTimePrimary, secondary);
                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0D, this.dimension,
                        this.getDriveableType().reloadSoundPrimary, false);
            }
        } else if (type.reloadTimeSecondary > 0 && this.getShootDelay(secondary) <= 0) {
            FlansMod.log("EntityDriveable Reload Secondary " + type.reloadTimeSecondary + " tick");
            this.setShootDelay(type.reloadTimeSecondary, secondary);
            PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0D, this.dimension,
                    this.getDriveableType().reloadSoundSecondary, false);
        }

    }

    public int getInventoryStart(EnumWeaponType wt) {
        switch (wt) {
            case BOMB:
            case MINE:
                return this.driveableData.getBombInventoryStart();
            case MISSILE:
            case SHELL:
                return this.driveableData.getMissileInventoryStart();
            case GUN:
            case NONE:
                return this.driveableData.getAmmoInventoryStart();
            default:
                return -1;
        }
    }

    public int getInventorySize(EnumWeaponType wt) {
        switch (wt) {
            case BOMB:
            case MINE:
                return this.driveableData.bombs.length;
            case MISSILE:
            case SHELL:
                return this.driveableData.missiles.length;
            case GUN:
            case NONE:
                return this.driveableData.ammo.length;
            default:
                return -1;
        }
    }

    public void checkForCollisions() {
        boolean damagePart = false;
        boolean crashInWater = false;
        double speed = this.getSpeedXYZ();
        Iterator var5 = this.getDriveableType().collisionPoints.iterator();

        while (true) {
            while (true) {
                DriveablePosition p;
                Vec3 currentPos;
                MovingObjectPosition hit;
                do {
                    do {
                        do {
                            if (!var5.hasNext()) {
                                if (damagePart && !this.worldObj.isRemote) {
                                    FlansMod.getPacketHandler().sendToAllAround(new PacketDriveableDamage(this),
                                            this.posX, this.posY, this.posZ, 100.0F, this.dimension);
                                }

                                return;
                            }

                            p = (DriveablePosition) var5.next();
                        } while (((DriveablePart) this.driveableData.parts.get(p.part)).dead);

                        Vector3f lastRelPos = this.prevAxes.findLocalVectorGlobally(p.position);
                        Vec3 lastPos = Vec3.createVectorHelper(this.prevPosX + (double) lastRelPos.x,
                                this.prevPosY + (double) lastRelPos.y, this.prevPosZ + (double) lastRelPos.z);
                        Vector3f currentRelPos = this.axes.findLocalVectorGlobally(p.position);
                        currentPos = Vec3.createVectorHelper(this.posX + (double) currentRelPos.x,
                                this.posY + (double) currentRelPos.y, this.posZ + (double) currentRelPos.z);
                        if (FlansMod.DEBUG && this.worldObj.isRemote) {
                            this.worldObj.spawnEntityInWorld(new EntityDebugVector(this.worldObj, new Vector3f(lastPos),
                                    Vector3f.sub(currentRelPos, lastRelPos, null), 10, 1.0F, 0.0F, 0.0F));
                        }

                        hit = this.worldObj.rayTraceBlocks(lastPos, currentPos, crashInWater);
                    } while (hit == null);
                } while (hit.typeOfHit != MovingObjectType.BLOCK);

                int x = hit.blockX;
                int y = hit.blockY;
                int z = hit.blockZ;
                Block blockHit = this.worldObj.getBlock(x, y, z);
                int meta = this.worldObj.getBlockMetadata(x, y, z);
                float blockHardness = blockHit.getBlockHardness(this.worldObj, x, y, z);
                float damage = blockHardness * blockHardness * (float) speed;
                if (null == blockHit.getCollisionBoundingBoxFromPool(this.worldObj, x, y, z)) {
                    damage = 0.0F;
                }

                if (damage > 0.0F) {
                    damagePart = true;
                }

                if (!this.attackPart(p.part, DamageSource.inWall, damage) && TeamsManager.driveablesBreakBlocks) {
                    this.worldObj.playAuxSFXAtEntity(null, 2001, x, y, z,
                            Block.getIdFromBlock(blockHit) + (meta << 12));
                    if (!this.worldObj.isRemote) {
                        blockHit.dropBlockAsItem(this.worldObj, x, y, z, meta, 1);
                        this.worldObj.setBlockToAir(x, y, z);
                    }
                } else {
                    this.worldObj.createExplosion(this, currentPos.xCoord, currentPos.yCoord, currentPos.zCoord, 1.0F,
                            false);
                }
            }
        }
    }

    protected void fall(float k) {
        double fallDist = (this.posY - this.prevPosY + this.motionY) / 2.0D;
        float damage = (float) (fallDist < -0.3D ? -fallDist * 50.0D : 0.0D);
        boolean no_damage = true;
        if (damage > 0.0F && this.invulnerableUnmountCount == 0 && this.ticksExisted > 20) {
            DriveableType type = this.getDriveableType();
            damage = (float) ((int) (damage * type.fallDamageFactor));
            this.attackPart(EnumDriveablePart.core, DamageSource.fall, damage);
            if (type.wheelPositions.length > 0) {
                this.attackPart(type.wheelPositions[0].part, DamageSource.fall, damage / 5.0F);
            }

            no_damage = false;
        }

    }

    public boolean attackPart(EnumDriveablePart ep, DamageSource source, float damage) {
        if (ep == EnumDriveablePart.core) {
            if (source.getSourceOfDamage() instanceof EntityLivingBase) {
                this.lastAtkEntity = source.getSourceOfDamage();
            } else if (source.getEntity() instanceof EntityLivingBase) {
                this.lastAtkEntity = source.getEntity();
            } else {
                this.lastAtkEntity = null;
            }
        }

        DriveablePart part = (DriveablePart) this.driveableData.parts.get(ep);
        return part.attack(damage, source.isFireDamage());
    }

    public Vector3f rotate(Vector3f inVec) {
        return this.axes.findLocalVectorGlobally(inVec);
    }

    public Vector3f rotate(Vec3 inVec) {
        return this.rotate(inVec.xCoord, inVec.yCoord, inVec.zCoord);
    }

    public Vector3f rotate(double x, double y, double z) {
        return this.rotate(new Vector3f((float) x, (float) y, (float) z));
    }

    public void rotateYaw(float rotateBy) {
        if (Math.abs(rotateBy) >= 0.01F) {
            this.axes.rotateLocalYaw(rotateBy);
            this.updatePrevAngles();
        }
    }

    public void rotatePitch(float rotateBy) {
        if (Math.abs(rotateBy) >= 0.01F) {
            this.axes.rotateLocalPitch(rotateBy);
            this.updatePrevAngles();
        }
    }

    public void rotateRoll(float rotateBy) {
        if (Math.abs(rotateBy) >= 0.01F) {
            this.axes.rotateLocalRoll(rotateBy);
            this.updatePrevAngles();
        }
    }

    public void updatePrevAngles() {
        double dYaw = this.axes.getYaw() - this.prevRotationYaw;
        if (dYaw > 180.0D) {
            this.prevRotationYaw += 360.0F;
        }

        if (dYaw < -180.0D) {
            this.prevRotationYaw -= 360.0F;
        }

        double dPitch = this.axes.getPitch() - this.prevRotationPitch;
        if (dPitch > 180.0D) {
            this.prevRotationPitch += 360.0F;
        }

        if (dPitch < -180.0D) {
            this.prevRotationPitch -= 360.0F;
        }

        double dRoll = this.axes.getRoll() - this.prevRotationRoll;
        if (dRoll > 180.0D) {
            this.prevRotationRoll += 360.0F;
        }

        if (dRoll < -180.0D) {
            this.prevRotationRoll -= 360.0F;
        }

    }

    public void setRotation(float rotYaw, float rotPitch, float rotRoll) {
        this.axes.setAngles(rotYaw, rotPitch, rotRoll);
    }

    public boolean isPartOfThis(Entity ent) {
        EntitySeat[] var2 = this.seats;
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            EntitySeat seat = var2[var4];
            if (seat != null) {
                if (ent == seat) {
                    return true;
                }

                if (seat.riddenByEntity == ent) {
                    return true;
                }
            }
        }

        return ent == this;
    }

    public float getShadowSize() {
        return 0.0F;
    }

    public DriveableType getDriveableType() {
        return DriveableType.getDriveable(this.driveableType);
    }

    public DriveableData getDriveableData() {
        return this.driveableData;
    }

    public boolean isDead() {
        return this.isDead;
    }

    public Entity getControllingEntity() {
        return this.seats[0].getControllingEntity();
    }

    public ItemStack getPickedResult(MovingObjectPosition target) {
        ItemStack stack = new ItemStack(this.getDriveableType().item, 1, 0);
        stack.stackTagCompound = new NBTTagCompound();
        this.driveableData.writeToNBT(stack.stackTagCompound);
        return stack;
    }

    public boolean hasFuel() {
        if (this.seats != null && this.seats[0] != null && this.seats[0].riddenByEntity != null) {
            return this.driverIsCreative() || this.driveableData.fuelInTank > 0.0F;
        } else {
            return false;
        }
    }

    public boolean hasEnoughFuel() {
        if (this.seats != null && this.seats[0] != null && this.seats[0].riddenByEntity != null) {
            return this.driverIsCreative()
                    || this.driveableData.fuelInTank > this.driveableData.engine.fuelConsumption * this.throttle;
        } else {
            return false;
        }
    }

    public double getSpeedXYZ() {
        return Math.sqrt(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
    }

    public double getSpeedXZ() {
        return Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
    }

    public boolean landVehicle() {
        return false;
    }

    public boolean gearDown() {
        return true;
    }

    public boolean onGround() {
        return this.onGround;
    }

    public ArrayList<BulletHit> attackFromBullet(Vector3f origin, Vector3f motion) {
        ArrayList<BulletHit> hits = new ArrayList();
        Vector3f relativePosVector = Vector3f.sub(origin,
                new Vector3f((float) this.posX, (float) this.posY, (float) this.posZ), null);
        Vector3f rotatedPosVector = this.axes.findGlobalVectorLocally(relativePosVector);
        Vector3f rotatedMotVector = this.axes.findGlobalVectorLocally(motion);
        Iterator var7 = this.getDriveableData().parts.values().iterator();

        while (var7.hasNext()) {
            DriveablePart part = (DriveablePart) var7.next();
            DriveableHit hit = part.rayTrace(this, rotatedPosVector, rotatedMotVector);
            if (hit != null) {
                hits.add(hit);
            }
        }

        return hits;
    }

    public float bulletHit(EntityBullet bullet, DriveableHit hit, float penetratingPower) {
        DriveablePart part = (DriveablePart) this.getDriveableData().parts.get(hit.part);
        part.hitByBullet(bullet, hit);
        if (!this.worldObj.isRemote) {
            this.checkParts();
            FlansMod.getPacketHandler().sendToAllAround(new PacketDriveableDamage(this), this.posX, this.posY,
                    this.posZ, 100.0F, this.dimension);
        }

        return penetratingPower - 5.0F;
    }

    public DriveablePart raytraceParts(Vector3f origin, Vector3f motion) {
        Vector3f relativePosVector = Vector3f.sub(origin,
                new Vector3f((float) this.posX, (float) this.posY, (float) this.posZ), null);
        Vector3f rotatedPosVector = this.axes.findGlobalVectorLocally(relativePosVector);
        Vector3f rotatedMotVector = this.axes.findGlobalVectorLocally(motion);
        Iterator var6 = this.getDriveableData().parts.values().iterator();

        DriveablePart part;
        do {
            if (!var6.hasNext()) {
                return null;
            }

            part = (DriveablePart) var6.next();
        } while (part.rayTrace(this, rotatedPosVector, rotatedMotVector) == null);

        return part;
    }

    public boolean canHitPart(EnumDriveablePart part) {
        return true;
    }

    public void checkParts() {
        Iterator var1 = this.getDriveableData().parts.values().iterator();

        while (var1.hasNext()) {
            DriveablePart part = (DriveablePart) var1.next();
            if (part != null && !part.dead && part.health <= 0 && part.maxHealth > 0) {
                this.killPart(part);
            }
        }

        EntitySeat[] var5 = this.seats;
        int var7 = var5.length;

        int i;
        for (i = 0; i < var7; ++i) {
            EntitySeat var10000 = var5[i];
        }

        if (((DriveablePart) this.getDriveableData().parts.get(EnumDriveablePart.core)).dead) {
            int seatNum = this.seats.length;
            DriveableType type = this.getDriveableType();
            if (!this.worldObj.isRemote) {
                for (i = 0; i < seatNum; ++i) {
                    if (this.seats[i].riddenByEntity != null && this.seats[i].riddenByEntity instanceof EntityPlayer) {
                        Entity entity = this.seats[i].riddenByEntity;
                        this.seats[i].riddenByEntity.mountEntity(null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            entity.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer) this.lastAtkEntity),
                                    1.0E7F);
                        } else if (this.lastAtkEntity instanceof EntityLivingBase) {
                            entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase) this.lastAtkEntity),
                                    1.0E7F);
                        }
                    }
                }

                if (type.isExplosionWhenDestroyed) {
                    this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 4.0F, false);
                }

                Iterator var9 = this.driveableData.parts.values().iterator();

                while (var9.hasNext()) {
                    DriveablePart part = (DriveablePart) var9.next();
                    if (part.health > 0 && !part.dead) {
                        this.killPart(part);
                    }
                }
            }

            this.setDead();
        }

    }

    public void checkPartsWhenAttacked() {
        Iterator var1 = this.getDriveableData().parts.values().iterator();

        while (var1.hasNext()) {
            DriveablePart part = (DriveablePart) var1.next();
            if (part != null && !part.dead && part.health <= 0 && part.maxHealth > 0) {
                this.killPart(part);
            }
        }

    }

    private void killPart(DriveablePart part) {
        if (!part.dead) {
            part.health = 0;
            part.dead = true;
            DriveableType type = this.getDriveableType();
            int i;
            if (!this.worldObj.isRemote) {
                Vector3f pos = new Vector3f(0.0F, 0.0F, 0.0F);
                if (part.box != null) {
                    pos = this.axes.findLocalVectorGlobally(new Vector3f(part.box.x / 16.0F + part.box.w / 32.0F,
                            part.box.y / 16.0F + part.box.h / 32.0F, part.box.z / 16.0F + part.box.d / 32.0F));
                }

                ArrayList<ItemStack> drops = type.getItemsRequired(part, this.getDriveableData().engine);
                ItemStack stack;
                if (drops != null) {
                    Iterator var5 = drops.iterator();

                    while (var5.hasNext()) {
                        stack = (ItemStack) var5.next();
                        this.worldObj.spawnEntityInWorld(new EntityItem(this.worldObj, this.posX + (double) pos.x,
                                this.posY + (double) pos.y, this.posZ + (double) pos.z, stack.copy()));
                    }
                }

                this.dropItemsOnPartDeath(pos, part);
                if (part.type == EnumDriveablePart.core) {
                    for (i = 0; i < this.getDriveableData().getSizeInventory(); ++i) {
                        stack = this.getDriveableData().getStackInSlot(i);
                        if (stack != null) {
                            this.worldObj.spawnEntityInWorld(new EntityItem(this.worldObj,
                                    this.posX + this.rand.nextGaussian(), this.posY + this.rand.nextGaussian(),
                                    this.posZ + this.rand.nextGaussian(), stack));
                        }
                    }
                }
            }

            EnumDriveablePart[] var7 = part.type.getChildren();
            int var8 = var7.length;

            for (i = 0; i < var8; ++i) {
                EnumDriveablePart child = var7[i];
                this.killPart((DriveablePart) this.getDriveableData().parts.get(child));
            }

        }
    }

    protected abstract void dropItemsOnPartDeath(Vector3f var1, DriveablePart var2);

    public float getPlayerRoll() {
        return this.axes.getRoll();
    }

    public void explode() {
    }

    public float getCameraDistance() {
        return this.getDriveableType().cameraDistance;
    }

    public boolean isPartIntact(EnumDriveablePart part) {
        DriveablePart thisPart = (DriveablePart) this.getDriveableData().parts.get(part);
        return thisPart.maxHealth == 0 || thisPart.health > 0;
    }

    public abstract boolean hasMouseControlMode();

    public abstract String getBombInventoryName();

    public abstract String getMissileInventoryName();

    public boolean rotateWithTurret(Seat seat) {
        return seat.part == EnumDriveablePart.turret;
    }

    public String getCommandSenderName() {
        return this.getDriveableType().name;
    }

    @SideOnly(Side.CLIENT)
    public boolean showInventory(int seat) {
        return seat != 0 || !FlansModClient.controlModeMouse;
    }

    public int getShootDelay(boolean secondary) {
        return secondary ? this.shootDelaySecondary : this.shootDelayPrimary;
    }

    public float getMinigunSpeed(boolean secondary) {
        return secondary ? this.minigunSpeedSecondary : this.minigunSpeedPrimary;
    }

    public int getCurrentGun(boolean secondary) {
        return secondary ? this.currentGunSecondary : this.currentGunPrimary;
    }

    public void setShootDelay(int i, boolean secondary) {
        if (secondary) {
            this.shootDelaySecondary = i > this.shootDelaySecondary ? i : this.shootDelaySecondary;
        } else {
            this.shootDelayPrimary = i > this.shootDelayPrimary ? i : this.shootDelayPrimary;
        }

    }

    public void setMinigunSpeed(float f, boolean secondary) {
        if (secondary) {
            this.minigunSpeedSecondary = f;
        } else {
            this.minigunSpeedPrimary = f;
        }

    }

    public void setCurrentGun(int i, boolean secondary) {
        if (secondary) {
            this.currentGunSecondary = i;
        } else {
            this.currentGunPrimary = i;
        }

    }

    public void setEntityMarker(int tick) {
        this.isShowedPosition = true;
        this.tickCount = tick;
    }
}
