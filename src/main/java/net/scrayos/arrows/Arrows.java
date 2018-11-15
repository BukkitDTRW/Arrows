package net.scrayos.arrows;

import org.bukkit.plugin.java.JavaPlugin;

public class Arrows extends JavaPlugin {

    private static Arrows instance = null;

    @Override
    public void onEnable() {
        Arrows.instance = this;
        getServer().getPluginManager().registerEvents(new ArrowActionListener(), this);
    }

    @Override
    public void onDisable() {
        Arrows.instance = null;
    }

    public static Arrows getInstance() {
        return instance;
    }
}
