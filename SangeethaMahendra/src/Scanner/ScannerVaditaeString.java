package src.Scanner;

import java.util.Scanner;

//To validate a string value, we can use regex to get string in a specific format. Here, the hasNext() takes a regex to validate a string that can contain only alphabets.

public class ScannerVaditaeString {
    static String input;

    public static void main(String[] args) {
        System.out.println("Enter a String ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext("[A-Za-z]*")) {
            input = sc.next();
            System.out.println("You entered a string value " + input);
        } else {
            System.out.println("Please Enter a Valid Value");
        }
        sc.close();
    }

}
