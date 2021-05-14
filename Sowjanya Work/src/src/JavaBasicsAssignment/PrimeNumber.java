package JavaBasicsAssignment;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        /*int n = 5;
        boolean pn = false;
        for (int i = 2; i <= n/2; i++) { // Alternative for loop for(int i=2; i<=(long) math.sqrt(n); i++)
            // condition for nonprime number
            if (n % i == 0) {
                pn = true;
                break;
            }
        }

        if (!pn)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");

         */
        //Checking prime number using scanner class
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a prime number: ");
        int inputNumber = sc.nextInt();

        boolean pn = false;
        for(int i = 2; i <= inputNumber/2; i++){
            if(inputNumber % i == 0){
                pn = true;
                System.out.println(inputNumber + " is not prime number");
                break;
            }

        }
        if(!pn)
            System.out.println(inputNumber + " is prime number");

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a prime number: ");
        int inputNumber = sc.nextInt();
        boolean pn = false;
        int i = 2;
        while (i <= inputNumber / 2) {
            if (inputNumber % i == 0) {
                pn = true;
                break;
            }
            i++;
        }
        if (!pn)
            System.out.println(inputNumber + " is prime number");
        else
            System.out.println(inputNumber + " is not prime number");


    }
}









