package count_vowels_and_consonant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your string: ");
        String inputString = scanner.nextLine();

        inputString = inputString.toLowerCase();

        int vowelsCount = 0;
        int consonantCount = 0;

        for(char ch : inputString.toCharArray() )
        {
            if (ch >= 'a' && ch <= 'z') {
                
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
                    
                    vowelsCount++;
                }else{
                    consonantCount++;
                }
            }
        }

        System.out.println("Total number of vowels: " + vowelsCount);
        System.out.println("Total number of consonant: " + consonantCount);

        scanner.close();
    }
}
