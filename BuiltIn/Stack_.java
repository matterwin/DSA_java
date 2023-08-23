package BuiltIn;

import java.util.Stack;

public class Stack_ {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop elements from the stack
        int topElement = stack.pop();
        System.out.println(topElement); // Output: 3

        // Peek at the top element
        int peekElement = stack.peek();
        System.out.println(peekElement); // Output: 2

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println(isEmpty); // Output: false

        // Get the size of the stack
        int size = stack.size();
        System.out.println(size); // Output: 2
    }
}
