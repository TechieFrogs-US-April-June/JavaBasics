
/*Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.
________________________________________*/



package com.test.oops;

import java.util.Scanner;

class Average
{
	double a,b,c;

 Average(double a,double b,double c)
{
	this.a =a;
	this.b=b;
	this.c =c;
	
}
 public double average()
	{
		
		double avg = (a+b+c)/3;
		return avg;
	}
	
 

}

public class AverageOfThreeNums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number a :" );
		double a= sc.nextDouble();
		System.out.println("enter the second number b :");
		double b = sc.nextDouble();
		System.out.println("enter the third number c : ");
		double c = sc.nextDouble();
	
	
		Average a1 =new Average(a,b,c);
	System.out.println("average of three numbers : " +a1.average());
		//a1.average();
				
		sc.close();

	}

	
}	


