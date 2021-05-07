package practices;

import java.util.Scanner;

public class ScannerSum {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
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

        */

        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int sum = 0;
        while (true) {
            x = readNum("first", sc);
            sc.nextLine();
            y = readNum("second", sc);
            sum = x + y;
            System.out.println("Sum of " + x + " and " + y + ": " + sum);
            System.out.print("Please enter Y to continue or any key to exit: ");
            String nxt = sc.next().toUpperCase();
            if(!nxt.equals("Y")) {
                break;
            }
            sc.nextLine();
        }
        sc.close();
    }

        public static int readNum(String count, Scanner sc) {
            int num=0;
            while(true) {
                System.out.print("Enter "+count+" number: ");
                boolean isInt = sc.hasNextInt();
                if (isInt) {
                    num = sc.nextInt();
                    return num;
                } else {
                    System.out.println("Invalid " + count + "number. Please enter the number again.");
                }
                sc.nextLine();
            }
    }
}
