import java.util.Scanner;

public class PalindromePgm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to check it is Palindrome:");
        int a = sc.nextInt();//int a=58285
        int i,rev=0,temp;
        temp = a;
        while(a>0) {
            i = a % 10;
            rev = (rev * 10) + i;
            a = a / 10;
        }
        if (temp == rev) {
            System.out.println("Given Number is palindrome");
        } else {
            System.out.println("Given Number is Not a Palindrome Number");
        }
    }
}