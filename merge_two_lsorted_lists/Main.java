package merge_two_lsorted_lists;

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

public class Main {

    public Node mergeTwoLists(Node list1, Node list2)
    {
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (list1 != null && list2 != null) {
            
            if (list1.data < list2.data) {
                
                tail.next = list1;
                list1 = list1.next;

            }else{

                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }

        if (list1 != null) {
            
            tail.next = list1;
        }

        if (list2 != null) {
            
            tail.next = list2;
        }

        return dummy.next;
    }

    public static void printList(Node head)
    {
        Node temp = head;

        while (temp != null) {
            
            System.out.println(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node createList(int n)
    {
        Scanner scanner = new Scanner(System.in);
        Node head = null, tail = null;

        System.out.println("Enter " + n + " elements for the list:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt(); // Take each element as input
            Node newNode = new Node(value); // Create a new node

            if (head == null) {
                head = newNode; // First node becomes the head
                tail = newNode;
            } else {
                tail.next = newNode; // Append to the list
                tail = newNode;
            }
        }
        
        return head;
    }

    public static void main(String[] args) {
        
        Main solution = new Main();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements for List 1: ");
        int n1 = scanner.nextInt();
        Node list1 = createList(n1);

        System.out.print("Enter the number of elements for List 2: ");
        int n2 = scanner.nextInt();
        Node list2 = createList(n2);

        System.out.println("First linked list:");
        printList(list1);

        System.out.println("Second linked list:");
        printList(list2);

        Node mergedSotedList = solution.mergeTwoLists(list1, list2);

        System.out.println("Merge with sorted list:");
        printList(mergedSotedList);

        scanner.close();

    }
}
