package dev.hawu.plugins.multilang;

public class ConsoleUtils {

    static BukkitEntrypoint bukkit;
    static BungeeEntrypoint bungee;

    private static final String[] messages = new String[]{
        "|----------------------------|-----------------|",
        "|          Libraries         |     Version     |",
        "|----------------------------|-----------------|",
        "| kotlin-stdlib              | 1.5.31          |",
        "| kotlin-reflect             | 1.5.31          |",
        "| kotlinx-coroutines-core    | 1.5.2-native-mt |",
        "| kotlinx-serialization-core | 1.3.1           |",
        "| groovy-all                 | 3.0.9           |",
        "| scala3-library_3           | 3.1.1-RC1       |",
        "|----------------------------|-----------------|",
    };

    private static void consoleBukkit(final String msg) {
        bukkit.getLogger().info(msg);
    }

    private static void consoleBungee(final String msg) {
        bungee.getLogger().info(msg);
    }

    private static void printVersionsBukkit() {
        for(final String message : messages) {
            consoleBukkit(message);
        }
    }

    private static void printVersionsBungee() {
        for(final String message : messages) {
            consoleBungee(message);
        }
    }

    static void printVersions() {
        // There's prob a way to do this dynamically with algorithms
        // to expand enough and get versions.
        // But I'm lazy.

        try {
            if(bungee != null) printVersionsBungee();
            else printVersionsBukkit();
        } catch(final Exception exception) {
            // In case I messed up this badly.
            exception.printStackTrace();
        }
    }

}
