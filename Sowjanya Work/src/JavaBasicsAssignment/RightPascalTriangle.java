package JavaBasicsAssignment;

import java.util.Scanner;

public class RightPascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print: ");
        int rows = sc.nextInt();

        for(int i=1; i<=rows; i++) {
            for(int j=i; j>0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=rows-1; i>0; i--) {
            for(int j=i; j>0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
