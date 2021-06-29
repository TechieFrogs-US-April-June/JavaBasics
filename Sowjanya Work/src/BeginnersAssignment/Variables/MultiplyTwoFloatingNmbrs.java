package BeginnersAssignment.Variables;

import java.util.Scanner;

public class MultiplyTwoFloatingNmbrs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");

        double num1 = scan.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scan.nextDouble();

        scan.close();

        double product = num1*num2;
        System.out.println("Output: "+product);
    }
}
