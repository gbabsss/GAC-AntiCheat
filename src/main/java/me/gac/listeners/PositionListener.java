package me.gac.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PositionListener implements Listener {

    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        if (e.getFrom().getY() + 3 < e.getTo().getY()) {
            e.getPlayer().kickPlayer("Illegal vertical movement");
        }
    }
}