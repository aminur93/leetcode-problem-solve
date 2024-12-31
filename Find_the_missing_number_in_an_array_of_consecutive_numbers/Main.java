package Find_the_missing_number_in_an_array_of_consecutive_numbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int arr[] = new int[size -1];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int totalSum = (size * (size + 1)) / 2;

        int arrSum = 0;
        for(int num : arr)
        {
            arrSum += num;
        }

        int missingNumber = totalSum - arrSum;

        System.out.println("Missing number is: " + missingNumber);

        scanner.close();
    }
}
