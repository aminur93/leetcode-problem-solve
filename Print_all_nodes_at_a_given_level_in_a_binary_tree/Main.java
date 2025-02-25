package Print_all_nodes_at_a_given_level_in_a_binary_tree;

class Node {

    int data;
    Node left;
    Node right;

    public Node (int item)
    {
        data = item;
        left = right = null;
    }
}

public class Main {

    Node root;

    void printGivenLevel(Node node , int level)
    {
        if(node == null)
        {
            return;
        }

        if(level == 1)
        {
            System.out.print(node.data + " ");
        }
        else if(level > 1)
        {
            printGivenLevel(node.left, level - 1);
            printGivenLevel(node.right, level - 1);
        }
    }

    public static void main(String[] args) {
        
        Main tree = new Main();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        int level = 3;

        System.out.println("Nodes at level " + level + " are: ");
        tree.printGivenLevel(tree.root, level);
    }
}
