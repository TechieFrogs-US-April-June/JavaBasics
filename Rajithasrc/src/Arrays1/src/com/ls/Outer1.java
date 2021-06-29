package com.ls;

public class Outer1 {

	private int n1=100;
	private int n2=200;
	public void disp()
	{
		class Inner
		{
			public void sum()
			{
				System.out.println(n1+n2);
			}
		}
		new Inner().sum();
	}	
}
