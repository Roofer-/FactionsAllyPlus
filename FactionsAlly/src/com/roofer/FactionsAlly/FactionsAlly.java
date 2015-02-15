// FACTIONS ALLY SPYING PUNISHMENT \\
// BY _ROOFER 


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
		
		if(cmd.getName().equalsIgnoreCase("f spy a")){
			if(sender instanceof Player){
				Player player = (Player) sender;
				// here it is
				player.sendMessage(ChatColor.RED + "Spying is not good.");
				try {
				    Thread.sleep(10000);
				} catch(InterruptedException ex) {
				    Thread.currentThread().interrupt();
				}
				player.addPotionEffect(new PotionEffect(PotionEffectType.POISON,
						500, 1));
				
				player.sendMessage(ChatColor.BOLD + "PUNISHMENT!");
				
			}
		}
		if (cmd.getName().equalsIgnoreCase("f spy t")){
			Player player = (Player) sender;
			player.sendMessage(ChatColor.RED + "Spying won't help you in factions!");
			try {
			    Thread.sleep(10000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON,
					500, 1));
			
			player.sendMessage(ChatColor.BOLD + "PUNISHMENT!");
		}
		
		if (
				cmd.getName().equalsIgnoreCase("f spy t-a"))
		{
			Player player = (Player) sender;
			player.sendMessage(ChatColor.RED + "Spying won't help you in factions!");
			
			try {
			    Thread.sleep(10000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON,
					500, 1));
			
			player.sendMessage(ChatColor.BOLD + "PUNISHMENT!");
			
		}
			
			
		
		
		
		
		return false;
	}

}
