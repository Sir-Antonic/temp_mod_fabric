package com.antonic.temp_mod.references;

import static com.antonic.temp_mod.references.Reference.LOGGER;

public class ModEffects
{
    public ModEffects()
    {
        throw new AssertionError();
    }

    public static void register()
    {
        LOGGER.info(">>> Registering Effects");
    }
}
