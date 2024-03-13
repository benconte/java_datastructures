import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F");
//        linkedList.pop();

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
//        linkedList.poll();

        linkedList.add(4, "E");
        linkedList.remove("E");
        System.out.println(linkedList.indexOf("F"));

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("G");
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        System.out.println(first);
        System.out.println(last);

        System.out.println(linkedList);
    }
}

/*
* arrays and arrayList store elements in contiguous memory location
* where arrays and arrayList struggle with insert and delete, linkedLists exel at that
* linked lists suck at searching. Since you've to start from the head
*
* advantages?
* Dynamic Data structure (allocates needed memory while running)
* insertion and Deleting of nodes is easy. o(1)
* No/Low memory waste
*
* disadvantages?
* Greater memory usage (additional pointer)
* No random access of elements (no index [i])
* accessing/searching elements is more time consuming. O(n)
*
* uses?
* implement stacks/queues
* GPS navigation
* music playlist
*/