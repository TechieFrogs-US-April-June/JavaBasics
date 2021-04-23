package practices;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        /*for(int i = 1; i<=10;i++) {
            System.out.print("Enter number # " + i + ":");
            boolean isAnInt = sc.hasNextInt();
            if(isAnInt){
                int num = sc.nextInt();
                sum += num;
            }else{
                System.out.println("Invalid number");
            }
            sc.nextLine();
        }
            System.out.println("Sum = " +sum);*/


        while (true) {
            int order = counter + 1;
            System.out.println("Enter number # " + order + ":");

            boolean isAnInt = sc.hasNextInt();

            if (isAnInt) {
                int number = sc.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                } else {
                    System.out.println("Invalid number");
                }
                sc.nextLine();
            }
            System.out.println("sum = " + sum);
            sc.close();
        }


    }
}
