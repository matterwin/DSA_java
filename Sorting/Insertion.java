package Sorting;

public class Insertion {
    
        public static void insertionSort(int[] arr) {
            int n = arr.length;
            
            // Iterate through each element in the array
            for (int i = 1; i < n; i++) {
                int current = arr[i];
                int j = i - 1;
                
                // Move elements of arr[0..i-1], that are greater than current, to one position ahead of their current position
                while (j >= 0 && arr[j] > current) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                
                // Place the current element at its correct position in the sorted sequence
                arr[j + 1] = current;
            }
        }
        
        public static void main(String[] args) {
            int[] a = {43,23,45,87,90,9,8,65,23,55,12,90,100,43,5,89,2};
            insertionSort(a);
            for(int i=0; i<a.length;i++){
                System.out.print(a[i] + " ");
            }
        }
    
}
