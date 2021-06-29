package com.BasicSamples;

public class SumOfNatural9 {
	
	static int num = 10; 
	static int count = 1; 
	static int total = 0;

	public static void main(String[] args) {

	       /*while(count <= num)
	       {
	           total = total + count;
	           count++;
	       }

	       System.out.println("Sum of first 10 natural numbers is: "+total);
	    */
		for(count = 1; count <= num; count++)
		{
	           total = total + count;
	       }

	       System.out.println("Sum of first 10 natural numbers is: "+total);
	}
	
}
