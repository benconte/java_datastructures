import java.util.*;
public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

//        System.out.println(stack.empty());z
//        uses LIFO. Stores object in a sort of vertical tower
        stack.push("Minecraft");
        stack.push("Skyerim");
        stack.push("DOOM");
        stack.push("Borderlans");
        stack.push("FFVVII");

        // pop removes from the top
        // String myFavGame = stack.pop();

        // to see the top most element of the stack
        // System.out.println(stack.peek());
        // System.out.println(myFavGame);

        // System.out.println(stack.search("Minecraft"));
        System.out.println(stack);
    }
}

/*
* uses of stacks>
* undo/redo features in text editors
* moving back through browser history
* backtracking algorithms (maze, file directories)
* calling functions (call stack)
* */