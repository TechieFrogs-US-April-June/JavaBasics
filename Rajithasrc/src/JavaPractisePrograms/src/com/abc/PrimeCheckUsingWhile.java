package com.abc;

import java.util.Scanner;

public class PrimeCheckUsingWhile {

	public static void main(String[] args) {
		int temp;
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");
		//capture the input in an integer
		int num=scan.nextInt();
	        scan.close();
	        int i=2;
	        while(i<= num/2)
	        {
	           if(num % i == 0)
	           {
	        	isPrime = false;
	        	break;
	           }
	           i++;
	        }
	        if(isPrime)
	     	   System.out.println(num + " is a Prime Number");
	     	else
	     		 System.out.println(num + " is not a Prime Number");

	}

}
