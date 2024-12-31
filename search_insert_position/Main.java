package search_insert_position;

import java.util.Scanner;

public class Main {

    public int searchInsert(int[] nums, int target) {
        
       int start =0;
       int end = nums.length - 1;

       while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }else if (nums[mid] < target) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
       }

       return start;
    }

    public static void main(String[] args) {
        
        Main solution = new Main();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your array size: ");
        int size = scanner.nextInt();

        int nums[] = new int[size];
        for(int i=0; i < size; i++)
        {
            System.out.print("Element [ " +(i+1)+ " ] : ");
            nums[i] = scanner.nextInt();
        }

        System.out.println("Enter your target value: ");
        int target = scanner.nextInt();

        int result = solution.searchInsert(nums, target);

        System.out.println("Index number is: " + result);

        scanner.close();
    }
}
