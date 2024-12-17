package dev.lpsmods.canned;

import net.fabricmc.api.ModInitializer;

public class Canned implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Bootstrap.init();
    }
}
