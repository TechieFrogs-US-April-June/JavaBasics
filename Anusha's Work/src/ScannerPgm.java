import java.util.Scanner;

public class ScannerPgm {
    public static void main(String[] args) {
        int a ,b,sum;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value1: " );
        a=sc.nextInt();
        System.out.print("Enter value2: " );
        b=sc.nextInt();
        sum=a+b;
        System.out.print("Sum of " + a + " and " + b + " is " +sum );
    }
}
