package org.kokakiwi.bukkitupdater.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.kokakiwi.bukkitupdater.BukkitUpdater;

public class NullCommand extends CommandModel {

	@Override
	public boolean execute(CommandSender sender, Command cmd, String commandLabel, String[] args, BukkitUpdater plugin) {
		sender.sendMessage(ChatColor.YELLOW.toString() + "/updater <check|list|update|install|remove|purge|load|enable|disable>");
		
		return false;
	}

}
