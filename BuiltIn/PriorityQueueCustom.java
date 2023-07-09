package BuiltIn;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCustom {

    public static void main(String[] args) {
        // Create a custom comparator based on descending order
        Comparator<Integer> customComparator = Comparator.reverseOrder();

        // Create a PriorityQueue with the custom comparator
        PriorityQueue<Integer> queue = new PriorityQueue<>(customComparator);

        // Enqueue elements
        queue.offer(1);
        queue.offer(3);
        queue.offer(2);

        // Dequeue elements
        while (!queue.isEmpty()) {
            int element = queue.poll();
            System.out.println(element);
        }
    }
}



// Output
    // 3
    // 2
    // 1