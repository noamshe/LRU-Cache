package linked_list;

/**
 * Created by noamshe on 7/18/2015.
 */
public class LinkedList <T> {

    Node<T> head;
    Node<T> last;
    int size;

    public LinkedList() {
        head = null;
        last = null;
        size = 0;
    }

    public Node apppend(T value) {
        size ++;
        if (head == null) {
            head = new Node(value);
            head.prev = null;
            head.next = null;
            last = head;
            return head;
        } else {
            Node newNode = new Node(value);
            newNode.next = null;
            newNode.prev = last;
            last.next = newNode;
            last = newNode;
            return newNode;
        }
    }

    public Node prepend(T value) {
        size ++;
        if (head == null) {
            head = new Node(value);
            head.prev = null;
            head.next = null;
            last = head;
            return head;
        } else {
            Node newNode = new Node(value);
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
            return newNode;
        }
    }

    public void bringToFront(Node node) {
        if (node == head) {
            return;
        }
        Node next = node.next;
        Node prev = node.prev;
        node.next = head;
        node.prev = null;
        prev.next = next;
        if (next != null) {
            next.prev = prev;
        }
        head = node;
        if (last == node) {
            last = prev;
        }
    }

    public Node removeLast() {
        size --;
        Node removed = last;
        Node prev = removed.prev;
        prev.next = null;
        last = prev;

        return removed;
    }

    public int size() {
        return size;
    }

    public Node getFirst() {
        return head;
    }

    public Node getLast() {
        return last;
    }

    public void print() {
        Node pointer = head;
        while (pointer != null) {
            System.out.println(pointer.data);
            pointer = pointer.next;
        }
    }
}
