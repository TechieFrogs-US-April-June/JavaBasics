
import java.lang.*;
import java.util.Scanner;

public class IfExample {

        public static void main(String[] args) {
            /* Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter username");

            String userName = myObj.nextLine();  // Read user input
            System.out.println("Username is: " + userName);  // Output user input */

           /* System.out.println("Enter 1st number");
            Scanner a=new Scanner(System.in);
            String x=a.nextLine();
            System.out.println("Enter 2nd number");
            Scanner b=new Scanner(System.in);
            String y=b.nextLine();
           //if else block example 1
            if(x.length()==y.length())
            {
                System.out.println("x is equal to y");
            }
            else
            {
                System.out.println("not equal");
            }*/
            //if example 2
            /*int i=12;
            if(i>10 && i<100)
            {
                System.out.println("Its a two digit number");
            }else
                if(i>100 && i<1000)
                {
                    System.out.println("Its a 3 digit number");
                }
                else
                    System.out.println("not in range");*/
            //if else example
          /*  int a1=432;
            if(a1%2==0)
            {
                System.out.println("Number is EVEN");
            }
            else
            {
                System.out.println("Number is ODD");
            }*/
          /*  int year=2020;
            if((year%4==0 && year%100!=100) || year%400==0)
            {
                System.out.println("Given Year is Leap year");
            }
            else
            {
                System.out.println("Not a leap year");
            }*/
            //ifelse ternary
            int num=10;
            String output=(num%2==0)?"even number":"odd number";
            System.out.println(output);


        }




}
