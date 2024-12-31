package chec_string_rotation_each_other;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String s1 = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String s2 = scanner.nextLine();

        // Check if lengths are different
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            System.out.println(false);
        } else {
            // Concatenate and check if s2 is a substring of s1+s1
            String concatenated = s1 + s1;
            System.out.println(concatenated.contains(s2));
        }

        scanner.close();
    }
}
