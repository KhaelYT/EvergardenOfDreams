package net.khael.evergarden.item;

import net.khael.evergarden.EvergardenOfDreams;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(EvergardenOfDreams.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EvergardenOfDreams.LOGGER.info("Registering Mod Items for" + EvergardenOfDreams.MOD_ID);
    }
}
