package de.vollkorn.varo.listeners;

import de.vollkorn.varo.Varo;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {


    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage(ChatColor.AQUA.toString() + event.getPlayer().getName() + " Nimmt Am Turnier Teil");
        player.setGameMode(GameMode.ADVENTURE);
    }
}
