package me.gac.listeners;

import me.gac.*;
import org.bukkit.Bukkit;
import org.bukkit.event.*;
import org.bukkit.event.player.PlayerJoinEvent;

public class ClientJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        String client = Client.guess(e.getPlayer());
        Bukkit.getOnlinePlayers().stream()
            .filter(p -> p.isOp())
            .forEach(op -> op.sendMessage("Client tahmini: " + client));
    }
}