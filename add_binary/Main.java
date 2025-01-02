package add_binary;

import java.util.Scanner;

public class Main {

    public String addBinary(String a, String b)
    {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            
            int sum = carry;

            if (i >=0) {
                
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        
        Main solution = new Main();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first binary number: ");
        String a = scanner.nextLine();

        System.out.println("Enter your second binary number: ");
        String b = scanner.nextLine();

        String result = solution.addBinary(a, b);

        System.out.println("Result is: " + result);

        scanner.close();
    }
}
