package com.Methods;

public class PrintNumber {
	
	static void printn(int a)
	{
		System.out.println(a);
	}
	static void printn(long a)
	{
		System.out.println(a);
	}
	static void printn(float a)
	{
		System.out.println(a);
	}
	static void printn(double a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		//PrintNumber p = new PrintNumber();
		PrintNumber.printn(2);
		PrintNumber.printn(22222222);
		PrintNumber.printn(2.33);
		PrintNumber.printn(2.876786);
		
	}

}
