package practices;

import java.util.Scanner;

public class ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0;
        int y=0;
        int sum=0;
        while(true) {
            System.out.print("Enter 1st number: ");
            boolean firstNum = sc.hasNextInt();
            if(firstNum) {
                x = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter 2nd number: ");
                boolean secondNum = sc.hasNextInt();
                if(secondNum) {
                    y=sc.nextInt();
                    sum = x + y;
                    break;
                } else {
                    System.out.println("Invalid 2nd number");
                }
            } else {
                System.out.println("Invalid 1st number");
            }
            sc.nextLine();
        }
        System.out.println("sum of " + x + " and " + y + ": " +sum);
        sc.close();
    }
}
