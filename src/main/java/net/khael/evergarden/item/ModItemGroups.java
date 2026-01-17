package net.khael.evergarden.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.khael.evergarden.EvergardenOfDreams;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static void registerItemGroups() {
    EvergardenOfDreams.LOGGER.info("Registering Item Groups for" + EvergardenOfDreams.MOD_ID);
    }

    public static final ItemGroup EVERGARDEN_COOKING_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(EvergardenOfDreams.MOD_ID, "evergarden_cooking"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ASTRO_COOKIE))
                    .displayName(Text.translatable("itemgroup.evergadren.evergarden_cooking"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ASTRO_COOKIE);
                    })
                    .build());

}
