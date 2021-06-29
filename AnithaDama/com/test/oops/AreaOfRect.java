/*Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. 
 * First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. 
 * Length and breadth of rectangle are entered through keyboard.
 
________________________________________*/



package com.test.oops;

import java.util.Scanner;

class Area
{
	int length;
	int  breadth;


	
public  void setDim( int length, int breadth)
{
	this.length=length;
	this.breadth=breadth;
}
public double getarea()
{
	double area =length*breadth;
	return area;
}

}
public class AreaOfRect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter length ");
		int length =sc.nextInt();
		System.out.println("enter breadth");
		int breadth =sc.nextInt();
		Area a1= new Area();
		a1.setDim(length, breadth);
		System.out.println("Area of rectangle" + a1.getarea());
sc.close();
	}	

}
