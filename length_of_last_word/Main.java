package length_of_last_word;

import java.util.Scanner;

public class Main {

    public int lengthOfLastWord(String s)
    {
        s = s.trim();

        String words[] = s.split(" ");

        String lastWord = words[words.length - 1];

        int totalLength = lastWord.length();

        return totalLength;
    }

    public static void main(String[] args) {
        
        Main solution = new Main();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your words: ");
        String s = scanner.nextLine();

        int result = solution.lengthOfLastWord(s);

        System.out.println("Output: " + result);

        scanner.close();
    }
}
