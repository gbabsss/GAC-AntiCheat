package me.gac;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class ReachFix {

    public static void handle(Player p, double reach) {
        double max = GAC.get().getConfig().getDouble("reach.max");
        if (reach > max) {
            p.kickPlayer(LogCat.formatKick(p));
            Bukkit.getOnlinePlayers().stream()
                .filter(Player::isOp)
                .forEach(op -> op.sendMessage(LogCat.opAlert(p, "Reach:" + reach)));
        }
    }
}