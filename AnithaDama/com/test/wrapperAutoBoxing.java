package com.test;

public class wrapperAutoBoxing {

	public static void main(String[] args) {
		int i1= 20;
		int i2 = 30;
		
	/*	Integer obj1 = i1;        //converting primitive datatype into object by the JVM
		Integer obj2 = i2;*/
		
		Integer obj1 = new Integer(i1);
		Integer obj2 = new Integer(i2);             // Boxing: converting  by the developer
		System.out.println(obj1+obj2);
	}

}
