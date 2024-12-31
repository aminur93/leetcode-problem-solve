package Find_the_Index_of_the_First_Occurrence_in_a_String;

import java.util.Scanner;

public class Main {

    public int strStr(String haystack, String needle) {
        
        if (needle.isEmpty()) {
            return 0;
        }

        int n = haystack.length();
        int m = needle.length();

        for(int i=0; i <= n - m; i++)
        {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
        Main solution = new Main();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your haystack string: ");
        String haystack = scanner.nextLine();

        System.out.println("Enter your needle string: ");
        String needle = scanner.nextLine();


        System.out.println("Result: " + solution.strStr(haystack, needle));

        scanner.close();
    }
}
