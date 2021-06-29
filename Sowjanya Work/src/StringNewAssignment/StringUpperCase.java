package StringNewAssignment;

import java.util.Scanner;

public class StringUpperCase {
    public static void main(String[] args) {
        String s;
        String u = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string s: ");
        s=sc.nextLine();

        char[] ch = s.toCharArray();
        System.out.println("Original string: "+s);
        for(int i=0; i<ch.length; i++) {
            if(ch[i]>=97 && ch[i]<=122) {
                ch[i] = (char) (ch[i]-32);
            }
            u = u+ch[i];
        }
        System.out.println("upper case string: "+u);

        /*s = s.toUpperCase();
        System.out.println(s);*/
    }
}
