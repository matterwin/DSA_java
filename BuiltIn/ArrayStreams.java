package BuiltIn;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStreams {
    public static void main(String[] args) {
        // Creating an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Creating an IntStream from the array
        IntStream stream = Arrays.stream(numbers);

        // Filtering even numbers
        IntStream evenNumbers = stream.filter(n -> n % 2 == 0);

        // Squaring each number
        IntStream squaredNumbers = evenNumbers.map(n -> n * n);

        // Summing the squared numbers
        int sum = squaredNumbers.reduce(0, (acc, n) -> acc + n);

        System.out.println("Sum of squared even numbers: " + sum);
    }
}

//          filter Operation:

// The filter operation applies a given predicate to each element in the stream and creates a new stream containing only the elements that satisfy the predicate.

// Time Complexity: O(n), 
//  where n is the number of elements in the stream. The filter operation needs to process each element in the stream once to determine if it should be included in the filtered stream.

// Space Complexity: O(1) for intermediate storage, 
//  as the filter operation only creates a new stream with references to the original elements that satisfy the predicate. No additional storage is required for each filtered element.

//          map Operation:

// The map operation transforms each element in the stream according to a given function and creates a new stream containing the transformed elements.

// Time Complexity: O(n), 
//  where n is the number of elements in the stream. Similar to the filter operation, the map operation processes each element in the stream once to apply the transformation.

// Space Complexity: O(n), 
//  where n is the number of elements in the stream. The map operation creates a new stream with transformed elements, so space is required to store these new elements.

//          reduce Operation:

// The reduce operation combines the elements of the stream using a binary operation, such as summation or multiplication, to produce a single result.

// Time Complexity: O(n), 
//  where n is the number of elements in the stream. The reduce operation needs to perform the reduction operation on each pair of elements in the stream, leading to linear time complexity.

// Space Complexity: O(1), 
//  as the reduce operation only needs a constant amount of space to store intermediate results and the final reduced value.

