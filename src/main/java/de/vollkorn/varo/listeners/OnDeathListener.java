package de.vollkorn.varo.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class OnDeathListener implements Listener {

    @EventHandler
    public void onDeath(EntityDamageEvent event) {
        if (event.getEntity() instanceof Player) {
            Player player = ((Player) event.getEntity()).getPlayer();
            if (event.getDamage() >= player.getHealth()) {
                player.setHealth(5);
                player.setGameMode(GameMode.SPECTATOR);
                Bukkit.broadcastMessage(ChatColor.RED + player.getName() + ChatColor.YELLOW + " wurde von " + ChatColor.RED + event.getCause()+ ChatColor.YELLOW + " aus dem Leben Geworfen D: F in den chat D: ");
                {
                }
            }
        }
    }
}