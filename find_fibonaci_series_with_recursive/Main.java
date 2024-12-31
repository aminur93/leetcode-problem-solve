package find_fibonaci_series_with_recursive;

import java.util.Scanner;

public class Main {

    public int fibonaciRecrusive(int n)
    {
        if (n == 0) {
            return 0;
        }else if(n == 1)
        {
            return 1;
        }else{
            return fibonaciRecrusive(n - 1) + fibonaciRecrusive(n - 2);
        }
    }

    public static void main(String[] args)
    {
        Main solution = new Main();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int number = scanner.nextInt();

        System.out.println("Fibonacci series for " + number + " numbers");
        for(int i=0; i<number; i++)
        {
            System.out.print(solution.fibonaciRecrusive(i) +  " ");
        }

        scanner.close();
    }
}
