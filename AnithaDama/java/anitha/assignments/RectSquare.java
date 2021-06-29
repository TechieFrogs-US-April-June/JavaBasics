/*4)Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively.
 *  Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle.
 *   Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square.
________________________________________*/

package com.test.inheritance;
class Rectangle
{
	int length,breadth;
	Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void printarea()
	{
		int area =length*breadth;
		System.out.println( area);
	}
	public void printperi()
	{
		int perimeter = 2*(length+breadth);
		System.out.println(perimeter);
	}
	
}
class Square extends Rectangle
{
	int s;
	public Square(int s)
	{
		super(s,s);
	}
}


public class RectSquare {

	public static void main(String[] args) {
		Square s = new Square(5);
		s.printarea();
		s.printperi();
		Rectangle r= new Rectangle(4,5);
		r.printarea();
		r.printperi();
	}

}
