package com.Methods;

public class Methods2 {
	
	void print12(int i, char b)
	{
		System.out.println(i+" "+b);
	}
	void print12(char b, int i)
	{
		System.out.println(b+" "+i);
	}

	public static void main(String[] args) {
		
		Methods2 m = new Methods2();
		m.print12(5, 'A');
		m.print12('B', 6);

	}

}
