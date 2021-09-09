package dev.hawu.plugins.multilang;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class ConsoleUtils {

    private static void console(final String msg) {
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
    }

    public static void printVersions() {
        // There's prob a way to do this dynamically with algorithms
        // to expand enough and get versions.
        // But I'm lazy.
        console("&7|----------------------------|-----------------|");
        console("&7|&f          Libraries         &7|&f     Version     &7|");
        console("&7|----------------------------|-----------------|");
        console("&7|&f kotlin-stdlib              &7|&f 1.5.30          &7|");
        console("&7|&f kotlin-reflect             &7|&f 1.5.30          &7|");
        console("&7|&f kotlinx-coroutines-core    &7|&f 1.5.2-native-mt &7|");
        console("&7|&f kotlinx-serialization-core &7|&f 1.2.2           &7|");
        console("&7|&f groovy-all                 &7|&f 3.0.9           &7|");
        console("&7|&f scala3-library_3           &7|&f 3.1.0-RC1       &7|");
        console("&7|----------------------------|-----------------|");
    }

}
