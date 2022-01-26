package de.vollkorn.varo.commands;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NewVaroWorldCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Bukkit.broadcastMessage(ChatColor.RED + "WORLD RESET !!!");
            try {
                Bukkit.unloadWorld("VaroWorld", false);
                Bukkit.getWorld("VaroWorld").getWorldFolder().delete();

                Bukkit.broadcastMessage(ChatColor.GREEN.toString() + "Old World " + ChatColor.RED.toString() + "DELETED!");
            } catch(Exception e){
                Bukkit.broadcastMessage(ChatColor.GREEN.toString() + "No world found, creating new one");
            }

            WorldCreator wc = new WorldCreator("VaroWorld");
            wc.environment(World.Environment.NORMAL);
            wc.type(WorldType.NORMAL);
            wc.createWorld();
            Location loc = new Location(Bukkit.getWorld("VaroWorld"), 0, 255, 0);
            Bukkit.broadcastMessage(ChatColor.GREEN.toString() + "New World Created");
            Player p = (Player) sender;
            p.teleport(loc);

        }
        return false;
    }
}