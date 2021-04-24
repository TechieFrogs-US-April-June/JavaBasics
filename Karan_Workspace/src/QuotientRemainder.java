import java.util.Scanner;

public class QuotientRemainder {
    static int a,b;
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter Dividend :: ");
        if(scan.hasNextInt()){
            a = scan.nextInt();}
        else {System.out.println("Please enter INTEGER value");System.exit(1);}
        System.out.println("enter Divisor :: ");
        if(scan.hasNextInt()){
            b = scan.nextInt();}
        else {System.out.println("Please enter INTEGER value");System.exit(1);}        scan.close();
        int QUOTIENT = a/b;
        System.out.println("The Quotient result is ::  " + QUOTIENT);
        int REMAINDER = a%b;
        System.out.println("The Remainder result is ::  " + REMAINDER);
    }
}
