package JavaBasicsAssignment;

import java.util.Scanner;

public class SandGlassStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print: ");
        int rows = sc.nextInt();

        for(int i=rows; i>0; i--) {
            for (int k = 1; k <= rows-i; k++) {
                System.out.print(" ");
            }

            for(int j=i; j>0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<=rows; i++) {
            for (int k = 1; k <= rows-i; k++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
