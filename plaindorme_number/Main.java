package plaindorme_number;

import java.util.Scanner;

public class Main {

    public boolean isPalindrome(int x) {
        // A negative number or a number ending with 0 (but not 0 itself) cannot be a palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;

        // Reverse half of the number
        while (x > reversed) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // Check if the original number equals the reversed half
        // For odd-length numbers, we remove the middle digit by reversed / 10
        return x == reversed || x == reversed / 10;
    }


    public static void main(String[] args){

        Main solution = new Main();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int x = scanner.nextInt();

        boolean result = solution.isPalindrome(x);

        System.out.println(result);

        scanner.close();
    }

}
