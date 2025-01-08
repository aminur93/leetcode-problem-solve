package sqrt_x_problem;

import java.util.Scanner;

public class Main {

    public int mySqrt(int x)
    {
        if (x == 0 || x == 1) {
            return x;
        }

        int start =0, end = x, result = 0;

        while (start <= end) {
            
            int mid = start + (end - start) / 2;

            if ((long) mid * mid <= x) {
                
                result = mid;

                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        
        Main solution = new Main();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your postive number: ");
        int x = scanner.nextInt();

        x = Math.abs(x);

        System.out.println("Result is: " + solution.mySqrt(x));

        scanner.close();
    }
}
