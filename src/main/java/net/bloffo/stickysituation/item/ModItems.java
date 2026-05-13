package net.bloffo.stickysituation.item;

import net.bloffo.stickysituation.StickySituation;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final Item FANCY_STICK =registerItem("fancy_stick");
    public static final Item BIG_STICK =registerItem("big_stick");
    public static final Item BIGGER_STICK =registerItem("bigger_stick");
    public static final Item EVEN_BIGGER_STICK =registerItem("even_bigger_stick");
    public static final Item GIANT_STICK =registerItem("giant_stick");
    public static final Item ENORMOUS_STICK =registerItem("enormous_stick");
    public static final Item BIGGEST_STICK =registerItem("biggest_stick");

    private static Item registerItem(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(StickySituation.MOD_ID, name);
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);
        return Registry.register(BuiltInRegistries.ITEM, key, new Item(new Item.Properties().setId(key)));
    }

    public static void registerModItems() {
        StickySituation.LOGGER.info("Registering mod items for " + StickySituation.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register(output -> {
            output.accept(FANCY_STICK);
            output.accept(BIG_STICK);
            output.accept(BIGGER_STICK);
            output.accept(EVEN_BIGGER_STICK);
            output.accept(GIANT_STICK);
            output.accept(ENORMOUS_STICK);
            output.accept(BIGGEST_STICK);
        });
    }
}
