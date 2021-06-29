package com.finalKeyword;

public class FinalEx1 {
	final int MAX_VALUE=100;
	void my_Method()
	{
		//MAX_VALUE=200;
		System.out.println(MAX_VALUE) ;
	}

	public static void main(String[] args) {
		FinalEx1 obj1 = new FinalEx1();
		obj1.my_Method();

	}



}
