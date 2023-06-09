package Sorting;
import java.util.Arrays;

public class Merge{

    public static void merge(int[] l, int[] r, int[] a){
        int i=0,j=0;

        //simply check which elem to put back into a
        while(i+j < a.length){
            if(j == r.length || (i < l.length && l[i] < r[j]))
                a[i+j] = l[i++];
            else
                a[i+j] = r[j++];
        }
    }

    public static void mergeSort(int[] a){
        int len = a.length;
        if(len < 2) return;

        int mid = len / 2;
        int[] l = Arrays.copyOfRange(a, 0, mid);
        int[] r = Arrays.copyOfRange(a, mid, len);

        // divide and conquer all the way to only having 1 elem, and then merge and combine the two arrays recur.
        mergeSort(l);
        mergeSort(r);
        merge(l,r,a);
    }

    public static void main(String[] args){
        int[] a = {43,23,45,87,90,9,8,65,23,55,12,90,100,43,5,89,2};
        mergeSort(a);
        for(int i=0; i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}

/* Logic:
 * divide each array in half -> O(logn)
 * iterate/combine each elem in splitted arrays (l & r) and put them back into a -> O(n)
 * 
 * Time complexity:
 * Worst: O(nlogn)
 * Avg: O(nlogn)
 * Best: O(nlogn)
 */