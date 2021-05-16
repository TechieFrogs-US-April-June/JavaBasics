package com.Methods;

public class Area3 {
	
	void arOfR(int l, int b)
	{
		System.out.println("Area of Rectangle: "+l*b);
	}
	
	void arOfS(int i)
	{
		System.out.println("Area of Square: "+i*i);
	}

	public static void main(String[] args) {
		Area3 a3 = new Area3();
		a3.arOfR(5, 6);
		a3.arOfS(7);
		
	}

}
