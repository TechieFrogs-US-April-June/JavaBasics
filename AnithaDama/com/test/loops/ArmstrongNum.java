package com.test.loops;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();
		
		int cube =0 , r, temp;
		//int n= 371;
		temp = n;
		while(n>0)
			
		{
			r=n%10;
			n=n/10;
			cube = cube+(r*r*r);
		
		}
if(temp==cube)
	System.out.println("armstrong number");
else
	System.out.println("not armstrong number");
sc.close();
	}
	

}
