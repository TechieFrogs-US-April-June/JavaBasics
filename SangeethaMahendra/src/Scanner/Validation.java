package src.Scanner;

import java.util.Scanner;

public class Validation {
    
    public static void main(String[] args) {
        String secretWord = "Hello";
    Scanner scanner = new Scanner(System.in);

    int length = 0;
    StringBuilder guess = new StringBuilder();
    do {
        System.out.print("Enter a letter to guess: ");
        char letter = scanner.next().charAt(0);
        if (Character.isLetter(letter)) {
            guess.append(letter);
            length++;
        }
    } while (length < secretWord.length());

    if (secretWord.equalsIgnoreCase(guess.toString())) {
        System.out.println("You are correct!");
    } else {
        System.out.println("Please try again!");
    }
    scanner.close();
    }
}
