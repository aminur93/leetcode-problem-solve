package find_the_sum_of_digits_using_recursion;

import java.util.Scanner;

public class Main {

    public int sumDigits(int n)
    {
        if (n == 0) {
            
            return 0;
        }

        return (n%10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        
        Main solution = new Main();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Digits: ");
        int Digits = scanner.nextInt();

        int result = solution.sumDigits(Digits);

        System.out.println("Result is: " + result);

        scanner.close();
    }
}
