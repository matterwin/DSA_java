package Trees;

public class BinarySeach {
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

    public BinarySeach(){
        root = null;
    }

     public void insert(int d) {
        root = insertNode(root, d);
    }

    private Node insertNode(Node curr, int d) {
        if (curr == null) return new Node(d);

        if (d < curr.data)
            curr.left = insertNode(curr.left, d);
        else if (d > curr.data)
            curr.right = insertNode(curr.right, d);

        return curr;
    }

    public Node findMin(Node curr){
        if(curr.left != null)
            return findMin(curr.left);
        else
            return curr;
    }

    public Node findMax(Node curr){
        if(curr.right != null)
            return findMax(curr.right);
        else
            return curr;
    }

    public Node search(Node curr, int k){
        if(curr == null) return null;
        if(curr.data == k) return curr;
        if(curr.data > k)
            return search(curr.left, k);
        return search(curr.right, k);
    }

    public Node successor(Node curr){
        if(curr == null) return null;

        if(curr.right != null)
            return findMin(curr.right);

        Node successor = null;
        Node ancestor = root;
        while(ancestor != null){
            if(ancestor.data > curr.data){
                successor = ancestor;
                ancestor = ancestor.left;
            }
            else if(ancestor.data < curr.data){
                ancestor = ancestor.right;
            }
            else
                break;
        }

        return successor;
    }

    public Node predecessor(Node curr){
        if(curr == null) return null;

        if(curr.left != null)
            return findMax(curr.left);

        Node successor = null;
        Node ancestor = root;
        while(ancestor != null){
            if(ancestor.data < curr.data){
                successor = ancestor;
                ancestor = ancestor.right;
            }
            else if(ancestor.data > curr.data){
                ancestor = ancestor.left;
            }
            else
                break;
        }

        return successor;
    }

    public void inorder(Node curr){
        if(curr == null) return;

        inorder(curr.left);
        System.out.println(curr.data);
        inorder(curr.right);
    }

    public Node delete(Node curr, int d) {
        if (curr == null) return null;

        if (d < curr.data)
            curr.left = delete(curr.left, d);
        else if (d > curr.data)
            curr.right = delete(curr.right, d);
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
            curr.right = delete(curr.right, successor.data);
        }

        return curr;
    }

    public Node invertTree(Node curr) {
        if (curr == null)
            return null;

        // Swap the left and right subtrees
        Node temp = curr.left;
        curr.left = invertTree(curr.right);
        curr.right = invertTree(temp);

        return curr;
    }

    public static void main(String[] args){
        BinarySeach bst = new BinarySeach();
        bst.insert(3);
        bst.insert(1);
        bst.insert(6);
        bst.insert(7);
        bst.insert(9);
        bst.insert(2);
        bst.insert(0);
        bst.insert(10);

        System.out.println("-------------------");
        bst.inorder(bst.root);
        System.out.println("-------------------");
        
        System.out.println(bst.search(bst.root, 0).data);
        System.out.println(bst.findMin(bst.root).data);
        System.out.println(bst.findMax(bst.root).data);
        System.out.println(bst.successor(bst.root).data);
        System.out.println(bst.predecessor(bst.root).data);

        System.out.println("-------------------");
        System.out.println("-------------------");

        bst.delete(bst.root, 1);
        // bst.inorder(bst.root);
        bst.invertTree(bst.root);
        System.out.println("-------------------");
        bst.inorder(bst.root);
        System.out.println("-------------------");
    }
}
