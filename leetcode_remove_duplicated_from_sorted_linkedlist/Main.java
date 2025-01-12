package leetcode_remove_duplicated_from_sorted_linkedlist;

import java.util.Scanner;

class ListNode
{
    int data;
    ListNode next;

    public ListNode(int data)
    {
        this.data = data;
        this.next = null;
    }

    // public void add(ListNode head, int data)
    // {
    //     if (head == null) {
            
    //         throw new IllegalStateException("Head node cannot be null. Initialize the list before adding elements.");
    //     }

    //     ListNode current = head;

    //     while (current.next != null) {
            
    //         current = current.next;

    //     }

    //     current.next = new ListNode(data);
    // }

    // Method to deserialize a string into a linked list
    public static ListNode deserialize(String serializedList) {
        if (serializedList == null || serializedList.isEmpty()) {
            return null; // Handle empty input
        }

        // Remove brackets (if provided by the testing framework) and split by commas
        serializedList = serializedList.replaceAll("[\\[\\] ]", ""); // Remove [, ], and spaces
        String[] elements = serializedList.split(",");

        ListNode head = null, tail = null;

        for (String element : elements) {
            if (element.isEmpty()) continue; // Skip empty elements

            try {
                int value = Integer.parseInt(element); // Parse the integer
                ListNode newNode = new ListNode(value); // Create a new node

                if (head == null) {
                    head = newNode; // First node becomes the head
                    tail = newNode;
                } else {
                    tail.next = newNode; // Append to the list
                    tail = newNode;
                }
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Input contains invalid numbers: " + serializedList);
            }
        }

        return head; // Return the created linked list
    }
    
}

public class Main {

    public ListNode deleteDuplicates(ListNode head)
    {

        ListNode current = head;

        while (current != null && current.next != null) {
            
            if (current.data == current.next.data) {
                
                current.next = current.next.next;

            }else{

                current = current.next;
            }
        }

        return head;
    }

    public void printList(ListNode head)
    {
       if (head == null) {

            System.out.println("The linked list is empty");
            return;
       }

       ListNode current = head;

       while (current != null) {

            System.out.print(current.data + " -> ");
            current = current.next;
       }

       System.out.println("Null");
    }

    public static void main(String[] args) {

       Main solution = new Main();

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter the serialized linked list (e.g., [1,2,3,4]): ");
       String serializedInput = scanner.nextLine();

       // Deserialize input to create the linked list
       ListNode head = ListNode.deserialize(serializedInput);

    //    System.out.println("Enter the number of elements in the linked list: ");
    //    int size = scanner.nextInt();

    //    ListNode head = null;

    //    if (size > 0) {

    //         System.err.println("Enter the elements: ");
    //         for(int i=0; i < size; i++)
    //         {
    //             int data = scanner.nextInt();

    //             if (head == null) {
                    
    //                 head = new ListNode(data);

    //             }else{

    //                 head.add(head, data);
    //             }
    //         }
    //    }

       if (head != null) {
        
            head = solution.deleteDuplicates(head);

            solution.printList(head);

       }else{

            System.out.println("Linked list is empty");
       }

       scanner.close();
    }
}
