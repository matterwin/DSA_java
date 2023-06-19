package LinkedList;

public class Queue {
    Node top;
    int size;

    public class Node{
        Node next;
        int data;

        public Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public Queue(){
        this.top = null;
        this.size = 0;
    }

    public void add(int d){
        Node newNode = new Node(d);
        if(isEmpty())
            top = newNode;
        else{
            Node curr = top;
            while(curr.next != null)
                curr = curr.next;
            curr.next = newNode;
        }
        size++;
    }

    public void remove(){
        if(isEmpty())
            System.out.println("Stack is empty");
        else{
            System.out.println("Removing node with data: " + top.data);
            top = top.next;
            size--;          
        }
    }

    public void getLast(){
        if(isEmpty())
            System.out.println("Stack is empty");
        else{
            Node curr = top;
            while(curr.next != null)
                curr = curr.next;
            System.out.println("Last node in list is node with data: " + curr.data);
        }
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

    public static void main(String[] args){
        Queue q = new Queue();
        q.add(3);
        q.add(90);
        q.peek();
        q.getLast();
        q.remove();
        q.peek();
        q.remove();
        q.peek();
    }
}
