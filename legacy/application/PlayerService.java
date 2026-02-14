package me.lninyu.warpedWither.application;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.CaffeineSpec;
import me.lninyu.warpedWither.api.legacy.core.Service;
import me.lninyu.warpedWither.api.legacy.player.PlayerSession;
import org.jspecify.annotations.NullMarked;

import java.util.*;

@NullMarked
public final class PlayerService implements Service {
    private final Cache<UUID, PlayerSession> sessions;

    public PlayerService(CaffeineSpec spec) {
        sessions = Caffeine.from(spec).build();
    }

    @Override
    public void close() {
        sessions.invalidateAll();
    }
}
