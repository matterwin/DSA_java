package BuiltIn;

import java.util.*;

public class MinHeap {

    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.offer(8);
        minHeap.offer(3);
        minHeap.offer(10);
        minHeap.offer(1);
        minHeap.offer(6);

        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}
