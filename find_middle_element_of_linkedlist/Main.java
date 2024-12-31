package find_middle_element_of_linkedlist;

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

    public void findMiddleElement()
    {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }

        Node slowPointer = head;
        Node fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        System.out.println("The middle node is: " + slowPointer.data);
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

        // লিঙ্কড লিস্ট তৈরি
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);
        list.head.next.next.next.next = new Node(50);

        System.out.println("Linked List is:");
        list.printList();

        // মাঝখানের নোড খুঁজুন
        list.findMiddleElement();
    }
}
