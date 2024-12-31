package find_the_intersection_of_two_sorted_arrays;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> findIntersection(int[] arr1, int[] arr2)
    {
        List<Integer> intersection = new ArrayList<>();

        int i=0;
        int j=0;

        while (i < arr1.length && j < arr2.length) {
            
            if (arr1[i] == arr2[j]) {
                
                intersection.add(arr1[i]);
                i++;
                j++;

            }else if (arr1[i] < arr2[j]) {
                
                i++;

            }else{

                j++;
            }
        }

        return intersection;
    }

    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 4, 5, 6}; 
        int[] arr2 = {2, 4, 6, 8}; 

        List<Integer> result = findIntersection(arr1, arr2);

        System.out.println("Result of intersection: " + result);
    }
}
