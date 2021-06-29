package SirishaWork.src.ClassesAndObjects;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        // create Scanner class object
        Scanner scan = new Scanner(System.in);

        // declare three numbers
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;

        // declare sum variable
        // and initialize with 0
        double sum = 0.0;
        // declare average variable
        double avg = 0.0;

        // take three numbers
        System.out.print("Enter three numbers: ");
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
        num3 = scan.nextDouble();

        // calculate the sum value
        sum = num1 + num2 + num3;
        // calculate the average value
        avg = sum/3;

        // display result
        System.out.println("Average: " + avg );
    }
}

