package arrays;

import java.util.ArrayList;

public class DynamicArray {
    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity];
    }
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data) {
        if(size >= capacity) {
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data) {
        if (size >= capacity) {
            grow();
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = data;
        size++;
    }

    public void delete(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
               for (int j = 0; j < (size - i -1); j++) {
                   array[i + j] = array[i + j + 1];
               }
               array[size - 1] = null;
               size--;

               if (size <= (int) (capacity/3)) {
                   shrink();
               }
               break;
            }
        }
    }

    public int search(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    private void grow() {
        int newCapacity = (int)(capacity * 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    private void shrink() {
        int newCapacity = (int)(capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {

        String string = "";

        for (int i = 0; i < capacity; i++) {
            string += array[i] + ", ";
        }

        if (string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        } else {
            string = "[]";
        }
        return string;
    }
}

/*
* A Dynamic array is an array with a resizable capacity if we need extra room
* Also known as ArrayList
* A static array has a fixed size. It is assign size at compile time and cannot be modified
*
* Advantages:
* Random access of elements O(1)
* Good locality of reference and data cache utilization
* Easy to insert/delete at the end
*
* Disadvantage
* wastes more memory
* shifting elements is time consuming O(n)
* Expanding/shrinking the array is time consuming O(n). Because we have to copy all elements to a new array
*/
