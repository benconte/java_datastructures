package arrays;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(5);

        // System.out.println(dynamicArray.capacity);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");

        // dynamicArray.insert(0, "X");
        // dynamicArray.delete("X");

        // System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty());
    }
}
