package BuiltIn;
import java.util.PriorityQueue;

public class PriorityQueueBuiltIn {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Enqueue elements
        queue.offer(1);
        queue.offer(3);
        queue.offer(2);

        // Using add()
        queue.add(1);
        queue.add(3);
        queue.add(2);

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



// Enqueue elements
    // queue.offer(3);
    // queue.offer(1);
    // queue.offer(2);

    // // Dequeue elements
    // while (!queue.isEmpty()) {
    //     int element = queue.poll();
    //     System.out.println(element);
    // }

// Output
    // 1
    // 2
    // 3

// --------------------------
// Enqueue elements
    // queue.offer("apple");
    // queue.offer("banana");
    // queue.offer("pear");

    // // Dequeue elements
    // while (!queue.isEmpty()) {
    //     int element = queue.poll();
    //     System.out.println(element);
    // }

// Output
    // pear
    // apple
    // banana