package valid_parentheses;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray())
        {
            if (c == '(' || c == '{' || c == '[') {

                stack.push(c);

            }else{

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (
                    c == ')' && top != '(' ||
                    c == '}' && top != '{' ||
                    c == ']' && top != '['
                ) {
                    
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Main soltuion = new Main();
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of parentheses to check validity: ");
        String input = scanner.nextLine();

        boolean result = soltuion.isValid(input);

        System.out.println("Is the input string valid? " + result);

        scanner.close();
    }
}
