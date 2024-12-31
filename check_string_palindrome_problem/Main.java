package check_string_palindrome_problem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your string");
        String original = scanner.nextLine();

        original = original.toLowerCase();


        String reverseString = "";
        for(int i=original.length() - 1; i >= 0; i--)
        {
            reverseString += original.charAt(i);
        }

        if (original.equals(reverseString)) {
            System.out.println("The string is a palindrome: " + reverseString);
        }else{
            System.out.println("The string is not a palindrome");
        }

        scanner.close();
    }
}
