package me.gac;

import org.bukkit.entity.Player;

import java.io.*;
import java.time.LocalDate;

public class LogCat {

    public static void log(String msg) {
        try {
            File dir = new File(GAC.get().getDataFolder(), "logs");
            dir.mkdirs();

            File f = new File(dir, LocalDate.now() + ".log");
            try (FileWriter w = new FileWriter(f, true)) {
                w.write(msg + "\n");
            }
        } catch (Exception ignored) {}
    }

    public static String formatKick(Player p) {
        String msg = GAC.get().getConfig().getString("messages.kick")
                .replace("%player%", p.getName());
        log(p.getName() + " kicked for cheating");
        return msg;
    }

    public static String opAlert(Player p, String reason) {
        return GAC.get().getConfig().getString("messages.alert-op")
                .replace("%player%", p.getName())
                .replace("%reason%", reason);
    }
}