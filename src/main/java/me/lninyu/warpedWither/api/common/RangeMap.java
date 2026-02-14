package me.lninyu.warpedWither.api.common;

import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import org.jetbrains.annotations.UnmodifiableView;
import org.jspecify.annotations.NullMarked;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@NullMarked
public final class RangeMap<K> {
    private final Object2ObjectMap<K, DoublePredicate> map = new Object2ObjectOpenHashMap<>();

    public void put(K key, DoublePredicate predicate) {
        map.put(key, predicate);
    }

    public void remove(K key) {
        map.remove(key);
    }

    public boolean test(K key, double value) {
        return map.get(key).test(value);
    }

    public boolean test(double value) {
        return map.values().stream().anyMatch(predicate -> predicate.test(value));
    }

    public @UnmodifiableView Set<K> keys(double value) {
        var result = new HashSet<K>();

        for (var entry : map.entrySet()) {
            if (entry.getValue().test(value)) {
                result.add(entry.getKey());
            }
        }

        return Collections.unmodifiableSet(result);
    }

    public interface DoublePredicate {
        boolean test(double d);
    }
}
