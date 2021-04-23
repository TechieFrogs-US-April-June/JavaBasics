package practices;

import java.util.Scanner;

public class ScanPositiveNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.println("Enter a positive int number below 1000: ");
            num = input.nextInt();
        }while ((num <= 0) || (num >= 1000));
        System.out.println("Valid positive int number below 1000");

    }
}
