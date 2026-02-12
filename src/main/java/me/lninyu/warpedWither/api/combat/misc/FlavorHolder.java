package me.lninyu.warpedWither.api.combat.misc;

import net.kyori.adventure.text.Component;

/**
 * フレーバーテキストを持つ存在のためのもの
 * パッシブ, ステータス異常, 変異, スキルに持たせれそう
 */
public interface FlavorHolder {
    Component flavor();
}
