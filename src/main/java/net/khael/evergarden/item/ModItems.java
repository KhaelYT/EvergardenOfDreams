package net.khael.evergarden.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.khael.evergarden.EvergardenOfDreams;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    public static final Item ASTRO_COOKIE = registerItem("astro_cookie", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(EvergardenOfDreams.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EvergardenOfDreams.LOGGER.info("Registering Mod Items for" + EvergardenOfDreams.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ASTRO_COOKIE);
        });
    }
}
