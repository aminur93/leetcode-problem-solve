package implement_a_stack_using_arrays;

class Stack 
{
    private int stack[];
    private int top;
    private int size;

    public Stack(int size)
    {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    // Push method: Add element to the stack
    public void push(int value)
    {
        if (top == size - 1) {
            
            System.out.println("Stack Overflow");

        }else{

            stack[++top] = value;
        }
    }

    // Pop method: Remove and return the top element
    public int pop()
    {
        if (top == -1) {
            
            System.out.println("Stack Underflow");

            return -1;

        }else{

            return stack[top--];
        }
    }

    // Peek method: Return the top element without removing
    public int peek()
    {
        if (top == -1) {
            
            System.out.println("Stack is empty");

            return -1;

        }else{
            
            return stack[top];
        }
    }

    // isEmpty method: Check if the stack is empty
    public boolean isEmpty()
    {
        return top == -1;
    }
}

public class Main {

    public static void main(String[] args) {
        
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        // Peek at the top element
        System.out.println("Top element: " + stack.peek()); // Output: 50

        //Pop elements
        System.out.println("Poped element: " + stack.pop());
        System.out.println("Poped element: " + stack.pop());

        // Check if stack is empty
        System.out.println("Is stack empty: " + stack.isEmpty());

        // Pop the last element
        System.out.println("Poped element: " + stack.pop());
        System.out.println("Poped element: " + stack.pop());
        System.out.println("Poped element: " + stack.pop());

        // Check if stack is empty again
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: true
    }
}
