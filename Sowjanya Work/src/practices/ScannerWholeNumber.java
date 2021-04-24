package practices;

import java.util.Scanner;

public class ScannerWholeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        boolean isNumber;

        do {
            System.out.println("Enter a whole number: ");

            if (input.hasNextInt()) {
                num = input.nextInt();
                isNumber = true;
            } else {
                System.out.println("I dont understand");
                isNumber = false;
                input.next();
            }
        }while (!(isNumber));
        System.out.println("Number is: " +num);
        input.close();

    }
}
