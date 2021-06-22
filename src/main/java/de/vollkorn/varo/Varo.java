package de.vollkorn.varo;

import de.vollkorn.varo.listeners.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Timer;


public final class Varo extends JavaPlugin {



    SpawnCommand spawncommand = new SpawnCommand();

    private static Varo instance;


    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Varo Plugin Enabled :D xoxo");
        PluginManager manager = Bukkit.getPluginManager();
        manager.registerEvents(new JoinListener(), this);
        manager.registerEvents(new OnDeathListener(), this);

        instance = this;


        this.getCommand("tpa").setExecutor(new tpa());
        this.getCommand("Start").setExecutor(new Start());
        this.getCommand("Pos").setExecutor(spawncommand);
        this.getCommand("Wr").setExecutor(new newVaroWorldCommand());
        this.getCommand("Wb").setExecutor(new WorldBorderCommand());
        Timer timer = new Timer();
        timer.schedule(new Infos(), 0, 1000);


    }

    public static Varo getInstance() {
        return instance;
    }

    public SpawnCommand getSpawncommand() {
        return spawncommand;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

    }
}
