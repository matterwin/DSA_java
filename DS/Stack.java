package DS;

public class Stack {
    private Node top;
    private int size;

    private class Node{
        int data;
        Node next;

        public Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public Stack(){
        top = null;
        size = 0;
    }

    public void push(int d){
        Node newNode = new Node(d);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        
        int poppedData = top.data;
        top = top.next;
        size--;
        System.out.println("Popped node with data: " + poppedData);
    }

    public void peek(){
        if(isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println(top.data);
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void size(){
        System.out.println(size);
    }

    public static void main(String[] args){
        Stack s = new Stack();
        s.push(3);
        s.peek();
        s.push(5);
        s.peek();
        s.pop();
        s.peek();
        s.pop();
        s.peek();
    }
}
