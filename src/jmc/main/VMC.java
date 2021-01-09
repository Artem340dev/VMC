package jmc.main;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftEntity;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class VMC implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            World w = p.getWorld();
            Location loc = p.getLocation();
            Entity entity = w.spawnEntity(loc, EntityType.MINECART_CHEST);
            ((CraftEntity) entity).getHandle().setInvisible(true);
            p.sendMessage(ChatColor.GREEN + "JMC >> Успешно!");
            return true;
        } else {
            sender.sendMessage(ChatColor.RED + "Нет прав!");
            return true;
        }
    }
}