package JavaBasicsAssignment;

import java.util.Scanner;

public class FullPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print: ");
        int rows = sc.nextInt();

        for(int i=1; i<=rows; i++) {
            for (int k = 0; k < rows-i; k++) {
                System.out.print("  ");
            }
            for(int j=1; j<=(i*2)-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
