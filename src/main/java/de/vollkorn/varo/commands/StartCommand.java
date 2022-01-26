package de.vollkorn.varo.commands;

import de.vollkorn.varo.Varo;
import de.vollkorn.varo.utils.BorderService;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.WorldBorder;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Timer;

public class StartCommand implements CommandExecutor {

    private final Varo plugin;

    public StartCommand(Varo plugin){
        this.plugin = plugin;
    }

    int x = 0;
    Timer timer = new Timer();


    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if(args.length == 1) {
                World world = Bukkit.getWorld("VaroWorld");
                WorldBorder border = world.getWorldBorder();
                int TimeAsInt = Integer.parseInt(args[0]);
                System.out.println(TimeAsInt + " = time as int");
                int time = (int) (((TimeAsInt*60)/border.getSize())*1000);//Formula by Format_SSD
                System.out.println(time + " = time ");
                long period = Long.parseLong(String.valueOf(time));
                System.out.println(period);
                timer.schedule(new BorderService(),1, period);
                x = 0;
            }




                for (Player p : Bukkit.getOnlinePlayers()) {
                    Location location = plugin.getLocationServices().getSpawnLocations().get(x);
                    p.teleport(location);
                    x += 1;
                }

            }
        return false;
    }

    private Integer round(double v) {

        return null;
    }
}