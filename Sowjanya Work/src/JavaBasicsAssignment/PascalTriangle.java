package JavaBasicsAssignment;

import java.util.Scanner;

public class PascalTriangle {
    static int binomialCoeff(int n, int k) {
        int res = 1;

        if (k > n - k)
            k = n - k;

        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < rows-i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoeff(i, j) + " ");
            }
            System.out.println();
        }
    }
}
