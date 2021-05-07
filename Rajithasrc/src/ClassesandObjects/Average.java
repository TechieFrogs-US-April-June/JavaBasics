package ClassesandObjects;

import java.util.Scanner;

public class Average {
    public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
 
    double num1 = 0;
    double num2 = 0;
    double num3 = 0;

    
    double sum = 0.0;
    
    double avg = 0.0;

    
    System.out.print("Enter three numbers: ");
    num1 = scan.nextDouble();
    num2 = scan.nextDouble();
    num3 = scan.nextDouble();

   
    sum = num1 + num2 + num3;
   
    avg = sum/3;

    
    System.out.println("Average: " + avg );
    scan.close();
  }
    
}
