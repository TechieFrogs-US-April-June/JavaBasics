package StringsAssignment;

import java.util.Scanner;

public class StringProg16 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s1 = reader.nextLine();

        String s2 = "city";
        String s3 = new String("hi my name is sowjanya");

        //s1.toLowerCase();
        System.out.println("name to uppercase: "+s1.toUpperCase());
       // System.out.println("city to uppercase: "+s2.toUpperCase());
        //System.out.println("s3 to uppercase: "+s3.toUpperCase());
    }
}
