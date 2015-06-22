package lru_cache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Simple Least Recently Used Cache.
 */
public class SimpleLRUCache<T, R> extends LinkedHashMap<T, R> {

    private static final long serialVersionUID = 1L;

    private final int capacity;

    public SimpleLRUCache(int capacity) {
        super(capacity + 1, 1.1F, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<T, R> eldest) {
        return this.size() > capacity;
    }
}
