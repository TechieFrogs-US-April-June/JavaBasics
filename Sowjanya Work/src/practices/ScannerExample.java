package practices;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner vm = new Scanner(System.in);
        System.out.print("Enter your name: ");
        //System.out.print("Enter your age: ");
        //System.out.println("Enter your gender: ");
        //System.out.println("Enter your ph: ");
        String name = vm. nextLine();
        //int age = vm.nextInt();
        //char gender = vm.next().charAt(0);
        //long ph = vm.nextLong();

        System.out.println("Name is: " +name);
        //System.out.println("Age is: " +age);
        //System.out.println("Gender is: " +gender);
        //System.out.println("Phone number is: " +ph);

    }
}
