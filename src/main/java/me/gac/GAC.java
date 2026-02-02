package me.gac;

import me.gac.listeners.*;
import me.gac.commands.Reload;
import org.bukkit.plugin.java.JavaPlugin;

public class GAC extends JavaPlugin {

    private static GAC instance;

    public static GAC get() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new SpeedListener(), this);
        getServer().getPluginManager().registerEvents(new PositionListener(), this);
        getServer().getPluginManager().registerEvents(new ClientJoinListener(), this);

        getCommand("gacreload").setExecutor(new Reload());
    }
}
