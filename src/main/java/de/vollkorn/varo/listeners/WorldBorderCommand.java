package de.vollkorn.varo.listeners;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldBorder;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class WorldBorderCommand implements CommandExecutor {



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            World world = Bukkit.getWorld("VaroWorld");
            WorldBorder border = world.getWorldBorder();
            String BorderSizeAsString = args[0];
            Double BorderWidthAsDouble = Double.parseDouble(BorderSizeAsString);
            border.setSize(BorderWidthAsDouble);

        }
        return false;
    }
}

