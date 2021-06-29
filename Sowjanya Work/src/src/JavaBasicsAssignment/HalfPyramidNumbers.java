package JavaBasicsAssignment;

import java.util.Scanner;

public class HalfPyramidNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print: ");
        int rows = sc.nextInt();

        for(int i=1;i<=5;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" " );

            }
            System.out.println();
        }

    }
}
