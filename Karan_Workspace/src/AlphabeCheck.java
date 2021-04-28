import java.util.Scanner;

public class AlphabeCheck {
    static char a;

    static void alpha() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println(" enter to check if alphabet / not :: ");
            if (scan.hasNextInt()) {
                System.out.println("You have entered numeber, please enter ALPHABET...!");
                alpha();
                break;
            } else {
                String len = scan.next();

                if (len.length() == 1) {
                    a = len.charAt(0);
                    break;
                }
                System.out.println("Please enter only ONE character");
            }
        }
        scan.close();
    }

    public static void main(String[] args) {
        alpha();
        while (true) {

            if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) {
                System.out.print(a + " is alphabet");
                break;
            }

            System.out.print(a + " is not an alphabet");
            System.out.printf("%n");
            System.out.println("Please enter an ALPHABET...!!!");
            alpha();
        }
    }

}
