package JavaBasicsAssignment;

import java.util.Scanner;

public class LcmOfTwoNumbers {
    public static void main(String[] args) {
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

            int lcm = (first * second) / gcd;
            System.out.println("LCM of given numbers is :: "+lcm);
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
