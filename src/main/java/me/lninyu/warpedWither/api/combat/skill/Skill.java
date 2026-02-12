package me.lninyu.warpedWither.api.combat.skill;

import me.lninyu.warpedWither.api.combat.misc.FlavorHolder;
import me.lninyu.warpedWither.api.combat.mutate.Mutable;

/**
 * スキル
 * スロット, パッシブ, 最大コスト(スロットとは別)を持つ?
 * 他何があるだろ, スロットを別クラスにするべきか...?
 * ユニットが装備するスロットを入れる場所のなまえもSkillSlotになりそう
 * スキル名をユーザー定義できるようにするとか?
 */
public interface Skill extends FlavorHolder, Mutable {
}
