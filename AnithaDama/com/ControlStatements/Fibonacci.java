package com.ControlStatements;

public class Fibonacci {

	public static void main(String[] args) {
int count=8,num1=0,num2=1;
System.out.println("Fibonacci series of " +count+ "number : ");
for(int i=1;i<=count;i++)
{
	System.out.println(num1+" ");
	int sumofprevtwo = num1+num2;
	num1=num2;
	num2=sumofprevtwo;
}

	}

}
