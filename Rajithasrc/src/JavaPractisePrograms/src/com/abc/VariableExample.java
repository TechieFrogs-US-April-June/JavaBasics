package com.abc;

public class VariableExample {

	public String myVar="instance variable";
	
	public void myMethod() {
		String myVar="Inside Method";
		System.out.println(myVar);
	}
	
	public static void main(String[] args) {
		VariableExample obj=new VariableExample();
		
		System.out.println("Calling Method");
		obj.myMethod();
		System.out.println(obj.myVar);
		
		
	}

}
