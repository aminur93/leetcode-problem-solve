package remove_duplicated_from_sorted_array;

import java.util.Scanner;

public class Main {

    public int removeDuplicates(int[] nums) {
        
        if (nums.length == 0) {
            
            return 0;
        }

        int k = 1;

        for(int i=1; i < nums.length; i++)
        {
            if (nums[i] != nums[i - 1]) {
                
                nums[k] = nums[i];

                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        Main soltuion = new Main();
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();

        int nums[] = new int[size];

        for(int i=0; i < size; i++)
        {
            System.out.println("Element [ " + (i+1) + " ] ");
            nums[i] = scanner.nextInt();
        }

        int k = soltuion.removeDuplicates(nums);

        System.out.println("Unique Count: " + k);
        System.out.println("Modified array: ");
        for(int i=0; i < k; i++)
        {
            System.out.print(nums[i] +" ");
        }
        System.out.println("");

        scanner.close();
    }
}
