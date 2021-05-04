package assignment;

import java.util.Scanner;

public class NumberPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num =898;
        int reverse = 0;
        int last_digit = 0;
        num = Math.abs(num);
        int actual_number = num;

        while(num > 0) {
            last_digit = num % 10;
            reverse = reverse * 10 + last_digit;
            num = num / 10;
        }

        if(actual_number == reverse) {
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not palindrome");

        }



    }


}
