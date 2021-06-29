package com.oops.Abstract;

public interface Multiply {
	int multiplyTwo(int n1,int n2);
	int multiplyThree(int n1,int n2,int n3);

}
class Demo1 implements Multiply
{
	public int multiplyTwo(int n1,int n2)
	{
		return n1*n2;
	}
	public int multiplyThree(int n1, int n2 ,int n3)
	{
		return n1*n2*n3;
	}
}
