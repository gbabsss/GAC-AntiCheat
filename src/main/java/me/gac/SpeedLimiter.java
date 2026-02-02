package me.gac;

import org.bukkit.entity.Player;

public class SpeedLimiter {

    public static boolean isSpeedIllegal(Player p) {
        if (p.hasPotionEffect(org.bukkit.potion.PotionEffectType.SPEED)) return false;
        return p.getWalkSpeed() > GAC.get().getConfig().getDouble("speed.max-walk");
    }
}