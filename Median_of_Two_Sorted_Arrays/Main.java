package Median_of_Two_Sorted_Arrays;

import java.util.Scanner;

public class Main {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

         // Ensure nums1 is the smaller array
         if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int x = nums1.length;
        int y = nums2.length;

        int low = 0, high = x;

        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;

            // Handle edge cases with partitions
            int maxX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];

            int maxY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY];

            // Check if we have found the correct partition
            if (maxX <= minY && maxY <= minX) {
                // If even total number of elements
                if ((x + y) % 2 == 0) {
                    return ((double) Math.max(maxX, maxY) + Math.min(minX, minY)) / 2;
                } else { // If odd total number of elements
                    return (double) Math.max(maxX, maxY);
                }
            } else if (maxX > minY) {
                high = partitionX - 1; // Move left
            } else {
                low = partitionX + 1; // Move right
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted");
    }

    public static void main(String[] args){

        Main solution = new Main();

        Scanner scanner = new Scanner(System.in);

        // Input for the first array
        System.out.println("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] nums1 = new int[size1];
        System.out.println("Enter " + size1 + " sorted integers for the first array: ");
        for (int i = 0; i < size1; i++) {
            nums1[i] = scanner.nextInt();
        }

        // Input for the second array
        System.out.println("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] nums2 = new int[size2];
        System.out.println("Enter " + size2 + " sorted integers for the second array: ");
        for (int i = 0; i < size2; i++) {
            nums2[i] = scanner.nextInt();
        }

        // Calculate the median
        double result = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println("The median of the two sorted arrays is: " + result);

        scanner.close();
    }

}
