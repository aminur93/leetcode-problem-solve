package remove_duplicates_node_form_linkedlist;

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

    public static Node removeDuplicated(Node head)
    {
        Node current = head;

        while(current != null && current.next != null)
        {

            if (current.data == current.next.data) {
                
                current.next = current.next.next;

            }else{
                current = current.next;
            }
        }

        return head;

    }

    public static void printList(Node head)
    {
        Node current = head;

        while(current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        System.out.println("Before removing duplicates: ");
        printList(head);

        head = removeDuplicated(head);

        System.out.println("After removing duplicates: ");
        printList(head);
    }

}
