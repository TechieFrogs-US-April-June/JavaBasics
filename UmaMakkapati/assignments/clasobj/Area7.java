package com.clasobj;

import java.util.Scanner;

class AreaR {
	
	int length, breadth;
	
	void Area(int l, int b)
	{
		this.length = l;
		this.breadth = b;
	}
	
	double returnArea()
	{
		double area = length * breadth;
		return area;
	}
    }
	public class Area7{
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		int l = sc.nextInt();
		System.out.println("Enter breadth: ");
		int b = sc.nextInt();
		
		AreaR aObj1 = new AreaR();
		aObj1.Area(l, b);
		System.out.println("Area of the Rectangle: "+aObj1.returnArea());
		sc.close();
	}
		
	}


