package practices;

import java.util.Scanner;

public class ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,sum;
        System.out.print("Value1: ");
        x = sc.nextInt();
        System.out.print("Value2: ");
        y = sc.nextInt();
        sum = x + y;
        //System.out.println("Sum of value 1 and value 2: " +sum);
        System.out.println("sum of " + x + " and " + y + ": " +sum);
        sc.close();

    }
}
