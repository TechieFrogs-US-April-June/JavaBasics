package src.Assignments;

import java.util.Scanner;


// : A palindrome number is a number that is same after reverse. For example 545, 151
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the Number to be Reversed : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int remainder = 0;
        int rev =0;;
        int temp = n;
        do {
            remainder = n % 10; // getting last digit
            rev = rev * 10 + remainder;
            n = n / 10; // getting quocient
        }while(n>0);
        if (temp == rev) 
            System.out.println("Palindrome ");
        else 
            System.out.println("not palindrome");
        
   
        sc.close();

    }

}
