// package BuiltIn;

import java.util.LinkedList;

public class LinkedListBuiltIn {
    public static void main(String[] args) {
        // Create a new LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the front of the list
        linkedList.addFirst("Apple");
        linkedList.addFirst("Banana");

        // Add elements to the end of the list
        linkedList.addLast("Orange");
        linkedList.addLast("Mango");

        // Add elements to the list
        linkedList.add("Kiwi");
        linkedList.add("Pineapple");
        linkedList.add("Pumpkin");

        // Insert a new node at index 1
        linkedList.add(1, "Watermelon");

        // Remove the node at index 1
        linkedList.remove(1);

        // Access elements by index
        String firstElement = linkedList.get(0);
        System.out.println("First element: " + firstElement);

        // Check if an element is present in the list
        boolean containsOrange = linkedList.contains("Orange");
        System.out.println("Contains Orange? " + containsOrange);

        // Get the size of the list
        int size = linkedList.size();
        System.out.println("Size of the list: " + size);

        // Iterate over the elements of the list
        System.out.println("Elements of the list:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
