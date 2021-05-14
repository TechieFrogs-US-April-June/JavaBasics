package practices;

import java.util.Scanner;

public class ScannerNameDob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your year of birth: ");

        //boolean hasNextInt = scanner.hasNextInt();
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();


            int age = 2021 - yearOfBirth;

            if(age > 0 && age <= 100){
                System.out.println("Your name is " + name + " , and you are " + age + " years old.");
            }else{
                System.out.println("Invalid year of birth");
            }
        }else{
            System.out.println("Unable to pass year of birth");
        }


        scanner.close();
    }
}
