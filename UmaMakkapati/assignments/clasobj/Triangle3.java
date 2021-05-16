package com.clasobj;

public class Triangle3 {
	
	static float a=3, b=4, c=5, s, perimeter;
	static double area;
	
	static void perimeterOfT()
	{ 
		perimeter = a+b+c;
		System.out.println(perimeter);
	}
	static void areaOfT() 
	{
		s= a+b+c/2;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println(area);
	}
	

	public static void main(String[] args) 
	{ 
		perimeterOfT();
		areaOfT();
}

}
