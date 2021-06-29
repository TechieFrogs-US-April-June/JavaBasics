package com.test.loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter intiger value");
		int num = sc.nextInt();
		int r, sum = 0 ;
		int temp = num;
		while(num>0)
		{
			r=num%10;
			sum = sum*10+r;
			num = num/10;
			
		}
		if(temp==sum)
			System.out.println("it is a palindrome number");
		else
			System.out.println("not a palindrome");
		sc.close();
	}

  }




