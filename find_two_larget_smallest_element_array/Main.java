package find_two_larget_smallest_element_array;

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

        int maxNum[] = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        int minNum[] = {Integer.MAX_VALUE, Integer.MAX_VALUE};

        for(int i : num)
        {
            if (i > maxNum[0]) {
                maxNum[1] = maxNum[0];
                maxNum[0] = i;
            }else if(i > maxNum[1] && i != maxNum[0]){
                maxNum[1] = i;
            }

            if (i < minNum[0]) {
                minNum[1] = minNum[0];
                minNum[0] = i;
            }else if(i < minNum[1] && i != minNum[0]){
                minNum[1] = i;
            }
        }

        System.out.println("Maixmum Element: " + maxNum[0] + " , " + maxNum[1]);
        System.out.println("Minimum Element: " + minNum[0] + " , " + minNum[1]);

        scanner.close();
    }
}
