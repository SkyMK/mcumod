/*
 * package com.flansmod.common.guns;
 *
 * import co.uk.flansmods.vintarz.;
 *
 * import com.google.common.io.ByteArrayDataInput; import
 * cpw.mods.fml.common.registry.IEntityAdditionalSpawnData; import
 * cpw.mods.fml.relauncher.Side; import java.util.Iterator; import
 * java.util.List; import java.util.Random; import net.minecraft.entity.Entity;
 * import net.minecraft.entity.EntityLivingBase; import
 * net.minecraft.entity.item.EntityItem; import
 * net.minecraft.entity.player.EntityPlayer; import
 * net.minecraft.entity.player.EntityPlayerMP;
 *
 * public class EntityBulletCopy extends Entity implements
 * IEntityAdditionalSpawnData { public static final float SPREAD_MODIFIER =
 * 0.5f; public static final Random bulletRng = new Random(); public static
 * boolean FOOL; public static float HITBOX_EXTEND; public Entity owner; public
 * BulletType type; public InfoType firedFrom; public float damage; public
 * boolean shotgun = false; private double distance = 150.0; private float
 * speed; public int ping; public int skipX; public int skipY = -1; public int
 * skipZ; public float slowdown; private final Random deflectionRng = new
 * Random();
 *
 * public static float getDamageModifierForBlock(pzdr pzdr2) { if (pzdr2 ==
 * pzdr.field_72003_bq) { return 0.9f; } if (pzdr2 == pzdr.field_72031_aZ ||
 * pzdr2 == pzdr.field_72002_bp || pzdr2 == pzdr.field_72098_bB) { return 0.9f;
 * } if (pzdr2 == pzdr.field_72054_aE || pzdr2.getClass() == pzfb.class || pzdr2
 * instanceof iure) { return 0.75f; } if (pzdr2 instanceof DecoBlock) { return
 * 0.5f; } return 0.0f; }
 *
 * public EntityBullet(loor loor2) { super(loor2); this.setSize(0.1f, 0.1f); }
 *
 * private EntityBullet(loor loor2, EntityLivingBase entityLivingBase, float f,
 * BulletType bulletType, InfoType infoType) { this(loor2); this.noClip = true;
 * this.owner = entityLivingBase; this.type = bulletType; this.firedFrom =
 * infoType; this.damage = f; }
 *
 * public EntityBullet(EntityPlayer entityPlayer, int n, FlansModPlayerData
 * flansModPlayerData, float f, float f2, BulletType bulletType, float f3,
 * boolean bl, float f4, InfoType infoType, long l) {
 * this(entityPlayer.worldObj, (EntityLivingBase)entityPlayer, f2, bulletType,
 * infoType); this.speed = f3; this.slowdown = f4; this.yOffset = 0.0f; f *=
 * 0.5f; this.shotgun = bl; this.ping = n; double d =
 * entityPlayer.getEyeHeight(); if (this.worldObj.isRemote) { d = 0.0; }
 * this.posX = entityPlayer.posX; this.posZ = entityPlayer.posZ; this.posY =
 * entityPlayer.posY; this.rotationYaw = entityPlayer.rotationYaw;
 * this.rotationPitch = entityPlayer.rotationPitch + 90.0f; this.posY += 0.12 *
 * (- Math.sin((double)(this.rotationPitch / 180.0f * 3.141593f)));
 * this.rotationYaw = entityPlayer.rotationYaw; double d2 =
 * Math.cos((double)(this.rotationPitch / 180.0f * 3.141593f)); this.posX += d2
 * * 0.12 * (- Math.sin((double)(this.rotationYaw / 180.0f * 3.141593f)));
 * this.posZ += d2 * 0.12 * Math.cos((double)(this.rotationYaw / 180.0f *
 * 3.141593f)); if (!flansModPlayerData.isAiming) { this.rotationYaw =
 * entityPlayer.rotationYaw + 90.0f; this.posX += 0.15 * (-
 * Math.sin((double)(this.rotationYaw / 180.0f * 3.141593f))); this.posZ += 0.15
 * * Math.cos((double)(this.rotationYaw / 180.0f * 3.141593f)); }
 * this.rotationYaw = entityPlayer.rotationYaw; this.rotationPitch =
 * entityPlayer.rotationPitch; this.setLocationAndAngles(this.posX, this.posY +
 * d, this.posZ, this.rotationYaw, this.rotationPitch); double d3 =
 * (bulletRng.nextDouble() - 0.5) * 2.0; d3 *= Math.abs((double)d3);
 * this.rotationPitch = (float)((double)this.rotationPitch + d3 * (double)f); d3
 * = Math.sqrt((double)(1.0 - d3 * d3)); double d4 = (bulletRng.nextDouble() -
 * 0.5) * 2.0; d4 *= Math.abs((double)d4); d4 = d4 * d3 * (double)f / 180.0 *
 * 3.141592653589793; this.motionX = (- Math.sin((double)(this.rotationYaw /
 * 180.0f * 3.141593f))) * Math.cos((double)(this.rotationPitch / 180.0f *
 * 3.141593f)); this.motionZ = Math.cos((double)(this.rotationYaw / 180.0f *
 * 3.141593f)) * Math.cos((double)(this.rotationPitch / 180.0f * 3.141593f));
 * this.motionY = - Math.sin((double)(this.rotationPitch / 180.0f * 3.141593f));
 * this.motionX -= Math.sin((double)((this.rotationYaw + 90.0f) / 180.0f *
 * 3.141593f)) * Math.tan((double)d4); this.motionZ +=
 * Math.cos((double)((this.rotationYaw + 90.0f) / 180.0f * 3.141593f)) *
 * Math.tan((double)d4); d2 = Math.sqrt((double)(this.motionX * this.motionX +
 * this.motionY * this.motionY + this.motionZ * this.motionZ)); this.motionX /=
 * d2; this.motionY /= d2; this.motionZ /= d2; this.motionX *= (double)f3;
 * this.motionY *= (double)f3; this.motionZ *= (double)f3; float f5 =
 * (float)Math.sqrt((double)(this.motionX * this.motionX + this.motionZ *
 * this.motionZ)); this.prevRotationYaw = this.rotationYaw =
 * (float)(Math.atan2((double)this.motionX, (double)this.motionZ) * 180.0 /
 * 3.1415927410125732); this.prevRotationPitch = this.rotationPitch =
 * (float)(Math.atan2((double)this.motionY, (double)f5) * 180.0 /
 * 3.1415927410125732); this.deflectionRng.setSeed(l); this.doAttack(); }
 *
 * public EntityBullet(loor loor2, amzr amzr2, float f, float f2,
 * EntityLivingBase entityLivingBase, float f3, float f4, BulletType bulletType,
 * InfoType infoType) { this(loor2, amzr2, f, f2, entityLivingBase, f3, f4,
 * bulletType, 7.0f, infoType); this.doAttack(); }
 *
 * public EntityBullet(loor loor2, amzr amzr2, float f, float f2,
 * EntityLivingBase entityLivingBase, float f3, float f4, BulletType bulletType,
 * float f5, InfoType infoType) { this(loor2, entityLivingBase, f4, bulletType,
 * infoType); this.damage = f4; this.setLocationAndAngles(amzr2._c, amzr2._d,
 * amzr2._e, f, f2); this.posX -= Math.cos((double)(this.rotationYaw / 180.0f *
 * 3.141593f)) * 0.0; this.posY -= 0.0; this.posZ -=
 * Math.sin((double)(this.rotationYaw / 180.0f * 3.141593f)) * 0.0; this.motionX
 * = (- Math.sin((double)(this.rotationYaw / 180.0f * 3.141593f))) *
 * Math.cos((double)(this.rotationPitch / 180.0f * 3.141593f)); this.motionZ =
 * Math.cos((double)(this.rotationYaw / 180.0f * 3.141593f)) *
 * Math.cos((double)(this.rotationPitch / 180.0f * 3.141593f)); this.motionY = -
 * Math.sin((double)(this.rotationPitch / 180.0f * 3.141593f));
 * this.setArrowHeading(this.motionX, this.motionY, this.motionZ, f3, f5); }
 *
 * public EntityBullet(loor loor2, Vector3f vector3f, Vector3f vector3f2,
 * EntityLivingBase entityLivingBase, float f, float f2, BulletType bulletType,
 * float f3, InfoType infoType) { this(loor2, entityLivingBase, f2, bulletType,
 * infoType); this.damage = f2; this.setPosition((double)vector3f.x,
 * (double)vector3f.y, (double)vector3f.z); this.motionX = vector3f2.x;
 * this.motionY = vector3f2.y; this.motionZ = vector3f2.z;
 * this.setArrowHeading(this.motionX, this.motionY, this.motionZ, f, f3);
 * this.doAttack(); }
 *
 * public EntityBullet(loor loor2, amzr amzr2, float f, float f2, double d,
 * double d2, double d3, EntityLivingBase entityLivingBase, float f3, BulletType
 * bulletType, InfoType infoType) { this(loor2); this.shotgun = false; this.type
 * = bulletType; this.firedFrom = infoType; this.owner = entityLivingBase;
 * this.damage = f3; this.setLocationAndAngles(amzr2._c, amzr2._d, amzr2._e, f,
 * f2); this.setPosition(this.posX, this.posY, this.posZ); this.motionX = d;
 * this.motionY = d2; this.motionZ = d3; this.doAttack(); }
 *
 * private void doAttack() { if (HCS.doAttack((EntityBullet) this)) { if
 * (this.type.explosion > 0) { if (!this.worldObj.isRemote) {
 * this.worldObj.spawnEntityInWorld((Entity) this); } } else { this.onUpdate();
 * if (this.isDead) { return; } if (!this.worldObj.isRemote) {
 * this.worldObj.spawnEntityInWorld((Entity) this); } else {
 * FlansModClient.clientBullets.add((Object) this); } } } }
 *
 * protected void entityInit() { }
 *
 * public void setArrowHeading(double d, double d2, double d3, float f, float
 * f2) { float f3 = (float) Math.sqrt((double) (d * d + d2 * d2 + d3 * d3)); d
 * /= (double) f3; d2 /= (double) f3; d3 /= (double) f3; f3 = (float)
 * Math.sqrt((double) (d * (d += this.rand.nextGaussian() * 0.005 * (double) f)
 * + d2 * (d2 += this.rand.nextGaussian() * 0.005 * (double) f) + d3 * (d3 +=
 * this.rand.nextGaussian() * 0.005 * (double) f))); d /= (double) f3; d2 /=
 * (double) f3; d3 /= (double) f3; this.motionX = d *= (double) f2; this.motionY
 * = d2 *= (double) f2; this.motionZ = d3 *= (double) f2; float f4 = (float)
 * Math.sqrt((double) (d * d + d3 * d3)); this.prevRotationYaw =
 * this.rotationYaw = (float) (Math.atan2((double) d, (double) d3) * 180.0 /
 * 3.1415927410125732); this.prevRotationPitch = this.rotationPitch = (float)
 * (Math.atan2((double) d2, (double) f4) * 180.0 / 3.1415927410125732); }
 *
 * public void setVelocity(double d, double d2, double d3) { this.motionX = d;
 * this.motionY = d2; this.motionZ = d3; if (this.prevRotationPitch == 0.0f &&
 * this.prevRotationYaw == 0.0f) { float f = (float) Math.sqrt((double) (d * d +
 * d3 * d3)); this.prevRotationYaw = this.rotationYaw = (float)
 * (Math.atan2((double) d, (double) d3) * 180.0 / 3.1415927410125732);
 * this.prevRotationPitch = this.rotationPitch = (float) (Math.atan2((double)
 * d2, (double) f) * 180.0 / 3.1415927410125732);
 * this.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw,
 * this.rotationPitch); } }
 *
 * public void onUpdate() { if (this.ticksExisted > 0 && this.firedFrom
 * instanceof GunType) { double d =
 * this.worldObj.func_72803_f(wmvy._c((double)this.posX),
 * wmvy._c((double)this.posY), wmvy._c((double)this.posZ)) == piho._h ?
 * 0.800000011920929 : Math.min((double)(1.0 - (double)this.slowdown * 0.01),
 * (double)1.0); this.motionY = FOOL ? (this.motionY +=
 * (double)this.type.fallSpeed * 0.3) : (this.motionY -=
 * (double)this.type.fallSpeed * 0.2); this.motionX *= d; this.motionY *= d;
 * this.motionZ *= d; } try { Object object; double d; Object object2; eics
 * eics2; Iterator iterator; double d2; float f = 1.0f; boolean bl = false;
 * double d3 = Math.sqrt((double)(this.motionX * this.motionX + this.motionY *
 * this.motionY + this.motionZ * this.motionZ)); float f2 = this.speed == 0.0f ?
 * 1.0f : (float)Math.min((double)(d3 / (double)this.speed), (double)1.0); amzr
 * amzr2 = this.worldObj.func_82732_R()._a(this.posX, this.posY, this.posZ);
 * amzr amzr3 = this.worldObj.func_82732_R()._a(this.posX + this.motionX,
 * this.posY + this.motionY, this.posZ + this.motionZ); eics eics3 =
 * this.rayTraceBlocks(amzr2, amzr3); amzr2 =
 * this.worldObj.func_82732_R()._a(this.posX, this.posY, this.posZ); amzr3 =
 * this.worldObj.func_82732_R()._a(this.posX + this.motionX, this.posY +
 * this.motionY, this.posZ + this.motionZ); if (eics3 != null) { pzdr pzdr2 =
 * (pzdr)eics3._i; f = EntityBullet.getDamageModifierForBlock(pzdr2); amzr3 =
 * eics3._f; if (f != 1.0f) { boolean bl2 = bl = pzdr2 != pzdr.field_72003_bq;
 * if (!this.worldObj.isRemote) {
 * PacketDispatcher.sendPacketToAllAround((double)this.posX, (double)this.posY,
 * (double)this.posZ, (double)64.0, (int)this.worldObj.getWorldInfo()._j(),
 * (yugu)PacketBullet.buildPacket((double)amzr3._c, (double)amzr3._d,
 * (double)amzr3._e, (double)this.prevPosX, (double)this.prevPosY,
 * (double)this.prevPosZ, (eics)eics3, (Entity)this.owner, (float)this.damage,
 * (boolean)false)); } } } double d4 = amzr2._d(amzr3); List list =
 * this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this,
 * pzer.getBoundingBox((double)(Math.min((double)amzr2._c, (double)amzr3._c) -
 * 0.1), (double)(Math.min((double)amzr2._d, (double)amzr3._d) - 0.1),
 * (double)(Math.min((double)amzr2._e, (double)amzr3._e) - 0.1),
 * (double)(Math.max((double)amzr2._c, (double)amzr3._c) + 0.1),
 * (double)(Math.max((double)amzr2._d, (double)amzr3._d) + 0.1),
 * (double)(Math.max((double)amzr2._e, (double)amzr3._e) + 0.1)), (jhmr)new );
 * for (Entity entity : list) { object2 =
 * entity.boundingBox.calculateIntercept(amzr2, amzr3); if (object2 == null ||
 * (d = amzr2._d(object2._f)) >= d4) continue; eics3 = object2; eics3._g =
 * entity; eics3._a = hrmo._b; d4 = d; } if (eics3 != null) { amzr3 = eics3._f;
 * } try { iterator =
 * .TiProebal.rayTracePlayers((EntityPlayerMP)((EntityPlayerMP)this.owner),
 * (long)this.ping, (amzr)amzr2, (amzr)amzr3); } catch (Throwable throwable) {
 * for (Object object3 : this.worldObj.loadedEntityList) { if (object3 ==
 * this.owner || !(object3 instanceof EntityPlayer) || !(object =
 * (EntityPlayer)object3).isEntityAlive() || (eics2 =
 * object.boundingBox.expand((double)HITBOX_EXTEND, (double)HITBOX_EXTEND,
 * (double)HITBOX_EXTEND).calculateIntercept(amzr2, amzr3)) == null || (d2 =
 * amzr2._d(eics2._f)) >= d4) continue; eics3 = eics2; eics3._g = object;
 * eics3._a = hrmo._b; d4 = d2; } iterator = null; } if (iterator != null) {
 * eics3 = iterator.hit; } if (eics3 != null) { amzr3 = eics3._f; } for (int i =
 * 0; i < this.worldObj.loadedEntityList.size(); ++i) { Object object3; object2
 * = this.worldObj.loadedEntityList.get(i); if (!(object2 instanceof
 * EntityDriveable) || !(object3 = (EntityDriveable)object2).isEntityAlive() ||
 * object3.isPartOfThis(this.owner) ||
 * (double)this.getDistanceToEntity((Entity)object3) >
 * Math.sqrt((double)this.getDistanceSq(amzr3._c, amzr3._d, amzr3._e)))
 * continue; eics2 = new Vector3f((float)this.motionX, (float)this.motionY,
 * (float)this.motionZ); d2 = eics2.length(); eics2.normalise(); Vector3f
 * vector3f = new Vector3f((float)this.posX, (float)this.posY,
 * (float)this.posZ); int n = 0; while ((double)n < d2) { if (vector3f.x <=
 * -147.0f || this.posX >= 163.0 || this.posZ <= -156.0 || this.posZ >= 153.0 ||
 * this.posY <= 10.0) { object = object3.attackFromBullet(this, vector3f,
 * (Vector3f)eics2); if (object != null) { this.prevPosX = this.posX;
 * this.prevPosY = this.posY; this.prevPosZ = this.posZ; this.posX = vector3f.x;
 * this.posY = vector3f.y; this.posZ = vector3f.z; if (!this.worldObj.isRemote)
 * { if (this.ticksExisted == 0 && this.owner instanceof EntityPlayer) {
 * iwab._I().__ag()._a((EntityPlayer)this.owner, this.posX, this.posY,
 * this.posZ, 64.0, this.worldObj.getWorldInfo()._j(),
 * PacketBullet.buildPacket((double)this.posX, (double)this.posY,
 * (double)this.posZ, (double)this.prevPosX, (double)this.prevPosY,
 * (double)this.prevPosZ, (eics)eics3, (Entity)this.owner, (float)this.damage,
 * (boolean)false)); } if (this.owner instanceof Player) {
 * PacketDispatcher.sendPacketToPlayer((yugu)PacketHit.buildPacket((boolean)
 * false), (Player)((Player)this.owner)); } } this.setDead(); return; }
 * vector3f.translate(eics2.x, eics2.y, eics2.z); } ++n; } } if
 * (!this.worldObj.isRemote && eics3 != null && eics3._g instanceof
 * EntityPlayer) { EntityPlayer entityPlayer = (EntityPlayer)eics3._g; if
 * (entityPlayer.capabilities._a || this.owner instanceof EntityPlayer &&
 * !((EntityPlayer)this.owner).canAttackPlayer(entityPlayer)) { eics3 = null; }
 * } double d5 = this.posX; d = this.posY; double d6 = this.posZ; this.posX =
 * amzr3._c; this.posY = amzr3._d; this.posZ = amzr3._e; if (eics3 != null &&
 * eics3._g != null) { this.prevPosX = d5; this.prevPosY = d; this.prevPosZ =
 * d6; if (!this.worldObj.isRemote) { boolean bl3; ExtendedDamageSource.BodyPart
 * bodyPart; DamageMultiplier damageMultiplier; Entity entity; Object object4;
 * entity = eics3._g; bl3 = false; if (iterator != null && entity instanceof
 * EntityPlayerMP) { object4 = (EntityPlayerMP)entity; try { bodyPart =
 * .TiProebal.getHitBodyPart((PlayerRayTraceResult)iterator, (Entity)object4);
 * bl3 = bodyPart == ExtendedDamageSource.BodyPart.HEAD; damageMultiplier =
 * .TiProebal.getBulletDamage((EntityPlayer)object4, (EntityBullet)this,
 * (PlayerRayTraceResult)iterator, (ExtendedDamageSource.BodyPart)bodyPart); if
 * (damageMultiplier != null) { f2 *= damageMultiplier.value; } } catch
 * (Throwable throwable) {} } else if (entity instanceof EntityZombieHead ||
 * entity instanceof EntityCrawler) { if (HCS.isHardcoreServer()) { this.damage
 * *= 2.5f; } } else { object4 = tupl._b((Entity)entity); if (object4 != null &&
 * object4.startsWith("mcheli.MCH.E.")) { this.damage /= 2.0f; } } float f3 =
 * this.damage * this.type.damageVsLiving; bodyPart = this.owner == null ?
 * jgqv.generic : this.getBulletDamage(bl3); .TiProebal.resetDamage(); if (f3 ==
 * 0.0f && entity instanceof EntityPlayerMP &&
 * TeamsManager.getInstance().currentGametype != null) {
 * TeamsManager.getInstance().currentGametype.playerAttacked((EntityPlayerMP)
 * entity, (jgqv)bodyPart); } if (entity.attackEntityFrom((jgqv)bodyPart, f3 *
 * f2) && entity instanceof EntityLivingBase) {
 * ++((EntityLivingBase)entity).arrowHitTimer;
 * ((EntityLivingBase)entity).hurtResistantTime = 0; if (this.owner instanceof
 * EntityPlayer) { if (entity instanceof EntityPlayer &&
 * ((EntityPlayer)entity).getHealth() <= 0.0f &&
 * ((EntityPlayer)this.owner).getCurrentEquippedItem()._a() instanceof ItemGun)
 * { damageMultiplier = ((EntityPlayer)this.owner).getCurrentEquippedItem(); if
 * (damageMultiplier._e._c("kills")) { int n = damageMultiplier._e._f("kills");
 * damageMultiplier._e._a("kills", ++n); } else {
 * damageMultiplier._e._a("kills", 1); } } if (this.owner instanceof Player) {
 * PacketDispatcher.sendPacketToPlayer((yugu)PacketHit.buildPacket((boolean)
 * false), (Player)((Player)this.owner)); } } } int n = Math.max((int)1,
 * (int)((int)(this.damage / 2.0f)));
 * PacketDispatcher.sendPacketToAllAround((double)amzr3._c, (double)amzr3._d,
 * (double)amzr3._e, (double)128.0, (int)this.worldObj.getWorldInfo()._j(),
 * (yugu)PacketFlak.buildFlakPacket((double)amzr3._c, (double)amzr3._d,
 * (double)amzr3._e, (int)n, (String)"tilecrack_35_14", (double)(this.motionX /
 * 512.0), (double)(this.motionY / 512.0), (double)(this.motionZ / 512.0))); if
 * (this.ticksExisted == 0) {
 * PacketDispatcher.sendPacketToAllAround((double)this.posX, (double)this.posY,
 * (double)this.posZ, (double)64.0, (int)this.worldObj.getWorldInfo()._j(),
 * (yugu)PacketBullet.buildPacket((double)this.posX, (double)this.posY,
 * (double)this.posZ, (double)d5, (double)d, (double)d6, (eics)eics3,
 * (Entity)this.owner, (float)this.damage, (boolean)false)); } } this.setDead();
 * return; } if (eics3 != null && eics3._a == hrmo._a) { boolean bl4;
 * this.prevPosX = d5; this.prevPosY = d; this.prevPosZ = d6; boolean bl5 = bl4
 * = f == 0.0f; if (this.worldObj.isRemote) {
 * Util.clientBulletEffects((eics)eics3, (EntityBullet)this, (boolean)false); }
 * else if (this.ticksExisted == 0) {
 * PacketDispatcher.sendPacketToAllAround((double)this.posX, (double)this.posY,
 * (double)this.posZ, (double)64.0, (int)this.worldObj.getWorldInfo()._j(),
 * (yugu)PacketBullet.buildPacket((double)this.posX, (double)this.posY,
 * (double)this.posZ, (double)d5, (double)d, (double)d6, (eics)eics3,
 * (Entity)this.owner, (float)this.damage, (boolean)bl4)); } if (bl4) {
 * this.setDead(); return; } this.motionX *= (double)f; this.motionY *=
 * (double)f; this.motionZ *= (double)f; if (bl) { this.motionX +=
 * (this.deflectionRng.nextDouble() - 0.5) * (0.1 + d3 / 30.0); this.motionY +=
 * (this.deflectionRng.nextDouble() - 0.5) * (0.1 + d3 / 30.0); this.motionZ +=
 * (this.deflectionRng.nextDouble() - 0.5) * (0.1 + d3 / 30.0); } if (this.posY
 * > 256.0 || this.posY < 0.0 || this.speed < 0.5f || (this.distance -=
 * (double)this.speed) < 0.0) { this.setDead(); return; } if
 * (this.worldObj.isRemote) { Util.clientBulletUpdate((EntityBullet)this); }
 * else if (this.ticksExisted == 0) {
 * iwab._I().__ag()._a((EntityPlayer)this.owner, this.posX, this.posY,
 * this.posZ, 32.0, this.worldObj.getWorldInfo()._j(),
 * PacketBullet.buildPacket((double)this.posX, (double)this.posY,
 * (double)this.posZ, (double)this.prevPosX, (double)this.prevPosY,
 * (double)this.prevPosZ, (eics)null, (Entity)this.owner, (float)this.damage,
 * (boolean)true)); } return; } this.posX = d5; this.posY = d; this.posZ = d6;
 * this.skipY = -1; this.prevPosX = this.posX; this.prevPosY = this.posY;
 * this.prevPosZ = this.posZ; this.posX += this.motionX; this.posY +=
 * this.motionY; this.posZ += this.motionZ; this.setPosition(this.posX,
 * this.posY, this.posZ); if (this.posY > 256.0 || this.posY < 0.0 || d3 < 0.5
 * || (this.distance -= d3) < 0.0) { this.setDead(); return; } if
 * (!this.worldObj.isRemote) { float f4 = (float)Math.sqrt((double)(this.motionX
 * * this.motionX + this.motionZ * this.motionZ)); this.rotationYaw =
 * (float)(Math.atan2((double)this.motionX, (double)this.motionZ) * 180.0 /
 * 3.1415927410125732); this.rotationPitch =
 * (float)(Math.atan2((double)this.motionY, (double)f4) * 180.0 /
 * 3.1415927410125732); } } catch (Exception exception) { this.setDead();
 * return; } if (this.worldObj.isRemote) {
 * Util.clientBulletUpdate((EntityBullet)this); } else if (this.ticksExisted ==
 * 0) { iwab._I().__ag()._a((EntityPlayer)this.owner, this.posX, this.posY,
 * this.posZ, 32.0, this.worldObj.getWorldInfo()._j(),
 * PacketBullet.buildPacket((double)this.posX, (double)this.posY,
 * (double)this.posZ, (double)this.prevPosX, (double)this.prevPosY,
 * (double)this.prevPosZ, (eics)null, (Entity)this.owner, (float)this.damage,
 * (boolean)true)); } }
 *
 * private eics rayTraceBlocks(amzr amzr2, amzr amzr3) { if
 * (!(Double.isNaN((double) amzr2._c) || Double.isNaN((double) amzr2._d) ||
 * Double.isNaN((double) amzr2._e))) { if (!(Double.isNaN((double) amzr3._c) ||
 * Double.isNaN((double) amzr3._d) || Double.isNaN((double) amzr3._e))) { int n;
 * int n2; int n3 = wmvy._c((double) amzr3._c); int n4 = wmvy._c((double)
 * amzr3._d); int n5 = wmvy._c((double) amzr3._e); int n6 = wmvy._c((double)
 * amzr2._c); int n7 = wmvy._c((double) amzr2._d); int n8 = wmvy._c((double)
 * amzr2._e); if (this.skipY != n7 && this.skipX != n6 && this.skipZ != n8) { n2
 * = this.worldObj.func_72798_a(n6, n7, n8); n =
 * this.worldObj.getBlockMetadata(n6, n7, n8); pzdr pzdr2 =
 * pzdr.field_71973_m[n2]; if (pzdr2 != null) { eics eics2; piho piho2 =
 * pzdr2.field_72018_cp; if (pzdr2.func_71935_l() && (piho2._a() || piho2 !=
 * piho._j && piho2 != piho._F && piho2 != piho._k && piho2 != piho._l && piho2
 * != piho._q) && (pzdr2.func_71872_e(this.worldObj, n6, n7, n8) != null ||
 * pzdr2.func_71913_a(n, true)) && (eics2 = pzdr2.func_71878_a(this.worldObj,
 * n6, n7, n8, amzr2, amzr3)) != null) { eics2._i = pzdr2; this.skipX = n6;
 * this.skipY = n7; this.skipZ = n8; return eics2; } } } n2 = 200; while (n2--
 * >= 0) { eics eics3; int n9; if (Double.isNaN((double) amzr2._c) ||
 * Double.isNaN((double) amzr2._d) || Double.isNaN((double) amzr2._e)) { return
 * null; } if (n6 == n3 && n7 == n4 && n8 == n5) { return null; } n = 1; boolean
 * bl = true; boolean bl2 = true; double d = 999.0; double d2 = 999.0; double d3
 * = 999.0; if (n3 > n6) { d = (double) n6 + 1.0; } else if (n3 < n6) { d =
 * (double) n6 + 0.0; } else { n = 0; } if (n4 > n7) { d2 = (double) n7 + 1.0; }
 * else if (n4 < n7) { d2 = (double) n7 + 0.0; } else { bl = false; } if (n5 >
 * n8) { d3 = (double) n8 + 1.0; } else if (n5 < n8) { d3 = (double) n8 + 0.0; }
 * else { bl2 = false; } double d4 = 999.0; double d5 = 999.0; double d6 =
 * 999.0; double d7 = amzr3._c - amzr2._c; double d8 = amzr3._d - amzr2._d;
 * double d9 = amzr3._e - amzr2._e; if (n != 0) { d4 = (d - amzr2._c) / d7; } if
 * (bl) { d5 = (d2 - amzr2._d) / d8; } if (bl2) { d6 = (d3 - amzr2._e) / d9; }
 * if (d4 < d5 && d4 < d6) { n9 = n3 > n6 ? 4 : 5; amzr2._c = d; amzr2._d += d8
 * * d4; amzr2._e += d9 * d4; } else if (d5 < d6) { n9 = n4 > n7 ? 0 : 1;
 * amzr2._c += d7 * d5; amzr2._d = d2; amzr2._e += d9 * d5; } else { n9 = n5 >
 * n8 ? 2 : 3; amzr2._c += d7 * d6; amzr2._d += d8 * d6; amzr2._e = d3; } amzr
 * amzr4 = this.worldObj.func_82732_R()._a(amzr2._c, amzr2._d, amzr2._e);
 * amzr4._c = wmvy._c((double) amzr2._c); n6 = (int) amzr4._c; if (n9 == 5) {
 * --n6; amzr4._c += 1.0; } amzr4._d = wmvy._c((double) amzr2._d); n7 = (int)
 * amzr4._d; if (n9 == 1) { --n7; amzr4._d += 1.0; } amzr4._e = wmvy._c((double)
 * amzr2._e); n8 = (int) amzr4._e; if (n9 == 3) { --n8; amzr4._e += 1.0; } if
 * (n7 == this.skipY && n6 == this.skipX && n8 == this.skipZ) continue; int n10
 * = this.worldObj.func_72798_a(n6, n7, n8); int n11 =
 * this.worldObj.getBlockMetadata(n6, n7, n8); pzdr pzdr3 =
 * pzdr.field_71973_m[n10]; if (pzdr3 == null) continue; piho piho3 =
 * pzdr3.field_72018_cp; if (!pzdr3.func_71935_l() || !piho3._a() && (piho3 ==
 * piho._j || piho3 == piho._F || piho3 == piho._k || piho3 == piho._l || piho3
 * == piho._q) || pzdr3.func_71872_e(this.worldObj, n6, n7, n8) == null &&
 * !pzdr3.func_71913_a(n11, true) || (eics3 = pzdr3.func_71878_a(this.worldObj,
 * n6, n7, n8, amzr2, amzr3)) == null) continue; eics3._i = pzdr3; this.skipX =
 * n6; this.skipY = n7; this.skipZ = n8; return eics3; } return null; } return
 * null; } return null; }
 *
 * private jgqv getBulletDamage(boolean bl) { return this.owner instanceof
 * EntityPlayer ? new EntityDamageSourceGun(this.type.shortName, (EntityPlayer)
 * this.owner, this.firedFrom, bl) .setProjectile() : new
 * owbg(this.type.shortName, this.owner).setProjectile(); }
 *
 * private boolean isPartOfOwner(Entity entity) { if (this.owner == null) {
 * return false; } if (entity != this.owner && entity !=
 * this.owner.riddenByEntity && entity != this.owner.ridingEntity) { if
 * (this.owner instanceof EntityPlayer) { if
 * (FlansModPlayerHandler.getPlayerData((EntityPlayer) ((EntityPlayer)
 * this.owner), (Side) (this.worldObj.isRemote ? Side.CLIENT : Side.SERVER)) ==
 * null) { return false; } EntityMG entityMG =
 * FlansModPlayerHandler.getPlayerData((EntityPlayer) ((EntityPlayer)
 * this.owner), (Side) (this.worldObj.isRemote != false ? Side.CLIENT :
 * Side.SERVER)).mountingGun; if (entityMG != null && entityMG == entity) {
 * return true; } } return !(this.owner.ridingEntity instanceof EntitySeat) ?
 * false : ((EntitySeat) this.owner.ridingEntity).driveable == null ||
 * ((EntitySeat) this.owner.ridingEntity).driveable.isPartOfThis(entity); }
 * return true; }
 *
 * public void setDead() { if (!this.isDead) { super.setDead(); if
 * (this.worldObj.isRemote) { Util.clientBulletUpdate((EntityBullet) this); }
 * try { if (!this.worldObj.isRemote) { int n; if (this.type.explosion > 0) { if
 * (this.owner instanceof EntityPlayer) { new
 * co.uk.flansmods.common.guns.FlansModExplosion(this.worldObj, (Entity) this,
 * (EntityPlayer) this.owner, this.firedFrom, this.posX, this.posY, this.posZ,
 * (float) this.type.explosion); } else { new
 * co.uk.flansmods.common.guns.FlansModExplosion(this.worldObj, (Entity) this,
 * null, this.firedFrom, this.posX, this.posY, this.posZ, (float)
 * this.type.explosion); } } if (this.type.fire > 0) { for (int i = (int)
 * this.posX - this.type.fire; i < (int) this.posX + this.type.fire; ++i) { for
 * (n = (int) this.posZ - this.type.fire; n < (int) this.posZ + this.type.fire;
 * ++n) { for (int j = (int) this.posY - 1; j < (int) this.posY + 1; ++j) { if
 * (this.worldObj.func_72803_f(i, j, n) != piho._a) continue;
 * this.worldObj.func_72832_d(i, j, n, pzdr.field_72067_ar.field_71990_ca, 0,
 * 3); } } } } if (this.type.flak > 0) {
 * PacketDispatcher.sendPacketToAllAround((double) this.posX, (double)
 * this.posY, (double) this.posZ, (double) 128.0, (int) this.dimension, (yugu)
 * PacketFlak.buildFlakPacket((double) this.posX, (double) this.posY, (double)
 * this.posZ, (int) this.type.flak, (String) this.type.flakParticles)); } if
 * (this.type.dropItemOnHit != null) { String string = this.type.dropItemOnHit;
 * n = 0; if (string.contains((CharSequence) ".")) { n =
 * Integer.parseInt((String) string.split("\\.")[1]); string =
 * string.split("\\.")[0]; } nugw nugw2 = InfoType.getRecipeElement((String)
 * string, (int) n); this.entityDropItem(nugw2, 1.0f); } } } catch (Exception
 * exception) { } } }
 *
 * public boolean writeToNBTOptional(xrfd xrfd2) { return false; }
 *
 * protected void readEntityFromNBT(xrfd xrfd2) { }
 *
 * protected void writeEntityToNBT(xrfd xrfd2) { }
 *
 * public void writeSpawnData(ByteArrayDataOutput byteArrayDataOutput) {
 * byteArrayDataOutput.writeDouble(this.motionX);
 * byteArrayDataOutput.writeDouble(this.motionY);
 * byteArrayDataOutput.writeDouble(this.motionZ);
 * byteArrayDataOutput.writeUTF(this.type.shortName);
 * byteArrayDataOutput.writeByte((int) (this.slowdown * 255.0f)); if (this.owner
 * == null) { byteArrayDataOutput.writeInt(-1); } else {
 * byteArrayDataOutput.writeInt(this.owner.field_70157_k); } if (this.firedFrom
 * instanceof GunType) { byteArrayDataOutput.writeUTF(this.firedFrom.shortName);
 * } }
 *
 * public void readSpawnData(ByteArrayDataInput byteArrayDataInput) { try {
 * this.motionX = byteArrayDataInput.readDouble(); this.motionY =
 * byteArrayDataInput.readDouble(); this.motionZ =
 * byteArrayDataInput.readDouble(); this.type = BulletType.getBullet((String)
 * byteArrayDataInput.readUTF()); this.slowdown = (float)
 * byteArrayDataInput.readUnsignedByte() / 255.0f; this.owner =
 * this.worldObj.getEntityByID(byteArrayDataInput.readInt()); } catch (Exception
 * exception) { FlansMod.log((Object)
 * "Failed to read bullet owner from server."); super.setDead();
 * exception.printStackTrace(); } try { this.firedFrom = GunType.getGun((String)
 * byteArrayDataInput.readUTF()); } catch (Throwable throwable) { } }
 *
 * static { HITBOX_EXTEND = 0.2f; } }
 */
