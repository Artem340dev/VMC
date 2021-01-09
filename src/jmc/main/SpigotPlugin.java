package jmc.main;

import org.bukkit.plugin.java.JavaPlugin;

public class SpigotPlugin extends JavaPlugin {
    public void onEnable() {
        getCommand("vmc").setExecutor(new VMC());
    }
}