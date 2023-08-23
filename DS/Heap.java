package DS;

import java.util.Arrays;

// Min-Heap
public class Heap {
    int[] heap;
    int size;
    int capacity;

    public Heap(int c){
        this.capacity = c;
        this.size = 0;
        this.heap = new int[capacity];
    }

    public int getParent(int index){
        return (index-1)/2;
    }

    public int getLeftChild(int index){
        return (index*2)+1;
    }

    public int getRightChild(int index){
        return (index*2)+2;
    }

    public boolean hasParent(int index){
        return getParent(index) >= 0;
    }

    public boolean hasLeftChild(int index){
        return getLeftChild(index) < size;
    }

    public boolean hasRightChild(int index){
        return getRightChild(index) < size;
    }

    private void swap(int a, int b) {
        int tmp = heap[a];
        heap[a] = heap[b];
        heap[b] = tmp;
    }

    public void floatUp(int index){
        while(hasParent(index) && heap[index] < heap[getParent(index)]){
            int tmp = getParent(index);
            swap(index, tmp);
            index = tmp;
        }
    }

    public void floatDown(int index){
        if(hasLeftChild(index)){
            int smallestChildIndex = getLeftChild(index);
            if(hasRightChild(index) && heap[smallestChildIndex] > heap[getRightChild(index)])
                smallestChildIndex = getRightChild(index);

            if(heap[getParent(index)] < heap[smallestChildIndex])
                return;

            swap(index, smallestChildIndex);
            index = smallestChildIndex;

            floatDown(index);
        }

        return;
    }

    public void insert(int value){
        if(size == capacity){
            System.err.println("Heap is full");
            return;
        } else if(size == 0) {
            heap[0] = value;
            size++;
            return;
        }
        
        heap[size] = value;
        size++;
        floatUp(size - 1);
    }

    public int extractMin(){
        if(size == 0){
            System.err.println("Heap is empty");
            return -999;
        }

        int min = heap[0];
        heap[0] = heap[size-1];
        size--;
        floatDown(0);
        return min;
    }

    public void heapify(int[] array) {
        if (array.length > capacity) {
            System.err.println("Input array is larger than heap capacity.");
            return;
        }

        size = array.length;
        heap = Arrays.copyOf(array, capacity);

        // Starting from the last parent node and moving up to the root
        for (int i = getParent(size - 1); i >= 0; i--) {
            floatDown(i);
        }
    }

    public static void main(String[] args){
        Heap heap = new Heap(5);
        heap.insert(3);
        heap.insert(2);
        heap.insert(0);
        heap.insert(1);
        heap.insert(64);

        System.out.println("Heap contents:");
        for (int i = 0; i < heap.size; i++) {
            System.out.print(heap.heap[i] + " ");
        }
        System.out.println();

        System.out.println("Extracted min value: " + heap.extractMin());
        System.out.println("Extracted min value: " + heap.extractMin());
        System.out.println("Extracted min value: " + heap.extractMin());
        System.out.println("Extracted min value: " + heap.extractMin());
        System.out.println("Extracted min value: " + heap.extractMin());

        Heap heapifiedHeap = new Heap(5);
        int[] a = {3, 2, 0, 1, 64};
        heapifiedHeap.heapify(a);
        System.out.println("Heapified contents:");
        for (int i = 0; i < heapifiedHeap.size; i++) {
            System.out.print(heapifiedHeap.heap[i] + " ");
        }
        System.out.println();

        System.out.println("Extracted min value: " + heapifiedHeap.extractMin());
        System.out.println("Extracted min value: " + heapifiedHeap.extractMin());
        System.out.println("Extracted min value: " + heapifiedHeap.extractMin());
        System.out.println("Extracted min value: " + heapifiedHeap.extractMin());
        System.out.println("Extracted min value: " + heapifiedHeap.extractMin());
    }
}

