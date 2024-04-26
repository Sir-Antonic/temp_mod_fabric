package com.antonic.temp_mod;

import com.antonic.temp_mod.references.ModWorldGeneration;
import com.antonic.temp_mod.references.*;
import net.fabricmc.api.ModInitializer;

import static com.antonic.temp_mod.references.Reference.LOGGER;


public class Main implements ModInitializer {



	@Override
	public void onInitialize() {

		LOGGER.info(">>> Initializing");

		ModItems.register();
		ModBlocks.register();
		ModItemGroups.register();
		ModCommands.register();
		ModBlockEntities.register();
		ModScreenHandlers.register();
		ModRecipes.register();
		ModWorldGeneration.register();
		ModMessages.registerC2SPackets();
		ModEffects.register();
	}
}