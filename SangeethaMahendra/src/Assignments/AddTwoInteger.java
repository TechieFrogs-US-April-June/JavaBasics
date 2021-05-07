package src.Assignments;

import java.util.Scanner;

public class AddTwoInteger {
    //static variable
   static int NUM1 = 200;
   static int NUM2 = 300;
   static int NUM3;

   //Insatance Varibale
   int SUM1= 250;
   int SUM2= 250;
   int SUM3 = SUM1 + SUM2;

    public static void main (String[] args)
    {
        //lOCAL VARIABLE
        int number1 = 100;
        int number2 = 100;
        System.out.println("Add Two Integer : number1 + number2 = " +(number1+number2));

        //ANOTHER WAY OF INTIALIZING
        int NUMBER1 = 1000;
        int NUMBER2 = 4000;
        int NUMBER3 = NUMBER1 + NUMBER2;
        System.out.println("Add Two Integer : NUMBER1 + NUMBER2 = "+ NUMBER3);
        
        //STATIC VARIABLE
        int NUM3 = NUM1 + NUM2;
        System.out.println("Add Two Integer : NUM1 + NUM2 " + NUM3 );
        
        //INSTANCE VARIABLE
        AddTwoInteger obj = new AddTwoInteger();
        System.out.println("Add Two Integer : SUM1 + SUM2 = " + obj.SUM3);
         
        //ASSIGNMENT OPERATOR
        int a = 10;
        int b = 20;
        a += b;
        System.out.println(a);

        //SCANNER METHOD  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int Add1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int Add2 = sc.nextInt(); 
        int Add3 = Add1+Add2;
        System.out.println("Addition of two numbers is : " + Add3);
        sc.close();
        
        }

}
