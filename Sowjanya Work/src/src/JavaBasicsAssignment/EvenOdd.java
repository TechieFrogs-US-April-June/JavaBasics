package JavaBasicsAssignment;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }

        //String output = (value%2==0)?"even number":"odd number";
        //System.out.println(output);

}
