package com.kiong.getbiome;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BiomeCommand implements CommandExecutor{

    private ArrayList<String> list_of_player = new ArrayList<>();
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;
            list_of_player.add(p.getName());
            p.sendMessage("Current Biome: "+ p.getLocation().getBlock().getBiome().name());
            for (String name : list_of_player) {
                System.out.println(name);
            }

        }

        return true;
    }
}
