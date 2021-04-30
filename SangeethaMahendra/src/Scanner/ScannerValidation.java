package src.Scanner;

import java.util.Scanner;

public class ScannerValidation {

    public static void main(String[] args) {

        // hasNextLine() used to check if there is another line in the input of this scanner or not.

          System.out.println(" Enter the Name :  "); 
          Scanner sc = new Scanner(System.in);
           String name = sc.next(); 
            if (sc.hasNext()) {      
          // System.out.println(sc.hasNextLine());
          System.out.println(sc.delimiter()); 
          System.out.println("Name is " + name); }
          else { System.out.println("not a name"); }
         
         

        // hasNextInt() VALIDATION
        int salary;
        System.out.println("Enter a Salary amount ");
        Scanner sc1 = new Scanner(System.in);
        if (sc1.hasNextInt()) 
        {
            salary= sc1.nextInt();
            if (salary >= 10000) {
                System.out.println(" Bonus is 8000");
            } else {
                System.out.println(" Bonus is 4000");
            }

        } else {
            System.out.println("Enter a valid Salary amount");
        }

        // Validate Floating point input using Scanner in Java 
        // hasNextDouble() VALIDATION

        Double bankBalance;
        System.out.println("Enter an Amount to ccheck you balance ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextDouble()) 
        {
            bankBalance = in.nextDouble();
            if (bankBalance >= 5000) {
                System.out.println(" Your Bank balance is " + bankBalance);
            } else {
                System.out.println(" You have low balance " + bankBalance);
            }
        } else {
            System.out.println(" Enter a Valid Amount");
        }

        //Validate Boolean input using Scanner in Java
        //hasNextBoolean()
        
        Boolean input;
        System.out.println("Enter a boolean value ");
        Scanner sc2 = new Scanner(System.in);
        if(sc2.hasNextBoolean()) {
            input = sc2.nextBoolean();
            System.out.println("You entered a boolean value "+input);
        }else {
            System.out.println("Please Enter a Valid Value");
        }

        in.close();
        sc.close();
        sc1.close();
        sc2.close();

    }
}
