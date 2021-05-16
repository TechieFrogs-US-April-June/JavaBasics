package com.BasicSamples;

import java.util.Scanner;

public class Multiplication10 {

	public static void main(String[] args) 
	{
		/*int a =5;
		int b;
		int mul ;
		
		for(b=1; b<=20; b++)
		{
			mul = a * b;
				
		System.out.println(a+"*"+b+"="+mul);
	}*/
		int i, j, mul;
		Scanner sc = new Scanner(System.in);
		System.out.println("Multiplication of: ");
		i = sc.nextInt();
		System.out.println("number: ");
		j = sc.nextInt();
		sc.close();
		mul = i*j;
		System.out.println("Table of: "+mul);
		
}
}