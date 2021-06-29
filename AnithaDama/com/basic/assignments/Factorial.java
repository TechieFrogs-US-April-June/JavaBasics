package com.basic.assignments;

public class Factorial {

	public static void main(String[] args) {
		int num = 6;
		int fact = 1;
		//for loop
	/*	for(int i = 1; i<=num; i++)
		{
			fact = fact*i;
			
		}
		System.out.println("factorial 6 is"  +  fact); */
		//while loop
		int i = 1;
		while(i <= num )
		{
			fact = fact*i;
			i++;
		}
		System.out.println(" factorial of  " + num  +  " is "  + fact);
	}
	

}
