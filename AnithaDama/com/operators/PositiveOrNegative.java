package com.operators;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter number : ");
		num = sc.nextInt();
		sc.close();
		if(num>0)
		{
			System.out.println("positive number");
		}
		else if(num<0)
			
		{
			System.out.println("negative number");
		}
		else
		{
			System.out.println(" neither positive or negative ");
		}

	}

}
