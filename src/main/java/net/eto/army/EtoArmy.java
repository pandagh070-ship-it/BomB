package net.eto.army;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class EtoArmy implements ModInitializer {
    public static final String MOD_ID = "etoarmy";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Eto Army loaded. Cinematic NPC showcase build.");
    }
}
