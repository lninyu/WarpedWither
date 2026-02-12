package me.lninyu.warpedWither;

import com.github.benmanes.caffeine.cache.CaffeineSpec;
import me.lninyu.warpedWither.application.PlayerService;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class WarpedWither extends JavaPlugin {
    private static final Logger LOGGER = LoggerFactory.getLogger(WarpedWither.class);
    private PlayerService playerService;

    public static Logger logger() {
        return LOGGER;
    }

    public PlayerService playerService() {
        return playerService;
    }

    @Override
    public void onEnable() {
        LOGGER.info("Hello!");
        playerService = new PlayerService(CaffeineSpec.parse("maximumSize_=64,expireAfterAccess=30m"));
    }

    @Override
    public void onDisable() {
        LOGGER.info("Goodbye!");
        if (playerService != null){
            playerService.close();
        }
    }
}
