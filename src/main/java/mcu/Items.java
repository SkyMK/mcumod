package mcu.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import mcu.items.armors.JuggernautArmor;
import mcu.client.models.*;
import mcu.items.armors.heavyarmor;
import mcu.items.armors.prototypearmor;
import mcu.juggernaut.RecipeBullet;
import mcu.juggernaut.RecipeJuggernaut;
import mcu.juggernaut.RecipeJuggernaut2;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;

public class Items {
    public static final ItemArmor.ArmorMaterial JUGGERNAUT = net.minecraftforge.common.util.EnumHelper
            .addArmorMaterial("JUGGERNAUT", 100, new int[]{3, 8, 6, 3}, 0);
    public static final ItemArmor.ArmorMaterial HEAVY = net.minecraftforge.common.util.EnumHelper
            .addArmorMaterial("HEAVY", 100, new int[]{3, 8, 5, 3}, 0);
    public static final ItemArmor.ArmorMaterial LOW_HEAVY = net.minecraftforge.common.util.EnumHelper
            .addArmorMaterial("LOW_HEAVY", 100, new int[]{3, 6, 5, 2}, 0);
    public static ItemArmor juggernautHelmet;
    public static ItemArmor juggernautChestplate;
    public static ItemArmor juggernautPants;
    public static ItemArmor juggernautBoots;
    public static Item morphine;
    public static Item bandage;
    public static Item glHelmet;
    public static Item glChest;
    public static Item glLeggins;
    public static Item glBoots;
    public static Item xHelmetpnv;
    public static Item xChest;
    public static Item xLeggins;
    public static Item xBoots;
    public static Item krampusHelmetpnv;
    public static Item press;
    public static Item pnvHelmet;
    public static Item krampusChest;
    public static Item krampusLeggins;
    public static Item krampusBoots;
    public static Item naziHelmetpnv;
    public static Item naziChest;
    public static Item naziLeggins;
    public static Item naziBoots;
    public static Item ghilleHelmet;
    public static Item ghilleChest;
    public static Item ghilleLeggins;
    public static Item ghilleBoots;
    public static Item redArmyHelmetpnv;
    public static Item redArmyChest;
    public static Item redArmyLeggins;
    public static Item redArmyBoots;
    public static Item samodelHelmet;
    public static Item samodelChest;
    public static Item samodelLeggins;
    public static Item samodelBoots;
    public static Item jokerHelmet;
    public static Item jokerChest;
    public static Item jokerLeggins;
    public static Item jokerBoots;
    public static Item house2d;
    public static Item house3d;
    public static Item house7d;
    public static Item house30d;
    public static Item house90d;
    public static Item houseremover;
    public static Item itemIronCoin;
    public static Item itemGoldCoin;
    public static Item itemDiamondCoin;
    public static Item itemCharging;
    public static Item Armor2021_head;
    public static Item Armor2021_body;
    public static Item Armor2021_pants;
    public static Item Armor2021_boots;
    public static Item PlagueDoctor_head;
    public static Item PlagueDoctor_body;
    public static Item PlagueDoctor_pants;
    public static Item PlagueDoctor_boots;
    public static Item storageCard;
    public static ItemHeal small_firstAidKit;
    public static Item blood_old;
    public static Item blood_old_eff;
    public static ItemHeal firstAidKit;
    public static ItemHeal firstAidKit_b;
    public static ItemHeal pills;
    public static ItemArmor[] JAG = new ItemArmor[4];
    public static Item[] PROTOTYPE = new ItemArmor[4];
    public static Item water;
    public static Item sodaSmasht;
    public static Item sodaRabbit;
    public static Item sodaR4z0r;
    public static Item sodaMzly;
    public static Item sodaLvg;
    public static Item sodaDrwaste;
    public static Item sodaClays;
    public static Item pepsi;
    public static Item mountaindew;
    public static Item mre;

    static {
    }

    public static void registerItems() {
        itemIronCoin = new ItemMoney("ironCoin", "Iron Coin");
        itemGoldCoin = new ItemMoney("goldCoin", "Gold Coin");
        itemDiamondCoin = new ItemMoney("diamondCoin", "Diamond Coin");
        itemCharging = new ItemMoney("charging", "Зарядка");
        storageCard = new ItemMoney("skey", "Карточка хранилища");
        storageCard.setMaxStackSize(1);
        GameRegistry.registerItem(itemIronCoin, itemIronCoin.getUnlocalizedName());
        GameRegistry.registerItem(itemGoldCoin, itemGoldCoin.getUnlocalizedName());
        GameRegistry.registerItem(itemDiamondCoin, itemDiamondCoin.getUnlocalizedName());
        GameRegistry.registerItem(storageCard, storageCard.getUnlocalizedName());
        GameRegistry.registerItem(itemCharging, "gggyoulose");
        juggernautHelmet = new JuggernautArmor.Helmet(JUGGERNAUT, 0, 0);
        juggernautChestplate = new JuggernautArmor.Body(JUGGERNAUT, 1, 1);
        juggernautPants = new JuggernautArmor.Pants(JUGGERNAUT, 2, 2);
        juggernautBoots = new JuggernautArmor.Boots(JUGGERNAUT, 3, 3);
        JAG[0] = juggernautHelmet;
        JAG[1] = juggernautChestplate;
        JAG[2] = juggernautPants;
        JAG[3] = juggernautBoots;
        LanguageRegistry.addName(firstAidKit = new ItemHeal(4916, 20.0f, 1, 5, "firstAidKit", "firstAidKit"),
                "\u0410\u043f\u0442\u0435\u0447\u043a\u0430");
        LanguageRegistry.addName(firstAidKit_b = new ItemHeal(4917, 20.0f, 1, 5, "firstAidKit_b", "firstAidKit"),
                "\u0410\u043f\u0442\u0435\u0447\u043a\u0430 \u0441 \u0431\u0438\u043d\u0442\u0430\u043c\u0438");
        LanguageRegistry.addName(small_firstAidKit = new ItemHeal(4918, 20.0f, 1, 1, "small_firstAidKit", "small_firstAidKit"), "\u041f\u0430\u043a\u0435\u0442 \u043a\u0440\u043e\u0432\u0438");
        LanguageRegistry.addName(pills = new ItemHeal(4919, 5.0f, 4, 1, "pills", "pills"), "Таблетки");
        GameRegistry.registerItem(firstAidKit, "firstAidKit");
        GameRegistry.registerItem(firstAidKit_b, "firstAidKit_b");
        GameRegistry.registerItem(small_firstAidKit, "small_firstAidKit");
        blood_old = new BloodBag(false,20.0f,1);
        GameRegistry.registerItem(blood_old, "blood_old");
        blood_old_eff = new BloodBag(true,20.0f,1);
        GameRegistry.registerItem(blood_old_eff, "blood_old_eff");
        GameRegistry.registerItem(pills, "pills");
        GameRegistry.registerItem(juggernautHelmet, juggernautHelmet.getUnlocalizedName());
        GameRegistry.registerItem(juggernautChestplate, juggernautChestplate.getUnlocalizedName());
        GameRegistry.registerItem(juggernautPants, juggernautPants.getUnlocalizedName());
        GameRegistry.registerItem(juggernautBoots, juggernautBoots.getUnlocalizedName());
        houseremover = new HouseRemover(0);
        GameRegistry.registerItem(houseremover, "housermoved");
        glHelmet = new heavyarmor( HEAVY, 0,0,"Heavy Helmet", "GlHelmet");
        glChest = new heavyarmor( HEAVY,1,1, "Heavy Chest", "GlChest");
        glLeggins = new heavyarmor( HEAVY, 0,2,"Heavy Leggins", "GlLeggins");
        glBoots = new heavyarmor(HEAVY, 0,3,"Heavy Boots", "GlBoots");
        GameRegistry.registerItem(glHelmet, "GlHelmet");
        GameRegistry.registerItem(glChest, "GlChest");
        GameRegistry.registerItem(glLeggins, "GlLeggins");
        GameRegistry.registerItem(glBoots, "GlBoots");
        xChest = new prototypearmor( HEAVY, 1,1,"Prototype X407 Chest", "X407Chest");
        xLeggins = new prototypearmor( HEAVY,0,2, "Prototype X407 Leggins", "X407Legs");
        xBoots = new prototypearmor( HEAVY,0,3, "Prototype X407 Boots", "X407Boots");
        xHelmetpnv = new prototypearmor( HEAVY,0,0, "Prototype X407 Helmet", "X407Helmet");
        krampusHelmetpnv = new Helmet(2282, JUGGERNAUT, "Шлем крампуса", "KrHelmet", "Krampus", new ModelKrampus());
        krampusChest = new Chest(2283, JUGGERNAUT, "Нагрудник крампуса", "KrChest", "Krampus", new ModelKrampus());
        krampusLeggins = new Leggins(2284, JUGGERNAUT, "Поножи крампуса", "KrLeggins", "Krampus", new ModelKrampus());
        krampusBoots = new Boots(2285, JUGGERNAUT, "Ботинки крампуса", "KrBoots", "Krampus", new ModelKrampus());
        naziHelmetpnv = new Helmet(2282, JUGGERNAUT, "Шлем военного", "NzHelmet", "Nazi", new ModelNazi());
        naziChest = new Chest(2283, JUGGERNAUT, "Нагрудник военного", "NzChest", "Nazi", new ModelNazi());
        naziLeggins = new Leggins(2284, JUGGERNAUT, "Поножи военного", "NzLeggins", "Nazi", new ModelNazi());
        naziBoots = new Boots(2285, JUGGERNAUT, "Ботинки военного", "NzBoots", "Nazi", new ModelNazi());
        redArmyHelmetpnv = new Helmet(2282, JUGGERNAUT, "Шлем военного", "RedArmyHelmet", "RedArmy",
                new ModelRedArmy());
        redArmyChest = new Chest(2283, JUGGERNAUT, "Нагрудник военного", "RedArmyChest", "RedArmy", new ModelRedArmy());
        redArmyLeggins = new Leggins(2284, JUGGERNAUT, "Поножи военного", "RedArmyLeggins", "RedArmy",
                new ModelRedArmy());
        redArmyBoots = new Boots(2285, JUGGERNAUT, "Ботинки военного", "RedArmyBoots", "RedArmy", new ModelRedArmy());
        samodelHelmet = new Helmet(2282, LOW_HEAVY, "Самодельный шлем", "SaHelmet", "samodel", new ModelSamodel());
        ((Helmet) samodelHelmet).setNotPnv();
        samodelChest = new Chest(2283, LOW_HEAVY, "Самодельный нагрудник", "SaChest", "samodel", new ModelSamodel());
        samodelLeggins = new Leggins(2284, LOW_HEAVY, "Самодельные штаны", "SaLeggins", "samodel", new ModelSamodel());
        samodelBoots = new Boots(2285, LOW_HEAVY, "Самодельные ботинки", "SaBoots", "samodel", new ModelSamodel());
        press = new Chest(2283, HEAVY, "Нагрудник", "BpVest", "bpvest", new ModelVest());
        jokerHelmet = new Helmet(2282, JUGGERNAUT, "Шлем джокера", "JoHelmet", "Joker", new ModelJoker());
        jokerChest = new Chest(2283, JUGGERNAUT, "Нагрудник джокера", "JoChest", "Joker", new ModelJoker());
        jokerLeggins = new Leggins(2284, JUGGERNAUT, "Поножи джокера", "JoLeggins", "Joker", new ModelJoker());
        jokerBoots = new Boots(2285, JUGGERNAUT, "Ботинки джокера", "JoBoots", "Joker", new ModelJoker());
        jokerChest = new Chest(2283, JUGGERNAUT, "Нагрудник джокера", "JoChest", "Joker", new ModelJoker());
        jokerLeggins = new Leggins(2284, JUGGERNAUT, "Поножи джокера", "JoLeggins", "Joker", new ModelJoker());
        jokerBoots = new Boots(2285, JUGGERNAUT, "Ботинки джокера", "JoBoots", "Joker", new ModelJoker());
        ghilleHelmet = new Helmet(2282, LOW_HEAVY, "Лесной шлем", "GHelmet", "ghile", new uwrjRWUPurwp());
        ((Helmet) ghilleHelmet).setNotPnv();
        ghilleChest = new Chest(2283, LOW_HEAVY, "Лесной нагрудник", "GChest", "ghile", new uwrjRWUPurwp());
        ghilleLeggins = new Leggins(2284, LOW_HEAVY, "Лесные штаны", "GLeggins", "ghile", new uwrjRWUPurwp());
        ghilleBoots = new Boots(2285, LOW_HEAVY, "Лесные ботинки", "GBoots", "ghile", new uwrjRWUPurwp());
        pnvHelmet = new Helmet(2285, HEAVY, "ПНВ шлем", "PNVHelmet", "helmet", new ModelHelmet.PNV());
        GameRegistry.registerItem(press, "BpVest");
        GameRegistry.registerItem(pnvHelmet, "pnvHelmet");
        GameRegistry.registerItem(samodelHelmet, "SaHelmet");
        GameRegistry.registerItem(samodelChest, "SaBody");
        GameRegistry.registerItem(samodelLeggins, "SaLeggins");
        GameRegistry.registerItem(samodelBoots, "SaBoots");
        GameRegistry.registerItem(ghilleHelmet, "GHelmet");
        GameRegistry.registerItem(ghilleChest, "GBody");
        GameRegistry.registerItem(ghilleLeggins, "GLeggins");
        GameRegistry.registerItem(ghilleBoots, "GBoots");
        GameRegistry.registerItem(jokerHelmet, "JoHelmet");
        GameRegistry.registerItem(jokerChest, "JoBody");
        GameRegistry.registerItem(jokerLeggins, "JoLeggins");
        GameRegistry.registerItem(jokerBoots, "JoBoots");
        GameRegistry.registerItem(krampusHelmetpnv, "KrHelmet");
        GameRegistry.registerItem(krampusChest, "KrBody");
        GameRegistry.registerItem(krampusLeggins, "KrLeggins");
        GameRegistry.registerItem(krampusBoots, "KrBoots");
        GameRegistry.registerItem(redArmyHelmetpnv, "RaHelmet");
        GameRegistry.registerItem(redArmyChest, "RaBody");
        GameRegistry.registerItem(redArmyLeggins, "RaLeggins");
        GameRegistry.registerItem(redArmyBoots, "RaBoots");
        GameRegistry.registerItem(naziHelmetpnv, "NzHelmet");
        GameRegistry.registerItem(naziChest, "NzBody");
        GameRegistry.registerItem(naziLeggins, "NzLeggins");
        GameRegistry.registerItem(naziBoots, "NzBoots");
        GameRegistry.registerItem(xHelmetpnv, "xHelmetpnv");
        GameRegistry.registerItem(xChest, "X407Chest");
        GameRegistry.registerItem(xLeggins, "X407Legs");
        GameRegistry.registerItem(xBoots, "X407Boots");
        morphine = new Morphine();
        bandage = new Bandage();
        GameRegistry.registerItem(morphine, "Morphine");
        GameRegistry.registerItem(bandage, "Bandage");
        GameRegistry.registerItem(water = new Water(70, "water"), "Water");
        GameRegistry.registerItem(sodaSmasht = new Water(70, "SodaSmasht"), "Soda Smasht");
        GameRegistry.registerItem(sodaRabbit = new Water(70, "SodaRabbit"), "Soda Rabbit");
        GameRegistry.registerItem(sodaR4z0r = new Water(70, "SodaR4z0r"), "SodaR4z0r");
        GameRegistry.registerItem(sodaMzly = new Water(70, "SodaMzly"), "SodaMzly");
        GameRegistry.registerItem(sodaLvg = new Water(70, "SodaLvg"), "SodaLvg");
        GameRegistry.registerItem(sodaDrwaste = new Water(70, "SodaDrwaste"), "SodaDrwaste");
        GameRegistry.registerItem(sodaDrwaste = new Water(70, "SodaClays"), "SodaClays");
        GameRegistry.registerItem(sodaDrwaste = new Water(70, "pepsi"), "pepsi");
        GameRegistry.registerItem(mountaindew = new Water(70, "mountaindew"), "mountaindew");
        GameRegistry.registerItem(mre = new MRE(), "mre");
        house2d = new ItemHouse(20 * 60 * 60 * 24 * 2);
        GameRegistry.registerItem(house2d, "itemhouse2");
        house3d = new ItemHouse(20 * 60 * 60 * 24 * 3);
        GameRegistry.registerItem(house3d, "itemhouse3");
        house7d = new ItemHouse(20 * 60 * 60 * 24 * 7);
        GameRegistry.registerItem(house7d, "itemhouse7");
        house30d = new ItemHouse(20 * 60 * 60 * 24 * 30);
        GameRegistry.registerItem(house30d, "itemhouse30");
        house90d = new ItemHouse(20 * 60 * 60 * 24 * 90);
        GameRegistry.registerItem(house90d, "itemhouse90");
        Armor2021_body = new Chest(2303, HEAVY, "Новогодний нагрудник", "Armor2021_body", "Armor2021",
                new ModelArmor2021());
        Armor2021_pants = new Leggins(2304, HEAVY, "Новогодние штаны", "Armor2021_pants", "Armor2021",
                new ModelArmor2021());
        Armor2021_boots = new Boots(2305, HEAVY, "Новогодние ботинки", "Armor2021_boots", "Armor2021",
                new ModelArmor2021());
        Armor2021_head = new Helmet(2305, HEAVY, "Новогодний шлем", "Armor2021_head", "Armor2021",
                new ModelArmor2021());
        GameRegistry.registerItem(Armor2021_head, "a2021_h");
        GameRegistry.registerItem(Armor2021_body, "a2021_c");
        GameRegistry.registerItem(Armor2021_pants, "a2021_p");
        GameRegistry.registerItem(Armor2021_boots, "a2021_b");
        PlagueDoctor_body = new Chest(2303, JUGGERNAUT, "Нагрудник доктора", "PlagueDoctor_body", "PlagueDoctor",
                new ModelPlagueDoctor());
        PlagueDoctor_pants = new Leggins(2304, JUGGERNAUT, "Штаны доктора", "PlagueDoctor_pants", "PlagueDoctor",
                new ModelPlagueDoctor());
        PlagueDoctor_boots = new Boots(2305, JUGGERNAUT, "Ботинки доктора", "PlagueDoctor_boots", "PlagueDoctor",
                new ModelPlagueDoctor());
        PlagueDoctor_head = new Helmet(2305, JUGGERNAUT, "Шлем доктора", "PlagueDoctor_head", "PlagueDoctor",
                new ModelPlagueDoctor());
        GameRegistry.registerItem(PlagueDoctor_head, "p2021_h");
        GameRegistry.registerItem(PlagueDoctor_body, "p2021_c");
        GameRegistry.registerItem(PlagueDoctor_pants, "p2021_p");
        GameRegistry.registerItem(PlagueDoctor_boots, "p2021_b");
        CraftingManager.getInstance().getRecipeList().add(new RecipeJuggernaut2());
        LanguageRegistry.addName(house90d, "House");
        CraftingManager.getInstance().getRecipeList().add(new RecipeJuggernaut());
        CraftingManager.getInstance().getRecipeList().add(new RecipeBullet());
        GameRegistry.addRecipe(new ItemStack(net.minecraft.init.Blocks.bedrock, 1),
                "XXX", "XXX", "XXX", 'X', net.minecraft.init.Blocks.stone);
        GameRegistry.addRecipe(new ItemStack(house2d, 1),
                "ZJZ", "WSW", "XXX", 'X', net.minecraft.init.Blocks.bedrock, 'S',
                net.minecraft.init.Blocks.glass, 'W', net.minecraft.init.Blocks.log, 'Z',
                net.minecraft.init.Blocks.oak_stairs, 'J', net.minecraft.init.Blocks.planks);
        PROTOTYPE[0] = xHelmetpnv;
        PROTOTYPE[1] = xChest;
        PROTOTYPE[2] = xLeggins;
        PROTOTYPE[3] = xBoots;
    }
}
