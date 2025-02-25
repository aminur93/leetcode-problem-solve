package implement_a_queue_using_two_stacks;

import java.util.Stack;

class QueueUsingStacks
{
    private Stack<Integer> stack1;

    private Stack<Integer> stack2;

    public QueueUsingStacks()
    {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Add element to the queue
    public void enqueue(int x)
    {
    stack1.push(x);
    }

    // Remove element to the queue
    public int dequeue()
    {
        if (stack2.isEmpty()) {
            
            while (!stack1.empty()) {
                
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            
            throw new IllegalStateException("Queue is empty");
        }

        return stack2.pop();
    }

    public boolean isEmpty()
    {
        return stack1.empty() && stack2.empty();
    }
    
}

public class Main {

    public static void main(String[] args) {
        
        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.enqueue(40);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println(queue.isEmpty());
    }
}
