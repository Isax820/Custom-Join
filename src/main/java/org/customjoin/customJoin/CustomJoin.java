package org.customjoin.customJoin;

import org.bukkit.plugin.java.JavaPlugin;

public final class CustomJoin extends JavaPlugin {

    private static CustomJoin instance;

    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(
                new JoinListener(this),
                this
        );

        getLogger().info("CustomJoin activé !");
    }

    @Override
    public void onDisable() {
        getLogger().info("CustomJoin désactivé !");
    }

    public static CustomJoin getInstance() {
        return instance;
    }
}