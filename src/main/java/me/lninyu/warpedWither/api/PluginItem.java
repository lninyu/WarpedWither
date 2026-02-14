package me.lninyu.warpedWither.api;

import org.bukkit.Keyed;

public interface PluginItem extends FlavorTextHolder, Keyed {
    PluginItemStack of();
}
