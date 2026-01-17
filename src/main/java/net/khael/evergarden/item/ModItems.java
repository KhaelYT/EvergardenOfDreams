package net.khael.evergarden.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.khael.evergarden.EvergardenOfDreams;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RED_SUGAR_COATING = registerItem("red_sugar_coating", new Item(new Item.Settings()));
    public static final Item ORANGE_SUGAR_COATING = registerItem("orange_sugar_coating", new Item(new Item.Settings()));
    public static final Item YELLOW_SUGAR_COATING = registerItem("yellow_sugar_coating", new Item(new Item.Settings()));
    public static final Item LIME_GREEN_SUGAR_COATING = registerItem("lime_green_sugar_coating", new Item(new Item.Settings()));
    public static final Item GREEN_SUGAR_COATING = registerItem("green_sugar_coating", new Item(new Item.Settings()));
    public static final Item LIGHT_BLUE_SUGAR_COATING = registerItem("light_blue_sugar_coating", new Item(new Item.Settings()));
    public static final Item CYAN_SUGAR_COATING = registerItem("cyan_sugar_coating", new Item(new Item.Settings()));
    public static final Item BLUE_SUGAR_COATING = registerItem("blue_sugar_coating", new Item(new Item.Settings()));
    public static final Item PINK_SUGAR_COATING = registerItem("pink_sugar_coating", new Item(new Item.Settings()));
    public static final Item MAGENTA_SUGAR_COATING = registerItem("magenta_sugar_coating", new Item(new Item.Settings()));
    public static final Item PURPLE_SUGAR_COATING = registerItem("purple_sugar_coating", new Item(new Item.Settings()));
    public static final Item BROWN_SUGAR_COATING = registerItem("brown_sugar_coating", new Item(new Item.Settings()));
    public static final Item WHITE_SUGAR_COATING = registerItem("white_sugar_coating", new Item(new Item.Settings()));
    public static final Item GREY_SUGAR_COATING = registerItem("grey_sugar_coating", new Item(new Item.Settings()));
    public static final Item DARK_GREY_SUGAR_COATING = registerItem("dark_grey_sugar_coating", new Item(new Item.Settings()));
    public static final Item BLACK_SUGAR_COATING = registerItem("black_sugar_coating", new Item(new Item.Settings()));

    public static final Item ASTRO_COOKIE = registerItem("astro_cookie", new Item(new Item.Settings()));

    public static final Item LAVENDER_LOG = registerItem("lavender_log", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(EvergardenOfDreams.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EvergardenOfDreams.LOGGER.info("Registering Mod Items for" + EvergardenOfDreams.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(LAVENDER_LOG);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ASTRO_COOKIE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(RED_SUGAR_COATING);
            fabricItemGroupEntries.add(ORANGE_SUGAR_COATING);
            fabricItemGroupEntries.add(YELLOW_SUGAR_COATING);
            fabricItemGroupEntries.add(LIME_GREEN_SUGAR_COATING);
            fabricItemGroupEntries.add(GREEN_SUGAR_COATING);
            fabricItemGroupEntries.add(CYAN_SUGAR_COATING);
            fabricItemGroupEntries.add(LIGHT_BLUE_SUGAR_COATING);
            fabricItemGroupEntries.add(BLUE_SUGAR_COATING);
            fabricItemGroupEntries.add(PINK_SUGAR_COATING);
            fabricItemGroupEntries.add(MAGENTA_SUGAR_COATING);
            fabricItemGroupEntries.add(PURPLE_SUGAR_COATING);
            fabricItemGroupEntries.add(BROWN_SUGAR_COATING);
            fabricItemGroupEntries.add(WHITE_SUGAR_COATING);
            fabricItemGroupEntries.add(GREY_SUGAR_COATING);
            fabricItemGroupEntries.add(DARK_GREY_SUGAR_COATING);
            fabricItemGroupEntries.add(BLACK_SUGAR_COATING);

        });
    }
}
