package insertion_sort;

import java.util.Scanner;

public class Main {

    public static void insertionSort(int arr[])
    {
        for(int i=1; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                
                arr[j+1] = arr[j];
                j--;

            }

            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int arr[] = new int[size];
        //int arr[] = {12, 11, 13, 5, 6};

        for(int i=0; i < size; i++)
        {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array before sorting: ");
        for(int num: arr)
        {
            System.out.print(num + " ");
        }

        insertionSort(arr);

        System.out.println("Array after sorting: ");
        for(int num: arr)
        {
            System.out.print(num + " ");
        }
        System.out.println("");

        scanner.close();
    }
}
