package linked_list;

/**
 * Created by noamshe on 7/18/2015.
 */
public class Node<T> {
    public T data;
    Node next;
    Node prev;

    public Node(T data) {
        this.data = data;
    }
}

