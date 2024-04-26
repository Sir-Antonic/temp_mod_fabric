package com.antonic.temp_mod;

import com.antonic.temp_mod.datagen.ModBlockTagProvider;
import com.antonic.temp_mod.datagen.ModItemTagProvider;
import com.antonic.temp_mod.datagen.ModEntityTagProvider;
import com.antonic.temp_mod.datagen.ModLootTableProvider;
import com.antonic.temp_mod.datagen.ModModelProvider;
import com.antonic.temp_mod.datagen.ModRecipeProvider;
import com.antonic.temp_mod.datagen.ModWorldGenerator;
import com.antonic.temp_mod.datagen.world.ModConfiguredFeatures;
import com.antonic.temp_mod.datagen.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

import static com.antonic.temp_mod.references.Reference.LOGGER;

public class DataGen implements DataGeneratorEntrypoint
{
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
	{
		LOGGER.info(">>> Generating Data");

		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModEntityTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModWorldGenerator::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder)
	{
		LOGGER.info(">>> Registering Data Generation Features");

		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
	}
}
