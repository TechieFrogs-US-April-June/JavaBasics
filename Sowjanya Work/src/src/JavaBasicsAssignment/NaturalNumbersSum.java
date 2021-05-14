package JavaBasicsAssignment;

import java.util.Scanner;

public class NaturalNumbersSum {
    public static void main(String[] args){
        //Sum using for loop
       /* int a = 20;
        int sum = 0;
        for(int i=1; i<=a; i++){
            sum += i;//sum = sum+1

        }
        System.out.println("Result = " +sum);

        */

        //Sum using while loop
        Scanner sc = new Scanner(System.in);
        while(true) {
            int first = readNum("first", sc);
            sc.nextLine();
            int second = readNum("second", sc);

            int a =20;
        int sum = 0;
        int i = 1;
        while(i<=a){
            sum += i;
            i++;
        }
        System.out.println("Sum of two numbers: " +sum);
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



