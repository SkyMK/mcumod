package com.flansmod.common.teams;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.Paintjob;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlayerClass extends InfoType {

    public static List classes = new ArrayList();
    public List startingItemStrings = new ArrayList();
    public List startingItems = new ArrayList();
    public boolean horse = false;
    public ItemStack hat;
    public ItemStack chest;
    public ItemStack legs;
    public ItemStack shoes;

    public PlayerClass(TypeFile file) {
        super(file);
        classes.add(this);
    }

    public static PlayerClass getClass(String s) {
        Iterator var1 = classes.iterator();

        PlayerClass playerClass;
        do {
            if (!var1.hasNext()) {
                return null;
            }

            playerClass = (PlayerClass) var1.next();
        } while (!playerClass.shortName.equals(s));

        return playerClass;
    }

    protected void read(String[] split, TypeFile file) {
        super.read(split, file);
        if (split[0].equals("AddItem")) {
            this.startingItemStrings.add(split);
        }

        if (split[0].equals("SkinOverride")) {
            super.texture = split[1];
        }

        Iterator var3;
        Item item;
        ArmourType armour;
        if (split[0].equals("Hat") || split[0].equals("Helmet")) {
            if (split[1].equals("None")) {
                return;
            }

            var3 = FlansMod.armourItems.iterator();

            while (var3.hasNext()) {
                item = (Item) var3.next();
                armour = ((ItemTeamArmour) item).type;
                if (armour != null && armour.shortName.equals(split[1])) {
                    this.hat = new ItemStack(item);
                }
            }
        }

        if (split[0].equals("Chest") || split[0].equals("Top")) {
            if (split[1].equals("None")) {
                return;
            }

            var3 = FlansMod.armourItems.iterator();

            while (var3.hasNext()) {
                item = (Item) var3.next();
                armour = ((ItemTeamArmour) item).type;
                if (armour != null && armour.shortName.equals(split[1])) {
                    this.chest = new ItemStack(item);
                }
            }
        }

        if (split[0].equals("Legs") || split[0].equals("Bottom")) {
            if (split[1].equals("None")) {
                return;
            }

            var3 = FlansMod.armourItems.iterator();

            while (var3.hasNext()) {
                item = (Item) var3.next();
                armour = ((ItemTeamArmour) item).type;
                if (armour != null && armour.shortName.equals(split[1])) {
                    this.legs = new ItemStack(item);
                }
            }
        }

        if (split[0].equals("Shoes") || split[0].equals("Boots")) {
            if (split[1].equals("None")) {
                return;
            }

            var3 = FlansMod.armourItems.iterator();

            while (var3.hasNext()) {
                item = (Item) var3.next();
                armour = ((ItemTeamArmour) item).type;
                if (armour != null && armour.shortName.equals(split[1])) {
                    this.shoes = new ItemStack(item);
                }
            }
        }

    }

    protected void postRead(TypeFile file) {
        super.postRead(file);
        this.onWorldLoad(null);
    }

    public void onWorldLoad(World world) {
        if (world == null || !world.isRemote) {
            try {
                this.startingItems.clear();

                ItemStack stack;
                label115:
                for (Iterator var2 = this.startingItemStrings.iterator(); var2.hasNext(); this.startingItems
                        .add(stack)) {
                    String[] split = (String[]) var2.next();
                    Item matchingItem = null;
                    int amount = 1;
                    int damage = 0;
                    String[] itemNames = split[1].split("\\+");
                    Iterator var8 = Item.itemRegistry.iterator();

                    while (true) {
                        Item item;
                        do {
                            do {
                                do {
                                    if (!var8.hasNext()) {
                                        var8 = InfoType.infoTypes.iterator();

                                        while (var8.hasNext()) {
                                            InfoType type = (InfoType) var8.next();
                                            if (type.shortName.equals(itemNames[0]) && type.item != null) {
                                                matchingItem = type.item;
                                            }
                                        }

                                        if (matchingItem == null) {
                                            FlansMod.log("Tried to add " + split[1] + " to player class "
                                                    + this.shortName + " but the item did not exist");
                                            return;
                                        }

                                        if (split.length > 2) {
                                            amount = Integer.parseInt(split[2]);
                                        }

                                        if (split.length > 3) {
                                            damage = Integer.parseInt(split[3]);
                                        }

                                        stack = new ItemStack(matchingItem, amount, damage);
                                        if (itemNames.length > 1 && matchingItem instanceof ItemGun) {
                                            GunType gunType = ((ItemGun) matchingItem).type;
                                            NBTTagCompound tags = new NBTTagCompound();
                                            NBTTagCompound attachmentTags = new NBTTagCompound();
                                            int genericID = 0;

                                            for (int i = 0; i < itemNames.length - 1; ++i) {
                                                AttachmentType attachment = AttachmentType
                                                        .getAttachment(itemNames[i + 1]);
                                                if (attachment != null) {
                                                    String tagName = null;
                                                    switch (attachment.type) {
                                                        case sights:
                                                            tagName = "scope";
                                                            break;
                                                        case barrel:
                                                            tagName = "barrel";
                                                            break;
                                                        case stock:
                                                            tagName = "stock";
                                                            break;
                                                        case grip:
                                                            tagName = "grip";
                                                            break;
                                                        case generic:
                                                            tagName = "generic_" + genericID++;
                                                    }

                                                    NBTTagCompound specificAttachmentTags = new NBTTagCompound();
                                                    (new ItemStack(attachment.item)).writeToNBT(specificAttachmentTags);
                                                    attachmentTags.setTag(tagName, specificAttachmentTags);
                                                } else {
                                                    Paintjob paintjob = gunType.getPaintjob(itemNames[i + 1]);
                                                    if (paintjob != null) {
                                                        tags.setString("Paint", paintjob.iconName);
                                                    }
                                                }
                                            }

                                            tags.setTag("attachments", attachmentTags);
                                            stack.stackTagCompound = tags;
                                        }
                                        continue label115;
                                    }

                                    Object object = var8.next();
                                    item = (Item) object;
                                } while (item == null);
                            } while (item.getUnlocalizedName() == null);
                        } while (!item.getUnlocalizedName().equals(itemNames[0])
                                && (item.getUnlocalizedName().split("\\.").length <= 1
                                || !item.getUnlocalizedName().split("\\.")[1].equals(itemNames[0])));

                        matchingItem = item;
                    }
                }
            } catch (Exception var17) {
                System.out.println("Interpreting player class file failed.");
                var17.printStackTrace();
            }

        }
    }

}
