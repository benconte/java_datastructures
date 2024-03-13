class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class MySinglyLiinkedList {
    public ListNode head;

    public MySinglyLiinkedList() {
        this.head = null;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void printList() {
        ListNode current = head;
        while(current != null) {
            System.out.println(current.val);
            current = current.next;
        }
        System.out.println();
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        MySinglyLiinkedList linkedList = new MySinglyLiinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtTail(5);
        linkedList.addAtTail(7);
        linkedList.addAtTail(9);

        linkedList.printList();

        // given head [1,3,5,6,9], reverse the list
        reverseList(linkedList);
    }

    public static void reverseList(MySinglyLiinkedList linkedList) {
        ListNode prev = null;
        ListNode current = linkedList.head;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        linkedList.head = prev;
        linkedList.printList();

        /*
         * Output: 9 7 5 3 1
         * Explanation:
         * 1. prev = null, current = 1, next = null
         * 2. next = 3, current.next = null, prev = 1, current = 3
         * 3. next = 5, current.next = 1, prev = 3, current = 5
         * 4. next = 7, current.next = 3, prev = 5, current = 7
         * 5. next = 9, current.next = 5, prev = 7, current = 9
         * 6. next = null, current.next = 7, prev = 9, current = null
         * 7. linkedList.head = 9
         * 8. 9 7 5 3 1
         */
    }
}