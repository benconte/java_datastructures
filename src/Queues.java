import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        /*
         * Queue = FIFO data structure. First in first out. (ex. line of people)
         *           A collection designed for holding elements prior to processing linear data strucute
         *
         *       add = enqueue, offer(). add at the end
         *       remove = dequeue, poll(). remove from the head
         *       peek() = will examine the head and return it
         *
         *       NOTE: a queue in java is an interface, so can not be instantiated
         *
         *  ****************************************************************************
         */

        Queue<String> queue = new LinkedList<String>();


        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");
        // System.out.println(queue.isEmpty());
//        System.out.println(queue.size());

        //System.out.println(queue.contains("Harold"));

//        System.out.println(queue.peek());
//        queue.poll();
        System.out.println(queue);
    }
}

/*
 * where are queues useful?
 *
 * keyboard Buffer (letters should appear on the screen in the order they are pressed)
 * printer queue (print jobs should be completed in order)
 * used in linkedLists, PriorityQueues, Breadth-first search
 * */