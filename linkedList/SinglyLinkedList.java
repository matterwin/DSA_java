package LinkedList;

public class SinglyLinkedList{

    private Node head;
    private int length;
    
    public class Node {
        public int data;
        public Node next;

        public Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    
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
        length++;
    }

    public void insert(int pos, int d){
        if(pos > length + 2 || pos <= 0){
            System.out.println("Out of bounds, good job chump");
            return;
        }
        Node newNode = new Node(d);
        if(pos == 1){
            newNode.next = head;
            head = newNode;
            length++;
            System.out.println("Adding node with data: " + d + " at pos: " + pos);
            return;
        }
        Node curr = head;
        int i = 1;
        while(curr.next != null && (i != pos-1)){
            curr = curr.next;
        }
        Node temp = curr.next;
        curr.next = newNode;
        newNode.next = temp;
        System.out.println("Adding node with data: " + d + " at pos: " + pos);
        length++;
    }

    public void removeNodeWithDataD(int d){
        if(length == 0){
            System.out.println("List is empty");
            return;
        }
        if(head.data == d){
            head = head.next;
            length--;
            return;
        }

        Node curr = head;
        while(curr.next != null){
            if(curr.next.data == d){
                curr.next = curr.next.next;
                System.out.println("Removing node with data: " + d);
                length--;
                return;
            }
            curr = curr.next;
        }
    }

    public void removeNodeAtPosition(int pos){
        if(pos > length || pos <= 0){
            System.out.println("Invalid position");
            return;
        }
        else{
            if(pos == 1){
                head = head.next;
                length--;
                System.out.println("Removing node at position: " + pos);
                return;
            }
            else{
                Node curr = head;
                int i = 1;
                while(curr.next != null){
                    if(i == pos){
                        curr.next = curr.next.next;
                        System.out.println("Removing node at position: " + pos);
                        length--;
                        return;
                    }
                    else if(i == pos-1){
                        curr.next = null;
                        System.out.println("Removing node at position: " + pos);
                        length--;
                        return;
                    }
                    curr = curr.next;
                    i++;
                }    
            }
        }
    }

    public void getFirst(){
        if(head == null)
            System.out.println("List is empty");
        else
            System.out.println(head.data);
    }

    public void getLast(){
        if(head == null)
            System.out.println("List is empty");
        else{
            Node curr = head;
            while(curr.next  != null)
                curr = curr.next;
            System.out.println(curr.data);
        }
    }

    public boolean contains(int value){
        Node curr = head;
        while(curr != null){
            if(curr.data == value)
                return true;
            curr = curr.next;
        }
        return false;
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
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
        SinglyLinkedList l = new SinglyLinkedList();
        l.append(1);
        l.append(2);
        l.append(3);
        l.append(4);
        l.display();
        l.removeNodeWithDataD(3);
        l.display();
        l.removeNodeAtPosition(3);
        l.display();
        l.insert(1, 10);
        l.display();
        System.out.println(l.contains(2));
        l.getLast();
        l.getFirst();
        l.reverse();
        l.display();
    }
}