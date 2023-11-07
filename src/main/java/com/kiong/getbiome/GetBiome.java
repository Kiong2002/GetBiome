package com.kiong.getbiome;

import org.bukkit.plugin.java.JavaPlugin;

public final class GetBiome extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("biome").setExecutor(new BiomeCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
