package LinkedList;

public class DoublyLinkedList {
    Node head;
    int length;

    public class Node{
        Node next;
        Node prev;
        int data;

        public Node(int d){
            this.data = d;
            this.next = null;
            this.prev = null;
        }
    }

    public DoublyLinkedList(){
        this.length = 0;
        this.head = null;
    }

    public void display(){
         if (head == null)
            System.out.print("No nodes in the list");
        else {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
        }
        System.out.println("");
    }

    public static void main(String[] args){
        DoublyLinkedList d = new DoublyLinkedList();
        d.display();

    } 
}
