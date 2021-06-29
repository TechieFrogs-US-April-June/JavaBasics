package StringNewAssignment;

import java.util.Scanner;

public class StringSwapWithThird {
    public static void main(String[] args) {
        String s1;
        String s2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string s1: ");
        s1=sc.nextLine();
        System.out.println("Enter string s2: ");
        s2=sc.nextLine();

        int temp = s1.length();

        /*System.out.println("Before swap: s1 = " +s1);
        System.out.println("Before swap: s2 = " +s2);*/

        s1 = s1+s2;
        s2 = s1.substring(0,temp);
        s1 = s1.substring(temp);

        System.out.println("After swap: s1 = " +s1);
        System.out.println("After swap: s2 = " +s2);


    }






}
