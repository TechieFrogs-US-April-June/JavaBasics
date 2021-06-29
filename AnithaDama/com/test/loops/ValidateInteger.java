package com.test.loops;

import java.util.Scanner;

public class ValidateInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("enter  integer value");
			while(!sc.hasNextInt())
			{
				System.out.println("it's not a possitive number");
				sc.next();
			}
			num = sc.nextInt();
		}
		while(num <= 0);
	//	while(num>=0);
		System.out.println("it's a positive number");
		sc.close();
	}
	
	
}