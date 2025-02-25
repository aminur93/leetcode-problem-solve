package Check_if_two_binary_trees_are_identical;

class Node {

    int value;
    Node left;
    Node right;

    public Node(int value)
    {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class Main {

    Node root;

    public boolean areIdentical(Node root1, Node root2)
    {
        if (root1 == null && root2 == null)
        {
            return true;
        } 

        if (root1 == null || root2 == null)
        {
            return false;    
        }

        return (root1.value == root2.value
                && areIdentical(root1.left, root2.left)
                && areIdentical(root1.right, root2.right));
    }

    public static void main(String[] args) {
        
        Main tree1 = new Main();
        Main tree2 = new Main();

        tree1.root = new Node(1);
        tree1.root.left = new Node(2);
        tree1.root.right = new Node(3);
        tree1.root.right.left = new Node(4);
        tree1.root.right.right = new Node(5);

        tree2.root = new Node(1);
        tree2.root.left = new Node(2);
        tree2.root.right = new Node(3);
        tree2.root.right.left = new Node(4);
        tree2.root.right.right = new Node(5);

        System.out.println("Result is: " + tree1.areIdentical(tree1.root, tree2.root));
    }

}
