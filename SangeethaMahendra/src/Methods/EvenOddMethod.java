package src.Methods;

import java.util.Scanner;

public class EvenOddMethod {

    public void findEvenOdd(int num){
        if (num%2 ==0)
        System.out.println(num +" is even");
        else
        System.out.println(num + " is Odd");
    }
    public static void main(String[] args) {
       
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
       EvenOddMethod obj = new EvenOddMethod();
        obj.findEvenOdd(num);
        sc.close();
    }
   
}
