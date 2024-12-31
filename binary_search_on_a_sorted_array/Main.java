package binary_search_on_a_sorted_array;

import java.util.Scanner;

public class Main {

    public static int binarySearch(int arr[], int target)
    {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            
            int mid = start + (end - start) / 2 ;

            if (arr[mid] == target) {

                return mid;

            }else if(arr[mid] < target){

                start = mid + 1;

            }else{

                end = mid -1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your array size");
        int size = scanner.nextInt();

        int arr[] = new int[size];

        for(int i=0; i<size; i++)
        {
            System.out.println("[Element of " + (i + 1) + "]");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter your target element");
        int target = scanner.nextInt();

        int result = binarySearch(arr, target);

        if (result != -1) {
            
            System.out.println("Element found at index: " + result);

        }else{

            System.out.println("Element not found");
        }

        scanner.close();
    }
}
