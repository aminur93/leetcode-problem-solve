package reverse_array_without_extra_array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your total number of elements in the array: ");
        int size = scanner.nextInt();

        int num[] = new int[size];

        for(int i=0; i < num.length; i++)
        {
            System.out.println("Enter element " + (i + 1) + ": ");
            num[i] = scanner.nextInt();
        }

        System.out.println("Reverse Array elements are:");
        for(int j=num.length - 1; j >= 0; j--)
        {
            System.out.println(num[j]);
        }

        scanner.close();
    }
}
