package de.vollkorn.varo.listeners;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldBorder;

import java.util.TimerTask;

public class shrinkBorder extends TimerTask {

    @Override
    public void run() {
        World world = Bukkit.getWorld("VaroWorld");
        WorldBorder border = world.getWorldBorder();
        border.setSize(border.getSize() - 1);

    }
}
