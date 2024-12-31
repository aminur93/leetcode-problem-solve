package find_minimum_maximum_element_array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total element of array: ");
        int size = scanner.nextInt();

        int num[] = new int[size];

        for(int i=0; i<num.length; i++)
        {
            System.out.println("Element of array " + (i + 1));
            num[i] = scanner.nextInt();
        }

        int max_num = num[0];
        int min_num = num[0];

        for(int i : num)
        {
            if (i > max_num) {
                max_num = i;
            }

            if (i < min_num) {
                min_num = i;
            }
        }

        System.out.println("Maximum Number: " + max_num);
        System.out.println("Minimum Number: " + min_num);

        scanner.close();
    }
}
