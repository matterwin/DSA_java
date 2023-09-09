package NeetCode.Arrays;

import java.util.ArrayList;

public class DynamicArray {
    private ArrayList<Integer> list;

    public DynamicArray(){
        list = new ArrayList<>();
    }

    public void pushBack(int n){
        list.add(n);
    }

    public int get(int index){
        if(index < 0 || index >= list.size())
            throw new IndexOutOfBoundsException("Index out of bounds");
        return list.get(index);
    }   

    public int size(){
        return list.size();
    }

    public static void main(String[] args){
        DynamicArray d = new DynamicArray();

        d.pushBack(0);
        d.pushBack(5);
        d.pushBack(8);

        System.out.println("Size of the dynamic array: " + d.size());
        System.out.println("Element at index 1: " + d.get(1));
    }
}