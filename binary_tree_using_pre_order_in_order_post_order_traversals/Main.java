package binary_tree_using_pre_order_in_order_post_order_traversals;

import java.util.Scanner;

// create node class with value, left and right child
class Node 
{
    int value;
    Node left, right;

    public Node(int item)
    {
        value = item;
        left = right = null;
    }
}

public class Main {

    // root of the binary tree
    Node root;

    // scanner object to take input from user
    Scanner scanner = new Scanner(System.in);

    // create binary tree
    Node createTree()
    {
        System.out.println("Enter the value of the node: ");
        int value = scanner.nextInt();

        if(value == -1)
        {
            return null;
        }

        Node newNode = new Node(value);
        System.out.println("Do you want to add left child of " + value + " (y/n): ");
        newNode.left = createTree();

        System.out.println("Do you want to add right child of " + value + " (y/n): ");
        newNode.right = createTree();

        return newNode;
    }

    // Pre-order Traversal (Root → Left → Right)
    void preOrder(Node node)
    {
        if(node == null)
        {
            return;
        }

        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // In-order Traversal (Left → Root → Right)
    void inOrder(Node node)
    {
        if(node == null)
        {
            return;
        }

        inOrder(node.left);
        System.out.print(node.value +  " ");
        inOrder(node.right);
    }
    

    // Post-order Traversal (Left → Right → Root)
    void postOrder(Node node)
    {
        if(node == null)
        {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        
        Main tree = new Main();

        System.out.println("Create Binary Tree: ");
        tree.root = tree.createTree();

        System.out.println("Pre-order Traversal: ");
        tree.preOrder(tree.root);

        System.out.println("\nIn-order Traversal: ");
        tree.inOrder(tree.root);

        System.out.println("\nPost-order Traversal: ");
        tree.postOrder(tree.root);
    }
}
