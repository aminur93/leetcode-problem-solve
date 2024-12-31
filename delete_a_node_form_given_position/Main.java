package delete_a_node_form_given_position;

import java.util.Scanner;

class Node 
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class LinkedList
{
    Node head;

    public void deleteNode(int position)
    {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node current = head;

        for(int i=0; current != null && i < position -1; i++)
        {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Position is out of boundry");
        }

        Node next = current.next.next;
        current.next = next;
    }

    public void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}

public class Main {

    public static void main(String[] args)
    {
       LinkedList list = new LinkedList();

       Scanner scanner = new Scanner(System.in);

       list.head = new Node(10);
       list.head.next = new Node(20);
       list.head.next.next = new Node(30);
       list.head.next.next.next = new Node(40);

       System.out.println("Before deleting the list: ");
       list.printList();

       System.out.println("Enter the position which you want to delete: ");
       int position = scanner.nextInt();

       list.deleteNode(position);

       System.out.println("After deleting the list: ");
       list.printList();

       scanner.close();
    }
}
