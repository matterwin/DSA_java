package NeetCode.Arrays;

import java.util.Arrays;

public class StaticArray {

    // different ways of initializing an aay
    public void initaays(){ // default value if didn't specify is 0
        int[] nums1 = {1, 2, 3, 4, 5};

        int[] nums2;
        nums2 = new int[]{1,2,3,4,5};

        int[] nums3 = new int[5];
        nums3[0] = 1; nums3[1] = 2;

        int[] nums4 = new int[5];
        Arrays.fill(nums4, 0); // fills aay with 0s

        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
    }

    public static void deleteEnd(int[] a, int len){
        if(len > 0){
            a[len-1] = -1;
            len--;
        }
        traverseArray(a);
    }

    public static void deleteElementAtI(int[] a, int i, int len){ // assume i a is valid index
        for(int j=i+1; j<a.length; j++){
            a[j-1] = a[j];
            len--;
        }
        traverseArray(a);
    }

    // Insert n into a at the next open position.
    // Length is the number of 'real' values in a, and capacity
    // is the size (aka memory allocated for the fixed size aay).
    public static void insertEnd(int[] a, int n, int length, int capacity) {
        if (length < capacity) {
            a[length] = n;
        }
        traverseArray(a);
    } 

    // Insert n into index i after shifting elements to the right.
    // Assuming i is a valid index and arr is not full.
    public void insertMiddle(int[] arr, int i, int n, int length) {
        // Shift starting from the end to i.
        for (int index = length - 1; index > i - 1; index--) {
            arr[index + 1] = arr[index];
        }
        // Insert at i
        arr[i] = n;
    }

    
    public static void traverseArray(int[] a){
        System.out.println("");
        for(int i=0; i<a.length; i++)
            System.out.println("Element " + i + ": " + a[i]);
    }
    
    public static void main(String args[]){
        int[] n = new int[]{1,2,3};
        traverseArray(n);
        deleteEnd(n, n.length);
        int[] n1 = new int[]{1,2,3};
        deleteElementAtI(n1, 0, n1.length);
        int n2[] = new int[5];
        insertEnd(n2, 3, 0, n2.length);

        // note everything in java is passed by value, but aays are passed by value but a copy of it is
        // passed, and so changing things on that copy will change the original aay
        // unless you completely change the memory location of the arugment/copied aay, then that doesnt
        // effect the original aay
    }
}

