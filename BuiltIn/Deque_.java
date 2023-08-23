package BuiltIn;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_ {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // Enqueue elements at the back
        deque.offerLast(1);
        deque.offerLast(2);
        deque.offerLast(3);

        // Enqueue elements at the front
        deque.offerFirst(0);

        // Dequeue elements from the front
        while (!deque.isEmpty()) {
            int element = deque.pollFirst();
            System.out.println(element);
        }

        // Output: 0, 1, 2, 3
    }
}
