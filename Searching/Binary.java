package Searching;

public class Binary {
    
    public static boolean binarySearch(int[] data, int target, int low, int high){
        if(low > high)
            return false;  

        int mid = (low + high) / 2;
        if(data[mid] == target) return true;
        if(data[mid] < target) return binarySearch(data, target, mid + 1, high);
        else return binarySearch(data, target, low, mid - 1);
    }
    public static void main(String[] args){
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.print(binarySearch(sortedArray, 2, 0, sortedArray.length-1));
    }
}