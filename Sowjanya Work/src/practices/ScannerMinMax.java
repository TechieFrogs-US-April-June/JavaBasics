package practices;

import java.util.Scanner;

public class ScannerMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=0;
        int n2=0;
        int minValue = 0;
        int maxValue = 0;

        while(true) {
            System.out.print("Enter 1st number: ");
            boolean firstNum = sc.hasNextInt();

            if(firstNum) {
                n1 = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter 2nd number: ");
                boolean secondNum = sc.hasNextInt();
                if(secondNum) {
                    n2=sc.nextInt();
                    if(n1 < n2) {
                        minValue = n1;
                        maxValue = n2;
                    } else if (n1> n2){
                        minValue = n2;
                        maxValue = n1;
                    }
                    break;
                } else {
                    System.out.println("Invalid 2nd number");
                }
            } else {
                System.out.println("Invalid 1st number");
            }
            sc.nextLine();
        }

        if(minValue ==0 && maxValue ==0) {
            System.out.println("Both numbers are equal");
        } else {
            System.out.println("Minimum value: " + minValue);
            System.out.println("Maximim value: " + maxValue);
        }
        sc.close();
    }
}

