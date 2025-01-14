package com.aetherteam.aetherii.item;

import com.aetherteam.aetherii.AetherII;
import com.aetherteam.aetherii.client.AetherIISoundEvents;
import com.aetherteam.aetherii.entity.AetherIIEntityTypes;
import com.aetherteam.aetherii.item.combat.AetherCrossbowItem;
import com.aetherteam.aetherii.item.combat.HammerItem;
import com.aetherteam.aetherii.item.combat.ScatterglassBoltItem;
import com.aetherteam.aetherii.item.combat.SpearItem;
import com.aetherteam.aetherii.item.combat.arkenium.ArkeniumHammerItem;
import com.aetherteam.aetherii.item.combat.arkenium.ArkeniumShortswordItem;
import com.aetherteam.aetherii.item.combat.arkenium.ArkeniumSpearItem;
import com.aetherteam.aetherii.item.combat.gravitite.GravititeHammerItem;
import com.aetherteam.aetherii.item.combat.gravitite.GravititeShortswordItem;
import com.aetherteam.aetherii.item.combat.gravitite.GravititeSpearItem;
import com.aetherteam.aetherii.item.combat.holystone.HolystoneHammerItem;
import com.aetherteam.aetherii.item.combat.holystone.HolystoneShortswordItem;
import com.aetherteam.aetherii.item.combat.holystone.HolystoneSpearItem;
import com.aetherteam.aetherii.item.combat.skyroot.SkyrootHammerItem;
import com.aetherteam.aetherii.item.combat.skyroot.SkyrootShortswordItem;
import com.aetherteam.aetherii.item.combat.skyroot.SkyrootSpearItem;
import com.aetherteam.aetherii.item.combat.zanite.ZaniteHammerItem;
import com.aetherteam.aetherii.item.combat.zanite.ZaniteShortswordItem;
import com.aetherteam.aetherii.item.combat.zanite.ZaniteSpearItem;
import com.aetherteam.aetherii.item.food.AetherIIFoods;
import com.aetherteam.aetherii.item.materials.AmbrosiumShardItem;
import com.aetherteam.aetherii.item.materials.ArcticSnowballItem;
import com.aetherteam.aetherii.item.materials.SkyrootPineconeItem;
import com.aetherteam.aetherii.item.materials.SwetGelItem;
import com.aetherteam.aetherii.item.miscellaneous.AetherPortalItem;
import com.aetherteam.aetherii.item.tools.arkenium.ArkeniumAxeItem;
import com.aetherteam.aetherii.item.tools.arkenium.ArkeniumPickaxeItem;
import com.aetherteam.aetherii.item.tools.arkenium.ArkeniumShovelItem;
import com.aetherteam.aetherii.item.tools.arkenium.ArkeniumTrowelItem;
import com.aetherteam.aetherii.item.tools.gravitite.GravititeAxeItem;
import com.aetherteam.aetherii.item.tools.gravitite.GravititePickaxeItem;
import com.aetherteam.aetherii.item.tools.gravitite.GravititeShovelItem;
import com.aetherteam.aetherii.item.tools.gravitite.GravititeTrowelItem;
import com.aetherteam.aetherii.item.tools.holystone.HolystoneAxeItem;
import com.aetherteam.aetherii.item.tools.holystone.HolystonePickaxeItem;
import com.aetherteam.aetherii.item.tools.holystone.HolystoneShovelItem;
import com.aetherteam.aetherii.item.tools.holystone.HolystoneTrowelItem;
import com.aetherteam.aetherii.item.tools.skyroot.SkyrootAxeItem;
import com.aetherteam.aetherii.item.tools.skyroot.SkyrootPickaxeItem;
import com.aetherteam.aetherii.item.tools.skyroot.SkyrootShovelItem;
import com.aetherteam.aetherii.item.tools.skyroot.SkyrootTrowelItem;
import com.aetherteam.aetherii.item.tools.zanite.ZaniteAxeItem;
import com.aetherteam.aetherii.item.tools.zanite.ZanitePickaxeItem;
import com.aetherteam.aetherii.item.tools.zanite.ZaniteShovelItem;
import com.aetherteam.aetherii.item.tools.zanite.ZaniteTrowelItem;
import net.minecraft.network.chat.Style;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AetherIIItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AetherII.MODID);

    public static final Style WEAPON_TOOLTIP_COLOR = Style.EMPTY.withColor(11393240);

    // Tools
    public static final DeferredItem<PickaxeItem> SKYROOT_PICKAXE = ITEMS.register("skyroot_pickaxe", SkyrootPickaxeItem::new);
    public static final DeferredItem<AxeItem> SKYROOT_AXE = ITEMS.register("skyroot_axe", SkyrootAxeItem::new);
    public static final DeferredItem<ShovelItem> SKYROOT_SHOVEL = ITEMS.register("skyroot_shovel", SkyrootShovelItem::new);
    public static final DeferredItem<HoeItem> SKYROOT_TROWEL = ITEMS.register("skyroot_trowel", SkyrootTrowelItem::new);

    public static final DeferredItem<PickaxeItem> HOLYSTONE_PICKAXE = ITEMS.register("holystone_pickaxe", HolystonePickaxeItem::new);
    public static final DeferredItem<AxeItem> HOLYSTONE_AXE = ITEMS.register("holystone_axe", HolystoneAxeItem::new);
    public static final DeferredItem<ShovelItem> HOLYSTONE_SHOVEL = ITEMS.register("holystone_shovel", HolystoneShovelItem::new);
    public static final DeferredItem<HoeItem> HOLYSTONE_TROWEL = ITEMS.register("holystone_trowel", HolystoneTrowelItem::new);

    public static final DeferredItem<PickaxeItem> ZANITE_PICKAXE = ITEMS.register("zanite_pickaxe", ZanitePickaxeItem::new);
    public static final DeferredItem<AxeItem> ZANITE_AXE = ITEMS.register("zanite_axe", ZaniteAxeItem::new);
    public static final DeferredItem<ShovelItem> ZANITE_SHOVEL = ITEMS.register("zanite_shovel", ZaniteShovelItem::new);
    public static final DeferredItem<HoeItem> ZANITE_TROWEL = ITEMS.register("zanite_trowel", ZaniteTrowelItem::new);

    public static final DeferredItem<PickaxeItem> ARKENIUM_PICKAXE = ITEMS.register("arkenium_pickaxe", ArkeniumPickaxeItem::new);
    public static final DeferredItem<AxeItem> ARKENIUM_AXE = ITEMS.register("arkenium_axe", ArkeniumAxeItem::new);
    public static final DeferredItem<ShovelItem> ARKENIUM_SHOVEL = ITEMS.register("arkenium_shovel", ArkeniumShovelItem::new);
    public static final DeferredItem<HoeItem> ARKENIUM_TROWEL = ITEMS.register("arkenium_trowel", ArkeniumTrowelItem::new);

    public static final DeferredItem<PickaxeItem> GRAVITITE_PICKAXE = ITEMS.register("gravitite_pickaxe", GravititePickaxeItem::new);
    public static final DeferredItem<AxeItem> GRAVITITE_AXE = ITEMS.register("gravitite_axe", GravititeAxeItem::new);
    public static final DeferredItem<ShovelItem> GRAVITITE_SHOVEL = ITEMS.register("gravitite_shovel", GravititeShovelItem::new);
    public static final DeferredItem<HoeItem> GRAVITITE_TROWEL = ITEMS.register("gravitite_trowel", GravititeTrowelItem::new);

    public static final DeferredItem<Item> ARKENIUM_SHEARS = ITEMS.register("arkenium_shears", () -> new ShearsItem(new Item.Properties().defaultDurability(250)));

    // Weapons
    public static final DeferredItem<SwordItem> SKYROOT_SHORTSWORD = ITEMS.register("skyroot_shortsword", SkyrootShortswordItem::new);
    public static final DeferredItem<HammerItem> SKYROOT_HAMMER = ITEMS.register("skyroot_hammer", SkyrootHammerItem::new);
    public static final DeferredItem<SpearItem> SKYROOT_SPEAR = ITEMS.register("skyroot_spear", SkyrootSpearItem::new);
    public static final DeferredItem<CrossbowItem> SKYROOT_CROSSBOW = ITEMS.register("skyroot_crossbow", () -> new AetherCrossbowItem(AetherIIItemTiers.SKYROOT, new Item.Properties()));

    public static final DeferredItem<SwordItem> HOLYSTONE_SHORTSWORD = ITEMS.register("holystone_shortsword", HolystoneShortswordItem::new);
    public static final DeferredItem<HammerItem> HOLYSTONE_HAMMER = ITEMS.register("holystone_hammer", HolystoneHammerItem::new);
    public static final DeferredItem<SpearItem> HOLYSTONE_SPEAR = ITEMS.register("holystone_spear", HolystoneSpearItem::new);
    public static final DeferredItem<CrossbowItem> HOLYSTONE_CROSSBOW = ITEMS.register("holystone_crossbow", () -> new AetherCrossbowItem(AetherIIItemTiers.HOLYSTONE, new Item.Properties()));

    public static final DeferredItem<SwordItem> ZANITE_SHORTSWORD = ITEMS.register("zanite_shortsword", ZaniteShortswordItem::new);
    public static final DeferredItem<HammerItem> ZANITE_HAMMER = ITEMS.register("zanite_hammer", ZaniteHammerItem::new);
    public static final DeferredItem<SpearItem> ZANITE_SPEAR = ITEMS.register("zanite_spear", ZaniteSpearItem::new);
    public static final DeferredItem<CrossbowItem> ZANITE_CROSSBOW = ITEMS.register("zanite_crossbow", () -> new AetherCrossbowItem(AetherIIItemTiers.ZANITE, new Item.Properties()));

    public static final DeferredItem<SwordItem> ARKENIUM_SHORTSWORD = ITEMS.register("arkenium_shortsword", ArkeniumShortswordItem::new);
    public static final DeferredItem<HammerItem> ARKENIUM_HAMMER = ITEMS.register("arkenium_hammer", ArkeniumHammerItem::new);
    public static final DeferredItem<SpearItem> ARKENIUM_SPEAR = ITEMS.register("arkenium_spear", ArkeniumSpearItem::new);
    public static final DeferredItem<CrossbowItem> ARKENIUM_CROSSBOW = ITEMS.register("arkenium_crossbow", () -> new AetherCrossbowItem(AetherIIItemTiers.ARKENIUM, new Item.Properties()));

    public static final DeferredItem<SwordItem> GRAVITITE_SHORTSWORD = ITEMS.register("gravitite_shortsword", GravititeShortswordItem::new);
    public static final DeferredItem<HammerItem> GRAVITITE_HAMMER = ITEMS.register("gravitite_hammer", GravititeHammerItem::new);
    public static final DeferredItem<SpearItem> GRAVITITE_SPEAR = ITEMS.register("gravitite_spear", GravititeSpearItem::new);
    public static final DeferredItem<CrossbowItem> GRAVITITE_CROSSBOW = ITEMS.register("gravitite_crossbow", () -> new AetherCrossbowItem(AetherIIItemTiers.GRAVITITE, new Item.Properties()));

    public static final DeferredItem<Item> SCATTERGLASS_BOLT = ITEMS.register("scatterglass_bolt", () -> new ScatterglassBoltItem(new Item.Properties()));

    // Materials
    public static final DeferredItem<Item> SKYROOT_STICK = ITEMS.register("skyroot_stick", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SKYROOT_PINECONE = ITEMS.register("skyroot_pinecone", () -> new SkyrootPineconeItem(new Item.Properties()));
    public static final DeferredItem<Item> SCATTERGLASS_SHARD = ITEMS.register("scatterglass_shard", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AMBROSIUM_SHARD = ITEMS.register("ambrosium_shard", () -> new AmbrosiumShardItem(new Item.Properties()));
    public static final DeferredItem<Item> ZANITE_GEMSTONE = ITEMS.register("zanite_gemstone", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INERT_ARKENIUM = ITEMS.register("inert_arkenium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ARKENIUM_PLATES = ITEMS.register("arkenium_plates", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INERT_GRAVITITE = ITEMS.register("inert_gravitite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GRAVITITE_PLATE = ITEMS.register("gravitite_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLDEN_AMBER = ITEMS.register("golden_amber", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CLOUDTWINE = ITEMS.register("cloudtwine", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TAEGORE_HIDE = ITEMS.register("taegore_hide", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BURRUKAI_PELT = ITEMS.register("burrukai_pelt", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AECHOR_PETAL = ITEMS.register("aechor_petal", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ARCTIC_SNOWBALL = ITEMS.register("arctic_snowball", () -> new ArcticSnowballItem(new Item.Properties()));
    public static final DeferredItem<Item> GREEN_SWET_GEL = ITEMS.register("green_swet_gel", () -> new SwetGelItem(new Item.Properties()));
    public static final DeferredItem<Item> BLUE_SWET_GEL = ITEMS.register("blue_swet_gel", () -> new SwetGelItem(new Item.Properties()));
    public static final DeferredItem<Item> PURPLE_SWET_GEL = ITEMS.register("purple_swet_gel", () -> new SwetGelItem(new Item.Properties()));
    public static final DeferredItem<Item> GOLDEN_SWET_GEL = ITEMS.register("golden_swet_gel", () -> new SwetGelItem(new Item.Properties()));
    public static final DeferredItem<Item> WHITE_SWET_GEL = ITEMS.register("white_swet_gel", () -> new SwetGelItem(new Item.Properties()));

    // Food
    public static final DeferredItem<Item> BLUEBERRY = ITEMS.register("blueberry", () -> new Item(new Item.Properties().food(AetherIIFoods.BLUEBERRY)));
    public static final DeferredItem<Item> ENCHANTED_BLUEBERRY = ITEMS.register("enchanted_blueberry", () -> new Item(new Item.Properties().food(AetherIIFoods.ENCHANTED_BLUEBERRY)));
    public static final DeferredItem<Item> ORANGE = ITEMS.register("orange", () -> new Item(new Item.Properties().food(AetherIIFoods.ORANGE)));
    public static final DeferredItem<Item> WYNDBERRY = ITEMS.register("wyndberry", () -> new Item(new Item.Properties().food(AetherIIFoods.WYNDBERRY)));
    public static final DeferredItem<Item> ENCHANTED_WYNDBERRY = ITEMS.register("enchanted_wyndberry", () -> new Item(new Item.Properties().food(AetherIIFoods.ENCHANTED_WYNDBERRY)));
    public static final DeferredItem<Item> GREEN_SWET_JELLY = ITEMS.register("green_swet_jelly", () -> new Item(new Item.Properties().food(AetherIIFoods.SWET_JELLY)));
    public static final DeferredItem<Item> BLUE_SWET_JELLY = ITEMS.register("blue_swet_jelly", () -> new Item(new Item.Properties().food(AetherIIFoods.SWET_JELLY)));
    public static final DeferredItem<Item> PURPLE_SWET_JELLY = ITEMS.register("purple_swet_jelly", () -> new Item(new Item.Properties().food(AetherIIFoods.SWET_JELLY)));
    public static final DeferredItem<Item> GOLDEN_SWET_JELLY = ITEMS.register("golden_swet_jelly", () -> new Item(new Item.Properties().food(AetherIIFoods.SWET_JELLY)));
    public static final DeferredItem<Item> WHITE_SWET_JELLY = ITEMS.register("white_swet_jelly", () -> new Item(new Item.Properties().food(AetherIIFoods.SWET_JELLY)));
    public static final DeferredItem<Item> BURRUKAI_RIBS = ITEMS.register("burrukai_ribs", () -> new Item(new Item.Properties().food(AetherIIFoods.BURRUKAI_LIB)));
    public static final DeferredItem<Item> BURRUKAI_RIB_CUT = ITEMS.register("burrukai_rib_cut", () -> new Item(new Item.Properties().food(AetherIIFoods.BURRUKAI_LIB_CUT)));
    public static final DeferredItem<Item> KIRRID_CUTLET = ITEMS.register("kirrid_cutlet", () -> new Item(new Item.Properties().food(AetherIIFoods.KIRRID_CUTLET)));
    public static final DeferredItem<Item> KIRRID_LOIN = ITEMS.register("kirrid_loin", () -> new Item(new Item.Properties().food(AetherIIFoods.KIRRID_LOIN)));
    public static final DeferredItem<Item> RAW_TAEGORE_MEAT = ITEMS.register("raw_taegore_meat", () -> new Item(new Item.Properties().food(AetherIIFoods.RAW_TAEGORE_MEAT)));
    public static final DeferredItem<Item> TAEGORE_STEAK = ITEMS.register("taegore_steak", () -> new Item(new Item.Properties().food(AetherIIFoods.TAEGORE_STEAK)));

    // Music Discs
    public static final DeferredItem<Item> MUSIC_DISC_AETHER_TUNE = ITEMS.register("music_disc_aether_tune", () -> new RecordItem(1, AetherIISoundEvents.ITEM_MUSIC_DISC_AETHER_TUNE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2980));
    public static final DeferredItem<Item> MUSIC_DISC_ASCENDING_DAWN = ITEMS.register("music_disc_ascending_dawn", () -> new RecordItem(2, AetherIISoundEvents.ITEM_MUSIC_DISC_ASCENDING_DAWN, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 7000));
    public static final DeferredItem<Item> MUSIC_DISC_AERWHALE = ITEMS.register("music_disc_aerwhale", () -> new RecordItem(3, AetherIISoundEvents.ITEM_MUSIC_DISC_AERWHALE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3560));
    public static final DeferredItem<Item> MUSIC_DISC_APPROACHES = ITEMS.register("music_disc_approaches", () -> new RecordItem(4, AetherIISoundEvents.ITEM_MUSIC_DISC_APPROACHES, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5480));
    public static final DeferredItem<Item> MUSIC_DISC_DEMISE = ITEMS.register("music_disc_demise", () -> new RecordItem(5, AetherIISoundEvents.ITEM_MUSIC_DISC_DEMISE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 6000));
    public static final DeferredItem<Item> RECORDING_892 = ITEMS.register("recording_892", () -> new RecordItem(6, AetherIISoundEvents.ITEM_RECORDING_892, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1940));

    // Spawn Eggs
    public static final DeferredItem<SpawnEggItem> FLYING_COW_SPAWN_EGG = ITEMS.register("flying_cow_spawn_egg", () -> new DeferredSpawnEggItem(AetherIIEntityTypes.FLYING_COW, 0xD8D8D8, 0xFFD939, new Item.Properties()));
    public static final DeferredItem<SpawnEggItem> SHEEPUFF_SPAWN_EGG = ITEMS.register("sheepuff_spawn_egg", () -> new DeferredSpawnEggItem(AetherIIEntityTypes.SHEEPUFF, 0xE2FCFF, 0xCB9090, new Item.Properties()));
    public static final DeferredItem<SpawnEggItem> PHYG_SPAWN_EGG = ITEMS.register("phyg_spawn_egg", () -> new DeferredSpawnEggItem(AetherIIEntityTypes.PHYG, 0xFFC1D0, 0xFFD939, new Item.Properties()));
    public static final DeferredItem<SpawnEggItem> AERBUNNY_SPAWN_EGG = ITEMS.register("aerbunny_spawn_egg", () -> new DeferredSpawnEggItem(AetherIIEntityTypes.AERBUNNY, 0xE2FCFF, 0xFFDFF9, new Item.Properties()));
    public static final DeferredItem<SpawnEggItem> HIGHFIELDS_KIRRID_SPAWN_EGG = ITEMS.register("highfields_kirrid_spawn_egg", () -> new DeferredSpawnEggItem(AetherIIEntityTypes.HIGHFIELDS_KIRRID, 0x495056, 0xD2CEBA, new Item.Properties()));
    public static final DeferredItem<SpawnEggItem> MAGNETIC_KIRRID_SPAWN_EGG = ITEMS.register("magnetic_kirrid_spawn_egg", () -> new DeferredSpawnEggItem(AetherIIEntityTypes.MAGNETIC_KIRRID, 0x5F5A69, 0x9FA2D6, new Item.Properties()));
    public static final DeferredItem<SpawnEggItem> ARCTIC_KIRRID_SPAWN_EGG = ITEMS.register("arctic_kirrid_spawn_egg", () -> new DeferredSpawnEggItem(AetherIIEntityTypes.ARCTIC_KIRRID, 0x6B6255, 0xDDDDDD, new Item.Properties()));
    public static final DeferredItem<SpawnEggItem> MOA_SPAWN_EGG = ITEMS.register("moa_spawn_egg", () -> new DeferredSpawnEggItem(AetherIIEntityTypes.MOA, 0x87BFEF, 0x7A7A7A, new Item.Properties()));
    public static final DeferredItem<SpawnEggItem> ZEPHYR_SPAWN_EGG = ITEMS.register("zephyr_spawn_egg", () -> new DeferredSpawnEggItem(AetherIIEntityTypes.ZEPHYR, 0xDFDFDF, 0x99CFE8, new Item.Properties()));

    // Misc
    public static final DeferredItem<Item> MOA_FEED = ITEMS.register("moa_feed", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLUEBERRY_MOA_FEED = ITEMS.register("blueberry_moa_feed", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENCHANTED_MOA_FEED = ITEMS.register("enchanted_moa_feed", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AETHER_PORTAL_FRAME = ITEMS.register("aether_portal_frame", () -> new AetherPortalItem(new Item.Properties().stacksTo(1)));
}