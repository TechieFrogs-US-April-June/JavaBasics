import java.util.Scanner;

public class ValidationPgm4 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter Value 1:");
        a=oneInputValidationPgm();
        System.out.println("Enter Value 2:");
        b=oneInputValidationPgm();

        Scanner sc=new Scanner(System.in);
        int x,Addition,Multiplication,Division;
        char str;
        do {
            System.out.println("Enter 1 for Addition , 2 for Multiplication , 3 for Division :");

             x=sc.nextInt();
            switch (x) {
                case 1: Addition = a + b;
                       System.out.println("Sum of " + a + "," + b + " is:" + Addition);
                       break;
                case 2: Multiplication = a * b;
                       System.out.println("Multiplication of " + a + "," + b + " is:" + Multiplication);
                       break;
                case 3: Division = a / b;
                       System.out.println("Division of " + a + "," + b + " is:" + Division);
                       break;
                default:System.out.println("Invalid Input");

            }

            System.out.println("Do you want to continue:(Y/N)");
             str=sc.next().charAt(0);
        } while(str== 'Y' || str=='y');
        sc.close();
    }
    public static int oneInputValidationPgm() {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter any number:");
        do {
           // System.out.print("Enter any valid number:");
            //sc.next();
            if (!sc.hasNextInt()) {
                //System.out.println("Insert a valid number");
                sc.next();
            } else {
                //System.out.println("in else");
                a = sc.nextInt();
                System.out.println(a);
            }
        } while (a == 0);
        return a;
    }
}