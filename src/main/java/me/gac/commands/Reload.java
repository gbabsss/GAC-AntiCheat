package me.gac.commands;

import me.gac.GAC;
import org.bukkit.command.*;

public class Reload implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.isOp()) return true;
        GAC.get().reloadConfig();
        sender.sendMessage("GAC Config Reloaded");
        return true;
    }
}
