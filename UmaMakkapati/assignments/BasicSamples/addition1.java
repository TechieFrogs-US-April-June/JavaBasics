package com.BasicSamples;

import java.util.Scanner;

public class addition1 {

	public static void main(String[] args) 
	{
		/*int a=10;
		int b=20;
		System.out.println(a+b);*/
		
		int a, b, add;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value a: ");
		a = sc.nextInt();
		System.out.println("Enter value b: ");
		b = sc.nextInt();
		sc.close();
		add = a+b;
		System.out.println("Sum = "+add);
		
		
	}

}
