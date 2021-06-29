package BeginnersAssignment;

import java.util.Scanner;

public class UserEnterNmbrPostveOrNegtve {
    public static void main(String[] args) {

        int number;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        number = sc.nextInt();
        sc.close();

        if(number > 0)
        {
            System.out.println(number+" is positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }
    }
}
