package Strings;

import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string s: ");
        s=sc.nextLine();

        int vowels = 0;
        int consonants = 0;
        int numerics = 0;


        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                vowels++;
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                consonants++;
            }else if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                numerics++;
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of numerics: " +numerics);

    }
}
