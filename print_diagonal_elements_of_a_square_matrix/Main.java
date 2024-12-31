package print_diagonal_elements_of_a_square_matrix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size (n) of the square matrix");
        int n = scanner.nextInt();

        int matrix[][] = new int[n][n];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print("Matrix[" + i + "] " + "[" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nDiagonal elements of a square matrix");
        for(int i=0; i<n; i++)
        {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println(" ");

        scanner.close();
    }
}
