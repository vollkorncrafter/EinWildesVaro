package de.vollkorn.varo.listeners;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class tpa implements CommandExecutor {
    public boolean onCommand(CommandSender Player_Sender, Command command, String label, String[] args) {
        if(Player_Sender instanceof Player){
            Location location = ((Player) Player_Sender).getLocation();
            for (Player p : Bukkit.getOnlinePlayers()) {

                p.teleport(location);
            }
        }

        return false;
    }
}


