package JavaBasicsAssignment;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print: ");
        int rows = sc.nextInt();
        int num=1;

        for(int i=1; i<=rows; i++) {
            for(int j=0; j<i; j++){
                System.out.print(num++ + " ");
            }
            System.out.println();
        }

    }
}
