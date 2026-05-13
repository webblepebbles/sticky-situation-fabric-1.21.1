package net.bloffo.stickysituation;

import net.bloffo.stickysituation.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StickySituation implements ModInitializer {
	public static final String MOD_ID = "sticky-situation";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}