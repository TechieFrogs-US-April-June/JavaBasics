package com.finalKeyword;

public class BlackFinal {
	final int MAX_VALUE; //BLACK FINAL VARIABLE
	BlackFinal()
	{
		MAX_VALUE = 100;
	}
	void disp()
	{
		System.out.println(MAX_VALUE);
	}
	

	public static void main(String[] args) {
		BlackFinal obj1 =  new BlackFinal();
		obj1.disp();

	}

}
