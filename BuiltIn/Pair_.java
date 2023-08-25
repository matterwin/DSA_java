package BuiltIn;

import org.apache.commons.lang3.tuple.Pair;
import java.util.LinkedList;
import java.util.Queue;

public class Pair_ {
    public static void main(String[] args) {
        // Creating a queue of pairs of integers
        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        
        // Adding pairs to the queue
        q.offer(Pair.of(1, 2));
        q.offer(Pair.of(3, 4));
        q.offer(Pair.of(5, 6));

        // Polling pairs from the queue and displaying values
        while (!q.isEmpty()) {
            Pair<Integer, Integer> pair = q.poll();
            int firstValue = pair.getLeft();
            int secondValue = pair.getRight();
            System.out.println("Pair: " + firstValue + ", " + secondValue);
        }
    }
}
