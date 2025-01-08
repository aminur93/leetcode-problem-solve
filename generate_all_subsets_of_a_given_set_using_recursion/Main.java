package generate_all_subsets_of_a_given_set_using_recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void generateSubsets(int num[], int index, List<Integer> currentSubset, List<List<Integer>> allSubSets)
    {
        if (index == num.length) {
            
            allSubSets.add(new ArrayList<>(currentSubset));
            return;
        }

        generateSubsets(num, index + 1, currentSubset, allSubSets);

        currentSubset.add(num[index]);
        generateSubsets(num, index + 1, currentSubset, allSubSets);

        currentSubset.remove(currentSubset.size() - 1);
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();

        int num[] = new int[size];
        for(int i=0; i < size; i++)
        {
            System.out.println("Element [ " + (i+1) + "] : ");
            num[i] = scanner.nextInt();
        }

        List<List<Integer>> allSubSets = new ArrayList<>();

        generateSubsets(num, 0, new ArrayList<>(), allSubSets);

        System.out.println("All subsets:");
        for (List<Integer> subset : allSubSets) {
            System.out.println(subset);
        }

        scanner.close();
    }
}
