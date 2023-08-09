// package BuiltIn;

import java.util.List;
import java.util.ArrayList;

public class ArrayListBuiltIn{

    public static void main(String[] args) {
        // Create a new ArrayList
        List<String> list = new ArrayList<>();

        // Add elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Access elements by index
        String firstElement = list.get(0);
        System.out.println("First element: " + firstElement);

        // Check if an element is present in the list
        boolean containsOrange = list.contains("Orange");
        System.out.println("Contains Orange? " + containsOrange);

        // Get the size of the list
        int size = list.size();
        System.out.println("Size of the list: " + size);

        // Iterate over the elements of the list
        System.out.println("Elements of the list:");
        for (String element : list) {
            System.out.println(element);
        }
    }
}