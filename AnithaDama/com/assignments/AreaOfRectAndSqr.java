
/*Create a class to print the area of a square and a rectangle. The class has two methods with the same name but different number of parameters. 
 * The method for printing area of rectangle has two parameters which are length and breadth respetively while the other method for printing
 *  area of square has one parameter which is side of square
 */

package com.assignments;

public class AreaOfRectAndSqr {
	int length,breadth,side;
	double area;

	public  void  area(int length, int breadth)
	{
		area = length*breadth;
		System.out.println("area of rectangle: " +area);
	}
	public void area(int side)
	{
		 area = side*side;
		System.out.println("area of square: " +area);
	}

	public static void main(String[] args) {
		AreaOfRectAndSqr a1= new AreaOfRectAndSqr() ;
		a1.area(3, 2);
		a1.area(4);

	}

}
