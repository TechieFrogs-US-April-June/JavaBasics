package assignment;

import java.util.Scanner;

public class DiamondStarPattern {
    public static void main(String[] args) {
        int n, c, k, diamond = 1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        n=s.nextInt();

        diamond = n - 1;

        for (k = 1; k<=n; k++)
        {
            for (c = 1; c<=diamond; c++)
                System.out.print(" ");

            diamond--;

            for (c = 1; c<= 2*k-1; c++)
                System.out.print("*");

            System.out.print("\n");
        }

        diamond = 1;

        for (k = 1; k<= n - 1; k++)
        {
            for (c = 1; c<= diamond; c++)
                System.out.print(" ");

            diamond++;

            for (c = 1 ; c<= 2*(n-k)-1; c++)
                System.out.print("*");

            System.out.println("");
        }
    }
}
