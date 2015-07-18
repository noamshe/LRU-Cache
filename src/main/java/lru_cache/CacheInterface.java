package lru_cache;

/**
 * Created by noamshe on 7/18/2015.
 */
public interface CacheInterface <K, V> {
    void put(K key, V value);
    V get(K key);
    boolean canAppend();
}
