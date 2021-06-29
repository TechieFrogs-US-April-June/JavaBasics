/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle'
 *  with constructor having the three sides as its parameters.
 */

package com.test.oops;
class Triangle1
{
	int s1,s2,s3;

Triangle1(int side1,int side2,int side3)
{
	s1 =side1;
	s2 = side2;
	s3 = side3;
}
public double area()
{
	int sp=(s1+s2+s3)/2;
	double area = Math.sqrt(sp*(sp-s1)*(sp-s2)*(sp*s3));
	
	return area;
}
public int perimeter()
{
	int peri = s1+s2+s3;
	return peri;
}
}

public class AreaOfTriangle {

	public static void main(String[] args) {
		Triangle1 t1 = new Triangle1(3,4,5);
		
		System.out.println("area of triangle is = "+ t1.area());
		System.out.println("perimeter is = " +t1.perimeter());
		
		

	}

}
