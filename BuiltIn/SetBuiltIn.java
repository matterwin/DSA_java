package BuiltIn;
import java.util.HashSet;
import java.util.Set;

public class SetBuiltIn {

    public static void main(String[] args) {
        // Create a new HashSet
        Set<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");
        hashSet.add("apple"); // Duplicate elements are not allowed

        // Check if an element is present in the HashSet
        boolean hasApple = hashSet.contains("apple");
        System.out.println("Has apple: " + hasApple); // Output: Has apple: true

        // Remove an element from the HashSet
        hashSet.remove("orange");

        // Get the size of the HashSet
        int size = hashSet.size();
        System.out.println("Size: " + size); // Output: Size: 2

        // Iterate over the elements in the HashSet
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        //How to clear set but does it in O(n)
        hashSet.clear();
    }
}
