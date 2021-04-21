import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter Dividend :: ");
        int a = scan.nextInt();
        System.out.println("enter Divisor :: ");
        int b = scan.nextInt();
        scan.close();
        int QUOTIENT = a/b;
        System.out.println("The Quotient result is ::  " + QUOTIENT);
        int REMAINDER = a%b;
        System.out.println("The Remainder result is ::  " + REMAINDER);
    }
}
