package climbing_stars;

import java.util.Scanner;

public class Main {

    public int climbStairs(int n)
    {
        if (n == 1) {
            
            return 1;
        }

        int dp[] = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n; i++)
        {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        
        Main soltuion = new Main();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int n = scanner.nextInt();

        System.out.println("Number of ways to climb " + n + " Steps : " +  soltuion.climbStairs(n));

        scanner.close();
    }
}
