package me.lninyu.warpedWither;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class WarpedWither extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Listener() {
            @EventHandler
            public void onPlayerSneak(PlayerToggleSneakEvent event) {
                event.getPlayer().sendMessage(Component.empty()
                    .append(Component.text("Hello! クリスマスカラーだ! 見ずらいだろ!?", Style.style()
                        .color(TextColor.color(0xff0000))
                        .shadowColor(ShadowColor.shadowColor(0xff00ff00))
                        .insertion("unko")
                        .build()))
                );
            }
        }, this);
    }

    @Override
    public void onDisable() {
    }
}
