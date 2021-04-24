package java.practice;

import java.util.Scanner;

public class VowelOrConsonantValidation {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a vowel, lowercase: ");
    while (!sc.hasNext("[aeiou]")){
        System.out.println("not an vowel");
        sc.next();
    }
    String vowel = sc.next();
    System.out.println("Thank you! Got " + vowel);
    sc.close();
}
}
