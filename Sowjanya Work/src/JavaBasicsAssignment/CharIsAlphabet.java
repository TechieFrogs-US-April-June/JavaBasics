package JavaBasicsAssignment;

import java.util.Scanner;

public class CharIsAlphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character: ");
        char ch ;
        ch = sc.next().charAt(0);

        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
            System.out.println(ch+ " is Alphabet");
        else
            System.out.println(ch+ " is not Alphabet");

    }
}
