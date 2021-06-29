package com.abc;

class MyParentClass {
	   MyParentClass(){
		System.out.println("MyParentClass Constructor");
	   }
	}

public class MyChildClassConstructor extends MyParentClass {
	MyChildClassConstructor(){
		System.out.println("MyChildClass Constructor");	
	}

	public static void main(String[] args) {
		new MyChildClassConstructor();

	}

}
