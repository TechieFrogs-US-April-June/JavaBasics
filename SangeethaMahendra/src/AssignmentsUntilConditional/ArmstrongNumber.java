import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        // An Armstrong number of three digits is an integer such that the sum of the
        // cubes of its digits is equal to the number itself
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int remainder = 0;
        int armstrong = 0;
        int temp = n;
        do {
            remainder = n % 10; // getting remainder
            armstrong = armstrong + (remainder * remainder * remainder);
            n = n / 10; // getting quocient
        } while (n > 0);

        if (temp != armstrong) {
            System.out.println( armstrong + " is a not Armstrong Number");
        } else {
            System.out.println( armstrong + " is a Armstrong Number");
        }
        sc.close();
    }

}
