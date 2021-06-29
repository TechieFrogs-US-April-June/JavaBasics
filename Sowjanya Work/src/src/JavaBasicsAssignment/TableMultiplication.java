package JavaBasicsAssignment;

import java.util.Scanner;

public class TableMultiplication {
    public static void main(String[] args){
        //Multiplication using for loop
        /*int a = 2;
        for(int i=1;i<=10;i++) {

            System.out.println(a+ "*" + i+ "=" +a*i);
        }

         */
        //multiplication using while loop
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of rows you want to print: ");
            int rows = sc.nextInt();
        int a = 5;
        int i = 1;
        while(i<=10){
            System.out.println(a+ "*" + i+ "=" +a*i);
            i++;
        }

    }
}
