package remove_all_space_from_string;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your string: ");
        String inputString = scanner.nextLine();

        inputString = inputString.replace(" ", "");

        System.out.println(inputString);

        scanner.close();
    }
}
