/*Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class named 'Rectangle' with a method 
 * named 'Area' which returns the area and length and breadth passed as parameters to its constructor.
 
-----------------------------------------------------------------------------------------------------------------------*/





package com.test.oops;
class Rectangle
{
	int length,breadth;
 Rectangle(int l,int b)
{
	length =l;
	breadth=b;
}
 public double area()
 {
	double area = length*breadth;
	 return area;
 }
}

public class AreaOfRectangle {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(4,5);
		Rectangle rect1=new Rectangle(5,8);
		//rect.area();
		//rect1.area();
		System.out.println("area of rectangle : " +rect.area());
		System.out.println("area of rectangle :" +rect1.area() );
		

	}

}
