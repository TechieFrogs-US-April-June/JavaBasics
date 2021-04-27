import java.util.Scanner;

public class Factorial {
    static boolean t = true;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (t) {
            System.out.println("Enter the number to find factorial :: ");
            if (scan.hasNextInt()) {
                int a = scan.nextInt();
                scan.close();
                int x = 1;
                int y = 1;
                while (y <= a) {
                    x = x * y;
                    y++;
                }
                System.out.println("The Factorial of number **" +a +"** entered is ---> " +x);
                break;
            } else {
                scan.next();
            }
            System.out.println("Please enter INTEGER value");
        }
        scan.close();
    }
}
