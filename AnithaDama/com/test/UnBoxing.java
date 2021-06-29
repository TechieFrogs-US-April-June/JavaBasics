package com.test;

public class UnBoxing {

	public static void main(String[] args) {
		Integer obj1=10;
		Integer obj2=20;
		// unboxing- converting object into primitives by the developer
		
		/*int i1 = obj1.intValue();
		int i2 = obj2.intValue();*/
		
		//Auto-unboxing : converting object into primitives by jvm
		int i1 = obj1;
		int i2 = obj2;
		System.out.println(i1+i2);

	}

}
