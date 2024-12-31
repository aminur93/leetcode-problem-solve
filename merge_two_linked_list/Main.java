package merge_two_linked_list;

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

    public static Node mergeTwoLinkedList(Node list1, Node list2)
    {
        // dummy node create with value -1
        // dummy node assign another pointer
        // loop check first node and second node not null
        // check first node less then second node
        // list1 থেকে নোড যোগ করুন
        // list2 থেকে নোড যোগ করুন
        // new list forward
        // check first node not null
            // rest of the node adding
        // check second node not null
            // rest of the node adding
        // finaly return dummy node

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
            
            System.out.print(temp.data + " -> ");
            temp = temp.next;

        }
        System.out.println("Null");
    }

    public static void main(String[] args)
    {
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        System.out.println("First linked list:");
        printList(list1);

        System.out.println("Second linked list:");
        printList(list2);

        Node mergedList = mergeTwoLinkedList(list1, list2);

        System.out.println("Merge with liked list:");
        printList(mergedList);
    }
}
