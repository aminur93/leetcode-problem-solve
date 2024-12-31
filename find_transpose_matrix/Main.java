package find_transpose_matrix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows (Rows) of the matrix: ");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns (Columns) of the matrix: ");
        int columns = scanner.nextInt();


        int A[][] = new int[rows][columns];

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }

        //transpose A^T for new matrix
        int AT[][] = new int[columns][rows];

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                AT[j][i] = A[i][j];
            }
        }

        //Printing the original matrix (A)
        System.out.println("Original matrix of (A): ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        //Printing new matrix A^T matrix (A^T)
        System.out.println("New matrix of (A^T): ");
        for(int i=0; i<AT.length; i++)
        {
            for(int j=0; j<AT[i].length; j++)
            {
                System.out.print(AT[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
