package rotated_array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int num[] = new int[size];

        for(int i=0; i < num.length; i++)
        {
            System.out.println("Enter the element array " + (i + 1));
            num[i] = scanner.nextInt();
        }

        System.out.println("Enter the number of rotations (k): ");
        int k = scanner.nextInt();

        // Adjust k if it's larger than the array size
        k = k % size;

        //rotate array
        int rotateArray[] = new int[size];
        for(int i=0; i < size; i++)
        {
            rotateArray[(i + k) % size] = num[i];
        }

        //Print the rotated array
        System.out.println("Rotate array element");
        for(int rotateNum : rotateArray)
        {
            System.out.println(rotateNum);
        }

        scanner.close();
    }
}
