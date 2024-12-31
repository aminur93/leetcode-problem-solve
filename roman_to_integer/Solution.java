package roman_to_integer;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            prevValue = currentValue;
        }

        return total;
    }

    public static void main(String[] args){

        Solution solution = new Solution();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Roman Number: ");
        String input = scanner.nextLine();

        System.out.println("Integer value: " + solution.romanToInt(input));

        scanner.close();
    }
}
