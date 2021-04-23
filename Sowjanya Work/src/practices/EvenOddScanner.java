package practices;

import java.util.Scanner;

public class EvenOddScanner {
    public static void main(String[] args){
        int x;
        System.out.println("Enter a number : ");
        Scanner sc= new Scanner(System.in);
        x = sc.nextInt();

        if(x % 2 ==0) {
            System.out.println("Enter number is even number");
        }
        else{
            System.out.println("Enter number is odd number");
        }

    }
}
