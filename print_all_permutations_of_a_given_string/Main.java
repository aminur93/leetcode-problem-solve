package print_all_permutations_of_a_given_string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void getPermutations(String str, String prefix, List<String> result)
    {
        if (str.length() == 0) {
            result.add(prefix);
            return;
        }

        for(int i = 0; i < str.length(); i++)
        {
            char current = str.charAt(i);

            String remaning = str.substring(0, i) + str.substring(i + 1);

            getPermutations(remaning, prefix + current, result);

        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your premutations string: ");
        String str = scanner.nextLine();

        List<String> permutations = new ArrayList<>();

        getPermutations(str, "", permutations);

        System.out.println("Permutations of " + str + ":");
        for(String permutation : permutations)
        {
            System.out.println(permutation);
        }

        scanner.close();
    }
}
