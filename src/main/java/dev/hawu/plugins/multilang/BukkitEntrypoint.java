package dev.hawu.plugins.multilang;

import org.bukkit.plugin.java.JavaPlugin;

public final class BukkitEntrypoint extends JavaPlugin {

    @Override
    public void onEnable() {
        ConsoleUtils.printVersions();
    }

}
