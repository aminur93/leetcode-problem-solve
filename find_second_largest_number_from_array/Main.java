package find_second_largest_number_from_array;

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
            System.out.println("Element of array " + (i + 1));
            num[i] = scanner.nextInt();
        }

        int first_max_num = Integer.MIN_VALUE;
        int second_max_num = Integer.MIN_VALUE;

        for(int i : num)
        {
            if (i > first_max_num) {
                second_max_num = first_max_num;
                first_max_num = i;
            }else if(i > second_max_num && i != first_max_num){
                second_max_num = i;
            }
        }

        System.out.println("Second larget number: " + second_max_num);

        scanner.close();
    }
}
