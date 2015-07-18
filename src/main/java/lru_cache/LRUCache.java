package lru_cache;

import linked_list.LinkedList;
import linked_list.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by noamshe on 7/18/2015.
 */
public class LRUCache <K, V> implements CacheInterface <K, V> {
    private final Map<K, Node> cache;
    private LinkedList<V> linkedList;
    private int cacheSize;

    public LRUCache(int size) {
        cache = new HashMap<K, Node>();
        linkedList = new LinkedList<V>();
        cacheSize = size;
    }

    public void put(K key, V value) {
        if (!canAppend()) {
            linkedList.removeLast();
        }
        Node node = linkedList.prepend(value);
        cache.put(key, node);
    }

    public V get(K key) {
        Node<V> node = cache.get(key);
        if (node == null) {
            return null;
        }
        linkedList.bringToFront(node);
        return node.data;
    }

    public boolean canAppend() {
        return linkedList.size() < cacheSize;
    }

    public void printCache() {
        System.out.println(cache.toString());
        linkedList.print();
    }

    public int size() {
        return cache.size();
    }
}
