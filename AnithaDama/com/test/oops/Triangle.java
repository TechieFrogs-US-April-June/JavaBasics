/*3.
Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without
 any parameter in its constructor.
________________________________________*/



package com.test.oops;

public class Triangle {
	int s1=3,s2=4,s3=5;
	
	
	public double area()
	{

		int sp=(s1+s2+s3)/2;
		double area =Math.sqrt(sp*(sp-s1)*(sp-s2)*(sp-s3));
		return area;
	}
	public int perimeter()
	{
int	 perimeter = s1+s2+s3;
return perimeter;
	}

	public static void main(String[] args) {
		Triangle t1=new Triangle();
		
		System.out.println("area of triangle is : "+t1.area() );
		System.out.println("perimeter = " +t1.perimeter());
		
		

	}

}
