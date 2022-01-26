package de.vollkorn.varo.commands;

import de.vollkorn.varo.Varo;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class SpawnCommand implements CommandExecutor {


    private final Varo plugin;
    int PosCounter = 1;

    public SpawnCommand(Varo plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {

            Location location = ((Player) sender).getLocation();

            List<Location> spawnLocations = plugin.getLocationServices().getSpawnLocations();
            spawnLocations.add(location);
            System.out.println(spawnLocations);
            Bukkit.broadcastMessage(ChatColor.AQUA + "Position " +  ChatColor.GREEN + " #" + PosCounter + ChatColor.AQUA + " set");
            PosCounter = PosCounter + 1;

        }
        return false;
    }
}