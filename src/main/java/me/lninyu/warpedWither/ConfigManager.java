package me.lninyu.warpedWither;

import me.lninyu.warpedWither.api.config.ServerConfig;
import org.jspecify.annotations.Nullable;

import java.io.File;

public enum ConfigManager {
    INSTANCE;

    @Nullable
    private ServerConfig config;

    public void init(File file) {
        if (config != null) throw new IllegalStateException("");
    }
}
