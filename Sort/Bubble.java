package Sort;

public interface Bubble {

    public static void bubbleSort(int[] array) {
        int n = array.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                // Swap adjacent elements if they are in the wrong order
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {43,23,45,87,90,9,8,65,23,55,12,90,100,43,5,89,2};
        bubbleSort(a);
        for(int i=0; i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}

/* Logic:
 * iterate through array and compare each element starting at the ith element, and keeping going through that round (1 iteration) by looking at all neighbors through the inner loop.
 * swap when necessary if the elem on the left is > the elem on the right
 * 
 * Time complexity:
 * Worst: O(n^2)
 * Avg: O(n^2)
 * Best: O(n^2)
 * 
 * Space complexity:
 * O(1)
 */
