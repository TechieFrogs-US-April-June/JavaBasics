package src.ClassesObjectsExercises;

import java.util.Scanner;

//Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.
//Syntax : Add all given number/count of the numver = Average number
public class Average {
        double num1,num2,num3;
          double Average, sum;
         // int Average;
           void calculate(){
               sum = num1+num2+num3;
               Average = sum/3;
               System.out.println("Sum Number of given three number ---->  "+ sum);
               System.out.println("Sum Number of given three number ---->  "+ Average);
           }       
    
    public static void main(String[] args) {
        Average calObj = new Average();
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the First Numbers : ");
         calObj.num1 = sc.nextDouble();
       System.out.println("Enter the Second Numbers : ");
         calObj.num2 = sc.nextDouble();
       System.out.println("Enter the Third Numbers : ");
         calObj.num3 = sc.nextDouble();
         calObj.calculate();
       sc.close();

        
        
    }
    
}
