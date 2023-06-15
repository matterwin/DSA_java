package Sorting;

public class Quick {

    private static void quickSort(int[] S, int a, int b) {

        if (a >= b) return; // subarray is trivially sorted
        int left = a;
        int right = b-1;
        int pivot = S[b];
        int temp; // temp object used for swapping
        while (left <= right) {
            // scan until reaching value equal or larger than pivot (or right marker)
            while (left <= right && (S[left] < pivot)) left++;
            // scan until reaching value equal or smaller than pivot (or left marker)
            while (left <= right && (S[right] > pivot)) right--;
            if (left <= right) { // indices did not strictly cross
                // so swap values and shrink range
                temp = S[left];
                S[left] = S[right];
                S[right] = temp;
                left++;
                right--;
            }
        }
        // put pivot into its final place (currently marked by left index)
        temp = S[left];
        S[left] = S[b];
        S[b] = temp;
        // make recursive calls
        quickSort(S, a, left-1);
        quickSort(S, left + 1, b);
    }

    public static void main(String[] args){
        int[] a = {43,23,45,87,90,9,8,65,23,55,12,90,100,43,5,89,2};
        quickSort(a, 0, a.length-1);
        for(int i=0; i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}

/* Logic:
 * Have a left marker and right marker, and set pivot to be the last elm in array
 * Start with left: iterate over array until you find an elem bigger than pivot and stop at that index if found
 * Next is right: iterated over array until you find an elem smaller than pivot and stop at that index if found
 * If the two markers cross over:
 *  swap the left marker with the pivot and that pivot stays there forever & recursively start quickSorting again 
 *      the left subarray from the swapped pivot index, and then the rightsubarray
 * 
 * If the two markers did not cross over:
 *  swap the left and right marker and start the process over in a loop while keeping the index of iterators the same
 * 
 * 
 * Time complexity:
 * Worst: O(n^2)
 * Avg: O(nlogn)
 * Best: O(nlogn)
 * 
 * Space complexity:
 * O(logn)
 */