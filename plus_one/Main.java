package plus_one;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int[] plusOne(int digits[])
    {
        for(int i = digits.length - 1; i >= 0; i--)
        {
            if (digits[i] < 9) {
                
                digits[i]++;

                return digits;
            }

            digits[i] = 0;
        }

        int result[] = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {
        
        Main solution = new Main();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your array size: ");
        int size = scanner.nextInt();

        int digits[] = new int[size];
        for(int i=0; i < size; i++)
        {
            System.out.println("Element [ " + (i+1) + " ] : ");
            digits[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(solution.plusOne(digits)));

        scanner.close();
    }
}
