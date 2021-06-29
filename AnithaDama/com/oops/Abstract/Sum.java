package com.oops.Abstract;

public abstract class Sum {
	abstract int sumOfTwo(int n1,int n2);
	abstract int sumOfThree(int n1,int n2,int n3);
	void disp() {
		System.out.println("Method of sum");	
		}
}
class Demo extends Sum
{
	int sumOfTwo(int n1,int n2)
	{
		return n1+n2;
	}
	int sumOfThree(int n1,int n2,int n3)
	{
		return n1+n2+n3;
	}
}