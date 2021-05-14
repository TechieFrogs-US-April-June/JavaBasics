package JavaBasicsAssignment;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print: ");
        int rows = sc.nextInt();

        for(int i=1; i<=rows; i++) {
            for (int k = 0; k < rows - i; k++) {
                System.out.print("  ");
            }
            int count = 0;
            for(int j=0; j<(i*2)-1; j++) {
                if(j+1 <= i) {
                    System.out.print((i + j) + " ");
                    count = i+j;
                } else {
                    System.out.print(--count+" ");
                }
            }
            System.out.println();
        }

    }
}
