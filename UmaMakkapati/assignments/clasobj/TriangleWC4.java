package com.clasobj;

public class TriangleWC4 {
	int a=3; int b=4; int c=5;
	double per, area;
	static double A;
	static double p, s;
	
	public TriangleWC4(){
		
	}
	
	double perimeter() 
	{
		return per = a+b+c;
	}
	
	double area()
	{
		s=a+b+c/2;
		return A = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

	public static void main(String[] args) 
	{
		TriangleWC4 conobj = new TriangleWC4();
		p=conobj.perimeter();
		System.out.println(p+" "+A);
		
	}

}
