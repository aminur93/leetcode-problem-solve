package prime_number_finding;

import java.util.Scanner;

public class Main {

    public static boolean isPrimeNumber(int n)
    {
        // Step 1: Numbers less than 2 are not prime
        if (n <= 1) {
            
            return false;
        }

        // Step 2: 2 is the only even prime number
        if (n == 2) {
            
            return true;
        }

        // Step 3: Eliminate even numbers greater than 2
        if (n % 2 == 0) {
            
            return false;
        }

        // Step 4: Check divisibility from 3 up to the square root of n
        for(int i = 3; i * i <= n; i += 2)
        {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrimeNumber(number)) {
            
            System.out.println(number + " is a a prime number");
        }else{
            System.out.println(number + " is not a prime number");
        }

        scanner.close();
    }
}
