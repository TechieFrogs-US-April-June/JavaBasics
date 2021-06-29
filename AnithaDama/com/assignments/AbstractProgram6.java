
/*We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea'
taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, 
that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods
'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively.
Create an object of class 'Area' and call all the three methods.*/


package com.assignments;
abstract class Shape
{
	abstract void RectangleArea( int length,int breadth);
	abstract void SquareArea(int side);
	abstract void CircleArea(int radius);
	
}
class Area extends Shape
{
	public void RectangleArea(int l,int b)
	{
		double area = l*b;
		System.out.println("rectangle area : " +area);
		
	}
	public void SquareArea(int s)
	{
		double area = s*s;
		System.out.println(" square area : "+area);
	}
	public void CircleArea(int r)
	{
	double area = Math.PI*(r*r);
	System.out.println(" circle area : " +area);
}

}
public class AbstractProgram6 {

	public static void main(String[] args) {
		Area obj = new Area();
		obj.RectangleArea(5, 8);
		obj.SquareArea(5);
		obj.CircleArea(6);
				

	}

}
