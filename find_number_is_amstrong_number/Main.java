package find_number_is_amstrong_number;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your total number: ");
        int number = scanner.nextInt();

        ArrayList<Integer> digitsList = new ArrayList<>();
        int tempNumber = number;

        while(tempNumber > 0)
        {
            digitsList.add(0, tempNumber % 10); // mod with 10
            tempNumber /=10; // remove the last number
        }

        int digits[] = digitsList.stream().mapToInt(i -> i).toArray();

        int sum = 0;

        for(int d : digits)
        {
            sum += Math.pow(d, digits.length);
        }

        if (sum == number) {

            System.out.println(number + " is a Armstrong number : " + sum);

        }else{

            System.out.println(number + " is not a Armstrong number");
            
        }

        scanner.close();
    }
}
