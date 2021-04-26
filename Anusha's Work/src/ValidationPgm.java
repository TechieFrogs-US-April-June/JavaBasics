import java.util.Scanner;

public class ValidationPgm {
    public static void main(String[] args) {
        //
        // oneInputValidationPgm();
        twoInputValidationPgm();
    }

    public static void oneInputValidationPgm() {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter any number:");
        do {
            System.out.print("Enter any valid number:");
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
    }

    public static void twoInputValidationPgm() {
        int a = 0, b=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter two Numbers");
            if (!sc.hasNextInt()) {
                System.out.println("Insert Valid Numbers");
                sc.next();
                sc.next();
            } else {

                a = sc.nextInt();
                if(!sc.hasNextInt()) {
                    System.out.println("Insert Valid Numbers");
                    sc.next();
                }
                else {
                    b = sc.nextInt();
                    System.out.println("a= " + a);
                    System.out.println("b= " + b);
                    int Sum = a + b;
                    System.out.println("Sum of "  + a + " and " + b + " is "  + Sum);
                }

            }

        }while(a==0 || b==0);
        sc.close();
    }

}


