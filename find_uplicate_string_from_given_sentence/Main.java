package find_uplicate_string_from_given_sentence;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your string: ");
        String inputString = scanner.nextLine();

        inputString = inputString.toLowerCase();

        Map<Character, Integer> charCount = new HashMap<>();

        for(char ch: inputString.toCharArray())
        {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        
        System.out.println("Duplicates characters: ");
        for(Map.Entry<Character, Integer> entry: charCount.entrySet())
        {
            if (entry.getValue() > 1) {
                
                System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
            }
        }


        scanner.close();
    }
}
