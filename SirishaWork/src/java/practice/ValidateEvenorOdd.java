import java.util.Scanner;

public class ValidateEvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println("Enter an integer number");
            boolean isInt = sc.hasNextInt();

            if (isInt) {
                num = sc.nextInt();
                if (num % 2 == 0) {
                    System.out.println("Entered number is Even");
                } else {
                    System.out.println("Entered number is odd");
                }
                break;
            } else {
                System.out.println("Incorrect integer Number");
            }
            sc.nextLine();

        }
        sc.close();
    }
}
