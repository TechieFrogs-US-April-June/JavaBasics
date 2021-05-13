package src.ClassesObjectsExercises;

import java.util.Scanner;

import src.InheritanceExercises.AandB.A;

public class Employee {

    String name;
    int year_of_Joining;
    int salary;
    String Address;
    Employee(){}
    Employee(String name, int year_of_Joining, String Address){
       this.name = name;
       this.year_of_Joining = year_of_Joining;
       this.Address= Address;
    }
    void display(){
       
        System.out.println( name +"      "+  year_of_Joining + "           "+  Address +  "\n");
    }


    public static void main(String[] args) {
        Employee empObj1 = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee Name : ");
        empObj1.name = sc.next();
        System.out.println("Year of Joining : ");
        empObj1.year_of_Joining = sc.nextInt();
        System.out.println("Employee Address: " );
        empObj1.Address = sc.next();
        
        
        Employee empObj2 = new Employee();
        System.out.println("Employee Name : ");
        empObj2.name = sc.next();
        System.out.println("Year of Joining : ");
        empObj2.year_of_Joining = sc.nextInt();
        System.out.println("Employee Address: " );
        empObj2.Address = sc.next();
        

        Employee empObj3 = new Employee();
        System.out.println("Employee Name : ");
        empObj3.name = sc.next();
        System.out.println("Year of Joining : ");
        empObj3.year_of_Joining = sc.nextInt();
        System.out.println("Employee Address: " );
        empObj3.Address = sc.next();
        System.out.println("      Employee Details      ");
        System.out.println("      ****************    \n");
        System.out.println("Name"+"      "+ "Year of joining"+ "     "+ "Address"+  "\n");
        empObj1.display();
        empObj2.display();
        empObj3.display();
         
        

        
    }
    
}
