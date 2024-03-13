class DoubleListNode {
    int val;
    DoubleListNode prev;
    DoubleListNode next;

    DoubleListNode(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class MyDoublyLinkedList {
    private DoubleListNode head;
    private DoubleListNode tail;

    public MyDoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addAtHead(int val) {
        DoubleListNode newNode = new DoubleListNode(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addAtTail(int val) {
        DoubleListNode newNode = new DoubleListNode(val);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void printList() {
        DoubleListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        MyDoublyLinkedList list = new MyDoublyLinkedList();
        list.addAtHead(5);
        list.addAtTail(10);
        list.addAtHead(2);
        list.addAtTail(15);

        list.printList(); // Output: 2 5 10 15
    }
}
