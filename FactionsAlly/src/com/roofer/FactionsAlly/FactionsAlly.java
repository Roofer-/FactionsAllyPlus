package com.roofer.FactionsAlly;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class FactionsAlly extends JavaPlugin{
	
	@Override
	public void onEnable(){
		getLogger().info("onEnable enabled!");
	}
	
	@Override
	public void onDisable(){
		getLogger().info("onDisable enabled!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		// COMMANDs //
		
		if(cmd.getName().equalsIgnoreCase("f spy")){
			if(sender instanceof Player){
				Player player = (Player) sender;
				// here it is
				player.sendMessage(ChatColor.RED + "Spying is not good.");
				try {
				    Thread.sleep(10000);                 //1000 milliseconds is one second.
				} catch(InterruptedException ex) {
				    Thread.currentThread().interrupt();
				}
				player.addPotionEffect(new PotionEffect(PotionEffectType.POISON,
						500, 1));
				
			}
		}
		
		
		
		
		return false;
	}

}
