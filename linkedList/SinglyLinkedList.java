package linkedList;

public class SinglyLinkedList{

    private Node head;
    private int length;
    
    public SinglyLinkedList(){
        this.head = null;
        this.length = 0;
    }

    public void append(int d){
        Node newNode = new Node(d);
        if(head == null) head = newNode;
        else{
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
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
        
    }

    public static void main(String[] args){
        SinglyLinkedList l = new SinglyLinkedList();
        l.append(1);
        l.append(2);
        l.append(3);
        l.append(4);
        l.display();
    }
}