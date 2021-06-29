package com.abc;

import java.util.Scanner;

public class ProductOfNumbersDouble {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number: ");
		double num1=scan.nextDouble();
		System.out.println("Enter second number: ");
		double num2=scan.nextDouble();
		
		scan.close();
		double product=num1*num2;
		System.out.println("Output: "+product);

	}

}
