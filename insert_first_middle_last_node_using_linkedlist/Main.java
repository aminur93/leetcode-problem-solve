package insert_first_middle_last_node_using_linkedlist;

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

    public LinkedList()
    {
        this.head = null;
    }
    
    public void insertAtBeginning(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtPosition(int data, int position)
    {
        if(position == 0)
        {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        int count = 0;

        while(current != null && count < position - 1)
        {
            current = current.next;
            count++;
        }

        if (current == null) {
            
            throw new IndexOutOfBoundsException("Position out of bounds");
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void insertAtEnd(int data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            return;
        }

        Node last = head;
        while(last.next != null)
        {
            last = last.next;
        }

        last.next = newNode;
    }

    public void printList()
    {
        Node current = head;

        while(current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }
}

public class Main {

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtPosition(15, 1);

        list.printList();
    }
}
