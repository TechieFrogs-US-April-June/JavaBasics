/*6)Create a class named 'Shape' with a method to print "This is This is shape". Then create two other classes named 'Rectangle', 'Circle' inheriting 
 the Shape class, both having a method to print "This is rectangular shape" and "This is circular shape" respectively.
  Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle".
Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.*/

package com.test.inheritance;
class Shape
{
	public void print()
	{
		System.out.println("This is shape")	;
		}
}
class Rectangle2 extends Shape
{
	public void print1()
	{
		System.out.println("This is rectangular shape");
	}
	
}
class Circle extends Shape
{
	public void print2()
	{
		System.out.println("This is circular shape");
	}
}
class Square2 extends Rectangle2
{
	public void print3()
	{
		System.out.println(" square is a rectangle");
	}
}
public class RectangleCircle {

	public static void main(String[] args) {
		Square2 s= new Square2();
		s.print();
		s.print1();
		
		
		
	}
	}


