package me.gac.listeners;

import me.gac.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class SpeedListener implements Listener {

    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        if (SpeedLimiter.isSpeedIllegal(e.getPlayer())) {
            e.getPlayer().kickPlayer(LogCat.formatKick(e.getPlayer()));
        }
    }
}