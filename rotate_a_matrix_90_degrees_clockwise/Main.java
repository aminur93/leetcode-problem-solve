package rotate_a_matrix_90_degrees_clockwise;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size (n) of the matrix: ");
        int n = scanner.nextInt();

        int matrix[][] = new int[n][n];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print("Matrix [" + i + "]" + "[" + j + "] : ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("original Matrix: ");
        printMatrix(matrix);

        //transpose matrix
        transposeMatrix(matrix);
        System.out.println("\nTransposed Matrix:");
        printMatrix(matrix);

        //reverseRow matrix
        reverseRow(matrix);
        System.out.println("\nReverseRow Matrix:");
        printMatrix(matrix);

        scanner.close();
        
    }

    public static void printMatrix(int[][] matrix)
    {
        int n = matrix.length;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void transposeMatrix(int[][] matrix)
    {
        int n = matrix.length;

        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }
    }

    public static void reverseRow(int[][] matrix)
    {
        int n = matrix.length;

        for(int i=0; i<n; i++)
        {
            int left = 0;
            int right = n - 1;

            while(left < right)
            {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }
}
