// package BuiltIn;

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


// In practice, the difference between offer() and add() is minimal in a PriorityQueue. 
// Since a PriorityQueue doesn't have an explicit capacity limit (it dynamically resizes as needed), 
//  it is highly unlikely for offer() to return false or for add() to throw an IllegalStateException. 
// Thus, in most cases, you can use offer() and add() interchangeably.


// Output
    // 3
    // 2
    // 1


// public class CustomComparatorPriorityQueue {

//     public static void main(String[] args) {
//         // Create a custom comparator based on values in ascending order
//         Comparator<Map.Entry<Integer, Integer>> customComparator = (a, b) -> a.getValue() - b.getValue();

//         // Create a PriorityQueue with the custom comparator
//         PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(customComparator);

//         // Add entries to the priority queue
//         Map.Entry<Integer, Integer> entry1 = new AbstractMap.SimpleEntry<>(1, 5);
//         Map.Entry<Integer, Integer> entry2 = new AbstractMap.SimpleEntry<>(2, 3);
//         Map.Entry<Integer, Integer> entry3 = new AbstractMap.SimpleEntry<>(3, 7);

//         pq.offer(entry1);
//         pq.offer(entry2);
//         pq.offer(entry3);

//         // Dequeue elements
//         while (!pq.isEmpty()) {
//             Map.Entry<Integer, Integer> entry = pq.poll();
//             System.out.println(entry.getKey() + ": " + entry.getValue());
//         }
//     }
// }



// output
    // 2: 3
    // 1: 5
    // 3: 7