package Trees;

public class Binary {
    Node root;

    public class Node{
        Node left;
        Node right;
        int data;

        public Node(int d){
            this.left = null;
            this.right = null;
            this.data = d;
        }
    }

    public Binary(){
        root = null;
    }

    public void insert(int d){
        if(root == null){
            Node newNode = new Node(d);
            root = newNode;
        }
        else{
            
        }
    }

    public static void main(String[] args){
        Binary bt = new Binary();
        bt.insert(10);
    }
}
