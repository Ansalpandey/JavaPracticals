// write a program to find the number of vowels, constants, digits and white space character in a string in java 

import java.util.Scanner;

public class PracticalNine {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            int vowels = 0;
            int consonants = 0;
            int digits = 0;
            int whitespace = 0;

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (Character.isLetter(ch)) {
                    ch = Character.toLowerCase(ch);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                } else if (Character.isDigit(ch)) {
                    digits++;
                } else if (Character.isWhitespace(ch)) {
                    whitespace++;
                }
            }

            System.out.println("Number of vowels: " + vowels);
            System.out.println("Number of consonants: " + consonants);
            System.out.println("Number of digits: " + digits);
            System.out.println("Number of whitespace characters: " + whitespace);
        }
    }
}
