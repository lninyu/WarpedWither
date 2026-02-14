package me.lninyu.warpedWither.impl;

import me.lninyu.warpedWither.api.FlavorTextHolder;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;

public class ExampleFlavorText implements FlavorTextHolder {
    private static final Component FLAVOR_TEXT = MiniMessage.miniMessage().deserialize("""
        <dark_red>Caution:</dark_red> Do not use this torch as a substitute for cake candles.
        """);

    @Override
    public Component flavorText() {
        return FLAVOR_TEXT;
    }
}
