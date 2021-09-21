package dev.hawu.plugins.multilang;

import net.md_5.bungee.api.plugin.Plugin;

public class BungeeEntrypoint extends Plugin {

    @Override
    public void onEnable() {
        ConsoleUtils.bungee = this;
        ConsoleUtils.printVersions();
    }

}
