package sort_an_array_using_bubble_sort;

import java.util.Scanner;

public class Main {

    public static void bubleSort(int number[])
    {
        int arrSize = number.length;

        for(int i=0; i < arrSize - 1; i++)
        {
            for(int j=0; j < arrSize - i - 1; j++)
            {
                if (number[j] > number[j+1]) {
                    
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int number[] = new int[size];

        for(int i=0; i < size; i++)
        {
            System.out.println("Element : " + (i+1) + "]");
            number[i] = scanner.nextInt();
        }

        System.out.println("Array before sorting:");
        for(int num: number)
        {
            System.out.print(num + " ");
        }

        bubleSort(number);

        System.out.println("\nArray after sorting:");
        for(int num: number)
        {
            System.out.print(num + " ");
        }
        System.out.println("");

        scanner.close();
    }
}
