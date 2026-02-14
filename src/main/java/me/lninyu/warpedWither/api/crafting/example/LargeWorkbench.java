package me.lninyu.warpedWither.api.crafting.example;

import me.lninyu.warpedWither.api.crafting.FabricationResult;
import me.lninyu.warpedWither.api.crafting.Fabricator;
import org.bukkit.inventory.ItemStack;
import oshi.util.tuples.Pair;

import org.jspecify.annotations.NullMarked;

import java.util.List;

/**
 * 使用例クラス
 * (6x6 -> 1)のクラフトを行う例
 * 現状はDTOを利用しない原始的な手段で実装する方向性
 */
@NullMarked
public class LargeWorkbench implements Fabricator<Pair<String, List<ItemStack>>, ItemStack> {
    @Override
    public FabricationResult<ItemStack> simulate(Pair<String, List<ItemStack>> stringListPair) {
        return null;
    }

    @Override
    public FabricationResult<ItemStack> fabricate(Pair<String, List<ItemStack>> stringListPair) {
        return null;
    }
}
