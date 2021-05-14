package practices;

import java.util.Scanner;

public class EvenOddScanner {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x;

        while(true) {
            System.out.print("Enter any number : ");
            boolean isInt = sc.hasNextInt();

            if(isInt) {
                x = sc.nextInt();
                if(x % 2 ==0) {
                    System.out.println(x + " is even number");
                } else{
                    System.out.println(x+ " is odd number");
                }
                break;
            } else {
                System.out.println("Incorrect Integer Number");
            }
            sc.nextLine();
        }
        sc.close();
    }
}
