package arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class Tests {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTIme;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // *****************************LinkedList******************************
        startTime = System.nanoTime();

        // do something
        // linkedList.get(0);
        // linkedList.get(500000);
        // linkedList.get(999999);
        // linkedList.remove(0);
        // linkedList.remove(500000);
        linkedList.remove(999999);

        endTIme = System.nanoTime();

        elapsedTime = endTIme - startTime;

        System.out.println("LinkedList:\t" + elapsedTime + "ns");

        // *****************************ArrayList******************************
        startTime = System.nanoTime();

        // do something
        // arrayList.get(0);
        // arrayList.get(500000);
        // arrayList.get(999999);
        // arrayList.remove(0);
        // arrayList.remove(500000);
        arrayList.remove(999999);

        endTIme = System.nanoTime();

        elapsedTime = endTIme - startTime;

        System.out.println("ArrayList:\t" + elapsedTime + "ns");
    }
}

/*
* Testing array lists again linked lists
*/