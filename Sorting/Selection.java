package Sorting;

public class Selection {

    public static void selectionSort(int[] array){
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the first element of the unsorted array
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] a = {43,23,45,87,90,9,8,65,23,55,12,90,100,43,5,89,2};
        selectionSort(a);
        for(int i=0; i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}

/* Logic:
 * Scan through each element in array. Keep track of minIndex of the smallest number. After the end of iteration/round swap the minIndex and its value to the front of the array.
 * Simple as that, you can also do the opposite where you keep track of maxIndex and swap it towards the back of the array.
 * 
 * Time complexity:
 * Worst: O(n^2)
 * Avg: O(n^2)
 * Best: O(n^2)
 * 
 * Space complexity:
 * O(1)
 */
