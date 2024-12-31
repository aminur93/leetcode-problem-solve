package find_factorial_number_of_using_recursion;

import java.util.Scanner;

public class Main {

    public int factorialNumberRecursion(int n)
    {
        if (n == 0 || n ==1) {
            return 1;
        }else{
            return n * factorialNumberRecursion(n -1);
        }
    }

    public static void main(String[] args)
    {

        Main soltuions = new Main();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int number = scanner.nextInt();

        int result = soltuions.factorialNumberRecursion(number);

        System.out.println(number + "! values is: " + result);

        scanner.close();
    }

}
