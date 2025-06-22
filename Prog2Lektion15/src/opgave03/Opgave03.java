package opgave03;

import opgave03.models.DropOutStack;

public class Opgave03 {
    public static void main(String[] args) {
        DropOutStack<String> stack = new DropOutStack<>(3);

        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Peek: " + stack.peek()); // C

        stack.push("D"); // A droppes automatisk

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        // Output: D, C, B
    }
}
