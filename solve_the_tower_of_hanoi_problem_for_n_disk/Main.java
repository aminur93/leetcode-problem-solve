package solve_the_tower_of_hanoi_problem_for_n_disk;

import java.util.Scanner;

public class Main {

    public static void solveTowerOfHanoi(int n, char source, char auxiliary, char destination)
    {
        if (n == 1) {
            
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        solveTowerOfHanoi(n - 1, source, auxiliary, destination);

        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        solveTowerOfHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number of disks: ");
        int n = scanner.nextInt();

         // Taking user input for the names of the rods
         System.out.println("Enter the name of the source rod: ");
         char source = scanner.next().charAt(0);
         
         System.out.println("Enter the name of the auxiliary rod: ");
         char auxiliary = scanner.next().charAt(0);
         
         System.out.println("Enter the name of the destination rod: ");
         char destination = scanner.next().charAt(0);

         solveTowerOfHanoi(n, source, auxiliary, destination);

        scanner.close();
    }
}
