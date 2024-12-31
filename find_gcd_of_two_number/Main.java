package find_gcd_of_two_number;

import java.util.Scanner;

public class Main {

    public static int findGcd(int n1, int n2)
    {
        while(n2 != 0)
        {
            int remainder = n1%n2;

            n1 = n2;

            n2 = remainder;
        }

        return n1;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();
        
        System.out.println("Enter second number: ");
        int number2 = scanner.nextInt();

        int result = findGcd(number1, number2);

        System.out.println("GCD is : " + result);

        scanner.close();
    }
}
