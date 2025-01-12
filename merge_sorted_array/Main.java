package merge_sorted_array;

import java.util.Scanner;

public class Main {

    public void merge(int nums1[], int m, int nums2[], int n)
    {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while (i >= 0 && j >= 0) {
            
            if (nums1[i] > nums2[j]) {
                
                nums1[k] = nums1[i];

                i--;

            }else{

                nums1[k] = nums2[j];

                j--;
            }
            k--;
        }

        while (j >= 0) {
            
            nums1[k] = nums2[j];

            j--;

            k--;
        }
    }

    public static void main(String[] args) {
        
        Main solution = new Main();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first size of array: ");
        int size1 = scanner.nextInt();

        int nums1[] = new int[size1];
        for(int i=0; i < size1; i++)
        {
            System.out.print("Element [ " + (i+1)+ " ] : ");
            nums1[i] = scanner.nextInt();
        }

        System.out.println("Enter first array orininal number: ");
        int m = scanner.nextInt();

        System.out.println("Enter the second size of array: ");
        int size2 = scanner.nextInt();

        int nums2[] = new int[size2];
        for(int i=0; i < size2; i++)
        {
            System.out.print("Element [ " + (i+1)+ " ] : ");
            nums2[i] = scanner.nextInt();
        }

        System.out.println("Enter second array orininal number: ");
        int n = scanner.nextInt();

        solution.merge(nums1, m, nums2, n);

        System.out.print("Merged Array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
