package me.lninyu.warpedWither.api.legacy.common;

import io.papermc.paper.persistence.PersistentDataViewHolder;
import org.bukkit.NamespacedKey;
import org.bukkit.persistence.PersistentDataHolder;
import org.bukkit.persistence.PersistentDataType;
import org.jspecify.annotations.NullMarked;

import java.util.Optional;

@NullMarked
public record PersistentDataKey<P, C>(NamespacedKey key, PersistentDataType<P, C> type) {
    public Optional<C> get(PersistentDataViewHolder holder) {
        return Optional.ofNullable(holder.getPersistentDataContainer().get(key, type));
    }

    public void set(PersistentDataHolder holder, C value) {
        holder.getPersistentDataContainer().set(key, type, value);
    }
}
