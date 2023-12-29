package net.simpvp.Cloud_to_butt;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Cloud_to_butt extends JavaPlugin implements Listener {

	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}

	public void onDisable() {
	}

	@EventHandler(priority = EventPriority.LOWEST, ignoreCancelled=true)
	public void onPlayerChat(AsyncPlayerChatEvent event) {
		String msg = event.getMessage();
		msg = msg.replaceAll("the cloud", "my butt")
			.replaceAll("cloud", "butt")
			.replaceAll(":boar:", ":mammoth:");
		event.setMessage(msg);
	}

}

