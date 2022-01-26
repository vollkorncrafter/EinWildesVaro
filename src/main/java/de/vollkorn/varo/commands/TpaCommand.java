package de.vollkorn.varo.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Location;

public class TpaCommand implements CommandExecutor {


    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Location location = ((Player) sender).getLocation();
            for (Player p : Bukkit.getOnlinePlayers()) {

                p.teleport(location);
            }
        }

        return false;
    }
}


