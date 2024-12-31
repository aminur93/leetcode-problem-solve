package calculate_the_power_of_a_number_using_recursion;

import java.util.Scanner;

public class Main {

    public static int power(int base, int exponent)
    {
        if (exponent == 0) {
            
            return 1;
        }

        return base * power(base, exponent -1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your base number: ");
        int base = scanner.nextInt();

        System.out.println("Enter your exponent number: ");
        int exponent = scanner.nextInt();

        int result = power(base, exponent);

        System.out.println(base + "^" + exponent + " = " + result);

        scanner.close();
    }
}
