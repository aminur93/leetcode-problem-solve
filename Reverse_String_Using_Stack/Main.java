package Reverse_String_Using_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static String reverseString(String s)
    {
        //declare a empty stack
        Stack<Character> stack = new Stack<>();
        
        //store character in stack push
        for(char ch : s.toCharArray())
        {
            stack.push(ch);
        }

        //declare string builder
        StringBuilder reversedString = new StringBuilder();

        //remove character from stack pop
        while (!stack.isEmpty()) {
            
            reversedString.append(stack.pop());
        }

        //return reversed string
        return reversedString.toString();
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your String: ");
        String input = scanner.nextLine();

        System.out.println("Result is: " + reverseString(input));

        scanner.close();
    }
}
