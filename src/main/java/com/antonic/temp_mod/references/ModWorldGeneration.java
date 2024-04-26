package com.antonic.temp_mod.references;

import com.antonic.temp_mod.datagen.world.ModOreGeneration;

import static com.antonic.temp_mod.references.Reference.LOGGER;

public class ModWorldGeneration
{
    public ModWorldGeneration()
    {
        throw new AssertionError();
    }

    public static void register()
    {
        LOGGER.info(">>> Registering World Generation");

        ModOreGeneration.generateOres();
    }
}
