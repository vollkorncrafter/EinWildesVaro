package de.vollkorn.varo.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.WorldBorder;
import org.bukkit.entity.Player;

import java.util.TimerTask;

public class InfoService extends TimerTask {

    @Override
    public void run() {
        for (
                Player p : Bukkit.getOnlinePlayers()) {
                    if (p.getItemInHand().getType() == Material.COMPASS) {
                        World world = Bukkit.getWorld("VaroWorld");
                        WorldBorder border = world.getWorldBorder();
                        if(Math.abs(p.getLocation().getX()) < Math.abs(p.getLocation().getZ())) {
                            p.sendMessage((String.valueOf(border.getSize()/2 - (Math.abs(p.getLocation().getZ())))));
                        }
                        if(Math.abs(p.getLocation().getX()) > Math.abs(p.getLocation().getZ())) {
                            p.sendMessage(String.valueOf(border.getSize()/2 - (Math.abs(p.getLocation().getX()))));

                        }



            }

        }

    }
}
