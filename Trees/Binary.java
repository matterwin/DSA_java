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

    public void insert(int d) {
        root = insertNode(root, d);
    }

    //std bst insertion
    private Node insertNode(Node currentNode, int d) {
        if (currentNode == null) return new Node(d);

        if (d < currentNode.data)
            currentNode.left = insertNode(currentNode.left, d);
        else if (d > currentNode.data)
            currentNode.right = insertNode(currentNode.right, d);

        return currentNode;
    }

    public void preorder(Node curr){
        if(curr == null) return;

        System.out.println(curr.data);
        preorder(curr.left);
        preorder(curr.right);
    }

    public void inorder(Node curr){
        if(curr == null) return;

        inorder(curr.left);
        System.out.println(curr.data);
        inorder(curr.right);
    }

     public void postorder(Node curr){
        if(curr == null) return;

        inorder(curr.left);
        inorder(curr.right);
        System.out.println(curr.data);
    }

    public static void main(String[] args){
        Binary bt = new Binary();
        bt.insert(10);
        bt.insert(12);
        bt.insert(1);
        bt.insert(9);
        bt.preorder(bt.root);
        System.out.println("--------------------");
        bt.inorder(bt.root);
        System.out.println("--------------------");
        bt.postorder(bt.root);
    }
}
