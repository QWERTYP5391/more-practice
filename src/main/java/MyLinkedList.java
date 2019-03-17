public class MyLinkedList<T> {

    public Node<T> head = null;

    public void insertFirst(T item) {
        head = new Node(item, head);

    }

    public Node getFirst() {
        return head;
    }

    public Node getLast() {

        if (head == null) {
            return null;
        }
        Node node = head;


        while (node.next != null) {
            node = node.next;
        }

        return node;
    }

    public void removeFirst() {
        if (head == null) {
            return;
        }

        head = head.next;
    }

    public void removeLast() {
        if (head == null) {
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node previous = head;
        Node node = head.next;

        while(node.next != null){
            previous = node;
            node = node.next;
        }

        previous.next = null;


    }

    public int size() {
        Node node = head;
        int value = 0;

        while (node != null) {
            node = node.next;
            value++;
        }

        return value;
    }

    public Node getMiddle(){
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }

    public boolean isCycle(){
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null){
            if(slow == fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;

        }

        return false;

    }

    public void clear() {
        head = null;
    }
}
