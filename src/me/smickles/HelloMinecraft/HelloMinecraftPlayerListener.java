package me.smickles.HelloMinecraft;

import org.bukkit.event.player.PlayerListener;

public class HelloMinecraftPlayerListener extends PlayerListener {
	
	public static HelloMinecraft plugin; public HelloMinecraftPlayerListener(HelloMinecraft instance){
		
		plugin = instance;
	}
}
