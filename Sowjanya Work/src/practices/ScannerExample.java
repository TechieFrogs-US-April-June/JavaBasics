package practices;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner vm = new Scanner(System.in);//creating object in scanner

        System.out.print("Enter your name: ");//Asking user to enter name
        //String name = vm.next();
        String name = vm. nextLine();
       // System.out.println("Name is: " +name);

        System.out.println("Enter your age: ");
        int age = vm.nextInt();

        System.out.print("Enter your gender: ");
        char gender = vm.next().charAt(0);

        System.out.print("Enter your ph: ");
        long ph = vm.nextLong();


        System.out.println("Name is: " +name);
        System.out.println("Age is: " +age);
        System.out.println("Gender is: " +gender);
        System.out.println("Phone number is: " +ph);

        vm.close();


        //System.out.print("Enter your name: ");
        //String name = vm.next(); //takes only first word of the sentence
        //String name = vm.nextLine();//takes complete words in the sentence and passes to next line in the program
        //System.out.println("Name is: " +name);

    }
}
