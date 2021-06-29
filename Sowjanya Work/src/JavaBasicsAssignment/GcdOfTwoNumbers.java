package JavaBasicsAssignment;

import java.util.Scanner;

public class GcdOfTwoNumbers {
    public static void main(String[] args) {
       /* // find GCD between n1 and n2
        int n1 = 45, n2 = 95;

        // initially set to gcd
        int gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; ++i) {

            // check if i perfectly divides both n1 and n2
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }

        System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);

        */
        Scanner sc = new Scanner(System.in);
        while(true) {
            int first = readNum("first", sc);
            sc.nextLine();
            int second = readNum("second", sc);

            int gcd = 1;
            for (int i = 1; i <= first && i <= second; i++) {
                if (first % i == 0 && second % i == 0) {
                    gcd = i;
                }
            }
            System.out.println("GCD is: " + gcd);
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
        while(true) {
            System.out.print("Enter "+count+" number: ");
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                return num;
            } else {
                System.out.println("Invalid " + count + "number. Please enter the number again.");
            }
            sc.nextLine();
        }
    }
}
