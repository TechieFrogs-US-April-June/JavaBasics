package com.clasobj;

import java.util.Scanner;

class Complex9 {
	
	double real, img;
	
	void cn(int a, int b)
	{
		this.real = a;
		this.img = b;
	}
	
	double add()
	{
		double add1 = real + img;
		return add1;
	}
	
	double diff()
	{
		double diff1 = real - img;
		return diff1;
	}
	
	double mul()
	{
		double mul1 = real * img;
		return mul1;
	}
 }
	public class SDP9
	{

	public static void main(String[] args) {
		Scanner sc9 = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = sc9.nextInt();
		System.out.println("Enter b: ");
		int b = sc9.nextInt();
		
		Complex9 c9 = new Complex9();
		c9.cn(a, b);
		System.out.println("Addition of 2 complex numbers: "+c9.add());
		System.out.println("Difference of 2 complex numbers: "+c9.diff());
		System.out.println("Multiplication of 2 complex numbers: "+c9.mul());
		sc9.close();
	}

}
