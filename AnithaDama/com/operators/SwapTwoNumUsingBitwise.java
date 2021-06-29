package com.operators;

public class SwapTwoNumUsingBitwise {

	public static void main(String[] args) {
	int num1=15,num2 = 10;
	num1= num1^num2;
	num2= num1^num2;
	num1=num1^num2;
	System.out.println("num1 = " +num1);
	System.out.println("num2 = " +num2);
	
	}

}
