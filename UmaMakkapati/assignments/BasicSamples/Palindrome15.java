package com.BasicSamples;

public class Palindrome15
{
	static int i, j = 0, n = 454, temp;
	
	
	public static void main(String[] args)
	{
		temp = n;
		while(n>0) {
			i = n%10;
			j = (j*10)+i;
			n = n/10;
		}
		if(temp==j)
			System.out.println("Palindrome number");
		else
			System.out.println("Not a Palindrome");
	}

}
