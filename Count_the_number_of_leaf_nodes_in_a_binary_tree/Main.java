package Count_the_number_of_leaf_nodes_in_a_binary_tree;

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

    public int countLeafNodes(Node node)
    {
        if(node == null)
        {
            return 0;
        }

        if(node.left == null && node.right == null)
        {
            return 1;
        }

        int leftLeafNodes = countLeafNodes(node.left);
        int rightLeafNodes = countLeafNodes(node.right);

        return leftLeafNodes + rightLeafNodes;
    }

    public static void main(String[] args) {
        
        Main obj = new Main();

        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.right.left = new Node(4);
        node.right.right = new Node(5);

        System.out.println("Result is: " + obj.countLeafNodes(node));
    }
}
