package com.clasobj;

import java.util.Scanner;

	class Area {
		int length;
		int breadth;
		
	void setDm(int l, int b)
	{
		 length = l;
		 breadth = b;
	}
	double getArea()
	{
		double area = length * breadth;
		return area;
	}
	}
	public class Area6{
		
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length: ");
		int l = scan.nextInt();
		System.out.print("Enter the breadth: ");
		int b = scan.nextInt();
		
		Area aObj = new Area();
		aObj.setDm(l, b);
		System.out.println("Area of Rectangle: "+aObj.getArea());
		
		scan.close();
	}
	

}
