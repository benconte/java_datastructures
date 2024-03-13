public class recursion {
    public static void main(String[] args) {
        // walk(5);
        // System.out.println(factorial(7));
        System.out.println(power(2, 8));
    }
    public static void walk(int steps) {
        if (steps < 1) return; // base case
        System.out.println("You take a step!");
        walk(steps - 1); // recursive case
    }

    public static int factorial(int num) {
        if (num < 1) return 1; // base case
        return num * factorial(num - 1); // recursive case
    }

    public static int power(int base, int exp) {
        if (exp < 1) return 1;
        return  base * power(base, exp - 1);
    }
}

/*
* recursion - When a thing is defined in terms of itself.
*               Apply the result of a procedure, to a procedure.
*               A recursive method calls itself. Can be a substitute for interaction.
*               Divide a problem into sub-problems of the same type as the original.
*               Commonly used with advanced sorting algorithms and navigation trees
*
*               Advantages
*               ------------
*               easier to read/write
*               easier to debug
*
*               Disadvantages
*               --------------
*               sometimes slower
*               uses more memory
*/
