package Find_the_height_of_a_binary_tree;

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

    public int findHeight(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        int result = Math.max(leftHeight, rightHeight) + 1;

        return result;
    }

    public static void main(String[] args) {
        
        Main obj = new Main();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);

        System.out.println("Result is: " + obj.findHeight(root));
    }
}
