package BuiltIn;
import java.util.LinkedList;
import java.util.Queue;

public class QueueBuiltIn {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        // Dequeue elements
        int firstElement = queue.poll();
        System.out.println(firstElement); // Output: 1

        // Peek at the front element
        int frontElement = queue.peek();
        System.out.println(frontElement); // Output: 2

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println(isEmpty); // Output: false

        // Get the size of the queue
        int size = queue.size();
        System.out.println(size); // Output: 2
    }
}
