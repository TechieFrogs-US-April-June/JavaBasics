import java.util.Scanner;

public class QuotientRemainder {
    static int a,b;
    static boolean x=true;
    public static void main(String[] args) {
        while(x){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter Dividend :: ");
        if(scan.hasNextInt()){
            a = scan.nextInt();
        break;}
        System.out.println("Please enter INTEGER value");
        }

        while(x){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("enter Divisor :: ");
        if(scan1.hasNextInt()){
            b = scan1.nextInt();
        break;}
        System.out.println("Please enter INTEGER value");
        }

        int QUOTIENT = a/b;
        System.out.println("The Quotient result is ::  " + QUOTIENT);
        int REMAINDER = a%b;
        System.out.println("The Remainder result is ::  " + REMAINDER);
    }
}
