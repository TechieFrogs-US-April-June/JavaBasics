package src.Assignments;

// Q29 :	Left Pascal's Triangle

public class LeftPascalsTraingle {
    public static void main(String[] args) {
        // Step 1 : Rows = 10 ; Step 2 : Spaces for 1 row = 9 spaces( it has to reduce)
        // ; step 3: Stars : After 8 spaces 1 star has to print;
        int i;
        // for loop for 10 Rows
        for (i = 1; i <= 10; i++) { // 1<=10 ;1+1=2;

            // inner for loop for Spaces
            for (int j = 1; j <= 10 - i; j++) { // j 1<=9 (10-1)
                System.out.print(" ");
            }
            // loop for Stars
            for (int k = 1; k <= i; k++) {// k=1; 1<=1(i value); 1+1=2

                System.out.print("*");

            }
            System.out.println();
        }
            // for loop for 10 Rows
        for (i = 1; i <= 9; i++) {

            // inner for loop for Spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // loop for Stars
            for (int k = 1; k <=10 - i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
