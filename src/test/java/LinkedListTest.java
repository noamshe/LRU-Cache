import linked_list.LinkedList;
import lru_cache.LRUCache;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by noamshe on 7/18/2015.
 */
public class LinkedListTest {

    @Test
    public void insertTest() {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.prepend("1");
        linkedList.prepend("2");
        linkedList.prepend("3");

        assertEquals(linkedList.size(), 3);
        assertEquals(linkedList.getFirst().data, "3");
        assertEquals(linkedList.getLast().data, "1");
    }

    @Test
    public void LRUTest() {
        LRUCache<String, String> lruCache = new LRUCache<String, String>(3);
        lruCache.put("1", "value 1");
        lruCache.put("2", "value 2");
        lruCache.put("3", "value 3");

        assertEquals(lruCache.size(), 3);
        assertEquals(lruCache.get("1"), "value 1");
        assertEquals(lruCache.get("2"), "value 2");
        assertEquals(lruCache.get("3"), "value 3");

        lruCache.put("4", "value 4");

        assertTrue(lruCache.get("1") == null);
        assertTrue(lruCache.get("2") != null);
        assertTrue(lruCache.get("3") != null);
        assertTrue(lruCache.get("4") != null);
    }
}
