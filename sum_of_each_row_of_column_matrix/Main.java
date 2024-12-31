package sum_of_each_row_of_column_matrix;

import java.util.Scanner;

public class Main {

    public static void sumRowsAndColumns(int[][] matrix)
    {
        int rows = matrix.length;
        int columns = matrix[0].length;

        //System.out.println("rows: " + rows + " : " + "columns " + columns);

        System.out.println("Sum of rows: ");
        for(int i=0; i<rows; i++)
        {
            int sumRow=0;
            for(int j=0; j<columns; j++)
            {
                sumRow += matrix[i][j];
            }

            System.out.println("Row " + (i+1) + " : " + sumRow);
        }

        System.out.println("Sum of rows: ");
        for(int j=0; j<columns; j++)
        {
            int sumColumns=0;
            for(int i=0; i<rows; i++)
            {
                sumColumns += matrix[i][j];
            }

            System.out.println("Column " + (j+1) + " : " + sumColumns);
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of martix element (N): ");
        int n = scanner.nextInt();

        int martix[][] = new int[n][n];

        for(int i=0; i < n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print("Matrix[" + i + "]" + "[" + j + "] :");
                martix[i][j] = scanner.nextInt();
            }
        }

        sumRowsAndColumns(martix);

        scanner.close();
    }
}   
