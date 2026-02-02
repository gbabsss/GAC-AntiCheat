package me.gac;

import org.bukkit.entity.Player;

public class Client {

    public static String guess(Player p) {
        String brand = p.getClientBrandName();
        if (brand == null) return "Unknown";
        if (brand.contains("fabric")) return "Fabric";
        if (brand.contains("forge")) return "Forge";
        return "Vanilla";
    }
}