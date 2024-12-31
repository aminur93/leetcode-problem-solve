package longest_common_prefix;

import java.util.Scanner;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // Return empty if input is null or empty
        }

        String prefix = strs[0]; // Assume the first string is the prefix
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1); // Reduce prefix
                if (prefix.isEmpty()) {
                    return ""; // No common prefix
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args){

        Solution solution = new Solution();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the word: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] word = new String[size];
        System.out.println("Enter " + size + " sorted word for the array: ");
        for (int i = 0; i < size; i++) {
            word[i] = scanner.nextLine();
        }

        String result = solution.longestCommonPrefix(word);
        System.out.println(result);

        scanner.close();

    }
}
