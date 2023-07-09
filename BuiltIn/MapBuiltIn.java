package BuiltIn;
    import java.util.HashMap;
import java.util.Map;

public class MapBuiltIn {

    public static void main(String[] args) {
        // Create a new HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put("apple", 5);
        hashMap.put("banana", 2);
        hashMap.put("orange", 8);

        // Access values by key
        int appleCount = hashMap.get("apple");
        System.out.println("Apple count: " + appleCount); // Output: Apple count: 5

        // Update the value for a key
        hashMap.put("banana", 4);

        // Check if a key exists in the HashMap
        boolean hasBanana = hashMap.containsKey("banana");
        System.out.println("Has banana: " + hasBanana); // Output: Has banana: true

        // Remove a key-value pair from the HashMap
        hashMap.remove("orange");

        int appleFrequency = hashMap.getOrDefault("apple", 0);
        System.out.println("Apple frequency: " + appleFrequency); // Output: 5

        int kiwiFrequency = hashMap.getOrDefault("kiwi", 0);
        System.out.println("Kiwi frequency: " + kiwiFrequency); // Output: 0

        // Iterate over the key-value pairs in the HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String fruit = entry.getKey();
            int count = entry.getValue();
            System.out.println(fruit + ": " + count);
        }
    }
}
