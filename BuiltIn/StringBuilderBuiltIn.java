// package BuiltIn;

public class StringBuilderBuiltIn {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");           // Append a string
        sb.append(" World");          // Append another string
        sb.insert(5, ",");            // Insert a comma at index 5
        sb.replace(6, 11, "there");   // Replace a substring
        sb.delete(12, sb.length());   // Delete from index 12 onwards

        String result = sb.toString(); // Convert StringBuilder to a String

        System.out.println(result);   // Output: Hello, there
        System.out.println(sb.reverse()); //can reverse a string easily


        //Can do StringBuilder(s) to inline making it
    }
}


// The approach to choose for performing operations on a string depends on the specific requirements and the nature of the operations you need to perform. Here are some considerations for each approach:

// Concatenation using the + operator:

// The + operator allows you to concatenate strings using the concatenation operator. It is simple and straightforward to use.
// However, it creates a new string object each time the concatenation is performed, which can be inefficient if you need to perform multiple concatenations or if you are working with large strings.
// This approach is suitable for occasional concatenations or when the performance impact is negligible.
// Converting the string to a charArray:

// If you need to perform operations that involve manipulating individual characters or require direct access to the characters of the string, converting it to a charArray can be beneficial.
// Modifying a charArray is more efficient than repeatedly creating new strings, especially if you need to modify the string extensively.
// However, keep in mind that converting a string to a charArray itself requires additional memory and time.
// Using StringBuilder or StringBuffer:

// If you need to perform multiple modifications or concatenations on a string, it is recommended to use StringBuilder (or StringBuffer if thread safety is a concern).
// StringBuilder provides a mutable sequence of characters and allows you to efficiently modify the string by appending, inserting, or replacing characters.
// StringBuilder is designed for efficiency and performs better than repeated concatenation using the + operator.
// It is particularly useful when you have a series of operations to perform on a string without creating intermediate string objects.
// In summary, if you need to perform occasional concatenations, using the + operator is convenient. If you need to manipulate individual characters or perform extensive modifications, converting the string to a charArray can be helpful. If you have multiple modifications or concatenations, using StringBuilder is recommended for its efficiency.