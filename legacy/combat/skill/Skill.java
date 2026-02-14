package me.lninyu.warpedWither.api.legacy.combat.skill;

import me.lninyu.warpedWither.api.legacy.combat.misc.FlavorHolder;
import me.lninyu.warpedWither.api.legacy.combat.mutate.Mutable;

/**
 * スキル
 * スロット, パッシブ, 最大コスト(スロットとは別)を持つ?
 * 他何があるだろ, スロットを別クラスにするべきか...?
 * ユニットが装備するスロットを入れる場所のなまえもSkillSlotになりそう
 * スキル名をユーザー定義できるようにするとか?
 */
public interface Skill extends FlavorHolder, Mutable {
}
