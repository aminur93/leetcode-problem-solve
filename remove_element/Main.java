package remove_element;

import java.util.Scanner;

public class Main {

    public int removeElement(int nums[], int val)
    {
        int j= 0;

        for(int i=0; i < nums.length; i++)
        {
            if (nums[i] != val) {
                
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }

    public static void main(String[] args) {
        
        Main solution = new Main();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your array size");
        int size = scanner.nextInt();

        int nums[] = new int[size];
        for(int i=0; i < size; i++)
        {
            System.out.print("Element [ " + (i+1) + " ] ");
            nums[i] = scanner.nextInt();
        }

        System.out.println("Enter your value to remove: ");
        int val = scanner.nextInt();

        int k = solution.removeElement(nums, val);

        System.out.println("K = " + k);
        System.out.println("Updated nums: ");
        for(int i=0; i < k; i++)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println("");

        scanner.close();
    }
}
