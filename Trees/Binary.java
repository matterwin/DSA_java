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
    private Node insertNode(Node curr, int d) {
        if (curr == null) return new Node(d);

        if (d < curr.data)
            curr.left = insertNode(curr.left, d);
        else if (d > curr.data)
            curr.right = insertNode(curr.right, d);

        return curr;
    }

    private Node findMin(Node curr) {
        while (curr.left != null)
            curr = curr.left;

        return curr;
    }   

    public Node removeNode(Node curr, int d) {
        if (curr == null) return null;

        if (d < curr.data)
            curr.left = removeNode(curr.left, d);
        else if (d > curr.data)
            curr.right = removeNode(curr.right, d);
        else {
            // Node to be removed is found

            // Case 1: No child or 1 child
            if (curr.left == null)
                return curr.right;
            else if (curr.right == null)
                return curr.left;

            // Case 2: 2 children
            // Find the inorder successor (or predecessor)
            Node successor = findMin(curr.right);
            curr.data = successor.data;

            // Remove the inorder successor
            curr.right = removeNode(curr.right, successor.data);
        }

        return curr;
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
        bt.removeNode(bt.root, 9);
        System.out.println("--------------------");
        bt.inorder(bt.root);
    }
}
