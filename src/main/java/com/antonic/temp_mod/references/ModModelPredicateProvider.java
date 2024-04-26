package com.antonic.temp_mod.references;

import static com.antonic.temp_mod.references.Reference.LOGGER;

public class ModModelPredicateProvider
{
    public ModModelPredicateProvider()
    {
        throw new AssertionError();
    }

    public static void register()
    {
        LOGGER.info(">>> Registering Model Predicates");
    }
}
