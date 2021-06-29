package SirishaWork.src.Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {


        String sc = new String("madam");

       char[] ch = sc.toCharArray();
        String rev="";

        for(int i=ch.length-1; i>=0; i--)
            rev =rev + ch[i];

        if(sc.equals(rev))
            System.out.println(" is a palindrome");
        else
            System.out.println(" is not a palindrome");

    }
}
