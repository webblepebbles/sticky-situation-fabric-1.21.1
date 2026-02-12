package net.bloffo.stickysituation.item;

import net.bloffo.stickysituation.StickySituation;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item FANCY_STICK = registerItem("fancy_stick");
    public static final Item BIG_STICK = registerItem("big_stick");
    public static final Item BIGGER_STICK = registerItem("bigger_stick");
    public static final Item EVEN_BIGGER_STICK = registerItem("even_bigger_stick");
    public static final Item BIGGEST_STICK = registerItem("biggest_stick");

    private static Item registerItem(String name) {
        Identifier id = Identifier.of(StickySituation.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        return Registry.register(Registries.ITEM, key, new Item(new Item.Settings().registryKey(key)));
    }

    public static void registerModItems() {
        StickySituation.LOGGER.info("Registering mod items for " + StickySituation.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(FANCY_STICK);
            entries.add(BIG_STICK);
            entries.add(BIGGER_STICK);
            entries.add(EVEN_BIGGER_STICK);
            entries.add(BIGGEST_STICK);
        });
    }
}
