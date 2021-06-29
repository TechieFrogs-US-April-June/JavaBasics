package com.letmecalculator;

public class Calculator {
	public int add(int n1,int n2)
	{
		return n1+n2;
	}
public static void main(String args[])
{
	Calculator obj1 = new Calculator();
	System.out.println(obj1.add(3, 4));
}
}
