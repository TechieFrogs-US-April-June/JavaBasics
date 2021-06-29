package com.ovrloadng;

public class Demo1 {
	
//compilation error: More than one method with same name and argument list cannot be defined in a same class.
	   public int myMethod(int num1, int num2)
	   { 
	       System.out.println("First myMethod of class Demo");
	       return num1+num2;
	   }
	   public int myMethod(int var1, int var2)
	   {
	       System.out.println("Second myMethod of class Demo");
	       return var1-var2;
	   }
	}