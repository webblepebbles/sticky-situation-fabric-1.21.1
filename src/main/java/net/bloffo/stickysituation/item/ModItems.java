package net.bloffo.stickysituation.item;

import net.bloffo.stickysituation.StickySituation;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item FANCY_STICK =registerItem("fancy_stick", new Item(new Item.Settings()));
    public static final Item BIG_STICK =registerItem("big_stick", new Item(new Item.Settings()));
    public static final Item BIGGER_STICK =registerItem("bigger_stick", new Item(new Item.Settings()));
    public static final Item EVEN_BIGGER_STICK =registerItem("even_bigger_stick", new Item(new Item.Settings()));
    public static final Item BIGGEST_STICK =registerItem("biggest_stick", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(StickySituation.MOD_ID, name), item);
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
