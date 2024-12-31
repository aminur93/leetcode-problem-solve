package find_duplicates_word_from_given_sentense;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your sentense: ");
        String inputString = scanner.nextLine();

        String words[] = inputString.toLowerCase().split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();

        for(String word: words)
        {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        //System.out.println(wordCount);

        System.out.println("Duplicates word: ");
        for(Map.Entry<String, Integer> entry: wordCount.entrySet())
        {
            if (entry.getValue() > 1) {
                
                System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
            }
        }

        scanner.close();
    }
}
