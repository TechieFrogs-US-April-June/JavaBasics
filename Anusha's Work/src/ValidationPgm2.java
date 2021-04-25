import java.util.Scanner;

public class ValidationPgm2 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter Value 1:");
        a=oneInputValidationPgm();
        System.out.println("Enter Value 2:");
        b=oneInputValidationPgm();
        System.out.println("Enter Value 3:");
        c=oneInputValidationPgm();
        System.out.println("Sum of " + a + ","+ b +"," + c +" is: " + (a+b+c));
    }
    public static int oneInputValidationPgm() {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter any number:");
        do {
           // System.out.print("Enter any valid number:");
            //sc.next();
            if (!sc.hasNextInt()) {
                System.out.print("Given Number \"" +  sc.next() + "\" is Invalid.Please Enter a valid number:");
                //sc.next();
            } else {
                //System.out.println("in else");
                a = sc.nextInt();
                //System.out.println("Given Number is " + a);

            }
        } while (a == 0);
        return a;
    }
}
