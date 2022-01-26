package de.vollkorn.varo;

import de.vollkorn.varo.commands.*;
import de.vollkorn.varo.listeners.*;
import de.vollkorn.varo.utils.InfoService;
import de.vollkorn.varo.utils.LocationServices;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Timer;
import java.util.logging.Logger;


public final class Varo extends JavaPlugin {



    private LocationServices locationServices;

    @Override
    public void onEnable() {
        // Plugin startup logic
        Logger logger = getLogger();


        logger.info("Varo Plugin Enabled :D xoxo");
        PluginManager manager = Bukkit.getPluginManager();
        manager.registerEvents(new JoinListener(), this);
        manager.registerEvents(new OnDeathListener(), this);


        logger.info("loading services...");
        locationServices = new LocationServices();

        this.getCommand("tpa").setExecutor(new TpaCommand());
        this.getCommand("start").setExecutor(new StartCommand(this));
        this.getCommand("pos").setExecutor(new SpawnCommand(this));
        this.getCommand("wr").setExecutor(new NewVaroWorldCommand());
        this.getCommand("wb").setExecutor(new WorldBorderCommand());

        new  Timer().schedule(new InfoService(), 0, 1000);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

    }

    public LocationServices getLocationServices() {
        return locationServices;
    }
}
