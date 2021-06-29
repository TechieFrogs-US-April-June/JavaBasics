package com.operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		//Bitwise operator(&,|,^,~,<<,>>)
		int a = 11,b=22;
		int res = 0;
		res = a&b;// Bitwise And
		System.out.println("a&b = " +res);
		res = a|b; // bitwise OR
		System.out.println("a|b = " +res);
		res = a^b; //Bitwise XOR
		System.out.println("a^b = " +res);
		res= ~b; //
		System.out.println("~b = " +res);
		res = a<<2;                 //a*2power n
		System.out.println(" a<<2= " +res);
		res = a>>2; // a/2 power n
		System.out.println(" a>>2= " +res);
	}

}
