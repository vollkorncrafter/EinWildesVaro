package de.vollkorn.varo.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class SpawnCommand implements CommandExecutor {

    List<Location> spawnLocations = new ArrayList<>();
    int PosCounter = 1;

    public boolean onCommand(CommandSender Player_Sender, Command command, String label, String[] args) {
        if (Player_Sender instanceof Player) {

            Location location = ((Player) Player_Sender).getLocation();
            spawnLocations.add(location);
            System.out.println(spawnLocations);
            Bukkit.broadcastMessage(ChatColor.AQUA + "Position " +  ChatColor.GREEN + " #" + PosCounter + ChatColor.AQUA + " set");
            PosCounter = PosCounter + 1;

        }
        return false;
    }
}