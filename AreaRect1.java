/*Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its
 *  constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard
 */



package com.test.oops;

import java.util.Scanner;

class Area1
{
	int length,breadth;
	
 Area1(int l,int b)
	{
		length = l;
		breadth = b;
		
	}
 public double returnarea()
 {
	 double area =length*breadth;
	 return area;
 }

}

public class AreaRect1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length :");
		int l= sc.nextInt();
		System.out.println(" enter breadth : ");
		int b= sc.nextInt();
		
		Area1 a2 =new Area1(l,b);
		System.out.println(" area of rectangle : " +a2.returnarea());
		
		

	}

}
