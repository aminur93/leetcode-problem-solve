package longest_substring_without_repeating_chartacer;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>(); // To store unique characters in the current window
        int left = 0; // Left pointer of the sliding window
        int maxLength = 0; // To keep track of the maximum length of substrings

        for (int right = 0; right < s.length(); right++) { // Right pointer expands the window
            while (charSet.contains(s.charAt(right))) { // If a duplicate is found
                charSet.remove(s.charAt(left)); // Shrink the window from the left
                left++;
            }
            charSet.add(s.charAt(right)); // Add the current character to the set
            maxLength = Math.max(maxLength, right - left + 1); // Update the max length
        }

        return maxLength;
    }

    public static void main(String[] args){

        Main solution = new Main();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine();

        int result = solution.lengthOfLongestSubstring(userInput);
        System.out.println("The length of the longest substring without repeating characters is: " + result);


        scanner.close();
    }
}
