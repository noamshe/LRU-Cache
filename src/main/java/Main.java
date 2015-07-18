import linked_list.LinkedList;
import linked_list.Node;
import lru_cache.LRUCache;

/**
 * Created by noamshe on 7/18/2015.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.apppend("1");
        linkedList.apppend("2");
        Node node = linkedList.apppend("3");
        linkedList.apppend("4");
        linkedList.apppend("5");

        linkedList.bringToFront(node);
        linkedList.print();
        System.out.println("");

        LinkedList<String> linkedList2 = new LinkedList<String>();
        linkedList2.prepend("1");
        linkedList2.prepend("2");
        linkedList2.prepend("3");
        linkedList2.prepend("4");
        linkedList2.prepend("5");

        linkedList2.print();

        LRUCache<String, String> lruCache = new LRUCache<String, String>(6);
        lruCache.put("key1", "bla bla 1");
        lruCache.put("key2", "blue blue 2");
        lruCache.put("key3", "red red 3");
        lruCache.put("key4", "bahhhhhhhhh 4");
        lruCache.put("key5", "moooooooooooooo 5");

        lruCache.printCache();

        System.out.println("\nget key:");
        System.out.println(lruCache.get("key5") + "\n");
        System.out.println(lruCache.get("key3") + "\n");

        lruCache.put("key6", "this is 6");
        lruCache.put("key7", "this is 7");
        lruCache.put("key7", "this is 8");
        System.out.println(lruCache.get("key6") + "\n");
        System.out.println(lruCache.get("key6") + "\n");
        System.out.println(lruCache.get("key6") + "\n");
        System.out.println(lruCache.get("key4") + "\n");

        lruCache.put("key7", "this is 9");
        lruCache.printCache();
    }
}
