package com.anotherpackage;

public class Example{
	   public static void main(String args[]){
	        //Using fully qualified name instead of import
		com.letmecalculate.Calculator obj = 
			new com.letmecalculate.Calculator();
		System.out.println(obj.add(100, 200));
	   }
	}
