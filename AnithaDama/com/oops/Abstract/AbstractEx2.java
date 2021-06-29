package com.oops.Abstract;

public class AbstractEx2 {

	public static void main(String[] args) {
		Sum obj = new Demo();
		System.out.println("sum of two : " +obj.sumOfTwo(2, 3));
		System.out.println("sum of three : " +obj.sumOfThree(2, 3,4));
		obj.disp();
		Multiply obj2 = new Demo1();
		System.out.println("multiply of two : " +obj2.multiplyTwo(2, 3));
		System.out.println("multiply of three : " +obj2.multiplyThree(2, 3,4));
		
	}

}