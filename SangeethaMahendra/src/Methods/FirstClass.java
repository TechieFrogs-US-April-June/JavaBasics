package src.Methods;

import java.util.Scanner;

public class FirstClass {
    String name;
    int id,gradeLevel;

    public void getdata(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  Student Name :  ");
        name = sc.next();
        System.out.println("Enter the  Student id :  ");
        id = sc.nextInt();
        System.out.println("Enter the  Student Grade Level :  ");
        gradeLevel = sc.nextInt();
        sc.close();
       
        //System.out.println(" I am in Method");

    }
    
    public static void main(String[] args) {

        // Creating object reference for this same class
        FirstClass fc = new FirstClass();
        fc.getdata();
        System.out.println("    Display Student Details  ");
        System.out.println("    ----------------------- \n ");

        System.out.println("Student Name : " + fc.name);
        System.out.println("Student id : " + fc.id);
        System.out.println("Student Grade Level : "  + fc.gradeLevel);

        // Creating object reference for outside class
        SecondClass sc = new SecondClass();
        sc.setData();
    
    }
    
}
