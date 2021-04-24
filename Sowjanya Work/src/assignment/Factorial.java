package assignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //Factorial of 10 using for loop
        /*int n = 10;
        int fact = 1;

        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);

         */



        //Factorial of 10 using while loop
        /*int n = 10;
        int fact = 1;

        int i = 1;
        while(i<=10){
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+n+" is: "+fact);

         */

        Scanner fact = new Scanner(System.in);
        int num ;
        int i = 1;
        int factorial=1;
        while(true) {
            System.out.print("Enter fact number: ");
            boolean Number = fact.hasNextInt();
            if(Number) {
                num = fact.nextInt();
                while(i<=num){
                    factorial *= i;
                    i++;
                }

            } else {
                System.out.println("Invalid Number");
            }

            fact.nextLine();
            System.out.println("Factorial of given number: " +factorial);

        }

    }

}