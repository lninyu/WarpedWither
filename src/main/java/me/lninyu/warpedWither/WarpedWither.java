package me.lninyu.warpedWither;

import net.minecraft.server.level.ServerPlayer;
import org.bukkit.plugin.java.JavaPlugin;

public final class WarpedWither extends JavaPlugin {
    private static final ServerPlayer playerServer = null;

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(playerServer);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
