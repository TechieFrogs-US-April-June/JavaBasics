package BeginnersAssignment;

import java.util.Scanner;

public class nmbrEnterdByUser {
    public static void main(String[] args) {

        /* This reads the input provided by user
         * using keyboard
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = sc.nextInt();

        // Closing Scanner after the use
        sc.close();

        // Displaying the number
        System.out.println("The number entered by user: "+num);


    }
}
