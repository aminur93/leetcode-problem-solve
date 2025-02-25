package check_for_balanced_parentheses_in_an_expression;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static boolean isBalanced(String expression)
    {
        Stack<Character> stack = new Stack<>();

        for(char ch: expression.toCharArray())
        {
            if (ch == '(' || ch == '{' || ch == '[') {
                
                stack.push(ch);

            }else if (ch == ')' || ch == '}' || ch == ']') {
                
                if (stack.isEmpty()) {
                    
                    return false;
                }

                char top = stack.pop();

                if (
                    ch == ')' && top != ')' ||
                    ch == '}' && top != '}' ||
                    ch == ']' && top != ']' 
                ) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the expression to check for balanced parentheses: ");
        String userExpression = scanner.nextLine();

        boolean result = isBalanced(userExpression);

        if (result) {
            
            System.out.println("The expression is balanced. " + userExpression);

        }else{

            System.out.println("The expression is not balanced. " + userExpression);
        }

        scanner.close();
    }
}
