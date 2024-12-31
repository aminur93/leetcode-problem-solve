package reverse_reach_word_in_a_senrance;

import java.util.Scanner;

public class Main {

     public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your sentense: ");
        String inputString = scanner.nextLine();

        String words[] = inputString.split(" ");

        StringBuilder reverseSentense = new StringBuilder();
        for(String word: words)
        {
            StringBuilder reverseWord = new StringBuilder(word);
            reverseSentense.append(reverseWord.reverse()).append(" ");
        }

        System.out.println(reverseSentense);

        scanner.close();
     }
}
