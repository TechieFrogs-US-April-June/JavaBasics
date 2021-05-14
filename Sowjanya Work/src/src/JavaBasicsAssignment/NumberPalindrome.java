package JavaBasicsAssignment;

import java.util.Scanner;

public class NumberPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int reverse = 0;
        int last_digit = 0;
        int actual_number;

        while (true) {
            System.out.print("Enter any integer number: ");
            boolean isNumber = sc.hasNextInt();
            if (isNumber) {
                num = sc.nextInt();
                num = Math.abs(num);
                actual_number = num;
                while (num > 0) {
                    last_digit = num % 10;
                    reverse = reverse * 10 + last_digit;
                    num = num / 10;
                }
                break;
            } else {
                System.out.println("Invalid number");
            }
        }
        if (actual_number == reverse) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }
    }
}

