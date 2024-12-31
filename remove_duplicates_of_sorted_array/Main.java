package remove_duplicates_of_sorted_array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total element of array: ");
        int size = scanner.nextInt();

        int num[] = new int[size];

        for(int i=0; i < num.length; i++)
        {
            System.out.println("Element of array " + (i + 1));
            num[i] = scanner.nextInt();
        }

         // Sort the array (simple bubble sort implementation)
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        // Remove duplicates and print the unique elements
        System.out.println("Array without duplicates: ");
        int uniqueIndex = 0;
        for(int i = 1; i < num.length; i++)
        {
            if (num[i] != num[uniqueIndex]) {
                uniqueIndex++;
                num[uniqueIndex] = num[i];
            }
        }

        // Print unique elements from 0 to uniqueIndex
        for (int i = 0; i <= uniqueIndex; i++) {
            System.out.println(num[i] + " ");
        }

        scanner.close();
    }
}
