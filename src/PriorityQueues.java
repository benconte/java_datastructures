import java.util.*;

public class PriorityQueues {
    public static void main(String[] args) {
        /*
         * priority Queue = A FIFO data structure that serves elements with the
         *                   highest priorities first before elements with lower priority
         * */

        // Queues are interfaces so can not be instantiated. But we can use a data structure that utilises the Queue
        // priority queues have a default order. Sorted different by default
        Queue<String> queue = new PriorityQueue<>();
        // Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}
