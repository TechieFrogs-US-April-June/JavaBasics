
import java.util.Scanner;

public class ValidationAddTwoIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int sum = 0;
        while (true) {
            System.out.println("Enter First Number: ");
            boolean firstnum = sc.hasNextInt();
            if (firstnum) {
                a = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Second Number: ");
                boolean secondNum = sc.hasNextInt();
                if (secondNum) {
                    b = sc.nextInt();
                    sum = a + b;
                    break;
                } else {
                    System.out.println("Invalid second number");
                }
            }else{
                System.out.println("Invalid first number");
            }
            sc.nextLine();
        }
        System.out.println("sum of " + a + " and " + b + " : " +sum);
        sc.close();
    }
}

        /*do{
            System.out.println("Enter Integer");
            while (!sc.nextInt())
            {
                System.out.println("This is not an integer. Please enter integer" );
                sc.next();
            }
            num = sc.nextInt();
        }while (num <=0);
        System.out.println("It is a number");*/










    /*{
        int num1, num2, sum;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        num2 =sc.nextInt();

        sc.close();
        sum = num1 + num2;
        System.out.println("Sum of these number: "+sum);


    }*/



